package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public final class mp1 implements r41<ep1> {

    /* renamed from: a */
    private final C15230y2 f37457a;

    /* renamed from: b */
    private final r41<ep1> f37458b;

    public mp1(C15230y2 y2Var, r41<ep1> r41) {
        Intrinsics.checkNotNullParameter(y2Var, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(r41, "requestListener");
        this.f37457a = y2Var;
        this.f37458b = r41;
    }

    /* renamed from: a */
    public void mo66590a(Object obj) {
        ep1 ep1 = (ep1) obj;
        Intrinsics.checkNotNullParameter(ep1, "vmap");
        this.f37457a.mo70965a(C15139x2.VMAP_LOADING);
        this.f37458b.mo66590a(ep1);
    }

    /* renamed from: a */
    public void mo66589a(wj1 wj1) {
        Intrinsics.checkNotNullParameter(wj1, "error");
        this.f37457a.mo70965a(C15139x2.VMAP_LOADING);
        this.f37458b.mo66589a(wj1);
    }
}
