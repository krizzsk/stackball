package com.flurry.sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.flurry.sdk.cy */
public final class C2514cy<V> extends FutureTask<V> {

    /* renamed from: a */
    private final WeakReference<Callable<V>> f5886a = new WeakReference<>((Object) null);

    /* renamed from: b */
    private final WeakReference<Runnable> f5887b;

    public C2514cy(Runnable runnable, V v) {
        super(runnable, v);
        this.f5887b = new WeakReference<>(runnable);
    }

    /* renamed from: a */
    public final Runnable mo17726a() {
        return (Runnable) this.f5887b.get();
    }
}
