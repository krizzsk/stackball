package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.util.C3623ae;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.q */
public final class C2805q implements C3623ae.C3624a {

    /* renamed from: a */
    public Set<Track> f6638a = null;

    /* renamed from: c */
    public final JSONObject mo18060c() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set<Track> set = this.f6638a;
        if (set != null) {
            for (Track put : set) {
                jSONArray.put(put);
            }
        }
        C3623ae.m9046a(jSONObject, "track", jSONArray);
        return jSONObject;
    }
}
