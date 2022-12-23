package com.ogury.p245ed.internal;

import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.ef */
public final class C8189ef {

    /* renamed from: a */
    public static final C8189ef f21209a = new C8189ef();

    private C8189ef() {
    }

    /* renamed from: a */
    public static String m22870a(C8190eg egVar, C8186ec ecVar, String str, C8203es esVar) {
        C8467mq.m23881b(egVar, "requestDetails");
        C8467mq.m23881b(ecVar, "adContent");
        C8467mq.m23881b(str, DataKeys.USER_ID);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("connectivity", egVar.mo53388a());
        jSONObject.put("at", egVar.mo53389b());
        jSONObject.put("country", egVar.mo53390c());
        jSONObject.put("build", 30105);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(egVar.mo53391d());
        jSONObject.put("apps_publishers", jSONArray);
        jSONObject.put("version", egVar.mo53395h());
        jSONObject.put("device", m22871a(egVar));
        jSONObject.put("content", m22874b(egVar, ecVar, str, esVar));
        JSONObject b = m22873b(egVar);
        if (!C8254ge.m23188a(b)) {
            jSONObject.put("privacy_compliancy", b);
        }
        JSONObject d = m22876d(egVar);
        if (!C8254ge.m23188a(d)) {
            jSONObject.put("targeting", d);
        }
        JSONObject c = m22875c(egVar);
        if (!C8254ge.m23188a(c)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, c);
        }
        String jSONObject2 = jSONObject.toString();
        C8467mq.m23878a((Object) jSONObject2, "requestBody.toString()");
        return jSONObject2;
    }

    /* renamed from: a */
    private static JSONObject m22871a(C8190eg egVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", egVar.mo53393f());
        jSONObject.put("height", egVar.mo53394g());
        return jSONObject;
    }

    /* renamed from: b */
    private static JSONObject m22874b(C8190eg egVar, C8186ec ecVar, String str, C8203es esVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", ecVar.mo53384a());
        jSONObject.put("ad_sync_type", "load");
        if (esVar != null) {
            jSONObject.put("overlay", m22872a(esVar, egVar.mo53396i()));
        }
        if (ecVar.mo53385b() != null) {
            jSONObject.put("ad_unit_id", ecVar.mo53385b());
        }
        if (str.length() > 0) {
            jSONObject.put("app_user_id", str);
        }
        if (ecVar.mo53386c() != null) {
            jSONObject.put("campaign_to_load", ecVar.mo53386c());
        }
        if (ecVar.mo53387d() != null) {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, ecVar.mo53387d());
        }
        jSONObject.put("is_omid_compliant", egVar.mo53392e());
        jSONObject.put("omid_integration_version", 3);
        return jSONObject;
    }

    /* renamed from: b */
    private static JSONObject m22873b(C8190eg egVar) {
        JSONObject jSONObject = new JSONObject();
        if (egVar.mo53397j() != null) {
            jSONObject.put("is_child_under_coppa", egVar.mo53397j());
        }
        if (egVar.mo53398k() != null) {
            jSONObject.put("is_under_age_of_gdpr_consent", egVar.mo53398k());
        }
        jSONObject.put("consent_token", egVar.mo53400m());
        return jSONObject;
    }

    /* renamed from: c */
    private static JSONObject m22875c(C8190eg egVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", egVar.mo53401n());
        return jSONObject;
    }

    /* renamed from: d */
    private static JSONObject m22876d(C8190eg egVar) {
        JSONObject jSONObject = new JSONObject();
        CharSequence l = egVar.mo53399l();
        if (!(l == null || l.length() == 0)) {
            jSONObject.put("ad_content_threshold", egVar.mo53399l());
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m22872a(C8203es esVar, float f) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", esVar.mo53430a());
        jSONObject2.put("height", esVar.mo53431b());
        jSONObject2.put("scaler", Float.valueOf(f));
        jSONObject.put("overlay_max_size", jSONObject2);
        return jSONObject;
    }
}
