package com.fyber.inneractive.sdk.player.p059c.p080k;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.f */
public final class C3541f {

    /* renamed from: a */
    public int f9602a;

    /* renamed from: b */
    private long[] f9603b;

    public C3541f() {
        this((byte) 0);
    }

    private C3541f(byte b) {
        this.f9603b = new long[32];
    }

    /* renamed from: a */
    public final void mo19373a(long j) {
        int i = this.f9602a;
        long[] jArr = this.f9603b;
        if (i == jArr.length) {
            this.f9603b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f9603b;
        int i2 = this.f9602a;
        this.f9602a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: a */
    public final long mo19372a(int i) {
        if (i >= 0 && i < this.f9602a) {
            return this.f9603b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f9602a);
    }
}
