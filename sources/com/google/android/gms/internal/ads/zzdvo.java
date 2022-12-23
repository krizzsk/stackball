package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdvo extends zzecd<zzdvo, zza> implements zzedq {
    private static volatile zzedx<zzdvo> zzea;
    /* access modifiers changed from: private */
    public static final zzdvo zzhlx;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;
    private zzdvs zzhlw;

    private zzdvo() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdvo, zza> implements zzedq {
        private zza() {
            super(zzdvo.zzhlx);
        }

        public final zza zzeo(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvo) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzc(zzdvs zzdvs) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvo) this.zzhxt).zzb(zzdvs);
            return this;
        }

        public final zza zzu(zzeaq zzeaq) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvo) this.zzhxt).zzs(zzeaq);
            return this;
        }

        /* synthetic */ zza(zzdvn zzdvn) {
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

    public final zzdvs zzayc() {
        zzdvs zzdvs = this.zzhlw;
        return zzdvs == null ? zzdvs.zzayj() : zzdvs;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzdvs zzdvs) {
        zzdvs.getClass();
        this.zzhlw = zzdvs;
    }

    public final zzeaq zzaxn() {
        return this.zzhli;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzeaq zzeaq) {
        zzeaq.getClass();
        this.zzhli = zzeaq;
    }

    public static zzdvo zzf(zzeaq zzeaq, zzebq zzebq) throws zzeco {
        return (zzdvo) zzecd.zza(zzhlx, zzeaq, zzebq);
    }

    public static zza zzayd() {
        return (zza) zzhlx.zzbev();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvn.zzdk[i - 1]) {
            case 1:
                return new zzdvo();
            case 2:
                return new zza((zzdvn) null);
            case 3:
                return zza((zzedo) zzhlx, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhlh", "zzhlw", "zzhli"});
            case 4:
                return zzhlx;
            case 5:
                zzedx<zzdvo> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdvo.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhlx);
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

    public static zzdvo zzaye() {
        return zzhlx;
    }

    static {
        zzdvo zzdvo = new zzdvo();
        zzhlx = zzdvo;
        zzecd.zza(zzdvo.class, zzdvo);
    }
}
