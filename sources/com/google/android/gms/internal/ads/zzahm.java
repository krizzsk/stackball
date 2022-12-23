package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzahm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzahm> CREATOR = new zzahp();
    public final int versionCode;
    public final int zzbky;
    public final int zzdbm;
    public final String zzdbn;

    public zzahm(zzahy zzahy) {
        this(2, 1, zzahy.zzsq(), zzahy.getMediaAspectRatio());
    }

    public zzahm(int i, int i2, String str, int i3) {
        this.versionCode = i;
        this.zzdbm = i2;
        this.zzdbn = str;
        this.zzbky = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzdbm);
        SafeParcelWriter.writeString(parcel, 2, this.zzdbn, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbky);
        SafeParcelWriter.writeInt(parcel, 1000, this.versionCode);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
