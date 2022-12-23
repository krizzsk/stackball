package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzebz extends zzeak<Float> implements zzecl<Float>, zzeea, RandomAccess {
    private static final zzebz zzhxi;
    private int size;
    private float[] zzhxj;

    zzebz() {
        this(new float[10], 0);
    }

    private zzebz(float[] fArr, int i) {
        this.zzhxj = fArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzbck();
        if (i2 >= i) {
            float[] fArr = this.zzhxj;
            System.arraycopy(fArr, i2, fArr, i, this.size - i2);
            this.size -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzebz)) {
            return super.equals(obj);
        }
        zzebz zzebz = (zzebz) obj;
        if (this.size != zzebz.size) {
            return false;
        }
        float[] fArr = zzebz.zzhxj;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.zzhxj[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzhxj[i2]);
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void zzh(float f) {
        zzbck();
        int i = this.size;
        float[] fArr = this.zzhxj;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zzhxj = fArr2;
        }
        float[] fArr3 = this.zzhxj;
        int i2 = this.size;
        this.size = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        zzbck();
        zzecg.checkNotNull(collection);
        if (!(collection instanceof zzebz)) {
            return super.addAll(collection);
        }
        zzebz zzebz = (zzebz) collection;
        int i = zzebz.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.zzhxj;
            if (i3 > fArr.length) {
                this.zzhxj = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzebz.zzhxj, 0, this.zzhxj, this.size, zzebz.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzbck();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Float.valueOf(this.zzhxj[i]))) {
                float[] fArr = this.zzhxj;
                System.arraycopy(fArr, i + 1, fArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
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

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzbck();
        zzfl(i);
        float[] fArr = this.zzhxj;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        zzbck();
        zzfl(i);
        float[] fArr = this.zzhxj;
        float f = fArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zzbck();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfm(i));
        }
        float[] fArr = this.zzhxj;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzhxj, i, fArr2, i + 1, this.size - i);
            this.zzhxj = fArr2;
        }
        this.zzhxj[i] = floatValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }

    public final /* synthetic */ zzecl zzfn(int i) {
        if (i >= this.size) {
            return new zzebz(Arrays.copyOf(this.zzhxj, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        zzfl(i);
        return Float.valueOf(this.zzhxj[i]);
    }

    static {
        zzebz zzebz = new zzebz(new float[0], 0);
        zzhxi = zzebz;
        zzebz.zzbcj();
    }
}
