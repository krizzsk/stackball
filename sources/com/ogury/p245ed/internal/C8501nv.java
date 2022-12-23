package com.ogury.p245ed.internal;

import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.nv */
class C8501nv extends C8500nu {

    /* renamed from: com.ogury.ed.internal.nv$a */
    public static final class C8502a implements C8474mx, Iterable<T> {

        /* renamed from: a */
        final /* synthetic */ C8495np f21712a;

        public C8502a(C8495np npVar) {
            this.f21712a = npVar;
        }

        public final Iterator<T> iterator() {
            return this.f21712a.mo53994a();
        }
    }

    /* renamed from: a */
    public static final <T> Iterable<T> m23923a(C8495np<? extends T> npVar) {
        C8467mq.m23881b(npVar, "$this$asIterable");
        return new C8502a(npVar);
    }
}
