package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcco implements zzegz<zzcck> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzcca> zzfvh;

    public zzcco(zzehm<Executor> zzehm, zzehm<zzcca> zzehm2) {
        this.zzenm = zzehm;
        this.zzfvh = zzehm2;
    }

    public final /* synthetic */ Object get() {
        return new zzcck(this.zzenm.get(), this.zzfvh.get());
    }
}
