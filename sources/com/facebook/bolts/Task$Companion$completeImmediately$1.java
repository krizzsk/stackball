package com.facebook.bolts;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "TContinuationResult", "TResult", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: Task.kt */
final class Task$Companion$completeImmediately$1 implements Runnable {
    final /* synthetic */ Continuation $continuation;
    final /* synthetic */ CancellationToken $ct;
    final /* synthetic */ Task $task;
    final /* synthetic */ TaskCompletionSource $tcs;

    Task$Companion$completeImmediately$1(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
        this.$ct = cancellationToken;
        this.$tcs = taskCompletionSource;
        this.$continuation = continuation;
        this.$task = task;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (this.$ct == null || !this.$ct.isCancellationRequested()) {
                    this.$tcs.setResult(this.$continuation.then(this.$task));
                    return;
                }
                this.$tcs.setCancelled();
            } catch (CancellationException unused) {
                this.$tcs.setCancelled();
            } catch (Exception e) {
                this.$tcs.setError(e);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
