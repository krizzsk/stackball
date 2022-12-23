package com.yandex.mobile.ads.impl;

import java.net.URL;

public final class aj1 {

    /* renamed from: a */
    private final String f30560a;

    /* renamed from: b */
    private final URL f30561b;

    /* renamed from: c */
    private final String f30562c;

    private aj1(String str, URL url, String str2) {
        this.f30560a = str;
        this.f30561b = url;
        this.f30562c = str2;
    }

    /* renamed from: a */
    public static aj1 m33750a(String str, URL url, String str2) {
        wt1.m43868a(str, "VendorKey is null or empty");
        wt1.m43868a(str2, "VerificationParameters is null or empty");
        return new aj1(str, url, str2);
    }

    /* renamed from: a */
    public static aj1 m33751a(URL url) {
        return new aj1((String) null, url, (String) null);
    }

    /* renamed from: a */
    public URL mo65785a() {
        return this.f30561b;
    }

    /* renamed from: b */
    public String mo65786b() {
        return this.f30560a;
    }

    /* renamed from: c */
    public String mo65787c() {
        return this.f30562c;
    }
}
