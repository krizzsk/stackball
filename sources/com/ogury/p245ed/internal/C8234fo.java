package com.ogury.p245ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fo */
public final class C8234fo {

    /* renamed from: a */
    public static final C8234fo f21332a = new C8234fo();

    private C8234fo() {
    }

    /* renamed from: a */
    public static C8236fq m23117a(JSONObject jSONObject) {
        C8467mq.m23881b(jSONObject, "jsonObject");
        if (jSONObject.optBoolean("force")) {
            return C8225fg.f21297a;
        }
        if (C8254ge.m23188a(jSONObject)) {
            return C8231fl.f21308a;
        }
        try {
            return m23122b(jSONObject);
        } catch (JSONException e) {
            C8129da daVar = C8129da.f21066a;
            C8129da.m22652a(e);
            return C8231fl.f21308a;
        }
    }

    /* renamed from: b */
    private static C8232fm m23122b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        C8232fm fmVar = new C8232fm();
        JSONObject optJSONObject = jSONObject.optJSONObject("profig");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        m23121a(optJSONObject, fmVar);
        fmVar.mo53524a(C8254ge.m23185a(optJSONObject.optJSONObject("max_per_day"), "profig", 10));
        fmVar.mo53533c(C8235fp.m23125a(C8254ge.m23185a(optJSONObject.optJSONObject("timeout"), CampaignUnit.JSON_KEY_ADS, 3)));
        fmVar.mo53526a(C8254ge.m23187a(optJSONObject.optJSONObject("logs"), "crash_report", ""));
        fmVar.mo53538d(C8254ge.m23185a(optJSONObject, "adsync_permissions", 0));
        fmVar.mo53542e(C8254ge.m23185a(optJSONObject, "trackers_permissions", 0));
        fmVar.mo53546f(C8254ge.m23185a(optJSONObject, "children_whitelist", 0));
        m23123b(optJSONObject, fmVar);
        m23124c(optJSONObject, fmVar);
        m23120a(optJSONObject, fmVar.mo53555n(), fmVar.mo53556o());
        m23119a(optJSONObject, fmVar.mo53557p());
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("cache");
        if (optJSONObject2 == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = optJSONObject2.optJSONObject("ads_to_precache");
        }
        fmVar.mo53529b(C8254ge.m23185a(jSONObject2, "max", -1));
        fmVar.mo53539d(C8235fp.m23126a(C8254ge.m23186a(optJSONObject2, "ad_expiration", 14400)));
        return fmVar;
    }

    /* renamed from: a */
    private static void m23121a(JSONObject jSONObject, C8232fm fmVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("timing_finder");
        fmVar.mo53530b(C8235fp.m23126a(C8254ge.m23186a(optJSONObject, "profig", 43200)));
        fmVar.mo53525a(C8235fp.m23126a(C8254ge.m23186a(optJSONObject, "no_internet_retry", 7200)));
        fmVar.mo53543e(C8235fp.m23126a(C8254ge.m23186a(optJSONObject, "show_close_button", 2)));
    }

    /* renamed from: b */
    private static void m23123b(JSONObject jSONObject, C8232fm fmVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("webview");
        fmVar.mo53544e(C8254ge.m23189a(optJSONObject, "back_button_enabled", false));
        fmVar.mo53547f(C8254ge.m23189a(optJSONObject, "close_ad_when_leaving_app", true));
        fmVar.mo53534c(C8235fp.m23126a(C8254ge.m23186a(optJSONObject, "webview_load_timeout", 80)));
    }

    /* renamed from: c */
    private static void m23124c(JSONObject jSONObject, C8232fm fmVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.ENABLED);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        String jSONArray = optJSONArray.toString();
        C8467mq.m23878a((Object) jSONArray, "enabledArray.toString()");
        CharSequence charSequence = jSONArray;
        fmVar.mo53527a(C8516oc.m23969b(charSequence, (CharSequence) "profig"));
        fmVar.mo53531b(C8516oc.m23969b(charSequence, (CharSequence) CampaignUnit.JSON_KEY_ADS));
        fmVar.mo53535c(C8516oc.m23969b(charSequence, (CharSequence) "launch"));
        fmVar.mo53540d(C8516oc.m23969b(charSequence, (CharSequence) CampaignEx.KEY_OMID));
    }

    /* renamed from: a */
    private static void m23120a(JSONObject jSONObject, C8226fh fhVar, C8228fj fjVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("overlay_config");
        if (optJSONObject != null) {
            fhVar.mo53492a(optJSONObject.optBoolean("multiactivity_enabled", fhVar.mo53493a()));
            m23118a((C8227fi) fhVar, optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("overlay_fragment_config");
        if (optJSONObject2 != null) {
            fjVar.mo53504a(optJSONObject2.optBoolean("fragment_filter_enabled", fjVar.mo53505a()));
            m23118a((C8227fi) fjVar, optJSONObject2);
        }
    }

    /* renamed from: a */
    private static void m23119a(JSONObject jSONObject, C8205eu euVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("overlay_defaults");
        if (optJSONObject != null) {
            euVar.mo53439a(optJSONObject.optInt("gravity", euVar.mo53438a()));
            euVar.mo53441b(optJSONObject.optInt("x_margin", euVar.mo53440b()));
            euVar.mo53443c(optJSONObject.optInt("y_margin", euVar.mo53442c()));
            euVar.mo53445d(optJSONObject.optInt("max_width", euVar.mo53444d()));
            euVar.mo53447e(optJSONObject.optInt("max_height", euVar.mo53446e()));
        }
    }

    /* renamed from: a */
    private static void m23118a(C8227fi fiVar, JSONObject jSONObject) {
        fiVar.mo53496b(jSONObject.optBoolean("default_whitelist_enabled", fiVar.mo53497b()));
        fiVar.mo53500d(jSONObject.optBoolean("publisher_blacklist_enabled", fiVar.mo53501d()));
        fiVar.mo53498c(jSONObject.optBoolean("publisher_whitelist_enabled", fiVar.mo53499c()));
        fiVar.mo53494a(C8253gd.m23184a(jSONObject.optJSONArray("whitelist")));
        fiVar.mo53495b(C8253gd.m23184a(jSONObject.optJSONArray("blacklist")));
    }

    /* renamed from: a */
    public static C8232fm m23116a(String str) {
        C8467mq.m23881b(str, "profigFullResponse");
        try {
            if (!(str.length() > 0) || C8467mq.m23880a((Object) str, (Object) "{}")) {
                return null;
            }
            return m23122b(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }
}
