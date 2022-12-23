package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzlp extends zzlu {
    public static final Parcelable.Creator<zzlp> CREATOR = new zzls();
    public final String description;
    public final String text;
    private final String zzagz;

    public zzlp(String str, String str2, String str3) {
        super("COMM");
        this.zzagz = str;
        this.description = str2;
        this.text = str3;
    }

    zzlp(Parcel parcel) {
        super("COMM");
        this.zzagz = parcel.readString();
        this.description = parcel.readString();
        this.text = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzlp zzlp = (zzlp) obj;
            return zzov.zza(this.description, zzlp.description) && zzov.zza(this.zzagz, zzlp.zzagz) && zzov.zza(this.text, zzlp.text);
        }
    }

    public final int hashCode() {
        String str = this.zzagz;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzagd);
        parcel.writeString(this.zzagz);
        parcel.writeString(this.text);
    }
}
