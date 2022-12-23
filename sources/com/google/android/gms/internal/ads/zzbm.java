package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
public final class zzbm {

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    public static final class zza extends zzecd<zza, C15639zza> implements zzedq {
        /* access modifiers changed from: private */
        public static final zza zzdz;
        private static volatile zzedx<zza> zzea;
        private int zzdl;
        private String zzdm = "";
        private long zzdn;
        private String zzdo = "";
        private String zzdp = "";
        private String zzdq = "";
        private long zzdr;
        private long zzds;
        private String zzdt = "";
        private long zzdu;
        private String zzdv = "";
        private String zzdw = "";
        private zzecl<zzb> zzdx = zzbfa();
        private int zzdy;

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        public static final class zzb extends zzecd<zzb, C15640zza> implements zzedq {
            private static volatile zzedx<zzb> zzea;
            /* access modifiers changed from: private */
            public static final zzb zzed;
            private int zzdl;
            private String zzeb = "";
            private String zzec = "";

            private zzb() {
            }

            /* renamed from: com.google.android.gms.internal.ads.zzbm$zza$zzb$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
            public static final class C15640zza extends zzecd.zza<zzb, C15640zza> implements zzedq {
                private C15640zza() {
                    super(zzb.zzed);
                }

                /* synthetic */ C15640zza(zzbl zzbl) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzbl.zzdk[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C15640zza((zzbl) null);
                    case 3:
                        return zza((zzedo) zzed, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzdl", "zzeb", "zzec"});
                    case 4:
                        return zzed;
                    case 5:
                        zzedx<zzb> zzedx = zzea;
                        if (zzedx == null) {
                            synchronized (zzb.class) {
                                zzedx = zzea;
                                if (zzedx == null) {
                                    zzedx = new zzecd.zzc<>(zzed);
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
                zzb zzb = new zzb();
                zzed = zzb;
                zzecd.zza(zzb.class, zzb);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        public enum zzc implements zzecf {
            UNKNOWN(0),
            ENABLED(1),
            DISABLED(2);
            
            private static final zzeci<zzc> zzeh = null;
            private final int value;

            public final int zzw() {
                return this.value;
            }

            public static zzc zze(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ENABLED;
                }
                if (i != 2) {
                    return null;
                }
                return DISABLED;
            }

            public static zzech zzx() {
                return zzbp.zzej;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzeh = new zzbn();
            }
        }

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.ads.zzbm$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        public static final class C15639zza extends zzecd.zza<zza, C15639zza> implements zzedq {
            private C15639zza() {
                super(zza.zzdz);
            }

            public final C15639zza zzi(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzn(str);
                return this;
            }

            public final C15639zza zzc(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzd(j);
                return this;
            }

            public final C15639zza zzj(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzo(str);
                return this;
            }

            public final C15639zza zzk(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzp(str);
                return this;
            }

            public final C15639zza zzl(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzq(str);
                return this;
            }

            public final C15639zza zzm(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzr(str);
                return this;
            }

            public final C15639zza zza(zzc zzc) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzb(zzc);
                return this;
            }

            /* synthetic */ C15639zza(zzbl zzbl) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzn(String str) {
            str.getClass();
            this.zzdl |= 1;
            this.zzdm = str;
        }

        /* access modifiers changed from: private */
        public final void zzd(long j) {
            this.zzdl |= 2;
            this.zzdn = j;
        }

        /* access modifiers changed from: private */
        public final void zzo(String str) {
            str.getClass();
            this.zzdl |= 4;
            this.zzdo = str;
        }

        /* access modifiers changed from: private */
        public final void zzp(String str) {
            str.getClass();
            this.zzdl |= 8;
            this.zzdp = str;
        }

        /* access modifiers changed from: private */
        public final void zzq(String str) {
            str.getClass();
            this.zzdl |= 16;
            this.zzdq = str;
        }

        /* access modifiers changed from: private */
        public final void zzr(String str) {
            str.getClass();
            this.zzdl |= 1024;
            this.zzdw = str;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzc zzc2) {
            this.zzdy = zzc2.zzw();
            this.zzdl |= 2048;
        }

        public static C15639zza zzt() {
            return (C15639zza) zzdz.zzbev();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbl.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C15639zza((zzbl) null);
                case 3:
                    return zza((zzedo) zzdz, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\b\u0007\t\u0002\b\n\b\t\u000b\b\n\f\u001b\r\f\u000b", new Object[]{"zzdl", "zzdm", "zzdn", "zzdo", "zzdp", "zzdq", "zzdr", "zzds", "zzdt", "zzdu", "zzdv", "zzdw", "zzdx", zzb.class, "zzdy", zzc.zzx()});
                case 4:
                    return zzdz;
                case 5:
                    zzedx<zza> zzedx = zzea;
                    if (zzedx == null) {
                        synchronized (zza.class) {
                            zzedx = zzea;
                            if (zzedx == null) {
                                zzedx = new zzecd.zzc<>(zzdz);
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
            zzdz = zza;
            zzecd.zza(zza.class, zza);
        }
    }
}
