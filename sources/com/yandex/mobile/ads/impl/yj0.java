package com.yandex.mobile.ads.impl;

import android.content.Context;

class yj0 {

    /* renamed from: a */
    private final Context f42875a;

    /* renamed from: b */
    private final String f42876b;

    /* renamed from: c */
    private final h31 f42877c = new h31();

    yj0(Context context, String str) {
        this.f42875a = context.getApplicationContext();
        this.f42876b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public y80 mo71090a() {
        Class<?> cls;
        Object a;
        h31 h31 = this.f42877c;
        String str = this.f42876b;
        h31.getClass();
        try {
            cls = Class.forName(str);
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null || (a = this.f42877c.mo67396a(cls, "getFusedLocationProviderClient", this.f42875a)) == null) {
            return null;
        }
        return new y80(a);
    }
}
