package com.yandex.mobile.ads.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class sl1 {
    /* renamed from: a */
    public static void m42056a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str + " not set!");
        }
    }

    /* renamed from: b */
    public static Integer m42057b(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Long m42055a(String str) {
        if (str != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                return Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused) {
            }
        }
        return null;
    }
}
