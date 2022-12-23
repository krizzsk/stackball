package com.ogury.p245ed.internal;

import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.en */
public final class C8198en implements Serializable {

    /* renamed from: a */
    private final boolean f21235a;

    /* renamed from: b */
    private final C8199eo f21236b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8198en)) {
            return false;
        }
        C8198en enVar = (C8198en) obj;
        return this.f21235a == enVar.f21235a && this.f21236b == enVar.f21236b;
    }

    public final int hashCode() {
        boolean z = this.f21235a;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.f21236b.hashCode();
    }

    public final String toString() {
        return "ImpressionSettings(isPaidImpression=" + this.f21235a + ", impressionSource=" + this.f21236b + ')';
    }

    public C8198en(boolean z, C8199eo eoVar) {
        C8467mq.m23881b(eoVar, "impressionSource");
        this.f21235a = z;
        this.f21236b = eoVar;
    }

    /* renamed from: a */
    public final boolean mo53422a() {
        return this.f21235a;
    }

    public /* synthetic */ C8198en() {
        this(false, C8199eo.IMPRESSION_SOURCE_FORMAT);
    }

    /* renamed from: b */
    public final C8199eo mo53423b() {
        return this.f21236b;
    }
}
