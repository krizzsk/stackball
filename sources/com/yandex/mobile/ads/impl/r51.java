package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

public class r51 {
    /* renamed from: a */
    public y70 mo69695a(AdResponse<?> adResponse, u51 u51, ht0 ht0) {
        au0 a = ht0.mo67625a();
        yu0 b = ht0.mo67626b();
        if (a != null) {
            return new lu0(adResponse, a, u51);
        }
        if (b != null) {
            return new av0(b, u51);
        }
        return new ss0(adResponse, u51);
    }
}
