package com.yandex.mobile.ads.impl;

import java.util.Locale;

public class n71 {

    /* renamed from: a */
    private final mo0 f37660a = new mo0();

    /* renamed from: a */
    public String mo68931a() {
        return m39860a("%d.%d%d");
    }

    /* renamed from: b */
    public String mo68932b() {
        return m39860a("%d.%d.%d");
    }

    /* renamed from: a */
    private String m39860a(String str) {
        gj1 a = this.f37660a.mo68843a();
        return String.format(Locale.US, str, new Object[]{Integer.valueOf(a.mo67313a()), Integer.valueOf(a.mo67314b()), Integer.valueOf(a.mo67315c())});
    }
}
