package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Locale;

public final class tb1 {
    /* renamed from: a */
    public static String m42292a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase(Locale.US);
    }
}
