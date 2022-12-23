package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdvh extends zzecd<zzdvh, zza> implements zzedq {
    private static volatile zzedx<zzdvh> zzea;
    /* access modifiers changed from: private */
    public static final zzdvh zzhlp;
    private int zzhlo;

    private zzdvh() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdvh, zza> implements zzedq {
        private zza() {
            super(zzdvh.zzhlp);
        }

        /* synthetic */ zza(zzdvi zzdvi) {
            this();
        }
    }

    public final int zzaxs() {
        return this.zzhlo;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvi.zzdk[i - 1]) {
            case 1:
                return new zzdvh();
            case 2:
                return new zza((zzdvi) null);
            case 3:
                return zza((zzedo) zzhlp, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhlo"});
            case 4:
                return zzhlp;
            case 5:
                zzedx<zzdvh> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdvh.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhlp);
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

    public static zzdvh zzaxt() {
        return zzhlp;
    }

    static {
        zzdvh zzdvh = new zzdvh();
        zzhlp = zzdvh;
        zzecd.zza(zzdvh.class, zzdvh);
    }
}
