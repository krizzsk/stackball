package com.yandex.mobile.ads.impl;

import com.google.common.primitives.SignedBytes;
import com.smaato.sdk.video.vast.model.ErrorCode;

/* renamed from: com.yandex.mobile.ads.impl.h */
public final class C13266h {

    /* renamed from: a */
    private static final int[] f34185a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, ErrorCode.GENERAL_LINEAR_ERROR, ErrorCode.GENERAL_LINEAR_ERROR, 2048};

    /* renamed from: com.yandex.mobile.ads.impl.h$b */
    public static final class C13268b {

        /* renamed from: a */
        public final int f34186a;

        /* renamed from: b */
        public final int f34187b;

        /* renamed from: c */
        public final int f34188c;

        private C13268b(int i, int i2, int i3, int i4, int i5) {
            this.f34186a = i3;
            this.f34187b = i4;
            this.f34188c = i5;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        if (r10 != 11) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        if (r10 != 11) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009c, code lost:
        if (r10 != 8) goto L_0x009f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yandex.mobile.ads.impl.C13266h.C13268b m36737a(com.yandex.mobile.ads.impl.ey0 r10) {
        /*
            r0 = 16
            int r1 = r10.mo66886a((int) r0)
            int r0 = r10.mo66886a((int) r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r10.mo66886a((int) r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = 4
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r7 = r0
            r0 = 2
            int r1 = r10.mo66886a((int) r0)
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L_0x003d
            r5 = 0
        L_0x002c:
            int r6 = r10.mo66886a((int) r0)
            int r5 = r5 + r6
            boolean r6 = r10.mo66900f()
            if (r6 != 0) goto L_0x0039
            int r1 = r1 + r5
            goto L_0x003d
        L_0x0039:
            int r5 = r5 + 1
            int r5 = r5 << r0
            goto L_0x002c
        L_0x003d:
            r5 = 10
            int r5 = r10.mo66886a((int) r5)
            boolean r6 = r10.mo66900f()
            if (r6 == 0) goto L_0x0052
            int r6 = r10.mo66886a((int) r4)
            if (r6 <= 0) goto L_0x0052
            r10.mo66897d(r0)
        L_0x0052:
            boolean r6 = r10.mo66900f()
            r8 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            if (r6 == 0) goto L_0x0062
            r6 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0065
        L_0x0062:
            r6 = 44100(0xac44, float:6.1797E-41)
        L_0x0065:
            int r10 = r10.mo66886a((int) r2)
            if (r6 != r9) goto L_0x0075
            r9 = 13
            if (r10 != r9) goto L_0x0075
            int[] r0 = f34185a
            r10 = r0[r10]
            r8 = r10
            goto L_0x00a5
        L_0x0075:
            if (r6 != r8) goto L_0x00a4
            int[] r8 = f34185a
            int r9 = r8.length
            if (r10 >= r9) goto L_0x00a4
            r3 = r8[r10]
            int r5 = r5 % 5
            r8 = 8
            r9 = 1
            if (r5 == r9) goto L_0x009a
            r9 = 11
            if (r5 == r0) goto L_0x0095
            if (r5 == r4) goto L_0x009a
            if (r5 == r2) goto L_0x008e
            goto L_0x009f
        L_0x008e:
            if (r10 == r4) goto L_0x00a1
            if (r10 == r8) goto L_0x00a1
            if (r10 != r9) goto L_0x009f
            goto L_0x00a1
        L_0x0095:
            if (r10 == r8) goto L_0x00a1
            if (r10 != r9) goto L_0x009f
            goto L_0x00a1
        L_0x009a:
            if (r10 == r4) goto L_0x00a1
            if (r10 != r8) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r8 = r3
            goto L_0x00a5
        L_0x00a1:
            int r3 = r3 + 1
            goto L_0x009f
        L_0x00a4:
            r8 = 0
        L_0x00a5:
            com.yandex.mobile.ads.impl.h$b r10 = new com.yandex.mobile.ads.impl.h$b
            r5 = 2
            r9 = 0
            r3 = r10
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13266h.m36737a(com.yandex.mobile.ads.impl.ey0):com.yandex.mobile.ads.impl.h$b");
    }

    /* renamed from: a */
    public static void m36738a(int i, fy0 fy0) {
        fy0.mo67108c(7);
        byte[] bArr = fy0.f33778a;
        bArr[0] = -84;
        bArr[1] = SignedBytes.MAX_POWER_OF_TWO;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }
}
