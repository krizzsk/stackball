package com.yandex.metrica.impl.p265ob;

import com.smaato.sdk.video.vast.model.CompanionAds;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Zb */
public final class C10988Zb {

    /* renamed from: a */
    private final String f26420a;

    /* renamed from: b */
    private final int f26421b;

    /* renamed from: c */
    private final boolean f26422c;

    public C10988Zb(JSONObject jSONObject) throws JSONException {
        this.f26420a = jSONObject.getString("name");
        this.f26422c = jSONObject.getBoolean(CompanionAds.REQUIRED);
        this.f26421b = jSONObject.optInt("version", -1);
    }

    /* renamed from: a */
    public JSONObject mo62573a() throws JSONException {
        JSONObject put = new JSONObject().put("name", this.f26420a).put(CompanionAds.REQUIRED, this.f26422c);
        int i = this.f26421b;
        if (i != -1) {
            put.put("version", i);
        }
        return put;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10988Zb.class != obj.getClass()) {
            return false;
        }
        C10988Zb zb = (C10988Zb) obj;
        if (this.f26421b != zb.f26421b || this.f26422c != zb.f26422c) {
            return false;
        }
        String str = this.f26420a;
        String str2 = zb.f26420a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f26420a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f26421b) * 31) + (this.f26422c ? 1 : 0);
    }

    public C10988Zb(String str, int i, boolean z) {
        this.f26420a = str;
        this.f26421b = i;
        this.f26422c = z;
    }
}
