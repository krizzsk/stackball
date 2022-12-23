package com.appsflyer;

import android.net.TrafficStats;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AFExecutor {

    /* renamed from: ǃ */
    private static AFExecutor f3952;

    /* renamed from: ı */
    ScheduledExecutorService f3953;

    /* renamed from: ɩ */
    final ThreadFactory f3954 = new ThreadFactory() {
        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() {
                public final void run() {
                    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    runnable.run();
                }
            });
        }
    };

    /* renamed from: Ι */
    Executor f3955;

    /* renamed from: ι */
    ScheduledExecutorService f3956;

    private AFExecutor() {
    }

    public static AFExecutor getInstance() {
        if (f3952 == null) {
            f3952 = new AFExecutor();
        }
        return f3952;
    }

    public Executor getThreadPoolExecutor() {
        Executor executor = this.f3955;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.f3955).isTerminated() || ((ThreadPoolExecutor) this.f3955).isTerminating()))) {
            this.f3955 = Executors.newFixedThreadPool(2, this.f3954);
        }
        return this.f3955;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι */
    public final ScheduledThreadPoolExecutor mo13841() {
        ScheduledExecutorService scheduledExecutorService = this.f3956;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.f3956.isTerminated()) {
            this.f3956 = Executors.newScheduledThreadPool(2, this.f3954);
        }
        return (ScheduledThreadPoolExecutor) this.f3956;
    }

    /* renamed from: ı */
    static void m3699(ExecutorService executorService) {
        try {
            AFLogger.afRDLog("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            AFLogger.afRDLog("InterruptedException!!!");
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }
}
