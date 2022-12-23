package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* renamed from: com.yandex.mobile.ads.impl.vf */
public class C14885vf {
    /* renamed from: a */
    public y70 mo70479a(AdResponse<?> adResponse, C15170xf xfVar, ht0 ht0) {
        au0 a = ht0.mo67625a();
        yu0 b = ht0.mo67626b();
        if (a != null) {
            return new zt0(adResponse, a, xfVar);
        }
        if (b != null) {
            return new xu0(b, xfVar);
        }
        return new qs0(adResponse, xfVar);
    }
}
