package com.yandex.mobile.ads.impl;

import android.content.Context;

public class az0 {

    /* renamed from: a */
    private final Context f30858a;

    public az0(Context context) {
        this.f30858a = context.getApplicationContext();
    }

    /* renamed from: a */
    public boolean mo65923a() {
        return m33973a("android.permission.ACCESS_COARSE_LOCATION");
    }

    /* renamed from: b */
    public boolean mo65924b() {
        return m33973a("android.permission.ACCESS_FINE_LOCATION");
    }

    /* renamed from: a */
    private boolean m33973a(String str) {
        try {
            return this.f30858a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
