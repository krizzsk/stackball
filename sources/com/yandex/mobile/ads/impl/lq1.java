package com.yandex.mobile.ads.impl;

import com.facebook.internal.security.CertificateUtil;
import java.util.regex.Pattern;

public final class lq1 {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    /* renamed from: a */
    public static void m38895a(fy0 fy0) throws jy0 {
        int b = fy0.mo67105b();
        String h = fy0.mo67116h();
        if (!(h != null && h.startsWith("WEBVTT"))) {
            fy0.mo67112e(b);
            throw new jy0("Expected WEBVTT. Got " + fy0.mo67116h());
        }
    }

    /* renamed from: b */
    public static long m38896b(String str) throws NumberFormatException {
        int i = ih1.f34858a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String parseLong : split[0].split(CertificateUtil.DELIMITER, -1)) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: a */
    public static float m38894a(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
