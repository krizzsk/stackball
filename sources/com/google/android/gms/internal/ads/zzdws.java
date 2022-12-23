package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdws extends zzecd<zzdws, zza> implements zzedq {
    private static volatile zzedx<zzdws> zzea;
    /* access modifiers changed from: private */
    public static final zzdws zzhnb;
    private int zzhlh;
    private zzdwo zzhmr;
    private zzeaq zzhmz = zzeaq.zzhtf;
    private zzeaq zzhna = zzeaq.zzhtf;

    private zzdws() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdws, zza> implements zzedq {
        private zza() {
            super(zzdws.zzhnb);
        }

        public final zza zzeu(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdws) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzc(zzdwo zzdwo) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdws) this.zzhxt).zzb(zzdwo);
            return this;
        }

        public final zza zzab(zzeaq zzeaq) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdws) this.zzhxt).zzz(zzeaq);
            return this;
        }

        public final zza zzac(zzeaq zzeaq) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdws) this.zzhxt).zzaa(zzeaq);
            return this;
        }

        /* synthetic */ zza(zzdwr zzdwr) {
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

    public final zzdwo zzaza() {
        zzdwo zzdwo = this.zzhmr;
        return zzdwo == null ? zzdwo.zzazf() : zzdwo;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzdwo zzdwo) {
        zzdwo.getClass();
        this.zzhmr = zzdwo;
    }

    public final zzeaq zzazk() {
        return this.zzhmz;
    }

    /* access modifiers changed from: private */
    public final void zzz(zzeaq zzeaq) {
        zzeaq.getClass();
        this.zzhmz = zzeaq;
    }

    public final zzeaq zzazl() {
        return this.zzhna;
    }

    /* access modifiers changed from: private */
    public final void zzaa(zzeaq zzeaq) {
        zzeaq.getClass();
        this.zzhna = zzeaq;
    }

    public static zzdws zzp(zzeaq zzeaq, zzebq zzebq) throws zzeco {
        return (zzdws) zzecd.zza(zzhnb, zzeaq, zzebq);
    }

    public static zza zzazm() {
        return (zza) zzhnb.zzbev();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwr.zzdk[i - 1]) {
            case 1:
                return new zzdws();
            case 2:
                return new zza((zzdwr) null);
            case 3:
                return zza((zzedo) zzhnb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzhlh", "zzhmr", "zzhmz", "zzhna"});
            case 4:
                return zzhnb;
            case 5:
                zzedx<zzdws> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdws.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhnb);
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

    public static zzdws zzazn() {
        return zzhnb;
    }

    static {
        zzdws zzdws = new zzdws();
        zzhnb = zzdws;
        zzecd.zza(zzdws.class, zzdws);
    }
}
