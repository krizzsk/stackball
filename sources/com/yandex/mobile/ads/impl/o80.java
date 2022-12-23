package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.Collections;

public class o80 implements w80 {

    /* renamed from: a */
    private final C12982el<NativeAdView> f38111a;

    /* renamed from: b */
    private final C13977mg f38112b = new C13977mg();

    /* renamed from: c */
    private final p80 f38113c = new p80();

    public o80(C12982el<NativeAdView> elVar) {
        this.f38111a = elVar;
    }

    /* renamed from: a */
    public ri0<NativeAdView> mo67427a(Context context, AdResponse<?> adResponse, NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener, C12947e0 e0Var) {
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        return new ri0<>(this.f38113c.mo69328a(context, adAssets), NativeAdView.class, new C14383qg(this.f38112b.mo68682a(nativeAd, qhVar, nativeAdEventListener, this.f38111a), new v11(), new gl0(nativeAd.getAdAssets()), new C14896vl(), new C13197ge(), new C13407ie(adResponse, C12066R.string.yandex_ads_internal_go), new C13330hl(C12066R.C12068id.design_degradation_container, Collections.singletonList(Integer.valueOf(C12066R.C12068id.body)))), new C13418il(adResponse, "fullscreen-content-v1"));
    }
}
