package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.mediation.interstitial.C15439d;
import com.yandex.mobile.ads.mediation.rewarded.C15464a;
import com.yandex.mobile.ads.rewarded.C15559b;

class zm0 implements e80 {

    /* renamed from: a */
    private final AdResponse<String> f43230a;

    /* renamed from: b */
    private final MediationData f43231b;

    zm0(AdResponse<String> adResponse, MediationData mediationData) {
        this.f43230a = adResponse;
        this.f43231b = mediationData;
    }

    /* renamed from: a */
    public d80 mo66774a(m80 m80) {
        return new C15439d(m80, this.f43230a, this.f43231b);
    }

    /* renamed from: a */
    public d80 mo66775a(C15559b bVar) {
        return new C15464a(bVar, this.f43230a, this.f43231b);
    }
}
