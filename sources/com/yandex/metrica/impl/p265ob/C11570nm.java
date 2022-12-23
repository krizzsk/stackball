package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10893Wl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nm */
public class C11570nm extends C10893Wl {

    /* renamed from: h */
    public volatile String f27800h = null;

    /* renamed from: i */
    public volatile String f27801i = null;

    C11570nm(String str, String str2, C10893Wl.C10895b bVar, int i, boolean z) {
        super(str, str2, (C10893Wl.C10895b) null, i, z, C10893Wl.C10896c.VIEW, C10893Wl.C10894a.WEBVIEW);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONArray mo61246a(C10437Kl kl) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", "HTML");
            if (kl.f25072j) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("u", C10796U2.m27879a(this.f27800h, kl.f25077o));
                jSONObject2.putOpt("ou", C10796U2.m27879a(this.f27801i, kl.f25077o));
                if (jSONObject2.length() > 0) {
                    jSONObject.put("i", jSONObject2);
                }
            }
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo61247a() {
        return true;
    }

    public String toString() {
        return "WebViewElement{url='" + this.f27800h + '\'' + ", originalUrl='" + this.f27801i + '\'' + ", mClassName='" + this.f26178a + '\'' + ", mId='" + this.f26179b + '\'' + ", mParseFilterReason=" + this.f26180c + ", mDepth=" + this.f26181d + ", mListItem=" + this.f26182e + ", mViewType=" + this.f26183f + ", mClassType=" + this.f26184g + "} ";
    }
}
