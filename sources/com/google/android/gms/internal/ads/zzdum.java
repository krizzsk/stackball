package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zzdum implements zzdsw<zzdsf> {
    private static final Logger logger = Logger.getLogger(zzdum.class.getName());

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    static class zza implements zzdsf {
        private final zzdsu<zzdsf> zzhkw;

        public zza(zzdsu<zzdsf> zzdsu) {
            this.zzhkw = zzdsu;
        }
    }

    zzdum() {
    }

    public final Class<zzdsf> zzawu() {
        return zzdsf.class;
    }

    public final /* synthetic */ Object zza(zzdsu zzdsu) throws GeneralSecurityException {
        return new zza(zzdsu);
    }
}
