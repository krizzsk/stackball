package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.ct */
public final class C9139ct {

    /* renamed from: a */
    public final C9142cw f22455a;

    /* renamed from: b */
    public final C9142cw f22456b;

    /* renamed from: c */
    public final boolean f22457c;

    private C9139ct(C9142cw cwVar, C9142cw cwVar2) {
        this.f22455a = cwVar;
        if (cwVar2 == null) {
            this.f22456b = C9142cw.NONE;
        } else {
            this.f22456b = cwVar2;
        }
        this.f22457c = false;
    }

    /* renamed from: a */
    public static C9139ct m24478a(C9142cw cwVar, C9142cw cwVar2) {
        C9166do.m24543a((Object) cwVar, "Impression owner is null");
        if (!cwVar.equals(C9142cw.NONE)) {
            return new C9139ct(cwVar, cwVar2);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }
}
