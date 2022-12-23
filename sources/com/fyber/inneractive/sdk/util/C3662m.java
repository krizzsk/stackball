package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.util.m */
public final class C3662m {

    /* renamed from: a */
    public static final Executor f9942a;

    /* renamed from: b */
    private static final Handler f9943b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final ThreadFactory f9944c = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f9946a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "IAConcurrencyUtil#" + this.f9946a.getAndIncrement());
        }
    };

    /* renamed from: d */
    private static final RejectedExecutionHandler f9945d = new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IAlog.m9034b("rejectedExecution received for - %s", runnable);
        }
    };

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(32), f9944c, f9945d);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f9942a = threadPoolExecutor;
    }

    /* renamed from: a */
    public static void m9138a(Runnable runnable) {
        f9942a.execute(runnable);
    }

    /* renamed from: a */
    public static Handler m9137a() {
        return f9943b;
    }
}
