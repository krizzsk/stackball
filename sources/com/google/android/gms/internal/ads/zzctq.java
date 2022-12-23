package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzctq implements zzdqx<zzbws> {
    private final /* synthetic */ zzbxr zzgju;
    private final /* synthetic */ zzctr zzgjv;

    zzctq(zzctr zzctr, zzbxr zzbxr) {
        this.zzgjv = zzctr;
        this.zzgju = zzbxr;
    }

    public final void zzb(Throwable th) {
        synchronized (this.zzgjv) {
            zzdri unused = this.zzgjv.zzgjl = null;
            this.zzgju.zzaee().onAdFailedToLoad(zzcjk.zzd(th));
            zzdhn.zzc(th, "InterstitialAdManagerShim.onFailure");
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbws zzbws = (zzbws) obj;
        synchronized (this.zzgjv) {
            zzdri unused = this.zzgjv.zzgjl = null;
            zzbws unused2 = this.zzgjv.zzgjx = zzbws;
            zzbws.zzahk();
        }
    }
}
