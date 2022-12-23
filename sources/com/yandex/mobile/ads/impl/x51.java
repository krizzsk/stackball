package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.C15526t;
import com.yandex.mobile.ads.nativeads.NativeAdView;

class x51 {

    /* renamed from: a */
    private final AdResponse<?> f42433a;

    /* renamed from: b */
    private final C15526t f42434b;

    /* renamed from: c */
    private final C12947e0 f42435c;

    /* renamed from: d */
    private final C14384qh f42436d;

    /* renamed from: e */
    private final C13371i0 f42437e;

    x51(AdResponse<?> adResponse, C15526t tVar, C12947e0 e0Var, C14384qh qhVar, C13371i0 i0Var) {
        this.f42433a = adResponse;
        this.f42434b = tVar;
        this.f42435c = e0Var;
        this.f42436d = qhVar;
        this.f42437e = i0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12982el<NativeAdView> mo70830a(br0 br0, ae1 ae1) {
        q51 q51 = new q51(this.f42437e);
        ht0 a = this.f42434b.mo71674a();
        return new C14383qg(new a61(this.f42433a, this.f42435c, this.f42436d, br0, a), new p51(this.f42433a, this.f42435c, q51, a), new g61(this.f42433a, this.f42435c, ae1, a));
    }
}
