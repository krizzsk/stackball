package com.ogury.p245ed.internal;

import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.ka */
final class C8382ka<T> implements C8375ju<T>, Serializable {

    /* renamed from: a */
    private C8431lj<? extends T> f21629a;

    /* renamed from: b */
    private volatile Object f21630b;

    /* renamed from: c */
    private final Object f21631c;

    private C8382ka(C8431lj<? extends T> ljVar) {
        C8467mq.m23881b(ljVar, "initializer");
        this.f21629a = ljVar;
        this.f21630b = C8384kc.f21632a;
        this.f21631c = this;
    }

    public /* synthetic */ C8382ka(C8431lj ljVar, byte b) {
        this(ljVar);
    }

    /* renamed from: a */
    public final T mo53851a() {
        T t;
        T t2 = this.f21630b;
        if (t2 != C8384kc.f21632a) {
            return t2;
        }
        synchronized (this.f21631c) {
            t = this.f21630b;
            if (t == C8384kc.f21632a) {
                C8431lj ljVar = this.f21629a;
                C8467mq.m23877a((Object) ljVar);
                t = ljVar.mo53190a();
                this.f21630b = t;
                this.f21629a = null;
            }
        }
        return t;
    }

    /* renamed from: b */
    private boolean m23741b() {
        return this.f21630b != C8384kc.f21632a;
    }

    public final String toString() {
        return m23741b() ? String.valueOf(mo53851a()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C8374jt(mo53851a());
    }
}
