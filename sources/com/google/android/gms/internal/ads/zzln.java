package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzln implements Parcelable {
    public static final Parcelable.Creator<zzln> CREATOR = new zzlm();
    private final zza[] zzbaq;

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    public interface zza extends Parcelable {
    }

    public zzln(List<? extends zza> list) {
        zza[] zzaArr = new zza[list.size()];
        this.zzbaq = zzaArr;
        list.toArray(zzaArr);
    }

    public final int describeContents() {
        return 0;
    }

    zzln(Parcel parcel) {
        this.zzbaq = new zza[parcel.readInt()];
        int i = 0;
        while (true) {
            zza[] zzaArr = this.zzbaq;
            if (i < zzaArr.length) {
                zzaArr[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public final int length() {
        return this.zzbaq.length;
    }

    public final zza zzau(int i) {
        return this.zzbaq[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzbaq, ((zzln) obj).zzbaq);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzbaq);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzbaq.length);
        for (zza writeParcelable : this.zzbaq) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
