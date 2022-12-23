package com.yandex.mobile.ads.impl;

import android.content.Context;

public class f90 {

    /* renamed from: a */
    private final Context f33282a;

    /* renamed from: b */
    private final h31 f33283b = new h31();

    /* renamed from: c */
    private final C14866v6 f33284c = new C14866v6();

    public f90(Context context) {
        this.f33282a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C14743u6 mo66943a() {
        Class<?> cls;
        try {
            this.f33283b.getClass();
            try {
                cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            } catch (Throwable unused) {
                cls = null;
            }
            if (cls == null) {
                return null;
            }
            Object a = this.f33283b.mo67396a(cls, "getAdvertisingIdInfo", this.f33282a);
            if (a == null) {
                return null;
            }
            return this.f33284c.mo70450a((String) h31.m36786a(a, "getId", new Object[0]), (Boolean) h31.m36786a(a, "isLimitAdTrackingEnabled", new Object[0]));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
