package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1370d;
import com.applovin.impl.sdk.p025b.C1371e;
import com.tapjoy.TapjoyConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.utils.h */
public class C1520h {

    /* renamed from: a */
    private static final int[] f3707a = {7, 4, 2, 1, 11};

    /* renamed from: b */
    private static final int[] f3708b = {5, 6, 10, 3, 9, 8, 14};

    /* renamed from: c */
    private static final int[] f3709c = {15, 12, 13};

    /* renamed from: a */
    public static String m3437a(InputStream inputStream, C1469j jVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) jVar.mo13088a(C1369c.f3065dy)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    public static String m3438a(String str, C1469j jVar) {
        return m3439a((String) jVar.mo13088a(C1369c.f2870aM), str, jVar);
    }

    /* renamed from: a */
    public static String m3439a(String str, String str2, C1469j jVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        } else if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        } else if (jVar != null) {
            return str + str2;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    public static JSONObject m3440a(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    /* renamed from: a */
    public static void m3441a(int i, C1469j jVar) {
        StringBuilder sb;
        String str;
        C1370d C = jVar.mo13064C();
        if (i == 401) {
            C.mo12844a((C1369c<?>) C1369c.f2851U, (Object) "");
            C.mo12844a((C1369c<?>) C1369c.f2852V, (Object) "");
            C.mo12847b();
            sb = new StringBuilder();
            sb.append("SDK key \"");
            sb.append(jVar.mo13136t());
            str = "\" is rejected by AppLovin. Please make sure the SDK key is correct.";
        } else if (i == 418) {
            C.mo12844a((C1369c<?>) C1369c.f2850T, (Object) true);
            C.mo12847b();
            sb = new StringBuilder();
            sb.append("SDK key \"");
            sb.append(jVar.mo13136t());
            str = "\" has been blocked. Please contact AppLovin support at support@applovin.com.";
        } else if ((i >= 400 && i < 500) || i == -1) {
            jVar.mo13123g();
            return;
        } else {
            return;
        }
        sb.append(str);
        C1505q.m3345i("AppLovinSdk", sb.toString());
    }

    /* renamed from: a */
    public static void m3442a(JSONObject jSONObject, boolean z, C1469j jVar) {
        jVar.mo13105ab().mo13047a(jSONObject, z);
    }

    /* renamed from: a */
    public static boolean m3443a() {
        return m3446a((String) null);
    }

    /* renamed from: a */
    private static boolean m3444a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3445a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo b = m3447b(context);
        if (b != null) {
            return b.isConnected();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3446a(String str) {
        if (C1519g.m3434e()) {
            return (!C1519g.m3435f() || TextUtils.isEmpty(str)) ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return true;
    }

    /* renamed from: b */
    private static NetworkInfo m3447b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    /* renamed from: b */
    public static String m3448b(String str, C1469j jVar) {
        return m3439a((String) jVar.mo13088a(C1369c.f2871aN), str, jVar);
    }

    /* renamed from: c */
    public static void m3449c(JSONObject jSONObject, C1469j jVar) {
        String b = C1521i.m3487b(jSONObject, "persisted_data", (String) null, jVar);
        if (C1553o.m3554b(b)) {
            jVar.mo13095a(C1371e.f3174z, b);
            jVar.mo13139v().mo13279c("ConnectionUtils", "Updated persisted data");
        }
    }

    /* renamed from: d */
    public static void m3450d(JSONObject jSONObject, C1469j jVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (jVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    C1370d C = jVar.mo13064C();
                    if (!jSONObject.isNull("settings")) {
                        C.mo12845a(jSONObject.getJSONObject("settings"));
                        C.mo12847b();
                    }
                }
            } catch (JSONException e) {
                jVar.mo13139v().mo13278b("ConnectionUtils", "Unable to parse settings out of API response", e);
            }
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: e */
    public static Map<String, String> m3451e(C1469j jVar) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = (String) jVar.mo13088a(C1369c.f2852V);
        if (C1553o.m3554b(str2)) {
            str = "device_token";
        } else {
            if (!((Boolean) jVar.mo13088a(C1369c.f3081eO)).booleanValue()) {
                str2 = jVar.mo13136t();
                str = TapjoyConstants.TJC_API_KEY;
            }
            hashMap.put("sc", C1553o.m3557e((String) jVar.mo13088a(C1369c.f2855Y)));
            hashMap.put("sc2", C1553o.m3557e((String) jVar.mo13088a(C1369c.f2856Z)));
            hashMap.put("sc3", C1553o.m3557e((String) jVar.mo13088a(C1369c.f2884aa)));
            hashMap.put("server_installed_at", C1553o.m3557e((String) jVar.mo13088a(C1369c.f2885ab)));
            C1557r.m3602a("persisted_data", C1553o.m3557e((String) jVar.mo13089a(C1371e.f3174z)), (Map<String, String>) hashMap);
            return hashMap;
        }
        hashMap.put(str, str2);
        hashMap.put("sc", C1553o.m3557e((String) jVar.mo13088a(C1369c.f2855Y)));
        hashMap.put("sc2", C1553o.m3557e((String) jVar.mo13088a(C1369c.f2856Z)));
        hashMap.put("sc3", C1553o.m3557e((String) jVar.mo13088a(C1369c.f2884aa)));
        hashMap.put("server_installed_at", C1553o.m3557e((String) jVar.mo13088a(C1369c.f2885ab)));
        C1557r.m3602a("persisted_data", C1553o.m3557e((String) jVar.mo13089a(C1371e.f3174z)), (Map<String, String>) hashMap);
        return hashMap;
    }

    /* renamed from: e */
    public static void m3452e(JSONObject jSONObject, C1469j jVar) {
        JSONArray b = C1521i.m3491b(jSONObject, "zones", (JSONArray) null, jVar);
        if (b != null && b.length() > 0) {
            jVar.mo13082V().mo12730a(b);
        }
    }

    /* renamed from: f */
    public static String m3453f(C1469j jVar) {
        NetworkInfo b = m3447b(jVar.mo13065D());
        if (b == null) {
            return "unknown";
        }
        int type = b.getType();
        int subtype = b.getSubtype();
        return type == 1 ? TapjoyConstants.TJC_CONNECTION_TYPE_WIFI : type == 0 ? m3444a(subtype, f3707a) ? "2g" : m3444a(subtype, f3708b) ? "3g" : m3444a(subtype, f3709c) ? "4g" : TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE : "unknown";
    }

    /* renamed from: f */
    public static void m3454f(JSONObject jSONObject, C1469j jVar) {
        JSONArray b = C1521i.m3491b(jSONObject, "zones", (JSONArray) null, jVar);
        if (b != null) {
            Iterator it = jVar.mo13082V().mo12732b(b).iterator();
            while (it.hasNext()) {
                C1349d dVar = (C1349d) it.next();
                if (dVar.mo12717e()) {
                    jVar.mo13132p().preloadAds(dVar);
                } else {
                    jVar.mo13131o().preloadAds(dVar);
                }
            }
            jVar.mo13079S().mo12868a((LinkedHashSet) jVar.mo13082V().mo12726a());
            jVar.mo13080T().mo12868a((LinkedHashSet) jVar.mo13082V().mo12726a());
        }
    }

    /* renamed from: g */
    public static String m3455g(C1469j jVar) {
        return m3439a((String) jVar.mo13088a(C1369c.f2868aK), "4.0/ad", jVar);
    }

    /* renamed from: g */
    public static void m3456g(JSONObject jSONObject, C1469j jVar) {
        JSONObject b = C1521i.m3492b(jSONObject, "variables", (JSONObject) null, jVar);
        if (b != null) {
            jVar.mo13135s().updateVariables(b);
        }
    }

    /* renamed from: h */
    public static String m3457h(C1469j jVar) {
        return m3439a((String) jVar.mo13088a(C1369c.f2869aL), "4.0/ad", jVar);
    }

    /* renamed from: i */
    public static String m3458i(C1469j jVar) {
        return m3439a((String) jVar.mo13088a(C1369c.f2874aQ), "1.0/variable_config", jVar);
    }

    /* renamed from: j */
    public static String m3459j(C1469j jVar) {
        return m3439a((String) jVar.mo13088a(C1369c.f2875aR), "1.0/variable_config", jVar);
    }
}
