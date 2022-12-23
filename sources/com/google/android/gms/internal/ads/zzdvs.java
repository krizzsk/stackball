package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdvs extends zzecd<zzdvs, zza> implements zzedq {
    private static volatile zzedx<zzdvs> zzea;
    /* access modifiers changed from: private */
    public static final zzdvs zzhma;
    private int zzhlz;

    private zzdvs() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdvs, zza> implements zzedq {
        private zza() {
            super(zzdvs.zzhma);
        }

        /* synthetic */ zza(zzdvr zzdvr) {
            this();
        }
    }

    public final int zzayi() {
        return this.zzhlz;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvr.zzdk[i - 1]) {
            case 1:
                return new zzdvs();
            case 2:
                return new zza((zzdvr) null);
            case 3:
                return zza((zzedo) zzhma, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhlz"});
            case 4:
                return zzhma;
            case 5:
                zzedx<zzdvs> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdvs.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhma);
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

    public static zzdvs zzayj() {
        return zzhma;
    }

    static {
        zzdvs zzdvs = new zzdvs();
        zzhma = zzdvs;
        zzecd.zza(zzdvs.class, zzdvs);
    }
}
