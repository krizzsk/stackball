package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.cc */
public class C12723cc {

    /* renamed from: a */
    private final ln0 f31884a = new ln0();

    /* renamed from: a */
    public AdUnitIdBiddingSettings mo66251a(JSONObject jSONObject) {
        String str;
        try {
            str = gi0.m36620b(jSONObject, "ad_unit_id");
        } catch (JSONException unused) {
            try {
                str = gi0.m36620b(jSONObject, "block_id");
            } catch (JSONException unused2) {
            }
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("networks");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                hn0 a = this.f31884a.mo68493a(optJSONArray.getJSONObject(i));
                if (a != null) {
                    arrayList.add(a);
                }
            }
            if (!arrayList.isEmpty()) {
                return new AdUnitIdBiddingSettings(str, arrayList, jSONObject.toString());
            }
        }
        return null;
    }

    /* renamed from: b */
    public BiddingSettings mo66252b(JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            if (optJSONArray == null) {
                optJSONArray = jSONObject.optJSONArray("block_id_settings");
            }
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    AdUnitIdBiddingSettings a = mo66251a(optJSONArray.getJSONObject(i));
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new BiddingSettings((List<AdUnitIdBiddingSettings>) arrayList);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }
}
