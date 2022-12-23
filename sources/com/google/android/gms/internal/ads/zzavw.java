package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzavw implements Parcelable.Creator<zzavt> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzavt[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        zzum zzum = null;
        zzuj zzuj = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                zzum = (zzum) SafeParcelReader.createParcelable(parcel, readHeader, zzum.CREATOR);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                zzuj = (zzuj) SafeParcelReader.createParcelable(parcel, readHeader, zzuj.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzavt(str, str2, zzum, zzuj);
    }
}
