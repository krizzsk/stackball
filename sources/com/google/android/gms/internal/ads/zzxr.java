package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxr> CREATOR = new zzxq();
    private final int zzcgl;

    public zzxr(int i) {
        this.zzcgl = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzcgl);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
