package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

public class hi1 implements r41<List<lj1>> {

    /* renamed from: a */
    private final C12563b1 f34424a;

    /* renamed from: b */
    private final r41<og0> f34425b;

    /* renamed from: c */
    private final pg0 f34426c;

    hi1(Context context, C12563b1 b1Var, r41<og0> r41) {
        this.f34424a = b1Var;
        this.f34425b = r41;
        this.f34426c = new pg0(context);
    }

    /* renamed from: a */
    public void mo66590a(Object obj) {
        og0 a = this.f34426c.mo69367a(this.f34424a, (List) obj);
        if (a != null) {
            this.f34425b.mo66590a(a);
            return;
        }
        this.f34425b.mo66589a(wj1.m43664b("Failed to parse ad break"));
    }

    /* renamed from: a */
    public void mo66589a(wj1 wj1) {
        this.f34425b.mo66589a(wj1);
    }
}
