package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Base64;

public class qb1 {
    /* renamed from: a */
    public String mo69576a(Context context, String str) {
        byte[] a;
        d71 a2 = l71.m38631c().mo68362a(context);
        i30 e = a2 != null ? a2.mo66455e() : null;
        if (e == null || (a = new bo0(e.mo67712a(), e.mo67713b()).mo66101a(str.getBytes())) == null) {
            return null;
        }
        return Base64.encodeToString(a, 2);
    }
}
