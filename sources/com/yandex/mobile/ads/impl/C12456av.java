package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;

/* renamed from: com.yandex.mobile.ads.impl.av */
public class C12456av {
    /* renamed from: a */
    public boolean mo65893a(Context context) {
        d71 a = l71.m38631c().mo68362a(context);
        if (a != null && !a.mo66469q()) {
            if (Build.VERSION.SDK_INT >= 21) {
                return true;
            }
        }
        return false;
    }
}
