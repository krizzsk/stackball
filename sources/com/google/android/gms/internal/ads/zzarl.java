package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzarl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarl> CREATOR = new zzaro();
    String zzdpj;

    public zzarl(String str) {
        this.zzdpj = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdpj, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
