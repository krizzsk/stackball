package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdux extends zzdsl<zzdxb, zzdxa> {
    private final /* synthetic */ zzduv zzhlf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdux(zzduv zzduv, Class cls) {
        super(cls);
        this.zzhlf = zzduv;
    }

    public final /* synthetic */ Object zzd(zzedo zzedo) throws GeneralSecurityException {
        zzdxb zzdxb = (zzdxb) zzedo;
        return (zzdxa) ((zzecd) zzdxa.zzazv().zzex(0).zzd(zzdxb.zzazu()).zzad(zzeaq.zzu(zzdzt.zzfi(zzdxb.getKeySize()))).zzbet());
    }

    public final /* synthetic */ zzedo zzq(zzeaq zzeaq) throws zzeco {
        return zzdxb.zzr(zzeaq, zzebq.zzbec());
    }

    public final /* synthetic */ void zzc(zzedo zzedo) throws GeneralSecurityException {
        zzdxb zzdxb = (zzdxb) zzedo;
        if (zzdxb.getKeySize() >= 16) {
            zzduv.zza(zzdxb.zzazu());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
