package com.ogury.p245ed.internal;

import java.util.List;

/* renamed from: com.ogury.ed.internal.ck */
public final class C8105ck {

    /* renamed from: a */
    private List<String> f21034a = C8394km.m23756a();

    /* renamed from: b */
    private List<? extends Class<?>> f21035b = C8394km.m23756a();

    /* renamed from: a */
    public final List<String> mo53271a() {
        return this.f21034a;
    }

    /* renamed from: a */
    public final void mo53272a(List<String> list) {
        C8467mq.m23881b(list, "<set-?>");
        this.f21034a = list;
    }

    /* renamed from: b */
    public final List<Class<?>> mo53273b() {
        return this.f21035b;
    }

    /* renamed from: b */
    public final void mo53274b(List<? extends Class<?>> list) {
        C8467mq.m23881b(list, "<set-?>");
        this.f21035b = list;
    }

    /* renamed from: c */
    public final boolean mo53275c() {
        return this.f21034a.isEmpty() && this.f21035b.isEmpty();
    }
}
