package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class qe0 {

    /* renamed from: a */
    private final pe0 f39093a = new pe0();

    qe0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<oe0> mo69584a(JSONObject jSONObject) throws JSONException, xr0 {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("installedPackages");
        if (optJSONArray != null) {
            int i = 0;
            while (i < optJSONArray.length()) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                this.f39093a.getClass();
                if (gt0.m36700a(jSONObject2, "name")) {
                    String a = ft0.m36302a(jSONObject2, "name");
                    int i2 = C13278h5.f34274b;
                    int optInt = jSONObject2.optInt("minVersion", 0);
                    if (optInt < 0) {
                        optInt = 0;
                    }
                    int i3 = Integer.MAX_VALUE;
                    int optInt2 = jSONObject2.optInt("maxVersion", Integer.MAX_VALUE);
                    if (optInt2 >= 0) {
                        i3 = optInt2;
                    }
                    arrayList.add(new oe0(a, optInt, i3));
                    i++;
                } else {
                    throw new xr0("Native Ad json has not required attributes");
                }
            }
        }
        return arrayList;
    }
}
