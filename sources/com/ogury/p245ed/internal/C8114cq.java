package com.ogury.p245ed.internal;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cq */
public final class C8114cq implements C8115cr {

    /* renamed from: a */
    private final List<C8115cr> f21046a = new ArrayList();

    /* renamed from: a */
    public final void mo53281a() {
        for (C8115cr a : this.f21046a) {
            a.mo53281a();
        }
        this.f21046a.clear();
    }

    /* renamed from: a */
    public final void mo53282a(C8115cr crVar) {
        C8467mq.m23881b(crVar, "disposable");
        this.f21046a.add(crVar);
    }
}
