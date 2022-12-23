package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdwk extends zzecd<zzdwk, zza> implements zzedq {
    private static volatile zzedx<zzdwk> zzea;
    /* access modifiers changed from: private */
    public static final zzdwk zzhmq;
    private zzdxl zzhmp;

    private zzdwk() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdwk, zza> implements zzedq {
        private zza() {
            super(zzdwk.zzhmq);
        }

        /* synthetic */ zza(zzdwj zzdwj) {
            this();
        }
    }

    public final zzdxl zzayx() {
        zzdxl zzdxl = this.zzhmp;
        return zzdxl == null ? zzdxl.zzbaj() : zzdxl;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwj.zzdk[i - 1]) {
            case 1:
                return new zzdwk();
            case 2:
                return new zza((zzdwj) null);
            case 3:
                return zza((zzedo) zzhmq, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzhmp"});
            case 4:
                return zzhmq;
            case 5:
                zzedx<zzdwk> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdwk.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhmq);
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

    public static zzdwk zzayy() {
        return zzhmq;
    }

    static {
        zzdwk zzdwk = new zzdwk();
        zzhmq = zzdwk;
        zzecd.zza(zzdwk.class, zzdwk);
    }
}
