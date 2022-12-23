package com.yandex.mobile.ads.impl;

public enum w11 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f41847b;

    private w11(String str) {
        this.f41847b = str;
    }

    public String toString() {
        return this.f41847b;
    }
}
