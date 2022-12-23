package com.smaato.sdk.banner.widget;

import android.os.Looper;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.NullableSupplier;
import com.smaato.sdk.flow.Action0;
import com.smaato.sdk.flow.Flow;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class BlockingUtils {
    private final Executor executor;

    public BlockingUtils(Executor executor2) {
        this.executor = (Executor) Objects.requireNonNull(executor2);
    }

    /* access modifiers changed from: package-private */
    public final <T> T getBlocking(NullableSupplier<T> nullableSupplier) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return nullableSupplier.get();
        }
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Flow.fromAction(new Action0(atomicReference, nullableSupplier, countDownLatch) {
            public final /* synthetic */ AtomicReference f$0;
            public final /* synthetic */ NullableSupplier f$1;
            public final /* synthetic */ CountDownLatch f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke() {
                BlockingUtils.lambda$getBlocking$0(this.f$0, this.f$1, this.f$2);
            }
        }).subscribeOn(this.executor).subscribe();
        try {
            countDownLatch.await();
            return atomicReference.get();
        } catch (InterruptedException unused) {
            return null;
        }
    }

    static /* synthetic */ void lambda$getBlocking$0(AtomicReference atomicReference, NullableSupplier nullableSupplier, CountDownLatch countDownLatch) throws Throwable {
        atomicReference.set(nullableSupplier.get());
        countDownLatch.countDown();
    }

    /* access modifiers changed from: package-private */
    public final boolean doBlocking(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return true;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Flow subscribeOn = Flow.fromRunnable(runnable).subscribeOn(this.executor);
        countDownLatch.getClass();
        subscribeOn.doOnComplete(new Action0(countDownLatch) {
            public final /* synthetic */ CountDownLatch f$0;

            {
                this.f$0 = r1;
            }

            public final void invoke() {
                this.f$0.countDown();
            }
        }).subscribe();
        try {
            countDownLatch.await();
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }
}
