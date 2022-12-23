package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdkt extends zzbui<zzdla> implements zzdks<zzdkr> {
    zzdkt(Set<zzbvt<zzdla>> set) {
        super(set);
    }

    public final void zza(zzdkd<zzdkr, ?> zzdkd) {
        zza(new zzdkw(zzdkd));
    }

    public final void zzb(zzdkd<zzdkr, ?> zzdkd) {
        zza(new zzdkv(zzdkd));
    }

    public final void zza(zzdkd<zzdkr, ?> zzdkd, Throwable th) {
        zza(new zzdky(zzdkd, th));
    }

    public final void zzc(zzdkd<zzdkr, ?> zzdkd) {
        zza(new zzdkx(zzdkd));
    }
}
