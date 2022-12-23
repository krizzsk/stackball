package com.yandex.metrica.impl.p265ob;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.m1 */
class C11512m1 implements Runnable {

    /* renamed from: a */
    private final WeakReference<Handler> f27707a;

    /* renamed from: b */
    private final WeakReference<C10382J> f27708b;

    C11512m1(Handler handler, C10382J j) {
        this.f27707a = new WeakReference<>(handler);
        this.f27708b = new WeakReference<>(j);
    }

    public void run() {
        Handler handler = (Handler) this.f27707a.get();
        C10382J j = (C10382J) this.f27708b.get();
        if (handler != null && j != null && j.mo61584e()) {
            C11477l1.m29674a(handler, j, this);
        }
    }
}
