package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class yu0 implements ax0, lo0 {

    /* renamed from: a */
    private final List<zu0> f42963a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo71128a(zu0 zu0) {
        this.f42963a.add(zu0);
    }

    /* renamed from: b */
    public void mo65921b() {
    }

    /* renamed from: b */
    public void mo71129b(zu0 zu0) {
        this.f42963a.remove(zu0);
    }

    /* renamed from: a */
    public void mo65920a(boolean z) {
        for (zu0 a : this.f42963a) {
            a.mo65895a(z);
        }
    }

    /* renamed from: a */
    public void mo68155a() {
        for (zu0 b : this.f42963a) {
            b.mo65896b();
        }
    }
}
