package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbqb implements zzegz<zzbte> {
    private final zzehm<zzbte> zzfmi;

    private zzbqb(zzehm<zzbte> zzehm) {
        this.zzfmi = zzehm;
    }

    public static zzbqb zzf(zzehm<zzbte> zzehm) {
        return new zzbqb(zzehm);
    }

    public final /* synthetic */ Object get() {
        return (zzbte) zzehf.zza(this.zzfmi.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
