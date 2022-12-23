package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdsx;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdtc implements zzdsx.zza {
    private final /* synthetic */ zzdsy zzhjv;
    private final /* synthetic */ zzdsm zzhjw;

    zzdtc(zzdsy zzdsy, zzdsm zzdsm) {
        this.zzhjv = zzdsy;
        this.zzhjw = zzdsm;
    }

    public final <Q> zzdsh<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdsv(this.zzhjv, this.zzhjw, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzdsh<?> zzaxi() {
        zzdsy zzdsy = this.zzhjv;
        return new zzdsv(zzdsy, this.zzhjw, zzdsy.zzaxa());
    }

    public final Class<?> zzaxj() {
        return this.zzhjv.getClass();
    }

    public final Set<Class<?>> zzawz() {
        return this.zzhjv.zzawz();
    }

    public final Class<?> zzaxk() {
        return this.zzhjw.getClass();
    }
}
