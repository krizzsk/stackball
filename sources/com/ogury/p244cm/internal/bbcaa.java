package com.ogury.p244cm.internal;

/* renamed from: com.ogury.cm.internal.bbcaa */
public final class bbcaa {

    /* renamed from: a */
    private final String f20654a;

    /* renamed from: b */
    private final bbbac f20655b;

    public bbcaa(String str, bbbac bbbac) {
        bbabc.m22051b(str, "value");
        bbabc.m22051b(bbbac, "range");
        this.f20654a = str;
        this.f20655b = bbbac;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbcaa)) {
            return false;
        }
        bbcaa bbcaa = (bbcaa) obj;
        return bbabc.m22050a((Object) this.f20654a, (Object) bbcaa.f20654a) && bbabc.m22050a((Object) this.f20655b, (Object) bbcaa.f20655b);
    }

    public final int hashCode() {
        String str = this.f20654a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        bbbac bbbac = this.f20655b;
        if (bbbac != null) {
            i = bbbac.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f20654a + ", range=" + this.f20655b + ")";
    }
}
