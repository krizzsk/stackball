package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzlo extends zzlu {
    public static final Parcelable.Creator<zzlo> CREATOR = new zzlq();
    private final String description;
    private final String mimeType;
    private final int zzbar;
    private final byte[] zzbas;

    public zzlo(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.mimeType = str;
        this.description = null;
        this.zzbar = 3;
        this.zzbas = bArr;
    }

    zzlo(Parcel parcel) {
        super("APIC");
        this.mimeType = parcel.readString();
        this.description = parcel.readString();
        this.zzbar = parcel.readInt();
        this.zzbas = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzlo zzlo = (zzlo) obj;
            return this.zzbar == zzlo.zzbar && zzov.zza(this.mimeType, zzlo.mimeType) && zzov.zza(this.description, zzlo.description) && Arrays.equals(this.zzbas, zzlo.zzbas);
        }
    }

    public final int hashCode() {
        int i = (this.zzbar + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.mimeType;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.zzbas);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.zzbar);
        parcel.writeByteArray(this.zzbas);
    }
}
