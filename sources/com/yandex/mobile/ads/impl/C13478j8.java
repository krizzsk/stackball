package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.j8 */
class C13478j8 implements w80 {

    /* renamed from: a */
    private final C12861d8 f35143a;

    /* renamed from: b */
    private final C12961e8 f35144b;

    C13478j8(C12861d8 d8Var, C12961e8 e8Var) {
        this.f35143a = d8Var;
        this.f35144b = e8Var;
    }

    /* renamed from: a */
    public ri0<NativeAdView> mo67427a(Context context, AdResponse<?> adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        return new ri0<>(C12066R.layout.f29024xa37adb3c, NativeAdView.class, this.f35143a.mo66521a(adResponse, nativeAd, qhVar, nativeAdEventListener, C12066R.string.yandex_ads_internal_install), this.f35144b.mo66773a(adResponse, 2));
    }
}
