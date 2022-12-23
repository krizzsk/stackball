package com.chartboost.sdk.Networking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.chartboost.sdk.Networking.b */
public final class C1849b {

    /* renamed from: com.chartboost.sdk.Networking.b$a */
    static class C1850a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f4559a = new AtomicInteger(1);

        C1850a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Chartboost Thread #" + this.f4559a.getAndIncrement());
        }
    }

    /* renamed from: a */
    public static ScheduledExecutorService m4174a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new C1850a());
        scheduledThreadPoolExecutor.prestartAllCoreThreads();
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public static ExecutorService m4173a(int i) {
        int i2 = i;
        int i3 = i;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i3, 10, TimeUnit.SECONDS, new PriorityBlockingQueue());
        threadPoolExecutor.prestartAllCoreThreads();
        return threadPoolExecutor;
    }
}
