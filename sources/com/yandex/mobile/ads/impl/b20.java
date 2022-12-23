package com.yandex.mobile.ads.impl;

public final class b20 {

    /* renamed from: a */
    public final String f31202a;

    private b20(int i, int i2, String str) {
        this.f31202a = str;
    }

    /* renamed from: a */
    public static b20 m34115a(fy0 fy0) {
        String str;
        fy0.mo67114f(2);
        int r = fy0.mo67126r();
        int i = r >> 1;
        int r2 = ((fy0.mo67126r() >> 3) & 31) | ((r & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        return new b20(i, r2, str + ".0" + i + ".0" + r2);
    }
}
