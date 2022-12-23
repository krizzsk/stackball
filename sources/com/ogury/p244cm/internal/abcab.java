package com.ogury.p244cm.internal;

/* renamed from: com.ogury.cm.internal.abcab */
public abstract class abcab {

    /* renamed from: a */
    private String f20445a = "";

    /* renamed from: b */
    private boolean f20446b = true;

    /* renamed from: d */
    public static <T extends abcab> T m21880d() {
        abbba abbba = abbba.f20411a;
        T c = abbba.m21830c().mo52680c();
        if (c != null) {
            return c;
        }
        throw new babca("null cannot be cast to non-null type T");
    }

    /* renamed from: a */
    public final String mo52698a() {
        return this.f20445a;
    }

    /* renamed from: a */
    public final void mo52699a(String str) {
        bbabc.m22051b(str, "<set-?>");
        this.f20445a = str;
    }

    /* renamed from: a */
    public final void mo52700a(boolean z) {
        this.f20446b = z;
    }

    /* renamed from: b */
    public final boolean mo52701b() {
        abbba abbba = abbba.f20411a;
        if (abbba.m21837f("TCF")) {
            return this.f20446b;
        }
        return false;
    }

    /* renamed from: c */
    public abstract int mo52702c();
}
