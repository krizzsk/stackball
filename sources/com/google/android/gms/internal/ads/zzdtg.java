package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zzdtg implements zzdsw<zzdsb> {
    private static final Logger logger = Logger.getLogger(zzdtg.class.getName());

    zzdtg() {
    }

    public final Class<zzdsb> zzawu() {
        return zzdsb.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    static class zza implements zzdsb {
        private final zzdsu<zzdsb> zzhkh;

        private zza(zzdsu<zzdsb> zzdsu) {
            this.zzhkh = zzdsu;
        }

        public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return zzdys.zza(this.zzhkh.zzaxh().zzaxg(), this.zzhkh.zzaxh().zzaxd().zzc(bArr, bArr2));
        }
    }

    public final /* synthetic */ Object zza(zzdsu zzdsu) throws GeneralSecurityException {
        return new zza(zzdsu);
    }
}
