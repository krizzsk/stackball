package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdif implements zzegz<Context> {
    private final zzdie zzgvr;
    private final zzehm<zzdic> zzgvs;

    private zzdif(zzdie zzdie, zzehm<zzdic> zzehm) {
        this.zzgvr = zzdie;
        this.zzgvs = zzehm;
    }

    public static zzdif zzb(zzdie zzdie, zzehm<zzdic> zzehm) {
        return new zzdif(zzdie, zzehm);
    }

    public static Context zzb(zzdie zzdie, zzdic zzdic) {
        return (Context) zzehf.zza(zzdic.zzzo, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzb(this.zzgvr, this.zzgvs.get());
    }
}
