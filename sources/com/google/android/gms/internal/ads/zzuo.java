package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzuo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuo> CREATOR = new zzur();
    public final int type;
    public final int zzacj;
    public final String zzack;
    public final long zzacl;

    public zzuo(int i, int i2, String str, long j) {
        this.type = i;
        this.zzacj = i2;
        this.zzack = str;
        this.zzacl = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.type);
        SafeParcelWriter.writeInt(parcel, 2, this.zzacj);
        SafeParcelWriter.writeString(parcel, 3, this.zzack, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzacl);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static zzuo zza(JSONObject jSONObject) throws JSONException {
        return new zzuo(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }
}
