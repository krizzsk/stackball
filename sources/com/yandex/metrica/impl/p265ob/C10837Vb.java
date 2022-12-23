package com.yandex.metrica.impl.p265ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.Vb */
public class C10837Vb {

    /* renamed from: a */
    private final List<C10780Tb> f26003a;

    /* renamed from: b */
    private final C10882Wb f26004b;

    /* renamed from: c */
    private final AtomicBoolean f26005c = new AtomicBoolean(true);

    public C10837Vb(List<C10780Tb> list, C10882Wb wb) {
        this.f26003a = list;
        this.f26004b = wb;
    }

    /* renamed from: a */
    public void mo62375a() {
        this.f26005c.set(false);
    }

    /* renamed from: b */
    public void mo62376b() {
        this.f26005c.set(true);
    }

    /* renamed from: c */
    public void mo62377c() {
        if (!this.f26005c.get()) {
            return;
        }
        if (this.f26003a.isEmpty()) {
            ((C11229f4) this.f26004b).mo62870c();
            return;
        }
        boolean z = false;
        for (C10780Tb a : this.f26003a) {
            z |= a.mo62227a();
        }
        if (z) {
            ((C11229f4) this.f26004b).mo62870c();
        }
    }
}
