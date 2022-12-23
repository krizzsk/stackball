package com.fyber.inneractive.sdk.player.p059c.p080k;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.d */
public final class C3539d {

    /* renamed from: a */
    private boolean f9593a;

    /* renamed from: a */
    public final synchronized boolean mo19369a() {
        if (this.f9593a) {
            return false;
        }
        this.f9593a = true;
        notifyAll();
        return true;
    }

    /* renamed from: b */
    public final synchronized boolean mo19370b() {
        boolean z;
        z = this.f9593a;
        this.f9593a = false;
        return z;
    }

    /* renamed from: c */
    public final synchronized void mo19371c() throws InterruptedException {
        while (!this.f9593a) {
            wait();
        }
    }
}
