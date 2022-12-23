package com.tapjoy.internal;

import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.cc */
public final class C9122cc implements Runnable {

    /* renamed from: a */
    private final C9120ca f22441a;
    @Nullable

    /* renamed from: b */
    private final C9125cf f22442b;

    protected C9122cc(C9120ca caVar, @Nullable C9125cf cfVar) {
        this.f22441a = caVar;
        this.f22442b = cfVar;
    }

    public final void run() {
        try {
            Object f = this.f22441a.mo57908f();
            C9125cf cfVar = this.f22442b;
            if (cfVar != null && !(cfVar instanceof C9126cg)) {
                cfVar.mo57912a(this.f22441a, f);
            }
        } catch (Throwable unused) {
            C9125cf cfVar2 = this.f22442b;
            if (cfVar2 != null && !(cfVar2 instanceof C9126cg)) {
                cfVar2.mo57911a(this.f22441a);
            }
        }
    }
}
