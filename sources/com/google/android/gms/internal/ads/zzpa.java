package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzpa implements Parcelable {
    public static final Parcelable.Creator<zzpa> CREATOR = new zzoz();
    private int zzahb;
    public final int zzaqy;
    public final int zzaqz;
    public final int zzara;
    public final byte[] zzbib;

    public zzpa(int i, int i2, int i3, byte[] bArr) {
        this.zzaqy = i;
        this.zzara = i2;
        this.zzaqz = i3;
        this.zzbib = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    zzpa(Parcel parcel) {
        this.zzaqy = parcel.readInt();
        this.zzara = parcel.readInt();
        this.zzaqz = parcel.readInt();
        this.zzbib = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzpa zzpa = (zzpa) obj;
            return this.zzaqy == zzpa.zzaqy && this.zzara == zzpa.zzara && this.zzaqz == zzpa.zzaqz && Arrays.equals(this.zzbib, zzpa.zzbib);
        }
    }

    public final String toString() {
        int i = this.zzaqy;
        int i2 = this.zzara;
        int i3 = this.zzaqz;
        boolean z = this.zzbib != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.zzahb == 0) {
            this.zzahb = ((((((this.zzaqy + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzara) * 31) + this.zzaqz) * 31) + Arrays.hashCode(this.zzbib);
        }
        return this.zzahb;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzaqy);
        parcel.writeInt(this.zzara);
        parcel.writeInt(this.zzaqz);
        parcel.writeInt(this.zzbib != null ? 1 : 0);
        byte[] bArr = this.zzbib;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
