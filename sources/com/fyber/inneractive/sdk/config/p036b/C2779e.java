package com.fyber.inneractive.sdk.config.p036b;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Track;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.b.e */
public final class C2779e {

    /* renamed from: a */
    public Set<Track> f6542a = null;

    /* renamed from: a */
    public static C2779e m6050a(JSONObject jSONObject) {
        Track fromValue;
        C2779e eVar = null;
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("track");
        if (optJSONArray != null) {
            eVar = new C2779e();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString) && (fromValue = Track.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            eVar.f6542a = linkedHashSet;
        }
        return eVar;
    }
}
