package com.yandex.metrica.impl.p265ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.Xb */
public class C10923Xb implements C10780Tb, C10806Ub {

    /* renamed from: a */
    private final C11776t4 f26255a;

    /* renamed from: b */
    private AtomicLong f26256b;

    public C10923Xb(C11782t8 t8Var, C11776t4 t4Var) {
        this.f26255a = t4Var;
        this.f26256b = new AtomicLong(t8Var.mo63716c());
        t8Var.mo63710a((C10806Ub) this);
    }

    /* renamed from: a */
    public boolean mo62227a() {
        return this.f26256b.get() >= ((long) ((C11384jh) this.f26255a.mo62907b()).mo63079J());
    }

    /* renamed from: b */
    public void mo62228b(List<Integer> list) {
        this.f26256b.addAndGet((long) (-list.size()));
    }

    /* renamed from: a */
    public void mo62226a(List<Integer> list) {
        this.f26256b.addAndGet((long) list.size());
    }
}
