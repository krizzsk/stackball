package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* renamed from: com.mbridge.msdk.foundation.tools.q */
/* compiled from: SameLogTool */
public final class C6361q {

    /* renamed from: a */
    public static boolean f15769a = false;

    /* renamed from: b */
    public static boolean f15770b = false;

    /* renamed from: c */
    public static boolean f15771c = false;

    /* renamed from: d */
    public static boolean f15772d = false;

    /* renamed from: e */
    public static boolean f15773e = false;

    /* renamed from: f */
    public static boolean f15774f = false;

    /* renamed from: g */
    public static boolean f15775g = false;

    /* renamed from: h */
    public static boolean f15776h = false;

    static {
        if (!MBridgeConstans.DEBUG) {
        }
    }

    /* renamed from: a */
    public static void m16154a(String str, String str2) {
        if (f15770b) {
            Log.d(m16153a(str), str2);
        }
    }

    /* renamed from: b */
    public static void m16156b(String str, String str2) {
        if (f15771c) {
            Log.i(m16153a(str), str2);
        }
    }

    /* renamed from: c */
    public static void m16157c(String str, String str2) {
        if (f15772d) {
            Log.w(m16153a(str), str2);
        }
    }

    /* renamed from: d */
    public static void m16158d(String str, String str2) {
        if (f15773e && str2 != null) {
            Log.e(m16153a(str), str2);
        }
    }

    /* renamed from: a */
    public static void m16155a(String str, String str2, Throwable th) {
        if (f15773e && str2 != null && th != null) {
            Log.e(m16153a(str), str2, th);
        }
    }

    /* renamed from: a */
    private static String m16153a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }
}
