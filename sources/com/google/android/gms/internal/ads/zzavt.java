package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzavt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzavt> CREATOR = new zzavw();
    public final String zzbna;
    @Deprecated
    public final String zzbsc;
    @Deprecated
    public final zzum zzdtf;
    public final zzuj zzdtg;

    public zzavt(String str, String str2, zzum zzum, zzuj zzuj) {
        this.zzbsc = str;
        this.zzbna = str2;
        this.zzdtf = zzum;
        this.zzdtg = zzuj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzbsc, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzbna, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdtf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzdtg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
