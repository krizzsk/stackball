package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.o */
public final class C9494o extends C9492m {

    /* renamed from: c */
    private final String f23598c = null;

    public C9494o(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final String mo58486a() {
        return this.f23596a.getString(this.f23597b, this.f23598c);
    }

    /* renamed from: a */
    public final void mo58487a(String str) {
        this.f23596a.edit().putString(this.f23597b, str).apply();
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo58485a(SharedPreferences.Editor editor, String str) {
        return str != null ? editor.putString(this.f23597b, str) : editor.remove(this.f23597b);
    }
}
