package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;

public final class SinglePeriodTimeline extends Timeline {
    private static final MediaItem MEDIA_ITEM = new MediaItem.Builder().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();
    private static final Object UID = new Object();
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final MediaItem.LiveConfiguration liveConfiguration;
    private final Object manifest;
    private final MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;

    public int getPeriodCount() {
        return 1;
    }

    public int getWindowCount() {
        return 1;
    }

    @Deprecated
    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(j, j, 0, 0, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem2) {
        this(j, j, 0, 0, z, z2, z3, obj, mediaItem2);
    }

    @Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, z3, obj, obj2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SinglePeriodTimeline(long r21, long r23, long r25, long r27, boolean r29, boolean r30, boolean r31, java.lang.Object r32, com.google.android.exoplayer2.MediaItem r33) {
        /*
            r20 = this;
            r15 = r33
            if (r31 == 0) goto L_0x0007
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r15.liveConfiguration
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r19 = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r20
            r7 = r21
            r9 = r23
            r11 = r25
            r13 = r27
            r15 = r29
            r16 = r30
            r17 = r32
            r18 = r33
            r0.<init>((long) r1, (long) r3, (long) r5, (long) r7, (long) r9, (long) r11, (long) r13, (boolean) r15, (boolean) r16, (java.lang.Object) r17, (com.google.android.exoplayer2.MediaItem) r18, (com.google.android.exoplayer2.MediaItem.LiveConfiguration) r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.SinglePeriodTimeline.<init>(long, long, long, long, boolean, boolean, boolean, java.lang.Object, com.google.android.exoplayer2.MediaItem):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(j, j2, j3, j4, j5, j6, j7, z, z2, obj, MEDIA_ITEM.buildUpon().setTag(obj2).build(), z3 ? MEDIA_ITEM.liveConfiguration : null);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, Object obj, MediaItem mediaItem2, MediaItem.LiveConfiguration liveConfiguration2) {
        this.presentationStartTimeMs = j;
        this.windowStartTimeMs = j2;
        this.elapsedRealtimeEpochOffsetMs = j3;
        this.periodDurationUs = j4;
        this.windowDurationUs = j5;
        this.windowPositionInPeriodUs = j6;
        this.windowDefaultStartPositionUs = j7;
        this.isSeekable = z;
        this.isDynamic = z2;
        this.manifest = obj;
        this.mediaItem = (MediaItem) Assertions.checkNotNull(mediaItem2);
        this.liveConfiguration = liveConfiguration2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r1 > r6) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.Timeline.Window getWindow(int r28, com.google.android.exoplayer2.Timeline.Window r29, long r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = 0
            r2 = 1
            r3 = r28
            com.google.android.exoplayer2.util.Assertions.checkIndex(r3, r1, r2)
            long r1 = r0.windowDefaultStartPositionUs
            boolean r3 = r0.isDynamic
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x002a
            r6 = 0
            int r3 = (r30 > r6 ? 1 : (r30 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x002a
            long r6 = r0.windowDurationUs
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0023
        L_0x0020:
            r19 = r4
            goto L_0x002c
        L_0x0023:
            long r1 = r1 + r30
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x002a
            goto L_0x0020
        L_0x002a:
            r19 = r1
        L_0x002c:
            java.lang.Object r7 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
            com.google.android.exoplayer2.MediaItem r8 = r0.mediaItem
            java.lang.Object r9 = r0.manifest
            long r10 = r0.presentationStartTimeMs
            long r12 = r0.windowStartTimeMs
            long r14 = r0.elapsedRealtimeEpochOffsetMs
            boolean r1 = r0.isSeekable
            r16 = r1
            boolean r1 = r0.isDynamic
            r17 = r1
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r1 = r0.liveConfiguration
            r18 = r1
            long r1 = r0.windowDurationUs
            r21 = r1
            r23 = 0
            r24 = 0
            long r1 = r0.windowPositionInPeriodUs
            r25 = r1
            r6 = r29
            com.google.android.exoplayer2.Timeline$Window r1 = r6.set(r7, r8, r9, r10, r12, r14, r16, r17, r18, r19, r21, r23, r24, r25)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.SinglePeriodTimeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window, long):com.google.android.exoplayer2.Timeline$Window");
    }

    public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        Assertions.checkIndex(i, 0, 1);
        return period.set((Object) null, z ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    public Object getUidOfPeriod(int i) {
        Assertions.checkIndex(i, 0, 1);
        return UID;
    }
}
