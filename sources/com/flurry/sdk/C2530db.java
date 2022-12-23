package com.flurry.sdk;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.flurry.sdk.db */
public final class C2530db {

    /* renamed from: a */
    private static boolean f5937a = false;

    /* renamed from: b */
    private static int f5938b = 5;

    /* renamed from: c */
    private static boolean f5939c = false;

    /* renamed from: d */
    private static boolean f5940d = false;

    /* renamed from: a */
    public static void m5472a() {
        f5937a = true;
    }

    /* renamed from: b */
    public static void m5479b() {
        f5937a = false;
    }

    /* renamed from: c */
    public static int m5484c() {
        return f5938b;
    }

    /* renamed from: a */
    public static void m5473a(int i) {
        f5938b = i;
    }

    /* renamed from: d */
    public static boolean m5489d() {
        return f5939c;
    }

    /* renamed from: a */
    public static void m5478a(boolean z) {
        f5939c = z;
    }

    /* renamed from: b */
    private static void m5481b(int i, String str, String str2, Throwable th) {
        m5480b(i, str, str2 + 10 + Log.getStackTraceString(th));
    }

    /* renamed from: b */
    private static void m5480b(int i, String str, String str2) {
        if (!f5937a && f5938b <= i) {
            m5485c(i, str, str2);
        }
    }

    /* renamed from: c */
    private static void m5485c(int i, String str, String str2) {
        if (!f5939c) {
            str = "FlurryAgent";
        }
        int i2 = 0;
        int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
        while (i2 < length) {
            int i3 = 4000 > length - i2 ? length : i2 + 4000;
            if (Log.println(i, str, str2.substring(i2, i3)) > 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m5476a(String str, String str2) {
        m5480b(3, str, str2);
    }

    /* renamed from: a */
    public static void m5477a(String str, String str2, Throwable th) {
        m5481b(6, str, str2, th);
    }

    /* renamed from: b */
    public static void m5482b(String str, String str2) {
        m5480b(6, str, str2);
    }

    /* renamed from: c */
    public static void m5486c(String str, String str2) {
        m5480b(4, str, str2);
    }

    /* renamed from: d */
    public static void m5488d(String str, String str2) {
        m5480b(2, str, str2);
    }

    /* renamed from: b */
    public static void m5483b(String str, String str2, Throwable th) {
        m5481b(5, str, str2, th);
    }

    /* renamed from: e */
    public static void m5490e(String str, String str2) {
        m5480b(5, str, str2);
    }

    /* renamed from: d */
    private static void m5487d(int i, String str, String str2) {
        if (f5939c) {
            m5485c(i, str, str2);
        }
    }

    /* renamed from: a */
    public static void m5474a(int i, String str, String str2) {
        m5487d(i, str, str2);
    }

    /* renamed from: a */
    public static void m5475a(int i, String str, String str2, Throwable th) {
        m5487d(i, str, str2 + 10 + Log.getStackTraceString(th));
    }
}
