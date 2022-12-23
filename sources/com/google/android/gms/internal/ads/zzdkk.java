package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdkk {
    private final E zzgyz;
    private final /* synthetic */ zzdkg zzgzf;

    private zzdkk(zzdkg zzdkg, E e) {
        this.zzgzf = zzdkg;
        this.zzgyz = e;
    }

    public final <O> zzdkm<O> zze(zzdri<O> zzdri) {
        return new zzdkm(this.zzgzf, this.zzgyz, (String) null, zzdkg.zzgzc, Collections.emptyList(), zzdri, (zzdkf) null);
    }

    public final <O> zzdkm<O> zzc(Callable<O> callable) {
        return zza(callable, this.zzgzf.zzfur);
    }

    private final <O> zzdkm<O> zza(Callable<O> callable, zzdrh zzdrh) {
        return new zzdkm(this.zzgzf, this.zzgyz, (String) null, zzdkg.zzgzc, Collections.emptyList(), zzdrh.zzd(callable), (zzdkf) null);
    }

    public final zzdkm<?> zza(zzdke zzdke, zzdrh zzdrh) {
        return zza(new zzdkj(zzdke), zzdrh);
    }
}
