package com.fyber.inneractive.sdk.player.p059c.p063d.p065b;

import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.b.f */
final class C3255f {

    /* renamed from: b */
    private static final long[] f8300b = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    int f8301a;

    /* renamed from: c */
    private final byte[] f8302c = new byte[8];

    /* renamed from: d */
    private int f8303d;

    /* renamed from: a */
    public final void mo19033a() {
        this.f8303d = 0;
        this.f8301a = 0;
    }

    /* renamed from: a */
    public final long mo19032a(C3269g gVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f8303d == 0) {
            if (!gVar.mo19007a(this.f8302c, 0, 1, z)) {
                return -1;
            }
            int a = m7957a(this.f8302c[0] & 255);
            this.f8301a = a;
            if (a != -1) {
                this.f8303d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f8301a;
        if (i2 > i) {
            this.f8303d = 0;
            return -2;
        }
        if (i2 != 1) {
            gVar.mo19010b(this.f8302c, 1, i2 - 1);
        }
        this.f8303d = 0;
        return m7958a(this.f8302c, this.f8301a, z2);
    }

    /* renamed from: a */
    public static int m7957a(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f8300b;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* renamed from: a */
    public static long m7958a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f8300b[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
