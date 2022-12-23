package com.ogury.p245ed.internal;

import com.facebook.internal.NativeProtocol;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p245ed.internal.C8193ej;
import com.p243my.tracker.ads.AdFormat;
import com.smaato.sdk.video.vast.model.C8937Ad;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import p269io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.ee */
public final class C8188ee {

    /* renamed from: a */
    public static final C8188ee f21207a = new C8188ee();

    /* renamed from: b */
    private static C8163do f21208b = new C8163do();

    private C8188ee() {
    }

    /* renamed from: a */
    private static void m22867a(String str) {
        C8467mq.m23881b(str, "message");
        OguryIntegrationLogger.m22105e(str);
    }

    /* renamed from: a */
    public static C8192ei m22861a(String str, C8193ej ejVar, C8203es esVar) throws C8201eq {
        String str2;
        String str3;
        String str4;
        JSONArray jSONArray;
        String str5;
        String str6;
        String optString;
        C8467mq.m23881b(str, "adStringResponse");
        C8467mq.m23881b(ejVar, C8937Ad.AD_TYPE);
        JSONObject jSONObject = new JSONObject(str);
        C8163do.m22748a(jSONObject);
        List arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("ad");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        int length = optJSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                C8185eb ebVar = new C8185eb();
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                JSONObject optJSONObject = jSONObject2.optJSONObject("format");
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("ad_track_urls");
                String optString2 = jSONObject2.optString("ad_content");
                C8467mq.m23878a((Object) optString2, "adJson.optString(\"ad_content\")");
                ebVar.mo53342c(optString2);
                String optString3 = jSONObject2.optString(CampaignEx.JSON_KEY_IMPRESSION_URL);
                C8467mq.m23878a((Object) optString3, "adJson.optString(\"impression_url\")");
                ebVar.mo53348e(optString3);
                String optString4 = jSONObject2.optString("id");
                C8467mq.m23878a((Object) optString4, "adJson.optString(\"id\")");
                ebVar.mo53339b(optString4);
                JSONObject optJSONObject3 = jSONObject2.optJSONObject(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER);
                String str7 = "";
                if (optJSONObject3 == null || (str2 = optJSONObject3.optString("id")) == null) {
                    str2 = str7;
                }
                ebVar.mo53351f(str2);
                String optString5 = jSONObject2.optString("campaign_id");
                C8467mq.m23878a((Object) optString5, "adJson.optString(\"campaign_id\")");
                ebVar.mo53354g(optString5);
                if (optJSONObject == null || (str3 = optJSONObject.optString("webview_base_url")) == null) {
                    str3 = str7;
                }
                ebVar.mo53356h(str3);
                if (optJSONObject == null || (str4 = optJSONObject.optString("mraid_download_url")) == null) {
                    str4 = str7;
                }
                ebVar.mo53362k(str4);
                ebVar.mo53340b(jSONObject2.optBoolean(CampaignEx.KEY_OMID, false));
                ebVar.mo53343c(jSONObject2.optBoolean("is_video", false));
                ebVar.mo53335a(m22864a(jSONObject2.optJSONObject("overlay"), esVar));
                ebVar.mo53332a(m22862a(jSONObject2.optJSONObject("ad_unit"), jSONObject2.optString("id")));
                C8467mq.m23878a((Object) jSONObject2, "adJson");
                ebVar.mo53345d(m22865a("orientation", jSONObject2));
                if (optJSONObject == null) {
                    jSONArray = null;
                } else {
                    jSONArray = optJSONObject.optJSONArray(NativeProtocol.WEB_DIALOG_PARAMS);
                }
                ebVar.mo53360j(m22866a(jSONArray));
                ebVar.mo53358i(m22868b(jSONObject2));
                ebVar.mo53337a(jSONObject2.optBoolean("has_transparency", false));
                String optString6 = jSONObject2.optString("sdk_close_button_url", str7);
                C8467mq.m23878a((Object) optString6, "adJson.optString(\"sdk_close_button_url\", \"\")");
                ebVar.mo53364l(optString6);
                String optString7 = jSONObject2.optString("landing_page_prefetch_url", str7);
                C8467mq.m23878a((Object) optString7, "adJson.optString(\"landing_page_prefetch_url\", \"\")");
                ebVar.mo53366m(optString7);
                ebVar.mo53346d(jSONObject2.optBoolean("landing_page_disable_javascript", false));
                String optString8 = jSONObject2.optString("landing_page_prefetch_whitelist", str7);
                C8467mq.m23878a((Object) optString8, "adJson.optString(\"landin…_prefetch_whitelist\", \"\")");
                ebVar.mo53367n(optString8);
                ebVar.mo53352f(jSONObject2.optBoolean("ad_keep_alive", false));
                ebVar.mo53336a(C8467mq.m23873a(UUID.randomUUID().toString(), (Object) ebVar.mo53353g()));
                ebVar.mo53349e(!jSONObject2.has("overlay") && !jSONObject2.has(AdFormat.BANNER));
                ebVar.mo53331a(ejVar);
                if (C8467mq.m23880a((Object) ebVar.mo53365m().mo53412c(), (Object) ejVar.mo53403a())) {
                    arrayList.add(ebVar);
                } else {
                    C8193ej.C8194a aVar = C8193ej.f21217a;
                    String a = C8193ej.C8194a.m22912a(ebVar.mo53365m().mo53412c());
                    m22867a("[Ads][" + ejVar.mo53404b() + "][load][" + ebVar.mo53365m().mo53408a() + "] Wrong ad unit id type. Expected ad unit id of type " + ejVar.mo53404b() + ", but received ad unit id of type " + a + '.');
                }
                if (optJSONObject2 == null || (str5 = optJSONObject2.optString("ad_track_url")) == null) {
                    str5 = str7;
                }
                ebVar.mo53369o(str5);
                if (optJSONObject2 == null || (str6 = optJSONObject2.optString("ad_precache_url")) == null) {
                    str6 = str7;
                }
                ebVar.mo53371p(str6);
                if (!(optJSONObject2 == null || (optString = optJSONObject2.optString("ad_history_url")) == null)) {
                    str7 = optString;
                }
                ebVar.mo53374q(str7);
                ebVar.mo53333a(m22863a(jSONObject2.optJSONObject(AdFormat.BANNER)));
                ebVar.mo53334a(m22869c(jSONObject2));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return new C8192ei(arrayList);
    }

    /* renamed from: a */
    private static C8195ek m22862a(JSONObject jSONObject, String str) {
        C8195ek ekVar = new C8195ek();
        if (jSONObject == null) {
            return ekVar;
        }
        String optString = jSONObject.optString("id");
        String str2 = "";
        if (optString == null) {
            optString = str2;
        }
        ekVar.mo53409a(optString);
        if (str == null) {
            str = str2;
        }
        ekVar.mo53411b(str);
        String optString2 = jSONObject.optString("type");
        if (optString2 == null) {
            optString2 = str2;
        }
        ekVar.mo53413c(optString2);
        if (C8467mq.m23880a((Object) ekVar.mo53412c(), (Object) "optin_video")) {
            String optString3 = jSONObject.optString("app_user_id");
            if (optString3 == null) {
                optString3 = str2;
            }
            ekVar.mo53417e(optString3);
            String optString4 = jSONObject.optString("reward_launch");
            if (optString4 == null) {
                optString4 = str2;
            }
            ekVar.mo53415d(optString4);
            RewardItem e = ekVar.mo53416e();
            String optString5 = jSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME);
            if (optString5 == null) {
                optString5 = str2;
            }
            e.setName(optString5);
            RewardItem e2 = ekVar.mo53416e();
            String optString6 = jSONObject.optString("reward_value");
            if (optString6 != null) {
                str2 = optString6;
            }
            e2.setValue(str2);
        }
        return ekVar;
    }

    /* renamed from: a */
    private static C8197em m22863a(JSONObject jSONObject) {
        C8197em emVar = new C8197em();
        if (jSONObject == null) {
            return new C8197em();
        }
        emVar.mo53419a(jSONObject.optBoolean("full_width", false));
        emVar.mo53421b(jSONObject.optBoolean("auto_refresh", false));
        emVar.mo53418a(jSONObject.optInt("auto_refresh_rate", 0));
        return emVar;
    }

    /* renamed from: b */
    private static String m22868b(JSONObject jSONObject) {
        String str = "";
        String optString = jSONObject.optString("client_tracker_pattern", str);
        if (!C8467mq.m23880a((Object) optString, (Object) "null")) {
            str = optString;
        }
        C8467mq.m23878a((Object) str, "clientTrackerPattern");
        return str;
    }

    /* renamed from: a */
    private static String m22866a(JSONArray jSONArray) {
        int i;
        JSONObject optJSONObject;
        String optString;
        if (jSONArray != null && jSONArray.length() - 1 >= 0) {
            while (true) {
                int i2 = i - 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (C8467mq.m23880a((Object) jSONObject.getString("name"), (Object) "zones")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("value");
                    if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null || (optString = optJSONObject.optString("name")) == null) {
                        return "";
                    }
                    return optString;
                } else if (i2 < 0) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    private static String m22865a(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(NativeProtocol.WEB_DIALOG_PARAMS);
        if (optJSONArray == null) {
            return "";
        }
        int i = 0;
        int length = optJSONArray.length();
        if (length > 0) {
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                if (C8467mq.m23880a((Object) jSONObject2.getString("name"), (Object) str)) {
                    String string = jSONObject2.getString("value");
                    C8467mq.m23878a((Object) string, "paramElement.getString(\"value\")");
                    return string;
                } else if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    private static C8204et m22864a(JSONObject jSONObject, C8203es esVar) {
        JSONObject jSONObject2;
        Integer num;
        C8204et etVar = new C8204et();
        if (esVar == null) {
            return etVar;
        }
        boolean z = true;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("draggable", true);
        }
        etVar.mo53433a(z);
        Integer num2 = null;
        if (jSONObject == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject.optJSONObject("initial_size");
        }
        if (jSONObject2 == null) {
            num = null;
        } else {
            num = Integer.valueOf(jSONObject2.optInt("width"));
        }
        etVar.mo53432a(C8258gi.m23195b(num == null ? esVar.mo53430a() : num.intValue()));
        if (jSONObject2 != null) {
            num2 = Integer.valueOf(jSONObject2.getInt("height"));
        }
        etVar.mo53436b(C8258gi.m23195b(num2 == null ? esVar.mo53431b() : num2.intValue()));
        return etVar;
    }

    /* renamed from: c */
    private static C8198en m22869c(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("is_impression", false);
        String optString = jSONObject.optString("impression_source", "");
        C8200ep epVar = C8200ep.f21240a;
        C8467mq.m23878a((Object) optString, "impressionSourceString");
        return new C8198en(optBoolean, C8200ep.m22932a(optString));
    }
}
