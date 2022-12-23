package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
class zzdvc implements zzdsw<zzdss> {
    private static final Logger logger = Logger.getLogger(zzdvc.class.getName());

    zzdvc() {
    }

    public final Class<zzdss> zzawu() {
        return zzdss.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    static class zza implements zzdss {
        private final zzdsu<zzdss> zzhkw;
        private final byte[] zzhll;

        private zza(zzdsu<zzdss> zzdsu) {
            this.zzhll = new byte[]{0};
            this.zzhkw = zzdsu;
        }

        public final byte[] zzm(byte[] bArr) throws GeneralSecurityException {
            if (this.zzhkw.zzaxh().zzaxf().equals(zzdyb.LEGACY)) {
                return zzdys.zza(this.zzhkw.zzaxh().zzaxg(), this.zzhkw.zzaxh().zzaxd().zzm(zzdys.zza(bArr, this.zzhll)));
            }
            return zzdys.zza(this.zzhkw.zzaxh().zzaxg(), this.zzhkw.zzaxh().zzaxd().zzm(bArr));
        }
    }

    public final /* synthetic */ Object zza(zzdsu zzdsu) throws GeneralSecurityException {
        return new zza(zzdsu);
    }
}
