package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzbog implements zzdqx<zzbny> {
    private final /* synthetic */ zzdqx zzfld;
    private final /* synthetic */ zzbod zzfle;

    zzbog(zzbod zzbod, zzdqx zzdqx) {
        this.zzfle = zzbod;
        this.zzfld = zzdqx;
    }

    public final void zzb(Throwable th) {
        this.zzfld.zzb(th);
        this.zzfle.zzaic();
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.zzfle.zza(((zzbny) obj).zzfkv, this.zzfld);
    }
}
