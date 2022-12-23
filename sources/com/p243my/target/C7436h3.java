package com.p243my.target;

import android.content.Context;

/* renamed from: com.my.target.h3 */
public abstract class C7436h3<T> {

    /* renamed from: a */
    public boolean f18683a;

    /* renamed from: b */
    public boolean f18684b;

    /* renamed from: c */
    public int f18685c = -1;

    /* renamed from: d */
    public T f18686d;

    /* renamed from: e */
    public String f18687e;

    /* renamed from: a */
    public abstract T mo50067a(String str, String str2, Context context);

    /* renamed from: a */
    public String mo50286a() {
        return this.f18687e;
    }

    /* renamed from: b */
    public T mo50287b() {
        return this.f18686d;
    }

    /* renamed from: b */
    public final T mo50288b(String str, String str2, Context context) {
        this.f18683a = true;
        this.f18684b = false;
        this.f18685c = -1;
        this.f18686d = null;
        this.f18687e = null;
        return mo50067a(str, str2, context);
    }

    /* renamed from: c */
    public boolean mo50289c() {
        return this.f18683a;
    }
}
