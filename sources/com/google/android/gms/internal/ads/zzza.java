package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzza> CREATOR = new zzzd();
    public final String zzbmy;

    public zzza(SearchAdRequest searchAdRequest) {
        this.zzbmy = searchAdRequest.getQuery();
    }

    zzza(String str) {
        this.zzbmy = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 15, this.zzbmy, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
