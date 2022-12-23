package com.iab.omid.library.ironsrc;

import android.content.Context;

public final class Omid {
    private static C4709b INSTANCE = new C4709b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo39120a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo39119a();
    }

    public static boolean isActive() {
        return INSTANCE.mo39122b();
    }
}
