package com.yandex.mobile.ads.impl;

public class x81 {

    /* renamed from: a */
    private final Object f42473a = new Object();

    /* renamed from: b */
    private boolean f42474b;

    /* renamed from: a */
    public void mo70847a(Runnable runnable) {
        synchronized (this.f42473a) {
            if (!this.f42474b) {
                this.f42474b = true;
                runnable.run();
            }
        }
    }
}
