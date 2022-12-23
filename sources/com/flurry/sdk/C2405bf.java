package com.flurry.sdk;

import android.text.TextUtils;
import com.facebook.unity.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.bf */
public class C2405bf implements C2587dw<C2334af> {

    /* renamed from: a */
    private static final String f5553a = C2405bf.class.getSimpleName();

    /* renamed from: a */
    public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
        return m5176b(inputStream);
    }

    /* renamed from: b */
    private static C2334af m5176b(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        String str = new String(C2619em.m5702a(inputStream));
        C2530db.m5474a(5, f5553a, "Proton response string: ".concat(str));
        C2334af afVar = new C2334af();
        try {
            JSONObject jSONObject = new JSONObject(str);
            afVar.f5360a = jSONObject.optLong("issued_at", -1);
            afVar.f5361b = jSONObject.optLong("refresh_ttl", 3600);
            afVar.f5362c = jSONObject.optLong("expiration_ttl", 86400);
            JSONObject optJSONObject = jSONObject.optJSONObject("global_settings");
            afVar.f5363d = new C2341am();
            if (optJSONObject != null) {
                afVar.f5363d.f5377a = m5173a(optJSONObject.optString("log_level"));
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("pulse");
            C2332ad adVar = new C2332ad();
            if (optJSONObject2 != null) {
                m5175a(adVar, optJSONObject2.optJSONArray("callbacks"));
                adVar.f5345b = optJSONObject2.optInt("max_callback_retries", 3);
                adVar.f5346c = optJSONObject2.optInt("max_callback_attempts_per_report", 15);
                adVar.f5347d = optJSONObject2.optInt("max_report_delay_seconds", 600);
                adVar.f5348e = optJSONObject2.optString("agent_report_url", "");
            }
            afVar.f5364e = adVar;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("analytics");
            afVar.f5365f = new C2344ap();
            if (optJSONObject3 != null) {
                afVar.f5365f.f5389b = optJSONObject3.optBoolean("analytics_enabled", true);
                afVar.f5365f.f5388a = optJSONObject3.optInt("max_session_properties", 10);
            }
            return afVar;
        } catch (JSONException e) {
            throw new IOException("Exception while deserialize: ", e);
        }
    }

    /* renamed from: a */
    private static C2342an m5173a(String str) {
        C2342an anVar = C2342an.OFF;
        try {
            return !TextUtils.isEmpty(str) ? (C2342an) Enum.valueOf(C2342an.class, str) : anVar;
        } catch (Exception unused) {
            return anVar;
        }
    }

    /* renamed from: a */
    private static void m5175a(C2332ad adVar, JSONArray jSONArray) throws JSONException {
        JSONObject optJSONObject;
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject2 = jSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    C2331ac acVar = new C2331ac();
                    acVar.f5335b = optJSONObject2.optString("partner", "");
                    m5174a(acVar, optJSONObject2.optJSONArray("events"));
                    acVar.f5337d = m5177b(optJSONObject2.optString("method"));
                    acVar.f5338e = optJSONObject2.optString("uri_template", "");
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("body_template");
                    if (optJSONObject3 != null) {
                        String optString = optJSONObject3.optString("string", "null");
                        if (!optString.equals("null")) {
                            acVar.f5339f = optString;
                        }
                    }
                    acVar.f5340g = optJSONObject2.optInt("max_redirects", 5);
                    acVar.f5341h = optJSONObject2.optInt("connect_timeout", 20);
                    acVar.f5342i = optJSONObject2.optInt("request_timeout", 20);
                    acVar.f5334a = optJSONObject2.optLong(Constants.CALLBACK_ID_KEY, -1);
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject("headers");
                    if (!(optJSONObject4 == null || (optJSONObject = optJSONObject4.optJSONObject("map")) == null)) {
                        acVar.f5343j = C2620en.m5710a(optJSONObject);
                    }
                    arrayList.add(acVar);
                }
            }
            adVar.f5344a = arrayList;
        }
    }

    /* renamed from: a */
    private static void m5174a(C2331ac acVar, JSONArray jSONArray) {
        String[] strArr;
        if (jSONArray != null) {
            ArrayList arrayList = null;
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    if (optJSONObject.has("string")) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        C2337ai aiVar = new C2337ai();
                        aiVar.f5369a = optJSONObject.optString("string", "");
                        arrayList.add(aiVar);
                    } else if (optJSONObject.has("com.flurry.proton.generated.avro.v2.EventParameterCallbackTrigger")) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("com.flurry.proton.generated.avro.v2.EventParameterCallbackTrigger");
                        if (optJSONObject2 != null) {
                            C2338aj ajVar = new C2338aj();
                            ajVar.f5369a = optJSONObject2.optString("event_name", "");
                            ajVar.f5371c = optJSONObject2.optString("event_parameter_name", "");
                            JSONArray optJSONArray = optJSONObject2.optJSONArray("event_parameter_values");
                            if (optJSONArray != null) {
                                strArr = new String[optJSONArray.length()];
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    strArr[i2] = optJSONArray.optString(i2, "");
                                }
                            } else {
                                strArr = new String[0];
                            }
                            ajVar.f5372d = strArr;
                            arrayList.add(ajVar);
                        }
                    }
                }
            }
            acVar.f5336c = arrayList;
        }
    }

    /* renamed from: b */
    private static C2401bc m5177b(String str) {
        C2401bc bcVar = C2401bc.GET;
        try {
            return !TextUtils.isEmpty(str) ? (C2401bc) Enum.valueOf(C2401bc.class, str) : bcVar;
        } catch (Exception unused) {
            return bcVar;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo17563a(OutputStream outputStream, Object obj) throws IOException {
        throw new IOException("Serialize not supported for response");
    }
}
