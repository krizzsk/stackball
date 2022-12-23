package com.flurry.sdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.sdk.AppLovinEventTypes;
import com.appsflyer.ServerParameters;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.tapjoy.TapjoyConstants;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.q */
public class C2661q {

    /* renamed from: a */
    private static final String f6259a = C2661q.class.getSimpleName();

    /* renamed from: a */
    public static String m5793a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", System.currentTimeMillis() / 1000);
            jSONObject.put(TapjoyConstants.TJC_GUID, str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("APP");
            try {
                Class.forName("com.flurry.android.config.killswitch.KillSwitch");
                jSONArray.put("KILLSWITCH");
            } catch (ClassNotFoundException unused) {
            }
            jSONObject.put("documents", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(C2665t.m5807a() ? "com.flurry.configkey.prod.ec.1" : "com.flurry.configkey.prod.rot.6");
            jSONArray2.put("com.flurry.configkey.prod.fs.0");
            jSONObject.put("signatureKeys", jSONArray2);
            C2476cb a = C2476cb.m5335a();
            Context context = C2494ck.m5371a().f5832a;
            C2522d a2 = C2522d.m5445a();
            C2593e eVar = a2.f5907a;
            if (C2665t.m5809a(eVar.mo17797d())) {
                String str2 = null;
                if (eVar.f6067b != null) {
                    str2 = eVar.f6067b.getString("lastETag", (String) null);
                }
                if (str2 != null) {
                    jSONObject.put(DownloadModel.ETAG, str2);
                }
            }
            jSONObject.put("apiKey", C2494ck.m5371a().f5833b);
            jSONObject.put("appVersion", a.mo17667e());
            jSONObject.put("appBuild", Integer.toString(C2476cb.m5337b(context)));
            jSONObject.put("sdkVersion", C2495cl.m5382b());
            jSONObject.put("platform", 3);
            jSONObject.put("platformVersion", C2476cb.m5339c());
            JSONArray jSONArray3 = new JSONArray();
            for (Map.Entry next : Collections.unmodifiableMap(C2451bs.m5276a().f5716a).entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                byte[] bArr = (byte[]) next.getValue();
                jSONObject2.put("id", ((C2475ca) next.getKey()).f5790e ? new String(bArr) : Base64.encodeToString(bArr, 2));
                jSONObject2.put("type", ((C2475ca) next.getKey()).f5789d);
                jSONArray3.put(jSONObject2);
            }
            jSONObject.put("deviceIds", jSONArray3);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(ServerParameters.BRAND, Build.BRAND);
            jSONObject3.put("device", Build.DEVICE);
            jSONObject3.put("id", Build.ID);
            jSONObject3.put(ServerParameters.MODEL, Build.MODEL);
            jSONObject3.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
            jSONObject3.put("version_release", Build.VERSION.RELEASE);
            jSONObject.put("deviceTags", jSONObject3);
            jSONObject.put("bundleId", C2615ej.m5682a(context));
            C2463bv.m5299a();
            jSONObject.put("locale", C2463bv.m5300b());
            String str3 = (String) C2611eg.m5674a().mo17819a("UserId");
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("publisherUserId", str3);
            }
            List<C2656l> f = a2.mo17742f();
            if (f != null && f.size() > 0) {
                JSONArray jSONArray4 = new JSONArray();
                for (C2656l next2 : f) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("id", next2.f6242b);
                    jSONObject4.put("version", next2.f6243c);
                    jSONArray4.put(jSONObject4);
                }
                jSONObject.put("currentVariants", jSONArray4);
            }
        } catch (JSONException e) {
            C2530db.m5477a(f6259a, "ParameterProvider error", (Throwable) e);
        }
        String jSONObject5 = jSONObject.toString();
        C2530db.m5476a(f6259a, "Request Parameters: ".concat(String.valueOf(jSONObject5)));
        return jSONObject5;
    }
}
