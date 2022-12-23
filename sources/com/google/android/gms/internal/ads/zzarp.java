package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzarp {
    private final int errorCode;
    private final String type;
    private String url;
    private final String zzdmh;
    private final String zzdou;
    private final boolean zzdov;
    private final String zzdpi;
    private final List<String> zzdpk;
    private final String zzdpl;
    private final String zzdpm;
    private final boolean zzdpn;
    private final String zzdpo;
    private final boolean zzdpp;
    private final JSONObject zzdpq;

    public zzarp(JSONObject jSONObject) {
        List<String> list;
        this.url = jSONObject.optString("url");
        this.zzdpl = jSONObject.optString("base_uri");
        this.zzdpm = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        int i = 1;
        this.zzdpn = optString != null && (optString.equals("1") || optString.equals("true"));
        this.zzdmh = jSONObject.optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
        this.type = jSONObject.optString("type");
        String optString2 = jSONObject.optString(ReportDBAdapter.ReportColumns.COLUMN_ERRORS);
        if (optString2 == null) {
            list = null;
        } else {
            list = Arrays.asList(optString2.split(","));
        }
        this.zzdpk = list;
        this.errorCode = jSONObject.optInt("valid", 0) == 1 ? -2 : i;
        this.zzdpo = jSONObject.optString("fetched_ad");
        this.zzdpp = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.zzdpq = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.zzdou = jSONObject.optString("analytics_query_ad_event_id");
        this.zzdov = jSONObject.optBoolean("is_analytics_logging_enabled");
        this.zzdpi = jSONObject.optString("pool_key");
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final List<String> zzuv() {
        return this.zzdpk;
    }

    public final String zzuw() {
        return this.zzdpl;
    }

    public final String zzux() {
        return this.zzdpm;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean zzuy() {
        return this.zzdpn;
    }

    public final JSONObject zzuz() {
        return this.zzdpq;
    }

    public final String zzva() {
        return this.zzdpi;
    }
}
