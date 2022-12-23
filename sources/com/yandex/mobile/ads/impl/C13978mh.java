package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s71;

/* renamed from: com.yandex.mobile.ads.impl.mh */
public class C13978mh implements s71 {

    /* renamed from: a */
    private final long f37375a;

    /* renamed from: b */
    private final long f37376b;

    /* renamed from: c */
    private final int f37377c;

    /* renamed from: d */
    private final long f37378d;

    /* renamed from: e */
    private final int f37379e;

    /* renamed from: f */
    private final long f37380f;

    public C13978mh(long j, long j2, int i, int i2) {
        this.f37375a = j;
        this.f37376b = j2;
        this.f37377c = i2 == -1 ? 1 : i2;
        this.f37379e = i;
        if (j == -1) {
            this.f37378d = -1;
            this.f37380f = -9223372036854775807L;
            return;
        }
        this.f37378d = j - j2;
        this.f37380f = m39450a(j, j2, i);
    }

    /* renamed from: a */
    public boolean mo64897a() {
        return this.f37378d != -1;
    }

    /* renamed from: b */
    public s71.C14566a mo64898b(long j) {
        long j2 = this.f37378d;
        if (j2 == -1) {
            u71 u71 = new u71(0, this.f37376b);
            return new s71.C14566a(u71, u71);
        }
        long j3 = (long) this.f37377c;
        long j4 = (((((long) this.f37379e) * j) / 8000000) / j3) * j3;
        long j5 = j2 - j3;
        int i = ih1.f34858a;
        long max = this.f37376b + Math.max(0, Math.min(j4, j5));
        long c = mo68689c(max);
        u71 u712 = new u71(c, max);
        if (c < j) {
            long j6 = max + ((long) this.f37377c);
            if (j6 < this.f37375a) {
                return new s71.C14566a(u712, new u71(mo68689c(j6), j6));
            }
        }
        return new s71.C14566a(u712, u712);
    }

    /* renamed from: c */
    public long mo64899c() {
        return this.f37380f;
    }

    /* renamed from: a */
    private static long m39450a(long j, long j2, int i) {
        return ((Math.max(0, j - j2) * 8) * 1000000) / ((long) i);
    }

    /* renamed from: c */
    public long mo68689c(long j) {
        return ((Math.max(0, j - this.f37376b) * 8) * 1000000) / ((long) this.f37379e);
    }
}
