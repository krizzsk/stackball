package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzeec<E> extends zzeak<E> implements RandomAccess {
    private static final zzeec<Object> zziaz;
    private int size;
    private E[] zzhfr;

    public static <E> zzeec<E> zzbgn() {
        return zziaz;
    }

    zzeec() {
        this(new Object[10], 0);
    }

    private zzeec(E[] eArr, int i) {
        this.zzhfr = eArr;
        this.size = i;
    }

    public final boolean add(E e) {
        zzbck();
        int i = this.size;
        E[] eArr = this.zzhfr;
        if (i == eArr.length) {
            this.zzhfr = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzhfr;
        int i2 = this.size;
        this.size = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public final void add(int i, E e) {
        int i2;
        zzbck();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfm(i));
        }
        E[] eArr = this.zzhfr;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzhfr, i, eArr2, i + 1, this.size - i);
            this.zzhfr = eArr2;
        }
        this.zzhfr[i] = e;
        this.size++;
        this.modCount++;
    }

    public final E get(int i) {
        zzfl(i);
        return this.zzhfr[i];
    }

    public final E remove(int i) {
        zzbck();
        zzfl(i);
        E[] eArr = this.zzhfr;
        E e = eArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        zzbck();
        zzfl(i);
        E[] eArr = this.zzhfr;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.size;
    }

    private final void zzfl(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzfm(i));
        }
    }

    private final String zzfm(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ zzecl zzfn(int i) {
        if (i >= this.size) {
            return new zzeec(Arrays.copyOf(this.zzhfr, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    static {
        zzeec<Object> zzeec = new zzeec<>(new Object[0], 0);
        zziaz = zzeec;
        zzeec.zzbcj();
    }
}
