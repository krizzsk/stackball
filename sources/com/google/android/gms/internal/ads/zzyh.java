package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.query.QueryInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzyh {
    private final String zzbmy;
    private final Bundle zzchs;

    public zzyh(String str, Bundle bundle) {
        this.zzbmy = str;
        this.zzchs = bundle;
    }

    public final String getQuery() {
        return this.zzbmy;
    }

    public static String zza(QueryInfo queryInfo) {
        String str = zzvj.zzpz().get(queryInfo);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final Bundle getQueryBundle() {
        return this.zzchs;
    }
}
