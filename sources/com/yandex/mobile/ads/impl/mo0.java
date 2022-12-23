package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.MobileAds;

public class mo0 {
    /* renamed from: a */
    public gj1 mo68843a() {
        String[] split = MobileAds.getLibraryVersion().split("\\.");
        return new gj1(m39681a(split, 0), m39681a(split, 1), m39681a(split, 2));
    }

    /* renamed from: a */
    private int m39681a(String[] strArr, int i) {
        if (i < 0 || strArr.length <= i) {
            return 0;
        }
        String str = strArr[i];
        int i2 = C13278h5.f34274b;
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
