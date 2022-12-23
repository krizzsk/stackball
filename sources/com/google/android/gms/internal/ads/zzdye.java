package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdye extends zzecd<zzdye, zza> implements zzedq {
    private static volatile zzedx<zzdye> zzea;
    /* access modifiers changed from: private */
    public static final zzdye zzhqa;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;

    private zzdye() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public static final class zza extends zzecd.zza<zzdye, zza> implements zzedq {
        private zza() {
            super(zzdye.zzhqa);
        }

        public final zza zzfh(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdye) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzag(zzeaq zzeaq) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdye) this.zzhxt).zzs(zzeaq);
            return this;
        }

        /* synthetic */ zza(zzdyf zzdyf) {
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

    public static zzdye zzw(zzeaq zzeaq, zzebq zzebq) throws zzeco {
        return (zzdye) zzecd.zza(zzhqa, zzeaq, zzebq);
    }

    public static zza zzbbs() {
        return (zza) zzhqa.zzbev();
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdyf.zzdk[i - 1]) {
            case 1:
                return new zzdye();
            case 2:
                return new zza((zzdyf) null);
            case 3:
                return zza((zzedo) zzhqa, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhlh", "zzhli"});
            case 4:
                return zzhqa;
            case 5:
                zzedx<zzdye> zzedx = zzea;
                if (zzedx == null) {
                    synchronized (zzdye.class) {
                        zzedx = zzea;
                        if (zzedx == null) {
                            zzedx = new zzecd.zzc<>(zzhqa);
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
        zzdye zzdye = new zzdye();
        zzhqa = zzdye;
        zzecd.zza(zzdye.class, zzdye);
    }
}
