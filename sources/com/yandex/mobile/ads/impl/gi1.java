package com.yandex.mobile.ads.impl;

public class gi1<T> implements bl1 {

    /* renamed from: a */
    private final sn1 f34008a;

    /* renamed from: b */
    private final ck1<T> f34009b;

    /* renamed from: c */
    private final ln1 f34010c;

    /* renamed from: d */
    private final mk1<T> f34011d;

    /* renamed from: e */
    private boolean f34012e;

    public gi1(ck1<T> ck1, rn1 rn1, ln1 ln1, mk1<T> mk1) {
        this.f34009b = ck1;
        this.f34010c = ln1;
        this.f34011d = mk1;
        this.f34008a = new sn1(rn1, 1);
    }

    /* renamed from: a */
    public void mo66071a(long j, long j2) {
        boolean a = this.f34008a.mo70036a();
        if (!this.f34012e && a) {
            this.f34012e = true;
            this.f34010c.mo65753a();
            this.f34011d.mo66687b(this.f34009b);
        }
    }
}
