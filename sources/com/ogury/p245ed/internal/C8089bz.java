package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.bz */
public final class C8089bz {

    /* renamed from: a */
    private final int f21008a;

    /* renamed from: b */
    private final int f21009b;

    /* renamed from: c */
    private final int f21010c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8089bz)) {
            return false;
        }
        C8089bz bzVar = (C8089bz) obj;
        return this.f21008a == bzVar.f21008a && this.f21009b == bzVar.f21009b && this.f21010c == bzVar.f21010c;
    }

    public final int hashCode() {
        return (((this.f21008a * 31) + this.f21009b) * 31) + this.f21010c;
    }

    public final String toString() {
        return "OverlayPosition(gravity=" + this.f21008a + ", xMargin=" + this.f21009b + ", yMargin=" + this.f21010c + ')';
    }

    public C8089bz(int i, int i2, int i3) {
        this.f21008a = i;
        this.f21009b = i2;
        this.f21010c = i3;
    }

    /* renamed from: a */
    public final int mo53254a() {
        return this.f21008a;
    }

    /* renamed from: b */
    public final int mo53255b() {
        return this.f21009b;
    }

    /* renamed from: c */
    public final int mo53256c() {
        return this.f21010c;
    }
}
