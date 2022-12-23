package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.yandex.mobile.ads.impl.x0 */
class C15127x0 {

    /* renamed from: c */
    private static final Object f42344c = new Object();

    /* renamed from: a */
    private final SharedPreferences f42345a;

    /* renamed from: b */
    private volatile C14733u0 f42346b;

    C15127x0(Context context) {
        this.f42345a = context.getSharedPreferences("YadPreferenceFile", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70778a(C14733u0 u0Var) {
        synchronized (f42344c) {
            this.f42346b = u0Var;
            this.f42345a.edit().putLong("AdBlockerLastUpdate", u0Var.mo70259a()).putBoolean("AdBlockerDetected", u0Var.mo70260b()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C14733u0 mo70777a() {
        if (this.f42346b == null) {
            synchronized (f42344c) {
                if (this.f42346b == null) {
                    this.f42346b = new C14733u0(this.f42345a.getBoolean("AdBlockerDetected", false), this.f42345a.getLong("AdBlockerLastUpdate", 0));
                }
            }
        }
        return this.f42346b;
    }
}
