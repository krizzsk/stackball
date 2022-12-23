package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcsj<AdT> implements zzcnj<AdT> {
    private final zzdku zzflm;
    private final zzdrh zzghr;
    private final zzaas zzghx;
    /* access modifiers changed from: private */
    public final zzcsk<AdT> zzgig;

    public zzcsj(zzdku zzdku, zzdrh zzdrh, zzaas zzaas, zzcsk<AdT> zzcsk) {
        this.zzflm = zzdku;
        this.zzghr = zzdrh;
        this.zzghx = zzaas;
        this.zzgig = zzcsk;
    }

    public final boolean zza(zzdha zzdha, zzdgo zzdgo) {
        return (this.zzghx == null || zzdgo.zzgtr == null || zzdgo.zzgtr.zzdkw == null) ? false : true;
    }

    public final zzdri<AdT> zzb(zzdha zzdha, zzdgo zzdgo) {
        zzbaj zzbaj = new zzbaj();
        zzcsr zzcsr = new zzcsr();
        zzcsr.zza(new zzcsl(this, zzbaj, zzdha, zzdgo, zzcsr));
        return this.zzflm.zzu(zzdkr.CUSTOM_RENDER_SYN).zza((zzdke) new zzcsi(this, new zzaap(zzcsr, zzdgo.zzgtr.zzdku, zzdgo.zzgtr.zzdkw)), this.zzghr).zzw(zzdkr.CUSTOM_RENDER_ACK).zze(zzbaj).zzaud();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzaap zzaap) throws Exception {
        this.zzghx.zza(zzaap);
    }
}
