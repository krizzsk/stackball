package com.facebook.bolts;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, mo72093d2 = {"<anonymous>", "", "TResult", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: Task.kt */
final class Task$Companion$delay$scheduled$1 implements Runnable {
    final /* synthetic */ TaskCompletionSource $tcs;

    Task$Companion$delay$scheduled$1(TaskCompletionSource taskCompletionSource) {
        this.$tcs = taskCompletionSource;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                this.$tcs.trySetResult(null);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
