package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MutableFlags;
import com.google.common.base.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface AnalyticsListener {
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 1016;
    public static final int EVENT_AUDIO_DECODER_INITIALIZED = 1009;
    public static final int EVENT_AUDIO_DECODER_RELEASED = 1013;
    public static final int EVENT_AUDIO_DISABLED = 1014;
    public static final int EVENT_AUDIO_ENABLED = 1008;
    public static final int EVENT_AUDIO_INPUT_FORMAT_CHANGED = 1010;
    public static final int EVENT_AUDIO_POSITION_ADVANCING = 1011;
    public static final int EVENT_AUDIO_SESSION_ID = 1015;
    public static final int EVENT_AUDIO_SINK_ERROR = 1018;
    public static final int EVENT_AUDIO_UNDERRUN = 1012;
    public static final int EVENT_BANDWIDTH_ESTIMATE = 1006;
    public static final int EVENT_DOWNSTREAM_FORMAT_CHANGED = 1004;
    public static final int EVENT_DRM_KEYS_LOADED = 1031;
    public static final int EVENT_DRM_KEYS_REMOVED = 1034;
    public static final int EVENT_DRM_KEYS_RESTORED = 1033;
    public static final int EVENT_DRM_SESSION_ACQUIRED = 1030;
    public static final int EVENT_DRM_SESSION_MANAGER_ERROR = 1032;
    public static final int EVENT_DRM_SESSION_RELEASED = 1035;
    public static final int EVENT_DROPPED_VIDEO_FRAMES = 1023;
    public static final int EVENT_IS_LOADING_CHANGED = 4;
    public static final int EVENT_IS_PLAYING_CHANGED = 8;
    public static final int EVENT_LOAD_CANCELED = 1002;
    public static final int EVENT_LOAD_COMPLETED = 1001;
    public static final int EVENT_LOAD_ERROR = 1003;
    public static final int EVENT_LOAD_STARTED = 1000;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_METADATA = 1007;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 13;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 5;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 7;
    public static final int EVENT_PLAYER_ERROR = 11;
    public static final int EVENT_PLAYER_RELEASED = 1036;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 6;
    public static final int EVENT_POSITION_DISCONTINUITY = 12;
    public static final int EVENT_RENDERED_FIRST_FRAME = 1027;
    public static final int EVENT_REPEAT_MODE_CHANGED = 9;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 10;
    public static final int EVENT_SKIP_SILENCE_ENABLED_CHANGED = 1017;
    public static final int EVENT_STATIC_METADATA_CHANGED = 3;
    public static final int EVENT_SURFACE_SIZE_CHANGED = 1029;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int EVENT_UPSTREAM_DISCARDED = 1005;
    public static final int EVENT_VIDEO_DECODER_INITIALIZED = 1021;
    public static final int EVENT_VIDEO_DECODER_RELEASED = 1024;
    public static final int EVENT_VIDEO_DISABLED = 1025;
    public static final int EVENT_VIDEO_ENABLED = 1020;
    public static final int EVENT_VIDEO_FRAME_PROCESSING_OFFSET = 1026;
    public static final int EVENT_VIDEO_INPUT_FORMAT_CHANGED = 1022;
    public static final int EVENT_VIDEO_SIZE_CHANGED = 1028;
    public static final int EVENT_VOLUME_CHANGED = 1019;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EventFlags {
    }

    void onAudioAttributesChanged(EventTime eventTime, AudioAttributes audioAttributes);

    void onAudioDecoderInitialized(EventTime eventTime, String str, long j);

    void onAudioDecoderReleased(EventTime eventTime, String str);

    void onAudioDisabled(EventTime eventTime, DecoderCounters decoderCounters);

    void onAudioEnabled(EventTime eventTime, DecoderCounters decoderCounters);

    @Deprecated
    void onAudioInputFormatChanged(EventTime eventTime, Format format);

    void onAudioInputFormatChanged(EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(EventTime eventTime, long j);

    void onAudioSessionIdChanged(EventTime eventTime, int i);

    void onAudioSinkError(EventTime eventTime, Exception exc);

    void onAudioUnderrun(EventTime eventTime, int i, long j, long j2);

    void onBandwidthEstimate(EventTime eventTime, int i, long j, long j2);

    @Deprecated
    void onDecoderDisabled(EventTime eventTime, int i, DecoderCounters decoderCounters);

    @Deprecated
    void onDecoderEnabled(EventTime eventTime, int i, DecoderCounters decoderCounters);

    @Deprecated
    void onDecoderInitialized(EventTime eventTime, int i, String str, long j);

    @Deprecated
    void onDecoderInputFormatChanged(EventTime eventTime, int i, Format format);

    void onDownstreamFormatChanged(EventTime eventTime, MediaLoadData mediaLoadData);

    void onDrmKeysLoaded(EventTime eventTime);

    void onDrmKeysRemoved(EventTime eventTime);

    void onDrmKeysRestored(EventTime eventTime);

    void onDrmSessionAcquired(EventTime eventTime);

    void onDrmSessionManagerError(EventTime eventTime, Exception exc);

    void onDrmSessionReleased(EventTime eventTime);

    void onDroppedVideoFrames(EventTime eventTime, int i, long j);

    void onEvents(Player player, C3728Events events);

    void onIsLoadingChanged(EventTime eventTime, boolean z);

    void onIsPlayingChanged(EventTime eventTime, boolean z);

    void onLoadCanceled(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    void onLoadStarted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    @Deprecated
    void onLoadingChanged(EventTime eventTime, boolean z);

    void onMediaItemTransition(EventTime eventTime, MediaItem mediaItem, int i);

    void onMetadata(EventTime eventTime, Metadata metadata);

    void onPlayWhenReadyChanged(EventTime eventTime, boolean z, int i);

    void onPlaybackParametersChanged(EventTime eventTime, PlaybackParameters playbackParameters);

    void onPlaybackStateChanged(EventTime eventTime, int i);

    void onPlaybackSuppressionReasonChanged(EventTime eventTime, int i);

    void onPlayerError(EventTime eventTime, ExoPlaybackException exoPlaybackException);

    void onPlayerReleased(EventTime eventTime);

    @Deprecated
    void onPlayerStateChanged(EventTime eventTime, boolean z, int i);

    void onPositionDiscontinuity(EventTime eventTime, int i);

    void onRenderedFirstFrame(EventTime eventTime, Surface surface);

    void onRepeatModeChanged(EventTime eventTime, int i);

    @Deprecated
    void onSeekProcessed(EventTime eventTime);

    void onSeekStarted(EventTime eventTime);

    void onShuffleModeChanged(EventTime eventTime, boolean z);

    void onSkipSilenceEnabledChanged(EventTime eventTime, boolean z);

    void onStaticMetadataChanged(EventTime eventTime, List<Metadata> list);

    void onSurfaceSizeChanged(EventTime eventTime, int i, int i2);

    void onTimelineChanged(EventTime eventTime, int i);

    void onTracksChanged(EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);

    void onUpstreamDiscarded(EventTime eventTime, MediaLoadData mediaLoadData);

    void onVideoDecoderInitialized(EventTime eventTime, String str, long j);

    void onVideoDecoderReleased(EventTime eventTime, String str);

    void onVideoDisabled(EventTime eventTime, DecoderCounters decoderCounters);

    void onVideoEnabled(EventTime eventTime, DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(EventTime eventTime, long j, int i);

    @Deprecated
    void onVideoInputFormatChanged(EventTime eventTime, Format format);

    void onVideoInputFormatChanged(EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void onVideoSizeChanged(EventTime eventTime, int i, int i2, int i3, float f);

    void onVolumeChanged(EventTime eventTime, float f);

    /* renamed from: com.google.android.exoplayer2.analytics.AnalyticsListener$Events */
    public static final class C3728Events extends MutableFlags {
        private final SparseArray<EventTime> eventTimes = new SparseArray<>(0);

        public EventTime getEventTime(int i) {
            return (EventTime) Assertions.checkNotNull(this.eventTimes.get(i));
        }

        public void setEventTimes(SparseArray<EventTime> sparseArray) {
            this.eventTimes.clear();
            for (int i = 0; i < size(); i++) {
                int i2 = get(i);
                this.eventTimes.append(i2, (EventTime) Assertions.checkNotNull(sparseArray.get(i2)));
            }
        }

        public boolean contains(int i) {
            return super.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return super.containsAny(iArr);
        }

        public int get(int i) {
            return super.get(i);
        }
    }

    public static final class EventTime {
        public final MediaSource.MediaPeriodId currentMediaPeriodId;
        public final long currentPlaybackPositionMs;
        public final Timeline currentTimeline;
        public final int currentWindowIndex;
        public final long eventPlaybackPositionMs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final Timeline timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public EventTime(long j, Timeline timeline2, int i, MediaSource.MediaPeriodId mediaPeriodId2, long j2, Timeline timeline3, int i2, MediaSource.MediaPeriodId mediaPeriodId3, long j3, long j4) {
            this.realtimeMs = j;
            this.timeline = timeline2;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId2;
            this.eventPlaybackPositionMs = j2;
            this.currentTimeline = timeline3;
            this.currentWindowIndex = i2;
            this.currentMediaPeriodId = mediaPeriodId3;
            this.currentPlaybackPositionMs = j3;
            this.totalBufferedDurationMs = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventTime eventTime = (EventTime) obj;
            if (this.realtimeMs == eventTime.realtimeMs && this.windowIndex == eventTime.windowIndex && this.eventPlaybackPositionMs == eventTime.eventPlaybackPositionMs && this.currentWindowIndex == eventTime.currentWindowIndex && this.currentPlaybackPositionMs == eventTime.currentPlaybackPositionMs && this.totalBufferedDurationMs == eventTime.totalBufferedDurationMs && Objects.equal(this.timeline, eventTime.timeline) && Objects.equal(this.mediaPeriodId, eventTime.mediaPeriodId) && Objects.equal(this.currentTimeline, eventTime.currentTimeline) && Objects.equal(this.currentMediaPeriodId, eventTime.currentMediaPeriodId)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.realtimeMs), this.timeline, Integer.valueOf(this.windowIndex), this.mediaPeriodId, Long.valueOf(this.eventPlaybackPositionMs), this.currentTimeline, Integer.valueOf(this.currentWindowIndex), this.currentMediaPeriodId, Long.valueOf(this.currentPlaybackPositionMs), Long.valueOf(this.totalBufferedDurationMs));
        }
    }

    /* renamed from: com.google.android.exoplayer2.analytics.AnalyticsListener$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAudioAttributesChanged(AnalyticsListener analyticsListener, EventTime eventTime, AudioAttributes audioAttributes) {
        }

        public static void $default$onAudioDecoderInitialized(AnalyticsListener analyticsListener, EventTime eventTime, String str, long j) {
        }

        public static void $default$onAudioDecoderReleased(AnalyticsListener analyticsListener, EventTime eventTime, String str) {
        }

        public static void $default$onAudioDisabled(AnalyticsListener analyticsListener, EventTime eventTime, DecoderCounters decoderCounters) {
        }

        public static void $default$onAudioEnabled(AnalyticsListener analyticsListener, EventTime eventTime, DecoderCounters decoderCounters) {
        }

        @Deprecated
        public static void $default$onAudioInputFormatChanged(AnalyticsListener analyticsListener, EventTime eventTime, Format format) {
        }

        public static void $default$onAudioPositionAdvancing(AnalyticsListener analyticsListener, EventTime eventTime, long j) {
        }

        public static void $default$onAudioSessionIdChanged(AnalyticsListener analyticsListener, EventTime eventTime, int i) {
        }

        public static void $default$onAudioSinkError(AnalyticsListener analyticsListener, EventTime eventTime, Exception exc) {
        }

        public static void $default$onAudioUnderrun(AnalyticsListener analyticsListener, EventTime eventTime, int i, long j, long j2) {
        }

        public static void $default$onBandwidthEstimate(AnalyticsListener analyticsListener, EventTime eventTime, int i, long j, long j2) {
        }

        @Deprecated
        public static void $default$onDecoderDisabled(AnalyticsListener analyticsListener, EventTime eventTime, int i, DecoderCounters decoderCounters) {
        }

        @Deprecated
        public static void $default$onDecoderEnabled(AnalyticsListener analyticsListener, EventTime eventTime, int i, DecoderCounters decoderCounters) {
        }

        @Deprecated
        public static void $default$onDecoderInitialized(AnalyticsListener analyticsListener, EventTime eventTime, int i, String str, long j) {
        }

        @Deprecated
        public static void $default$onDecoderInputFormatChanged(AnalyticsListener analyticsListener, EventTime eventTime, int i, Format format) {
        }

        public static void $default$onDownstreamFormatChanged(AnalyticsListener analyticsListener, EventTime eventTime, MediaLoadData mediaLoadData) {
        }

        public static void $default$onDrmKeysLoaded(AnalyticsListener analyticsListener, EventTime eventTime) {
        }

        public static void $default$onDrmKeysRemoved(AnalyticsListener analyticsListener, EventTime eventTime) {
        }

        public static void $default$onDrmKeysRestored(AnalyticsListener analyticsListener, EventTime eventTime) {
        }

        public static void $default$onDrmSessionAcquired(AnalyticsListener analyticsListener, EventTime eventTime) {
        }

        public static void $default$onDrmSessionManagerError(AnalyticsListener analyticsListener, EventTime eventTime, Exception exc) {
        }

        public static void $default$onDrmSessionReleased(AnalyticsListener analyticsListener, EventTime eventTime) {
        }

        public static void $default$onDroppedVideoFrames(AnalyticsListener analyticsListener, EventTime eventTime, int i, long j) {
        }

        public static void $default$onEvents(AnalyticsListener analyticsListener, Player player, C3728Events events) {
        }

        public static void $default$onIsPlayingChanged(AnalyticsListener analyticsListener, EventTime eventTime, boolean z) {
        }

        public static void $default$onLoadCanceled(AnalyticsListener analyticsListener, EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        public static void $default$onLoadCompleted(AnalyticsListener analyticsListener, EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        public static void $default$onLoadError(AnalyticsListener analyticsListener, EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        }

        public static void $default$onLoadStarted(AnalyticsListener analyticsListener, EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        @Deprecated
        public static void $default$onLoadingChanged(AnalyticsListener analyticsListener, EventTime eventTime, boolean z) {
        }

        public static void $default$onMediaItemTransition(AnalyticsListener analyticsListener, EventTime eventTime, MediaItem mediaItem, int i) {
        }

        public static void $default$onMetadata(AnalyticsListener analyticsListener, EventTime eventTime, Metadata metadata) {
        }

        public static void $default$onPlayWhenReadyChanged(AnalyticsListener analyticsListener, EventTime eventTime, boolean z, int i) {
        }

        public static void $default$onPlaybackParametersChanged(AnalyticsListener analyticsListener, EventTime eventTime, PlaybackParameters playbackParameters) {
        }

        public static void $default$onPlaybackStateChanged(AnalyticsListener analyticsListener, EventTime eventTime, int i) {
        }

        public static void $default$onPlaybackSuppressionReasonChanged(AnalyticsListener analyticsListener, EventTime eventTime, int i) {
        }

        public static void $default$onPlayerError(AnalyticsListener analyticsListener, EventTime eventTime, ExoPlaybackException exoPlaybackException) {
        }

        public static void $default$onPlayerReleased(AnalyticsListener analyticsListener, EventTime eventTime) {
        }

        @Deprecated
        public static void $default$onPlayerStateChanged(AnalyticsListener analyticsListener, EventTime eventTime, boolean z, int i) {
        }

        public static void $default$onPositionDiscontinuity(AnalyticsListener analyticsListener, EventTime eventTime, int i) {
        }

        public static void $default$onRenderedFirstFrame(AnalyticsListener analyticsListener, EventTime eventTime, Surface surface) {
        }

        public static void $default$onRepeatModeChanged(AnalyticsListener analyticsListener, EventTime eventTime, int i) {
        }

        @Deprecated
        public static void $default$onSeekProcessed(AnalyticsListener analyticsListener, EventTime eventTime) {
        }

        public static void $default$onSeekStarted(AnalyticsListener analyticsListener, EventTime eventTime) {
        }

        public static void $default$onShuffleModeChanged(AnalyticsListener analyticsListener, EventTime eventTime, boolean z) {
        }

        public static void $default$onSkipSilenceEnabledChanged(AnalyticsListener analyticsListener, EventTime eventTime, boolean z) {
        }

        public static void $default$onStaticMetadataChanged(AnalyticsListener analyticsListener, EventTime eventTime, List list) {
        }

        public static void $default$onSurfaceSizeChanged(AnalyticsListener analyticsListener, EventTime eventTime, int i, int i2) {
        }

        public static void $default$onTimelineChanged(AnalyticsListener analyticsListener, EventTime eventTime, int i) {
        }

        public static void $default$onTracksChanged(AnalyticsListener analyticsListener, EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        public static void $default$onUpstreamDiscarded(AnalyticsListener analyticsListener, EventTime eventTime, MediaLoadData mediaLoadData) {
        }

        public static void $default$onVideoDecoderInitialized(AnalyticsListener analyticsListener, EventTime eventTime, String str, long j) {
        }

        public static void $default$onVideoDecoderReleased(AnalyticsListener analyticsListener, EventTime eventTime, String str) {
        }

        public static void $default$onVideoDisabled(AnalyticsListener analyticsListener, EventTime eventTime, DecoderCounters decoderCounters) {
        }

        public static void $default$onVideoEnabled(AnalyticsListener analyticsListener, EventTime eventTime, DecoderCounters decoderCounters) {
        }

        public static void $default$onVideoFrameProcessingOffset(AnalyticsListener analyticsListener, EventTime eventTime, long j, int i) {
        }

        @Deprecated
        public static void $default$onVideoInputFormatChanged(AnalyticsListener analyticsListener, EventTime eventTime, Format format) {
        }

        public static void $default$onVideoSizeChanged(AnalyticsListener analyticsListener, EventTime eventTime, int i, int i2, int i3, float f) {
        }

        public static void $default$onVolumeChanged(AnalyticsListener analyticsListener, EventTime eventTime, float f) {
        }

        public static void $default$onIsLoadingChanged(AnalyticsListener _this, EventTime eventTime, boolean z) {
            _this.onLoadingChanged(eventTime, z);
        }

        public static void $default$onAudioInputFormatChanged(AnalyticsListener _this, EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            _this.onAudioInputFormatChanged(eventTime, format);
        }

        public static void $default$onVideoInputFormatChanged(AnalyticsListener _this, EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            _this.onVideoInputFormatChanged(eventTime, format);
        }
    }
}
