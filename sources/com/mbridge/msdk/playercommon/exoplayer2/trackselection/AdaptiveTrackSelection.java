package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.BandwidthMeter;
import com.mbridge.msdk.playercommon.exoplayer2.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.tapjoy.TapjoyConstants;
import java.util.List;

public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.75f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    public static final long DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 2000;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;
    private long lastBufferEvaluationMs;
    private final long maxDurationForQualityDecreaseUs;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private final long minTimeBetweenBufferReevaluationMs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    public Object getSelectionData() {
        return null;
    }

    public static final class Factory implements TrackSelection.Factory {
        private final float bandwidthFraction;
        private final BandwidthMeter bandwidthMeter;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;
        private final long minTimeBetweenBufferReevaluationMs;

        public Factory(BandwidthMeter bandwidthMeter2) {
            this(bandwidthMeter2, 10000, 25000, 25000, 0.75f, 0.75f, 2000, Clock.DEFAULT);
        }

        public Factory(BandwidthMeter bandwidthMeter2, int i, int i2, int i3, float f) {
            this(bandwidthMeter2, i, i2, i3, f, 0.75f, 2000, Clock.DEFAULT);
        }

        public Factory(BandwidthMeter bandwidthMeter2, int i, int i2, int i3, float f, float f2, long j, Clock clock2) {
            this.bandwidthMeter = bandwidthMeter2;
            this.minDurationForQualityIncreaseMs = i;
            this.maxDurationForQualityDecreaseMs = i2;
            this.minDurationToRetainAfterDiscardMs = i3;
            this.bandwidthFraction = f;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f2;
            this.minTimeBetweenBufferReevaluationMs = j;
            this.clock = clock2;
        }

        public final AdaptiveTrackSelection createTrackSelection(TrackGroup trackGroup, int... iArr) {
            return new AdaptiveTrackSelection(trackGroup, iArr, this.bandwidthMeter, (long) this.minDurationForQualityIncreaseMs, (long) this.maxDurationForQualityDecreaseMs, (long) this.minDurationToRetainAfterDiscardMs, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, this.minTimeBetweenBufferReevaluationMs, this.clock);
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter2) {
        this(trackGroup, iArr, bandwidthMeter2, TapjoyConstants.TIMER_INCREMENT, 25000, 25000, 0.75f, 0.75f, 2000, Clock.DEFAULT);
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter2, long j, long j2, long j3, float f, float f2, long j4, Clock clock2) {
        super(trackGroup, iArr);
        this.bandwidthMeter = bandwidthMeter2;
        this.minDurationForQualityIncreaseUs = j * 1000;
        this.maxDurationForQualityDecreaseUs = j2 * 1000;
        this.minDurationToRetainAfterDiscardUs = j3 * 1000;
        this.bandwidthFraction = f;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f2;
        this.minTimeBetweenBufferReevaluationMs = j4;
        this.clock = clock2;
        this.playbackSpeed = 1.0f;
        this.reason = 1;
        this.lastBufferEvaluationMs = -9223372036854775807L;
        this.selectedIndex = determineIdealSelectedIndex(Long.MIN_VALUE);
    }

    public void enable() {
        this.lastBufferEvaluationMs = -9223372036854775807L;
    }

    public void onPlaybackSpeed(float f) {
        this.playbackSpeed = f;
    }

    public void updateSelectedTrack(long j, long j2, long j3) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        int i = this.selectedIndex;
        int determineIdealSelectedIndex = determineIdealSelectedIndex(elapsedRealtime);
        this.selectedIndex = determineIdealSelectedIndex;
        if (determineIdealSelectedIndex != i) {
            if (!isBlacklisted(i, elapsedRealtime)) {
                Format format = getFormat(i);
                Format format2 = getFormat(this.selectedIndex);
                if (format2.bitrate > format.bitrate && j2 < minDurationForQualityIncreaseUs(j3)) {
                    this.selectedIndex = i;
                } else if (format2.bitrate < format.bitrate && j2 >= this.maxDurationForQualityDecreaseUs) {
                    this.selectedIndex = i;
                }
            }
            if (this.selectedIndex != i) {
                this.reason = 3;
            }
        }
    }

    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    public int getSelectionReason() {
        return this.reason;
    }

    public int evaluateQueueSize(long j, List<? extends MediaChunk> list) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        long j2 = this.lastBufferEvaluationMs;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < this.minTimeBetweenBufferReevaluationMs) {
            return list.size();
        }
        this.lastBufferEvaluationMs = elapsedRealtime;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (Util.getPlayoutDurationForMediaDuration(((MediaChunk) list.get(size - 1)).startTimeUs - j, this.playbackSpeed) < this.minDurationToRetainAfterDiscardUs) {
            return size;
        }
        Format format = getFormat(determineIdealSelectedIndex(elapsedRealtime));
        for (int i = 0; i < size; i++) {
            MediaChunk mediaChunk = (MediaChunk) list.get(i);
            Format format2 = mediaChunk.trackFormat;
            if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j, this.playbackSpeed) >= this.minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && format2.height != -1 && format2.height < 720 && format2.width != -1 && format2.width < 1280 && format2.height < format.height) {
                return i;
            }
        }
        return size;
    }

    private int determineIdealSelectedIndex(long j) {
        long bitrateEstimate = (long) (((float) this.bandwidthMeter.getBitrateEstimate()) * this.bandwidthFraction);
        int i = 0;
        for (int i2 = 0; i2 < this.length; i2++) {
            if (j == Long.MIN_VALUE || !isBlacklisted(i2, j)) {
                if (((long) Math.round(((float) getFormat(i2).bitrate) * this.playbackSpeed)) <= bitrateEstimate) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    private long minDurationForQualityIncreaseUs(long j) {
        if (j != -9223372036854775807L && j <= this.minDurationForQualityIncreaseUs) {
            return (long) (((float) j) * this.bufferedFractionToLiveEdgeForQualityIncrease);
        }
        return this.minDurationForQualityIncreaseUs;
    }
}
