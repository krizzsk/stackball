package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

class ni0 implements w80 {

    /* renamed from: a */
    private final C12982el<NativeAdView> f37807a;

    /* renamed from: b */
    private final a51 f37808b = new a51();

    /* renamed from: c */
    private final C13977mg f37809c = new C13977mg();

    public ni0(C12982el<NativeAdView> elVar) {
        this.f37807a = elVar;
    }

    /* renamed from: a */
    public ri0<NativeAdView> mo67427a(Context context, AdResponse<?> adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        return new ri0<>(C12066R.layout.f29029x935a4dbd, NativeAdView.class, new C14383qg(new C14679tg(adAssets, this.f37808b.mo65681a(context, C12066R.dimen.yandex_ads_internal_landscape_horizontal_icon_size)), this.f37809c.mo68682a(nativeAd, qhVar, nativeAdEventListener, this.f37807a), new gl0(adAssets), new kz0(adAssets), new xp1(), new C13047fe(nativeAd)), new ix0(2));
    }
}
