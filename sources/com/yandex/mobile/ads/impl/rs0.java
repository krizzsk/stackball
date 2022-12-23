package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;

class rs0 {
    rs0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo69809a(AdResponse adResponse) {
        C12115n l = adResponse.mo64432l();
        Long r = adResponse.mo64438r();
        if (r == null) {
            if (l == C12115n.REWARDED) {
                r = 5000L;
            } else {
                r = 0L;
            }
        }
        return r.longValue();
    }
}
