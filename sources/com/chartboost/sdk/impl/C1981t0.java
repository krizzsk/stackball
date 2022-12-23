package com.chartboost.sdk.impl;

import com.chartboost.sdk.Tracking.C1869b;
import com.chartboost.sdk.Tracking.C1877h;
import com.chartboost.sdk.Tracking.C1878i;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.t0 */
public class C1981t0 {
    /* renamed from: a */
    public String mo14797a(C1878i iVar, C1869b bVar) {
        String str;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        if (!(iVar == null || bVar == null)) {
            try {
                C1877h i = iVar.mo14473i();
                String str2 = "";
                if (i != null) {
                    str2 = i.mo14453b();
                    str = i.mo14452a();
                } else {
                    str = str2;
                }
                String a = iVar.mo14457a();
                if (a != null) {
                    a = a.toLowerCase();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("chartboost_sdk_autocache_enabled", bVar.mo14395c());
                jSONObject2.put("chartboost_sdk_gdpr", bVar.mo14399e());
                String d = bVar.mo14396d();
                if (d != null && d.length() > 0) {
                    jSONObject2.put("chartboost_sdk_ccpa", d);
                }
                jSONObject2.put("device_battery_level", bVar.mo14408h());
                jSONObject2.put("device_charging_status", bVar.mo14411i());
                jSONObject2.put("device_language", bVar.mo14418m());
                jSONObject2.put("device_timezone", bVar.mo14435u());
                jSONObject2.put("device_volume", bVar.mo14437w());
                jSONObject2.put("device_mute", bVar.mo14425p());
                jSONObject2.put("device_audio_output", bVar.mo14405g());
                jSONObject2.put("device_storage", bVar.mo14432t());
                jSONObject2.put("device_low_memory_warning", bVar.mo14420n());
                jSONObject2.put("device_up_time", bVar.mo14436v());
                String a2 = iVar.mo14457a();
                if (a2 != null && a2.length() > 0) {
                    char c = 65535;
                    int hashCode = a2.hashCode();
                    if (hashCode != -174936018) {
                        if (hashCode != 769047372) {
                            if (hashCode == 1982491468) {
                                if (a2.equals(IronSourceConstants.BANNER_AD_UNIT)) {
                                    c = 2;
                                }
                            }
                        } else if (a2.equals(IronSourceConstants.INTERSTITIAL_AD_UNIT)) {
                            c = 0;
                        }
                    } else if (a2.equals("Rewarded")) {
                        c = 1;
                    }
                    if (c == 0) {
                        jSONObject2.put("session_impression_count", bVar.mo14380I());
                    } else if (c == 1) {
                        jSONObject2.put("session_impression_count", bVar.mo14381J());
                    } else if (c == 2) {
                        jSONObject2.put("session_impression_count", bVar.mo14379H());
                    }
                }
                jSONObject2.put("session_duration", bVar.mo14377F());
                jSONObject.put("session_id", bVar.mo14378G());
                jSONObject.put("session_count", bVar.mo14376E());
                jSONObject.put("event_name", iVar.mo14470f());
                jSONObject.put("event_message", iVar.mo14469e());
                jSONObject.put("event_type", iVar.mo14474j().name());
                jSONObject.put("event_timestamp", iVar.mo14472h());
                jSONObject.put("event_latency", (double) iVar.mo14465c());
                jSONObject.put("ad_type", a);
                jSONObject.put("ad_impression_id", str2);
                jSONObject.put("ad_creative_id", str);
                jSONObject.put("app_id", bVar.mo14382a());
                jSONObject.put("chartboost_sdk_version", bVar.mo14402f());
                jSONObject.put("mediation_sdk", bVar.mo14373A());
                jSONObject.put("mediation_sdk_version", bVar.mo14375C());
                jSONObject.put("mediation_sdk_adapter_version", bVar.mo14374B());
                jSONObject.put("framework", bVar.mo14438x());
                jSONObject.put("framework_version", bVar.mo14440z());
                jSONObject.put("framework_adapter_version", bVar.mo14439y());
                jSONObject.put("device_id", bVar.mo14416l());
                jSONObject.put("device_model", bVar.mo14422o());
                jSONObject.put("device_os_version", bVar.mo14428r());
                jSONObject.put("device_platform", bVar.mo14430s());
                jSONObject.put("device_country", bVar.mo14414k());
                jSONObject.put("device_connection_type", bVar.mo14412j());
                jSONObject.put("device_orientation", bVar.mo14426q());
                jSONObject.put("payload", jSONObject2);
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }
}
