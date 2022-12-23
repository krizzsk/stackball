package com.google.android.gms.internal.ads;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzefi {
    private static final Logger logger = Logger.getLogger(zzefi.class.getName());
    private static final Unsafe zzhgt = zzbhj();
    private static final Class<?> zzhsx = zzean.zzbcm();
    private static final boolean zzhui = zzbhk();
    private static final boolean zzicp = zzm(Long.TYPE);
    private static final boolean zzicq = zzm(Integer.TYPE);
    private static final zzc zzicr;
    private static final boolean zzics = zzbhl();
    private static final long zzict = ((long) zzk(byte[].class));
    private static final long zzicu;
    private static final long zzicv;
    private static final long zzicw;
    private static final long zzicx;
    private static final long zzicy;
    private static final long zzicz;
    private static final long zzida;
    private static final long zzidb;
    private static final long zzidc;
    private static final long zzidd;
    private static final long zzide = ((long) zzk(Object[].class));
    private static final long zzidf = ((long) zzl(Object[].class));
    private static final long zzidg;
    private static final int zzidh = ((int) (zzict & 7));
    static final boolean zzidi = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    private zzefi() {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static final class zza extends zzc {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            if (zzefi.zzidi) {
                return zzefi.zzq(obj, j);
            }
            return zzefi.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzefi.zzidi) {
                zzefi.zza(obj, j, b);
            } else {
                zzefi.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzefi.zzidi) {
                return zzefi.zzs(obj, j);
            }
            return zzefi.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzefi.zzidi) {
                zzefi.zzb(obj, j, z);
            } else {
                zzefi.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static final class zzb extends zzc {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            if (zzefi.zzidi) {
                return zzefi.zzq(obj, j);
            }
            return zzefi.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzefi.zzidi) {
                zzefi.zza(obj, j, b);
            } else {
                zzefi.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzefi.zzidi) {
                return zzefi.zzs(obj, j);
            }
            return zzefi.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzefi.zzidi) {
                zzefi.zzb(obj, j, z);
            } else {
                zzefi.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static final class zzd extends zzc {
        zzd(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            return this.zzidj.getByte(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzidj.putByte(obj, j, b);
        }

        public final boolean zzm(Object obj, long j) {
            return this.zzidj.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzidj.putBoolean(obj, j, z);
        }

        public final float zzn(Object obj, long j) {
            return this.zzidj.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzidj.putFloat(obj, j, f);
        }

        public final double zzo(Object obj, long j) {
            return this.zzidj.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzidj.putDouble(obj, j, d);
        }
    }

    static boolean zzbhh() {
        return zzhui;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static abstract class zzc {
        Unsafe zzidj;

        zzc(Unsafe unsafe) {
            this.zzidj = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zzidj.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zzidj.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzidj.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzidj.putLong(obj, j, j2);
        }
    }

    static boolean zzbhi() {
        return zzics;
    }

    static <T> T zzj(Class<T> cls) {
        try {
            return zzhgt.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzk(Class<?> cls) {
        if (zzhui) {
            return zzicr.zzidj.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzl(Class<?> cls) {
        if (zzhui) {
            return zzicr.zzidj.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzk(Object obj, long j) {
        return zzicr.zzk(obj, j);
    }

    static void zzb(Object obj, long j, int i) {
        zzicr.zzb(obj, j, i);
    }

    static long zzl(Object obj, long j) {
        return zzicr.zzl(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzicr.zza(obj, j, j2);
    }

    static boolean zzm(Object obj, long j) {
        return zzicr.zzm(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzicr.zza(obj, j, z);
    }

    static float zzn(Object obj, long j) {
        return zzicr.zzn(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzicr.zza(obj, j, f);
    }

    static double zzo(Object obj, long j) {
        return zzicr.zzo(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzicr.zza(obj, j, d);
    }

    static Object zzp(Object obj, long j) {
        return zzicr.zzidj.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzicr.zzidj.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzicr.zzy(bArr, zzict + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzicr.zze(bArr, zzict + j, b);
    }

    static Unsafe zzbhj() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzefh());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzbhk() {
        Unsafe unsafe = zzhgt;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (zzean.zzbcl()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzbhl() {
        Unsafe unsafe = zzhgt;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (zzbhm() == null) {
                return false;
            }
            if (zzean.zzbcl()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzm(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zzean.zzbcl()) {
            return false;
        }
        try {
            Class<?> cls3 = zzhsx;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field zzbhm() {
        Field zzb2;
        if (zzean.zzbcl() && (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
            return zzb2;
        }
        Field zzb3 = zzb(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (zzb3 == null || zzb3.getType() != Long.TYPE) {
            return null;
        }
        return zzb3;
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int zzk = zzk(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00d2, code lost:
        r1 = zzicr;
     */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            java.lang.Class<com.google.android.gms.internal.ads.zzefi> r5 = com.google.android.gms.internal.ads.zzefi.class
            java.lang.String r5 = r5.getName()
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r5)
            logger = r5
            sun.misc.Unsafe r5 = zzbhj()
            zzhgt = r5
            java.lang.Class r5 = com.google.android.gms.internal.ads.zzean.zzbcm()
            zzhsx = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = zzm(r5)
            zzicp = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r5 = zzm(r5)
            zzicq = r5
            sun.misc.Unsafe r5 = zzhgt
            r6 = 0
            if (r5 != 0) goto L_0x0038
            goto L_0x005d
        L_0x0038:
            boolean r5 = com.google.android.gms.internal.ads.zzean.zzbcl()
            if (r5 == 0) goto L_0x0056
            boolean r5 = zzicp
            if (r5 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.zzefi$zza r6 = new com.google.android.gms.internal.ads.zzefi$zza
            sun.misc.Unsafe r5 = zzhgt
            r6.<init>(r5)
            goto L_0x005d
        L_0x004a:
            boolean r5 = zzicq
            if (r5 == 0) goto L_0x005d
            com.google.android.gms.internal.ads.zzefi$zzb r6 = new com.google.android.gms.internal.ads.zzefi$zzb
            sun.misc.Unsafe r5 = zzhgt
            r6.<init>(r5)
            goto L_0x005d
        L_0x0056:
            com.google.android.gms.internal.ads.zzefi$zzd r6 = new com.google.android.gms.internal.ads.zzefi$zzd
            sun.misc.Unsafe r5 = zzhgt
            r6.<init>(r5)
        L_0x005d:
            zzicr = r6
            boolean r5 = zzbhl()
            zzics = r5
            boolean r5 = zzbhk()
            zzhui = r5
            java.lang.Class<byte[]> r5 = byte[].class
            int r5 = zzk(r5)
            long r5 = (long) r5
            zzict = r5
            int r5 = zzk(r4)
            long r5 = (long) r5
            zzicu = r5
            int r4 = zzl(r4)
            long r4 = (long) r4
            zzicv = r4
            int r4 = zzk(r3)
            long r4 = (long) r4
            zzicw = r4
            int r3 = zzl(r3)
            long r3 = (long) r3
            zzicx = r3
            int r3 = zzk(r2)
            long r3 = (long) r3
            zzicy = r3
            int r2 = zzl(r2)
            long r2 = (long) r2
            zzicz = r2
            int r2 = zzk(r1)
            long r2 = (long) r2
            zzida = r2
            int r1 = zzl(r1)
            long r1 = (long) r1
            zzidb = r1
            int r1 = zzk(r0)
            long r1 = (long) r1
            zzidc = r1
            int r0 = zzl(r0)
            long r0 = (long) r0
            zzidd = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzk(r0)
            long r0 = (long) r0
            zzide = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzl(r0)
            long r0 = (long) r0
            zzidf = r0
            java.lang.reflect.Field r0 = zzbhm()
            if (r0 == 0) goto L_0x00de
            com.google.android.gms.internal.ads.zzefi$zzc r1 = zzicr
            if (r1 != 0) goto L_0x00d7
            goto L_0x00de
        L_0x00d7:
            sun.misc.Unsafe r1 = r1.zzidj
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00e0
        L_0x00de:
            r0 = -1
        L_0x00e0:
            zzidg = r0
            long r0 = zzict
            r2 = 7
            long r0 = r0 & r2
            int r1 = (int) r0
            zzidh = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00f4
            r0 = 1
            goto L_0x00f5
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            zzidi = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefi.<clinit>():void");
    }
}
