package com.chartboost.sdk.Model;

import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Model.i */
public class C1847i {

    /* renamed from: a */
    private boolean f4550a;

    /* renamed from: b */
    private String f4551b;

    /* renamed from: c */
    private int f4552c;

    /* renamed from: d */
    private int f4553d;

    public C1847i(boolean z, String str, int i, int i2) {
        this.f4550a = z;
        this.f4551b = str;
        this.f4552c = i;
        this.f4553d = i2;
    }

    /* renamed from: a */
    public String mo14325a() {
        return this.f4551b;
    }

    /* renamed from: b */
    public int mo14326b() {
        return this.f4552c;
    }

    /* renamed from: c */
    public int mo14327c() {
        return this.f4553d;
    }

    /* renamed from: d */
    public boolean mo14328d() {
        return this.f4550a;
    }

    /* renamed from: a */
    public static C1847i m4164a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("tracking");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new C1847i(optJSONObject.optBoolean(TJAdUnitConstants.String.ENABLED, false), optJSONObject.optString("endpoint", "https://ssp-events.chartboost.com/track/sdk"), optJSONObject.optInt("eventLimit", 10), optJSONObject.optInt("windowDuration", 60));
    }
}
