package com.ogury.p244cm.internal;

/* renamed from: com.ogury.cm.internal.baccb */
public class baccb extends bacbc {
    /* renamed from: a */
    public final void mo52834a(Throwable th, Throwable th2) {
        bbabc.m22051b(th, "cause");
        bbabc.m22051b(th2, "exception");
        th.addSuppressed(th2);
    }
}
