package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.y0 */
final class C15223y0 {

    /* renamed from: b */
    private static final Object f42732b = new Object();

    /* renamed from: c */
    private static volatile C15223y0 f42733c;

    /* renamed from: a */
    private final C15127x0 f42734a;

    private C15223y0(Context context) {
        this.f42734a = new C15127x0(context);
    }

    /* renamed from: a */
    public static C15223y0 m44155a(Context context) {
        if (f42733c == null) {
            synchronized (f42732b) {
                if (f42733c == null) {
                    f42733c = new C15223y0(context);
                }
            }
        }
        return f42733c;
    }

    /* renamed from: a */
    public C15127x0 mo70955a() {
        return this.f42734a;
    }
}
