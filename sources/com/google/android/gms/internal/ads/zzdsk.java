package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzedo;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zzdsk<PrimitiveT, KeyProtoT extends zzedo> implements zzdsh<PrimitiveT> {
    private final zzdsm<KeyProtoT> zzhiw;
    private final Class<PrimitiveT> zzhix;

    public zzdsk(zzdsm<KeyProtoT> zzdsm, Class<PrimitiveT> cls) {
        if (zzdsm.zzawz().contains(cls) || Void.class.equals(cls)) {
            this.zzhiw = zzdsm;
            this.zzhix = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzdsm.toString(), cls.getName()}));
    }

    public final PrimitiveT zzm(zzeaq zzeaq) throws GeneralSecurityException {
        try {
            return zzb(this.zzhiw.zzr(zzeaq));
        } catch (zzeco e) {
            String valueOf = String.valueOf(this.zzhiw.zzawx().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    public final PrimitiveT zza(zzedo zzedo) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.zzhiw.zzawx().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (this.zzhiw.zzawx().isInstance(zzedo)) {
            return zzb(zzedo);
        }
        throw new GeneralSecurityException(concat);
    }

    public final zzedo zzn(zzeaq zzeaq) throws GeneralSecurityException {
        try {
            return zzawv().zzp(zzeaq);
        } catch (zzeco e) {
            String valueOf = String.valueOf(this.zzhiw.zzaxb().zzaww().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    public final String getKeyType() {
        return this.zzhiw.getKeyType();
    }

    public final zzdxf zzo(zzeaq zzeaq) throws GeneralSecurityException {
        try {
            return (zzdxf) ((zzecd) zzdxf.zzbag().zzhm(this.zzhiw.getKeyType()).zzaf(zzawv().zzp(zzeaq).zzbce()).zzb(this.zzhiw.zzawy()).zzbet());
        } catch (zzeco e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    public final Class<PrimitiveT> zzawu() {
        return this.zzhix;
    }

    private final PrimitiveT zzb(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzhix)) {
            this.zzhiw.zze(keyprotot);
            return this.zzhiw.zza(keyprotot, this.zzhix);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    private final zzdsj<?, KeyProtoT> zzawv() {
        return new zzdsj<>(this.zzhiw.zzaxb());
    }
}
