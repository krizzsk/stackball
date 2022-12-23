package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdvk extends zzecd<zzdvk, zza> implements zzedq {
    private static volatile zzedx<zzdvk> zzea;
    /* access modifiers changed from: private */
    public static final zzdvk zzhls;
    private int zzhlh;
    private zzdvo zzhlq;
    private zzdxa zzhlr;

    private zzdvk() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdvk, zza> implements zzedq {
        private zza() {
            super(zzdvk.zzhls);
        }

        public final zza zzen(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvk) this.zzhxt).setVersion(i);
            return this;
        }

        public final zza zzb(zzdvo zzdvo) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvk) this.zzhxt).zza(zzdvo);
            return this;
        }

        public final zza zzb(zzdxa zzdxa) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvk) this.zzhxt).zza(zzdxa);
            return this;
        }

        /* synthetic */ zza(zzdvj zzdvj) {
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

    public final zzdvo zzaxv() {
        zzdvo zzdvo = this.zzhlq;
        return zzdvo == null ? zzdvo.zzaye() : zzdvo;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdvo zzdvo) {
        zzdvo.getClass();
        this.zzhlq = zzdvo;
    }

    public final zzdxa zzaxw() {
        zzdxa zzdxa = this.zzhlr;
        return zzdxa == null ? zzdxa.zzazw() : zzdxa;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdxa zzdxa) {
        zzdxa.getClass();
        this.zzhlr = zzdxa;
    }

    public static zzdvk zzd(zzeaq zzeaq, zzebq zzebq) throws zzeco {
        return (zzdvk) zzecd.zza(zzhls, zzeaq, zzebq);
    }

    public static zza zzaxx() {
        return (zza) zzhls.zzbev();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvj.zzdk[i - 1]) {
            case 1:
                return new zzdvk();
            case 2:
                return new zza((zzdvj) null);
            case 3:
                return zza((zzedo) zzhls, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzhlh", "zzhlq", "zzhlr"});
            case 4:
                return zzhls;
            case 5:
                zzedx<zzdvk> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdvk.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhls);
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
        zzdvk zzdvk = new zzdvk();
        zzhls = zzdvk;
        zzecd.zza(zzdvk.class, zzdvk);
    }
}
