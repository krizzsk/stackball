package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzagm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzagm> CREATOR = new zzagp();
    private final String url;
    private final String[] zzdaz;
    private final String[] zzdba;

    zzagm(String str, String[] strArr, String[] strArr2) {
        this.url = str;
        this.zzdaz = strArr;
        this.zzdba = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.url, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzdaz, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzdba, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static zzagm zzh(zzq<?> zzq) throws zzb {
        Map<String, String> headers = zzq.getHeaders();
        int size = headers.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry next : headers.entrySet()) {
            strArr[i] = (String) next.getKey();
            strArr2[i] = (String) next.getValue();
            i++;
        }
        return new zzagm(zzq.getUrl(), strArr, strArr2);
    }
}
