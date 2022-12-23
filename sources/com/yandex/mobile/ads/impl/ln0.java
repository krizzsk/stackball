package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.hn0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class ln0 {

    /* renamed from: a */
    private final qd0 f36761a = new qd0();

    ln0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public hn0 mo68493a(JSONObject jSONObject) {
        AdImpressionData adImpressionData;
        try {
            String b = gi0.m36620b(jSONObject, "adapter");
            Map<String, String> a = gi0.m36618a(jSONObject, "network_data");
            if (((HashMap) a).isEmpty()) {
                return null;
            }
            hn0.C13336b bVar = new hn0.C13336b(b, a);
            List<String> d = gi0.m36622d(jSONObject, "click_tracking_urls");
            List<String> d2 = gi0.m36622d(jSONObject, "impression_tracking_urls");
            bVar.mo67582b(d).mo67583c(d2).mo67579a(gi0.m36622d(jSONObject, "ad_response_tracking_urls")).mo67580a(gi0.m36623e(jSONObject, "bidding_info"));
            if (jSONObject.has("impression_data")) {
                this.f36761a.getClass();
                try {
                    adImpressionData = new AdImpressionData(ft0.m36302a(jSONObject, "impression_data"));
                } catch (Exception e) {
                    Log.e("ImpressionDataParser", e.getMessage());
                    adImpressionData = null;
                }
                bVar.mo67578a(adImpressionData);
            }
            return bVar.mo67581a();
        } catch (JSONException unused) {
            return null;
        }
    }
}
