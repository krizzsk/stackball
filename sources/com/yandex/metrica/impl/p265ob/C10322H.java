package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.H */
public class C10322H {

    /* renamed from: a */
    public final C10323a f24797a;

    /* renamed from: b */
    public final Boolean f24798b;

    /* renamed from: com.yandex.metrica.impl.ob.H$a */
    public enum C10323a {
        ACTIVE,
        WORKING_SET,
        FREQUENT,
        RARE,
        RESTRICTED
    }

    public C10322H(C10323a aVar, Boolean bool) {
        this.f24797a = aVar;
        this.f24798b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10322H.class != obj.getClass()) {
            return false;
        }
        C10322H h = (C10322H) obj;
        if (this.f24797a != h.f24797a) {
            return false;
        }
        Boolean bool = this.f24798b;
        if (bool != null) {
            return bool.equals(h.f24798b);
        }
        if (h.f24798b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        C10323a aVar = this.f24797a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Boolean bool = this.f24798b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
