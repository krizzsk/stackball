package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbyd implements zzbqx {
    private final zzbro zzfpi;
    private final zzdgo zzfpj;

    public zzbyd(zzbro zzbro, zzdgo zzdgo) {
        this.zzfpi = zzbro;
        this.zzfpj = zzdgo;
    }

    public final void onAdClosed() {
    }

    public final void onAdLeftApplication() {
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }

    public final void zzb(zzasd zzasd, String str, String str2) {
    }

    public final void onAdOpened() {
        if (this.zzfpj.zzgub == 0 || this.zzfpj.zzgub == 1) {
            this.zzfpi.onAdImpression();
        }
    }
}
