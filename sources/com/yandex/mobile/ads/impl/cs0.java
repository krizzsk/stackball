package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

public class cs0 {
    /* renamed from: a */
    public ps0 mo66352a(AdResponse<as0> adResponse) {
        MediationData x = adResponse.mo64445x();
        if (x != null) {
            return new cn0(adResponse, x);
        }
        return new gs1();
    }
}
