package com.smaato.sdk.util;

import android.os.Handler;
import android.os.Looper;
import com.smaato.sdk.util.Disposable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

final class MainScheduler extends AbstractExecutorService implements Scheduler {
    /* access modifiers changed from: private */
    public final Handler handler = HandlerCompat.create(Looper.getMainLooper());

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return false;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
    }

    MainScheduler() {
    }

    public final void execute(Runnable runnable) {
        this.handler.post(runnable);
    }

    public final List<Runnable> shutdownNow() {
        return Collections.emptyList();
    }

    public final Disposable scheduleWithDelay(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            this.handler.postDelayed(runnable, timeUnit.toMillis(j));
            return new Disposable(runnable) {
                public final /* synthetic */ Runnable f$1;

                {
                    this.f$1 = r2;
                }

                public /* synthetic */ void addTo(Collection<Disposable> collection) {
                    Disposable.CC.$default$addTo(this, collection);
                }

                public final void dispose() {
                    MainScheduler.this.lambda$scheduleWithDelay$0$MainScheduler(this.f$1);
                }
            };
        }
        throw new NullPointerException("'task' specified as non-null is null");
    }

    public /* synthetic */ void lambda$scheduleWithDelay$0$MainScheduler(Runnable runnable) {
        this.handler.removeCallbacks(runnable);
    }

    public final Disposable scheduleWithRate(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            PeriodicTask periodicTask = new PeriodicTask(runnable, timeUnit.toMillis(j));
            this.handler.post(periodicTask);
            return periodicTask;
        }
        throw new NullPointerException("'task' specified as non-null is null");
    }

    class PeriodicTask implements Disposable, Runnable {
        private final long interval;
        private final Runnable task;

        public /* synthetic */ void addTo(Collection<Disposable> collection) {
            Disposable.CC.$default$addTo(this, collection);
        }

        PeriodicTask(Runnable runnable, long j) {
            this.task = runnable;
            this.interval = j;
        }

        public final void run() {
            this.task.run();
            MainScheduler.this.handler.postDelayed(this, this.interval);
        }

        public final void dispose() {
            MainScheduler.this.handler.removeCallbacks(this);
        }
    }
}
