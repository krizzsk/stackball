package com.flurry.sdk;

/* renamed from: com.flurry.sdk.i */
public final class C2652i {

    /* renamed from: b */
    private static C2652i f6227b;

    /* renamed from: a */
    public C2522d f6228a = C2522d.m5445a();

    /* renamed from: a */
    public static synchronized C2652i m5755a() {
        C2652i iVar;
        synchronized (C2652i.class) {
            if (f6227b == null) {
                if (C2494ck.m5371a() != null) {
                    f6227b = new C2652i();
                } else {
                    throw new IllegalStateException("Flurry SDK must be initialized before starting config");
                }
            }
            iVar = f6227b;
        }
        return iVar;
    }

    private C2652i() {
    }

    /* renamed from: a */
    public final String mo17841a(String str, String str2, C2653j jVar) {
        return this.f6228a.mo17739c().mo17561a(str, str2, jVar);
    }
}
