package com.fyber.inneractive.sdk.config.p036b;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.b.j */
public final class C2784j {

    /* renamed from: a */
    public Integer f6570a;

    /* renamed from: b */
    public Integer f6571b;

    /* renamed from: c */
    public Set<Vendor> f6572c = null;

    /* renamed from: a */
    public static C2784j m6057a(JSONObject jSONObject) {
        Vendor fromValue;
        if (jSONObject == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(jSONObject.optInt("pausePct", Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("playPct", Integer.MIN_VALUE));
        C2784j jVar = new C2784j();
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        jVar.f6570a = valueOf;
        if (valueOf2.intValue() == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        jVar.f6571b = valueOf2;
        JSONArray optJSONArray = jSONObject.optJSONArray(Verification.VENDOR);
        if (optJSONArray != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i, (String) null);
                if (!TextUtils.isEmpty(optString) && (fromValue = Vendor.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            jVar.f6572c = linkedHashSet;
        }
        return jVar;
    }
}
