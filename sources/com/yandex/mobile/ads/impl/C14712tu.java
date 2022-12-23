package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.tu */
public class C14712tu implements w80 {

    /* renamed from: a */
    private final C15340zq f40468a;

    /* renamed from: b */
    private final C12982el<NativeAdView> f40469b;

    /* renamed from: c */
    private final C13371i0 f40470c;

    /* renamed from: d */
    private final int f40471d;

    public C14712tu(C15340zq zqVar, C12982el<NativeAdView> elVar, C13371i0 i0Var, int i) {
        this.f40468a = zqVar;
        this.f40469b = elVar;
        this.f40470c = i0Var;
        this.f40471d = i;
    }

    /* renamed from: a */
    public ri0<NativeAdView> mo67427a(Context context, AdResponse<?> adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        return new ri0<>(C12066R.layout.yandex_ads_internal_divkit, NativeAdView.class, new C14383qg(new x41(this.f40470c, this.f40471d), new C13449iu(this.f40468a), new s80(nativeAd, qhVar, nativeAdEventListener), this.f40469b), new C14632su(adResponse));
    }
}
