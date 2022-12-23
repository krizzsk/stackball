package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C6348l;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class DomainCampaignEx extends Campaign implements NoProGuard, Serializable {
    private static final String JSON_KEY_AD_TRACKING_DLE = "D+S8+FxXJFPsYFc3+F5/Hv==";
    private static final String JSON_KEY_AD_TRACKING_DLS = "D+S8+FxXJFPsYFc3+bfTD+zT";
    private static final String JSON_KEY_AD_TRACKING_I = "D+S8+FQ/hbxtY7M=";
    private static String TAG = "DomainCampaignEx";

    public static JSONObject campaignToJsonObject(JSONObject jSONObject, CampaignEx campaignEx) throws JSONException {
        return jSONObject;
    }

    public static CampaignEx parseCampaign(JSONObject jSONObject, CampaignEx campaignEx) {
        return campaignEx;
    }

    public static CampaignEx parseCampaignWithBackData(JSONObject jSONObject, CampaignEx campaignEx) {
        return campaignEx;
    }

    public boolean needShowIDialog(CampaignEx campaignEx) {
        return false;
    }

    public static C6199i trackingStr2Object(JSONObject jSONObject, C6199i iVar) {
        if (jSONObject == null || iVar == null) {
            return null;
        }
        try {
            iVar.mo43695t(CampaignEx.processNativeVideoTrackingArray(jSONObject.optJSONArray(C6348l.m16089b(JSON_KEY_AD_TRACKING_DLS))));
            iVar.mo43696u(CampaignEx.processNativeVideoTrackingArray(jSONObject.optJSONArray(C6348l.m16089b(JSON_KEY_AD_TRACKING_DLE))));
            iVar.mo43697v(CampaignEx.processNativeVideoTrackingArray(jSONObject.optJSONArray(C6348l.m16089b(JSON_KEY_AD_TRACKING_I))));
        } catch (Exception unused) {
        }
        return iVar;
    }

    protected static String replaceValueByKey(CampaignUnit campaignUnit, CampaignEx campaignEx, String str) {
        if (!(campaignUnit == null || TextUtils.isEmpty(str) || campaignEx == null)) {
            try {
                HashMap<String, String> rks = campaignUnit.getRks();
                if (rks != null) {
                    rks.entrySet().iterator();
                    for (Map.Entry next : rks.entrySet()) {
                        str = str.replaceAll("\\{" + ((String) next.getKey()) + "\\}", (String) next.getValue());
                    }
                }
                HashMap<String, String> aks = campaignEx.getAks();
                if (aks != null) {
                    aks.entrySet().iterator();
                    for (Map.Entry next2 : aks.entrySet()) {
                        str = str.replaceAll("\\{" + ((String) next2.getKey()) + "\\}", (String) next2.getValue());
                    }
                }
                str = str.replaceAll("\\{c\\}", URLEncoder.encode(campaignUnit.assembCParams(), "utf-8"));
                Matcher matcher = Pattern.compile("=\\{.*?\\}").matcher(str);
                while (matcher.find()) {
                    str = str.replace(matcher.group(0), "=");
                }
            } catch (Throwable th) {
                C6361q.m16155a(TAG, th.getMessage(), th);
            }
        }
        return str;
    }
}
