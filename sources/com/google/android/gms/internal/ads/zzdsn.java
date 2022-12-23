package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdsn {
    private zzdxp zzhjb;

    private zzdsn(zzdxp zzdxp) {
        this.zzhjb = zzdxp;
    }

    static final zzdsn zza(zzdxp zzdxp) throws GeneralSecurityException {
        if (zzdxp != null && zzdxp.zzbas() > 0) {
            return new zzdsn(zzdxp);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: package-private */
    public final zzdxp zzaxc() {
        return this.zzhjb;
    }

    public final String toString() {
        return zzdte.zzb(this.zzhjb).toString();
    }
}
