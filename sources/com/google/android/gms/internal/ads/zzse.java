package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzse> CREATOR = new zzsd();
    private ParcelFileDescriptor zzbsl;

    public zzse() {
        this((ParcelFileDescriptor) null);
    }

    public zzse(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzbsl = parcelFileDescriptor;
    }

    public final synchronized boolean zzmv() {
        return this.zzbsl != null;
    }

    public final synchronized InputStream zzmw() {
        if (this.zzbsl == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zzbsl);
        this.zzbsl = null;
        return autoCloseInputStream;
    }

    private final synchronized ParcelFileDescriptor zzmx() {
        return this.zzbsl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzmx(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
