package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.List;

public abstract class BaseTrackSelection implements ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final Format[] formats;
    protected final TrackGroup group;
    private int hashCode;
    protected final int length;
    protected final int[] tracks;

    public void disable() {
    }

    public void enable() {
    }

    public /* synthetic */ void onDiscontinuity() {
        ExoTrackSelection.CC.$default$onDiscontinuity(this);
    }

    public /* synthetic */ void onPlayWhenReadyChanged(boolean z) {
        ExoTrackSelection.CC.$default$onPlayWhenReadyChanged(this, z);
    }

    public void onPlaybackSpeed(float f) {
    }

    public /* synthetic */ void onRebuffer() {
        ExoTrackSelection.CC.$default$onRebuffer(this);
    }

    public /* synthetic */ boolean shouldCancelChunkLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        return ExoTrackSelection.CC.$default$shouldCancelChunkLoad(this, j, chunk, list);
    }

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        int i = 0;
        Assertions.checkState(iArr.length > 0);
        this.group = (TrackGroup) Assertions.checkNotNull(trackGroup);
        int length2 = iArr.length;
        this.length = length2;
        this.formats = new Format[length2];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.formats[i2] = trackGroup.getFormat(iArr[i2]);
        }
        Arrays.sort(this.formats, $$Lambda$BaseTrackSelection$SVpuNGt4j8IqtDkli4fuykzugIE.INSTANCE);
        this.tracks = new int[this.length];
        while (true) {
            int i3 = this.length;
            if (i < i3) {
                this.tracks[i] = trackGroup.indexOf(this.formats[i]);
                i++;
            } else {
                this.excludeUntilTimes = new long[i3];
                return;
            }
        }
    }

    static /* synthetic */ int lambda$new$0(Format format, Format format2) {
        return format2.bitrate - format.bitrate;
    }

    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    public final int length() {
        return this.tracks.length;
    }

    public final Format getFormat(int i) {
        return this.formats[i];
    }

    public final int getIndexInTrackGroup(int i) {
        return this.tracks[i];
    }

    public final int indexOf(Format format) {
        for (int i = 0; i < this.length; i++) {
            if (this.formats[i] == format) {
                return i;
            }
        }
        return -1;
    }

    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.length; i2++) {
            if (this.tracks[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    public int evaluateQueueSize(long j, List<? extends MediaChunk> list) {
        return list.size();
    }

    public final boolean blacklist(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isBlacklisted = isBlacklisted(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.length && !isBlacklisted) {
            isBlacklisted = i2 != i && !isBlacklisted(i2, elapsedRealtime);
            i2++;
        }
        if (!isBlacklisted) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i] = Math.max(jArr[i], Util.addWithOverflowDefault(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean isBlacklisted(int i, long j) {
        return this.excludeUntilTimes[i] > j;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = (System.identityHashCode(this.group) * 31) + Arrays.hashCode(this.tracks);
        }
        return this.hashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
        if (this.group != baseTrackSelection.group || !Arrays.equals(this.tracks, baseTrackSelection.tracks)) {
            return false;
        }
        return true;
    }
}
