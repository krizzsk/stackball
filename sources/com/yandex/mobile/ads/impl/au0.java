package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class au0 implements eu0 {

    /* renamed from: a */
    private final List<eu0> f30827a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo65886a(eu0 eu0) {
        this.f30827a.add(eu0);
    }

    /* renamed from: b */
    public void mo65888b(eu0 eu0) {
        this.f30827a.remove(eu0);
    }

    /* renamed from: c */
    public void mo65889c() {
        for (eu0 c : this.f30827a) {
            c.mo65889c();
        }
    }

    /* renamed from: a */
    public void mo65885a(long j, long j2) {
        for (eu0 a : this.f30827a) {
            a.mo65885a(j, j2);
        }
    }

    /* renamed from: b */
    public void mo65887b() {
        for (eu0 b : this.f30827a) {
            b.mo65887b();
        }
    }
}
