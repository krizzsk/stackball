package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.p */
public class C11614p {

    /* renamed from: a */
    public final int f27868a;

    /* renamed from: b */
    public final int f27869b;

    public C11614p(int i, int i2) {
        this.f27868a = i;
        this.f27869b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11614p.class != obj.getClass()) {
            return false;
        }
        C11614p pVar = (C11614p) obj;
        return this.f27868a == pVar.f27868a && this.f27869b == pVar.f27869b;
    }

    public int hashCode() {
        return (this.f27868a * 31) + this.f27869b;
    }

    public String toString() {
        return "BillingConfig{sendFrequencySeconds=" + this.f27868a + ", firstCollectingInappMaxAgeSeconds=" + this.f27869b + "}";
    }
}
