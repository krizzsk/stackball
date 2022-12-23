package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzebt<T extends zzebv<T>> {
    private static final zzebt zzhuw = new zzebt(true);
    final zzeel<T, Object> zzhut;
    private boolean zzhuu;
    private boolean zzhuv;

    private zzebt() {
        this.zzhut = zzeel.zzhi(16);
    }

    private zzebt(boolean z) {
        this(zzeel.zzhi(0));
        zzbcj();
    }

    private zzebt(zzeel<T, Object> zzeel) {
        this.zzhut = zzeel;
        zzbcj();
    }

    public static <T extends zzebv<T>> zzebt<T> zzbee() {
        return zzhuw;
    }

    public final void zzbcj() {
        if (!this.zzhuu) {
            this.zzhut.zzbcj();
            this.zzhuu = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzhuu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzebt)) {
            return false;
        }
        return this.zzhut.equals(((zzebt) obj).zzhut);
    }

    public final int hashCode() {
        return this.zzhut.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> iterator() {
        if (this.zzhuv) {
            return new zzecu(this.zzhut.entrySet().iterator());
        }
        return this.zzhut.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> descendingIterator() {
        if (this.zzhuv) {
            return new zzecu(this.zzhut.zzbgs().iterator());
        }
        return this.zzhut.zzbgs().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zzhut.get(t);
        if (!(obj instanceof zzecp)) {
            return obj;
        }
        zzecp zzecp = (zzecp) obj;
        return zzecp.zzbfp();
    }

    private final void zza(T t, Object obj) {
        if (!t.zzbel()) {
            zza(t.zzbej(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzbej(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzecp) {
            this.zzhuv = true;
        }
        this.zzhut.put(t, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzecf) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzecp) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.gms.internal.ads.zzefp r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzecg.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.ads.zzebw.zzhuz
            com.google.android.gms.internal.ads.zzefw r2 = r2.zzbhn()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzedo
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzecp
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzecf
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzeaq
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebt.zza(com.google.android.gms.internal.ads.zzefp, java.lang.Object):void");
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzhut.zzbgq(); i++) {
            if (!zzb(this.zzhut.zzhj(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> zzb : this.zzhut.zzbgr()) {
            if (!zzb(zzb)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzebv<T>> boolean zzb(Map.Entry<T, Object> entry) {
        zzebv zzebv = (zzebv) entry.getKey();
        if (zzebv.zzbek() == zzefw.MESSAGE) {
            if (zzebv.zzbel()) {
                for (zzedo isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzedo) {
                    if (!((zzedo) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzecp) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzebt<T> zzebt) {
        for (int i = 0; i < zzebt.zzhut.zzbgq(); i++) {
            zzc(zzebt.zzhut.zzhj(i));
        }
        for (Map.Entry<T, Object> zzc : zzebt.zzhut.zzbgr()) {
            zzc(zzc);
        }
    }

    private static Object zzal(Object obj) {
        if (obj instanceof zzedt) {
            return ((zzedt) obj).zzbcg();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzc(Map.Entry<T, Object> entry) {
        Object obj;
        zzebv zzebv = (zzebv) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzecp) {
            zzecp zzecp = (zzecp) value;
            value = zzecp.zzbfp();
        }
        if (zzebv.zzbel()) {
            Object zza = zza(zzebv);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object zzal : (List) value) {
                ((List) zza).add(zzal(zzal));
            }
            this.zzhut.put(zzebv, zza);
        } else if (zzebv.zzbek() == zzefw.MESSAGE) {
            Object zza2 = zza(zzebv);
            if (zza2 == null) {
                this.zzhut.put(zzebv, zzal(value));
                return;
            }
            if (zza2 instanceof zzedt) {
                obj = zzebv.zza((zzedt) zza2, (zzedt) value);
            } else {
                obj = zzebv.zza(((zzedo) zza2).zzbfb(), (zzedo) value).zzbet();
            }
            this.zzhut.put(zzebv, obj);
        } else {
            this.zzhut.put(zzebv, zzal(value));
        }
    }

    static void zza(zzebk zzebk, zzefp zzefp, int i, Object obj) throws IOException {
        if (zzefp == zzefp.GROUP) {
            zzedo zzedo = (zzedo) obj;
            zzecg.zzk(zzedo);
            zzebk.writeTag(i, 3);
            zzedo.zzb(zzebk);
            zzebk.writeTag(i, 4);
            return;
        }
        zzebk.writeTag(i, zzefp.zzbho());
        switch (zzebw.zzhuk[zzefp.ordinal()]) {
            case 1:
                zzebk.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzebk.zzf(((Float) obj).floatValue());
                return;
            case 3:
                zzebk.zzfi(((Long) obj).longValue());
                return;
            case 4:
                zzebk.zzfi(((Long) obj).longValue());
                return;
            case 5:
                zzebk.zzgg(((Integer) obj).intValue());
                return;
            case 6:
                zzebk.zzfk(((Long) obj).longValue());
                return;
            case 7:
                zzebk.zzgj(((Integer) obj).intValue());
                return;
            case 8:
                zzebk.zzbs(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzedo) obj).zzb(zzebk);
                return;
            case 10:
                zzebk.zzg((zzedo) obj);
                return;
            case 11:
                if (obj instanceof zzeaq) {
                    zzebk.zzah((zzeaq) obj);
                    return;
                } else {
                    zzebk.zzhr((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzeaq) {
                    zzebk.zzah((zzeaq) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzebk.zzk(bArr, 0, bArr.length);
                return;
            case 13:
                zzebk.zzgh(((Integer) obj).intValue());
                return;
            case 14:
                zzebk.zzgj(((Integer) obj).intValue());
                return;
            case 15:
                zzebk.zzfk(((Long) obj).longValue());
                return;
            case 16:
                zzebk.zzgi(((Integer) obj).intValue());
                return;
            case 17:
                zzebk.zzfj(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzecf) {
                    zzebk.zzgg(((zzecf) obj).zzw());
                    return;
                } else {
                    zzebk.zzgg(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzbef() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzhut.zzbgq(); i2++) {
            i += zzd(this.zzhut.zzhj(i2));
        }
        for (Map.Entry<T, Object> zzd : this.zzhut.zzbgr()) {
            i += zzd(zzd);
        }
        return i;
    }

    private static int zzd(Map.Entry<T, Object> entry) {
        zzebv zzebv = (zzebv) entry.getKey();
        Object value = entry.getValue();
        if (zzebv.zzbek() != zzefw.MESSAGE || zzebv.zzbel() || zzebv.zzbem()) {
            return zzb((zzebv<?>) zzebv, value);
        }
        if (value instanceof zzecp) {
            return zzebk.zzb(((zzebv) entry.getKey()).zzw(), (zzect) (zzecp) value);
        }
        return zzebk.zzb(((zzebv) entry.getKey()).zzw(), (zzedo) value);
    }

    static int zza(zzefp zzefp, int i, Object obj) {
        int zzgk = zzebk.zzgk(i);
        if (zzefp == zzefp.GROUP) {
            zzecg.zzk((zzedo) obj);
            zzgk <<= 1;
        }
        return zzgk + zzb(zzefp, obj);
    }

    private static int zzb(zzefp zzefp, Object obj) {
        switch (zzebw.zzhuk[zzefp.ordinal()]) {
            case 1:
                return zzebk.zzc(((Double) obj).doubleValue());
            case 2:
                return zzebk.zzg(((Float) obj).floatValue());
            case 3:
                return zzebk.zzfl(((Long) obj).longValue());
            case 4:
                return zzebk.zzfm(((Long) obj).longValue());
            case 5:
                return zzebk.zzgl(((Integer) obj).intValue());
            case 6:
                return zzebk.zzfo(((Long) obj).longValue());
            case 7:
                return zzebk.zzgo(((Integer) obj).intValue());
            case 8:
                return zzebk.zzbt(((Boolean) obj).booleanValue());
            case 9:
                return zzebk.zzi((zzedo) obj);
            case 10:
                if (obj instanceof zzecp) {
                    return zzebk.zza((zzecp) obj);
                }
                return zzebk.zzh((zzedo) obj);
            case 11:
                if (obj instanceof zzeaq) {
                    return zzebk.zzai((zzeaq) obj);
                }
                return zzebk.zzhs((String) obj);
            case 12:
                if (obj instanceof zzeaq) {
                    return zzebk.zzai((zzeaq) obj);
                }
                return zzebk.zzx((byte[]) obj);
            case 13:
                return zzebk.zzgm(((Integer) obj).intValue());
            case 14:
                return zzebk.zzgp(((Integer) obj).intValue());
            case 15:
                return zzebk.zzfp(((Long) obj).longValue());
            case 16:
                return zzebk.zzgn(((Integer) obj).intValue());
            case 17:
                return zzebk.zzfn(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzecf) {
                    return zzebk.zzgq(((zzecf) obj).zzw());
                }
                return zzebk.zzgq(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzebv<?> zzebv, Object obj) {
        zzefp zzbej = zzebv.zzbej();
        int zzw = zzebv.zzw();
        if (!zzebv.zzbel()) {
            return zza(zzbej, zzw, obj);
        }
        int i = 0;
        if (zzebv.zzbem()) {
            for (Object zzb : (List) obj) {
                i += zzb(zzbej, zzb);
            }
            return zzebk.zzgk(zzw) + i + zzebk.zzgs(i);
        }
        for (Object zza : (List) obj) {
            i += zza(zzbej, zzw, zza);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzebt zzebt = new zzebt();
        for (int i = 0; i < this.zzhut.zzbgq(); i++) {
            Map.Entry<T, Object> zzhj = this.zzhut.zzhj(i);
            zzebt.zza((zzebv) zzhj.getKey(), zzhj.getValue());
        }
        for (Map.Entry next : this.zzhut.zzbgr()) {
            zzebt.zza((zzebv) next.getKey(), next.getValue());
        }
        zzebt.zzhuv = this.zzhuv;
        return zzebt;
    }
}
