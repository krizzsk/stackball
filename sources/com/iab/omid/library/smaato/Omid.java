package com.iab.omid.library.smaato;

import android.content.Context;

public final class Omid {
    private static C4803a INSTANCE = new C4803a();

    private Omid() {
    }

    public static boolean activateWithOmidApiVersion(String str, Context context) {
        INSTANCE.mo39449a(context.getApplicationContext());
        return true;
    }

    public static String getVersion() {
        return INSTANCE.mo39448a();
    }

    public static boolean isActive() {
        return INSTANCE.mo39452b();
    }

    public static boolean isCompatibleWithOmidApiVersion(String str) {
        return INSTANCE.mo39451a(str);
    }
}
