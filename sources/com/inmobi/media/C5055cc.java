package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cc */
/* compiled from: ExpandProperties */
public class C5055cc {

    /* renamed from: d */
    private static final String f11554d = C5055cc.class.getSimpleName();

    /* renamed from: a */
    public boolean f11555a = false;

    /* renamed from: b */
    public boolean f11556b;

    /* renamed from: c */
    public String f11557c;

    /* renamed from: e */
    private boolean f11558e = true;

    public C5055cc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", C5343hf.m12333a().f12240a);
            jSONObject.put("height", C5343hf.m12333a().f12241b);
            jSONObject.put("useCustomClose", this.f11555a);
            jSONObject.put("isModal", this.f11558e);
        } catch (JSONException unused) {
        }
        this.f11557c = jSONObject.toString();
    }

    /* renamed from: a */
    public static C5055cc m11476a(String str) {
        C5055cc ccVar = new C5055cc();
        ccVar.f11557c = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            ccVar.f11558e = true;
            if (jSONObject.has("useCustomClose")) {
                ccVar.f11556b = true;
            }
            ccVar.f11555a = jSONObject.optBoolean("useCustomClose", false);
        } catch (JSONException unused) {
        }
        return ccVar;
    }
}
