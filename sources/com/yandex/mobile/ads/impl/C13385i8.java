package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.i8 */
class C13385i8 implements w80 {

    /* renamed from: a */
    private final C12861d8 f34764a;

    /* renamed from: b */
    private final C12961e8 f34765b;

    C13385i8(C12861d8 d8Var, C12961e8 e8Var) {
        this.f34764a = d8Var;
        this.f34765b = e8Var;
    }

    /* renamed from: a */
    public ri0<NativeAdView> mo67427a(Context context, AdResponse<?> adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        C14383qg qgVar = new C14383qg(this.f34764a.mo66521a(adResponse, nativeAd, qhVar, nativeAdEventListener, C12066R.string.yandex_ads_internal_install), new t90(nativeAd.getAdAssets()));
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        return new ri0<>(C12066R.layout.f29023x72b49a56, NativeAdView.class, qgVar, new C14459rg(this.f34765b.mo66773a(adResponse, 2), new yn0(adAssets, new C13181g8(adAssets).mo67207b(context.getResources()))));
    }
}
