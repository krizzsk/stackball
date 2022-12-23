package com.ogury.p245ed.internal;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ip */
public final class C8336ip implements C8334in {

    /* renamed from: a */
    private final C8331il f21534a;

    /* renamed from: b */
    private LinkedList<C8337iq> f21535b = new LinkedList<>();

    public C8336ip(C8331il ilVar) {
        C8467mq.m23881b(ilVar, "loadCallback");
        this.f21534a = ilVar;
    }

    /* renamed from: a */
    public final void mo53743a(List<? extends C8337iq> list) {
        C8467mq.m23881b(list, "loadCommands");
        this.f21535b.addAll(list);
        m23539b();
    }

    /* renamed from: a */
    public final void mo53742a() {
        m23539b();
    }

    /* renamed from: b */
    private final void m23539b() {
        C8337iq pollFirst = this.f21535b.pollFirst();
        if (pollFirst != null) {
            pollFirst.mo53744a(this.f21534a);
        }
    }
}
