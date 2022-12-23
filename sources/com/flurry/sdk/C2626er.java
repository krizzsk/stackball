package com.flurry.sdk;

import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

/* renamed from: com.flurry.sdk.er */
public final class C2626er {

    /* renamed from: a */
    private static final Pattern f6170a = Pattern.compile("/");

    /* renamed from: b */
    private static URI m5719b(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m5718a(String str) {
        URI b;
        if (TextUtils.isEmpty(str) || (b = m5719b(str)) == null) {
            return false;
        }
        if (b.getScheme() == null || "http".equalsIgnoreCase(b.getScheme()) || "https".equalsIgnoreCase(b.getScheme())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m5717a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (new URI(str).isAbsolute() || TextUtils.isEmpty(str2)) {
                return str;
            }
            URI uri = new URI(str2);
            return uri.getScheme() + "://" + uri.getHost() + str;
        } catch (Exception unused) {
            return str;
        }
    }
}
