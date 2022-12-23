package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzchp implements zzbrc, zzbsm, zzbtm {
    private final zzchx zzfyw;
    private final zzcie zzfyx;

    public zzchp(zzchx zzchx, zzcie zzcie) {
        this.zzfyw = zzchx;
        this.zzfyx = zzcie;
    }

    public final void onAdLoaded() {
        this.zzfyw.zzrm().put("action", "loaded");
        this.zzfyx.zzn(this.zzfyw.zzrm());
    }

    public final void onAdFailedToLoad(int i) {
        this.zzfyw.zzrm().put("action", "ftl");
        this.zzfyw.zzrm().put("ftl", String.valueOf(i));
        this.zzfyx.zzn(this.zzfyw.zzrm());
    }

    public final void zzd(zzarj zzarj) {
        this.zzfyw.zzj(zzarj.zzdpe);
    }

    public final void zzb(zzdha zzdha) {
        this.zzfyw.zzc(zzdha);
    }
}
