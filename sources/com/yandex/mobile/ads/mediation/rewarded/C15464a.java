package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.d80;
import com.yandex.mobile.ads.impl.om0;
import com.yandex.mobile.ads.impl.sm0;
import com.yandex.mobile.ads.impl.ty0;
import com.yandex.mobile.ads.impl.wm0;
import com.yandex.mobile.ads.impl.ym0;
import com.yandex.mobile.ads.rewarded.C15559b;

/* renamed from: com.yandex.mobile.ads.mediation.rewarded.a */
public class C15464a implements d80 {

    /* renamed from: a */
    private final om0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> f43693a;

    /* renamed from: b */
    private final C15466c f43694b;

    /* renamed from: c */
    private final MediatedRewardedAdapterListener f43695c;

    public C15464a(C15559b bVar, AdResponse<String> adResponse, MediationData mediationData) {
        C14645t1 d = bVar.mo64592d();
        ym0 ym0 = new ym0(d);
        wm0 wm0 = new wm0(d, adResponse);
        C15465b bVar2 = new C15465b(new sm0(mediationData.mo64546c(), ym0, wm0));
        ty0 ty0 = new ty0(bVar, mediationData);
        C15466c cVar = new C15466c();
        this.f43694b = cVar;
        om0 om0 = new om0(d, bVar.mo64593e(), cVar, wm0, bVar2, ty0);
        this.f43693a = om0;
        this.f43695c = new C15467d(bVar, om0);
    }

    /* renamed from: a */
    public void mo66522a(Context context) {
        this.f43693a.mo69207a(context);
    }

    /* renamed from: b */
    public void mo66525b() {
        MediatedRewardedAdapter a = this.f43694b.mo71481a();
        if (a != null) {
            a.showRewardedAd();
        }
    }

    /* renamed from: a */
    public boolean mo66524a() {
        return this.f43694b.mo71482b();
    }

    /* renamed from: a */
    public void mo66523a(Context context, AdResponse<String> adResponse) {
        this.f43693a.mo69210a(context, this.f43695c);
    }
}
