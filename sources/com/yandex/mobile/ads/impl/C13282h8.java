package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.h8 */
class C13282h8 implements w80 {

    /* renamed from: a */
    private final C12861d8 f34286a;

    /* renamed from: b */
    private final C12961e8 f34287b;

    C13282h8(C12861d8 d8Var, C12961e8 e8Var) {
        this.f34286a = d8Var;
        this.f34287b = e8Var;
    }

    /* renamed from: a */
    public ri0<NativeAdView> mo67427a(Context context, AdResponse<?> adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        C12982el a = this.f34286a.mo66521a(adResponse, nativeAd, qhVar, nativeAdEventListener, C12066R.string.yandex_ads_internal_install_from_google_play);
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        return new ri0<>(C12066R.layout.yandex_ads_internal_app_install_fullscreen_landscape_base, NativeAdView.class, a, new C14459rg(this.f34287b.mo66773a(adResponse, 2), new yn0(adAssets, new C13181g8(adAssets).mo67206a(context.getResources()))));
    }
}
