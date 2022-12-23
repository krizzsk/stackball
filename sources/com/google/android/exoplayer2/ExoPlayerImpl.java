package com.google.android.exoplayer2;

import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlayerImplInternal;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ExoPlayerImpl extends BasePlayer implements ExoPlayer {
    private static final String TAG = "ExoPlayerImpl";
    private final AnalyticsCollector analyticsCollector;
    private final Looper applicationLooper;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    final TrackSelectorResult emptyTrackSelectorResult;
    private boolean foregroundMode;
    private boolean hasPendingDiscontinuity;
    private final ExoPlayerImplInternal internalPlayer;
    private final ListenerSet<Player.EventListener, Player.C3723Events> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private final MediaSourceFactory mediaSourceFactory;
    private final List<MediaSourceHolderSnapshot> mediaSourceHolderSnapshots;
    private boolean pauseAtEndOfMediaItems;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private int pendingPlayWhenReadyChangeReason;
    private final Timeline.Period period;
    private PlaybackInfo playbackInfo;
    private final HandlerWrapper playbackInfoUpdateHandler;
    private final ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Renderer[] renderers;
    private int repeatMode;
    private SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private ShuffleOrder shuffleOrder;
    private final TrackSelector trackSelector;
    private final boolean useLazyPreparation;

    public Player.AudioComponent getAudioComponent() {
        return null;
    }

    public Player.DeviceComponent getDeviceComponent() {
        return null;
    }

    public Player.MetadataComponent getMetadataComponent() {
        return null;
    }

    public Player.TextComponent getTextComponent() {
        return null;
    }

    public Player.VideoComponent getVideoComponent() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r33v0, types: [com.google.android.exoplayer2.Player] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoPlayerImpl(com.google.android.exoplayer2.Renderer[] r19, com.google.android.exoplayer2.trackselection.TrackSelector r20, com.google.android.exoplayer2.source.MediaSourceFactory r21, com.google.android.exoplayer2.LoadControl r22, com.google.android.exoplayer2.upstream.BandwidthMeter r23, com.google.android.exoplayer2.analytics.AnalyticsCollector r24, boolean r25, com.google.android.exoplayer2.SeekParameters r26, com.google.android.exoplayer2.LivePlaybackSpeedControl r27, long r28, boolean r30, com.google.android.exoplayer2.util.Clock r31, android.os.Looper r32, com.google.android.exoplayer2.Player r33) {
        /*
            r18 = this;
            r0 = r18
            r2 = r19
            r6 = r23
            r9 = r24
            r15 = r31
            r14 = r32
            r18.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Init "
            r1.append(r3)
            int r3 = java.lang.System.identityHashCode(r18)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = " ["
            r1.append(r3)
            java.lang.String r3 = "ExoPlayerLib/2.13.3"
            r1.append(r3)
            java.lang.String r3 = "] ["
            r1.append(r3)
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.DEVICE_DEBUG_INFO
            r1.append(r3)
            java.lang.String r3 = "]"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ExoPlayerImpl"
            com.google.android.exoplayer2.util.Log.m9245i(r3, r1)
            int r1 = r2.length
            r3 = 0
            if (r1 <= 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r19)
            com.google.android.exoplayer2.Renderer[] r1 = (com.google.android.exoplayer2.Renderer[]) r1
            r0.renderers = r1
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r20)
            com.google.android.exoplayer2.trackselection.TrackSelector r1 = (com.google.android.exoplayer2.trackselection.TrackSelector) r1
            r0.trackSelector = r1
            r1 = r21
            r0.mediaSourceFactory = r1
            r0.bandwidthMeter = r6
            r0.analyticsCollector = r9
            r1 = r25
            r0.useLazyPreparation = r1
            r10 = r26
            r0.seekParameters = r10
            r12 = r30
            r0.pauseAtEndOfMediaItems = r12
            r0.applicationLooper = r14
            r0.clock = r15
            r0.repeatMode = r3
            if (r33 == 0) goto L_0x007f
            r1 = r33
            goto L_0x0080
        L_0x007f:
            r1 = r0
        L_0x0080:
            com.google.android.exoplayer2.util.ListenerSet r4 = new com.google.android.exoplayer2.util.ListenerSet
            com.google.android.exoplayer2.-$$Lambda$Y25dpL_yMnUiNhc4TOMUnLpZGCU r5 = com.google.android.exoplayer2.$$Lambda$Y25dpL_yMnUiNhc4TOMUnLpZGCU.INSTANCE
            com.google.android.exoplayer2.-$$Lambda$ExoPlayerImpl$M1tdaLlAUPJUvzD-hsod_P0qbdk r7 = new com.google.android.exoplayer2.-$$Lambda$ExoPlayerImpl$M1tdaLlAUPJUvzD-hsod_P0qbdk
            r7.<init>()
            r4.<init>(r14, r15, r5, r7)
            r0.listeners = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.mediaSourceHolderSnapshots = r4
            com.google.android.exoplayer2.source.ShuffleOrder$DefaultShuffleOrder r4 = new com.google.android.exoplayer2.source.ShuffleOrder$DefaultShuffleOrder
            r4.<init>(r3)
            r0.shuffleOrder = r4
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r3 = new com.google.android.exoplayer2.trackselection.TrackSelectorResult
            int r4 = r2.length
            com.google.android.exoplayer2.RendererConfiguration[] r4 = new com.google.android.exoplayer2.RendererConfiguration[r4]
            int r5 = r2.length
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] r5 = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[r5]
            r7 = 0
            r3.<init>(r4, r5, r7)
            r0.emptyTrackSelectorResult = r3
            com.google.android.exoplayer2.Timeline$Period r3 = new com.google.android.exoplayer2.Timeline$Period
            r3.<init>()
            r0.period = r3
            r3 = -1
            r0.maskingWindowIndex = r3
            com.google.android.exoplayer2.util.HandlerWrapper r3 = r15.createHandler(r14, r7)
            r0.playbackInfoUpdateHandler = r3
            com.google.android.exoplayer2.-$$Lambda$ExoPlayerImpl$JP2tKdyDgPDo0qQLjajOiOBV3jA r3 = new com.google.android.exoplayer2.-$$Lambda$ExoPlayerImpl$JP2tKdyDgPDo0qQLjajOiOBV3jA
            r3.<init>()
            r0.playbackInfoUpdateListener = r3
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r3 = r0.emptyTrackSelectorResult
            com.google.android.exoplayer2.PlaybackInfo r3 = com.google.android.exoplayer2.PlaybackInfo.createDummy(r3)
            r0.playbackInfo = r3
            if (r9 == 0) goto L_0x00d9
            r9.setPlayer(r1, r14)
            r0.addListener(r9)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r14)
            r6.addEventListener(r1, r9)
        L_0x00d9:
            com.google.android.exoplayer2.ExoPlayerImplInternal r13 = new com.google.android.exoplayer2.ExoPlayerImplInternal
            r1 = r13
            com.google.android.exoplayer2.trackselection.TrackSelectorResult r4 = r0.emptyTrackSelectorResult
            int r7 = r0.repeatMode
            boolean r8 = r0.shuffleModeEnabled
            com.google.android.exoplayer2.ExoPlayerImplInternal$PlaybackInfoUpdateListener r3 = r0.playbackInfoUpdateListener
            r17 = r3
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            r10 = r26
            r11 = r27
            r0 = r13
            r12 = r28
            r14 = r30
            r15 = r32
            r16 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            r1 = r0
            r0 = r18
            r0.internalPlayer = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImpl.<init>(com.google.android.exoplayer2.Renderer[], com.google.android.exoplayer2.trackselection.TrackSelector, com.google.android.exoplayer2.source.MediaSourceFactory, com.google.android.exoplayer2.LoadControl, com.google.android.exoplayer2.upstream.BandwidthMeter, com.google.android.exoplayer2.analytics.AnalyticsCollector, boolean, com.google.android.exoplayer2.SeekParameters, com.google.android.exoplayer2.LivePlaybackSpeedControl, long, boolean, com.google.android.exoplayer2.util.Clock, android.os.Looper, com.google.android.exoplayer2.Player):void");
    }

    public /* synthetic */ void lambda$new$2$ExoPlayerImpl(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.playbackInfoUpdateHandler.post(new Runnable(playbackInfoUpdate) {
            public final /* synthetic */ ExoPlayerImplInternal.PlaybackInfoUpdate f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ExoPlayerImpl.this.lambda$new$1$ExoPlayerImpl(this.f$1);
            }
        });
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.internalPlayer.experimentalSetForegroundModeTimeoutMs(j);
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
        this.internalPlayer.experimentalSetOffloadSchedulingEnabled(z);
    }

    public boolean experimentalIsSleepingForOffload() {
        return this.playbackInfo.sleepingForOffload;
    }

    public Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    public Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    public Clock getClock() {
        return this.clock;
    }

    public void addListener(Player.EventListener eventListener) {
        this.listeners.add(eventListener);
    }

    public void removeListener(Player.EventListener eventListener) {
        this.listeners.remove(eventListener);
    }

    public int getPlaybackState() {
        return this.playbackInfo.playbackState;
    }

    public int getPlaybackSuppressionReason() {
        return this.playbackInfo.playbackSuppressionReason;
    }

    @Deprecated
    public ExoPlaybackException getPlaybackError() {
        return getPlayerError();
    }

    public ExoPlaybackException getPlayerError() {
        return this.playbackInfo.playbackError;
    }

    @Deprecated
    public void retry() {
        prepare();
    }

    public void prepare() {
        if (this.playbackInfo.playbackState == 1) {
            PlaybackInfo copyWithPlaybackError = this.playbackInfo.copyWithPlaybackError((ExoPlaybackException) null);
            PlaybackInfo copyWithPlaybackState = copyWithPlaybackError.copyWithPlaybackState(copyWithPlaybackError.timeline.isEmpty() ? 4 : 2);
            this.pendingOperationAcks++;
            this.internalPlayer.prepare();
            updatePlaybackInfo(copyWithPlaybackState, false, 4, 1, 1, false);
        }
    }

    @Deprecated
    public void prepare(MediaSource mediaSource) {
        setMediaSource(mediaSource);
        prepare();
    }

    @Deprecated
    public void prepare(MediaSource mediaSource, boolean z, boolean z2) {
        setMediaSource(mediaSource, z);
        prepare();
    }

    public void setMediaItems(List<MediaItem> list, boolean z) {
        setMediaSources(createMediaSources(list), z);
    }

    public void setMediaItems(List<MediaItem> list, int i, long j) {
        setMediaSources(createMediaSources(list), i, j);
    }

    public void setMediaSource(MediaSource mediaSource) {
        setMediaSources(Collections.singletonList(mediaSource));
    }

    public void setMediaSource(MediaSource mediaSource, long j) {
        setMediaSources(Collections.singletonList(mediaSource), 0, j);
    }

    public void setMediaSource(MediaSource mediaSource, boolean z) {
        setMediaSources(Collections.singletonList(mediaSource), z);
    }

    public void setMediaSources(List<MediaSource> list) {
        setMediaSources(list, true);
    }

    public void setMediaSources(List<MediaSource> list, boolean z) {
        setMediaSourcesInternal(list, -1, -9223372036854775807L, z);
    }

    public void setMediaSources(List<MediaSource> list, int i, long j) {
        setMediaSourcesInternal(list, i, j, false);
    }

    public void addMediaItems(List<MediaItem> list) {
        addMediaItems(this.mediaSourceHolderSnapshots.size(), list);
    }

    public void addMediaItems(int i, List<MediaItem> list) {
        addMediaSources(i, createMediaSources(list));
    }

    public void addMediaSource(MediaSource mediaSource) {
        addMediaSources(Collections.singletonList(mediaSource));
    }

    public void addMediaSource(int i, MediaSource mediaSource) {
        addMediaSources(i, Collections.singletonList(mediaSource));
    }

    public void addMediaSources(List<MediaSource> list) {
        addMediaSources(this.mediaSourceHolderSnapshots.size(), list);
    }

    public void addMediaSources(int i, List<MediaSource> list) {
        Assertions.checkArgument(i >= 0);
        Timeline currentTimeline = getCurrentTimeline();
        this.pendingOperationAcks++;
        List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders = addMediaSourceHolders(i, list);
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionAfterTimelineChanged(currentTimeline, createMaskingTimeline));
        this.internalPlayer.addMediaSources(i, addMediaSourceHolders, this.shuffleOrder);
        updatePlaybackInfo(maskTimelineAndPosition, false, 4, 0, 1, false);
    }

    public void removeMediaItems(int i, int i2) {
        updatePlaybackInfo(removeMediaItemsInternal(i, i2), false, 4, 0, 1, false);
    }

    public void moveMediaItems(int i, int i2, int i3) {
        Assertions.checkArgument(i >= 0 && i <= i2 && i2 <= this.mediaSourceHolderSnapshots.size() && i3 >= 0);
        Timeline currentTimeline = getCurrentTimeline();
        this.pendingOperationAcks++;
        int min = Math.min(i3, this.mediaSourceHolderSnapshots.size() - (i2 - i));
        Util.moveItems(this.mediaSourceHolderSnapshots, i, i2, min);
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionAfterTimelineChanged(currentTimeline, createMaskingTimeline));
        this.internalPlayer.moveMediaSources(i, i2, min, this.shuffleOrder);
        updatePlaybackInfo(maskTimelineAndPosition, false, 4, 0, 1, false);
    }

    public void clearMediaItems() {
        removeMediaItems(0, this.mediaSourceHolderSnapshots.size());
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder2) {
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionOrMaskWindowPosition(createMaskingTimeline, getCurrentWindowIndex(), getCurrentPosition()));
        this.pendingOperationAcks++;
        this.shuffleOrder = shuffleOrder2;
        this.internalPlayer.setShuffleOrder(shuffleOrder2);
        updatePlaybackInfo(maskTimelineAndPosition, false, 4, 0, 1, false);
    }

    public void setPlayWhenReady(boolean z) {
        setPlayWhenReady(z, 0, 1);
    }

    public void setPauseAtEndOfMediaItems(boolean z) {
        if (this.pauseAtEndOfMediaItems != z) {
            this.pauseAtEndOfMediaItems = z;
            this.internalPlayer.setPauseAtEndOfWindow(z);
        }
    }

    public boolean getPauseAtEndOfMediaItems() {
        return this.pauseAtEndOfMediaItems;
    }

    public void setPlayWhenReady(boolean z, int i, int i2) {
        if (this.playbackInfo.playWhenReady != z || this.playbackInfo.playbackSuppressionReason != i) {
            this.pendingOperationAcks++;
            PlaybackInfo copyWithPlayWhenReady = this.playbackInfo.copyWithPlayWhenReady(z, i);
            this.internalPlayer.setPlayWhenReady(z, i);
            updatePlaybackInfo(copyWithPlayWhenReady, false, 4, 0, i2, false);
        }
    }

    public boolean getPlayWhenReady() {
        return this.playbackInfo.playWhenReady;
    }

    public void setRepeatMode(int i) {
        if (this.repeatMode != i) {
            this.repeatMode = i;
            this.internalPlayer.setRepeatMode(i);
            this.listeners.sendEvent(9, new ListenerSet.Event(i) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onRepeatModeChanged(this.f$0);
                }
            });
        }
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    public void setShuffleModeEnabled(boolean z) {
        if (this.shuffleModeEnabled != z) {
            this.shuffleModeEnabled = z;
            this.internalPlayer.setShuffleModeEnabled(z);
            this.listeners.sendEvent(10, new ListenerSet.Event(z) {
                public final /* synthetic */ boolean f$0;

                {
                    this.f$0 = r1;
                }

                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onShuffleModeEnabledChanged(this.f$0);
                }
            });
        }
    }

    public boolean getShuffleModeEnabled() {
        return this.shuffleModeEnabled;
    }

    public boolean isLoading() {
        return this.playbackInfo.isLoading;
    }

    public void seekTo(int i, long j) {
        Timeline timeline = this.playbackInfo.timeline;
        if (i < 0 || (!timeline.isEmpty() && i >= timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(timeline, i, j);
        }
        int i2 = 1;
        this.pendingOperationAcks++;
        if (isPlayingAd()) {
            Log.m9247w(TAG, "seekTo ignored because an ad is playing");
            ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
            playbackInfoUpdate.incrementPendingOperationAcks(1);
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(playbackInfoUpdate);
            return;
        }
        if (getPlaybackState() != 1) {
            i2 = 2;
        }
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo.copyWithPlaybackState(i2), timeline, getPeriodPositionOrMaskWindowPosition(timeline, i, j));
        this.internalPlayer.seekTo(timeline, i, C3716C.msToUs(j));
        updatePlaybackInfo(maskTimelineAndPosition, true, 1, 0, 1, true);
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        if (!this.playbackInfo.playbackParameters.equals(playbackParameters)) {
            PlaybackInfo copyWithPlaybackParameters = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
            this.pendingOperationAcks++;
            this.internalPlayer.setPlaybackParameters(playbackParameters);
            updatePlaybackInfo(copyWithPlaybackParameters, false, 4, 0, 1, false);
        }
    }

    public PlaybackParameters getPlaybackParameters() {
        return this.playbackInfo.playbackParameters;
    }

    public void setSeekParameters(SeekParameters seekParameters2) {
        if (seekParameters2 == null) {
            seekParameters2 = SeekParameters.DEFAULT;
        }
        if (!this.seekParameters.equals(seekParameters2)) {
            this.seekParameters = seekParameters2;
            this.internalPlayer.setSeekParameters(seekParameters2);
        }
    }

    public SeekParameters getSeekParameters() {
        return this.seekParameters;
    }

    public void setForegroundMode(boolean z) {
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (!this.internalPlayer.setForegroundMode(z)) {
                stop(false, ExoPlaybackException.createForRenderer(new ExoTimeoutException(2)));
            }
        }
    }

    public void stop(boolean z) {
        stop(z, (ExoPlaybackException) null);
    }

    public void stop(boolean z, ExoPlaybackException exoPlaybackException) {
        PlaybackInfo playbackInfo2;
        if (z) {
            playbackInfo2 = removeMediaItemsInternal(0, this.mediaSourceHolderSnapshots.size()).copyWithPlaybackError((ExoPlaybackException) null);
        } else {
            PlaybackInfo playbackInfo3 = this.playbackInfo;
            playbackInfo2 = playbackInfo3.copyWithLoadingMediaPeriodId(playbackInfo3.periodId);
            playbackInfo2.bufferedPositionUs = playbackInfo2.positionUs;
            playbackInfo2.totalBufferedDurationUs = 0;
        }
        PlaybackInfo copyWithPlaybackState = playbackInfo2.copyWithPlaybackState(1);
        if (exoPlaybackException != null) {
            copyWithPlaybackState = copyWithPlaybackState.copyWithPlaybackError(exoPlaybackException);
        }
        this.pendingOperationAcks++;
        this.internalPlayer.stop();
        updatePlaybackInfo(copyWithPlaybackState, false, 4, 0, 1, false);
    }

    public void release() {
        Log.m9245i(TAG, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + ExoPlayerLibraryInfo.VERSION_SLASHY + "] [" + Util.DEVICE_DEBUG_INFO + "] [" + ExoPlayerLibraryInfo.registeredModules() + "]");
        if (!this.internalPlayer.release()) {
            this.listeners.sendEvent(11, $$Lambda$ExoPlayerImpl$KOvTAObvT_F_h8dMHR1N2O8QgrE.INSTANCE);
        }
        this.listeners.release();
        this.playbackInfoUpdateHandler.removeCallbacksAndMessages((Object) null);
        AnalyticsCollector analyticsCollector2 = this.analyticsCollector;
        if (analyticsCollector2 != null) {
            this.bandwidthMeter.removeEventListener(analyticsCollector2);
        }
        PlaybackInfo copyWithPlaybackState = this.playbackInfo.copyWithPlaybackState(1);
        this.playbackInfo = copyWithPlaybackState;
        PlaybackInfo copyWithLoadingMediaPeriodId = copyWithPlaybackState.copyWithLoadingMediaPeriodId(copyWithPlaybackState.periodId);
        this.playbackInfo = copyWithLoadingMediaPeriodId;
        copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
        this.playbackInfo.totalBufferedDurationUs = 0;
    }

    public PlayerMessage createMessage(PlayerMessage.Target target) {
        return new PlayerMessage(this.internalPlayer, target, this.playbackInfo.timeline, getCurrentWindowIndex(), this.clock, this.internalPlayer.getPlaybackLooper());
    }

    public int getCurrentPeriodIndex() {
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingPeriodIndex;
        }
        return this.playbackInfo.timeline.getIndexOfPeriod(this.playbackInfo.periodId.periodUid);
    }

    public int getCurrentWindowIndex() {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal();
        if (currentWindowIndexInternal == -1) {
            return 0;
        }
        return currentWindowIndexInternal;
    }

    public long getDuration() {
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
        this.playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return C3716C.usToMs(this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
    }

    public long getCurrentPosition() {
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowPositionMs;
        }
        if (this.playbackInfo.periodId.isAd()) {
            return C3716C.usToMs(this.playbackInfo.positionUs);
        }
        return periodPositionUsToWindowPositionMs(this.playbackInfo.periodId, this.playbackInfo.positionUs);
    }

    public long getBufferedPosition() {
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        if (this.playbackInfo.loadingMediaPeriodId.equals(this.playbackInfo.periodId)) {
            return C3716C.usToMs(this.playbackInfo.bufferedPositionUs);
        }
        return getDuration();
    }

    public long getTotalBufferedDuration() {
        return C3716C.usToMs(this.playbackInfo.totalBufferedDurationUs);
    }

    public boolean isPlayingAd() {
        return this.playbackInfo.periodId.isAd();
    }

    public int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    public int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    public long getContentPosition() {
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        this.playbackInfo.timeline.getPeriodByUid(this.playbackInfo.periodId.periodUid, this.period);
        if (this.playbackInfo.requestedContentPositionUs == -9223372036854775807L) {
            return this.playbackInfo.timeline.getWindow(getCurrentWindowIndex(), this.window).getDefaultPositionMs();
        }
        return this.period.getPositionInWindowMs() + C3716C.usToMs(this.playbackInfo.requestedContentPositionUs);
    }

    public long getContentBufferedPosition() {
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowPositionMs;
        }
        if (this.playbackInfo.loadingMediaPeriodId.windowSequenceNumber != this.playbackInfo.periodId.windowSequenceNumber) {
            return this.playbackInfo.timeline.getWindow(getCurrentWindowIndex(), this.window).getDurationMs();
        }
        long j = this.playbackInfo.bufferedPositionUs;
        if (this.playbackInfo.loadingMediaPeriodId.isAd()) {
            Timeline.Period periodByUid = this.playbackInfo.timeline.getPeriodByUid(this.playbackInfo.loadingMediaPeriodId.periodUid, this.period);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.playbackInfo.loadingMediaPeriodId.adGroupIndex);
            j = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.durationUs : adGroupTimeUs;
        }
        return periodPositionUsToWindowPositionMs(this.playbackInfo.loadingMediaPeriodId, j);
    }

    public int getRendererCount() {
        return this.renderers.length;
    }

    public int getRendererType(int i) {
        return this.renderers[i].getTrackType();
    }

    public TrackSelector getTrackSelector() {
        return this.trackSelector;
    }

    public TrackGroupArray getCurrentTrackGroups() {
        return this.playbackInfo.trackGroups;
    }

    public TrackSelectionArray getCurrentTrackSelections() {
        return new TrackSelectionArray(this.playbackInfo.trackSelectorResult.selections);
    }

    public List<Metadata> getCurrentStaticMetadata() {
        return this.playbackInfo.staticMetadata;
    }

    public Timeline getCurrentTimeline() {
        return this.playbackInfo.timeline;
    }

    private int getCurrentWindowIndexInternal() {
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowIndex;
        }
        return this.playbackInfo.timeline.getPeriodByUid(this.playbackInfo.periodId.periodUid, this.period).windowIndex;
    }

    private List<MediaSource> createMediaSources(List<MediaItem> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.mediaSourceFactory.createMediaSource(list.get(i)));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: handlePlaybackInfo */
    public void lambda$new$1$ExoPlayerImpl(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.pendingOperationAcks -= playbackInfoUpdate.operationAcks;
        boolean z = true;
        if (playbackInfoUpdate.positionDiscontinuity) {
            this.hasPendingDiscontinuity = true;
            this.pendingDiscontinuityReason = playbackInfoUpdate.discontinuityReason;
        }
        if (playbackInfoUpdate.hasPlayWhenReadyChangeReason) {
            this.pendingPlayWhenReadyChangeReason = playbackInfoUpdate.playWhenReadyChangeReason;
        }
        if (this.pendingOperationAcks == 0) {
            Timeline timeline = playbackInfoUpdate.playbackInfo.timeline;
            if (!this.playbackInfo.timeline.isEmpty() && timeline.isEmpty()) {
                this.maskingWindowIndex = -1;
                this.maskingWindowPositionMs = 0;
                this.maskingPeriodIndex = 0;
            }
            if (!timeline.isEmpty()) {
                List<Timeline> childTimelines = ((PlaylistTimeline) timeline).getChildTimelines();
                if (childTimelines.size() != this.mediaSourceHolderSnapshots.size()) {
                    z = false;
                }
                Assertions.checkState(z);
                for (int i = 0; i < childTimelines.size(); i++) {
                    Timeline unused = this.mediaSourceHolderSnapshots.get(i).timeline = childTimelines.get(i);
                }
            }
            boolean z2 = this.hasPendingDiscontinuity;
            this.hasPendingDiscontinuity = false;
            updatePlaybackInfo(playbackInfoUpdate.playbackInfo, z2, this.pendingDiscontinuityReason, 1, this.pendingPlayWhenReadyChangeReason, false);
        }
    }

    private void updatePlaybackInfo(PlaybackInfo playbackInfo2, boolean z, int i, int i2, int i3, boolean z2) {
        MediaItem mediaItem;
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        this.playbackInfo = playbackInfo2;
        Pair<Boolean, Integer> evaluateMediaItemTransitionReason = evaluateMediaItemTransitionReason(playbackInfo2, playbackInfo3, z, i, !playbackInfo3.timeline.equals(playbackInfo2.timeline));
        boolean booleanValue = ((Boolean) evaluateMediaItemTransitionReason.first).booleanValue();
        int intValue = ((Integer) evaluateMediaItemTransitionReason.second).intValue();
        if (!playbackInfo3.timeline.equals(playbackInfo2.timeline)) {
            this.listeners.queueEvent(0, new ListenerSet.Event(i2) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onTimelineChanged(PlaybackInfo.this.timeline, this.f$1);
                }
            });
        }
        if (z) {
            this.listeners.queueEvent(12, new ListenerSet.Event(i) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onPositionDiscontinuity(this.f$0);
                }
            });
        }
        if (booleanValue) {
            if (!playbackInfo2.timeline.isEmpty()) {
                mediaItem = playbackInfo2.timeline.getWindow(playbackInfo2.timeline.getPeriodByUid(playbackInfo2.periodId.periodUid, this.period).windowIndex, this.window).mediaItem;
            } else {
                mediaItem = null;
            }
            this.listeners.queueEvent(1, new ListenerSet.Event(intValue) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onMediaItemTransition(MediaItem.this, this.f$1);
                }
            });
        }
        if (!(playbackInfo3.playbackError == playbackInfo2.playbackError || playbackInfo2.playbackError == null)) {
            this.listeners.queueEvent(11, new ListenerSet.Event() {
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onPlayerError(PlaybackInfo.this.playbackError);
                }
            });
        }
        if (playbackInfo3.trackSelectorResult != playbackInfo2.trackSelectorResult) {
            this.trackSelector.onSelectionActivated(playbackInfo2.trackSelectorResult.info);
            this.listeners.queueEvent(2, new ListenerSet.Event(new TrackSelectionArray(playbackInfo2.trackSelectorResult.selections)) {
                public final /* synthetic */ TrackSelectionArray f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onTracksChanged(PlaybackInfo.this.trackGroups, this.f$1);
                }
            });
        }
        if (!playbackInfo3.staticMetadata.equals(playbackInfo2.staticMetadata)) {
            this.listeners.queueEvent(3, new ListenerSet.Event() {
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onStaticMetadataChanged(PlaybackInfo.this.staticMetadata);
                }
            });
        }
        if (playbackInfo3.isLoading != playbackInfo2.isLoading) {
            this.listeners.queueEvent(4, new ListenerSet.Event() {
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onIsLoadingChanged(PlaybackInfo.this.isLoading);
                }
            });
        }
        if (!(playbackInfo3.playbackState == playbackInfo2.playbackState && playbackInfo3.playWhenReady == playbackInfo2.playWhenReady)) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() {
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onPlayerStateChanged(PlaybackInfo.this.playWhenReady, PlaybackInfo.this.playbackState);
                }
            });
        }
        if (playbackInfo3.playbackState != playbackInfo2.playbackState) {
            this.listeners.queueEvent(5, new ListenerSet.Event() {
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onPlaybackStateChanged(PlaybackInfo.this.playbackState);
                }
            });
        }
        if (playbackInfo3.playWhenReady != playbackInfo2.playWhenReady) {
            this.listeners.queueEvent(6, new ListenerSet.Event(i3) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onPlayWhenReadyChanged(PlaybackInfo.this.playWhenReady, this.f$1);
                }
            });
        }
        if (playbackInfo3.playbackSuppressionReason != playbackInfo2.playbackSuppressionReason) {
            this.listeners.queueEvent(7, new ListenerSet.Event() {
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onPlaybackSuppressionReasonChanged(PlaybackInfo.this.playbackSuppressionReason);
                }
            });
        }
        if (isPlaying(playbackInfo3) != isPlaying(playbackInfo2)) {
            this.listeners.queueEvent(8, new ListenerSet.Event() {
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onIsPlayingChanged(ExoPlayerImpl.isPlaying(PlaybackInfo.this));
                }
            });
        }
        if (!playbackInfo3.playbackParameters.equals(playbackInfo2.playbackParameters)) {
            this.listeners.queueEvent(13, new ListenerSet.Event() {
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onPlaybackParametersChanged(PlaybackInfo.this.playbackParameters);
                }
            });
        }
        if (z2) {
            this.listeners.queueEvent(-1, $$Lambda$IvHsGgCxoxdxsyZUtt2N2KRx2jA.INSTANCE);
        }
        if (playbackInfo3.offloadSchedulingEnabled != playbackInfo2.offloadSchedulingEnabled) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() {
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onExperimentalOffloadSchedulingEnabledChanged(PlaybackInfo.this.offloadSchedulingEnabled);
                }
            });
        }
        if (playbackInfo3.sleepingForOffload != playbackInfo2.sleepingForOffload) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() {
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onExperimentalSleepingForOffloadChanged(PlaybackInfo.this.sleepingForOffload);
                }
            });
        }
        this.listeners.flushEvents();
    }

    private Pair<Boolean, Integer> evaluateMediaItemTransitionReason(PlaybackInfo playbackInfo2, PlaybackInfo playbackInfo3, boolean z, int i, boolean z2) {
        Timeline timeline = playbackInfo3.timeline;
        Timeline timeline2 = playbackInfo2.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return new Pair<>(false, -1);
        }
        int i2 = 3;
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return new Pair<>(true, 3);
        }
        Object obj = timeline.getWindow(timeline.getPeriodByUid(playbackInfo3.periodId.periodUid, this.period).windowIndex, this.window).uid;
        Object obj2 = timeline2.getWindow(timeline2.getPeriodByUid(playbackInfo2.periodId.periodUid, this.period).windowIndex, this.window).uid;
        int i3 = this.window.firstPeriodIndex;
        if (!obj.equals(obj2)) {
            if (z && i == 0) {
                i2 = 1;
            } else if (z && i == 1) {
                i2 = 2;
            } else if (!z2) {
                throw new IllegalStateException();
            }
            return new Pair<>(true, Integer.valueOf(i2));
        } else if (z && i == 0 && timeline2.getIndexOfPeriod(playbackInfo2.periodId.periodUid) == i3) {
            return new Pair<>(true, 0);
        } else {
            return new Pair<>(false, -1);
        }
    }

    private void setMediaSourcesInternal(List<MediaSource> list, int i, long j, boolean z) {
        int i2 = i;
        int currentWindowIndexInternal = getCurrentWindowIndexInternal();
        long currentPosition = getCurrentPosition();
        this.pendingOperationAcks++;
        if (!this.mediaSourceHolderSnapshots.isEmpty()) {
            removeMediaSourceHolders(0, this.mediaSourceHolderSnapshots.size());
        }
        List<MediaSource> list2 = list;
        List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders = addMediaSourceHolders(0, list);
        Timeline createMaskingTimeline = createMaskingTimeline();
        if (createMaskingTimeline.isEmpty() || i2 < createMaskingTimeline.getWindowCount()) {
            long j2 = j;
            if (z) {
                i2 = createMaskingTimeline.getFirstWindowIndex(this.shuffleModeEnabled);
                j2 = -9223372036854775807L;
            } else if (i2 == -1) {
                i2 = currentWindowIndexInternal;
                j2 = currentPosition;
            }
            PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionOrMaskWindowPosition(createMaskingTimeline, i2, j2));
            int i3 = maskTimelineAndPosition.playbackState;
            if (!(i2 == -1 || maskTimelineAndPosition.playbackState == 1)) {
                i3 = (createMaskingTimeline.isEmpty() || i2 >= createMaskingTimeline.getWindowCount()) ? 4 : 2;
            }
            PlaybackInfo copyWithPlaybackState = maskTimelineAndPosition.copyWithPlaybackState(i3);
            this.internalPlayer.setMediaSources(addMediaSourceHolders, i2, C3716C.msToUs(j2), this.shuffleOrder);
            updatePlaybackInfo(copyWithPlaybackState, false, 4, 0, 1, false);
            return;
        }
        throw new IllegalSeekPositionException(createMaskingTimeline, i2, j);
    }

    private List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders(int i, List<MediaSource> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder(list.get(i2), this.useLazyPreparation);
            arrayList.add(mediaSourceHolder);
            this.mediaSourceHolderSnapshots.add(i2 + i, new MediaSourceHolderSnapshot(mediaSourceHolder.uid, mediaSourceHolder.mediaSource.getTimeline()));
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndInsert(i, arrayList.size());
        return arrayList;
    }

    private PlaybackInfo removeMediaItemsInternal(int i, int i2) {
        boolean z = false;
        Assertions.checkArgument(i >= 0 && i2 >= i && i2 <= this.mediaSourceHolderSnapshots.size());
        int currentWindowIndex = getCurrentWindowIndex();
        Timeline currentTimeline = getCurrentTimeline();
        int size = this.mediaSourceHolderSnapshots.size();
        this.pendingOperationAcks++;
        removeMediaSourceHolders(i, i2);
        Timeline createMaskingTimeline = createMaskingTimeline();
        PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionAfterTimelineChanged(currentTimeline, createMaskingTimeline));
        if (maskTimelineAndPosition.playbackState != 1 && maskTimelineAndPosition.playbackState != 4 && i < i2 && i2 == size && currentWindowIndex >= maskTimelineAndPosition.timeline.getWindowCount()) {
            z = true;
        }
        if (z) {
            maskTimelineAndPosition = maskTimelineAndPosition.copyWithPlaybackState(4);
        }
        this.internalPlayer.removeMediaSources(i, i2, this.shuffleOrder);
        return maskTimelineAndPosition;
    }

    private void removeMediaSourceHolders(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.mediaSourceHolderSnapshots.remove(i3);
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i, i2);
    }

    private Timeline createMaskingTimeline() {
        return new PlaylistTimeline(this.mediaSourceHolderSnapshots, this.shuffleOrder);
    }

    private PlaybackInfo maskTimelineAndPosition(PlaybackInfo playbackInfo2, Timeline timeline, Pair<Object, Long> pair) {
        List list;
        int i;
        long j;
        Timeline timeline2 = timeline;
        Pair<Object, Long> pair2 = pair;
        Assertions.checkArgument(timeline.isEmpty() || pair2 != null);
        Timeline timeline3 = playbackInfo2.timeline;
        PlaybackInfo copyWithTimeline = playbackInfo2.copyWithTimeline(timeline);
        if (timeline.isEmpty()) {
            MediaSource.MediaPeriodId dummyPeriodForEmptyTimeline = PlaybackInfo.getDummyPeriodForEmptyTimeline();
            PlaybackInfo copyWithLoadingMediaPeriodId = copyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, C3716C.msToUs(this.maskingWindowPositionMs), C3716C.msToUs(this.maskingWindowPositionMs), 0, TrackGroupArray.EMPTY, this.emptyTrackSelectorResult, ImmutableList.m9346of()).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
            return copyWithLoadingMediaPeriodId;
        }
        Object obj = copyWithTimeline.periodId.periodUid;
        boolean z = !obj.equals(((Pair) Util.castNonNull(pair)).first);
        MediaSource.MediaPeriodId mediaPeriodId = z ? new MediaSource.MediaPeriodId(pair2.first) : copyWithTimeline.periodId;
        long longValue = ((Long) pair2.second).longValue();
        long msToUs = C3716C.msToUs(getContentPosition());
        if (!timeline3.isEmpty()) {
            msToUs -= timeline3.getPeriodByUid(obj, this.period).getPositionInWindowUs();
        }
        if (z || longValue < msToUs) {
            MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
            Assertions.checkState(!mediaPeriodId2.isAd());
            TrackGroupArray trackGroupArray = z ? TrackGroupArray.EMPTY : copyWithTimeline.trackGroups;
            TrackSelectorResult trackSelectorResult = z ? this.emptyTrackSelectorResult : copyWithTimeline.trackSelectorResult;
            if (z) {
                list = ImmutableList.m9346of();
            } else {
                list = copyWithTimeline.staticMetadata;
            }
            PlaybackInfo copyWithLoadingMediaPeriodId2 = copyWithTimeline.copyWithNewPosition(mediaPeriodId2, longValue, longValue, 0, trackGroupArray, trackSelectorResult, list).copyWithLoadingMediaPeriodId(mediaPeriodId2);
            copyWithLoadingMediaPeriodId2.bufferedPositionUs = longValue;
            return copyWithLoadingMediaPeriodId2;
        } else if (i == 0) {
            int indexOfPeriod = timeline2.getIndexOfPeriod(copyWithTimeline.loadingMediaPeriodId.periodUid);
            if (indexOfPeriod != -1 && timeline2.getPeriod(indexOfPeriod, this.period).windowIndex == timeline2.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex) {
                return copyWithTimeline;
            }
            timeline2.getPeriodByUid(mediaPeriodId.periodUid, this.period);
            if (mediaPeriodId.isAd()) {
                j = this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
            } else {
                j = this.period.durationUs;
            }
            PlaybackInfo copyWithLoadingMediaPeriodId3 = copyWithTimeline.copyWithNewPosition(mediaPeriodId, copyWithTimeline.positionUs, copyWithTimeline.positionUs, j - copyWithTimeline.positionUs, copyWithTimeline.trackGroups, copyWithTimeline.trackSelectorResult, copyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId);
            copyWithLoadingMediaPeriodId3.bufferedPositionUs = j;
            return copyWithLoadingMediaPeriodId3;
        } else {
            MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
            Assertions.checkState(!mediaPeriodId3.isAd());
            long max = Math.max(0, copyWithTimeline.totalBufferedDurationUs - (longValue - msToUs));
            long j2 = copyWithTimeline.bufferedPositionUs;
            if (copyWithTimeline.loadingMediaPeriodId.equals(copyWithTimeline.periodId)) {
                j2 = longValue + max;
            }
            PlaybackInfo copyWithNewPosition = copyWithTimeline.copyWithNewPosition(mediaPeriodId3, longValue, longValue, max, copyWithTimeline.trackGroups, copyWithTimeline.trackSelectorResult, copyWithTimeline.staticMetadata);
            copyWithNewPosition.bufferedPositionUs = j2;
            return copyWithNewPosition;
        }
    }

    private Pair<Object, Long> getPeriodPositionAfterTimelineChanged(Timeline timeline, Timeline timeline2) {
        long contentPosition = getContentPosition();
        int i = -1;
        if (timeline.isEmpty() || timeline2.isEmpty()) {
            boolean z = !timeline.isEmpty() && timeline2.isEmpty();
            if (!z) {
                i = getCurrentWindowIndexInternal();
            }
            if (z) {
                contentPosition = -9223372036854775807L;
            }
            return getPeriodPositionOrMaskWindowPosition(timeline2, i, contentPosition);
        }
        Pair<Object, Long> periodPosition = timeline.getPeriodPosition(this.window, this.period, getCurrentWindowIndex(), C3716C.msToUs(contentPosition));
        Object obj = ((Pair) Util.castNonNull(periodPosition)).first;
        if (timeline2.getIndexOfPeriod(obj) != -1) {
            return periodPosition;
        }
        Object resolveSubsequentPeriod = ExoPlayerImplInternal.resolveSubsequentPeriod(this.window, this.period, this.repeatMode, this.shuffleModeEnabled, obj, timeline, timeline2);
        if (resolveSubsequentPeriod == null) {
            return getPeriodPositionOrMaskWindowPosition(timeline2, -1, -9223372036854775807L);
        }
        timeline2.getPeriodByUid(resolveSubsequentPeriod, this.period);
        return getPeriodPositionOrMaskWindowPosition(timeline2, this.period.windowIndex, timeline2.getWindow(this.period.windowIndex, this.window).getDefaultPositionMs());
    }

    private Pair<Object, Long> getPeriodPositionOrMaskWindowPosition(Timeline timeline, int i, long j) {
        if (timeline.isEmpty()) {
            this.maskingWindowIndex = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.maskingWindowPositionMs = j;
            this.maskingPeriodIndex = 0;
            return null;
        }
        if (i == -1 || i >= timeline.getWindowCount()) {
            i = timeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j = timeline.getWindow(i, this.window).getDefaultPositionMs();
        }
        return timeline.getPeriodPosition(this.window, this.period, i, C3716C.msToUs(j));
    }

    private long periodPositionUsToWindowPositionMs(MediaSource.MediaPeriodId mediaPeriodId, long j) {
        long usToMs = C3716C.usToMs(j);
        this.playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return usToMs + this.period.getPositionInWindowMs();
    }

    private static boolean isPlaying(PlaybackInfo playbackInfo2) {
        return playbackInfo2.playbackState == 3 && playbackInfo2.playWhenReady && playbackInfo2.playbackSuppressionReason == 0;
    }

    private static final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {
        /* access modifiers changed from: private */
        public Timeline timeline;
        private final Object uid;

        public MediaSourceHolderSnapshot(Object obj, Timeline timeline2) {
            this.uid = obj;
            this.timeline = timeline2;
        }

        public Object getUid() {
            return this.uid;
        }

        public Timeline getTimeline() {
            return this.timeline;
        }
    }
}
