package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbsj implements zzegz<zzbsh> {
    private final zzehm<Set<zzbvt<zzbsm>>> zzfjp;

    private zzbsj(zzehm<Set<zzbvt<zzbsm>>> zzehm) {
        this.zzfjp = zzehm;
    }

    public static zzbsj zzl(zzehm<Set<zzbvt<zzbsm>>> zzehm) {
        return new zzbsj(zzehm);
    }

    public final /* synthetic */ Object get() {
        return new zzbsh(this.zzfjp.get());
    }
}
