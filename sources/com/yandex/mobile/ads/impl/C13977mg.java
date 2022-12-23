package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.mg */
public class C13977mg {
    /* renamed from: a */
    public C12982el<NativeAdView> mo68682a(NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12982el<NativeAdView> elVar) {
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        return new C14383qg(new t80(nativeAd, qhVar, nativeAdEventListener), new C13178g7(adAssets), new sl0(adAssets), new k21(adAssets), elVar);
    }
}
