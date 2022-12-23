package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.C15555x;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdView;

class jr0 implements C12982el<NativeAdView> {

    /* renamed from: a */
    private final NativeAd f35456a;

    /* renamed from: b */
    private final C14384qh f35457b;

    /* renamed from: c */
    private final NativeAdEventListener f35458c;

    /* renamed from: d */
    private final sq0 f35459d = new uq0();

    /* renamed from: e */
    private final C15555x f35460e = new C15555x();

    jr0(NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener) {
        this.f35456a = nativeAd;
        this.f35457b = qhVar;
        this.f35458c = nativeAdEventListener;
    }

    /* renamed from: a */
    public void mo65684a(ViewGroup viewGroup) {
        try {
            this.f35456a.bindNativeAd(this.f35460e.mo71937a((NativeAdView) viewGroup, this.f35459d));
            this.f35456a.setNativeAdEventListener(this.f35458c);
        } catch (NativeAdException unused) {
            this.f35457b.mo67136g();
        }
    }

    /* renamed from: c */
    public void mo65685c() {
        this.f35456a.setNativeAdEventListener((NativeAdEventListener) null);
    }
}
