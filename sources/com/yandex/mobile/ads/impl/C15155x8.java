package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.mobile.ads.impl.x8 */
class C15155x8 {

    /* renamed from: a */
    private final Object f42469a = new Object();

    /* renamed from: b */
    private final List<C15237y8> f42470b = new CopyOnWriteArrayList();

    C15155x8() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70846a(C15237y8 y8Var) {
        synchronized (this.f42469a) {
            this.f42470b.add(y8Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70844a() {
        synchronized (this.f42469a) {
            this.f42470b.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70845a(C15035w8 w8Var) {
        synchronized (this.f42469a) {
            for (C15237y8 a : this.f42470b) {
                a.mo65696a(w8Var);
            }
            this.f42470b.clear();
        }
    }
}
