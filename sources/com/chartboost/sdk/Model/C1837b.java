package com.chartboost.sdk.Model;

import com.chartboost.sdk.Libraries.C1825e;
import com.chartboost.sdk.Libraries.CBLogging;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Model.b */
public class C1837b {

    /* renamed from: a */
    public final String f4441a;

    /* renamed from: b */
    public final String f4442b;

    /* renamed from: c */
    public final String f4443c;

    public C1837b(String str, String str2, String str3) {
        this.f4441a = str;
        this.f4442b = str2;
        this.f4443c = str3;
    }

    /* renamed from: a */
    private static Map<String, C1837b> m4066a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            CBLogging.m3991a("Asset", "deserializeAssets assetsJson is null");
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next2);
                hashMap.put(next2, new C1837b(next, jSONObject3.getString("filename"), jSONObject3.getString("url")));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static Map<String, C1837b> m4070b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("videos");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("id");
                    hashMap.put(string, new C1837b("videos", string, jSONObject2.getString("video")));
                } catch (JSONException e) {
                    CBLogging.m3993b("Asset", "deserializeNativeVideos (file): " + e.toString());
                }
            }
        } catch (JSONException e2) {
            CBLogging.m3993b("Asset", "deserializeNativeVideos (videos array): " + e2.toString());
        }
        return hashMap;
    }

    /* renamed from: a */
    private static JSONObject m4069a(JSONArray jSONArray) throws JSONException {
        JSONObject a = C1825e.m4025a(new C1825e.C1826a[0]);
        if (jSONArray == null) {
            return a;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString("type");
            String optString3 = jSONObject.optString("value");
            String optString4 = jSONObject.optString("param");
            if (!"param".equals(optString2) && optString4.isEmpty()) {
                JSONObject optJSONObject = a.optJSONObject(optString2);
                if (optJSONObject == null) {
                    optJSONObject = C1825e.m4025a(new C1825e.C1826a[0]);
                    a.put(optString2, optJSONObject);
                }
                optJSONObject.put(TJAdUnitConstants.String.HTML.equals(optString2) ? "body" : optString, C1825e.m4025a(C1825e.m4023a("filename", (Object) optString), C1825e.m4023a("url", (Object) optString3)));
            }
        }
        return a;
    }

    /* renamed from: b */
    public static Map<String, C1837b> m4071b(JSONObject jSONObject, int i) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("cache_assets");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("templates".equals(next)) {
                    hashMap.putAll(m4067a(jSONObject2, i));
                } else {
                    hashMap.putAll(m4068a(jSONObject2, next));
                }
            }
        } catch (JSONException e) {
            CBLogging.m3993b("Asset", "v2PrefetchToAssets: " + e.toString());
        }
        return hashMap;
    }

    /* renamed from: a */
    private static Map<String, C1837b> m4067a(JSONObject jSONObject, int i) throws JSONException {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("templates")) == null)) {
            int min = Math.min(i, optJSONArray.length());
            for (int i2 = 0; i2 < min; i2++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                JSONObject jSONObject3 = null;
                if (jSONObject2 != null) {
                    jSONObject3 = m4069a(jSONObject2.getJSONArray(MessengerShareContentUtility.ELEMENTS));
                }
                for (Map.Entry<String, C1837b> value : m4066a(jSONObject3).entrySet()) {
                    C1837b bVar = (C1837b) value.getValue();
                    hashMap.put(bVar.f4442b, bVar);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static Map<String, C1837b> m4068a(JSONObject jSONObject, String str) throws JSONException {
        HashMap hashMap = new HashMap();
        if (!(jSONObject == null || str == null)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("name");
                hashMap.put(string, new C1837b(str, string, jSONObject2.getString("value")));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public File mo14265a(File file) {
        if (this.f4441a == null || this.f4442b == null) {
            CBLogging.m3991a("Asset", "Cannot create file. Directory or filename is null.");
        } else {
            String str = this.f4441a + "/" + this.f4442b;
            try {
                return new File(file, str);
            } catch (Exception e) {
                CBLogging.m3991a("Asset", "Cannot create file for path: " + str + ". Error: " + e.toString());
            }
        }
        return null;
    }
}
