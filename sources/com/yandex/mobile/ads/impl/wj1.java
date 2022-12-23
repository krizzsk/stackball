package com.yandex.mobile.ads.impl;

public final class wj1 {

    /* renamed from: a */
    private final String f42022a;

    wj1(int i, String str) {
        this(i, str, (String) null);
    }

    /* renamed from: a */
    public static wj1 m43661a() {
        return new wj1(1, "Internal error. Failed to parse response", (String) null);
    }

    /* renamed from: c */
    public static wj1 m43665c(String str) {
        return new wj1(4, str, (String) null);
    }

    /* renamed from: b */
    public String mo70710b() {
        return this.f42022a;
    }

    private wj1(int i, String str, String str2) {
        this.f42022a = str;
    }

    /* renamed from: b */
    public static wj1 m43664b(String str) {
        return new wj1(1, str, (String) null);
    }

    /* renamed from: a */
    public static wj1 m43662a(e30 e30) {
        return new wj1(3, e30.getMessage() != null ? e30.getMessage() : "Ad request completed successfully, but there are no ads available", (String) null);
    }

    /* renamed from: a */
    public static wj1 m43663a(String str) {
        if (str == null) {
            str = "Ad request failed with network error";
        }
        return new wj1(2, str, (String) null);
    }
}
