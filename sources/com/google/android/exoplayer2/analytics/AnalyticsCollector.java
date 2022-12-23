package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.C3716C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.MutableFlags;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class AnalyticsCollector implements Player.EventListener, AudioRendererEventListener, VideoRendererEventListener, MediaSourceEventListener, BandwidthMeter.EventListener, DrmSessionEventListener {
    private final Clock clock;
    private final SparseArray<AnalyticsListener.EventTime> eventTimes = new SparseArray<>();
    private boolean isSeeking;
    private ListenerSet<AnalyticsListener, AnalyticsListener.C3728Events> listeners;
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker = new MediaPeriodQueueTracker(this.period);
    private final Timeline.Period period = new Timeline.Period();
    private Player player;
    private final Timeline.Window window = new Timeline.Window();

    static /* synthetic */ void lambda$new$0(AnalyticsListener analyticsListener, AnalyticsListener.C3728Events events) {
    }

    @Deprecated
    public /* synthetic */ void onAudioInputFormatChanged(Format format) {
        AudioRendererEventListener.CC.$default$onAudioInputFormatChanged(this, format);
    }

    public /* synthetic */ void onEvents(Player player2, Player.C3723Events events) {
        Player.EventListener.CC.$default$onEvents(this, player2, events);
    }

    public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
        Player.EventListener.CC.$default$onExperimentalOffloadSchedulingEnabledChanged(this, z);
    }

    public /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z) {
        Player.EventListener.CC.$default$onExperimentalSleepingForOffloadChanged(this, z);
    }

    @Deprecated
    public /* synthetic */ void onLoadingChanged(boolean z) {
        Player.EventListener.CC.$default$onLoadingChanged(this, z);
    }

    @Deprecated
    public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
        Player.EventListener.CC.$default$onTimelineChanged(this, timeline, obj, i);
    }

    @Deprecated
    public /* synthetic */ void onVideoInputFormatChanged(Format format) {
        VideoRendererEventListener.CC.$default$onVideoInputFormatChanged(this, format);
    }

    public final void resetForNewPlaylist() {
    }

    public AnalyticsCollector(Clock clock2) {
        this.clock = (Clock) Assertions.checkNotNull(clock2);
        this.listeners = new ListenerSet<>(Util.getCurrentOrMainLooper(), clock2, $$Lambda$_c2hohmSp_GINmbai5502bzP8Hg.INSTANCE, $$Lambda$AnalyticsCollector$Wdnd5C7O4CawhxoGrqdwyiE3P4.INSTANCE);
    }

    public void addListener(AnalyticsListener analyticsListener) {
        Assertions.checkNotNull(analyticsListener);
        this.listeners.add(analyticsListener);
    }

    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    public void setPlayer(Player player2, Looper looper) {
        Assertions.checkState(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        this.player = (Player) Assertions.checkNotNull(player2);
        this.listeners = this.listeners.copy(looper, new ListenerSet.IterationFinishedEvent(player2) {
            public final /* synthetic */ Player f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj, MutableFlags mutableFlags) {
                AnalyticsCollector.this.lambda$setPlayer$1$AnalyticsCollector(this.f$1, (AnalyticsListener) obj, (AnalyticsListener.C3728Events) mutableFlags);
            }
        });
    }

    public /* synthetic */ void lambda$setPlayer$1$AnalyticsCollector(Player player2, AnalyticsListener analyticsListener, AnalyticsListener.C3728Events events) {
        events.setEventTimes(this.eventTimes);
        analyticsListener.onEvents(player2, events);
    }

    public void release() {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.eventTimes.put(1036, generateCurrentPlayerMediaPeriodEventTime);
        this.listeners.lazyRelease(1036, new ListenerSet.Event() {
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerReleased(AnalyticsListener.EventTime.this);
            }
        });
    }

    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, (Player) Assertions.checkNotNull(this.player));
    }

    public final void notifySeekStarted() {
        if (!this.isSeeking) {
            AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
            this.isSeeking = true;
            sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() {
                public final void invoke(Object obj) {
                    ((AnalyticsListener) obj).onSeekStarted(AnalyticsListener.EventTime.this);
                }
            });
        }
    }

    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 1007, new ListenerSet.Event(metadata) {
            public final /* synthetic */ Metadata f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMetadata(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onAudioEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1008, new ListenerSet.Event(decoderCounters) {
            public final /* synthetic */ DecoderCounters f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                AnalyticsCollector.lambda$onAudioEnabled$5(AnalyticsListener.EventTime.this, this.f$1, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onAudioEnabled$5(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioEnabled(eventTime, decoderCounters);
        analyticsListener.onDecoderEnabled(eventTime, 1, decoderCounters);
    }

    public final void onAudioDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1009, new ListenerSet.Event(str, j2) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                AnalyticsCollector.lambda$onAudioDecoderInitialized$6(AnalyticsListener.EventTime.this, this.f$1, this.f$2, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onAudioDecoderInitialized$6(AnalyticsListener.EventTime eventTime, String str, long j, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j);
        analyticsListener.onDecoderInitialized(eventTime, 1, str, j);
    }

    public final void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1010, new ListenerSet.Event(format, decoderReuseEvaluation) {
            public final /* synthetic */ Format f$1;
            public final /* synthetic */ DecoderReuseEvaluation f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                AnalyticsCollector.lambda$onAudioInputFormatChanged$7(AnalyticsListener.EventTime.this, this.f$1, this.f$2, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onAudioInputFormatChanged$7(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioInputFormatChanged(eventTime, format, decoderReuseEvaluation);
        analyticsListener.onDecoderInputFormatChanged(eventTime, 1, format);
    }

    public final void onAudioPositionAdvancing(long j) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1011, new ListenerSet.Event(j) {
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioPositionAdvancing(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onAudioUnderrun(int i, long j, long j2) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1012, new ListenerSet.Event(i, j, j2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r5;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioUnderrun(AnalyticsListener.EventTime.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public final void onAudioDecoderReleased(String str) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1013, new ListenerSet.Event(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioDecoderReleased(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onAudioDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1014, new ListenerSet.Event(decoderCounters) {
            public final /* synthetic */ DecoderCounters f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                AnalyticsCollector.lambda$onAudioDisabled$11(AnalyticsListener.EventTime.this, this.f$1, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onAudioDisabled$11(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDisabled(eventTime, decoderCounters);
        analyticsListener.onDecoderDisabled(eventTime, 1, decoderCounters);
    }

    public final void onSkipSilenceEnabledChanged(boolean z) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1017, new ListenerSet.Event(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onAudioSinkError(Exception exc) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1018, new ListenerSet.Event(exc) {
            public final /* synthetic */ Exception f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSinkError(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onAudioSessionIdChanged(int i) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1015, new ListenerSet.Event(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSessionIdChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1016, new ListenerSet.Event(audioAttributes) {
            public final /* synthetic */ AudioAttributes f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioAttributesChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onVolumeChanged(float f) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1019, new ListenerSet.Event(f) {
            public final /* synthetic */ float f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVolumeChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onVideoEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1020, new ListenerSet.Event(decoderCounters) {
            public final /* synthetic */ DecoderCounters f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                AnalyticsCollector.lambda$onVideoEnabled$17(AnalyticsListener.EventTime.this, this.f$1, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoEnabled$17(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoEnabled(eventTime, decoderCounters);
        analyticsListener.onDecoderEnabled(eventTime, 2, decoderCounters);
    }

    public final void onVideoDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1021, new ListenerSet.Event(str, j2) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                AnalyticsCollector.lambda$onVideoDecoderInitialized$18(AnalyticsListener.EventTime.this, this.f$1, this.f$2, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoDecoderInitialized$18(AnalyticsListener.EventTime eventTime, String str, long j, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j);
        analyticsListener.onDecoderInitialized(eventTime, 2, str, j);
    }

    public final void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1022, new ListenerSet.Event(format, decoderReuseEvaluation) {
            public final /* synthetic */ Format f$1;
            public final /* synthetic */ DecoderReuseEvaluation f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                AnalyticsCollector.lambda$onVideoInputFormatChanged$19(AnalyticsListener.EventTime.this, this.f$1, this.f$2, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoInputFormatChanged$19(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoInputFormatChanged(eventTime, format, decoderReuseEvaluation);
        analyticsListener.onDecoderInputFormatChanged(eventTime, 2, format);
    }

    public final void onDroppedFrames(int i, long j) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1023, new ListenerSet.Event(i, j) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDroppedVideoFrames(AnalyticsListener.EventTime.this, this.f$1, this.f$2);
            }
        });
    }

    public final void onVideoDecoderReleased(String str) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1024, new ListenerSet.Event(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoDecoderReleased(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onVideoDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1025, new ListenerSet.Event(decoderCounters) {
            public final /* synthetic */ DecoderCounters f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                AnalyticsCollector.lambda$onVideoDisabled$22(AnalyticsListener.EventTime.this, this.f$1, (AnalyticsListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVideoDisabled$22(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDisabled(eventTime, decoderCounters);
        analyticsListener.onDecoderDisabled(eventTime, 2, decoderCounters);
    }

    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1028, new ListenerSet.Event(i, i2, i3, f) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ float f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoSizeChanged(AnalyticsListener.EventTime.this, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    public final void onRenderedFirstFrame(Surface surface) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1027, new ListenerSet.Event(surface) {
            public final /* synthetic */ Surface f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRenderedFirstFrame(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onVideoFrameProcessingOffset(long j, int i) {
        AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1026, new ListenerSet.Event(j, i) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(AnalyticsListener.EventTime.this, this.f$1, this.f$2);
            }
        });
    }

    public void onSurfaceSizeChanged(int i, int i2) {
        AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1029, new ListenerSet.Event(i, i2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSurfaceSizeChanged(AnalyticsListener.EventTime.this, this.f$1, this.f$2);
            }
        });
    }

    public final void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1000, new ListenerSet.Event(loadEventInfo, mediaLoadData) {
            public final /* synthetic */ LoadEventInfo f$1;
            public final /* synthetic */ MediaLoadData f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadStarted(AnalyticsListener.EventTime.this, this.f$1, this.f$2);
            }
        });
    }

    public final void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1001, new ListenerSet.Event(loadEventInfo, mediaLoadData) {
            public final /* synthetic */ LoadEventInfo f$1;
            public final /* synthetic */ MediaLoadData f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCompleted(AnalyticsListener.EventTime.this, this.f$1, this.f$2);
            }
        });
    }

    public final void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1002, new ListenerSet.Event(loadEventInfo, mediaLoadData) {
            public final /* synthetic */ LoadEventInfo f$1;
            public final /* synthetic */ MediaLoadData f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCanceled(AnalyticsListener.EventTime.this, this.f$1, this.f$2);
            }
        });
    }

    public final void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1003, new ListenerSet.Event(loadEventInfo, mediaLoadData, iOException, z) {
            public final /* synthetic */ LoadEventInfo f$1;
            public final /* synthetic */ MediaLoadData f$2;
            public final /* synthetic */ IOException f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadError(AnalyticsListener.EventTime.this, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    public final void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1005, new ListenerSet.Event(mediaLoadData) {
            public final /* synthetic */ MediaLoadData f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onUpstreamDiscarded(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1004, new ListenerSet.Event(mediaLoadData) {
            public final /* synthetic */ MediaLoadData f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDownstreamFormatChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onTimelineChanged(Timeline timeline, int i) {
        this.mediaPeriodQueueTracker.onTimelineChanged((Player) Assertions.checkNotNull(this.player));
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 0, new ListenerSet.Event(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTimelineChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onMediaItemTransition(MediaItem mediaItem, int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 1, new ListenerSet.Event(mediaItem, i) {
            public final /* synthetic */ MediaItem f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaItemTransition(AnalyticsListener.EventTime.this, this.f$1, this.f$2);
            }
        });
    }

    public final void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 2, new ListenerSet.Event(trackGroupArray, trackSelectionArray) {
            public final /* synthetic */ TrackGroupArray f$1;
            public final /* synthetic */ TrackSelectionArray f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTracksChanged(AnalyticsListener.EventTime.this, this.f$1, this.f$2);
            }
        });
    }

    public final void onStaticMetadataChanged(List<Metadata> list) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 3, new ListenerSet.Event(list) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onStaticMetadataChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onIsLoadingChanged(boolean z) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 4, new ListenerSet.Event(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onIsLoadingChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onPlayerStateChanged(boolean z, int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event(z, i) {
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerStateChanged(AnalyticsListener.EventTime.this, this.f$1, this.f$2);
            }
        });
    }

    public final void onPlaybackStateChanged(int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 5, new ListenerSet.Event(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackStateChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onPlayWhenReadyChanged(boolean z, int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 6, new ListenerSet.Event(z, i) {
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(AnalyticsListener.EventTime.this, this.f$1, this.f$2);
            }
        });
    }

    public final void onPlaybackSuppressionReasonChanged(int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 7, new ListenerSet.Event(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public void onIsPlayingChanged(boolean z) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 8, new ListenerSet.Event(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onIsPlayingChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onRepeatModeChanged(int i) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 9, new ListenerSet.Event(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRepeatModeChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onShuffleModeEnabledChanged(boolean z) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 10, new ListenerSet.Event(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onShuffleModeChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
        AnalyticsListener.EventTime eventTime;
        if (exoPlaybackException.mediaPeriodId != null) {
            eventTime = generateEventTime(new MediaSource.MediaPeriodId(exoPlaybackException.mediaPeriodId));
        } else {
            eventTime = generateCurrentPlayerMediaPeriodEventTime();
        }
        sendEvent(eventTime, 11, new ListenerSet.Event(exoPlaybackException) {
            public final /* synthetic */ ExoPlaybackException f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerError(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onPositionDiscontinuity(int i) {
        if (i == 1) {
            this.isSeeking = false;
        }
        this.mediaPeriodQueueTracker.onPositionDiscontinuity((Player) Assertions.checkNotNull(this.player));
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 12, new ListenerSet.Event(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPositionDiscontinuity(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 13, new ListenerSet.Event(playbackParameters) {
            public final /* synthetic */ PlaybackParameters f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackParametersChanged(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onSeekProcessed() {
        AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() {
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekProcessed(AnalyticsListener.EventTime.this);
            }
        });
    }

    public final void onBandwidthSample(int i, long j, long j2) {
        AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(generateLoadingMediaPeriodEventTime, 1006, new ListenerSet.Event(i, j, j2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r5;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onBandwidthEstimate(AnalyticsListener.EventTime.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public final void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1030, new ListenerSet.Event() {
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionAcquired(AnalyticsListener.EventTime.this);
            }
        });
    }

    public final void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1031, new ListenerSet.Event() {
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysLoaded(AnalyticsListener.EventTime.this);
            }
        });
    }

    public final void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1032, new ListenerSet.Event(exc) {
            public final /* synthetic */ Exception f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionManagerError(AnalyticsListener.EventTime.this, this.f$1);
            }
        });
    }

    public final void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1033, new ListenerSet.Event() {
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRestored(AnalyticsListener.EventTime.this);
            }
        });
    }

    public final void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1034, new ListenerSet.Event() {
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRemoved(AnalyticsListener.EventTime.this);
            }
        });
    }

    public final void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1035, new ListenerSet.Event() {
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionReleased(AnalyticsListener.EventTime.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void sendEvent(AnalyticsListener.EventTime eventTime, int i, ListenerSet.Event<AnalyticsListener> event) {
        this.eventTimes.put(i, eventTime);
        this.listeners.sendEvent(i, event);
    }

    /* access modifiers changed from: protected */
    public final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    /* access modifiers changed from: protected */
    @RequiresNonNull({"player"})
    public final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int i, MediaSource.MediaPeriodId mediaPeriodId) {
        long j;
        Timeline timeline2 = timeline;
        int i2 = i;
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
        long elapsedRealtime = this.clock.elapsedRealtime();
        boolean z = true;
        boolean z2 = timeline2.equals(this.player.getCurrentTimeline()) && i2 == this.player.getCurrentWindowIndex();
        long j2 = 0;
        if (mediaPeriodId2 != null && mediaPeriodId2.isAd()) {
            if (!(z2 && this.player.getCurrentAdGroupIndex() == mediaPeriodId2.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId2.adIndexInAdGroup)) {
                z = false;
            }
            if (z) {
                j2 = this.player.getCurrentPosition();
            }
        } else if (z2) {
            j = this.player.getContentPosition();
            return new AnalyticsListener.EventTime(elapsedRealtime, timeline, i, mediaPeriodId2, j, this.player.getCurrentTimeline(), this.player.getCurrentWindowIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
        } else if (!timeline.isEmpty()) {
            j2 = timeline2.getWindow(i2, this.window).getDefaultPositionMs();
        }
        j = j2;
        return new AnalyticsListener.EventTime(elapsedRealtime, timeline, i, mediaPeriodId2, j, this.player.getCurrentTimeline(), this.player.getCurrentWindowIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    private AnalyticsListener.EventTime generateEventTime(MediaSource.MediaPeriodId mediaPeriodId) {
        Timeline timeline;
        Assertions.checkNotNull(this.player);
        if (mediaPeriodId == null) {
            timeline = null;
        } else {
            timeline = this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        }
        if (mediaPeriodId != null && timeline != null) {
            return generateEventTime(timeline, timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId);
        }
        int currentWindowIndex = this.player.getCurrentWindowIndex();
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (!(currentWindowIndex < currentTimeline.getWindowCount())) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, currentWindowIndex, (MediaSource.MediaPeriodId) null);
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateMediaPeriodEventTime(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.player);
        boolean z = true;
        if (mediaPeriodId != null) {
            if (this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) == null) {
                z = false;
            }
            if (z) {
                return generateEventTime(mediaPeriodId);
            }
            return generateEventTime(Timeline.EMPTY, i, mediaPeriodId);
        }
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (i >= currentTimeline.getWindowCount()) {
            z = false;
        }
        if (!z) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i, (MediaSource.MediaPeriodId) null);
    }

    private static final class MediaPeriodQueueTracker {
        private MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        /* access modifiers changed from: private */
        public ImmutableList<MediaSource.MediaPeriodId> mediaPeriodQueue = ImmutableList.m9346of();
        private ImmutableMap<MediaSource.MediaPeriodId, Timeline> mediaPeriodTimelines = ImmutableMap.m9365of();
        private final Timeline.Period period;
        private MediaSource.MediaPeriodId playingMediaPeriod;
        private MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(Timeline.Period period2) {
            this.period = period2;
        }

        public MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        public MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        public MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (MediaSource.MediaPeriodId) Iterables.getLast(this.mediaPeriodQueue);
        }

        public Timeline getMediaPeriodIdTimeline(MediaSource.MediaPeriodId mediaPeriodId) {
            return this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        public void onPositionDiscontinuity(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onTimelineChanged(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        public void onQueueUpdated(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId, Player player) {
            this.mediaPeriodQueue = ImmutableList.copyOf(list);
            if (!list.isEmpty()) {
                this.playingMediaPeriod = list.get(0);
                this.readingMediaPeriod = (MediaSource.MediaPeriodId) Assertions.checkNotNull(mediaPeriodId);
            }
            if (this.currentPlayerMediaPeriod == null) {
                this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            }
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        private void updateMediaPeriodTimelines(Timeline timeline) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            if (this.mediaPeriodQueue.isEmpty()) {
                addTimelineForMediaPeriodId(builder, this.playingMediaPeriod, timeline);
                if (!Objects.equal(this.readingMediaPeriod, this.playingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.readingMediaPeriod, timeline);
                }
                if (!Objects.equal(this.currentPlayerMediaPeriod, this.playingMediaPeriod) && !Objects.equal(this.currentPlayerMediaPeriod, this.readingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            } else {
                for (int i = 0; i < this.mediaPeriodQueue.size(); i++) {
                    addTimelineForMediaPeriodId(builder, (MediaSource.MediaPeriodId) this.mediaPeriodQueue.get(i), timeline);
                }
                if (!this.mediaPeriodQueue.contains(this.currentPlayerMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            }
            this.mediaPeriodTimelines = builder.build();
        }

        private void addTimelineForMediaPeriodId(ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> builder, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId != null) {
                if (timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                    builder.put(mediaPeriodId, timeline);
                    return;
                }
                Timeline timeline2 = this.mediaPeriodTimelines.get(mediaPeriodId);
                if (timeline2 != null) {
                    builder.put(mediaPeriodId, timeline2);
                }
            }
        }

        private static MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(Player player, ImmutableList<MediaSource.MediaPeriodId> immutableList, MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period2) {
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (player.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period2).getAdGroupIndexAfterPositionUs(C3716C.msToUs(player.getCurrentPosition()) - period2.getPositionInWindowUs());
            for (int i = 0; i < immutableList.size(); i++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = (MediaSource.MediaPeriodId) immutableList.get(i);
                if (isMatchingMediaPeriod(mediaPeriodId2, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId2;
                }
            }
            if (immutableList.isEmpty() && mediaPeriodId != null) {
                if (isMatchingMediaPeriod(mediaPeriodId, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId;
                }
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Object obj, boolean z, int i, int i2, int i3) {
            if (!mediaPeriodId.periodUid.equals(obj)) {
                return false;
            }
            if ((z && mediaPeriodId.adGroupIndex == i && mediaPeriodId.adIndexInAdGroup == i2) || (!z && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i3)) {
                return true;
            }
            return false;
        }
    }
}
