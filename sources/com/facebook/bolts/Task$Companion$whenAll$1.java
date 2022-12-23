package com.facebook.bolts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(mo72092d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004H\n¢\u0006\u0002\b\u0007"}, mo72093d2 = {"<anonymous>", "", "TResult", "it", "Lcom/facebook/bolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: Task.kt */
final class Task$Companion$whenAll$1<TTaskResult, TContinuationResult> implements Continuation {
    final /* synthetic */ TaskCompletionSource $allFinished;
    final /* synthetic */ ArrayList $causes;
    final /* synthetic */ AtomicInteger $count;
    final /* synthetic */ ReentrantLock $errorLock;
    final /* synthetic */ AtomicBoolean $isCancelled;

    Task$Companion$whenAll$1(ReentrantLock reentrantLock, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, TaskCompletionSource taskCompletionSource) {
        this.$errorLock = reentrantLock;
        this.$causes = arrayList;
        this.$isCancelled = atomicBoolean;
        this.$count = atomicInteger;
        this.$allFinished = taskCompletionSource;
    }

    public final Void then(Task<Object> task) {
        Intrinsics.checkNotNullParameter(task, "it");
        if (task.isFaulted()) {
            Lock lock = this.$errorLock;
            lock.lock();
            try {
                this.$causes.add(task.getError());
            } finally {
                lock.unlock();
            }
        }
        if (task.isCancelled()) {
            this.$isCancelled.set(true);
        }
        if (this.$count.decrementAndGet() == 0) {
            if (this.$causes.size() != 0) {
                if (this.$causes.size() == 1) {
                    this.$allFinished.setError((Exception) this.$causes.get(0));
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("There were %d exceptions.", Arrays.copyOf(new Object[]{Integer.valueOf(this.$causes.size())}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    this.$allFinished.setError(new AggregateException(format, this.$causes));
                }
            } else if (this.$isCancelled.get()) {
                this.$allFinished.setCancelled();
            } else {
                this.$allFinished.setResult(null);
            }
        }
        return null;
    }
}
