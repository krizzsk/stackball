package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzago extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzago> CREATOR = new zzagr();
    public final byte[] data;
    public final int statusCode;
    public final boolean zzac;
    public final long zzad;
    public final String[] zzdaz;
    public final String[] zzdba;
    public final boolean zzdbb;
    public final String zzdbc;

    zzago(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.zzdbb = z;
        this.zzdbc = str;
        this.statusCode = i;
        this.data = bArr;
        this.zzdaz = strArr;
        this.zzdba = strArr2;
        this.zzac = z2;
        this.zzad = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzdbb);
        SafeParcelWriter.writeString(parcel, 2, this.zzdbc, false);
        SafeParcelWriter.writeInt(parcel, 3, this.statusCode);
        SafeParcelWriter.writeByteArray(parcel, 4, this.data, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.zzdaz, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzdba, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzac);
        SafeParcelWriter.writeLong(parcel, 8, this.zzad);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
