package com.yandex.mobile.ads.impl;

import java.io.IOException;

final class wh1 {

    /* renamed from: d */
    private static final long[] f42012d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f42013a = new byte[8];

    /* renamed from: b */
    private int f42014b;

    /* renamed from: c */
    private int f42015c;

    /* renamed from: a */
    public long mo70705a(C13416ik ikVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f42014b == 0) {
            if (!ikVar.mo67809b(this.f42013a, 0, 1, z)) {
                return -1;
            }
            int a = m43651a(this.f42013a[0] & 255);
            this.f42015c = a;
            if (a != -1) {
                this.f42014b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f42015c;
        if (i2 > i) {
            this.f42014b = 0;
            return -2;
        }
        if (i2 != 1) {
            ikVar.mo67809b(this.f42013a, 1, i2 - 1, false);
        }
        this.f42014b = 0;
        return m43652a(this.f42013a, this.f42015c, z2);
    }

    /* renamed from: b */
    public void mo70706b() {
        this.f42014b = 0;
        this.f42015c = 0;
    }

    /* renamed from: a */
    public int mo70704a() {
        return this.f42015c;
    }

    /* renamed from: a */
    public static int m43651a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = f42012d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    /* renamed from: a */
    public static long m43652a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f42012d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
