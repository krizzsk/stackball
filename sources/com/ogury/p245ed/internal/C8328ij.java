package com.ogury.p245ed.internal;

import java.util.List;

/* renamed from: com.ogury.ed.internal.ij */
public final class C8328ij implements C8334in {

    /* renamed from: a */
    private final C8331il f21519a;

    /* renamed from: a */
    public final void mo53742a() {
    }

    public C8328ij(C8331il ilVar) {
        C8467mq.m23881b(ilVar, "loadCallback");
        this.f21519a = ilVar;
    }

    /* renamed from: a */
    public final void mo53743a(List<? extends C8337iq> list) {
        C8467mq.m23881b(list, "loadCommands");
        for (C8337iq a : list) {
            a.mo53744a(this.f21519a);
        }
    }
}
