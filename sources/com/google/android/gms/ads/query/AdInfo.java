package com.google.android.gms.ads.query;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.internal.ads.zzazw;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public class AdInfo {
    private final QueryInfo zzhas;
    private final String zzhat;

    public static String getRequestId(String str) {
        if (str == null) {
            zzazw.zzfc("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
        } catch (JSONException unused) {
            zzazw.zzfc("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    public AdInfo(QueryInfo queryInfo, String str) {
        this.zzhas = queryInfo;
        this.zzhat = str;
    }

    public QueryInfo getQueryInfo() {
        return this.zzhas;
    }

    public String getAdString() {
        return this.zzhat;
    }
}
