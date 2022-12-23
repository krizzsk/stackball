package com.applovin.impl.sdk.p023a;

import java.util.Map;

/* renamed from: com.applovin.impl.sdk.a.c */
public class C1342c {

    /* renamed from: a */
    private final String f2657a;

    /* renamed from: b */
    private Map<String, String> f2658b;

    private C1342c(String str, Map<String, String> map) {
        this.f2657a = str;
        this.f2658b = map;
    }

    /* renamed from: a */
    public static C1342c m2403a(String str) {
        return m2404a(str, (Map<String, String>) null);
    }

    /* renamed from: a */
    public static C1342c m2404a(String str, Map<String, String> map) {
        return new C1342c(str, map);
    }

    /* renamed from: a */
    public Map<String, String> mo12639a() {
        return this.f2658b;
    }

    /* renamed from: b */
    public String mo12640b() {
        return this.f2657a;
    }
}
