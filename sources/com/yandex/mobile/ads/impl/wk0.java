package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Locale;
import java.util.UUID;

public final class wk0 implements xk0 {

    /* renamed from: c */
    private static final Object f42023c = new Object();

    /* renamed from: d */
    private static volatile wk0 f42024d;

    /* renamed from: a */
    private final yk0 f42025a;

    /* renamed from: b */
    private final vk0 f42026b = new vk0();

    private wk0(Context context) {
        this.f42025a = new yk0(context);
    }

    /* renamed from: a */
    public static wk0 m43667a(Context context) {
        if (f42024d == null) {
            synchronized (f42023c) {
                if (f42024d == null) {
                    f42024d = new wk0(context);
                }
            }
        }
        return f42024d;
    }

    /* renamed from: a */
    public String mo70711a() {
        String a;
        synchronized (f42023c) {
            a = this.f42025a.mo71096a();
            if (a == null) {
                this.f42026b.getClass();
                a = UUID.randomUUID().toString().replace("-", "").toLowerCase(Locale.US);
                this.f42025a.mo71097a(a);
            }
        }
        return a;
    }
}
