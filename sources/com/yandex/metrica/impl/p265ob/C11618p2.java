package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.p2 */
public abstract class C11618p2<T> {

    /* renamed from: a */
    protected final Context f27875a;

    /* renamed from: b */
    private final String f27876b;

    /* renamed from: c */
    private final String f27877c;

    public C11618p2(Context context, String str, String str2) {
        this.f27875a = context;
        this.f27876b = str;
        this.f27877c = str2;
    }

    /* renamed from: a */
    public T mo63450a() {
        int identifier = this.f27875a.getResources().getIdentifier(this.f27876b, this.f27877c, this.f27875a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return mo61808a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo61808a(int i);
}
