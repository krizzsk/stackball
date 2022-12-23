package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.n8 */
class C14061n8 implements w80 {

    /* renamed from: a */
    private final C12861d8 f37661a;

    /* renamed from: b */
    private final C12961e8 f37662b;

    C14061n8(C12861d8 d8Var, C12961e8 e8Var) {
        this.f37661a = d8Var;
        this.f37662b = e8Var;
    }

    /* renamed from: a */
    public ri0<NativeAdView> mo67427a(Context context, AdResponse<?> adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        C12982el a = this.f37661a.mo66521a(adResponse, nativeAd, qhVar, nativeAdEventListener, C12066R.string.yandex_ads_internal_install_from_google_play);
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        return new ri0<>(C12066R.layout.f29025xe5245310, NativeAdView.class, a, new C14459rg(this.f37662b.mo66773a(adResponse, 1), new xn0(adAssets, new C13837l8(adAssets).mo68375b(context.getResources()))));
    }
}
