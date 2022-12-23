package com.yandex.mobile.ads.impl;

import android.util.Base64;

/* renamed from: com.yandex.mobile.ads.impl.fb */
public class C13040fb {
    /* renamed from: a */
    public String mo66949a(String str) {
        byte[] bytes = str.getBytes();
        try {
            return new String(Base64.decode(bytes, 0), "UTF-8");
        } catch (Exception unused) {
            return new String(bytes);
        }
    }
}
