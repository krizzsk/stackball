package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdxa extends zzecd<zzdxa, zza> implements zzedq {
    private static volatile zzedx<zzdxa> zzea;
    /* access modifiers changed from: private */
    public static final zzdxa zzhnv;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;
    private zzdxe zzhnu;

    private zzdxa() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdxa, zza> implements zzedq {
        private zza() {
            super(zzdxa.zzhnv);
        }

        public final zza zzex(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxa) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzd(zzdxe zzdxe) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxa) this.zzhxt).zzc(zzdxe);
            return this;
        }

        public final zza zzad(zzeaq zzeaq) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxa) this.zzhxt).zzs(zzeaq);
            return this;
        }

        /* synthetic */ zza(zzdwz zzdwz) {
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

    public final zzdxe zzazu() {
        zzdxe zzdxe = this.zzhnu;
        return zzdxe == null ? zzdxe.zzbab() : zzdxe;
    }

    /* access modifiers changed from: private */
    public final void zzc(zzdxe zzdxe) {
        zzdxe.getClass();
        this.zzhnu = zzdxe;
    }

    public final zzeaq zzaxn() {
        return this.zzhli;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzeaq zzeaq) {
        zzeaq.getClass();
        this.zzhli = zzeaq;
    }

    public static zzdxa zzq(zzeaq zzeaq, zzebq zzebq) throws zzeco {
        return (zzdxa) zzecd.zza(zzhnv, zzeaq, zzebq);
    }

    public static zza zzazv() {
        return (zza) zzhnv.zzbev();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwz.zzdk[i - 1]) {
            case 1:
                return new zzdxa();
            case 2:
                return new zza((zzdwz) null);
            case 3:
                return zza((zzedo) zzhnv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhlh", "zzhnu", "zzhli"});
            case 4:
                return zzhnv;
            case 5:
                zzedx<zzdxa> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdxa.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhnv);
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

    public static zzdxa zzazw() {
        return zzhnv;
    }

    static {
        zzdxa zzdxa = new zzdxa();
        zzhnv = zzdxa;
        zzecd.zza(zzdxa.class, zzdxa);
    }
}
