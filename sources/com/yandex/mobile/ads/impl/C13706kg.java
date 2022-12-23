package com.yandex.mobile.ads.impl;

import android.graphics.Color;

/* renamed from: com.yandex.mobile.ads.impl.kg */
public class C13706kg {
    /* renamed from: a */
    public static int m38327a(String str) throws IllegalArgumentException {
        if (str.charAt(0) == '#') {
            if (str.length() == 5) {
                char charAt = str.charAt(1);
                char charAt2 = str.charAt(2);
                char charAt3 = str.charAt(3);
                char charAt4 = str.charAt(4);
                str = new String(new char[]{'#', charAt, charAt, charAt2, charAt2, charAt3, charAt3, charAt4, charAt4});
            } else if (str.length() == 4) {
                char charAt5 = str.charAt(1);
                char charAt6 = str.charAt(2);
                char charAt7 = str.charAt(3);
                str = new String(new char[]{'#', charAt5, charAt5, charAt6, charAt6, charAt7, charAt7});
            }
        }
        return Color.parseColor(str);
    }
}
