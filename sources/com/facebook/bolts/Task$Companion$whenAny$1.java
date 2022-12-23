package com.facebook.bolts;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004H\n¢\u0006\u0002\b\u0007"}, mo72093d2 = {"<anonymous>", "Ljava/lang/Void;", "TResult", "it", "Lcom/facebook/bolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: Task.kt */
final class Task$Companion$whenAny$1<TTaskResult, TContinuationResult> implements Continuation {
    final /* synthetic */ TaskCompletionSource $firstCompleted;
    final /* synthetic */ AtomicBoolean $isAnyTaskComplete;

    Task$Companion$whenAny$1(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource) {
        this.$isAnyTaskComplete = atomicBoolean;
        this.$firstCompleted = taskCompletionSource;
    }

    public final Void then(Task<Object> task) {
        Intrinsics.checkNotNullParameter(task, "it");
        if (this.$isAnyTaskComplete.compareAndSet(false, true)) {
            this.$firstCompleted.setResult(task);
            return null;
        }
        task.getError();
        return null;
    }
}
