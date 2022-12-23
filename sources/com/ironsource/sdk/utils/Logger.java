package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.sdk.p150g.C6008d;

public class Logger {

    /* renamed from: a */
    private static boolean f14834a;

    /* renamed from: d */
    public static void m14953d(String str, String str2) {
        if (f14834a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: d */
    public static void m14954d(String str, String str2, Throwable th) {
        if (f14834a) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m14955e(String str, String str2) {
        if (f14834a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: e */
    public static void m14956e(String str, String str2, Throwable th) {
        if (f14834a) {
            Log.e(str, str2, th);
        }
    }

    public static void enableLogging(int i) {
        f14834a = C6008d.C6012d.MODE_0.f14768d != i;
    }

    /* renamed from: i */
    public static void m14957i(String str, String str2) {
        if (f14834a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: i */
    public static void m14958i(String str, String str2, Throwable th) {
        if (f14834a && !TextUtils.isEmpty(str2)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m14959v(String str, String str2) {
        if (f14834a) {
            Log.v(str, str2);
        }
    }

    /* renamed from: v */
    public static void m14960v(String str, String str2, Throwable th) {
        if (f14834a) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m14961w(String str, String str2) {
        if (f14834a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: w */
    public static void m14962w(String str, String str2, Throwable th) {
        if (f14834a) {
            Log.w(str, str2, th);
        }
    }
}
