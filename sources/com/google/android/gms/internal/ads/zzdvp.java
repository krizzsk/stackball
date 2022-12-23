package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdvp extends zzecd<zzdvp, zza> implements zzedq {
    private static volatile zzedx<zzdvp> zzea;
    /* access modifiers changed from: private */
    public static final zzdvp zzhly;
    private int zzhlm;
    private zzdvs zzhlw;

    private zzdvp() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdvp, zza> implements zzedq {
        private zza() {
            super(zzdvp.zzhly);
        }

        /* synthetic */ zza(zzdvq zzdvq) {
            this();
        }
    }

    public final zzdvs zzayc() {
        zzdvs zzdvs = this.zzhlw;
        return zzdvs == null ? zzdvs.zzayj() : zzdvs;
    }

    public final int getKeySize() {
        return this.zzhlm;
    }

    public static zzdvp zzg(zzeaq zzeaq, zzebq zzebq) throws zzeco {
        return (zzdvp) zzecd.zza(zzhly, zzeaq, zzebq);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvq.zzdk[i - 1]) {
            case 1:
                return new zzdvp();
            case 2:
                return new zza((zzdvq) null);
            case 3:
                return zza((zzedo) zzhly, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhlw", "zzhlm"});
            case 4:
                return zzhly;
            case 5:
                zzedx<zzdvp> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdvp.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhly);
                            zzea = zzedx;
                        }
                    }
                }
                return zzedx;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static zzdvp zzayg() {
        return zzhly;
    }

    static {
        zzdvp zzdvp = new zzdvp();
        zzhly = zzdvp;
        zzecd.zza(zzdvp.class, zzdvp);
    }
}
