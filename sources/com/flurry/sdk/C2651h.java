package com.flurry.sdk;

/* renamed from: com.flurry.sdk.h */
public class C2651h {

    /* renamed from: a */
    private static final String f6224a = C2651h.class.getSimpleName();

    /* renamed from: b */
    private C2664s f6225b = new C2664s();

    /* renamed from: c */
    private C2656l f6226c;

    /* renamed from: a */
    public final C2473c mo17839a(String str) {
        C2656l lVar;
        if (str == null || (lVar = this.f6226c) == null) {
            return null;
        }
        return lVar.mo17845a(str);
    }

    public String toString() {
        return "Variant: {" + this.f6226c.toString() + "}";
    }
}
