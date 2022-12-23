package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdxt extends zzecd<zzdxt, zza> implements zzedq {
    private static volatile zzedx<zzdxt> zzea;
    /* access modifiers changed from: private */
    public static final zzdxt zzhpi;
    private int zzhlh;
    private zzdxu zzhph;

    private zzdxt() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdxt, zza> implements zzedq {
        private zza() {
            super(zzdxt.zzhpi);
        }

        public final zza zzfe(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxt) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzb(zzdxu zzdxu) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxt) this.zzhxt).zza(zzdxu);
            return this;
        }

        /* synthetic */ zza(zzdxs zzdxs) {
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

    public final zzdxu zzbbc() {
        zzdxu zzdxu = this.zzhph;
        return zzdxu == null ? zzdxu.zzbbg() : zzdxu;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdxu zzdxu) {
        zzdxu.getClass();
        this.zzhph = zzdxu;
    }

    public static zzdxt zzs(zzeaq zzeaq, zzebq zzebq) throws zzeco {
        return (zzdxt) zzecd.zza(zzhpi, zzeaq, zzebq);
    }

    public static zza zzbbd() {
        return (zza) zzhpi.zzbev();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxs.zzdk[i - 1]) {
            case 1:
                return new zzdxt();
            case 2:
                return new zza((zzdxs) null);
            case 3:
                return zza((zzedo) zzhpi, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhlh", "zzhph"});
            case 4:
                return zzhpi;
            case 5:
                zzedx<zzdxt> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdxt.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhpi);
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
        zzdxt zzdxt = new zzdxt();
        zzhpi = zzdxt;
        zzecd.zza(zzdxt.class, zzdxt);
    }
}
