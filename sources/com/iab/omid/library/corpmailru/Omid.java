package com.iab.omid.library.corpmailru;

import android.content.Context;

public final class Omid {
    private static C4611b INSTANCE = new C4611b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo38760a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo38759a();
    }

    public static boolean isActive() {
        return INSTANCE.mo38762b();
    }
}
