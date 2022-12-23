package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.yandex.mobile.ads.impl.j9 */
public final class C13479j9 {
    /* renamed from: a */
    public static void m37705a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m37708b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m37706a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m37709b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static int m37702a(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: b */
    public static <T> T m37707b(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: a */
    public static <T> T m37703a(T t) {
        t.getClass();
        return t;
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: a */
    public static String m37704a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }
}
