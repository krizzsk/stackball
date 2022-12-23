package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.h */
public final class C9346h extends C9492m {

    /* renamed from: c */
    private final boolean f23133c = false;

    public C9346h(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final void mo58256a(boolean z) {
        this.f23596a.edit().putBoolean(this.f23597b, z).apply();
    }

    /* renamed from: a */
    public final Boolean mo58255a() {
        return Boolean.valueOf(this.f23596a.getBoolean(this.f23597b, this.f23133c));
    }
}
