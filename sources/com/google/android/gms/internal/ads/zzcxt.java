package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcxt implements zzegz<zzcxp> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Context> zzfmf;

    private zzcxt(zzehm<Context> zzehm, zzehm<zzdrh> zzehm2) {
        this.zzfmf = zzehm;
        this.zzenm = zzehm2;
    }

    public static zzcxt zzau(zzehm<Context> zzehm, zzehm<zzdrh> zzehm2) {
        return new zzcxt(zzehm, zzehm2);
    }

    public static zzcxp zza(Context context, zzdrh zzdrh) {
        return new zzcxp(context, zzdrh);
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfmf.get(), this.zzenm.get());
    }
}
