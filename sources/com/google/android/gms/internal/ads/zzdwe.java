package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdwe extends zzecd<zzdwe, zza> implements zzedq {
    private static volatile zzedx<zzdwe> zzea;
    /* access modifiers changed from: private */
    public static final zzdwe zzhmh;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;

    private zzdwe() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdwe, zza> implements zzedq {
        private zza() {
            super(zzdwe.zzhmh);
        }

        public final zza zzer(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdwe) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzx(zzeaq zzeaq) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdwe) this.zzhxt).zzs(zzeaq);
            return this;
        }

        /* synthetic */ zza(zzdwd zzdwd) {
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

    public final zzeaq zzaxn() {
        return this.zzhli;
    }

    /* access modifiers changed from: private */
    public final void zzs(zzeaq zzeaq) {
        zzeaq.getClass();
        this.zzhli = zzeaq;
    }

    public static zzdwe zzl(zzeaq zzeaq, zzebq zzebq) throws zzeco {
        return (zzdwe) zzecd.zza(zzhmh, zzeaq, zzebq);
    }

    public static zza zzayu() {
        return (zza) zzhmh.zzbev();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwd.zzdk[i - 1]) {
            case 1:
                return new zzdwe();
            case 2:
                return new zza((zzdwd) null);
            case 3:
                return zza((zzedo) zzhmh, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzhlh", "zzhli"});
            case 4:
                return zzhmh;
            case 5:
                zzedx<zzdwe> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdwe.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhmh);
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
        zzdwe zzdwe = new zzdwe();
        zzhmh = zzdwe;
        zzecd.zza(zzdwe.class, zzdwe);
    }
}
