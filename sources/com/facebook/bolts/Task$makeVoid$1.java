package com.facebook.bolts;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0003H\u00030\u0001H\n¢\u0006\u0002\b\u0006"}, mo72093d2 = {"<anonymous>", "Lcom/facebook/bolts/Task;", "Ljava/lang/Void;", "TResult", "task", "kotlin.jvm.PlatformType", "then"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: Task.kt */
final class Task$makeVoid$1<TTaskResult, TContinuationResult> implements Continuation {
    public static final Task$makeVoid$1 INSTANCE = new Task$makeVoid$1();

    Task$makeVoid$1() {
    }

    public final Task<Void> then(Task<TResult> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isCancelled()) {
            return Task.Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Task.Companion.forError(task.getError());
        }
        return Task.Companion.forResult(null);
    }
}
