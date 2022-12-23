package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.config.VersionInfo;

public enum rn0 {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    f39520g(VersionInfo.GIT_BRANCH),
    OPTIONS("OPTIONS"),
    TRACE("TRACE"),
    PATCH("PATCH");
    

    /* renamed from: b */
    private final String f39525b;

    private rn0(String str) {
        this.f39525b = str;
    }

    /* renamed from: a */
    public final String mo69796a() {
        return this.f39525b;
    }
}
