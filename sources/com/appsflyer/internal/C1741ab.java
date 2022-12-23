package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* renamed from: com.appsflyer.internal.ab */
public final class C1741ab {

    /* renamed from: ı */
    private static String f4139;

    /* renamed from: ǃ */
    private static String f4140;

    C1741ab() {
    }

    /* renamed from: ǃ */
    public static void m3848(String str) {
        f4140 = str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        f4139 = sb.toString();
    }

    /* renamed from: ɩ */
    public static void m3849(String str) {
        if (f4140 == null) {
            m3848(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
        }
        String str2 = f4140;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, f4139));
        }
    }
}
