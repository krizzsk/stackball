package com.chartboost.sdk.Libraries;

import android.util.Log;

public final class CBLogging {

    /* renamed from: a */
    public static Level f4375a = Level.INTEGRATION;

    public enum Level {
        NONE,
        INTEGRATION,
        ALL
    }

    /* renamed from: a */
    public static void m3991a(String str, String str2) {
        if (f4375a == Level.ALL) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m3993b(String str, String str2) {
        if (f4375a == Level.ALL) {
            Log.e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m3995c(String str, String str2) {
        if (f4375a == Level.ALL) {
            Log.i(str, str2);
        }
    }

    /* renamed from: d */
    public static void m3996d(String str, String str2) {
        if (f4375a == Level.ALL) {
            Log.v(str, str2);
        }
    }

    /* renamed from: e */
    public static void m3997e(String str, String str2) {
        if (f4375a == Level.ALL) {
            Log.w(str, str2);
        }
    }

    /* renamed from: a */
    public static void m3992a(String str, String str2, Throwable th) {
        if (f4375a == Level.ALL) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: b */
    public static void m3994b(String str, String str2, Throwable th) {
        if (f4375a == Level.ALL) {
            Log.w(str, str2, th);
        }
    }
}
