package com.p243my.tracker.obfuscated;

import android.util.Log;

/* renamed from: com.my.tracker.obfuscated.u0 */
public final class C7877u0 {

    /* renamed from: a */
    private static volatile boolean f20172a = false;

    /* renamed from: a */
    public static void m21547a(String str) {
        if (f20172a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str);
        }
    }

    /* renamed from: a */
    public static void m21548a(String str, Throwable th) {
        if (f20172a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str, th);
        }
    }

    /* renamed from: a */
    public static void m21549a(boolean z) {
        f20172a = z;
    }

    /* renamed from: a */
    public static boolean m21550a() {
        return f20172a;
    }

    /* renamed from: b */
    public static void m21551b(String str) {
        if (f20172a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str);
        }
    }

    /* renamed from: b */
    public static void m21552b(String str, Throwable th) {
        if (f20172a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str, th);
        }
    }

    /* renamed from: c */
    public static void m21553c(String str) {
        if (str == null) {
            str = "null";
        }
        Log.i("[myTracker]", str);
    }
}
