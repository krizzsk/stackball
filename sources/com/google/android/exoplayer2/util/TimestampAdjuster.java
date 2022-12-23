package com.google.android.exoplayer2.util;

public final class TimestampAdjuster {
    public static final long DO_NOT_OFFSET = Long.MAX_VALUE;
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    private long firstSampleTimestampUs;
    private long lastSampleTimestampUs = -9223372036854775807L;
    private boolean sharedInitializationStarted;
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        this.firstSampleTimestampUs = j;
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j) throws InterruptedException {
        if (z) {
            try {
                if (!this.sharedInitializationStarted) {
                    this.firstSampleTimestampUs = j;
                    this.sharedInitializationStarted = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || j != this.firstSampleTimestampUs) {
            while (this.lastSampleTimestampUs == -9223372036854775807L) {
                wait();
            }
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        return this.firstSampleTimestampUs;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j;
        j = -9223372036854775807L;
        if (this.lastSampleTimestampUs != -9223372036854775807L) {
            j = this.timestampOffsetUs + this.lastSampleTimestampUs;
        } else if (this.firstSampleTimestampUs != Long.MAX_VALUE) {
            j = this.firstSampleTimestampUs;
        }
        return j;
    }

    public synchronized long getTimestampOffsetUs() {
        long j;
        j = -9223372036854775807L;
        if (this.firstSampleTimestampUs == Long.MAX_VALUE) {
            j = 0;
        } else if (this.lastSampleTimestampUs != -9223372036854775807L) {
            j = this.timestampOffsetUs;
        }
        return j;
    }

    public synchronized void reset(long j) {
        this.firstSampleTimestampUs = j;
        this.lastSampleTimestampUs = -9223372036854775807L;
        this.sharedInitializationStarted = false;
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.lastSampleTimestampUs != -9223372036854775807L) {
            long usToNonWrappedPts = usToNonWrappedPts(this.lastSampleTimestampUs);
            long j2 = (4294967296L + usToNonWrappedPts) / MAX_PTS_PLUS_ONE;
            long j3 = ((j2 - 1) * MAX_PTS_PLUS_ONE) + j;
            j += j2 * MAX_PTS_PLUS_ONE;
            if (Math.abs(j3 - usToNonWrappedPts) < Math.abs(j - usToNonWrappedPts)) {
                j = j3;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.lastSampleTimestampUs != -9223372036854775807L) {
            this.lastSampleTimestampUs = j;
        } else {
            if (this.firstSampleTimestampUs != Long.MAX_VALUE) {
                this.timestampOffsetUs = this.firstSampleTimestampUs - j;
            }
            this.lastSampleTimestampUs = j;
            notifyAll();
        }
        return j + this.timestampOffsetUs;
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / 90000;
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % MAX_PTS_PLUS_ONE;
    }

    public static long usToNonWrappedPts(long j) {
        return (j * 90000) / 1000000;
    }
}
