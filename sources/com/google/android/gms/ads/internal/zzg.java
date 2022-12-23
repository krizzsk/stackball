package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzj();
    public final boolean zzblz;
    public final boolean zzbma;
    private final String zzbmb;
    public final boolean zzbmc;
    public final float zzbmd;
    public final int zzbme;
    public final boolean zzbmf;
    public final boolean zzbmg;
    public final boolean zzbmh;

    public zzg(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(false, z2, (String) null, false, 0.0f, -1, z4, z5, z6);
    }

    zzg(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zzblz = z;
        this.zzbma = z2;
        this.zzbmb = str;
        this.zzbmc = z3;
        this.zzbmd = f;
        this.zzbme = i;
        this.zzbmf = z4;
        this.zzbmg = z5;
        this.zzbmh = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzblz);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzbma);
        SafeParcelWriter.writeString(parcel, 4, this.zzbmb, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzbmc);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzbmd);
        SafeParcelWriter.writeInt(parcel, 7, this.zzbme);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbmf);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzbmg);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzbmh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
