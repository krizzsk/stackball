package com.yandex.mobile.ads.impl;

import java.util.Arrays;

public final class ck0 {

    /* renamed from: a */
    private int f31961a;

    /* renamed from: b */
    private long[] f31962b;

    public ck0(int i) {
        this.f31962b = new long[i];
    }

    /* renamed from: a */
    public void mo66319a(long j) {
        int i = this.f31961a;
        long[] jArr = this.f31962b;
        if (i == jArr.length) {
            this.f31962b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f31962b;
        int i2 = this.f31961a;
        this.f31961a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long[] mo66320b() {
        return Arrays.copyOf(this.f31962b, this.f31961a);
    }

    /* renamed from: a */
    public long mo66318a(int i) {
        if (i >= 0 && i < this.f31961a) {
            return this.f31962b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f31961a);
    }

    /* renamed from: a */
    public int mo66317a() {
        return this.f31961a;
    }
}
