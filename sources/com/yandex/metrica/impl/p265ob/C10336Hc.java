package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.gpllibrary.C10081a;

/* renamed from: com.yandex.metrica.impl.ob.Hc */
public class C10336Hc {

    /* renamed from: a */
    public final C10081a.C10083b f24830a;

    /* renamed from: b */
    public final long f24831b;

    /* renamed from: c */
    public final long f24832c;

    public C10336Hc(C10081a.C10083b bVar, long j, long j2) {
        this.f24830a = bVar;
        this.f24831b = j;
        this.f24832c = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10336Hc.class != obj.getClass()) {
            return false;
        }
        C10336Hc hc = (C10336Hc) obj;
        if (this.f24831b == hc.f24831b && this.f24832c == hc.f24832c && this.f24830a == hc.f24830a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f24831b;
        long j2 = this.f24832c;
        return (((this.f24830a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "GplArguments{priority=" + this.f24830a + ", durationSeconds=" + this.f24831b + ", intervalSeconds=" + this.f24832c + '}';
    }
}
