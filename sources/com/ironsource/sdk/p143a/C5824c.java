package com.ironsource.sdk.p143a;

import android.util.Base64;
import com.ironsource.p131a.C5490d;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.a.c */
public final class C5824c implements C5490d {
    /* renamed from: a */
    public final String mo41101a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", new Object[]{"data", Base64.encodeToString(new JSONObject().put("table", "supersonic.adunitanalytics.ad_unit_events").put("data", new JSONObject(map)).toString().getBytes(), 2)});
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
