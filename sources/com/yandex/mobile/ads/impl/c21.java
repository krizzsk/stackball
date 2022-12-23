package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.Locale;

public class c21 {

    /* renamed from: a */
    private static boolean f31791a;

    /* renamed from: a */
    public static void m34568a(boolean z) {
        f31791a = z;
    }

    /* renamed from: b */
    public static void m34569b(String str, Object... objArr) {
        if (f31791a) {
            Log.i("Yandex Mobile Ads", String.format(Locale.US, str, objArr));
        }
    }

    /* renamed from: c */
    public static void m34570c(String str, Object... objArr) {
        if (f31791a) {
            Log.w("Yandex Mobile Ads", String.format(Locale.US, str, objArr));
        }
    }

    /* renamed from: a */
    public static void m34567a(String str, Object... objArr) {
        if (f31791a) {
            Log.e("Yandex Mobile Ads", String.format(Locale.US, str, objArr));
        }
    }
}
