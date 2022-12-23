package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.k */
public final class C9477k extends C9492m {

    /* renamed from: c */
    private final int f23567c;

    public C9477k(SharedPreferences sharedPreferences, String str, int i) {
        super(sharedPreferences, str);
        this.f23567c = i;
    }

    /* renamed from: a */
    public final Integer mo58451a() {
        return Integer.valueOf(mo58454b());
    }

    /* renamed from: b */
    public final int mo58454b() {
        return this.f23596a.getInt(this.f23597b, this.f23567c);
    }

    /* renamed from: a */
    public final void mo58453a(Integer num) {
        if (num != null) {
            mo58452a(num.intValue());
        } else {
            mo58484c();
        }
    }

    /* renamed from: a */
    public final void mo58452a(int i) {
        this.f23596a.edit().putInt(this.f23597b, i).apply();
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo58450a(SharedPreferences.Editor editor, int i) {
        return editor.putInt(this.f23597b, i);
    }
}
