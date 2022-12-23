package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.pi */
public class C11659pi {

    /* renamed from: a */
    public final long f27981a;

    /* renamed from: b */
    public final long f27982b;

    /* renamed from: c */
    public final long f27983c;

    /* renamed from: d */
    public final long f27984d;

    public C11659pi(long j, long j2, long j3, long j4) {
        this.f27981a = j;
        this.f27982b = j2;
        this.f27983c = j3;
        this.f27984d = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11659pi.class != obj.getClass()) {
            return false;
        }
        C11659pi piVar = (C11659pi) obj;
        if (this.f27981a == piVar.f27981a && this.f27982b == piVar.f27982b && this.f27983c == piVar.f27983c && this.f27984d == piVar.f27984d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f27981a;
        long j2 = this.f27982b;
        long j3 = this.f27983c;
        long j4 = this.f27984d;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "CacheControl{cellsAroundTtl=" + this.f27981a + ", wifiNetworksTtl=" + this.f27982b + ", lastKnownLocationTtl=" + this.f27983c + ", netInterfacesTtl=" + this.f27984d + '}';
    }
}
