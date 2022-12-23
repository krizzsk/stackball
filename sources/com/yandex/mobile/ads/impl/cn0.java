package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.mediation.nativeads.C15457l;
import com.yandex.mobile.ads.nativeads.C15512n;

class cn0 implements ps0 {

    /* renamed from: a */
    private final AdResponse<as0> f31975a;

    /* renamed from: b */
    private final MediationData f31976b;

    cn0(AdResponse<as0> adResponse, MediationData mediationData) {
        this.f31975a = adResponse;
        this.f31976b = mediationData;
    }

    /* renamed from: a */
    public os0 mo66334a(C15512n nVar) {
        return new C15457l(nVar, this.f31975a, this.f31976b);
    }
}
