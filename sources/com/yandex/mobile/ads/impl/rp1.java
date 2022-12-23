package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14662tb;

public class rp1<T> implements C14662tb.C14663a<T> {

    /* renamed from: a */
    private final r41<T> f39532a;

    public rp1(r41<T> r41) {
        this.f39532a = r41;
    }

    /* renamed from: a */
    public void mo64360a(T t) {
        r41<T> r41 = this.f39532a;
        if (r41 != null) {
            r41.mo66590a(t);
        }
    }

    /* renamed from: a */
    public void mo64579a(op1 op1) {
        wj1 wj1;
        if (this.f39532a != null) {
            if (op1 instanceof e30) {
                wj1 = wj1.m43662a((e30) op1);
            } else if (op1 instanceof hy0) {
                hy0 hy0 = (hy0) op1;
                wj1 = wj1.m43661a();
            } else {
                fv0 fv0 = op1.f38296b;
                if (fv0 == null) {
                    wj1 = wj1.m43663a(op1.getMessage());
                } else if (fv0.f33755a >= 500) {
                    wj1 = wj1.m43665c("Server temporarily unavailable. Please, try again later.");
                } else {
                    wj1 = wj1.m43664b(("Network Error. " + " Code: " + fv0.f33755a + ".") + " Data: \n" + new String(fv0.f33756b));
                }
            }
            this.f39532a.mo66589a(wj1);
        }
    }
}
