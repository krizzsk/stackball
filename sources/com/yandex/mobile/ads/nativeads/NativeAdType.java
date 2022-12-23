package com.yandex.mobile.ads.nativeads;

import com.tapjoy.TapjoyConstants;

public enum NativeAdType {
    CONTENT("content"),
    APP_INSTALL(TapjoyConstants.TJC_APP_PLACEMENT),
    MEDIA("media");
    

    /* renamed from: b */
    private final String f43742b;

    private NativeAdType(String str) {
        this.f43742b = str;
    }

    public String getValue() {
        return this.f43742b;
    }
}
