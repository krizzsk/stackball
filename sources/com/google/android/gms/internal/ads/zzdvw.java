package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdvw extends zzecd<zzdvw, zza> implements zzedq {
    private static volatile zzedx<zzdvw> zzea;
    /* access modifiers changed from: private */
    public static final zzdvw zzhmd;
    private int zzhlm;
    private zzdvx zzhmb;

    private zzdvw() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdvw, zza> implements zzedq {
        private zza() {
            super(zzdvw.zzhmd);
        }

        /* synthetic */ zza(zzdvv zzdvv) {
            this();
        }
    }

    public final zzdvx zzayl() {
        zzdvx zzdvx = this.zzhmb;
        return zzdvx == null ? zzdvx.zzayp() : zzdvx;
    }

    public final int getKeySize() {
        return this.zzhlm;
    }

    public static zzdvw zzi(zzeaq zzeaq, zzebq zzebq) throws zzeco {
        return (zzdvw) zzecd.zza(zzhmd, zzeaq, zzebq);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvv.zzdk[i - 1]) {
            case 1:
                return new zzdvw();
            case 2:
                return new zza((zzdvv) null);
            case 3:
                return zza((zzedo) zzhmd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhmb", "zzhlm"});
            case 4:
                return zzhmd;
            case 5:
                zzedx<zzdvw> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdvw.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhmd);
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

    static {
        zzdvw zzdvw = new zzdvw();
        zzhmd = zzdvw;
        zzecd.zza(zzdvw.class, zzdvw);
    }
}
