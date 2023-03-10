package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public abstract class zzdqs<V> extends zzdor implements Future<V> {
    protected zzdqs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzawp */
    public abstract Future<? extends V> zzavr();

    public boolean cancel(boolean z) {
        return zzavr().cancel(z);
    }

    public boolean isCancelled() {
        return zzavr().isCancelled();
    }

    public boolean isDone() {
        return zzavr().isDone();
    }

    public V get() throws InterruptedException, ExecutionException {
        return zzavr().get();
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return zzavr().get(j, timeUnit);
    }
}
