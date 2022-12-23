package com.flurry.sdk;

/* renamed from: com.flurry.sdk.br */
public final class C2450br {

    /* renamed from: a */
    private static C2450br f5713a;

    private C2450br() {
    }

    /* renamed from: a */
    public static synchronized C2450br m5275a() {
        C2450br brVar;
        synchronized (C2450br.class) {
            if (f5713a == null) {
                f5713a = new C2450br();
            }
            brVar = f5713a;
        }
        return brVar;
    }
}
