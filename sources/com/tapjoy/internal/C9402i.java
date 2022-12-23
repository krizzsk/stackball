package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.i */
public final class C9402i extends C9492m {

    /* renamed from: c */
    private final double f23319c = 0.0d;

    public C9402i(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final double mo58331a() {
        String string = this.f23596a.getString(this.f23597b, (String) null);
        if (string != null) {
            try {
                return Double.parseDouble(string);
            } catch (NumberFormatException unused) {
            }
        }
        return this.f23319c;
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo58332a(SharedPreferences.Editor editor) {
        return editor.remove(this.f23597b);
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo58333a(SharedPreferences.Editor editor, double d) {
        return editor.putString(this.f23597b, Double.toString(d));
    }
}
