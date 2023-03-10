package com.appsflyer;

import com.appsflyer.internal.C1740aa;
import org.json.JSONObject;

public class ServerConfigHandler {
    /* renamed from: ı */
    static JSONObject m3815(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            try {
                boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                if (!jSONObject2.optBoolean("monitor", false) || z) {
                    C1740aa.m3833().mo14063();
                    C1740aa.m3833().mo14058();
                } else {
                    C1740aa.m3833().mo14059();
                }
                if (!jSONObject2.has("ol_id")) {
                    return jSONObject2;
                }
                String optString = jSONObject2.optString("ol_scheme", (String) null);
                String optString2 = jSONObject2.optString("ol_domain", (String) null);
                String optString3 = jSONObject2.optString("ol_ver", (String) null);
                if (optString != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                }
                if (optString2 != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                }
                if (optString3 == null) {
                    return jSONObject2;
                }
                AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                return jSONObject2;
            } catch (Throwable th) {
                th = th;
                jSONObject = jSONObject2;
                AFLogger.afErrorLog(th.getMessage(), th);
                C1740aa.m3833().mo14063();
                C1740aa.m3833().mo14058();
                return jSONObject;
            }
        } catch (Throwable th2) {
            th = th2;
            AFLogger.afErrorLog(th.getMessage(), th);
            C1740aa.m3833().mo14063();
            C1740aa.m3833().mo14058();
            return jSONObject;
        }
    }

    public static String getUrl(String str) {
        return String.format(str, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AppsFlyerLibCore.getInstance().getHostName()});
    }
}
