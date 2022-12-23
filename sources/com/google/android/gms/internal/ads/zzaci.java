package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzaci extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaci> CREATOR = new zzacl();
    public final int versionCode;
    public final int zzbkx;
    public final int zzbky;
    public final boolean zzbkz;
    public final int zzbla;
    public final boolean zzblc;
    public final boolean zzcyt;
    public final zzze zzcyu;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzaci(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzze(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzjr(), nativeAdOptions.getMediaAspectRatio());
    }

    public zzaci(int i, boolean z, int i2, boolean z2, int i3, zzze zzze, boolean z3, int i4) {
        this.versionCode = i;
        this.zzcyt = z;
        this.zzbkx = i2;
        this.zzbkz = z2;
        this.zzbla = i3;
        this.zzcyu = zzze;
        this.zzblc = z3;
        this.zzbky = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzcyt);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbkx);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzbkz);
        SafeParcelWriter.writeInt(parcel, 5, this.zzbla);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzcyu, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzblc);
        SafeParcelWriter.writeInt(parcel, 8, this.zzbky);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
