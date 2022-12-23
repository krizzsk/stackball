package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.utils.o */
public class C1553o {

    /* renamed from: a */
    private static final char[] f3784a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static int m3544a(String str) {
        return m3545a(str, 0);
    }

    /* renamed from: a */
    public static int m3545a(String str, int i) {
        return m3556d(str) ? Integer.parseInt(str) : i;
    }

    /* renamed from: a */
    public static String m3546a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i > str.length()) {
            i = str.length();
        }
        return str.substring(0, i);
    }

    /* renamed from: a */
    private static String m3547a(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(str.getBytes("UTF-8"));
            String a = m3551a(instance.digest());
            return num.intValue() > 0 ? a.substring(0, Math.min(num.intValue(), a.length())) : a;
        } catch (Throwable th) {
            throw new RuntimeException("SHA-1 for \"" + str + "\" failed.", th);
        }
    }

    /* renamed from: a */
    public static String m3548a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(str2, str3);
        return buildUpon.build().toString();
    }

    /* renamed from: a */
    public static String m3549a(String str, Map<String, String> map) {
        if (!(str == null || map == null)) {
            for (Map.Entry next : map.entrySet()) {
                str = str.replace((CharSequence) next.getKey(), (CharSequence) next.getValue());
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m3550a(boolean z) {
        return z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    /* renamed from: a */
    public static String m3551a(byte[] bArr) {
        if (bArr != null) {
            char[] cArr = new char[(bArr.length * 2)];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i * 2;
                char[] cArr2 = f3784a;
                cArr[i2] = cArr2[(bArr[i] & 240) >>> 4];
                cArr[i2 + 1] = cArr2[bArr[i] & Ascii.f10109SI];
            }
            return new String(cArr);
        }
        throw new IllegalArgumentException("No data specified");
    }

    /* renamed from: a */
    public static boolean m3552a(String str, String str2) {
        return m3554b(str) && m3554b(str2) && str.toLowerCase().contains(str2.toLowerCase());
    }

    /* renamed from: b */
    public static String m3553b(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return buildUpon.build().toString();
    }

    /* renamed from: b */
    public static boolean m3554b(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: c */
    public static String m3555c(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: d */
    public static boolean m3556d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char charAt = str.charAt(0);
        int i = (charAt == '-' || charAt == '+') ? 1 : 0;
        int length = str.length();
        if (i == 1 && length == 1) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: e */
    public static String m3557e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /* renamed from: f */
    public static String m3558f(String str) {
        return m3547a(str, (Integer) 16);
    }
}
