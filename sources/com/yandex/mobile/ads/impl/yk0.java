package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;

class yk0 {

    /* renamed from: a */
    private final Object f42883a = new Object();

    /* renamed from: b */
    private final SharedPreferences f42884b;

    /* renamed from: c */
    private String f42885c;

    yk0(Context context) {
        this.f42884b = context.getSharedPreferences("YadPreferenceFile", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71097a(String str) {
        synchronized (this.f42883a) {
            this.f42885c = str;
            this.f42884b.edit().putString("YmadMauid", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo71096a() {
        String str;
        synchronized (this.f42883a) {
            if (this.f42885c == null) {
                this.f42885c = this.f42884b.getString("YmadMauid", (String) null);
            }
            str = this.f42885c;
        }
        return str;
    }
}
