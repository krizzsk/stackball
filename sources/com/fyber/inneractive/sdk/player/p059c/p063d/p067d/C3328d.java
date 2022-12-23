package com.fyber.inneractive.sdk.player.p059c.p063d.p067d;

import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.d.d */
final class C3328d {

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.d$a */
    public static final class C3329a {

        /* renamed from: a */
        public final long[] f8694a;

        /* renamed from: b */
        public final int[] f8695b;

        /* renamed from: c */
        public final int f8696c;

        /* renamed from: d */
        public final long[] f8697d;

        /* renamed from: e */
        public final int[] f8698e;

        /* synthetic */ C3329a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, byte b) {
            this(jArr, iArr, i, jArr2, iArr2);
        }

        private C3329a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
            this.f8694a = jArr;
            this.f8695b = iArr;
            this.f8696c = i;
            this.f8697d = jArr2;
            this.f8698e = iArr2;
        }
    }

    /* renamed from: a */
    public static C3329a m8231a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        for (int a : iArr2) {
            i3 += C3560t.m8871a(a, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr3 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr4 = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            int i8 = iArr2[i7];
            long j2 = jArr[i7];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i5] = j2;
                iArr3[i5] = i * min;
                i6 = Math.max(i6, iArr3[i5]);
                jArr3[i5] = ((long) i4) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i4 += min;
                i8 -= min;
                i5++;
            }
        }
        return new C3329a(jArr2, iArr3, i6, jArr3, iArr4, (byte) 0);
    }
}
