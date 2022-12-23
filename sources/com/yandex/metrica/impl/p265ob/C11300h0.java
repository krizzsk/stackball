package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.h0 */
public final class C11300h0<T> {

    /* renamed from: a */
    private final C11170e0<T> f27019a;

    /* renamed from: b */
    private final C11221f0<T> f27020b;

    /* renamed from: c */
    private final C10583O0 f27021c;

    /* renamed from: d */
    private final String f27022d;

    public C11300h0(C11170e0<T> e0Var, C11221f0<T> f0Var, C10583O0 o0, String str) {
        this.f27019a = e0Var;
        this.f27020b = f0Var;
        this.f27021c = o0;
        this.f27022d = str;
    }

    /* renamed from: a */
    public final void mo62984a(Context context, ContentValues contentValues) {
        try {
            Object invoke = this.f27019a.invoke(contentValues);
            if (invoke != null) {
                this.f27021c.mo61851a(context);
                if (((Boolean) this.f27020b.invoke(invoke)).booleanValue()) {
                    C10122B2.m26034a("Successfully saved " + this.f27022d, new Object[0]);
                    return;
                }
                C10122B2.m26040b("Did not save " + this.f27022d + " because data is already present", new Object[0]);
            }
        } catch (Throwable th) {
            C10122B2.m26035a(th, "Unexpected error occurred", new Object[0]);
        }
    }
}
