package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdti extends zzdsl<zzdvl, zzdvk> {
    private final /* synthetic */ zzdth zzhki;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdti(zzdth zzdth, Class cls) {
        super(cls);
        this.zzhki = zzdth;
    }

    public final /* synthetic */ Object zzd(zzedo zzedo) throws GeneralSecurityException {
        zzdvl zzdvl = (zzdvl) zzedo;
        return (zzdvk) ((zzecd) zzdvk.zzaxx().zzb((zzdvo) new zzdtl().zzaxb().zzd(zzdvl.zzaxz())).zzb((zzdxa) new zzduv().zzaxb().zzd(zzdvl.zzaya())).zzen(0).zzbet());
    }

    public final /* synthetic */ zzedo zzq(zzeaq zzeaq) throws zzeco {
        return zzdvl.zze(zzeaq, zzebq.zzbec());
    }

    public final /* synthetic */ void zzc(zzedo zzedo) throws GeneralSecurityException {
        zzdvl zzdvl = (zzdvl) zzedo;
        new zzdtl().zzaxb().zzc(zzdvl.zzaxz());
        new zzduv().zzaxb().zzc(zzdvl.zzaya());
        zzdzy.zzfj(zzdvl.zzaxz().getKeySize());
    }
}
