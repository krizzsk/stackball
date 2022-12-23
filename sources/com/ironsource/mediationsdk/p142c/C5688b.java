package com.ironsource.mediationsdk.p142c;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C5723g;
import com.ironsource.mediationsdk.utils.C5789b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.c.b */
public class C5688b {

    /* renamed from: a */
    private String f13539a;

    /* renamed from: b */
    private String f13540b;

    /* renamed from: c */
    private C5723g f13541c;

    public C5688b(String str, String str2, C5723g gVar) {
        this.f13539a = str;
        this.f13540b = str2;
        this.f13541c = gVar;
    }

    /* renamed from: a */
    private static Object m13982a(Object obj) {
        return obj instanceof JSONObject ? m13984a((JSONObject) obj) : obj instanceof JSONArray ? m13983a((JSONArray) obj) : obj;
    }

    /* renamed from: a */
    private static List<Object> m13983a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(m13982a(jSONArray.get(i)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", new Object[]{e.getMessage()}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, Object> m13984a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, m13982a(jSONObject.get(next)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", new Object[]{next, e.getMessage()}));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m13985a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < 2; i++) {
            JSONObject jSONObject2 = jSONObjectArr[i];
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.get(next));
                    } catch (JSONException e) {
                        IronLog.INTERNAL.error(e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public String mo41830a() {
        return this.f13539a;
    }

    /* renamed from: b */
    public String mo41831b() {
        return this.f13540b;
    }

    /* renamed from: c */
    public boolean mo41832c() {
        return this.f13541c.f13742g.f13917e > 0;
    }

    /* renamed from: d */
    public long mo41833d() {
        return this.f13541c.f13742g.f13921i;
    }

    /* renamed from: e */
    public int mo41834e() {
        return this.f13541c.f13741f;
    }

    /* renamed from: f */
    public long mo41835f() {
        return this.f13541c.f13737b;
    }

    /* renamed from: g */
    public int mo41836g() {
        return this.f13541c.f13740e;
    }

    /* renamed from: h */
    public C5789b mo41837h() {
        return this.f13541c.f13742g;
    }
}
