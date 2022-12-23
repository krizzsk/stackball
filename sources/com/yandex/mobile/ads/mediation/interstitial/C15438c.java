package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.impl.rm0;
import com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.interstitial.c */
class C15438c implements rm0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> {

    /* renamed from: a */
    private MediatedInterstitialAdapter f43603a;

    C15438c() {
    }

    /* renamed from: a */
    public void mo69785a(Object obj) {
        ((MediatedInterstitialAdapter) obj).onInvalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo71401b() {
        MediatedInterstitialAdapter mediatedInterstitialAdapter = this.f43603a;
        return mediatedInterstitialAdapter != null && mediatedInterstitialAdapter.isLoaded();
    }

    /* renamed from: a */
    public void mo69784a(Context context, Object obj, Object obj2, Map map, Map map2) {
        MediatedInterstitialAdapter mediatedInterstitialAdapter = (MediatedInterstitialAdapter) obj;
        this.f43603a = mediatedInterstitialAdapter;
        mediatedInterstitialAdapter.loadInterstitial(context, (MediatedInterstitialAdapter.MediatedInterstitialAdapterListener) obj2, map, map2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public MediatedInterstitialAdapter mo71400a() {
        return this.f43603a;
    }
}
