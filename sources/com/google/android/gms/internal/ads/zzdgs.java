package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdgs implements zzayv {
    public final String zzdku = this.zzgui.optString("ad_base_url", (String) null);
    public final String zzdkw;
    public final JSONObject zzfpz = this.zzgui.optJSONObject("ad_json");
    private final JSONObject zzgui;

    zzdgs(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzc = zzayu.zzc(jsonReader);
        this.zzgui = zzc;
        this.zzdkw = zzc.optString(CampaignEx.JSON_KEY_AD_HTML, (String) null);
    }

    public final void zza(JsonWriter jsonWriter) throws IOException {
        zzayu.zza(jsonWriter, this.zzgui);
    }
}
