package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.text.TextUtils;

class mc1 implements dh1 {
    mc1() {
    }

    /* renamed from: a */
    public String mo66586a() {
        String str;
        String str2 = null;
        try {
            str = System.getProperty("http.agent");
        } catch (Exception unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Dalvik/");
        try {
            str2 = System.getProperty("java.vm.version");
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "1.0.0";
        }
        sb.append(str2);
        sb.append(" (Linux; U; Android ");
        String str3 = Build.VERSION.RELEASE;
        if (str3.length() <= 0) {
            str3 = "1.0";
        }
        sb.append(str3);
        if ("REL".equals(Build.VERSION.CODENAME)) {
            String str4 = Build.MODEL;
            if (str4.length() > 0) {
                sb.append("; ");
                sb.append(str4);
            }
        }
        String str5 = Build.ID;
        if (str5.length() > 0) {
            sb.append(" Build/");
            sb.append(str5);
        }
        sb.append(")");
        return sb.toString();
    }
}
