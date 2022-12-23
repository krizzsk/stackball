package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbtn implements zzegz<zzbtl> {
    private final zzehm<Set<zzbvt<zzbtq>>> zzfjp;

    private zzbtn(zzehm<Set<zzbvt<zzbtq>>> zzehm) {
        this.zzfjp = zzehm;
    }

    public static zzbtn zzp(zzehm<Set<zzbvt<zzbtq>>> zzehm) {
        return new zzbtn(zzehm);
    }

    public final /* synthetic */ Object get() {
        return new zzbtl(this.zzfjp.get());
    }
}
