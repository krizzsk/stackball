package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* renamed from: com.yandex.mobile.ads.impl.cb */
public class C12719cb {
    /* renamed from: a */
    public C12964eb mo66243a(AdResponse<String> adResponse) {
        MediationData x = adResponse.mo64445x();
        if (x != null) {
            return new xm0(adResponse, x);
        }
        return new rr1();
    }
}
