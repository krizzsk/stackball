package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.e */
class C0646e {

    /* renamed from: a */
    private boolean f357a;

    C0646e() {
    }

    /* renamed from: a */
    public synchronized void mo9537a(long j) {
        if (!this.f357a) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo9538a(boolean z) {
        this.f357a = z;
        if (z) {
            notifyAll();
        }
    }

    /* renamed from: a */
    public boolean mo9539a() {
        return this.f357a;
    }
}
