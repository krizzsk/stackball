package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.banner.C12072b;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.mediation.banner.C15426d;

class xm0 implements C12964eb {

    /* renamed from: a */
    private final AdResponse<String> f42632a;

    /* renamed from: b */
    private final MediationData f42633b;

    xm0(AdResponse<String> adResponse, MediationData mediationData) {
        this.f42632a = adResponse;
        this.f42633b = mediationData;
    }

    /* renamed from: a */
    public C12866db mo66793a(C12072b bVar) {
        return new C15426d(bVar, this.f42632a, this.f42633b);
    }
}
