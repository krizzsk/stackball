package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzyy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyy> CREATOR = new zzzb();
    private final int zzacq;
    private final int zzacr;

    public zzyy(int i, int i2) {
        this.zzacq = i;
        this.zzacr = i2;
    }

    public zzyy(RequestConfiguration requestConfiguration) {
        this.zzacq = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzacr = requestConfiguration.getTagForUnderAgeOfConsent();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzacq);
        SafeParcelWriter.writeInt(parcel, 2, this.zzacr);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
