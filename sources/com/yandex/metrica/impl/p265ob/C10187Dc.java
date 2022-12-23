package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Dc */
public class C10187Dc {

    /* renamed from: a */
    public final long f24488a;

    /* renamed from: b */
    public final long f24489b;

    public C10187Dc(long j, long j2) {
        this.f24488a = j;
        this.f24489b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10187Dc.class != obj.getClass()) {
            return false;
        }
        C10187Dc dc = (C10187Dc) obj;
        if (this.f24488a == dc.f24488a && this.f24489b == dc.f24489b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f24488a;
        long j2 = this.f24489b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "ForcedCollectingArguments{durationSeconds=" + this.f24488a + ", intervalSeconds=" + this.f24489b + '}';
    }
}
