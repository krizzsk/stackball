package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
final class zzdpe<E> extends zzdou<E> {
    static final zzdou<Object> zzhfq = new zzdpe(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzhfr;

    zzdpe(Object[] objArr, int i) {
        this.zzhfr = objArr;
        this.size = i;
    }

    /* access modifiers changed from: package-private */
    public final int zzavu() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzavx() {
        return false;
    }

    public final int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzavt() {
        return this.zzhfr;
    }

    /* access modifiers changed from: package-private */
    public final int zzavv() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzhfr, 0, objArr, i, this.size);
        return i + this.size;
    }

    public final E get(int i) {
        zzdoj.zzs(i, this.size);
        return this.zzhfr[i];
    }
}
