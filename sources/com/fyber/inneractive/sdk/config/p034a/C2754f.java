package com.fyber.inneractive.sdk.config.p034a;

/* renamed from: com.fyber.inneractive.sdk.config.a.f */
public final class C2754f implements C2752d {

    /* renamed from: a */
    String f6493a;

    /* renamed from: b */
    boolean f6494b;

    public C2754f(String str, boolean z) {
        this.f6493a = str;
        this.f6494b = z;
    }

    /* renamed from: a */
    public final boolean mo17992a(C2753e eVar) {
        String str = this.f6493a;
        if (str == null) {
            return false;
        }
        if (!str.equalsIgnoreCase("android")) {
            return this.f6494b;
        }
        if (!this.f6494b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", new Object[]{"os", this.f6493a, Boolean.valueOf(this.f6494b)});
    }
}
