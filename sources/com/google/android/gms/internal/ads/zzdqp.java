package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
enum zzdqp implements Executor {
    INSTANCE;

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
