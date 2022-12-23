package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import com.google.common.net.HttpHeaders;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.x1 */
public class C2016x1 {

    /* renamed from: com.chartboost.sdk.impl.x1$a */
    interface C2017a {
        /* renamed from: a */
        void mo14799a(JSONObject jSONObject);
    }

    /* renamed from: a */
    public void mo14890a(String str, C2017a aVar) {
        if (m4925a(str)) {
            CBLogging.m3993b("Chartboost", "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("message", "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (aVar != null) {
                aVar.mo14799a(jSONObject);
            }
        }
    }

    /* renamed from: a */
    private boolean m4925a(String str) {
        return str != null && !str.isEmpty() && str.contains(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN) && str.contains("'null'");
    }
}
