package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAdView;

class lh0 {

    /* renamed from: a */
    private final AdResponse<?> f36668a;

    /* renamed from: b */
    private final C12947e0 f36669b;

    /* renamed from: c */
    private final C14384qh f36670c;

    public lh0(AdResponse<?> adResponse, C12947e0 e0Var, C14384qh qhVar) {
        this.f36668a = adResponse;
        this.f36669b = e0Var;
        this.f36670c = qhVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12982el<NativeAdView> mo68434a(br0 br0) {
        return new C12586bg(this.f36668a, this.f36669b, new yo1(), this.f36670c, br0);
    }
}
