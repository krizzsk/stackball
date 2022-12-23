package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.dh */
public final class C12888dh {

    /* renamed from: a */
    private final C13493jf f32580a;

    /* renamed from: b */
    private boolean f32581b;

    public C12888dh() {
        this(C13493jf.f35273a);
    }

    /* renamed from: a */
    public synchronized void mo66581a() throws InterruptedException {
        while (!this.f32581b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized boolean mo66582b() {
        boolean z;
        z = this.f32581b;
        this.f32581b = false;
        return z;
    }

    /* renamed from: c */
    public synchronized boolean mo66583c() {
        return this.f32581b;
    }

    /* renamed from: d */
    public synchronized boolean mo66584d() {
        if (this.f32581b) {
            return false;
        }
        this.f32581b = true;
        notifyAll();
        return true;
    }

    public C12888dh(C13493jf jfVar) {
        this.f32580a = jfVar;
    }
}
