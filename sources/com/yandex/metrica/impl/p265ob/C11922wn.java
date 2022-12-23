package com.yandex.metrica.impl.p265ob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.yandex.metrica.impl.ob.wn */
public class C11922wn implements ThreadFactory {

    /* renamed from: b */
    private static final AtomicInteger f28680b = new AtomicInteger(0);

    /* renamed from: a */
    private final String f28681a;

    public C11922wn(String str) {
        this.f28681a = str;
    }

    /* renamed from: a */
    private String m30800a() {
        String str = this.f28681a;
        return str + "-" + f28680b.incrementAndGet();
    }

    /* renamed from: c */
    public static int m30802c() {
        return f28680b.incrementAndGet();
    }

    /* renamed from: b */
    public C11828un mo64047b() {
        return new C11828un(m30800a());
    }

    public Thread newThread(Runnable runnable) {
        return new C11890vn(runnable, m30800a());
    }

    /* renamed from: a */
    public static C11890vn m30799a(String str, Runnable runnable) {
        return new C11890vn(runnable, new C11922wn(str).m30800a());
    }

    /* renamed from: a */
    public static String m30801a(String str) {
        return str + "-" + f28680b.incrementAndGet();
    }
}
