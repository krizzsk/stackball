package com.ogury.p244cm.internal;

import java.io.Serializable;

/* renamed from: com.ogury.cm.internal.babbc */
public final class babbc<A, B> implements Serializable {

    /* renamed from: a */
    private final A f20601a;

    /* renamed from: b */
    private final B f20602b;

    public babbc(A a, B b) {
        this.f20601a = a;
        this.f20602b = b;
    }

    /* renamed from: a */
    public final A mo52783a() {
        return this.f20601a;
    }

    /* renamed from: b */
    public final B mo52784b() {
        return this.f20602b;
    }

    /* renamed from: c */
    public final A mo52785c() {
        return this.f20601a;
    }

    /* renamed from: d */
    public final B mo52786d() {
        return this.f20602b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof babbc)) {
            return false;
        }
        babbc babbc = (babbc) obj;
        return bbabc.m22050a((Object) this.f20601a, (Object) babbc.f20601a) && bbabc.m22050a((Object) this.f20602b, (Object) babbc.f20602b);
    }

    public final int hashCode() {
        A a = this.f20601a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f20602b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "(" + this.f20601a + ", " + this.f20602b + ')';
    }
}
