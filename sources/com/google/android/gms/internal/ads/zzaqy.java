package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzaqy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaqy> CREATOR = new zzaqx();
    public final boolean zzdox;
    public final List<String> zzdoy;

    public zzaqy() {
        this(false, Collections.emptyList());
    }

    public zzaqy(boolean z, List<String> list) {
        this.zzdox = z;
        this.zzdoy = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdox);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzdoy, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
