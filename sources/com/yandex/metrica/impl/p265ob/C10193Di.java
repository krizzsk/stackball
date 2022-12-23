package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Di */
public class C10193Di {

    /* renamed from: a */
    public final long f24520a;

    /* renamed from: b */
    public final long f24521b;

    /* renamed from: c */
    public final long f24522c;

    /* renamed from: d */
    public final long f24523d;

    public C10193Di(long j, long j2, long j3, long j4) {
        this.f24520a = j;
        this.f24521b = j2;
        this.f24522c = j3;
        this.f24523d = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10193Di.class != obj.getClass()) {
            return false;
        }
        C10193Di di = (C10193Di) obj;
        if (this.f24520a == di.f24520a && this.f24521b == di.f24521b && this.f24522c == di.f24522c && this.f24523d == di.f24523d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f24520a;
        long j2 = this.f24521b;
        long j3 = this.f24522c;
        long j4 = this.f24523d;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "SdkFingerprintingConfig{minCollectingInterval=" + this.f24520a + ", minFirstCollectingDelay=" + this.f24521b + ", minCollectingDelayAfterLaunch=" + this.f24522c + ", minRequestRetryInterval=" + this.f24523d + '}';
    }
}
