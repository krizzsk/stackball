package com.p243my.target;

import android.util.Log;

/* renamed from: com.my.target.e0 */
public final class C7374e0 {

    /* renamed from: a */
    public static boolean f18489a = false;

    /* renamed from: a */
    public static void m18989a(String str) {
        if (f18489a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTarget]", str);
        }
    }

    /* renamed from: b */
    public static void m18990b(String str) {
        if (f18489a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTarget]", str);
        }
    }

    /* renamed from: c */
    public static void m18991c(String str) {
        if (str == null) {
            str = "null";
        }
        Log.i("[myTarget]", str);
    }
}
