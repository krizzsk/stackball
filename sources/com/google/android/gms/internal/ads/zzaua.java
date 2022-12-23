package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzaua extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaua> CREATOR = new zzatz();
    public final String zzdrf;
    public final String zzdrg;

    public zzaua(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    public zzaua(String str, String str2) {
        this.zzdrf = str;
        this.zzdrg = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzdrf, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzdrg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
