package com.yandex.mobile.ads.impl;

public class kq0 {

    /* renamed from: a */
    private final kg0 f36378a;

    /* renamed from: b */
    private final C13952m3 f36379b;

    public kq0(kg0 kg0) {
        this.f36378a = kg0;
        this.f36379b = new C13952m3(kg0);
    }

    /* renamed from: a */
    public void mo68260a(qj1 qj1, yf0 yf0) {
        float a = yf0.mo71044a();
        boolean d = yf0.mo71047d();
        iq0 e = qj1.mo69608e();
        jq0 jq0 = new jq0(this.f36378a, this.f36379b, yf0, e);
        if (e != null) {
            e.setOnClickListener(jq0);
            e.setMuted(d);
        }
        this.f36379b.mo68558a(a, d);
    }
}
