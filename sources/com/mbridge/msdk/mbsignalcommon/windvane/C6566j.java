package com.mbridge.msdk.mbsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.j */
/* compiled from: WindVaneUtil */
public final class C6566j {

    /* renamed from: a */
    private static final String[] f16378a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* renamed from: b */
    private static final Pattern f16379b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: c */
    private static final Pattern f16380c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: d */
    private static final Pattern f16381d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: e */
    private static final Pattern f16382e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: f */
    private static Map<String, String> f16383f = new HashMap();

    static {
        for (C6561e eVar : C6561e.values()) {
            f16383f.put(eVar.mo44515a(), eVar.mo44516b());
        }
    }

    /* renamed from: a */
    public static boolean m16900a(String str) {
        for (String equals : f16378a) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Pattern m16901b(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f16382e;
        }
        if ("mraid:".equals(str)) {
            return f16380c;
        }
        if ("ssp:".equals(str)) {
            return f16381d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f16382e;
        }
        return null;
    }

    /* renamed from: c */
    public static String m16902c(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            boolean z = true;
            if (charAt > 255) {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> 8).toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                stringBuffer.append(upperCase2);
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        z = false;
                        break;
                    } else if (cArr[i2] == charAt) {
                        stringBuffer.append("\\" + charAt);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    stringBuffer.append(charAt);
                }
            }
        }
        return new String(stringBuffer);
    }

    /* renamed from: d */
    public static boolean m16903d(String str) {
        return m16904e(str).startsWith("image");
    }

    /* renamed from: e */
    public static String m16904e(String str) {
        String str2 = f16383f.get(m16905f(str));
        return str2 == null ? "" : str2;
    }

    /* renamed from: f */
    private static String m16905f(String str) {
        String path;
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (lastIndexOf = path.lastIndexOf(".")) == -1) {
            return "";
        }
        return path.substring(lastIndexOf + 1);
    }
}
