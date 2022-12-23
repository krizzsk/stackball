package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.ld */
class C13853ld implements Runnable {

    /* renamed from: b */
    final /* synthetic */ l41 f36638b;

    /* renamed from: c */
    final /* synthetic */ C13971md f36639c;

    C13853ld(C13971md mdVar, l41 l41) {
        this.f36639c = mdVar;
        this.f36638b = l41;
    }

    public void run() {
        try {
            this.f36639c.f37308c.put(this.f36638b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
