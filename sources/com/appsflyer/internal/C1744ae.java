package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.ae */
public class C1744ae {
    /* renamed from: ǃ */
    static long[] m3852(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            long j = jArr[i3 - 1];
            jArr[i3] = ((j ^ (j >> 30)) * 1812433253) + ((long) i3);
        }
        return jArr;
    }

    /* renamed from: ι */
    static void m3853(long[] jArr, long[] jArr2, int i) {
        int i2 = (i + 2) % 4;
        int i3 = (i + 3) % 4;
        jArr2[i3] = ((jArr[i3] * 2147483085) + jArr2[i2]) / 2147483647L;
        jArr[i3] = ((jArr[i % 4] * 2147483085) + jArr2[i2]) % 2147483647L;
    }
}
