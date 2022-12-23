package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
public final class zzdne extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdne> CREATOR = new zzdnd();
    private final int versionCode;
    private final String zzhbk;
    private final String zzhbl;
    private final int zzhbm;
    private final int zzhda;

    zzdne(int i, int i2, int i3, String str, String str2) {
        this.versionCode = i;
        this.zzhbm = i2;
        this.zzhbk = str;
        this.zzhbl = str2;
        this.zzhda = i3;
    }

    public zzdne(int i, zzgb zzgb, String str, String str2) {
        this(1, i, zzgb.zzw(), str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, this.zzhbm);
        SafeParcelWriter.writeString(parcel, 3, this.zzhbk, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzhbl, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzhda);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
