package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.DefaultMediaClock;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {
    private static final int ACTIVE_INTERVAL_MS = 10;
    private static final int IDLE_INTERVAL_MS = 1000;
    private static final long MIN_RENDERER_SLEEP_DURATION_MS = 2000;
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_ERROR_RECOVERY = 25;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 0;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_OFFLOAD_SCHEDULING_ENABLED = 24;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final String TAG = "ExoPlayerImplInternal";
    private final long backBufferDurationUs;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    /* access modifiers changed from: private */
    public final HandlerWrapper handler;
    private final HandlerThread internalPlaybackThread;
    private boolean isRebuffering;
    private final LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private final MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    private ExoPlaybackException pendingRecoverableError;
    private final Timeline.Period period;
    private PlaybackInfo playbackInfo;
    private PlaybackInfoUpdate playbackInfoUpdate;
    private final PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private final MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionUs;
    private final Renderer[] renderers;
    private int repeatMode;
    /* access modifiers changed from: private */
    public boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;

    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfoUpdate);
    }

    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        /* access modifiers changed from: private */
        public boolean hasPendingChange;
        public boolean hasPlayWhenReadyChangeReason;
        public int operationAcks;
        public int playWhenReadyChangeReason;
        public PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo2) {
            this.playbackInfo = playbackInfo2;
        }

        public void incrementPendingOperationAcks(int i) {
            this.hasPendingChange |= i > 0;
            this.operationAcks += i;
        }

        public void setPlaybackInfo(PlaybackInfo playbackInfo2) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo2;
            this.playbackInfo = playbackInfo2;
        }

        public void setPositionDiscontinuity(int i) {
            boolean z = true;
            if (!this.positionDiscontinuity || this.discontinuityReason == 4) {
                this.hasPendingChange = true;
                this.positionDiscontinuity = true;
                this.discontinuityReason = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            Assertions.checkArgument(z);
        }

        public void setPlayWhenReadyChangeReason(int i) {
            this.hasPendingChange = true;
            this.hasPlayWhenReadyChangeReason = true;
            this.playWhenReadyChangeReason = i;
        }
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector2, TrackSelectorResult trackSelectorResult, LoadControl loadControl2, BandwidthMeter bandwidthMeter2, int i, boolean z, AnalyticsCollector analyticsCollector, SeekParameters seekParameters2, LivePlaybackSpeedControl livePlaybackSpeedControl2, long j, boolean z2, Looper looper, Clock clock2, PlaybackInfoUpdateListener playbackInfoUpdateListener2) {
        Renderer[] rendererArr2 = rendererArr;
        BandwidthMeter bandwidthMeter3 = bandwidthMeter2;
        AnalyticsCollector analyticsCollector2 = analyticsCollector;
        long j2 = j;
        Clock clock3 = clock2;
        this.playbackInfoUpdateListener = playbackInfoUpdateListener2;
        this.renderers = rendererArr2;
        this.trackSelector = trackSelector2;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl2;
        this.bandwidthMeter = bandwidthMeter3;
        this.repeatMode = i;
        this.shuffleModeEnabled = z;
        this.seekParameters = seekParameters2;
        this.livePlaybackSpeedControl = livePlaybackSpeedControl2;
        this.releaseTimeoutMs = j2;
        this.setForegroundModeTimeoutMs = j2;
        this.pauseAtEndOfWindow = z2;
        this.clock = clock3;
        this.backBufferDurationUs = loadControl2.getBackBufferDurationUs();
        this.retainBackBufferFromKeyframe = loadControl2.retainBackBufferFromKeyframe();
        PlaybackInfo createDummy = PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = createDummy;
        this.playbackInfoUpdate = new PlaybackInfoUpdate(createDummy);
        this.rendererCapabilities = new RendererCapabilities[rendererArr2.length];
        for (int i2 = 0; i2 < rendererArr2.length; i2++) {
            rendererArr2[i2].setIndex(i2);
            this.rendererCapabilities[i2] = rendererArr2[i2].getCapabilities();
        }
        this.mediaClock = new DefaultMediaClock(this, clock3);
        this.pendingMessages = new ArrayList<>();
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        trackSelector2.init(this, bandwidthMeter3);
        this.deliverPendingMessageAtStartPositionRequired = true;
        Handler handler2 = new Handler(looper);
        this.queue = new MediaPeriodQueue(analyticsCollector2, handler2);
        this.mediaSourceList = new MediaSourceList(this, analyticsCollector2, handler2);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.internalPlaybackThread = handlerThread;
        handlerThread.start();
        Looper looper2 = this.internalPlaybackThread.getLooper();
        this.playbackLooper = looper2;
        this.handler = clock3.createHandler(looper2, this);
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.setForegroundModeTimeoutMs = j;
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
        this.handler.obtainMessage(24, z ? 1 : 0, 0).sendToTarget();
    }

    public void prepare() {
        this.handler.obtainMessage(0).sendToTarget();
    }

    public void setPlayWhenReady(boolean z, int i) {
        this.handler.obtainMessage(1, z ? 1 : 0, i).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z) {
        this.handler.obtainMessage(23, z ? 1 : 0, 0).sendToTarget();
    }

    public void setRepeatMode(int i) {
        this.handler.obtainMessage(11, i, 0).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z) {
        this.handler.obtainMessage(12, z ? 1 : 0, 0).sendToTarget();
    }

    public void seekTo(Timeline timeline, int i, long j) {
        this.handler.obtainMessage(3, new SeekPosition(timeline, i, j)).sendToTarget();
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setSeekParameters(SeekParameters seekParameters2) {
        this.handler.obtainMessage(5, seekParameters2).sendToTarget();
    }

    public void stop() {
        this.handler.obtainMessage(6).sendToTarget();
    }

    public void setMediaSources(List<MediaSourceList.MediaSourceHolder> list, int i, long j, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(17, new MediaSourceListUpdateMessage(list, shuffleOrder, i, j)).sendToTarget();
    }

    public void addMediaSources(int i, List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(18, i, 0, new MediaSourceListUpdateMessage(list, shuffleOrder, -1, -9223372036854775807L)).sendToTarget();
    }

    public void removeMediaSources(int i, int i2, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(20, i, i2, shuffleOrder).sendToTarget();
    }

    public void moveMediaSources(int i, int i2, int i3, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(19, new MoveMediaItemsMessage(i, i2, i3, shuffleOrder)).sendToTarget();
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    public synchronized void sendMessage(PlayerMessage playerMessage) {
        if (!this.released) {
            if (this.internalPlaybackThread.isAlive()) {
                this.handler.obtainMessage(14, playerMessage).sendToTarget();
                return;
            }
        }
        Log.m9247w(TAG, "Ignoring messages sent after release.");
        playerMessage.markAsProcessed(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean setForegroundMode(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.released     // Catch:{ all -> 0x003f }
            r1 = 1
            if (r0 != 0) goto L_0x003d
            android.os.HandlerThread r0 = r3.internalPlaybackThread     // Catch:{ all -> 0x003f }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x000f
            goto L_0x003d
        L_0x000f:
            r0 = 13
            r2 = 0
            if (r4 == 0) goto L_0x001f
            com.google.android.exoplayer2.util.HandlerWrapper r4 = r3.handler     // Catch:{ all -> 0x003f }
            android.os.Message r4 = r4.obtainMessage(r0, r1, r2)     // Catch:{ all -> 0x003f }
            r4.sendToTarget()     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return r1
        L_0x001f:
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x003f }
            r4.<init>()     // Catch:{ all -> 0x003f }
            com.google.android.exoplayer2.util.HandlerWrapper r1 = r3.handler     // Catch:{ all -> 0x003f }
            android.os.Message r0 = r1.obtainMessage(r0, r2, r2, r4)     // Catch:{ all -> 0x003f }
            r0.sendToTarget()     // Catch:{ all -> 0x003f }
            com.google.android.exoplayer2.-$$Lambda$WCNOc30RWlKfWWqwDTxwdaoGH-w r0 = new com.google.android.exoplayer2.-$$Lambda$WCNOc30RWlKfWWqwDTxwdaoGH-w     // Catch:{ all -> 0x003f }
            r0.<init>(r4)     // Catch:{ all -> 0x003f }
            long r1 = r3.setForegroundModeTimeoutMs     // Catch:{ all -> 0x003f }
            r3.waitUninterruptibly(r0, r1)     // Catch:{ all -> 0x003f }
            boolean r4 = r4.get()     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return r4
        L_0x003d:
            monitor-exit(r3)
            return r1
        L_0x003f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.setForegroundMode(boolean):boolean");
    }

    public synchronized boolean release() {
        if (!this.released) {
            if (this.internalPlaybackThread.isAlive()) {
                this.handler.sendEmptyMessage(7);
                waitUninterruptibly(new Supplier() {
                    public final Object get() {
                        return ExoPlayerImplInternal.this.lambda$release$0$ExoPlayerImplInternal();
                    }
                }, this.releaseTimeoutMs);
                return this.released;
            }
        }
        return true;
    }

    public /* synthetic */ Boolean lambda$release$0$ExoPlayerImplInternal() {
        return Boolean.valueOf(this.released);
    }

    public Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    public void onPlaylistUpdateRequested() {
        this.handler.sendEmptyMessage(22);
    }

    public void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(10);
    }

    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(16, playbackParameters).sendToTarget();
    }

    public boolean handleMessage(Message message) {
        MediaPeriodHolder readingPeriod;
        try {
            switch (message.what) {
                case 0:
                    prepareInternal();
                    break;
                case 1:
                    setPlayWhenReadyInternal(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                    setOffloadSchedulingEnabledInternal(message.arg1 == 1);
                    break;
                case 25:
                    attemptErrorRecovery((ExoPlaybackException) message.obj);
                    break;
                default:
                    return false;
            }
            maybeNotifyPlaybackInfoChanged();
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.type == 1 && (readingPeriod = this.queue.getReadingPeriod()) != null) {
                e = e.copyWithMediaPeriodId(readingPeriod.info.f10040id);
            }
            if (!e.isRecoverable || this.pendingRecoverableError != null) {
                ExoPlaybackException exoPlaybackException = this.pendingRecoverableError;
                if (exoPlaybackException != null) {
                    e.addSuppressed(exoPlaybackException);
                    this.pendingRecoverableError = null;
                }
                Log.m9244e(TAG, "Playback error", e);
                stopInternal(true, false);
                this.playbackInfo = this.playbackInfo.copyWithPlaybackError(e);
            } else {
                Log.m9248w(TAG, "Recoverable playback error", e);
                this.pendingRecoverableError = e;
                Message obtainMessage = this.handler.obtainMessage(25, e);
                obtainMessage.getTarget().sendMessageAtFrontOfQueue(obtainMessage);
            }
            maybeNotifyPlaybackInfoChanged();
        } catch (IOException e2) {
            ExoPlaybackException createForSource = ExoPlaybackException.createForSource(e2);
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod != null) {
                createForSource = createForSource.copyWithMediaPeriodId(playingPeriod.info.f10040id);
            }
            Log.m9244e(TAG, "Playback error", createForSource);
            stopInternal(false, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForSource);
            maybeNotifyPlaybackInfoChanged();
        } catch (RuntimeException e3) {
            ExoPlaybackException createForUnexpected = ExoPlaybackException.createForUnexpected(e3);
            Log.m9244e(TAG, "Playback error", createForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForUnexpected);
            maybeNotifyPlaybackInfoChanged();
        }
        return true;
    }

    private void attemptErrorRecovery(ExoPlaybackException exoPlaybackException) throws ExoPlaybackException {
        Assertions.checkArgument(exoPlaybackException.isRecoverable && exoPlaybackException.type == 1);
        try {
            seekToCurrentPosition(true);
        } catch (Exception e) {
            exoPlaybackException.addSuppressed(e);
            throw exoPlaybackException;
        }
    }

    private synchronized void waitUninterruptibly(Supplier<Boolean> supplier, long j) {
        long elapsedRealtime = this.clock.elapsedRealtime() + j;
        boolean z = false;
        while (!supplier.get().booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - this.clock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private void setState(int i) {
        if (this.playbackInfo.playbackState != i) {
            this.playbackInfo = this.playbackInfo.copyWithPlaybackState(i);
        }
    }

    private void maybeNotifyPlaybackInfoChanged() {
        this.playbackInfoUpdate.setPlaybackInfo(this.playbackInfo);
        if (this.playbackInfoUpdate.hasPendingChange) {
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(this.playbackInfoUpdate);
            this.playbackInfoUpdate = new PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private void prepareInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared();
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        this.mediaSourceList.prepare(this.bandwidthMeter.getTransferListener());
        this.handler.sendEmptyMessage(2);
    }

    private void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new SeekPosition(new PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder));
    }

    private void addMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList2 = this.mediaSourceList;
        if (i == -1) {
            i = mediaSourceList2.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList2.addMediaSources(i, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder));
    }

    private void moveMediaItemsInternal(MoveMediaItemsMessage moveMediaItemsMessage) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder));
    }

    private void removeMediaItemsInternal(int i, int i2, ShuffleOrder shuffleOrder) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i, i2, shuffleOrder));
    }

    private void mediaSourceListUpdateRequestedInternal() throws ExoPlaybackException {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline());
    }

    private void setShuffleOrderInternal(ShuffleOrder shuffleOrder) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder));
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z);
                }
            }
        }
    }

    private void setPlayWhenReadyInternal(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.playbackInfoUpdate.setPlayWhenReadyChangeReason(i2);
        this.playbackInfo = this.playbackInfo.copyWithPlayWhenReady(z, i);
        this.isRebuffering = false;
        notifyTrackSelectionPlayWhenReadyChanged(z);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
        } else if (this.playbackInfo.playbackState == 3) {
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (this.playbackInfo.playbackState == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void setPauseAtEndOfWindowInternal(boolean z) throws ExoPlaybackException {
        this.pauseAtEndOfWindow = z;
        resetPendingPauseAtEndOfPeriod();
        if (this.pendingPauseAtEndOfPeriod && this.queue.getReadingPeriod() != this.queue.getPlayingPeriod()) {
            seekToCurrentPosition(true);
            handleLoadingMediaPeriodChanged(false);
        }
    }

    private void setOffloadSchedulingEnabledInternal(boolean z) {
        if (z != this.offloadSchedulingEnabled) {
            this.offloadSchedulingEnabled = z;
            int i = this.playbackInfo.playbackState;
            if (z || i == 4 || i == 1) {
                this.playbackInfo = this.playbackInfo.copyWithOffloadSchedulingEnabled(z);
            } else {
                this.handler.sendEmptyMessage(2);
            }
        }
    }

    private void setRepeatModeInternal(int i) throws ExoPlaybackException {
        this.repeatMode = i;
        if (!this.queue.updateRepeatMode(this.playbackInfo.timeline, i)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleModeEnabledInternal(boolean z) throws ExoPlaybackException {
        this.shuffleModeEnabled = z;
        if (!this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void seekToCurrentPosition(boolean z) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.f10040id;
        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (seekToPeriodPosition != this.playbackInfo.positionUs) {
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, seekToPeriodPosition, this.playbackInfo.requestedContentPositionUs);
            if (z) {
                this.playbackInfoUpdate.setPositionDiscontinuity(4);
            }
        }
    }

    private void startRenderers() throws ExoPlaybackException {
        this.isRebuffering = false;
        this.mediaClock.start();
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.start();
            }
        }
    }

    private void stopRenderers() throws ExoPlaybackException {
        this.mediaClock.stop();
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                ensureStopped(renderer);
            }
        }
    }

    private void updatePlaybackPositions() throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            long readDiscontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
            if (readDiscontinuity != -9223372036854775807L) {
                resetRendererPosition(readDiscontinuity);
                if (readDiscontinuity != this.playbackInfo.positionUs) {
                    this.playbackInfo = handlePositionDiscontinuity(this.playbackInfo.periodId, readDiscontinuity, this.playbackInfo.requestedContentPositionUs);
                    this.playbackInfoUpdate.setPositionDiscontinuity(4);
                }
            } else {
                long syncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
                this.rendererPositionUs = syncAndGetPositionUs;
                long periodTime = playingPeriod.toPeriodTime(syncAndGetPositionUs);
                maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
                this.playbackInfo.positionUs = periodTime;
            }
            this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
            this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
            if (this.playbackInfo.playWhenReady && this.playbackInfo.playbackState == 3 && shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, this.playbackInfo.periodId) && this.playbackInfo.playbackParameters.speed == 1.0f) {
                float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), getTotalBufferedDurationUs());
                if (this.mediaClock.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                    this.mediaClock.setPlaybackParameters(this.playbackInfo.playbackParameters.withSpeed(adjustedPlaybackSpeed));
                    handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
                }
            }
        }
    }

    private void notifyTrackSelectionRebuffer() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    private void doSomeWork() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        long uptimeMillis = this.clock.uptimeMillis();
        updatePeriods();
        if (this.playbackInfo.playbackState == 1 || this.playbackInfo.playbackState == 4) {
            this.handler.removeMessages(2);
            return;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            scheduleNextWork(uptimeMillis, 10);
            return;
        }
        TraceUtil.beginSection("doSomeWork");
        updatePlaybackPositions();
        if (playingPeriod.prepared) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            int i = 0;
            z2 = true;
            z = true;
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i >= rendererArr.length) {
                    break;
                }
                Renderer renderer = rendererArr[i];
                if (isRendererEnabled(renderer)) {
                    renderer.render(this.rendererPositionUs, elapsedRealtime);
                    z2 = z2 && renderer.isEnded();
                    boolean z4 = playingPeriod.sampleStreams[i] != renderer.getStream();
                    boolean z5 = z4 || (!z4 && renderer.hasReadStreamToEnd()) || renderer.isReady() || renderer.isEnded();
                    z = z && z5;
                    if (!z5) {
                        renderer.maybeThrowStreamError();
                    }
                }
                i++;
            }
        } else {
            playingPeriod.mediaPeriod.maybeThrowPrepareError();
            z2 = true;
            z = true;
        }
        long j = playingPeriod.info.durationUs;
        boolean z6 = z2 && playingPeriod.prepared && (j == -9223372036854775807L || j <= this.playbackInfo.positionUs);
        if (z6 && this.pendingPauseAtEndOfPeriod) {
            this.pendingPauseAtEndOfPeriod = false;
            setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
        }
        if (z6 && playingPeriod.info.isFinal) {
            setState(4);
            stopRenderers();
        } else if (this.playbackInfo.playbackState == 2 && shouldTransitionToReadyState(z)) {
            setState(3);
            this.pendingRecoverableError = null;
            if (shouldPlayWhenReady()) {
                startRenderers();
            }
        } else if (this.playbackInfo.playbackState == 3 && (this.enabledRendererCount != 0 ? !z : !isTimelineReady())) {
            this.isRebuffering = shouldPlayWhenReady();
            setState(2);
            if (this.isRebuffering) {
                notifyTrackSelectionRebuffer();
                this.livePlaybackSpeedControl.notifyRebuffer();
            }
            stopRenderers();
        }
        if (this.playbackInfo.playbackState == 2) {
            int i2 = 0;
            while (true) {
                Renderer[] rendererArr2 = this.renderers;
                if (i2 >= rendererArr2.length) {
                    break;
                }
                if (isRendererEnabled(rendererArr2[i2]) && this.renderers[i2].getStream() == playingPeriod.sampleStreams[i2]) {
                    this.renderers[i2].maybeThrowStreamError();
                }
                i2++;
            }
            if (!this.playbackInfo.isLoading && this.playbackInfo.totalBufferedDurationUs < 500000 && isLoadingPossible()) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        if (this.offloadSchedulingEnabled != this.playbackInfo.offloadSchedulingEnabled) {
            this.playbackInfo = this.playbackInfo.copyWithOffloadSchedulingEnabled(this.offloadSchedulingEnabled);
        }
        if ((!shouldPlayWhenReady() || this.playbackInfo.playbackState != 3) && this.playbackInfo.playbackState != 2) {
            if (this.enabledRendererCount == 0 || this.playbackInfo.playbackState == 4) {
                this.handler.removeMessages(2);
            } else {
                scheduleNextWork(uptimeMillis, 1000);
            }
            z3 = false;
        } else {
            z3 = !maybeScheduleWakeup(uptimeMillis, 10);
        }
        if (this.playbackInfo.sleepingForOffload != z3) {
            this.playbackInfo = this.playbackInfo.copyWithSleepingForOffload(z3);
        }
        this.requestForRendererSleep = false;
        TraceUtil.endSection();
    }

    private long getCurrentLiveOffsetUs() {
        return getLiveOffsetUs(this.playbackInfo.timeline, this.playbackInfo.periodId.periodUid, this.playbackInfo.positionUs);
    }

    private long getLiveOffsetUs(Timeline timeline, Object obj, long j) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window);
        if (this.window.windowStartTimeMs == -9223372036854775807L || !this.window.isLive() || !this.window.isDynamic) {
            return -9223372036854775807L;
        }
        return C3716C.msToUs(this.window.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - (j + this.period.getPositionInWindowUs());
    }

    private boolean shouldUseLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId.isAd() || timeline.isEmpty()) {
            return false;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        if (!this.window.isLive() || !this.window.isDynamic || this.window.windowStartTimeMs == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    private void scheduleNextWork(long j, long j2) {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessageAtTime(2, j + j2);
    }

    private boolean maybeScheduleWakeup(long j, long j2) {
        if (this.offloadSchedulingEnabled && this.requestForRendererSleep) {
            return false;
        }
        scheduleNextWork(j, j2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ff, code lost:
        if (r8.playbackInfo.playbackState == 3) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f4 A[Catch:{ all -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void seekToInternal(com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition r19) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r1 = r8.playbackInfoUpdate
            r9 = 1
            r1.incrementPendingOperationAcks(r9)
            com.google.android.exoplayer2.PlaybackInfo r1 = r8.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r1.timeline
            int r4 = r8.repeatMode
            boolean r5 = r8.shuffleModeEnabled
            com.google.android.exoplayer2.Timeline$Window r6 = r8.window
            com.google.android.exoplayer2.Timeline$Period r7 = r8.period
            r3 = 1
            r2 = r19
            android.util.Pair r1 = resolveSeekPosition(r1, r2, r3, r4, r5, r6, r7)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x0044
            com.google.android.exoplayer2.PlaybackInfo r7 = r8.playbackInfo
            com.google.android.exoplayer2.Timeline r7 = r7.timeline
            android.util.Pair r7 = r8.getPlaceholderFirstMediaPeriodPosition(r7)
            java.lang.Object r10 = r7.first
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r10 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r10
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r11 = r7.longValue()
            com.google.android.exoplayer2.PlaybackInfo r7 = r8.playbackInfo
            com.google.android.exoplayer2.Timeline r7 = r7.timeline
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r9
            r13 = r4
            goto L_0x0096
        L_0x0044:
            java.lang.Object r7 = r1.first
            java.lang.Object r10 = r1.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r11 = r10.longValue()
            long r13 = r0.windowPositionUs
            int r10 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0056
            r13 = r4
            goto L_0x0057
        L_0x0056:
            r13 = r11
        L_0x0057:
            com.google.android.exoplayer2.MediaPeriodQueue r10 = r8.queue
            com.google.android.exoplayer2.PlaybackInfo r15 = r8.playbackInfo
            com.google.android.exoplayer2.Timeline r15 = r15.timeline
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = r10.resolveMediaPeriodIdForAds(r15, r7, r11)
            boolean r10 = r7.isAd()
            if (r10 == 0) goto L_0x008b
            com.google.android.exoplayer2.PlaybackInfo r4 = r8.playbackInfo
            com.google.android.exoplayer2.Timeline r4 = r4.timeline
            java.lang.Object r5 = r7.periodUid
            com.google.android.exoplayer2.Timeline$Period r10 = r8.period
            r4.getPeriodByUid(r5, r10)
            com.google.android.exoplayer2.Timeline$Period r4 = r8.period
            int r5 = r7.adGroupIndex
            int r4 = r4.getFirstAdIndexToPlay(r5)
            int r5 = r7.adIndexInAdGroup
            if (r4 != r5) goto L_0x0086
            com.google.android.exoplayer2.Timeline$Period r4 = r8.period
            long r4 = r4.getAdResumePositionUs()
            r11 = r4
            goto L_0x0088
        L_0x0086:
            r11 = 0
        L_0x0088:
            r10 = r7
            r7 = 1
            goto L_0x0096
        L_0x008b:
            long r2 = r0.windowPositionUs
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0093
            r2 = 1
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            r10 = r7
            r7 = r2
        L_0x0096:
            r5 = 2
            com.google.android.exoplayer2.PlaybackInfo r2 = r8.playbackInfo     // Catch:{ all -> 0x0162 }
            com.google.android.exoplayer2.Timeline r2 = r2.timeline     // Catch:{ all -> 0x0162 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x00a9
            r8.pendingInitialSeekPosition = r0     // Catch:{ all -> 0x00a4 }
            goto L_0x00b8
        L_0x00a4:
            r0 = move-exception
            r3 = r11
            r15 = 2
            goto L_0x0165
        L_0x00a9:
            r0 = 4
            if (r1 != 0) goto L_0x00bc
            com.google.android.exoplayer2.PlaybackInfo r1 = r8.playbackInfo     // Catch:{ all -> 0x00a4 }
            int r1 = r1.playbackState     // Catch:{ all -> 0x00a4 }
            if (r1 == r9) goto L_0x00b5
            r8.setState(r0)     // Catch:{ all -> 0x00a4 }
        L_0x00b5:
            r8.resetInternal(r6, r9, r6, r9)     // Catch:{ all -> 0x00a4 }
        L_0x00b8:
            r3 = r11
            r15 = 2
            goto L_0x0149
        L_0x00bc:
            com.google.android.exoplayer2.PlaybackInfo r1 = r8.playbackInfo     // Catch:{ all -> 0x0162 }
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.periodId     // Catch:{ all -> 0x0162 }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x0162 }
            if (r1 == 0) goto L_0x011c
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r8.queue     // Catch:{ all -> 0x0162 }
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getPlayingPeriod()     // Catch:{ all -> 0x0162 }
            if (r1 == 0) goto L_0x00e1
            boolean r2 = r1.prepared     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x00e1
            r2 = 0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00e1
            com.google.android.exoplayer2.source.MediaPeriod r1 = r1.mediaPeriod     // Catch:{ all -> 0x00a4 }
            com.google.android.exoplayer2.SeekParameters r2 = r8.seekParameters     // Catch:{ all -> 0x00a4 }
            long r1 = r1.getAdjustedSeekPositionUs(r11, r2)     // Catch:{ all -> 0x00a4 }
            goto L_0x00e2
        L_0x00e1:
            r1 = r11
        L_0x00e2:
            long r3 = com.google.android.exoplayer2.C3716C.usToMs(r1)     // Catch:{ all -> 0x0162 }
            com.google.android.exoplayer2.PlaybackInfo r15 = r8.playbackInfo     // Catch:{ all -> 0x0162 }
            r16 = r1
            long r0 = r15.positionUs     // Catch:{ all -> 0x0162 }
            long r0 = com.google.android.exoplayer2.C3716C.usToMs(r0)     // Catch:{ all -> 0x0162 }
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0118
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo     // Catch:{ all -> 0x0162 }
            int r0 = r0.playbackState     // Catch:{ all -> 0x0162 }
            if (r0 == r5) goto L_0x0101
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo     // Catch:{ all -> 0x00a4 }
            int r0 = r0.playbackState     // Catch:{ all -> 0x00a4 }
            r1 = 3
            if (r0 != r1) goto L_0x0118
        L_0x0101:
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo     // Catch:{ all -> 0x0162 }
            long r3 = r0.positionUs     // Catch:{ all -> 0x0162 }
            r1 = r18
            r2 = r10
            r15 = 2
            r5 = r13
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.handlePositionDiscontinuity(r2, r3, r5)
            r8.playbackInfo = r0
            if (r7 == 0) goto L_0x0117
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = r8.playbackInfoUpdate
            r0.setPositionDiscontinuity(r15)
        L_0x0117:
            return
        L_0x0118:
            r15 = 2
            r1 = r16
            goto L_0x011e
        L_0x011c:
            r15 = 2
            r1 = r11
        L_0x011e:
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo     // Catch:{ all -> 0x0160 }
            int r0 = r0.playbackState     // Catch:{ all -> 0x0160 }
            r3 = 4
            if (r0 != r3) goto L_0x0127
            r0 = 1
            goto L_0x0128
        L_0x0127:
            r0 = 0
        L_0x0128:
            long r16 = r8.seekToPeriodPosition(r10, r1, r0)     // Catch:{ all -> 0x0160 }
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r9 = 0
        L_0x0132:
            r9 = r9 | r7
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo     // Catch:{ all -> 0x015b }
            com.google.android.exoplayer2.Timeline r2 = r0.timeline     // Catch:{ all -> 0x015b }
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo     // Catch:{ all -> 0x015b }
            com.google.android.exoplayer2.Timeline r4 = r0.timeline     // Catch:{ all -> 0x015b }
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo     // Catch:{ all -> 0x015b }
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r0.periodId     // Catch:{ all -> 0x015b }
            r1 = r18
            r3 = r10
            r6 = r13
            r1.updateLivePlaybackSpeedControl(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x015b }
            r7 = r9
            r3 = r16
        L_0x0149:
            r1 = r18
            r2 = r10
            r5 = r13
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.handlePositionDiscontinuity(r2, r3, r5)
            r8.playbackInfo = r0
            if (r7 == 0) goto L_0x015a
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r0 = r8.playbackInfoUpdate
            r0.setPositionDiscontinuity(r15)
        L_0x015a:
            return
        L_0x015b:
            r0 = move-exception
            r7 = r9
            r3 = r16
            goto L_0x0165
        L_0x0160:
            r0 = move-exception
            goto L_0x0164
        L_0x0162:
            r0 = move-exception
            r15 = 2
        L_0x0164:
            r3 = r11
        L_0x0165:
            r1 = r18
            r2 = r10
            r5 = r13
            com.google.android.exoplayer2.PlaybackInfo r1 = r1.handlePositionDiscontinuity(r2, r3, r5)
            r8.playbackInfo = r1
            if (r7 == 0) goto L_0x0176
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdate r1 = r8.playbackInfoUpdate
            r1.setPositionDiscontinuity(r15)
        L_0x0176:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.seekToInternal(com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition):void");
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) throws ExoPlaybackException {
        return seekToPeriodPosition(mediaPeriodId, j, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(), z);
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z, boolean z2) throws ExoPlaybackException {
        stopRenderers();
        this.isRebuffering = false;
        if (z2 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder mediaPeriodHolder = playingPeriod;
        while (mediaPeriodHolder != null && !mediaPeriodId.equals(mediaPeriodHolder.info.f10040id)) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        if (z || playingPeriod != mediaPeriodHolder || (mediaPeriodHolder != null && mediaPeriodHolder.toRendererTime(j) < 0)) {
            for (Renderer disableRenderer : this.renderers) {
                disableRenderer(disableRenderer);
            }
            if (mediaPeriodHolder != null) {
                while (this.queue.getPlayingPeriod() != mediaPeriodHolder) {
                    this.queue.advancePlayingPeriod();
                }
                this.queue.removeAfter(mediaPeriodHolder);
                mediaPeriodHolder.setRendererOffset(0);
                enableRenderers();
            }
        }
        if (mediaPeriodHolder != null) {
            this.queue.removeAfter(mediaPeriodHolder);
            if (!mediaPeriodHolder.prepared) {
                mediaPeriodHolder.info = mediaPeriodHolder.info.copyWithStartPositionUs(j);
            } else {
                if (mediaPeriodHolder.info.durationUs != -9223372036854775807L && j >= mediaPeriodHolder.info.durationUs) {
                    j = Math.max(0, mediaPeriodHolder.info.durationUs - 1);
                }
                if (mediaPeriodHolder.hasEnabledTracks) {
                    long seekToUs = mediaPeriodHolder.mediaPeriod.seekToUs(j);
                    mediaPeriodHolder.mediaPeriod.discardBuffer(seekToUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
                    j = seekToUs;
                }
            }
            resetRendererPosition(j);
            maybeContinueLoading();
        } else {
            this.queue.clear();
            resetRendererPosition(j);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j;
    }

    private void resetRendererPosition(long j) throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            j = playingPeriod.toRendererTime(j);
        }
        this.rendererPositionUs = j;
        this.mediaClock.resetPosition(j);
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.resetPosition(this.rendererPositionUs);
            }
        }
        notifyTrackSelectionDiscontinuity();
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) throws ExoPlaybackException {
        this.mediaClock.setPlaybackParameters(playbackParameters);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setSeekParametersInternal(SeekParameters seekParameters2) {
        this.seekParameters = seekParameters2;
    }

    private void setForegroundModeInternal(boolean z, AtomicBoolean atomicBoolean) {
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (!z) {
                for (Renderer renderer : this.renderers) {
                    if (!isRendererEnabled(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void stopInternal(boolean z, boolean z2) {
        resetInternal(z || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.loadControl.onStopped();
        setState(1);
    }

    private void releaseInternal() {
        resetInternal(true, false, true, false);
        this.loadControl.onReleased();
        setState(1);
        this.internalPlaybackThread.quit();
        synchronized (this) {
            this.released = true;
            notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void resetInternal(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            r33 = this;
            r1 = r33
            com.google.android.exoplayer2.util.HandlerWrapper r0 = r1.handler
            r2 = 2
            r0.removeMessages(r2)
            r2 = 0
            r1.isRebuffering = r2
            com.google.android.exoplayer2.DefaultMediaClock r0 = r1.mediaClock
            r0.stop()
            r3 = 0
            r1.rendererPositionUs = r3
            com.google.android.exoplayer2.Renderer[] r3 = r1.renderers
            int r4 = r3.length
            r5 = 0
        L_0x0018:
            java.lang.String r6 = "ExoPlayerImplInternal"
            if (r5 >= r4) goto L_0x002d
            r0 = r3[r5]
            r1.disableRenderer(r0)     // Catch:{ ExoPlaybackException -> 0x0024, RuntimeException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r0 = move-exception
            goto L_0x0025
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            java.lang.String r7 = "Disable failed."
            com.google.android.exoplayer2.util.Log.m9244e(r6, r7, r0)
        L_0x002a:
            int r5 = r5 + 1
            goto L_0x0018
        L_0x002d:
            if (r34 == 0) goto L_0x0045
            com.google.android.exoplayer2.Renderer[] r3 = r1.renderers
            int r4 = r3.length
            r5 = 0
        L_0x0033:
            if (r5 >= r4) goto L_0x0045
            r0 = r3[r5]
            r0.reset()     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x0042
        L_0x003b:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Reset failed."
            com.google.android.exoplayer2.util.Log.m9244e(r6, r0, r7)
        L_0x0042:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x0045:
            r1.enabledRendererCount = r2
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            com.google.android.exoplayer2.PlaybackInfo r3 = r1.playbackInfo
            long r3 = r3.positionUs
            com.google.android.exoplayer2.PlaybackInfo r5 = r1.playbackInfo
            com.google.android.exoplayer2.Timeline$Period r6 = r1.period
            com.google.android.exoplayer2.Timeline$Window r7 = r1.window
            boolean r5 = shouldUseRequestedContentPosition(r5, r6, r7)
            if (r5 == 0) goto L_0x0060
            com.google.android.exoplayer2.PlaybackInfo r5 = r1.playbackInfo
            long r5 = r5.requestedContentPositionUs
            goto L_0x0064
        L_0x0060:
            com.google.android.exoplayer2.PlaybackInfo r5 = r1.playbackInfo
            long r5 = r5.positionUs
        L_0x0064:
            r7 = 0
            if (r35 == 0) goto L_0x0099
            r1.pendingInitialSeekPosition = r7
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            android.util.Pair r0 = r1.getPlaceholderFirstMediaPeriodPosition(r0)
            java.lang.Object r3 = r0.first
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) r3
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0093
            r0 = 1
            r21 = r3
            r29 = r4
            r13 = r8
            goto L_0x009f
        L_0x0093:
            r21 = r3
            r29 = r4
            r13 = r8
            goto L_0x009e
        L_0x0099:
            r21 = r0
            r29 = r3
            r13 = r5
        L_0x009e:
            r0 = 0
        L_0x009f:
            com.google.android.exoplayer2.MediaPeriodQueue r3 = r1.queue
            r3.clear()
            r1.shouldContinueLoading = r2
            com.google.android.exoplayer2.PlaybackInfo r2 = new com.google.android.exoplayer2.PlaybackInfo
            com.google.android.exoplayer2.PlaybackInfo r3 = r1.playbackInfo
            com.google.android.exoplayer2.Timeline r11 = r3.timeline
            com.google.android.exoplayer2.PlaybackInfo r3 = r1.playbackInfo
            int r15 = r3.playbackState
            if (r37 == 0) goto L_0x00b5
            r16 = r7
            goto L_0x00bb
        L_0x00b5:
            com.google.android.exoplayer2.PlaybackInfo r3 = r1.playbackInfo
            com.google.android.exoplayer2.ExoPlaybackException r3 = r3.playbackError
            r16 = r3
        L_0x00bb:
            r17 = 0
            if (r0 == 0) goto L_0x00c2
            com.google.android.exoplayer2.source.TrackGroupArray r3 = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY
            goto L_0x00c6
        L_0x00c2:
            com.google.android.exoplayer2.PlaybackInfo r3 = r1.playbackInfo
            com.google.android.exoplayer2.source.TrackGroupArray r3 = r3.trackGroups
        L_0x00c6:
            r18 = r3
            if (r0 == 0) goto L_0x00cd
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r3 = r1.emptyTrackSelectorResult
            goto L_0x00d1
        L_0x00cd:
            com.google.android.exoplayer2.PlaybackInfo r3 = r1.playbackInfo
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r3 = r3.trackSelectorResult
        L_0x00d1:
            r19 = r3
            if (r0 == 0) goto L_0x00da
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.m9346of()
            goto L_0x00de
        L_0x00da:
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r0 = r0.staticMetadata
        L_0x00de:
            r20 = r0
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            boolean r0 = r0.playWhenReady
            r22 = r0
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            int r0 = r0.playbackSuppressionReason
            r23 = r0
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.playbackInfo
            com.google.android.exoplayer2.PlaybackParameters r0 = r0.playbackParameters
            r24 = r0
            r27 = 0
            boolean r0 = r1.offloadSchedulingEnabled
            r31 = r0
            r32 = 0
            r10 = r2
            r12 = r21
            r25 = r29
            r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r32)
            r1.playbackInfo = r2
            if (r36 == 0) goto L_0x010b
            com.google.android.exoplayer2.MediaSourceList r0 = r1.mediaSourceList
            r0.release()
        L_0x010b:
            r1.pendingRecoverableError = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.resetInternal(boolean, boolean, boolean, boolean):void");
    }

    private Pair<MediaSource.MediaPeriodId, Long> getPlaceholderFirstMediaPeriodPosition(Timeline timeline) {
        long j = 0;
        if (timeline.isEmpty()) {
            return Pair.create(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Timeline timeline2 = timeline;
        Pair<Object, Long> periodPosition = timeline2.getPeriodPosition(this.window, this.period, timeline.getFirstWindowIndex(this.shuffleModeEnabled), -9223372036854775807L);
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = this.queue.resolveMediaPeriodIdForAds(timeline, periodPosition.first, 0);
        long longValue = ((Long) periodPosition.second).longValue();
        if (resolveMediaPeriodIdForAds.isAd()) {
            timeline.getPeriodByUid(resolveMediaPeriodIdForAds.periodUid, this.period);
            if (resolveMediaPeriodIdForAds.adIndexInAdGroup == this.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAds.adGroupIndex)) {
                j = this.period.getAdResumePositionUs();
            }
            longValue = j;
        }
        return Pair.create(resolveMediaPeriodIdForAds, Long.valueOf(longValue));
    }

    private void sendMessageInternal(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getPositionMs() == -9223372036854775807L) {
            sendMessageToTarget(playerMessage);
        } else if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new PendingMessageInfo(playerMessage));
        } else {
            PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
            if (resolvePendingMessagePosition(pendingMessageInfo, this.playbackInfo.timeline, this.playbackInfo.timeline, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.add(pendingMessageInfo);
                Collections.sort(this.pendingMessages);
                return;
            }
            playerMessage.markAsProcessed(false);
        }
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getLooper() == this.playbackLooper) {
            deliverMessage(playerMessage);
            if (this.playbackInfo.playbackState == 3 || this.playbackInfo.playbackState == 2) {
                this.handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.handler.obtainMessage(15, playerMessage).sendToTarget();
    }

    private void sendMessageToTargetThread(PlayerMessage playerMessage) {
        Looper looper = playerMessage.getLooper();
        if (!looper.getThread().isAlive()) {
            Log.m9247w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
            return;
        }
        this.clock.createHandler(looper, (Handler.Callback) null).post(new Runnable(playerMessage) {
            public final /* synthetic */ PlayerMessage f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ExoPlayerImplInternal.this.lambda$sendMessageToTargetThread$1$ExoPlayerImplInternal(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$sendMessageToTargetThread$1$ExoPlayerImplInternal(PlayerMessage playerMessage) {
        try {
            deliverMessage(playerMessage);
        } catch (ExoPlaybackException e) {
            Log.m9244e(TAG, "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private void deliverMessage(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (!playerMessage.isCanceled()) {
            try {
                playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
            } finally {
                playerMessage.markAsProcessed(true);
            }
        }
    }

    private void resolvePendingMessagePositions(Timeline timeline, Timeline timeline2) {
        if (!timeline.isEmpty() || !timeline2.isEmpty()) {
            for (int size = this.pendingMessages.size() - 1; size >= 0; size--) {
                if (!resolvePendingMessagePosition(this.pendingMessages.get(size), timeline, timeline2, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                    this.pendingMessages.get(size).message.markAsProcessed(false);
                    this.pendingMessages.remove(size);
                }
            }
            Collections.sort(this.pendingMessages);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[EDGE_INSN: B:66:0x0066->B:21:0x0066 ?: BREAK  
    EDGE_INSN: B:67:0x0066->B:21:0x0066 ?: BREAK  
    EDGE_INSN: B:69:0x0066->B:21:0x0066 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b5 A[SYNTHETIC, Splitter:B:46:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x009f A[EDGE_INSN: B:72:0x009f->B:85:0x009f ?: BREAK  
    EDGE_INSN: B:73:0x009f->B:85:0x009f ?: BREAK  
    EDGE_INSN: B:74:0x009f->B:85:0x009f ?: BREAK  
    EDGE_INSN: B:75:0x009f->B:85:0x009f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void maybeTriggerPendingMessages(long r8, long r10) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r7 = this;
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r0 = r7.pendingMessages
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ff
            com.google.android.exoplayer2.PlaybackInfo r0 = r7.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.periodId
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x0014
            goto L_0x00ff
        L_0x0014:
            boolean r0 = r7.deliverPendingMessageAtStartPositionRequired
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r8 = r8 - r0
            r0 = 0
            r7.deliverPendingMessageAtStartPositionRequired = r0
        L_0x001e:
            com.google.android.exoplayer2.PlaybackInfo r0 = r7.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            com.google.android.exoplayer2.PlaybackInfo r1 = r7.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.periodId
            java.lang.Object r1 = r1.periodUid
            int r0 = r0.getIndexOfPeriod(r1)
            int r1 = r7.nextPendingMessageIndexHint
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r2 = r7.pendingMessages
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0046
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r3 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r3
            goto L_0x0047
        L_0x0046:
            r3 = r2
        L_0x0047:
            if (r3 == 0) goto L_0x0066
            int r4 = r3.resolvedPeriodIndex
            if (r4 > r0) goto L_0x0057
            int r4 = r3.resolvedPeriodIndex
            if (r4 != r0) goto L_0x0066
            long r3 = r3.resolvedPeriodTimeUs
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0066
        L_0x0057:
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x0046
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r3 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r3
            goto L_0x0047
        L_0x0066:
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0077
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r3 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r3
            goto L_0x0078
        L_0x0077:
            r3 = r2
        L_0x0078:
            if (r3 == 0) goto L_0x009f
            java.lang.Object r4 = r3.resolvedPeriodUid
            if (r4 == 0) goto L_0x009f
            int r4 = r3.resolvedPeriodIndex
            if (r4 < r0) goto L_0x008c
            int r4 = r3.resolvedPeriodIndex
            if (r4 != r0) goto L_0x009f
            long r4 = r3.resolvedPeriodTimeUs
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x009f
        L_0x008c:
            int r1 = r1 + 1
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0077
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r3 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r3
            goto L_0x0078
        L_0x009f:
            if (r3 == 0) goto L_0x00fd
            java.lang.Object r4 = r3.resolvedPeriodUid
            if (r4 == 0) goto L_0x00fd
            int r4 = r3.resolvedPeriodIndex
            if (r4 != r0) goto L_0x00fd
            long r4 = r3.resolvedPeriodTimeUs
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00fd
            long r4 = r3.resolvedPeriodTimeUs
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x00fd
            com.google.android.exoplayer2.PlayerMessage r4 = r3.message     // Catch:{ all -> 0x00e6 }
            r7.sendMessageToTarget(r4)     // Catch:{ all -> 0x00e6 }
            com.google.android.exoplayer2.PlayerMessage r4 = r3.message
            boolean r4 = r4.getDeleteAfterDelivery()
            if (r4 != 0) goto L_0x00ce
            com.google.android.exoplayer2.PlayerMessage r3 = r3.message
            boolean r3 = r3.isCanceled()
            if (r3 == 0) goto L_0x00cb
            goto L_0x00ce
        L_0x00cb:
            int r1 = r1 + 1
            goto L_0x00d3
        L_0x00ce:
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            r3.remove(r1)
        L_0x00d3:
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00e4
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r3 = r7.pendingMessages
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo r3 = (com.google.android.exoplayer2.ExoPlayerImplInternal.PendingMessageInfo) r3
            goto L_0x009f
        L_0x00e4:
            r3 = r2
            goto L_0x009f
        L_0x00e6:
            r8 = move-exception
            com.google.android.exoplayer2.PlayerMessage r9 = r3.message
            boolean r9 = r9.getDeleteAfterDelivery()
            if (r9 != 0) goto L_0x00f7
            com.google.android.exoplayer2.PlayerMessage r9 = r3.message
            boolean r9 = r9.isCanceled()
            if (r9 == 0) goto L_0x00fc
        L_0x00f7:
            java.util.ArrayList<com.google.android.exoplayer2.ExoPlayerImplInternal$PendingMessageInfo> r9 = r7.pendingMessages
            r9.remove(r1)
        L_0x00fc:
            throw r8
        L_0x00fd:
            r7.nextPendingMessageIndexHint = r1
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.maybeTriggerPendingMessages(long, long):void");
    }

    private void ensureStopped(Renderer renderer) throws ExoPlaybackException {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private void disableRenderer(Renderer renderer) throws ExoPlaybackException {
        if (isRendererEnabled(renderer)) {
            this.mediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
            this.enabledRendererCount--;
        }
    }

    private void reselectTracksInternal() throws ExoPlaybackException {
        float f = this.mediaClock.getPlaybackParameters().speed;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z = true;
        while (playingPeriod != null && playingPeriod.prepared) {
            TrackSelectorResult selectTracks = playingPeriod.selectTracks(f, this.playbackInfo.timeline);
            int i = 0;
            if (!selectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (z) {
                    MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    boolean removeAfter = this.queue.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.renderers.length];
                    long applyTrackSelection = playingPeriod2.applyTrackSelection(selectTracks, this.playbackInfo.positionUs, removeAfter, zArr);
                    MediaPeriodHolder mediaPeriodHolder = playingPeriod2;
                    PlaybackInfo handlePositionDiscontinuity = handlePositionDiscontinuity(this.playbackInfo.periodId, applyTrackSelection, this.playbackInfo.requestedContentPositionUs);
                    this.playbackInfo = handlePositionDiscontinuity;
                    if (!(handlePositionDiscontinuity.playbackState == 4 || applyTrackSelection == this.playbackInfo.positionUs)) {
                        this.playbackInfoUpdate.setPositionDiscontinuity(4);
                        resetRendererPosition(applyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    while (true) {
                        Renderer[] rendererArr = this.renderers;
                        if (i >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i];
                        zArr2[i] = isRendererEnabled(renderer);
                        SampleStream sampleStream = mediaPeriodHolder.sampleStreams[i];
                        if (zArr2[i]) {
                            if (sampleStream != renderer.getStream()) {
                                disableRenderer(renderer);
                            } else if (zArr[i]) {
                                renderer.resetPosition(this.rendererPositionUs);
                            }
                        }
                        i++;
                    }
                    enableRenderers(zArr2);
                } else {
                    this.queue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        playingPeriod.applyTrackSelection(selectTracks, Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs)), false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (playingPeriod == readingPeriod) {
                z = false;
            }
            playingPeriod = playingPeriod.getNext();
        }
    }

    private void updateTrackSelectionPlaybackSpeed(float f) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f);
                }
            }
        }
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private boolean shouldTransitionToReadyState(boolean z) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        if (!z) {
            return false;
        }
        if (!this.playbackInfo.isLoading) {
            return true;
        }
        long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, this.queue.getPlayingPeriod().info.f10040id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : -9223372036854775807L;
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z2 = loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal;
        boolean z3 = loadingPeriod.info.f10040id.isAd() && !loadingPeriod.prepared;
        if (z2 || z3 || this.loadControl.shouldStartPlayback(getTotalBufferedDurationUs(), this.mediaClock.getPlaybackParameters().speed, this.isRebuffering, targetLiveOffsetUs)) {
            return true;
        }
        return false;
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = playingPeriod.info.durationUs;
        return playingPeriod.prepared && (j == -9223372036854775807L || this.playbackInfo.positionUs < j || !shouldPlayWhenReady());
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleMediaSourceListInfoRefreshed(com.google.android.exoplayer2.Timeline r22) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r21 = this;
            r8 = r21
            r7 = r22
            com.google.android.exoplayer2.PlaybackInfo r10 = r8.playbackInfo
            com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition r11 = r8.pendingInitialSeekPosition
            com.google.android.exoplayer2.MediaPeriodQueue r12 = r8.queue
            int r13 = r8.repeatMode
            boolean r14 = r8.shuffleModeEnabled
            com.google.android.exoplayer2.Timeline$Window r15 = r8.window
            com.google.android.exoplayer2.Timeline$Period r0 = r8.period
            r9 = r22
            r16 = r0
            com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange r9 = resolvePositionForPlaylistChange(r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r10 = r9.periodId
            long r11 = r9.requestedContentPositionUs
            boolean r0 = r9.forceBufferingState
            long r13 = r9.periodPositionUs
            com.google.android.exoplayer2.PlaybackInfo r1 = r8.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r1.periodId
            boolean r1 = r1.equals(r10)
            r2 = 1
            r15 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.exoplayer2.PlaybackInfo r1 = r8.playbackInfo
            long r3 = r1.positionUs
            int r1 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            r16 = 0
            goto L_0x003c
        L_0x003a:
            r16 = 1
        L_0x003c:
            r5 = 0
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r1 = r9.endPlayback     // Catch:{ all -> 0x00e7 }
            if (r1 == 0) goto L_0x0053
            com.google.android.exoplayer2.PlaybackInfo r1 = r8.playbackInfo     // Catch:{ all -> 0x00e7 }
            int r1 = r1.playbackState     // Catch:{ all -> 0x00e7 }
            if (r1 == r2) goto L_0x0050
            r1 = 4
            r8.setState(r1)     // Catch:{ all -> 0x00e7 }
        L_0x0050:
            r8.resetInternal(r15, r15, r15, r2)     // Catch:{ all -> 0x00e7 }
        L_0x0053:
            if (r16 != 0) goto L_0x006b
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r8.queue     // Catch:{ all -> 0x00e7 }
            long r3 = r8.rendererPositionUs     // Catch:{ all -> 0x00e7 }
            long r19 = r21.getMaxRendererReadPositionUs()     // Catch:{ all -> 0x00e7 }
            r2 = r22
            r5 = r19
            boolean r0 = r1.updateQueuedPeriods(r2, r3, r5)     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x0097
            r8.seekToCurrentPosition(r15)     // Catch:{ all -> 0x00e4 }
            goto L_0x0097
        L_0x006b:
            boolean r1 = r22.isEmpty()     // Catch:{ all -> 0x00e4 }
            if (r1 != 0) goto L_0x0097
            com.google.android.exoplayer2.MediaPeriodQueue r1 = r8.queue     // Catch:{ all -> 0x00e4 }
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getPlayingPeriod()     // Catch:{ all -> 0x00e4 }
        L_0x0077:
            if (r1 == 0) goto L_0x0092
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r1.info     // Catch:{ all -> 0x00e4 }
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.f10040id     // Catch:{ all -> 0x00e4 }
            boolean r2 = r2.equals(r10)     // Catch:{ all -> 0x00e4 }
            if (r2 == 0) goto L_0x008d
            com.google.android.exoplayer2.MediaPeriodQueue r2 = r8.queue     // Catch:{ all -> 0x00e4 }
            com.google.android.exoplayer2.MediaPeriodInfo r3 = r1.info     // Catch:{ all -> 0x00e4 }
            com.google.android.exoplayer2.MediaPeriodInfo r2 = r2.getUpdatedMediaPeriodInfo(r7, r3)     // Catch:{ all -> 0x00e4 }
            r1.info = r2     // Catch:{ all -> 0x00e4 }
        L_0x008d:
            com.google.android.exoplayer2.MediaPeriodHolder r1 = r1.getNext()     // Catch:{ all -> 0x00e4 }
            goto L_0x0077
        L_0x0092:
            long r0 = r8.seekToPeriodPosition(r10, r13, r0)     // Catch:{ all -> 0x00e4 }
            r13 = r0
        L_0x0097:
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo
            com.google.android.exoplayer2.Timeline r4 = r0.timeline
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r0.periodId
            boolean r0 = r9.setTargetLiveOffset
            if (r0 == 0) goto L_0x00a5
            r17 = r13
        L_0x00a5:
            r1 = r21
            r2 = r22
            r3 = r10
            r9 = r7
            r6 = r17
            r1.updateLivePlaybackSpeedControl(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x00ba
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo
            long r0 = r0.requestedContentPositionUs
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00c5
        L_0x00ba:
            r1 = r21
            r2 = r10
            r3 = r13
            r5 = r11
            com.google.android.exoplayer2.PlaybackInfo r0 = r1.handlePositionDiscontinuity(r2, r3, r5)
            r8.playbackInfo = r0
        L_0x00c5:
            r21.resetPendingPauseAtEndOfPeriod()
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo
            com.google.android.exoplayer2.Timeline r0 = r0.timeline
            r8.resolvePendingMessagePositions(r9, r0)
            com.google.android.exoplayer2.PlaybackInfo r0 = r8.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r0 = r0.copyWithTimeline(r9)
            r8.playbackInfo = r0
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x00e0
            r6 = 0
            r8.pendingInitialSeekPosition = r6
        L_0x00e0:
            r8.handleLoadingMediaPeriodChanged(r15)
            return
        L_0x00e4:
            r0 = move-exception
            r6 = 0
            goto L_0x00e9
        L_0x00e7:
            r0 = move-exception
            r6 = r5
        L_0x00e9:
            com.google.android.exoplayer2.PlaybackInfo r1 = r8.playbackInfo
            com.google.android.exoplayer2.Timeline r4 = r1.timeline
            com.google.android.exoplayer2.PlaybackInfo r1 = r8.playbackInfo
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r1.periodId
            boolean r1 = r9.setTargetLiveOffset
            if (r1 == 0) goto L_0x00f7
            r17 = r13
        L_0x00f7:
            r1 = r21
            r2 = r22
            r3 = r10
            r15 = r6
            r9 = r7
            r6 = r17
            r1.updateLivePlaybackSpeedControl(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x010d
            com.google.android.exoplayer2.PlaybackInfo r1 = r8.playbackInfo
            long r1 = r1.requestedContentPositionUs
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0118
        L_0x010d:
            r1 = r21
            r2 = r10
            r3 = r13
            r5 = r11
            com.google.android.exoplayer2.PlaybackInfo r1 = r1.handlePositionDiscontinuity(r2, r3, r5)
            r8.playbackInfo = r1
        L_0x0118:
            r21.resetPendingPauseAtEndOfPeriod()
            com.google.android.exoplayer2.PlaybackInfo r1 = r8.playbackInfo
            com.google.android.exoplayer2.Timeline r1 = r1.timeline
            r8.resolvePendingMessagePositions(r9, r1)
            com.google.android.exoplayer2.PlaybackInfo r1 = r8.playbackInfo
            com.google.android.exoplayer2.PlaybackInfo r1 = r1.copyWithTimeline(r9)
            r8.playbackInfo = r1
            boolean r1 = r22.isEmpty()
            if (r1 != 0) goto L_0x0132
            r8.pendingInitialSeekPosition = r15
        L_0x0132:
            r1 = 0
            r8.handleLoadingMediaPeriodChanged(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.handleMediaSourceListInfoRefreshed(com.google.android.exoplayer2.Timeline):void");
    }

    private void updateLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j) {
        if (!timeline.isEmpty() && shouldUseLivePlaybackSpeedControl(timeline, mediaPeriodId)) {
            timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
            this.livePlaybackSpeedControl.setLiveConfiguration((MediaItem.LiveConfiguration) Util.castNonNull(this.window.liveConfiguration));
            if (j != -9223372036854775807L) {
                this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(timeline, mediaPeriodId.periodUid, j));
                return;
            }
            Object obj = this.window.uid;
            Object obj2 = null;
            if (!timeline2.isEmpty()) {
                obj2 = timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period).windowIndex, this.window).uid;
            }
            if (!Util.areEqual(obj2, obj)) {
                this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(-9223372036854775807L);
            }
        } else if (this.mediaClock.getPlaybackParameters().speed != this.playbackInfo.playbackParameters.speed) {
            this.mediaClock.setPlaybackParameters(this.playbackInfo.playbackParameters);
        }
    }

    private long getMaxRendererReadPositionUs() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return 0;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.prepared) {
            return rendererOffset;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return rendererOffset;
            }
            if (isRendererEnabled(rendererArr[i]) && this.renderers[i].getStream() == readingPeriod.sampleStreams[i]) {
                long readingPositionUs = this.renderers[i].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i++;
        }
    }

    private void updatePeriods() throws ExoPlaybackException, IOException {
        if (!this.playbackInfo.timeline.isEmpty() && this.mediaSourceList.isPrepared()) {
            maybeUpdateLoadingPeriod();
            maybeUpdateReadingPeriod();
            maybeUpdateReadingRenderers();
            maybeUpdatePlayingPeriod();
        }
    }

    private void maybeUpdateLoadingPeriod() throws ExoPlaybackException {
        MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            MediaPeriodHolder enqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(this.rendererCapabilities, this.trackSelector, this.loadControl.getAllocator(), this.mediaSourceList, nextMediaPeriodInfo, this.emptyTrackSelectorResult);
            enqueueNextMediaPeriodHolder.mediaPeriod.prepare(this, nextMediaPeriodInfo.startPositionUs);
            if (this.queue.getPlayingPeriod() == enqueueNextMediaPeriodHolder) {
                resetRendererPosition(enqueueNextMediaPeriodHolder.getStartPositionRendererTime());
            }
            handleLoadingMediaPeriodChanged(false);
        }
        if (this.shouldContinueLoading) {
            this.shouldContinueLoading = isLoadingPossible();
            updateIsLoading();
            return;
        }
        maybeContinueLoading();
    }

    private void maybeUpdateReadingPeriod() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod != null) {
            int i = 0;
            if (readingPeriod.getNext() == null || this.pendingPauseAtEndOfPeriod) {
                if (readingPeriod.info.isFinal || this.pendingPauseAtEndOfPeriod) {
                    while (true) {
                        Renderer[] rendererArr = this.renderers;
                        if (i < rendererArr.length) {
                            Renderer renderer = rendererArr[i];
                            SampleStream sampleStream = readingPeriod.sampleStreams[i];
                            if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                                setCurrentStreamFinal(renderer, (readingPeriod.info.durationUs == -9223372036854775807L || readingPeriod.info.durationUs == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.info.durationUs);
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (hasReadingPeriodFinishedReading()) {
                if (readingPeriod.getNext().prepared || this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime()) {
                    TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                    MediaPeriodHolder advanceReadingPeriod = this.queue.advanceReadingPeriod();
                    TrackSelectorResult trackSelectorResult2 = advanceReadingPeriod.getTrackSelectorResult();
                    if (!advanceReadingPeriod.prepared || advanceReadingPeriod.mediaPeriod.readDiscontinuity() == -9223372036854775807L) {
                        for (int i2 = 0; i2 < this.renderers.length; i2++) {
                            boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i2);
                            boolean isRendererEnabled2 = trackSelectorResult2.isRendererEnabled(i2);
                            if (isRendererEnabled && !this.renderers[i2].isCurrentStreamFinal()) {
                                boolean z = this.rendererCapabilities[i2].getTrackType() == 7;
                                RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i2];
                                RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i2];
                                if (!isRendererEnabled2 || !rendererConfiguration2.equals(rendererConfiguration) || z) {
                                    setCurrentStreamFinal(this.renderers[i2], advanceReadingPeriod.getStartPositionRendererTime());
                                }
                            }
                        }
                        return;
                    }
                    setAllRendererStreamsFinal(advanceReadingPeriod.getStartPositionRendererTime());
                }
            }
        }
    }

    private void maybeUpdateReadingRenderers() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod != null && this.queue.getPlayingPeriod() != readingPeriod && !readingPeriod.allRenderersEnabled && replaceStreamsOrDisableRendererForTransition()) {
            enableRenderers();
        }
    }

    private boolean replaceStreamsOrDisableRendererForTransition() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i = 0;
        boolean z = false;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return !z;
            }
            Renderer renderer = rendererArr[i];
            if (isRendererEnabled(renderer)) {
                boolean z2 = renderer.getStream() != readingPeriod.sampleStreams[i];
                if (!trackSelectorResult.isRendererEnabled(i) || z2) {
                    if (!renderer.isCurrentStreamFinal()) {
                        renderer.replaceStream(getFormats(trackSelectorResult.selections[i]), readingPeriod.sampleStreams[i], readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
                    } else if (renderer.isEnded()) {
                        disableRenderer(renderer);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    private void maybeUpdatePlayingPeriod() throws ExoPlaybackException {
        boolean z = false;
        while (shouldAdvancePlayingPeriod()) {
            if (z) {
                maybeNotifyPlaybackInfoChanged();
            }
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            MediaPeriodHolder advancePlayingPeriod = this.queue.advancePlayingPeriod();
            this.playbackInfo = handlePositionDiscontinuity(advancePlayingPeriod.info.f10040id, advancePlayingPeriod.info.startPositionUs, advancePlayingPeriod.info.requestedContentPositionUs);
            this.playbackInfoUpdate.setPositionDiscontinuity(playingPeriod.info.isLastInTimelinePeriod ? 0 : 3);
            updateLivePlaybackSpeedControl(this.playbackInfo.timeline, advancePlayingPeriod.info.f10040id, this.playbackInfo.timeline, playingPeriod.info.f10040id, -9223372036854775807L);
            resetPendingPauseAtEndOfPeriod();
            updatePlaybackPositions();
            z = true;
        }
    }

    private void resetPendingPauseAtEndOfPeriod() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private boolean shouldAdvancePlayingPeriod() {
        MediaPeriodHolder playingPeriod;
        MediaPeriodHolder next;
        if (shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (playingPeriod = this.queue.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.rendererPositionUs >= next.getStartPositionRendererTime() && next.allRenderersEnabled) {
            return true;
        }
        return false;
    }

    private boolean hasReadingPeriodFinishedReading() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (!readingPeriod.prepared) {
            return false;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return true;
            }
            Renderer renderer = rendererArr[i];
            SampleStream sampleStream = readingPeriod.sampleStreams[i];
            if (renderer.getStream() != sampleStream || (sampleStream != null && !renderer.hasReadStreamToEnd())) {
                return false;
            }
            i++;
        }
        return false;
    }

    private void setAllRendererStreamsFinal(long j) {
        for (Renderer renderer : this.renderers) {
            if (renderer.getStream() != null) {
                setCurrentStreamFinal(renderer, j);
            }
        }
    }

    private void setCurrentStreamFinal(Renderer renderer, long j) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(j);
        }
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        if (this.queue.isLoading(mediaPeriod)) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.handlePrepared(this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.timeline);
            updateLoadControlTrackSelection(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
            if (loadingPeriod == this.queue.getPlayingPeriod()) {
                resetRendererPosition(loadingPeriod.info.startPositionUs);
                enableRenderers();
                this.playbackInfo = handlePositionDiscontinuity(this.playbackInfo.periodId, loadingPeriod.info.startPositionUs, this.playbackInfo.requestedContentPositionUs);
            }
            maybeContinueLoading();
        }
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        }
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, boolean z) throws ExoPlaybackException {
        handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, z);
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, float f, boolean z, boolean z2) throws ExoPlaybackException {
        if (z) {
            if (z2) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (Renderer renderer : this.renderers) {
            if (renderer != null) {
                renderer.setPlaybackSpeed(f, playbackParameters.speed);
            }
        }
    }

    private void maybeContinueLoading() {
        boolean shouldContinueLoading2 = shouldContinueLoading();
        this.shouldContinueLoading = shouldContinueLoading2;
        if (shouldContinueLoading2) {
            this.queue.getLoadingPeriod().continueLoading(this.rendererPositionUs);
        }
        updateIsLoading();
    }

    private boolean shouldContinueLoading() {
        long j;
        if (!isLoadingPossible()) {
            return false;
        }
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
        if (loadingPeriod == this.queue.getPlayingPeriod()) {
            j = loadingPeriod.toPeriodTime(this.rendererPositionUs);
        } else {
            j = loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs;
        }
        return this.loadControl.shouldContinueLoading(j, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed);
    }

    private boolean isLoadingPossible() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null || loadingPeriod.getNextLoadPositionUs() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private void updateIsLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        if (z != this.playbackInfo.isLoading) {
            this.playbackInfo = this.playbackInfo.copyWithIsLoading(z);
        }
    }

    private PlaybackInfo handlePositionDiscontinuity(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2) {
        ImmutableList<Metadata> immutableList;
        TrackSelectorResult trackSelectorResult;
        TrackGroupArray trackGroupArray;
        TrackGroupArray trackGroupArray2;
        TrackSelectorResult trackSelectorResult2;
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
        long j3 = j2;
        this.deliverPendingMessageAtStartPositionRequired = this.deliverPendingMessageAtStartPositionRequired || j != this.playbackInfo.positionUs || !mediaPeriodId.equals(this.playbackInfo.periodId);
        resetPendingPauseAtEndOfPeriod();
        TrackGroupArray trackGroupArray3 = this.playbackInfo.trackGroups;
        TrackSelectorResult trackSelectorResult3 = this.playbackInfo.trackSelectorResult;
        List list = this.playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod == null) {
                trackGroupArray2 = TrackGroupArray.EMPTY;
            } else {
                trackGroupArray2 = playingPeriod.getTrackGroups();
            }
            if (playingPeriod == null) {
                trackSelectorResult2 = this.emptyTrackSelectorResult;
            } else {
                trackSelectorResult2 = playingPeriod.getTrackSelectorResult();
            }
            ImmutableList<Metadata> extractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult2.selections);
            if (!(playingPeriod == null || playingPeriod.info.requestedContentPositionUs == j3)) {
                playingPeriod.info = playingPeriod.info.copyWithRequestedContentPositionUs(j3);
            }
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult2;
            immutableList = extractMetadataFromTrackSelectionArray;
        } else {
            if (!mediaPeriodId.equals(this.playbackInfo.periodId)) {
                trackGroupArray3 = TrackGroupArray.EMPTY;
                trackSelectorResult3 = this.emptyTrackSelectorResult;
                list = ImmutableList.m9346of();
            }
            trackGroupArray = trackGroupArray3;
            trackSelectorResult = trackSelectorResult3;
            immutableList = list;
        }
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j, j2, getTotalBufferedDurationUs(), trackGroupArray, trackSelectorResult, immutableList);
    }

    private ImmutableList<Metadata> extractMetadataFromTrackSelectionArray(ExoTrackSelection[] exoTrackSelectionArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        boolean z = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                Format format = exoTrackSelection.getFormat(0);
                if (format.metadata == null) {
                    builder.add((Object) new Metadata(new Metadata.Entry[0]));
                } else {
                    builder.add((Object) format.metadata);
                    z = true;
                }
            }
        }
        return z ? builder.build() : ImmutableList.m9346of();
    }

    private void enableRenderers() throws ExoPlaybackException {
        enableRenderers(new boolean[this.renderers.length]);
    }

    private void enableRenderers(boolean[] zArr) throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (!trackSelectorResult.isRendererEnabled(i)) {
                this.renderers[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.renderers.length; i2++) {
            if (trackSelectorResult.isRendererEnabled(i2)) {
                enableRenderer(i2, zArr[i2]);
            }
        }
        readingPeriod.allRenderersEnabled = true;
    }

    private void enableRenderer(int i, boolean z) throws ExoPlaybackException {
        Renderer renderer = this.renderers[i];
        if (!isRendererEnabled(renderer)) {
            MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
            boolean z2 = readingPeriod == this.queue.getPlayingPeriod();
            TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
            RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i];
            Format[] formats = getFormats(trackSelectorResult.selections[i]);
            boolean z3 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
            boolean z4 = !z && z3;
            this.enabledRendererCount++;
            renderer.enable(rendererConfiguration, formats, readingPeriod.sampleStreams[i], this.rendererPositionUs, z4, z2, readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
            renderer.handleMessage(103, new Renderer.WakeupListener() {
                public void onSleep(long j) {
                    if (j >= 2000) {
                        boolean unused = ExoPlayerImplInternal.this.requestForRendererSleep = true;
                    }
                }

                public void onWakeup() {
                    ExoPlayerImplInternal.this.handler.sendEmptyMessage(2);
                }
            });
            this.mediaClock.onRendererEnabled(renderer);
            if (z3) {
                renderer.start();
            }
        }
    }

    private void handleLoadingMediaPeriodChanged(boolean z) {
        long j;
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.f10040id;
        boolean z2 = !this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (z2) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        if (loadingPeriod == null) {
            j = playbackInfo2.positionUs;
        } else {
            j = loadingPeriod.getBufferedPositionUs();
        }
        playbackInfo2.bufferedPositionUs = j;
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((z2 || z) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private long getTotalBufferedDurationUs(long j) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0;
        }
        return Math.max(0, j - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void updateLoadControlTrackSelection(TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this.loadControl.onTracksSelected(this.renderers, trackGroupArray, trackSelectorResult.selections);
    }

    private boolean shouldPlayWhenReady() {
        return this.playbackInfo.playWhenReady && this.playbackInfo.playbackSuppressionReason == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.ExoPlayerImplInternal.PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(com.google.android.exoplayer2.Timeline r21, com.google.android.exoplayer2.PlaybackInfo r22, com.google.android.exoplayer2.ExoPlayerImplInternal.SeekPosition r23, com.google.android.exoplayer2.MediaPeriodQueue r24, int r25, boolean r26, com.google.android.exoplayer2.Timeline.Window r27, com.google.android.exoplayer2.Timeline.Period r28) {
        /*
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r26
            r11 = r28
            boolean r0 = r21.isEmpty()
            if (r0 == 0) goto L_0x0025
            com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange r0 = new com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = com.google.android.exoplayer2.PlaybackInfo.getDummyPeriodForEmptyTimeline()
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 1
            r9 = 0
            r1 = r0
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        L_0x0025:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r12 = r8.periodId
            java.lang.Object r13 = r12.periodUid
            r14 = r27
            boolean r0 = shouldUseRequestedContentPosition(r8, r11, r14)
            if (r0 == 0) goto L_0x0034
            long r1 = r8.requestedContentPositionUs
            goto L_0x0036
        L_0x0034:
            long r1 = r8.positionUs
        L_0x0036:
            r15 = r1
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            r19 = 0
            r20 = 1
            if (r9 == 0) goto L_0x008d
            r2 = 1
            r0 = r21
            r1 = r23
            r3 = r25
            r4 = r26
            r5 = r27
            r14 = -1
            r6 = r28
            android.util.Pair r0 = resolveSeekPosition(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x005f
            int r0 = r7.getFirstWindowIndex(r10)
            r1 = 0
            r2 = 0
            r3 = 1
            goto L_0x0087
        L_0x005f:
            long r1 = r9.windowPositionUs
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x006f
            java.lang.Object r0 = r0.first
            com.google.android.exoplayer2.Timeline$Period r0 = r7.getPeriodByUid(r0, r11)
            int r6 = r0.windowIndex
            r0 = 0
            goto L_0x007b
        L_0x006f:
            java.lang.Object r13 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r15 = r0.longValue()
            r0 = 1
            r6 = -1
        L_0x007b:
            int r1 = r8.playbackState
            r2 = 4
            if (r1 != r2) goto L_0x0082
            r1 = 1
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            r2 = r1
            r3 = 0
            r1 = r0
            r0 = r6
        L_0x0087:
            r9 = r1
            r6 = r2
            r10 = r3
        L_0x008a:
            r3 = r0
            goto L_0x0104
        L_0x008d:
            r14 = -1
            com.google.android.exoplayer2.Timeline r1 = r8.timeline
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00a0
            int r0 = r7.getFirstWindowIndex(r10)
        L_0x009a:
            r3 = r0
        L_0x009b:
            r6 = 0
            r9 = 0
        L_0x009d:
            r10 = 0
            goto L_0x0104
        L_0x00a0:
            int r1 = r7.getIndexOfPeriod(r13)
            if (r1 != r14) goto L_0x00ca
            com.google.android.exoplayer2.Timeline r5 = r8.timeline
            r0 = r27
            r1 = r28
            r2 = r25
            r3 = r26
            r4 = r13
            r6 = r21
            java.lang.Object r0 = resolveSubsequentPeriod(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00bf
            int r0 = r7.getFirstWindowIndex(r10)
            r3 = 1
            goto L_0x00c6
        L_0x00bf:
            com.google.android.exoplayer2.Timeline$Period r0 = r7.getPeriodByUid(r0, r11)
            int r0 = r0.windowIndex
            r3 = 0
        L_0x00c6:
            r10 = r3
            r6 = 0
            r9 = 0
            goto L_0x008a
        L_0x00ca:
            if (r0 == 0) goto L_0x0102
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00d7
            com.google.android.exoplayer2.Timeline$Period r0 = r7.getPeriodByUid(r13, r11)
            int r0 = r0.windowIndex
            goto L_0x009a
        L_0x00d7:
            com.google.android.exoplayer2.Timeline r0 = r8.timeline
            java.lang.Object r1 = r12.periodUid
            r0.getPeriodByUid(r1, r11)
            long r0 = r28.getPositionInWindowUs()
            long r4 = r15 + r0
            com.google.android.exoplayer2.Timeline$Period r0 = r7.getPeriodByUid(r13, r11)
            int r3 = r0.windowIndex
            r0 = r21
            r1 = r27
            r2 = r28
            android.util.Pair r0 = r0.getPeriodPosition(r1, r2, r3, r4)
            java.lang.Object r13 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r15 = r0.longValue()
            r3 = -1
            r6 = 0
            r9 = 1
            goto L_0x009d
        L_0x0102:
            r3 = -1
            goto L_0x009b
        L_0x0104:
            if (r3 == r14) goto L_0x0125
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r21
            r1 = r27
            r2 = r28
            android.util.Pair r0 = r0.getPeriodPosition(r1, r2, r3, r4)
            java.lang.Object r13 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r15 = r0.longValue()
            r2 = r24
            r0 = r15
            r4 = r17
            goto L_0x0129
        L_0x0125:
            r2 = r24
            r0 = r15
            r4 = r0
        L_0x0129:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r2.resolveMediaPeriodIdForAds(r7, r13, r0)
            int r3 = r2.nextAdGroupIndex
            if (r3 == r14) goto L_0x013e
            int r3 = r12.nextAdGroupIndex
            if (r3 == r14) goto L_0x013c
            int r3 = r2.adGroupIndex
            int r14 = r12.nextAdGroupIndex
            if (r3 < r14) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r3 = 0
            goto L_0x013f
        L_0x013e:
            r3 = 1
        L_0x013f:
            java.lang.Object r14 = r12.periodUid
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x0157
            boolean r13 = r12.isAd()
            if (r13 != 0) goto L_0x0157
            boolean r13 = r2.isAd()
            if (r13 != 0) goto L_0x0157
            if (r3 == 0) goto L_0x0157
            r19 = 1
        L_0x0157:
            if (r19 == 0) goto L_0x015a
            r2 = r12
        L_0x015a:
            boolean r3 = r2.isAd()
            if (r3 == 0) goto L_0x017f
            boolean r0 = r2.equals(r12)
            if (r0 == 0) goto L_0x0169
            long r0 = r8.positionUs
            goto L_0x017f
        L_0x0169:
            java.lang.Object r0 = r2.periodUid
            r7.getPeriodByUid(r0, r11)
            int r0 = r2.adIndexInAdGroup
            int r1 = r2.adGroupIndex
            int r1 = r11.getFirstAdIndexToPlay(r1)
            if (r0 != r1) goto L_0x017d
            long r0 = r28.getAdResumePositionUs()
            goto L_0x017f
        L_0x017d:
            r0 = 0
        L_0x017f:
            r7 = r0
            com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange r11 = new com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange
            r0 = r11
            r1 = r2
            r2 = r7
            r7 = r10
            r8 = r9
            r0.<init>(r1, r2, r4, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.resolvePositionForPlaylistChange(com.google.android.exoplayer2.Timeline, com.google.android.exoplayer2.PlaybackInfo, com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition, com.google.android.exoplayer2.MediaPeriodQueue, int, boolean, com.google.android.exoplayer2.Timeline$Window, com.google.android.exoplayer2.Timeline$Period):com.google.android.exoplayer2.ExoPlayerImplInternal$PositionUpdateForPlaylistChange");
    }

    private static boolean shouldUseRequestedContentPosition(PlaybackInfo playbackInfo2, Timeline.Period period2, Timeline.Window window2) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.periodId;
        Timeline timeline = playbackInfo2.timeline;
        return mediaPeriodId.isAd() || timeline.isEmpty() || timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, period2).windowIndex, window2).isPlaceholder;
    }

    private static boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo, Timeline timeline, Timeline timeline2, int i, boolean z, Timeline.Window window2, Timeline.Period period2) {
        long j;
        PendingMessageInfo pendingMessageInfo2 = pendingMessageInfo;
        Timeline timeline3 = timeline;
        Timeline timeline4 = timeline2;
        Timeline.Window window3 = window2;
        Timeline.Period period3 = period2;
        if (pendingMessageInfo2.resolvedPeriodUid == null) {
            if (pendingMessageInfo2.message.getPositionMs() == Long.MIN_VALUE) {
                j = -9223372036854775807L;
            } else {
                j = C3716C.msToUs(pendingMessageInfo2.message.getPositionMs());
            }
            Pair<Object, Long> resolveSeekPosition = resolveSeekPosition(timeline, new SeekPosition(pendingMessageInfo2.message.getTimeline(), pendingMessageInfo2.message.getWindowIndex(), j), false, i, z, window2, period2);
            if (resolveSeekPosition == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(timeline3.getIndexOfPeriod(resolveSeekPosition.first), ((Long) resolveSeekPosition.second).longValue(), resolveSeekPosition.first);
            if (pendingMessageInfo2.message.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(timeline3, pendingMessageInfo, window3, period3);
            }
            return true;
        }
        int indexOfPeriod = timeline3.getIndexOfPeriod(pendingMessageInfo2.resolvedPeriodUid);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo2.message.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(timeline3, pendingMessageInfo, window3, period3);
            return true;
        }
        pendingMessageInfo2.resolvedPeriodIndex = indexOfPeriod;
        timeline4.getPeriodByUid(pendingMessageInfo2.resolvedPeriodUid, period3);
        if (timeline4.getWindow(period3.windowIndex, window3).isPlaceholder) {
            long positionInWindowUs = pendingMessageInfo2.resolvedPeriodTimeUs + period2.getPositionInWindowUs();
            Pair<Object, Long> periodPosition = timeline.getPeriodPosition(window2, period2, timeline3.getPeriodByUid(pendingMessageInfo2.resolvedPeriodUid, period3).windowIndex, positionInWindowUs);
            pendingMessageInfo.setResolvedPosition(timeline3.getIndexOfPeriod(periodPosition.first), ((Long) periodPosition.second).longValue(), periodPosition.first);
        }
        return true;
    }

    private static void resolvePendingMessageEndOfStreamPosition(Timeline timeline, PendingMessageInfo pendingMessageInfo, Timeline.Window window2, Timeline.Period period2) {
        int i = timeline.getWindow(timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period2).windowIndex, window2).lastPeriodIndex;
        pendingMessageInfo.setResolvedPosition(i, period2.durationUs != -9223372036854775807L ? period2.durationUs - 1 : Long.MAX_VALUE, timeline.getPeriod(i, period2, true).uid);
    }

    private static Pair<Object, Long> resolveSeekPosition(Timeline timeline, SeekPosition seekPosition, boolean z, int i, boolean z2, Timeline.Window window2, Timeline.Period period2) {
        Object resolveSubsequentPeriod;
        Timeline timeline2 = timeline;
        SeekPosition seekPosition2 = seekPosition;
        Timeline.Period period3 = period2;
        Timeline timeline3 = seekPosition2.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        Timeline timeline4 = timeline3.isEmpty() ? timeline2 : timeline3;
        try {
            Pair<Object, Long> periodPosition = timeline4.getPeriodPosition(window2, period2, seekPosition2.windowIndex, seekPosition2.windowPositionUs);
            if (timeline.equals(timeline4)) {
                return periodPosition;
            }
            if (timeline.getIndexOfPeriod(periodPosition.first) != -1) {
                timeline4.getPeriodByUid(periodPosition.first, period3);
                if (!timeline4.getWindow(period3.windowIndex, window2).isPlaceholder) {
                    return periodPosition;
                }
                return timeline.getPeriodPosition(window2, period2, timeline.getPeriodByUid(periodPosition.first, period3).windowIndex, seekPosition2.windowPositionUs);
            }
            Timeline.Window window3 = window2;
            if (z && (resolveSubsequentPeriod = resolveSubsequentPeriod(window2, period2, i, z2, periodPosition.first, timeline4, timeline)) != null) {
                return timeline.getPeriodPosition(window2, period2, timeline.getPeriodByUid(resolveSubsequentPeriod, period3).windowIndex, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    static Object resolveSubsequentPeriod(Timeline.Window window2, Timeline.Period period2, int i, boolean z, Object obj, Timeline timeline, Timeline timeline2) {
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int i2 = indexOfPeriod;
        int i3 = -1;
        for (int i4 = 0; i4 < periodCount && i3 == -1; i4++) {
            i2 = timeline.getNextPeriodIndex(i2, period2, window2, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return timeline2.getUidOfPeriod(i3);
    }

    private static Format[] getFormats(ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = exoTrackSelection.getFormat(i);
        }
        return formatArr;
    }

    private static boolean isRendererEnabled(Renderer renderer) {
        return renderer.getState() != 0;
    }

    private static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline2, int i, long j) {
            this.timeline = timeline2;
            this.windowIndex = i;
            this.windowPositionUs = j;
        }
    }

    private static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j;
            this.requestedContentPositionUs = j2;
            this.forceBufferingState = z;
            this.endPlayback = z2;
            this.setTargetLiveOffset = z3;
        }
    }

    private static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        public void setResolvedPosition(int i, long j, Object obj) {
            this.resolvedPeriodIndex = i;
            this.resolvedPeriodTimeUs = j;
            this.resolvedPeriodUid = obj;
        }

        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            if ((this.resolvedPeriodUid == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                if (this.resolvedPeriodUid != null) {
                    return -1;
                }
                return 1;
            } else if (this.resolvedPeriodUid == null) {
                return 0;
            } else {
                int i = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
                if (i != 0) {
                    return i;
                }
                return Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
            }
        }
    }

    private static final class MediaSourceListUpdateMessage {
        /* access modifiers changed from: private */
        public final List<MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        /* access modifiers changed from: private */
        public final long positionUs;
        /* access modifiers changed from: private */
        public final ShuffleOrder shuffleOrder;
        /* access modifiers changed from: private */
        public final int windowIndex;

        private MediaSourceListUpdateMessage(List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder2, int i, long j) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder2;
            this.windowIndex = i;
            this.positionUs = j;
        }
    }

    private static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i, int i2, int i3, ShuffleOrder shuffleOrder2) {
            this.fromIndex = i;
            this.toIndex = i2;
            this.newFromIndex = i3;
            this.shuffleOrder = shuffleOrder2;
        }
    }
}
