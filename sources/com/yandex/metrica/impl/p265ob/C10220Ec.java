package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Ec */
public class C10220Ec {

    /* renamed from: a */
    public final C11983yd f24582a;

    /* renamed from: b */
    public final C10187Dc f24583b;

    public C10220Ec(C11983yd ydVar, C10187Dc dc) {
        this.f24582a = ydVar;
        this.f24583b = dc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10220Ec.class != obj.getClass()) {
            return false;
        }
        C10220Ec ec = (C10220Ec) obj;
        if (!this.f24582a.equals(ec.f24582a)) {
            return false;
        }
        C10187Dc dc = this.f24583b;
        C10187Dc dc2 = ec.f24583b;
        if (dc != null) {
            return dc.equals(dc2);
        }
        if (dc2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f24582a.hashCode() * 31;
        C10187Dc dc = this.f24583b;
        return hashCode + (dc != null ? dc.hashCode() : 0);
    }

    public String toString() {
        return "ForcedCollectingConfig{providerAccessFlags=" + this.f24582a + ", arguments=" + this.f24583b + '}';
    }
}
