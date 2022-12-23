package com.flurry.sdk;

/* renamed from: com.flurry.sdk.bd */
public enum C2402bd {
    INSTALL(1),
    SESSION_START(2),
    SESSION_END(3),
    APPLICATION_EVENT(4);
    

    /* renamed from: e */
    final int f5550e;

    private C2402bd(int i) {
        this.f5550e = i;
    }

    /* renamed from: a */
    public static C2402bd m5169a(int i) {
        if (i == 1) {
            return INSTALL;
        }
        if (i == 2) {
            return SESSION_START;
        }
        if (i == 3) {
            return SESSION_END;
        }
        if (i != 4) {
            return null;
        }
        return APPLICATION_EVENT;
    }
}
