package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

class p01 implements w80 {

    /* renamed from: a */
    private final C12982el<NativeAdView> f38427a;

    /* renamed from: b */
    private final C13977mg f38428b = new C13977mg();

    p01(C12982el<NativeAdView> elVar) {
        this.f38427a = elVar;
    }

    /* renamed from: a */
    public ri0<NativeAdView> mo67427a(Context context, AdResponse<?> adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        return new ri0<>(C12066R.layout.yandex_ads_internal_native_interstitial_portrait, NativeAdView.class, new C14383qg(this.f38428b.mo68682a(nativeAd, qhVar, nativeAdEventListener, this.f38427a), new yl0(nativeAd.getAdAssets()), new xp1(), new C13047fe(nativeAd), new C12875de(context)), new ix0(1));
    }
}
