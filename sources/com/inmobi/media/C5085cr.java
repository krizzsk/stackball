package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.inmobi.media.cr */
/* compiled from: VastNetworkClient */
final class C5085cr {

    /* renamed from: d */
    public static final Executor f11645d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f11646e = C5085cr.class.getSimpleName();

    /* renamed from: g */
    private static final int f11647g;

    /* renamed from: h */
    private static final int f11648h;

    /* renamed from: i */
    private static final int f11649i = ((f11647g * 2) + 1);

    /* renamed from: j */
    private static final ThreadFactory f11650j = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f11656a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "VastNetworkTask #" + this.f11656a.getAndIncrement());
        }
    };

    /* renamed from: k */
    private static final BlockingQueue<Runnable> f11651k = new LinkedBlockingQueue(128);
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C5299gc f11652a;

    /* renamed from: b */
    WeakReference<C5084cq> f11653b;

    /* renamed from: c */
    long f11654c = 0;

    /* renamed from: f */
    private final CountDownLatch f11655f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f11647g = availableProcessors;
        f11648h = Math.max(2, Math.min(availableProcessors - 1, 4));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f11648h, f11649i, 30, TimeUnit.SECONDS, f11651k, f11650j);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f11645d = threadPoolExecutor;
    }

    public C5085cr(C5084cq cqVar, int i, CountDownLatch countDownLatch) {
        C5299gc gcVar = new C5299gc("GET", cqVar.f11640a);
        this.f11652a = gcVar;
        gcVar.f12136o = false;
        this.f11652a.f12142u = false;
        this.f11652a.f12132k = i;
        this.f11653b = new WeakReference<>(cqVar);
        this.f11655f = countDownLatch;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40349a() {
        CountDownLatch countDownLatch = this.f11655f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* renamed from: a */
    public final void mo40350a(C5300gd gdVar) {
        try {
            C5369hy.m12420a().mo40732a(this.f11652a.mo40623h());
            C5369hy.m12420a().mo40733b(gdVar.mo40628d());
        } catch (Exception unused) {
        } finally {
            mo40349a();
        }
    }
}
