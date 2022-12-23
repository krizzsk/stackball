package com.yandex.mobile.ads.impl;

public final class v40 {

    /* renamed from: b */
    private static final Object f41182b = new Object();

    /* renamed from: c */
    private static volatile v40 f41183c;

    /* renamed from: a */
    private final u40 f41184a = new u40(4);

    private v40() {
    }

    /* renamed from: a */
    public static v40 m43027a() {
        if (f41183c == null) {
            synchronized (f41182b) {
                if (f41183c == null) {
                    f41183c = new v40();
                }
            }
        }
        return f41183c;
    }

    /* renamed from: a */
    public w40 mo70444a(ck1 ck1) {
        return (w40) this.f41184a.get(ck1);
    }

    /* renamed from: a */
    public void mo70445a(ck1 ck1, w40 w40) {
        this.f41184a.put(ck1, w40);
    }
}
