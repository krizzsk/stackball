package com.mbridge.msdk.videocommon.p239d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.d.a */
/* compiled from: RewardSetting */
public class C7176a {

    /* renamed from: a */
    private Map<String, Integer> f17897a;

    /* renamed from: b */
    private Map<String, C7170c> f17898b;

    /* renamed from: c */
    private long f17899c;

    /* renamed from: d */
    private long f17900d;

    /* renamed from: e */
    private long f17901e;

    /* renamed from: f */
    private long f17902f;

    /* renamed from: g */
    private long f17903g;

    /* renamed from: h */
    private long f17904h;

    /* renamed from: i */
    private String f17905i;

    /* renamed from: j */
    private int f17906j = 0;

    /* renamed from: a */
    public final String mo49089a() {
        return this.f17905i;
    }

    /* renamed from: b */
    public final long mo49093b() {
        return this.f17899c * 1000;
    }

    /* renamed from: a */
    public final void mo49091a(long j) {
        this.f17899c = j;
    }

    /* renamed from: c */
    public final long mo49096c() {
        return this.f17900d * 1000;
    }

    /* renamed from: b */
    public final void mo49094b(long j) {
        this.f17900d = j;
    }

    /* renamed from: d */
    public final long mo49098d() {
        return this.f17901e * 1000;
    }

    /* renamed from: c */
    public final void mo49097c(long j) {
        this.f17901e = j;
    }

    /* renamed from: e */
    public final long mo49100e() {
        return this.f17902f;
    }

    /* renamed from: d */
    public final void mo49099d(long j) {
        this.f17902f = j;
    }

    /* renamed from: f */
    public final long mo49102f() {
        return this.f17903g;
    }

    /* renamed from: e */
    public final void mo49101e(long j) {
        this.f17903g = j;
    }

    /* renamed from: a */
    public final void mo49090a(int i) {
        this.f17906j = i;
    }

    /* renamed from: g */
    public final long mo49103g() {
        return this.f17904h;
    }

    /* renamed from: h */
    public final Map<String, Integer> mo49104h() {
        if (this.f17897a == null) {
            HashMap hashMap = new HashMap();
            this.f17897a = hashMap;
            hashMap.put("1", 1000);
            this.f17897a.put("9", 1000);
            this.f17897a.put("8", 1000);
        }
        return this.f17897a;
    }

    /* renamed from: a */
    public final void mo49092a(Map<String, Integer> map) {
        this.f17897a = map;
    }

    /* renamed from: i */
    public final Map<String, C7170c> mo49105i() {
        return this.f17898b;
    }

    /* renamed from: b */
    public final void mo49095b(Map<String, C7170c> map) {
        this.f17898b = map;
    }

    /* renamed from: a */
    public static C7176a m18116a(String str) {
        C7176a aVar;
        C7176a aVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                aVar = new C7176a();
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                return aVar2;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("caplist");
                aVar.f17905i = jSONObject.optString("ab_id", "");
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        int intValue = Integer.valueOf(optJSONObject.optInt(next, 1000)).intValue();
                        if (!TextUtils.isEmpty(next)) {
                            if (TextUtils.isEmpty(next) || intValue != 0) {
                                hashMap.put(next, Integer.valueOf(intValue));
                            } else {
                                hashMap.put(next, 1000);
                            }
                        }
                    }
                    aVar.f17897a = hashMap;
                }
                aVar.f17898b = C7170c.m18099a(jSONObject.optJSONArray("reward"));
                aVar.f17899c = jSONObject.optLong("getpf", 43200);
                aVar.f17900d = jSONObject.optLong("ruct", 5400);
                aVar.f17901e = jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600);
                aVar.f17902f = jSONObject.optLong("dlct", 3600);
                aVar.f17903g = jSONObject.optLong("vcct", 5);
                aVar.f17904h = jSONObject.optLong("current_time");
                return aVar;
            } catch (Exception e2) {
                e = e2;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }
        return aVar2;
    }

    /* renamed from: j */
    public final JSONObject mo49106j() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f17897a != null && this.f17897a.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry next : this.f17897a.entrySet()) {
                        jSONObject2.put((String) next.getKey(), ((Integer) next.getValue()).intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.f17898b != null && this.f17898b.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry next2 : this.f17898b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String str = (String) next2.getKey();
                        C7170c cVar = (C7170c) next2.getValue();
                        if (cVar != null) {
                            jSONObject3.put("name", cVar.mo49082a());
                            jSONObject3.put("amount", cVar.mo49085b());
                            jSONObject3.put("id", str);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f17899c);
            jSONObject.put("ruct", this.f17900d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f17901e);
            jSONObject.put("dlct", this.f17902f);
            jSONObject.put("vcct", this.f17903g);
            jSONObject.put("current_time", this.f17904h);
            jSONObject.put("isDefault", this.f17906j);
            return jSONObject;
        } catch (Exception e3) {
            e3.printStackTrace();
            return jSONObject;
        }
    }
}
