package com.fyber.inneractive.sdk.player.p059c.p080k;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.h */
public final class C3543h {
    /* renamed from: a */
    public static boolean m8800a(String str) {
        return "audio".equals(m8802c(str));
    }

    /* renamed from: b */
    public static boolean m8801b(String str) {
        return "video".equals(m8802c(str));
    }

    /* renamed from: c */
    private static String m8802c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: " + str);
    }
}
