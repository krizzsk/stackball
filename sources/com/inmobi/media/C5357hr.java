package com.inmobi.media;

/* renamed from: com.inmobi.media.hr */
/* compiled from: RuleKey */
public final class C5357hr {

    /* renamed from: a */
    private String f12273a;

    /* renamed from: b */
    private Class<?> f12274b;

    public C5357hr(String str, Class<?> cls) {
        this.f12273a = str;
        this.f12274b = cls;
    }

    public final int hashCode() {
        return this.f12273a.hashCode() + this.f12274b.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5357hr) {
            C5357hr hrVar = (C5357hr) obj;
            if (!this.f12273a.equals(hrVar.f12273a) || this.f12274b != hrVar.f12274b) {
                return false;
            }
            return true;
        }
        return false;
    }
}
