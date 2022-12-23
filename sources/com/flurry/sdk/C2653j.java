package com.flurry.sdk;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.j */
public final class C2653j {

    /* renamed from: a */
    public static final C2653j f6229a = new C2653j("APP");

    /* renamed from: b */
    public static final C2653j f6230b = new C2653j("KILLSWITCH");

    /* renamed from: c */
    private static final Map<String, C2653j> f6231c = new HashMap();

    /* renamed from: d */
    private String f6232d;

    private C2653j(String str) {
        this.f6232d = str;
        f6231c.put(str, this);
    }

    /* renamed from: a */
    public static C2653j m5757a(String str) {
        if (f6231c.containsKey(str)) {
            return f6231c.get(str);
        }
        return new C2653j(str);
    }

    /* renamed from: a */
    public static Collection<C2653j> m5758a() {
        return f6231c.values();
    }

    public final String toString() {
        return this.f6232d;
    }
}
