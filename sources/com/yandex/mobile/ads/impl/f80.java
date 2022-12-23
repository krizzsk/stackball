package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.C12110a;
import com.yandex.mobile.ads.base.model.MediationData;

public class f80 {
    /* renamed from: a */
    public e80 mo66937a(AdResponse<String> adResponse) {
        MediationData x = adResponse.mo64445x();
        if (x != null) {
            return new zm0(adResponse, x);
        }
        if (C12110a.NATIVE.equals(adResponse.mo64439s())) {
            return new hs1();
        }
        return new xr1();
    }
}
