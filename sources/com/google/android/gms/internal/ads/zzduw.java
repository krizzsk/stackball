package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzduw extends zzdsl<zzdvg, zzdvd> {
    zzduw(zzduu zzduu, Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object zzd(zzedo zzedo) throws GeneralSecurityException {
        zzdvg zzdvg = (zzdvg) zzedo;
        return (zzdvd) ((zzecd) zzdvd.zzaxp().zzem(0).zzt(zzeaq.zzu(zzdzt.zzfi(zzdvg.getKeySize()))).zzd(zzdvg.zzaxo()).zzbet());
    }

    public final /* synthetic */ zzedo zzq(zzeaq zzeaq) throws zzeco {
        return zzdvg.zzc(zzeaq, zzebq.zzbec());
    }

    public final /* synthetic */ void zzc(zzedo zzedo) throws GeneralSecurityException {
        zzdvg zzdvg = (zzdvg) zzedo;
        zzduu.zza(zzdvg.zzaxo());
        zzduu.zzek(zzdvg.getKeySize());
    }
}
