package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbtu implements zzegz<zzbtp> {
    private final zzehm<Set<zzbvt<zzbtt>>> zzfjp;

    private zzbtu(zzehm<Set<zzbvt<zzbtt>>> zzehm) {
        this.zzfjp = zzehm;
    }

    public static zzbtu zzq(zzehm<Set<zzbvt<zzbtt>>> zzehm) {
        return new zzbtu(zzehm);
    }

    public final /* synthetic */ Object get() {
        return new zzbtp(this.zzfjp.get());
    }
}
