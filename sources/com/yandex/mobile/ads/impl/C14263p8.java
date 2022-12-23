package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.p8 */
class C14263p8 implements w80 {

    /* renamed from: a */
    private final C12861d8 f38544a;

    /* renamed from: b */
    private final C12961e8 f38545b;

    C14263p8(C12861d8 d8Var, C12961e8 e8Var) {
        this.f38544a = d8Var;
        this.f38545b = e8Var;
    }

    /* renamed from: a */
    public ri0<NativeAdView> mo67427a(Context context, AdResponse<?> adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        return new ri0<>(C12066R.layout.f29027x7a17ab47, NativeAdView.class, this.f38544a.mo66521a(adResponse, nativeAd, qhVar, nativeAdEventListener, C12066R.string.yandex_ads_internal_install_from_google_play), this.f38545b.mo66773a(adResponse, 1));
    }
}
