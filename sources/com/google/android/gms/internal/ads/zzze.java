package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzze> CREATOR = new zzzh();
    public final boolean zzacy;
    public final boolean zzacz;
    public final boolean zzada;

    public zzze(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    public zzze(boolean z, boolean z2, boolean z3) {
        this.zzacy = z;
        this.zzacz = z2;
        this.zzada = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzacy);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzacz);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzada);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
