package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcnp implements zzcnj<zzblr> {
    private final Executor zzfhi;
    private final zzdhe zzfll;
    private final zzcey zzfud;
    private final zzbll zzgeo;
    private final Context zzvf;

    public zzcnp(zzbll zzbll, Context context, Executor executor, zzcey zzcey, zzdhe zzdhe) {
        this.zzvf = context;
        this.zzgeo = zzbll;
        this.zzfhi = executor;
        this.zzfud = zzcey;
        this.zzfll = zzdhe;
    }

    public final boolean zza(zzdha zzdha, zzdgo zzdgo) {
        return (zzdgo.zzgtr == null || zzdgo.zzgtr.zzdkw == null) ? false : true;
    }

    public final zzdri<zzblr> zzb(zzdha zzdha, zzdgo zzdgo) {
        return zzdqw.zzb(zzdqw.zzag(null), new zzcno(this, zzdha, zzdgo), this.zzfhi);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzdha zzdha, zzdgo zzdgo, Object obj) throws Exception {
        zzum zzb = zzdhh.zzb(this.zzvf, zzdgo.zzgtt);
        zzbek zzc = this.zzfud.zzc(zzb);
        zzblf zza = this.zzgeo.zza(new zzboi(zzdha, zzdgo, (String) null), new zzble(zzc.getView(), zzc, zzdhh.zze(zzb), zzdgo.zzfil, zzdgo.zzfim, zzdgo.zzfin));
        zza.zzaez().zzb(zzc, false);
        zza.zzaek().zza(new zzcnr(zzc), zzbab.zzdzw);
        zza.zzaez();
        return zzdqw.zzb(zzcfa.zza(zzc, zzdgo.zzgtr.zzdku, zzdgo.zzgtr.zzdkw), new zzcnq(zza), (Executor) zzbab.zzdzw);
    }
}
