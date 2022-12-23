package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzaha extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaha> CREATOR = new zzahd();
    public final String description;
    public final String zzdbg;
    public final boolean zzdbh;
    public final int zzdbi;

    public zzaha(String str, boolean z, int i, String str2) {
        this.zzdbg = str;
        this.zzdbh = z;
        this.zzdbi = i;
        this.description = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdbg, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdbh);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdbi);
        SafeParcelWriter.writeString(parcel, 4, this.description, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
