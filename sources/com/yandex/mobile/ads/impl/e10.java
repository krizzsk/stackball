package com.yandex.mobile.ads.impl;

import androidx.core.view.ViewCompat;
import java.util.Map;

public final class e10 {

    /* renamed from: a */
    private final Map<String, Integer> f32881a = C13050fg.m36014a();

    /* renamed from: a */
    public final int mo66739a(String str) {
        if (str == null) {
            return -1;
        }
        Map<String, Integer> map = this.f32881a;
        Integer num = map.get(str);
        if (num == null) {
            num = Integer.valueOf(ViewCompat.generateViewId());
            map.put(str, num);
        }
        return num.intValue();
    }
}
