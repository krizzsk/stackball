package com.ironsource.mediationsdk.impressionData;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

public class ImpressionData {

    /* renamed from: A */
    private String f13595A = null;

    /* renamed from: B */
    private DecimalFormat f13596B;

    /* renamed from: a */
    private final String f13597a = IronSourceConstants.EVENTS_AUCTION_ID;

    /* renamed from: b */
    private final String f13598b = IronSourceConstants.EVENTS_AD_UNIT;

    /* renamed from: c */
    private final String f13599c = "country";

    /* renamed from: d */
    private final String f13600d = "ab";

    /* renamed from: e */
    private final String f13601e = "segmentName";

    /* renamed from: f */
    private final String f13602f = "placement";

    /* renamed from: g */
    private final String f13603g = "adNetwork";

    /* renamed from: h */
    private final String f13604h = "instanceName";

    /* renamed from: i */
    private final String f13605i = "instanceId";

    /* renamed from: j */
    private final String f13606j = "revenue";

    /* renamed from: k */
    private final String f13607k = "precision";

    /* renamed from: l */
    private final String f13608l = "lifetimeRevenue";

    /* renamed from: m */
    private final String f13609m = "encryptedCPM";

    /* renamed from: n */
    private JSONObject f13610n;

    /* renamed from: o */
    private String f13611o = null;

    /* renamed from: p */
    private String f13612p = null;

    /* renamed from: q */
    private String f13613q = null;

    /* renamed from: r */
    private String f13614r = null;

    /* renamed from: s */
    private String f13615s = null;

    /* renamed from: t */
    private String f13616t = null;

    /* renamed from: u */
    private String f13617u = null;

    /* renamed from: v */
    private String f13618v = null;

    /* renamed from: w */
    private String f13619w = null;

    /* renamed from: x */
    private Double f13620x = null;

    /* renamed from: y */
    private String f13621y = null;

    /* renamed from: z */
    private Double f13622z = null;

    public ImpressionData(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str = "revenue";
        this.f13596B = new DecimalFormat("#.#####");
        if (jSONObject2 != null) {
            try {
                this.f13610n = jSONObject2;
                this.f13611o = jSONObject2.optString(IronSourceConstants.EVENTS_AUCTION_ID, (String) null);
                this.f13612p = jSONObject2.optString(IronSourceConstants.EVENTS_AD_UNIT, (String) null);
                this.f13613q = jSONObject2.optString("country", (String) null);
                this.f13614r = jSONObject2.optString("ab", (String) null);
                this.f13615s = jSONObject2.optString("segmentName", (String) null);
                this.f13616t = jSONObject2.optString("placement", (String) null);
                this.f13617u = jSONObject2.optString("adNetwork", (String) null);
                this.f13618v = jSONObject2.optString("instanceName", (String) null);
                this.f13619w = jSONObject2.optString("instanceId", (String) null);
                this.f13621y = jSONObject2.optString("precision", (String) null);
                this.f13595A = jSONObject2.optString("encryptedCPM", (String) null);
                double optDouble = jSONObject2.optDouble("lifetimeRevenue");
                this.f13622z = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject2.optDouble(str);
                this.f13620x = Double.isNaN(optDouble2) ? null : Double.valueOf(optDouble2);
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("error parsing impression " + e.getMessage());
            }
        }
    }

    public String getAb() {
        return this.f13614r;
    }

    public String getAdNetwork() {
        return this.f13617u;
    }

    public String getAdUnit() {
        return this.f13612p;
    }

    public JSONObject getAllData() {
        return this.f13610n;
    }

    public String getAuctionId() {
        return this.f13611o;
    }

    public String getCountry() {
        return this.f13613q;
    }

    public String getEncryptedCPM() {
        return this.f13595A;
    }

    public String getInstanceId() {
        return this.f13619w;
    }

    public String getInstanceName() {
        return this.f13618v;
    }

    public Double getLifetimeRevenue() {
        return this.f13622z;
    }

    public String getPlacement() {
        return this.f13616t;
    }

    public String getPrecision() {
        return this.f13621y;
    }

    public Double getRevenue() {
        return this.f13620x;
    }

    public String getSegmentName() {
        return this.f13615s;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.f13616t;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.f13616t = replace;
            JSONObject jSONObject = this.f13610n;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", replace);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImpressionData{auctionId='");
        sb.append(this.f13611o);
        sb.append('\'');
        sb.append(", adUnit='");
        sb.append(this.f13612p);
        sb.append('\'');
        sb.append(", country='");
        sb.append(this.f13613q);
        sb.append('\'');
        sb.append(", ab='");
        sb.append(this.f13614r);
        sb.append('\'');
        sb.append(", segmentName='");
        sb.append(this.f13615s);
        sb.append('\'');
        sb.append(", placement='");
        sb.append(this.f13616t);
        sb.append('\'');
        sb.append(", adNetwork='");
        sb.append(this.f13617u);
        sb.append('\'');
        sb.append(", instanceName='");
        sb.append(this.f13618v);
        sb.append('\'');
        sb.append(", instanceId='");
        sb.append(this.f13619w);
        sb.append('\'');
        sb.append(", revenue=");
        Double d = this.f13620x;
        String str = null;
        sb.append(d == null ? null : this.f13596B.format(d));
        sb.append(", precision='");
        sb.append(this.f13621y);
        sb.append('\'');
        sb.append(", lifetimeRevenue=");
        Double d2 = this.f13622z;
        if (d2 != null) {
            str = this.f13596B.format(d2);
        }
        sb.append(str);
        sb.append(", encryptedCPM='");
        sb.append(this.f13595A);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
