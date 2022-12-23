package com.smaato.sdk.util;

import com.smaato.sdk.util.Disposable;
import java.util.Collection;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

final class AsyncScheduler extends ScheduledThreadPoolExecutor implements Scheduler {
    AsyncScheduler(ThreadFactory threadFactory) {
        super(Math.max(2, Runtime.getRuntime().availableProcessors()), threadFactory);
    }

    public final Disposable scheduleWithDelay(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            return new Disposable(schedule(runnable, j, timeUnit)) {
                public final /* synthetic */ ScheduledFuture f$0;

                {
                    this.f$0 = r1;
                }

                public /* synthetic */ void addTo(Collection<Disposable> collection) {
                    Disposable.CC.$default$addTo(this, collection);
                }

                public final void dispose() {
                    this.f$0.cancel(true);
                }
            };
        }
        throw new NullPointerException("'task' specified as non-null is null");
    }

    public final Disposable scheduleWithRate(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            return new Disposable(scheduleAtFixedRate(runnable, 0, j, timeUnit)) {
                public final /* synthetic */ ScheduledFuture f$0;

                {
                    this.f$0 = r1;
                }

                public /* synthetic */ void addTo(Collection<Disposable> collection) {
                    Disposable.CC.$default$addTo(this, collection);
                }

                public final void dispose() {
                    this.f$0.cancel(true);
                }
            };
        }
        throw new NullPointerException("'task' specified as non-null is null");
    }
}
