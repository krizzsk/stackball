package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbiz implements zzegz<zzalc> {
    private final zzbiv zzffn;

    public zzbiz(zzbiv zzbiv) {
        this.zzffn = zzbiv;
    }

    public static zzalc zzb(zzbiv zzbiv) {
        return (zzalc) zzehf.zza(zzbiv.zzadx(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzb(this.zzffn);
    }
}
