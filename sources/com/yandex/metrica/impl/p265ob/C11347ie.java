package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.ie */
public class C11347ie {

    /* renamed from: a */
    public final String f27118a;

    /* renamed from: b */
    public final boolean f27119b;

    public C11347ie(String str, boolean z) {
        this.f27118a = str;
        this.f27119b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11347ie.class != obj.getClass()) {
            return false;
        }
        C11347ie ieVar = (C11347ie) obj;
        if (this.f27119b != ieVar.f27119b) {
            return false;
        }
        return this.f27118a.equals(ieVar.f27118a);
    }

    public int hashCode() {
        return (this.f27118a.hashCode() * 31) + (this.f27119b ? 1 : 0);
    }

    public String toString() {
        return "PermissionState{name='" + this.f27118a + '\'' + ", granted=" + this.f27119b + '}';
    }
}
