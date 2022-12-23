package com.yandex.mobile.ads.impl;

import android.content.Context;

public class s61 {
    /* renamed from: a */
    public boolean mo69895a(Context context, String str) {
        try {
            return context.getPackageManager().hasSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
