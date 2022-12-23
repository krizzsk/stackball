package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdsx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdta implements zzdsx.zza {
    private final /* synthetic */ zzdsh zzhjt;

    zzdta(zzdsh zzdsh) {
        this.zzhjt = zzdsh;
    }

    public final Class<?> zzaxk() {
        return null;
    }

    public final <Q> zzdsh<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        if (this.zzhjt.zzawu().equals(cls)) {
            return this.zzhjt;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    public final zzdsh<?> zzaxi() {
        return this.zzhjt;
    }

    public final Class<?> zzaxj() {
        return this.zzhjt.getClass();
    }

    public final Set<Class<?>> zzawz() {
        return Collections.singleton(this.zzhjt.zzawu());
    }
}
