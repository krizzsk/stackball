package com.yandex.mobile.ads.impl;

import android.util.Base64;

public class hv0 {

    /* renamed from: a */
    private final C13040fb f34580a = new C13040fb();

    /* renamed from: a */
    public String mo67641a(fv0 fv0) {
        byte[] bArr = fv0.f33756b;
        if (bArr == null) {
            return null;
        }
        this.f34580a.getClass();
        try {
            return new String(Base64.decode(bArr, 0), "UTF-8");
        } catch (Exception unused) {
            return new String(bArr);
        }
    }
}
