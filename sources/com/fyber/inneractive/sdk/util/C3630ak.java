package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.ak */
public final class C3630ak {

    /* renamed from: a */
    public int f9896a;

    /* renamed from: b */
    public int f9897b;

    public C3630ak(int i, int i2) {
        this.f9896a = i;
        this.f9897b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3630ak akVar = (C3630ak) obj;
            if (this.f9896a == akVar.f9896a && this.f9897b == akVar.f9897b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9896a * 31) + this.f9897b;
    }
}
