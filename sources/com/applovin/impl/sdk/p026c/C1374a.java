package com.applovin.impl.sdk.p026c;

import java.util.Map;

/* renamed from: com.applovin.impl.sdk.c.a */
public class C1374a {

    /* renamed from: a */
    private final String f3179a;

    /* renamed from: b */
    private final String f3180b;

    /* renamed from: c */
    private final Map<String, String> f3181c;

    public C1374a(String str, String str2) {
        this(str, str2, (Map<String, String>) null);
    }

    public C1374a(String str, String str2, Map<String, String> map) {
        this.f3179a = str;
        this.f3180b = str2;
        this.f3181c = map;
    }

    /* renamed from: a */
    public String mo12879a() {
        return this.f3179a;
    }

    /* renamed from: b */
    public String mo12880b() {
        return this.f3180b;
    }

    /* renamed from: c */
    public Map<String, String> mo12881c() {
        return this.f3181c;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f3179a + '\'' + ", backupUrl='" + this.f3180b + '\'' + ", headers='" + this.f3181c + '\'' + '}';
    }
}
