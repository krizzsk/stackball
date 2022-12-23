package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

public class to1<T> implements bl1, dl1 {

    /* renamed from: a */
    private final ck1<T> f40405a;

    /* renamed from: b */
    private final tn1 f40406b;

    /* renamed from: c */
    private final ll1 f40407c;

    /* renamed from: d */
    private final ln1 f40408d;

    /* renamed from: e */
    private final mk1<T> f40409e;

    /* renamed from: f */
    private Long f40410f;

    /* renamed from: g */
    private boolean f40411g;

    public to1(ck1<T> ck1, rn1 rn1, ll1 ll1, ln1 ln1, mk1<T> mk1) {
        this.f40405a = ck1;
        this.f40406b = new tn1(rn1, 50);
        this.f40407c = ll1;
        this.f40408d = ln1;
        this.f40409e = mk1;
    }

    /* renamed from: a */
    public void mo66071a(long j, long j2) {
        boolean a = this.f40406b.mo70209a();
        if (this.f40411g) {
            return;
        }
        if (!a || this.f40407c.mo68486a() != kl1.PLAYING) {
            this.f40410f = null;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.f40410f;
        if (l == null) {
            this.f40410f = Long.valueOf(elapsedRealtime);
            this.f40409e.mo66696k(this.f40405a);
        } else if (elapsedRealtime - l.longValue() >= 2000) {
            this.f40411g = true;
            this.f40409e.mo66695j(this.f40405a);
            this.f40408d.mo65771m();
        }
    }

    /* renamed from: b */
    public void mo66331b() {
        this.f40410f = null;
    }

    /* renamed from: a */
    public void mo66328a() {
        this.f40410f = null;
    }
}
