package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.d8 */
public class C12861d8 {

    /* renamed from: a */
    private final C12982el<NativeAdView> f32488a;

    /* renamed from: b */
    private final C13977mg f32489b = new C13977mg();

    public C12861d8(C12982el<NativeAdView> elVar) {
        this.f32488a = elVar;
    }

    /* renamed from: a */
    public C12982el mo66521a(AdResponse adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, int i) {
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        C12982el<NativeAdView> a = this.f32489b.mo68682a(nativeAd, qhVar, nativeAdEventListener, this.f32488a);
        C12594bl blVar = new C12594bl();
        zn0 zn0 = new zn0(adAssets, C12066R.C12067drawable.yandex_ads_internal_app_install_close_grey);
        return new C14383qg(a, new C13407ie(adResponse, i), blVar, zn0, new ao0(adAssets, C12066R.C12067drawable.yandex_ads_internal_app_install_feedback_grey));
    }
}
