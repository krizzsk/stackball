package com.yandex.mobile.ads.impl;

public final class u71 {

    /* renamed from: c */
    public static final u71 f40581c = new u71(0, 0);

    /* renamed from: a */
    public final long f40582a;

    /* renamed from: b */
    public final long f40583b;

    public u71(long j, long j2) {
        this.f40582a = j;
        this.f40583b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u71.class != obj.getClass()) {
            return false;
        }
        u71 u71 = (u71) obj;
        if (this.f40582a == u71.f40582a && this.f40583b == u71.f40583b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f40582a) * 31) + ((int) this.f40583b);
    }

    public String toString() {
        return "[timeUs=" + this.f40582a + ", position=" + this.f40583b + "]";
    }
}
