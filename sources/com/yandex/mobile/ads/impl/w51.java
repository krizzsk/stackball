package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

public class w51 {
    /* renamed from: a */
    public y70 mo70650a(AdResponse<?> adResponse, r11 r11, ht0 ht0) {
        au0 a = ht0.mo67625a();
        yu0 b = ht0.mo67626b();
        if (a != null) {
            return new mu0(adResponse, a, r11);
        }
        if (b == null) {
            return new dt0(adResponse, r11);
        }
        return null;
    }
}
