package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdrw<V> extends zzdqq<V> implements RunnableFuture<V> {
    private volatile zzdre<?> zzhis;

    static <V> zzdrw<V> zze(Callable<V> callable) {
        return new zzdrw<>(callable);
    }

    static <V> zzdrw<V> zza(Runnable runnable, @NullableDecl V v) {
        return new zzdrw<>(Executors.callable(runnable, v));
    }

    private zzdrw(Callable<V> callable) {
        this.zzhis = new zzdry(this, callable);
    }

    zzdrw(zzdqh<V> zzdqh) {
        this.zzhis = new zzdrv(this, zzdqh);
    }

    public final void run() {
        zzdre<?> zzdre = this.zzhis;
        if (zzdre != null) {
            zzdre.run();
        }
        this.zzhis = null;
    }

    /* access modifiers changed from: protected */
    public final void afterDone() {
        zzdre<?> zzdre;
        super.afterDone();
        if (wasInterrupted() && (zzdre = this.zzhis) != null) {
            zzdre.interruptTask();
        }
        this.zzhis = null;
    }

    /* access modifiers changed from: protected */
    public final String pendingToString() {
        zzdre<?> zzdre = this.zzhis;
        if (zzdre == null) {
            return super.pendingToString();
        }
        String valueOf = String.valueOf(zzdre);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
