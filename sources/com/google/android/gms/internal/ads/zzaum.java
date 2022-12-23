package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzaum extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaum> CREATOR = new zzaul();
    public final String zzdsd;
    public final String zzdse;
    public final boolean zzdsf;
    public final boolean zzdsg;
    public final List<String> zzdsh;
    public final boolean zzdsi;
    public final boolean zzdsj;
    public final List<String> zzdsk;

    public zzaum(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.zzdsd = str;
        this.zzdse = str2;
        this.zzdsf = z;
        this.zzdsg = z2;
        this.zzdsh = list;
        this.zzdsi = z3;
        this.zzdsj = z4;
        this.zzdsk = list2 == null ? new ArrayList<>() : list2;
    }

    public static zzaum zzg(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new zzaum(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzayu.zza(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzayu.zza(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdsd, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdse, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzdsf);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzdsg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzdsh, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzdsi);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdsj);
        SafeParcelWriter.writeStringList(parcel, 9, this.zzdsk, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
