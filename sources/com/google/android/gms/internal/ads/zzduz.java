package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzduz {
    @Deprecated
    private static final zzdyd zzhke;
    @Deprecated
    private static final zzdyd zzhkf;
    @Deprecated
    private static final zzdyd zzhkg;
    private static final String zzhlg = new zzduv().getKeyType();

    public static void zzaxl() throws GeneralSecurityException {
        zzdsx.zza(new zzduv(), true);
        zzdsx.zza(new zzduu(), true);
        zzdsx.zza(new zzdvc());
    }

    static {
        zzdyd zzbbq = zzdyd.zzbbq();
        zzhke = zzbbq;
        zzhkf = zzbbq;
        zzhkg = zzbbq;
        try {
            zzaxl();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
