package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.G0 */
public final class C10269G0 {

    /* renamed from: a */
    private final long f24710a;

    public C10269G0(long j) {
        this.f24710a = j;
    }

    /* renamed from: a */
    public final long mo61338a() {
        return this.f24710a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C10269G0) && this.f24710a == ((C10269G0) obj).f24710a;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f24710a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "EasyCollectingConfig(firstLaunchDelaySeconds=" + this.f24710a + ")";
    }
}
