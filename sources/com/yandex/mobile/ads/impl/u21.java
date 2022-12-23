package com.yandex.mobile.ads.impl;

import java.util.Map;
import java.util.WeakHashMap;

public final class u21 {

    /* renamed from: b */
    private static final Object f40548b = new Object();

    /* renamed from: c */
    private static volatile u21 f40549c;

    /* renamed from: a */
    private final Map<l41<?>, String> f40550a = new WeakHashMap();

    private u21() {
    }

    /* renamed from: a */
    public static u21 m42589a() {
        if (f40549c == null) {
            synchronized (f40548b) {
                if (f40549c == null) {
                    f40549c = new u21();
                }
            }
        }
        return f40549c;
    }

    /* renamed from: a */
    public String mo70279a(l41<?> l41) {
        String str;
        synchronized (f40548b) {
            str = this.f40550a.get(l41);
        }
        return str;
    }
}
