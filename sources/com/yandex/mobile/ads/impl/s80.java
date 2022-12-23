package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.SliderAd;

public class s80 implements C12982el<NativeAdView> {

    /* renamed from: a */
    private final C12982el<NativeAdView> f39878a;

    public s80(NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener) {
        if (nativeAd instanceof SliderAd) {
            this.f39878a = new k91((SliderAd) nativeAd, qhVar, nativeAdEventListener);
        } else {
            this.f39878a = new jr0(nativeAd, qhVar, nativeAdEventListener);
        }
    }

    /* renamed from: a */
    public void mo65684a(ViewGroup viewGroup) {
        NativeAdView nativeAdView = (NativeAdView) viewGroup;
        C12982el<NativeAdView> elVar = this.f39878a;
        if (elVar != null) {
            elVar.mo65684a(nativeAdView);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
        C12982el<NativeAdView> elVar = this.f39878a;
        if (elVar != null) {
            elVar.mo65685c();
        }
    }
}
