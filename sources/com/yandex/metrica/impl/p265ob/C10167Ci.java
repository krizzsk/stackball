package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Ci */
public class C10167Ci {

    /* renamed from: a */
    public final int f24455a;

    /* renamed from: b */
    public final int f24456b;

    public C10167Ci(int i, int i2) {
        this.f24455a = i;
        this.f24456b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10167Ci.class != obj.getClass()) {
            return false;
        }
        C10167Ci ci = (C10167Ci) obj;
        if (this.f24455a == ci.f24455a && this.f24456b == ci.f24456b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f24455a * 31) + this.f24456b;
    }

    public String toString() {
        return "RetryPolicyConfig{maxIntervalSeconds=" + this.f24455a + ", exponentialMultiplier=" + this.f24456b + '}';
    }
}
