package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s71;

final class cq1 implements s71 {

    /* renamed from: a */
    private final aq1 f32019a;

    /* renamed from: b */
    private final int f32020b;

    /* renamed from: c */
    private final long f32021c;

    /* renamed from: d */
    private final long f32022d;

    /* renamed from: e */
    private final long f32023e;

    public cq1(aq1 aq1, int i, long j, long j2) {
        this.f32019a = aq1;
        this.f32020b = i;
        this.f32021c = j;
        long j3 = (j2 - j) / ((long) aq1.f30662d);
        this.f32022d = j3;
        this.f32023e = m34806c(j3);
    }

    /* renamed from: a */
    public boolean mo64897a() {
        return true;
    }

    /* renamed from: b */
    public s71.C14566a mo64898b(long j) {
        int i = ih1.f34858a;
        long max = Math.max(0, Math.min((((long) this.f32019a.f30661c) * j) / (((long) this.f32020b) * 1000000), this.f32022d - 1));
        long j2 = this.f32021c + (((long) this.f32019a.f30662d) * max);
        long c = m34806c(max);
        u71 u71 = new u71(c, j2);
        if (c >= j || max == this.f32022d - 1) {
            return new s71.C14566a(u71, u71);
        }
        long j3 = max + 1;
        return new s71.C14566a(u71, new u71(m34806c(j3), this.f32021c + (((long) this.f32019a.f30662d) * j3)));
    }

    /* renamed from: c */
    public long mo64899c() {
        return this.f32023e;
    }

    /* renamed from: c */
    private long m34806c(long j) {
        return ih1.m37369a(j * ((long) this.f32020b), 1000000, (long) this.f32019a.f30661c);
    }
}
