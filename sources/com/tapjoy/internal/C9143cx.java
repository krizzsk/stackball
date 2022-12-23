package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.cx */
public final class C9143cx {

    /* renamed from: a */
    public final String f22473a;

    /* renamed from: b */
    public final String f22474b;

    private C9143cx(String str, String str2) {
        this.f22473a = str;
        this.f22474b = str2;
    }

    /* renamed from: a */
    public static C9143cx m24480a(String str, String str2) {
        C9166do.m24544a(str, "Name is null or empty");
        C9166do.m24544a(str2, "Version is null or empty");
        return new C9143cx(str, str2);
    }
}
