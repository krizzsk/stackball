package com.facebook.bolts;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(mo72092d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u0001H\u0003H\u00030\u0005H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo72093d2 = {"<anonymous>", "Ljava/lang/Void;", "TContinuationResult", "TResult", "task", "Lcom/facebook/bolts/Task;", "kotlin.jvm.PlatformType", "then", "com/facebook/bolts/Task$continueWithTask$1$1"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: Task.kt */
final class Task$continueWithTask$$inlined$withLock$lambda$1<TTaskResult, TContinuationResult> implements Continuation {
    final /* synthetic */ Ref.BooleanRef $completed$inlined;
    final /* synthetic */ Continuation $continuation$inlined;
    final /* synthetic */ CancellationToken $ct$inlined;
    final /* synthetic */ Executor $executor$inlined;
    final /* synthetic */ TaskCompletionSource $tcs$inlined;
    final /* synthetic */ Task this$0;

    Task$continueWithTask$$inlined$withLock$lambda$1(Task task, Ref.BooleanRef booleanRef, TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken) {
        this.this$0 = task;
        this.$completed$inlined = booleanRef;
        this.$tcs$inlined = taskCompletionSource;
        this.$continuation$inlined = continuation;
        this.$executor$inlined = executor;
        this.$ct$inlined = cancellationToken;
    }

    public final Void then(Task<TResult> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Task.Companion.completeAfterTask(this.$tcs$inlined, this.$continuation$inlined, task, this.$executor$inlined, this.$ct$inlined);
        return null;
    }
}
