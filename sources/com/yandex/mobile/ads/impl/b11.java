package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

class b11 {

    /* renamed from: a */
    private final a60 f31198a = new a60();

    /* renamed from: b */
    private final vg1 f31199b;

    b11(vg1 vg1) {
        this.f31199b = vg1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public z01 mo65938a(JSONObject jSONObject) throws JSONException, xr0 {
        HashMap hashMap;
        String a = ft0.m36302a(jSONObject, "package");
        String a2 = this.f31199b.mo70490a(jSONObject, "url");
        JSONObject optJSONObject = jSONObject.optJSONObject("extras");
        this.f31198a.getClass();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            if (keys.hasNext()) {
                hashMap = new HashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!optJSONObject.isNull(next)) {
                        hashMap.put(next, optJSONObject.get(next));
                    }
                }
                return new z01(a, a2, hashMap);
            }
        }
        hashMap = null;
        return new z01(a, a2, hashMap);
    }
}
