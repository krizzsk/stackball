package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.base.model.MediationData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class gn0 implements i51<MediationData> {

    /* renamed from: a */
    private final hv0 f34053a = new hv0();

    /* renamed from: b */
    private final ln0 f34054b = new ln0();

    /* renamed from: b */
    public MediationData mo66870a(fv0 fv0) {
        String a = this.f34053a.mo67641a(fv0);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a);
            Map<String, String> a2 = gi0.m36618a(jSONObject, "passback_parameters");
            if (((HashMap) a2).isEmpty()) {
                return null;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("networks");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                hn0 a3 = this.f34054b.mo68493a(jSONArray.getJSONObject(i));
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            if (!arrayList.isEmpty()) {
                return new MediationData(arrayList, a2);
            }
            return null;
        } catch (JSONException e) {
            throw new JSONException(e.getMessage());
        } catch (JSONException unused) {
            return null;
        }
    }
}
