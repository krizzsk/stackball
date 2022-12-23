package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcsa implements zzcnj<zzblx> {
    private final zzdku zzflm;
    private final zzbmt zzgeq;
    private final zzdrh zzghr;
    private final Context zzghw;
    private final zzaas zzghx;

    public zzcsa(Context context, zzbmt zzbmt, zzdku zzdku, zzdrh zzdrh, zzaas zzaas) {
        this.zzghw = context;
        this.zzgeq = zzbmt;
        this.zzflm = zzdku;
        this.zzghr = zzdrh;
        this.zzghx = zzaas;
    }

    public final boolean zza(zzdha zzdha, zzdgo zzdgo) {
        return (this.zzghx == null || zzdgo.zzgtr == null || zzdgo.zzgtr.zzdkw == null) ? false : true;
    }

    public final zzdri<zzblx> zzb(zzdha zzdha, zzdgo zzdgo) {
        zzblw zza = this.zzgeq.zza(new zzboi(zzdha, zzdgo, (String) null), (zzbma) new zzcsf(this, new View(this.zzghw), (zzbek) null, zzcsd.zzgib, zzdgo.zzgtt.get(0)));
        return this.zzflm.zzu(zzdkr.CUSTOM_RENDER_SYN).zza((zzdke) new zzcsc(this, new zzaap(zza.zzafl(), zzdgo.zzgtr.zzdku, zzdgo.zzgtr.zzdkw)), this.zzghr).zzw(zzdkr.CUSTOM_RENDER_ACK).zze(zzdqw.zzag(zza.zzafj())).zzaud();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzaap zzaap) throws Exception {
        this.zzghx.zza(zzaap);
    }
}
