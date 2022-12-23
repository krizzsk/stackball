package com.smaato.sdk.core.network.execution;

import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;

public final class TaskStepResult<Success, Error> {
    public final Error error;
    public final boolean isCancelled;
    public final Success success;

    private TaskStepResult(Success success2, Error error2, boolean z) {
        this.success = success2;
        this.error = error2;
        this.isCancelled = z;
    }

    /* access modifiers changed from: package-private */
    public final <NewType> TaskStepResult<NewType, Error> andThen(Function<Success, TaskStepResult<NewType, Error>> function) {
        if (this.isCancelled) {
            return cancelled();
        }
        if (this.success == null) {
            return error(this.error);
        }
        if (Thread.currentThread().isInterrupted()) {
            return cancelled();
        }
        return function.apply(this.success);
    }

    /* access modifiers changed from: package-private */
    public final TaskStepResult<Success, Error> doOnError(Consumer<Error> consumer) {
        Error error2 = this.error;
        if (error2 != null) {
            consumer.accept(error2);
        }
        return this;
    }

    public static <Success, Error> TaskStepResult<Success, Error> success(Success success2) {
        return new TaskStepResult<>(success2, (Object) null, false);
    }

    public static <Success, Error> TaskStepResult<Success, Error> error(Error error2) {
        return new TaskStepResult<>((Object) null, error2, false);
    }

    public static <Success, Error> TaskStepResult<Success, Error> cancelled() {
        return new TaskStepResult<>((Object) null, (Object) null, true);
    }

    public final String toString() {
        return "TaskStepResult{error=" + this.error + ", success=" + this.success + ", isCancelled=" + this.isCancelled + '}';
    }
}
