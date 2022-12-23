package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.m */
public abstract class C9492m {

    /* renamed from: a */
    protected SharedPreferences f23596a;

    /* renamed from: b */
    protected String f23597b;

    public C9492m(SharedPreferences sharedPreferences, String str) {
        this.f23596a = sharedPreferences;
        this.f23597b = str;
    }

    /* renamed from: c */
    public final void mo58484c() {
        this.f23596a.edit().remove(this.f23597b).apply();
    }
}
