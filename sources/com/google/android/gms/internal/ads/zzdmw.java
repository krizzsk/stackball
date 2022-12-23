package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbv;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
public final class zzdmw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdmw> CREATOR = new zzdmv();
    private final int versionCode;
    private zzbv.zza zzhco = null;
    private byte[] zzhcp;

    zzdmw(int i, byte[] bArr) {
        this.versionCode = i;
        this.zzhcp = bArr;
        zzauz();
    }

    public final zzbv.zza zzauy() {
        if (!(this.zzhco != null)) {
            try {
                this.zzhco = zzbv.zza.zza(this.zzhcp, zzebq.zzbed());
                this.zzhcp = null;
            } catch (zzeco e) {
                throw new IllegalStateException(e);
            }
        }
        zzauz();
        return this.zzhco;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        byte[] bArr = this.zzhcp;
        if (bArr == null) {
            bArr = this.zzhco.toByteArray();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private final void zzauz() {
        if (this.zzhco == null && this.zzhcp != null) {
            return;
        }
        if (this.zzhco != null && this.zzhcp == null) {
            return;
        }
        if (this.zzhco != null && this.zzhcp != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.zzhco == null && this.zzhcp == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }
}
