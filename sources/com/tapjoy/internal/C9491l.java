package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.l */
public final class C9491l extends C9492m {

    /* renamed from: c */
    private final long f23595c = 0;

    public C9491l(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final long mo58480a() {
        return this.f23596a.getLong(this.f23597b, this.f23595c);
    }

    /* renamed from: a */
    public final void mo58483a(long j) {
        this.f23596a.edit().putLong(this.f23597b, j).apply();
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo58481a(SharedPreferences.Editor editor) {
        return editor.remove(this.f23597b);
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo58482a(SharedPreferences.Editor editor, long j) {
        return editor.putLong(this.f23597b, j);
    }
}
