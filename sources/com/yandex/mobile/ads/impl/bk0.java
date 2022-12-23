package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public final class bk0 {
    /* renamed from: a */
    public static void m34268a(String str, String str2) {
        Log.i(str, str2);
    }

    /* renamed from: b */
    public static void m34270b(String str, String str2) {
        Log.w(str, str2);
    }

    /* renamed from: a */
    public static void m34269a(String str, String str2, Throwable th) {
        Log.e(str, m34267a(str2, th));
    }

    /* renamed from: b */
    public static void m34271b(String str, String str2, Throwable th) {
        Log.w(str, m34267a(str2, th));
    }

    /* renamed from: a */
    private static String m34267a(String str, Throwable th) {
        String str2;
        boolean z;
        if (th == null) {
            str2 = null;
        } else {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = false;
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    z = true;
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            if (z) {
                str2 = "UnknownHostException (no network)";
            } else {
                str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + "\n  " + str2.replace("\n", "\n  ") + 10;
    }
}
