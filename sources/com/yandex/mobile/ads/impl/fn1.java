package com.yandex.mobile.ads.impl;

public class fn1 {

    /* renamed from: a */
    private final Object f33461a = new Object();

    /* renamed from: b */
    private en1 f33462b = en1.INITIAL;

    /* renamed from: a */
    public en1 mo67050a() {
        en1 en1;
        synchronized (this.f33461a) {
            en1 = this.f33462b;
        }
        return en1;
    }

    /* renamed from: a */
    public void mo67051a(en1 en1) {
        synchronized (this.f33461a) {
            this.f33462b = en1;
        }
    }
}
