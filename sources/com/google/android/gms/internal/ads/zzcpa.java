package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcpa implements zzegz<zzcov> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzfib;
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<zzcey> zzfuf;
    private final zzehm<zzbxr> zzges;

    public zzcpa(zzehm<Context> zzehm, zzehm<zzazz> zzehm2, zzehm<zzdhe> zzehm3, zzehm<Executor> zzehm4, zzehm<zzbxr> zzehm5, zzehm<zzcey> zzehm6) {
        this.zzenp = zzehm;
        this.zzfib = zzehm2;
        this.zzfjq = zzehm3;
        this.zzfjj = zzehm4;
        this.zzges = zzehm5;
        this.zzfuf = zzehm6;
    }

    public final /* synthetic */ Object get() {
        return new zzcov(this.zzenp.get(), this.zzfib.get(), this.zzfjq.get(), this.zzfjj.get(), this.zzges.get(), this.zzfuf.get());
    }
}
