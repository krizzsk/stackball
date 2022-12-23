package com.inmobi.media;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ds */
/* compiled from: OmidNativeTracker */
public final class C5133ds extends C5030br {

    /* renamed from: i */
    private static final String f11784i = C5133ds.class.getSimpleName();

    /* renamed from: g */
    public final String f11785g;

    /* renamed from: h */
    public final String f11786h;

    public C5133ds(String str, String str2, String str3, String str4, Map<String, String> map) {
        super(str3, 0, str4, map);
        this.f11786h = str;
        this.f11785g = str2;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f11466a);
            jSONObject.put("url", this.f11467b);
            jSONObject.put("eventType", this.f11469d);
            jSONObject.put("eventId", this.f11468c);
            if (!TextUtils.isEmpty(this.f11786h)) {
                jSONObject.put("vendorKey", this.f11786h);
            }
            if (!TextUtils.isEmpty(this.f11785g)) {
                jSONObject.put("verificationParams", this.f11785g);
            }
            Map map = this.f11470e;
            if (map == null) {
                map = new HashMap();
            }
            jSONObject.put("extras", C5328gx.m12269a((Map<String, String>) map, ","));
            return jSONObject.toString();
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return "";
        }
    }
}
