package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14662tb;

public class qp1 implements C14662tb.C14663a<fv0> {

    /* renamed from: a */
    private final r41<fv0> f39220a;

    public qp1(r41<fv0> r41) {
        this.f39220a = r41;
    }

    /* renamed from: a */
    public void mo64360a(Object obj) {
        fv0 fv0 = (fv0) obj;
        r41<fv0> r41 = this.f39220a;
        if (r41 != null) {
            r41.mo66590a(fv0);
        }
    }

    /* renamed from: a */
    public void mo64579a(op1 op1) {
        wj1 wj1;
        if (this.f39220a != null) {
            if (op1.f38296b == null) {
                wj1 = wj1.m43663a(op1.getMessage());
            } else {
                wj1 = wj1.m43664b("Ping error");
            }
            this.f39220a.mo66589a(wj1);
        }
    }
}
