package com.yandex.mobile.ads.base;

import com.p243my.tracker.ads.AdFormat;

/* renamed from: com.yandex.mobile.ads.base.n */
public enum C12115n {
    BANNER(AdFormat.BANNER),
    INTERSTITIAL("interstitial"),
    REWARDED("rewarded"),
    NATIVE("native"),
    VASTVIDEO("vastvideo"),
    INSTREAM("instream");
    

    /* renamed from: b */
    private final String f29207b;

    private C12115n(String str) {
        this.f29207b = str;
    }

    /* renamed from: a */
    public String mo64574a() {
        return this.f29207b;
    }

    /* renamed from: a */
    public static C12115n m31422a(String str) {
        for (C12115n nVar : values()) {
            if (nVar.f29207b.equals(str)) {
                return nVar;
            }
        }
        return null;
    }
}
