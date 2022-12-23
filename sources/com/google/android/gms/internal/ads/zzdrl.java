package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
class zzdrl extends zzdpz {
    private final ExecutorService zzhih;

    zzdrl(ExecutorService executorService) {
        this.zzhih = (ExecutorService) zzdoj.checkNotNull(executorService);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.zzhih.awaitTermination(j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.zzhih.isShutdown();
    }

    public final boolean isTerminated() {
        return this.zzhih.isTerminated();
    }

    public final void shutdown() {
        this.zzhih.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.zzhih.shutdownNow();
    }

    public final void execute(Runnable runnable) {
        this.zzhih.execute(runnable);
    }
}
