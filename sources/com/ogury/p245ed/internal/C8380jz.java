package com.ogury.p245ed.internal;

import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.jz */
public final class C8380jz<A, B> implements Serializable {

    /* renamed from: a */
    private final A f21627a;

    /* renamed from: b */
    private final B f21628b;

    /* renamed from: c */
    public final A mo53855c() {
        return this.f21627a;
    }

    /* renamed from: d */
    public final B mo53856d() {
        return this.f21628b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8380jz)) {
            return false;
        }
        C8380jz jzVar = (C8380jz) obj;
        return C8467mq.m23880a((Object) this.f21627a, (Object) jzVar.f21627a) && C8467mq.m23880a((Object) this.f21628b, (Object) jzVar.f21628b);
    }

    public final int hashCode() {
        A a = this.f21627a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f21628b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public C8380jz(A a, B b) {
        this.f21627a = a;
        this.f21628b = b;
    }

    /* renamed from: a */
    public final A mo53853a() {
        return this.f21627a;
    }

    /* renamed from: b */
    public final B mo53854b() {
        return this.f21628b;
    }

    public final String toString() {
        return "(" + this.f21627a + ", " + this.f21628b + ')';
    }
}
