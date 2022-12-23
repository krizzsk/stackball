package com.yandex.mobile.ads.impl;

public final class p31 {

    /* renamed from: a */
    private long f38511a;

    /* renamed from: b */
    private long f38512b;

    /* renamed from: c */
    private long f38513c;

    /* renamed from: d */
    private long f38514d;

    /* renamed from: e */
    private long f38515e;

    /* renamed from: a */
    public final long mo69305a() {
        return this.f38515e;
    }

    /* renamed from: b */
    public final long mo69307b() {
        return this.f38514d;
    }

    /* renamed from: c */
    public final long mo69309c() {
        return this.f38513c;
    }

    /* renamed from: d */
    public final long mo69311d() {
        return Math.max(this.f38511a, this.f38512b) + this.f38513c + this.f38514d + this.f38515e;
    }

    /* renamed from: e */
    public final void mo69314e(long j) {
        this.f38512b = j;
    }

    /* renamed from: a */
    public final void mo69306a(long j) {
        this.f38515e += j;
    }

    /* renamed from: b */
    public final void mo69308b(long j) {
        this.f38514d += j;
    }

    /* renamed from: c */
    public final void mo69310c(long j) {
        this.f38513c += j;
    }

    /* renamed from: d */
    public final void mo69312d(long j) {
        this.f38511a = j;
    }

    /* renamed from: e */
    public final void mo69313e() {
        this.f38513c = 0;
        this.f38514d = 0;
        this.f38515e = 0;
        this.f38511a = 0;
        this.f38512b = 0;
    }
}
