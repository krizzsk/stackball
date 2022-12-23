package com.yandex.mobile.ads.impl;

import android.os.Build;

class m71 implements dh1 {

    /* renamed from: a */
    private final fh1 f37236a = new fh1();

    m71() {
    }

    /* renamed from: a */
    public String mo66586a() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f37236a.mo67017a());
        this.f37236a.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        if (str2.startsWith(str3)) {
            str = tb1.m42292a(str2);
        } else {
            str = tb1.m42292a(str3) + " " + str2;
        }
        sb2.append(str);
        sb2.append("; Android ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(")");
        sb.append(sb2.toString());
        return sb.toString();
    }
}
