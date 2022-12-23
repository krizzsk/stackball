package com.tapjoy.internal;

import android.os.Looper;

/* renamed from: com.tapjoy.internal.gw */
public final class C9340gw {

    /* renamed from: a */
    public static boolean f23095a;

    /* renamed from: a */
    public static void m25043a(String str) {
        if (f23095a) {
            C9507x.m25548a(4, "Tapjoy", str, (Throwable) null);
        }
    }

    /* renamed from: a */
    public static void m25045a(String str, Object... objArr) {
        if (f23095a) {
            C9507x.m25549a(4, "Tapjoy", str, objArr);
        }
    }

    /* renamed from: b */
    public static void m25048b(String str) {
        if (f23095a) {
            C9507x.m25548a(6, "Tapjoy", str, (Throwable) null);
        }
    }

    /* renamed from: b */
    public static void m25049b(String str, Object... objArr) {
        if (f23095a) {
            C9507x.m25550a("Tapjoy", str, objArr);
        }
    }

    /* renamed from: a */
    public static void m25044a(String str, String str2, String str3) {
        if (f23095a) {
            C9507x.m25550a("Tapjoy", "{}: {} {}", str, str2, str3);
        }
    }

    /* renamed from: a */
    public static boolean m25046a(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        if (!f23095a) {
            return false;
        }
        m25048b(str);
        return false;
    }

    /* renamed from: a */
    public static boolean m25047a(boolean z, String str) {
        if (!f23095a || z) {
            return z;
        }
        m25048b(str);
        throw new IllegalStateException(str);
    }

    /* renamed from: c */
    public static boolean m25050c(String str) {
        boolean z = Looper.myLooper() == Looper.getMainLooper();
        return m25047a(z, str + ": Must be called on the main/ui thread");
    }
}
