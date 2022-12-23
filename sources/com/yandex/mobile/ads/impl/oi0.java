package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

class oi0 implements w80 {

    /* renamed from: a */
    private final C12982el<NativeAdView> f38233a;

    /* renamed from: b */
    private final a51 f38234b = new a51();

    /* renamed from: c */
    private final C13977mg f38235c = new C13977mg();

    public oi0(C12982el<NativeAdView> elVar) {
        this.f38233a = elVar;
    }

    /* renamed from: a */
    public ri0<NativeAdView> mo67427a(Context context, AdResponse<?> adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        return new ri0<>(C12066R.layout.yandex_ads_internal_native_interstitial_landscape_vetrical_media, NativeAdView.class, new C14383qg(new C14679tg(adAssets, this.f38234b.mo65681a(context, C12066R.dimen.yandex_ads_internal_landscape_vertical_icon_size)), this.f38235c.mo68682a(nativeAd, qhVar, nativeAdEventListener, this.f38233a), new gl0(adAssets), new kz0(adAssets), new xp1(), new C13047fe(nativeAd)), new C14459rg(new ix0(2), new ll0(nativeAd.getAdAssets(), this.f38234b.mo65681a(context, C12066R.dimen.yandex_ads_internal_landscape_vertical_media_content_min_width))));
    }
}
