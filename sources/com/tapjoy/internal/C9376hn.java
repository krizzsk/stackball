package com.tapjoy.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tapjoy.internal.hn */
public final class C9376hn {

    /* renamed from: a */
    public static final ScheduledExecutorService f23241a = Executors.newScheduledThreadPool(1);

    /* renamed from: b */
    public static final CountDownLatch f23242b = new CountDownLatch(1);

    /* renamed from: c */
    public static final CountDownLatch f23243c = new CountDownLatch(1);

    /* renamed from: d */
    private static final Runnable f23244d = new Runnable() {
        public final void run() {
            if (C9503v.m25546c()) {
                C9376hn.f23242b.countDown();
            } else if (C9503v.m25544a()) {
                C9376hn.f23242b.countDown();
            } else {
                C9376hn.f23241a.schedule(this, 300, TimeUnit.SECONDS);
            }
        }
    };

    /* renamed from: e */
    private static String f23245e;

    /* renamed from: f */
    private static boolean f23246f;

    /* renamed from: a */
    public static void m25195a() {
        f23241a.execute(f23244d);
    }

    /* renamed from: a */
    public static void m25196a(String str, boolean z) {
        f23245e = str;
        f23246f = z;
        f23243c.countDown();
    }

    /* renamed from: b */
    public static String m25197b() {
        return f23245e;
    }

    /* renamed from: c */
    public static boolean m25198c() {
        return f23246f;
    }
}
