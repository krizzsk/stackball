package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.as0;
import com.yandex.mobile.ads.impl.om0;
import com.yandex.mobile.ads.impl.os0;
import com.yandex.mobile.ads.impl.sm0;
import com.yandex.mobile.ads.impl.ty0;
import com.yandex.mobile.ads.impl.wm0;
import com.yandex.mobile.ads.impl.ym0;
import com.yandex.mobile.ads.nativeads.C15512n;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.l */
public class C15457l implements os0 {

    /* renamed from: a */
    private final MediatedNativeAdapterListener f43662a;

    /* renamed from: b */
    private final om0<MediatedNativeAdapter, MediatedNativeAdapterListener> f43663b;

    public C15457l(C15512n nVar, AdResponse<as0> adResponse, MediationData mediationData) {
        C14645t1 d = nVar.mo64592d();
        ym0 ym0 = new ym0(d);
        wm0 wm0 = new wm0(d, adResponse);
        om0 om0 = new om0(d, nVar.mo64593e(), new C15456k(), wm0, new C15455j(new sm0(mediationData.mo64546c(), ym0, wm0)), new ty0(nVar, mediationData));
        this.f43663b = om0;
        this.f43662a = new C15463r(adResponse, nVar, om0);
    }

    /* renamed from: a */
    public void mo67079a(Context context, AdResponse<as0> adResponse) {
        this.f43663b.mo69210a(context, this.f43662a);
    }
}
