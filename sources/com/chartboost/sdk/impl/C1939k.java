package com.chartboost.sdk.impl;

/* renamed from: com.chartboost.sdk.impl.k */
public class C1939k implements Runnable {

    /* renamed from: a */
    private final C1936j f4949a;

    /* renamed from: b */
    public final boolean f4950b;

    /* renamed from: c */
    private final int f4951c;

    /* renamed from: d */
    private final int f4952d;

    C1939k(C1936j jVar, boolean z, int i, int i2) {
        this.f4949a = jVar;
        this.f4950b = z;
        this.f4951c = i;
        this.f4952d = i2;
    }

    public void run() {
        this.f4949a.mo14551a(this.f4950b, this.f4951c, this.f4952d);
    }
}
