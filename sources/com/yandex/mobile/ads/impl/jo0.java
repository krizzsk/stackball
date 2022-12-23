package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class jo0 {

    /* renamed from: a */
    private final Object f35416a = new Object();

    /* renamed from: b */
    private final List<me0> f35417b = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo68072a(me0 me0) {
        synchronized (this.f35416a) {
            this.f35417b.add(me0);
        }
    }

    /* renamed from: a */
    public void mo68071a() {
        synchronized (this.f35416a) {
            for (me0 a : this.f35417b) {
                a.mo68672a();
            }
            this.f35417b.clear();
        }
    }
}
