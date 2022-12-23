package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.cl */
public final class C8106cl {

    /* renamed from: a */
    public static final C8106cl f21036a = new C8106cl();

    private C8106cl() {
    }

    /* renamed from: a */
    public static boolean m22596a() {
        return m22597a("androidx.fragment.app.Fragment");
    }

    /* renamed from: a */
    private static boolean m22597a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
