package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.o8 */
class C14172o8 implements w80 {

    /* renamed from: a */
    private final C12861d8 f38109a;

    /* renamed from: b */
    private final C12961e8 f38110b;

    C14172o8(C12861d8 d8Var, C12961e8 e8Var) {
        this.f38109a = d8Var;
        this.f38110b = e8Var;
    }

    /* renamed from: a */
    public ri0<NativeAdView> mo67427a(Context context, AdResponse<?> adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        C12982el a = this.f38109a.mo66521a(adResponse, nativeAd, qhVar, nativeAdEventListener, C12066R.string.yandex_ads_internal_install_from_google_play);
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        return new ri0<>(C12066R.layout.f29026x7f0239c2, NativeAdView.class, a, new C14459rg(this.f38110b.mo66773a(adResponse, 1), new xn0(adAssets, new C13837l8(adAssets).mo68376c(context.getResources()))));
    }
}
