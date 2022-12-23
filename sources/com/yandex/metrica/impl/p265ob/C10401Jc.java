package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Jc */
public class C10401Jc {

    /* renamed from: a */
    public final C11983yd f25020a;

    /* renamed from: b */
    public final C10336Hc f25021b;

    public C10401Jc(C11983yd ydVar, C10336Hc hc) {
        this.f25020a = ydVar;
        this.f25021b = hc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10401Jc.class != obj.getClass()) {
            return false;
        }
        C10401Jc jc = (C10401Jc) obj;
        if (!this.f25020a.equals(jc.f25020a)) {
            return false;
        }
        C10336Hc hc = this.f25021b;
        C10336Hc hc2 = jc.f25021b;
        if (hc != null) {
            return hc.equals(hc2);
        }
        if (hc2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f25020a.hashCode() * 31;
        C10336Hc hc = this.f25021b;
        return hashCode + (hc != null ? hc.hashCode() : 0);
    }

    public String toString() {
        return "GplCollectingConfig{providerAccessFlags=" + this.f25020a + ", arguments=" + this.f25021b + '}';
    }
}
