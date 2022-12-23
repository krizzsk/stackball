package com.iab.omid.library.adcolony;

import android.content.Context;

public final class Omid {

    /* renamed from: a */
    private static C4561b f10220a = new C4561b();

    private Omid() {
    }

    public static void activate(Context context) {
        f10220a.mo38574a(context.getApplicationContext());
    }

    public static String getVersion() {
        return f10220a.mo38573a();
    }

    public static boolean isActive() {
        return f10220a.mo38576b();
    }
}
