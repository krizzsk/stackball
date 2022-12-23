package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.d80;
import com.yandex.mobile.ads.impl.m80;
import com.yandex.mobile.ads.impl.om0;
import com.yandex.mobile.ads.impl.sm0;
import com.yandex.mobile.ads.impl.ty0;
import com.yandex.mobile.ads.impl.wm0;
import com.yandex.mobile.ads.impl.ym0;
import com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter;

/* renamed from: com.yandex.mobile.ads.mediation.interstitial.d */
public class C15439d implements d80 {

    /* renamed from: a */
    private final om0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> f43604a;

    /* renamed from: b */
    private final C15438c f43605b;

    /* renamed from: c */
    private final MediatedInterstitialAdapter.MediatedInterstitialAdapterListener f43606c;

    public C15439d(m80 m80, AdResponse adResponse, MediationData mediationData) {
        C14645t1 d = m80.mo64592d();
        ym0 ym0 = new ym0(d);
        wm0 wm0 = new wm0(d, adResponse);
        C15437b bVar = new C15437b(new sm0(mediationData.mo64546c(), ym0, wm0));
        ty0 ty0 = new ty0(m80, mediationData);
        C15438c cVar = new C15438c();
        this.f43605b = cVar;
        om0 om0 = new om0(d, m80.mo64593e(), cVar, wm0, bVar, ty0);
        this.f43604a = om0;
        this.f43606c = new C15436a(m80, om0);
    }

    /* renamed from: a */
    public void mo66522a(Context context) {
        this.f43604a.mo69207a(context);
    }

    /* renamed from: b */
    public void mo66525b() {
        MediatedInterstitialAdapter a = this.f43605b.mo71400a();
        if (a != null) {
            a.showInterstitial();
        }
    }

    /* renamed from: a */
    public boolean mo66524a() {
        return this.f43605b.mo71401b();
    }

    /* renamed from: a */
    public void mo66523a(Context context, AdResponse<String> adResponse) {
        this.f43604a.mo69210a(context, this.f43606c);
    }
}
