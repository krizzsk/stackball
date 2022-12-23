package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

public final class ji1 {

    /* renamed from: a */
    private final boolean f35318a;

    /* renamed from: b */
    private final Float f35319b;

    /* renamed from: c */
    private final boolean f35320c;

    /* renamed from: d */
    private final q01 f35321d;

    private ji1(boolean z, Float f, boolean z2, q01 q01) {
        this.f35318a = z;
        this.f35319b = f;
        this.f35320c = z2;
        this.f35321d = q01;
    }

    /* renamed from: a */
    public static ji1 m37841a(float f, boolean z, q01 q01) {
        return new ji1(true, Float.valueOf(f), z, q01);
    }

    /* renamed from: a */
    public static ji1 m37842a(boolean z, q01 q01) {
        return new ji1(false, (Float) null, z, q01);
    }

    /* renamed from: a */
    public JSONObject mo68005a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f35318a);
            if (this.f35318a) {
                jSONObject.put("skipOffset", this.f35319b);
            }
            jSONObject.put("autoPlay", this.f35320c);
            jSONObject.put("position", this.f35321d);
        } catch (JSONException e) {
            mt1.m39732a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }
}
