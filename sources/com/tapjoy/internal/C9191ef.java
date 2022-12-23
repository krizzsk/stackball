package com.tapjoy.internal;

import com.tapjoy.internal.C9197ej;

/* renamed from: com.tapjoy.internal.ef */
public abstract class C9191ef extends C9197ej {
    /* renamed from: a */
    public abstract C9215em mo57984a(int i);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo57983a(Object obj) {
        return C9214el.m24663a(((C9215em) obj).mo58014a());
    }

    /* renamed from: a */
    public final /* synthetic */ void mo57986a(C9214el elVar, Object obj) {
        elVar.mo58010c(((C9215em) obj).mo58014a());
    }

    protected C9191ef(Class cls) {
        super(C9192eg.VARINT, cls);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo57985a(C9213ek ekVar) {
        int d = ekVar.mo58004d();
        C9215em a = mo57984a(d);
        if (a != null) {
            return a;
        }
        throw new C9197ej.C9212a(d, this.f22613a);
    }
}
