package com.iab.omid.library.vungle;

import android.content.Context;

public final class Omid {
    private static C4858b INSTANCE = new C4858b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo39682a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo39681a();
    }

    public static boolean isActive() {
        return INSTANCE.mo39684b();
    }
}
