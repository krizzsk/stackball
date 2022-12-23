package com.iab.omid.library.inmobi;

import android.content.Context;

public final class Omid {
    private static C4654a INSTANCE = new C4654a();

    private Omid() {
    }

    public static boolean activateWithOmidApiVersion(String str, Context context) {
        INSTANCE.mo38883a(context.getApplicationContext());
        return true;
    }

    public static String getVersion() {
        return INSTANCE.mo38882a();
    }

    public static boolean isActive() {
        return INSTANCE.mo38886b();
    }

    public static boolean isCompatibleWithOmidApiVersion(String str) {
        return INSTANCE.mo38885a(str);
    }
}
