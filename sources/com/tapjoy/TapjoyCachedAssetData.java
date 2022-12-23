package com.tapjoy;

import com.vungle.warren.model.Advertisement;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class TapjoyCachedAssetData implements Serializable {

    /* renamed from: a */
    private long f22154a;

    /* renamed from: b */
    private long f22155b;

    /* renamed from: c */
    private String f22156c;

    /* renamed from: d */
    private String f22157d;

    /* renamed from: e */
    private String f22158e;

    /* renamed from: f */
    private long f22159f;

    /* renamed from: g */
    private String f22160g;

    /* renamed from: h */
    private String f22161h;

    public TapjoyCachedAssetData(String str, String str2, long j) {
        this(str, str2, j, System.currentTimeMillis() / 1000);
    }

    public TapjoyCachedAssetData(String str, String str2, long j, long j2) {
        setAssetURL(str);
        setLocalFilePath(str2);
        this.f22155b = j;
        this.f22154a = j2;
        this.f22159f = j2 + j;
    }

    public void setAssetURL(String str) {
        this.f22156c = str;
        this.f22160g = TapjoyUtil.determineMimeType(str);
    }

    public void setLocalFilePath(String str) {
        this.f22157d = str;
        this.f22158e = Advertisement.FILE_SCHEME + str;
    }

    public void resetTimeToLive(long j) {
        this.f22155b = j;
        this.f22159f = (System.currentTimeMillis() / 1000) + j;
    }

    public void setOfferID(String str) {
        this.f22161h = str;
    }

    public long getTimestampInSeconds() {
        return this.f22154a;
    }

    public long getTimeToLiveInSeconds() {
        return this.f22155b;
    }

    public long getTimeOfDeathInSeconds() {
        return this.f22159f;
    }

    public String getAssetURL() {
        return this.f22156c;
    }

    public String getLocalFilePath() {
        return this.f22157d;
    }

    public String getLocalURL() {
        return this.f22158e;
    }

    public String getMimeType() {
        return this.f22160g;
    }

    public String getOfferId() {
        return this.f22161h;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", getTimestampInSeconds());
            jSONObject.put(TapjoyConstants.TJC_TIME_TO_LIVE, getTimeToLiveInSeconds());
            jSONObject.put("assetURL", getAssetURL());
            jSONObject.put("localFilePath", getLocalFilePath());
            jSONObject.put("offerID", getOfferId());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toRawJSONString() {
        return toJSON().toString();
    }

    public static TapjoyCachedAssetData fromRawJSONString(String str) {
        try {
            return fromJSONObject(new JSONObject(str));
        } catch (JSONException unused) {
            TapjoyLog.m24276i("TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- error reading json string");
            return null;
        }
    }

    public static TapjoyCachedAssetData fromJSONObject(JSONObject jSONObject) {
        TapjoyCachedAssetData tapjoyCachedAssetData;
        try {
            tapjoyCachedAssetData = new TapjoyCachedAssetData(jSONObject.getString("assetURL"), jSONObject.getString("localFilePath"), jSONObject.getLong(TapjoyConstants.TJC_TIME_TO_LIVE), jSONObject.getLong("timestamp"));
            try {
                tapjoyCachedAssetData.setOfferID(jSONObject.optString("offerID"));
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            tapjoyCachedAssetData = null;
            TapjoyLog.m24276i("TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- not enough data.");
            return tapjoyCachedAssetData;
        }
        return tapjoyCachedAssetData;
    }

    public String toString() {
        return "\nURL=" + this.f22158e + "\n" + "AssetURL=" + this.f22156c + "\n" + "MimeType=" + this.f22160g + "\n" + "Timestamp=" + getTimestampInSeconds() + "\n" + "TimeOfDeath=" + this.f22159f + "\n" + "TimeToLive=" + this.f22155b + "\n";
    }
}
