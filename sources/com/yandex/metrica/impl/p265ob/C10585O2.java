package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.O2 */
public final class C10585O2 {

    /* renamed from: a */
    public static final /* synthetic */ int f25307a = 0;

    static {
        Pattern.compile("[^0-9a-zA-Z,`’\\.\\+\\-'\\s\"]");
        Pattern.compile("\\s+");
    }

    /* renamed from: a */
    public static String m27103a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    /* renamed from: b */
    public static String m27105b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public static byte[] m27106c(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    /* renamed from: d */
    public static byte[] m27107d(String str) {
        return str == null ? new byte[0] : str.getBytes();
    }

    /* renamed from: a */
    public static String m27102a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    /* renamed from: a */
    public static String m27104a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 240) >> 4));
            sb.append("0123456789abcdef".charAt(b & Ascii.f10109SI));
        }
        return sb.toString();
    }
}
