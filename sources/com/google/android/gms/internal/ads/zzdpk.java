package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
final class zzdpk<E> extends zzdpb<E> {
    static final zzdpk<Object> zzhfy = new zzdpk(new Object[0], 0, (Object[]) null, 0, 0);
    private final transient int mask;
    private final transient int size;
    private final transient int zzahb;
    private final transient Object[] zzhfz;
    private final transient Object[] zzhga;

    zzdpk(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzhfz = objArr;
        this.zzhga = objArr2;
        this.mask = i2;
        this.zzahb = i;
        this.size = i3;
    }

    /* access modifiers changed from: package-private */
    public final int zzavu() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzavx() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzawd() {
        return true;
    }

    public final boolean contains(@NullableDecl Object obj) {
        int i;
        Object[] objArr = this.zzhga;
        if (obj == null || objArr == null) {
            return false;
        }
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int zzef = zzdoq.zzef(i);
        while (true) {
            int i2 = zzef & this.mask;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzef = i2 + 1;
        }
    }

    public final int size() {
        return this.size;
    }

    public final zzdpp<E> zzavs() {
        return (zzdpp) zzavw().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzavt() {
        return this.zzhfz;
    }

    /* access modifiers changed from: package-private */
    public final int zzavv() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzhfz, 0, objArr, i, this.size);
        return i + this.size;
    }

    /* access modifiers changed from: package-private */
    public final zzdou<E> zzawe() {
        return zzdou.zzb(this.zzhfz, this.size);
    }

    public final int hashCode() {
        return this.zzahb;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
