package com.iab.omid.library.oguryco;

import android.content.Context;

public final class Omid {
    private static C4759b INSTANCE = new C4759b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo39331a(context.getApplicationContext());
    }

    public static boolean activateWithOmidApiVersion(String str, Context context) {
        INSTANCE.mo39331a(context.getApplicationContext());
        return true;
    }

    public static String getVersion() {
        return INSTANCE.mo39330a();
    }

    public static boolean isActive() {
        return INSTANCE.mo39334b();
    }

    public static boolean isCompatibleWithOmidApiVersion(String str) {
        return INSTANCE.mo39333a(str);
    }
}
