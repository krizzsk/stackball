package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdsx;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdsz implements zzdsx.zza {
    private final /* synthetic */ zzdsm zzhjs;

    zzdsz(zzdsm zzdsm) {
        this.zzhjs = zzdsm;
    }

    public final Class<?> zzaxk() {
        return null;
    }

    public final <Q> zzdsh<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdsk(this.zzhjs, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzdsh<?> zzaxi() {
        zzdsm zzdsm = this.zzhjs;
        return new zzdsk(zzdsm, zzdsm.zzaxa());
    }

    public final Class<?> zzaxj() {
        return this.zzhjs.getClass();
    }

    public final Set<Class<?>> zzawz() {
        return this.zzhjs.zzawz();
    }
}
