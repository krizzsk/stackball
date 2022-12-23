package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public abstract class zzdqv<V> extends zzdqs<V> implements zzdri<V> {
    protected zzdqv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzawq */
    public abstract zzdri<? extends V> zzawp();

    public void addListener(Runnable runnable, Executor executor) {
        zzawp().addListener(runnable, executor);
    }
}
