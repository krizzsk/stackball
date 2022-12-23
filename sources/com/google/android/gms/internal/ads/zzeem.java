package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzeem {
    private static final Class<?> zzibx = zzbgy();
    private static final zzefc<?, ?> zziby = zzbv(false);
    private static final zzefc<?, ?> zzibz = zzbv(true);
    private static final zzefc<?, ?> zzica = new zzefe();

    public static void zzi(Class<?> cls) {
        Class<?> cls2;
        if (!zzecd.class.isAssignableFrom(cls) && (cls2 = zzibx) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzg(i, list, z);
        }
    }

    public static void zzb(int i, List<Float> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzf(i, list, z);
        }
    }

    public static void zzc(int i, List<Long> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzc(i, list, z);
        }
    }

    public static void zzd(int i, List<Long> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzd(i, list, z);
        }
    }

    public static void zze(int i, List<Long> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzn(i, list, z);
        }
    }

    public static void zzf(int i, List<Long> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zze(i, list, z);
        }
    }

    public static void zzg(int i, List<Long> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzl(i, list, z);
        }
    }

    public static void zzh(int i, List<Integer> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zza(i, list, z);
        }
    }

    public static void zzi(int i, List<Integer> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzj(i, list, z);
        }
    }

    public static void zzj(int i, List<Integer> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzm(i, list, z);
        }
    }

    public static void zzk(int i, List<Integer> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzb(i, list, z);
        }
    }

    public static void zzl(int i, List<Integer> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzk(i, list, z);
        }
    }

    public static void zzm(int i, List<Integer> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzh(i, list, z);
        }
    }

    public static void zzn(int i, List<Boolean> list, zzefv zzefv, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzi(i, list, z);
        }
    }

    public static void zza(int i, List<String> list, zzefv zzefv) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zza(i, list);
        }
    }

    public static void zzb(int i, List<zzeaq> list, zzefv zzefv) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzb(i, list);
        }
    }

    public static void zza(int i, List<?> list, zzefv zzefv, zzeek zzeek) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zza(i, list, zzeek);
        }
    }

    public static void zzb(int i, List<?> list, zzefv zzefv, zzeek zzeek) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzefv.zzb(i, list, zzeek);
        }
    }

    static int zzz(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzedc) {
            zzedc zzedc = (zzedc) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzfl(zzedc.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzebk.zzfl(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzz(list) + (list.size() * zzebk.zzgk(i));
    }

    static int zzaa(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzedc) {
            zzedc zzedc = (zzedc) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzfm(zzedc.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzebk.zzfm(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaa(list) + (size * zzebk.zzgk(i));
    }

    static int zzab(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzedc) {
            zzedc zzedc = (zzedc) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzfn(zzedc.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzebk.zzfn(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzab(list) + (size * zzebk.zzgk(i));
    }

    static int zzac(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzece) {
            zzece zzece = (zzece) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgq(zzece.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzebk.zzgq(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzac(list) + (size * zzebk.zzgk(i));
    }

    static int zzad(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzece) {
            zzece zzece = (zzece) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgl(zzece.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzebk.zzgl(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzad(list) + (size * zzebk.zzgk(i));
    }

    static int zzae(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzece) {
            zzece zzece = (zzece) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgm(zzece.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzebk.zzgm(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzae(list) + (size * zzebk.zzgk(i));
    }

    static int zzaf(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzece) {
            zzece zzece = (zzece) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgn(zzece.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzebk.zzgn(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaf(list) + (size * zzebk.zzgk(i));
    }

    static int zzag(List<?> list) {
        return list.size() << 2;
    }

    static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzebk.zzai(i, 0);
    }

    static int zzah(List<?> list) {
        return list.size() << 3;
    }

    static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzebk.zzn(i, 0);
    }

    static int zzai(List<?> list) {
        return list.size();
    }

    static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzebk.zzi(i, true);
    }

    static int zzc(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzgk = zzebk.zzgk(i) * size;
        if (list instanceof zzecv) {
            zzecv zzecv = (zzecv) list;
            while (i4 < size) {
                Object zzgy = zzecv.zzgy(i4);
                if (zzgy instanceof zzeaq) {
                    i3 = zzebk.zzai((zzeaq) zzgy);
                } else {
                    i3 = zzebk.zzhs((String) zzgy);
                }
                zzgk += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzeaq) {
                    i2 = zzebk.zzai((zzeaq) obj);
                } else {
                    i2 = zzebk.zzhs((String) obj);
                }
                zzgk += i2;
                i4++;
            }
        }
        return zzgk;
    }

    static int zzc(int i, Object obj, zzeek zzeek) {
        if (obj instanceof zzect) {
            return zzebk.zza(i, (zzect) obj);
        }
        return zzebk.zzb(i, (zzedo) obj, zzeek);
    }

    static int zzc(int i, List<?> list, zzeek zzeek) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgk = zzebk.zzgk(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzect) {
                i2 = zzebk.zza((zzect) obj);
            } else {
                i2 = zzebk.zza((zzedo) obj, zzeek);
            }
            zzgk += i2;
        }
        return zzgk;
    }

    static int zzd(int i, List<zzeaq> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgk = size * zzebk.zzgk(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgk += zzebk.zzai(list.get(i2));
        }
        return zzgk;
    }

    static int zzd(int i, List<zzedo> list, zzeek zzeek) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzebk.zzc(i, list.get(i3), zzeek);
        }
        return i2;
    }

    public static zzefc<?, ?> zzbgv() {
        return zziby;
    }

    public static zzefc<?, ?> zzbgw() {
        return zzibz;
    }

    public static zzefc<?, ?> zzbgx() {
        return zzica;
    }

    private static zzefc<?, ?> zzbv(boolean z) {
        try {
            Class<?> zzbgz = zzbgz();
            if (zzbgz == null) {
                return null;
            }
            return (zzefc) zzbgz.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbgy() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbgz() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzg(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void zza(zzedh zzedh, T t, T t2, long j) {
        zzefi.zza((Object) t, j, zzedh.zze(zzefi.zzp(t, j), zzefi.zzp(t2, j)));
    }

    static <T, FT extends zzebv<FT>> void zza(zzebs<FT> zzebs, T t, T t2) {
        zzebt<FT> zzai = zzebs.zzai(t2);
        if (!zzai.zzhut.isEmpty()) {
            zzebs.zzaj(t).zza(zzai);
        }
    }

    static <T, UT, UB> void zza(zzefc<UT, UB> zzefc, T t, T t2) {
        zzefc.zzh(t, zzefc.zzj(zzefc.zzay(t), zzefc.zzay(t2)));
    }

    static <UT, UB> UB zza(int i, List<Integer> list, zzech zzech, UB ub, zzefc<UT, UB> zzefc) {
        if (zzech == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzech.zzf(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = zza(i, intValue, ub, zzefc);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzech.zzf(intValue2)) {
                    ub = zza(i, intValue2, ub, zzefc);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB zza(int i, int i2, UB ub, zzefc<UT, UB> zzefc) {
        if (ub == null) {
            ub = zzefc.zzbhg();
        }
        zzefc.zza(ub, i, (long) i2);
        return ub;
    }
}
