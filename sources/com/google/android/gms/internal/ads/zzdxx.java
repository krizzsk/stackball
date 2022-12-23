package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdxx extends zzecd<zzdxx, zza> implements zzedq {
    private static volatile zzedx<zzdxx> zzea;
    /* access modifiers changed from: private */
    public static final zzdxx zzhpm;
    private int zzhlh;
    private zzdxy zzhpl;

    private zzdxx() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdxx, zza> implements zzedq {
        private zza() {
            super(zzdxx.zzhpm);
        }

        public final zza zzff(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxx) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzb(zzdxy zzdxy) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxx) this.zzhxt).zza(zzdxy);
            return this;
        }

        /* synthetic */ zza(zzdxw zzdxw) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzhlh;
    }

    /* access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzhlh = i;
    }

    public final zzdxy zzbbi() {
        zzdxy zzdxy = this.zzhpl;
        return zzdxy == null ? zzdxy.zzbbn() : zzdxy;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdxy zzdxy) {
        zzdxy.getClass();
        this.zzhpl = zzdxy;
    }

    public static zzdxx zzu(zzeaq zzeaq, zzebq zzebq) throws zzeco {
        return (zzdxx) zzecd.zza(zzhpm, zzeaq, zzebq);
    }

    public static zza zzbbj() {
        return (zza) zzhpm.zzbev();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxw.zzdk[i - 1]) {
            case 1:
                return new zzdxx();
            case 2:
                return new zza((zzdxw) null);
            case 3:
                return zza((zzedo) zzhpm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhlh", "zzhpl"});
            case 4:
                return zzhpm;
            case 5:
                zzedx<zzdxx> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdxx.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhpm);
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
        zzdxx zzdxx = new zzdxx();
        zzhpm = zzdxx;
        zzecd.zza(zzdxx.class, zzdxx);
    }
}
