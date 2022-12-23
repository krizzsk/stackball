package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import com.yandex.mobile.ads.banner.C12072b;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.C12866db;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.om0;
import com.yandex.mobile.ads.impl.sm0;
import com.yandex.mobile.ads.impl.ty0;
import com.yandex.mobile.ads.impl.wm0;
import com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter;

/* renamed from: com.yandex.mobile.ads.mediation.banner.d */
public class C15426d implements C12866db {

    /* renamed from: a */
    private final MediatedBannerAdapter.MediatedBannerAdapterListener f43582a;

    /* renamed from: b */
    private final om0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> f43583b;

    public C15426d(C12072b bVar, AdResponse<String> adResponse, MediationData mediationData) {
        C14645t1 d = bVar.mo64592d();
        C15427e eVar = new C15427e(d);
        wm0 wm0 = new wm0(d, adResponse);
        om0 om0 = new om0(d, bVar.mo64593e(), new C15425c(), wm0, new C15424b(new sm0(mediationData.mo64546c(), eVar, wm0)), new ty0(bVar, mediationData));
        this.f43583b = om0;
        this.f43582a = new C15421a(bVar, om0, new C15428f(bVar.mo64353A()));
    }

    /* renamed from: a */
    public void mo66541a(Context context) {
        this.f43583b.mo69207a(context);
    }

    /* renamed from: a */
    public void mo66542a(Context context, AdResponse<String> adResponse) {
        this.f43583b.mo69210a(context, this.f43582a);
    }
}
