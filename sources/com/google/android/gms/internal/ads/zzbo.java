package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
public final class zzbo {

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    public static final class zza extends zzecd<zza, C15641zza> implements zzedq {
        private static volatile zzedx<zza> zzea;
        /* access modifiers changed from: private */
        public static final zza zzem;
        private int zzdl;
        private zzb zzek;
        private zzc zzel;

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zzbo$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        public static final class C15641zza extends zzecd.zza<zza, C15641zza> implements zzedq {
            private C15641zza() {
                super(zza.zzem);
            }

            /* synthetic */ C15641zza(zzbq zzbq) {
                this();
            }
        }

        public final boolean zzy() {
            return (this.zzdl & 1) != 0;
        }

        public final zzb zzz() {
            zzb zzb = this.zzek;
            return zzb == null ? zzb.zzae() : zzb;
        }

        public final boolean zzaa() {
            return (this.zzdl & 2) != 0;
        }

        public final zzc zzab() {
            zzc zzc = this.zzel;
            return zzc == null ? zzc.zzah() : zzc;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbq.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C15641zza((zzbq) null);
                case 3:
                    return zza((zzedo) zzem, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"zzdl", "zzek", "zzel"});
                case 4:
                    return zzem;
                case 5:
                    zzedx<zza> zzedx = zzea;
                    if (zzedx == null) {
                        synchronized (zza.class) {
                            zzedx = zzea;
                            if (zzedx == null) {
                                zzedx = new zzecd.zzc<>(zzem);
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
            zza zza = new zza();
            zzem = zza;
            zzecd.zza(zza.class, zza);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    public static final class zzb extends zzecd<zzb, zza> implements zzedq {
        private static volatile zzedx<zzb> zzea;
        /* access modifiers changed from: private */
        public static final zzb zzeo;
        private int zzdl;
        private int zzen = 2;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        public static final class zza extends zzecd.zza<zzb, zza> implements zzedq {
            private zza() {
                super(zzb.zzeo);
            }

            /* synthetic */ zza(zzbq zzbq) {
                this();
            }
        }

        public final zzbr zzad() {
            zzbr zzg = zzbr.zzg(this.zzen);
            return zzg == null ? zzbr.ENUM_SIGNAL_SOURCE_ADSHIELD : zzg;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbq.zzdk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzbq) null);
                case 3:
                    return zza((zzedo) zzeo, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b\f\u0000", new Object[]{"zzdl", "zzen", zzbr.zzx()});
                case 4:
                    return zzeo;
                case 5:
                    zzedx<zzb> zzedx = zzea;
                    if (zzedx == null) {
                        synchronized (zzb.class) {
                            zzedx = zzea;
                            if (zzedx == null) {
                                zzedx = new zzecd.zzc<>(zzeo);
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

        public static zzb zzae() {
            return zzeo;
        }

        static {
            zzb zzb = new zzb();
            zzeo = zzb;
            zzecd.zza(zzb.class, zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    public static final class zzc extends zzecd<zzc, zza> implements zzedq {
        private static volatile zzedx<zzc> zzea;
        /* access modifiers changed from: private */
        public static final zzc zzfb;
        private int zzdl;
        private String zzev = "";
        private String zzew = "";
        private String zzex = "";
        private String zzey = "";
        private String zzez = "";
        private String zzfa = "";

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        public static final class zza extends zzecd.zza<zzc, zza> implements zzedq {
            private zza() {
                super(zzc.zzfb);
            }

            /* synthetic */ zza(zzbq zzbq) {
                this();
            }
        }

        public final String zzag() {
            return this.zzev;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbq.zzdk[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzbq) null);
                case 3:
                    return zza((zzedo) zzfb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005", new Object[]{"zzdl", "zzev", "zzew", "zzex", "zzey", "zzez", "zzfa"});
                case 4:
                    return zzfb;
                case 5:
                    zzedx<zzc> zzedx = zzea;
                    if (zzedx == null) {
                        synchronized (zzc.class) {
                            zzedx = zzea;
                            if (zzedx == null) {
                                zzedx = new zzecd.zzc<>(zzfb);
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

        public static zzc zzah() {
            return zzfb;
        }

        static {
            zzc zzc = new zzc();
            zzfb = zzc;
            zzecd.zza(zzc.class, zzc);
        }
    }
}
