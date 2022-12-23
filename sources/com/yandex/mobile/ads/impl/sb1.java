package com.yandex.mobile.ads.impl;

public class sb1 implements i51<String> {
    /* renamed from: a */
    public Object mo66870a(fv0 fv0) {
        byte[] bArr = fv0.f33756b;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, xb0.m43997a(fv0.f33757c));
        } catch (Exception unused) {
            return new String(fv0.f33756b);
        }
    }
}
