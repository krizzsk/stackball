package com.ogury.p244cm.internal;

import android.util.Log;

/* renamed from: com.ogury.cm.internal.abbbc */
public final class abbbc {

    /* renamed from: a */
    public static final abbbc f20427a = new abbbc();

    private abbbc() {
    }

    /* renamed from: a */
    public static void m21853a(String str) {
        bbabc.m22051b(str, "message");
        Log.e("consent_sdk", str);
    }

    /* renamed from: a */
    public static void m21854a(String str, Throwable th) {
        bbabc.m22051b(str, "message");
        bbabc.m22051b(th, "error");
        Log.e("consent_sdk", str, th);
    }

    /* renamed from: a */
    public static void m21855a(Throwable th) {
        bbabc.m22051b(th, "error");
        Log.e("consent_sdk", "caught_error", th);
    }

    /* renamed from: b */
    public static void m21856b(String str) {
        bbabc.m22051b(str, "message");
        Log.d("consent_sdk", str);
    }
}
