package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.C15555x;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.SliderAd;

class k91 implements C12982el<NativeAdView> {

    /* renamed from: a */
    private final SliderAd f36057a;

    /* renamed from: b */
    private final C14384qh f36058b;

    /* renamed from: c */
    private final sq0 f36059c = new uq0();

    /* renamed from: d */
    private final hs0 f36060d;

    /* renamed from: e */
    private final C15555x f36061e;

    k91(SliderAd sliderAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener) {
        this.f36057a = sliderAd;
        this.f36058b = qhVar;
        this.f36060d = new hs0(sliderAd.getNativeAds(), nativeAdEventListener);
        this.f36061e = new C15555x();
    }

    /* renamed from: a */
    public void mo65684a(ViewGroup viewGroup) {
        try {
            this.f36057a.bindSliderAd(this.f36061e.mo71937a((NativeAdView) viewGroup, this.f36059c));
            C15117wu.m43870a().mo70754a((C14307pr) this.f36060d);
        } catch (NativeAdException unused) {
            this.f36058b.mo67136g();
        }
    }

    /* renamed from: c */
    public void mo65685c() {
        C15117wu.m43870a().mo70755b(this.f36060d);
        for (NativeAd nativeAdEventListener : this.f36057a.getNativeAds()) {
            nativeAdEventListener.setNativeAdEventListener((NativeAdEventListener) null);
        }
    }
}
