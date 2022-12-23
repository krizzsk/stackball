package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.yd */
public class C11983yd {

    /* renamed from: a */
    public final boolean f28777a;

    /* renamed from: b */
    public final boolean f28778b;

    public C11983yd(boolean z, boolean z2) {
        this.f28777a = z;
        this.f28778b = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11983yd.class != obj.getClass()) {
            return false;
        }
        C11983yd ydVar = (C11983yd) obj;
        if (this.f28777a == ydVar.f28777a && this.f28778b == ydVar.f28778b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f28777a ? 1 : 0) * true) + (this.f28778b ? 1 : 0);
    }

    public String toString() {
        return "ProviderAccessFlags{lastKnownEnabled=" + this.f28777a + ", scanningEnabled=" + this.f28778b + '}';
    }
}
