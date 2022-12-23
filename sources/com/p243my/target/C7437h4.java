package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.h4 */
public class C7437h4 {

    /* renamed from: a */
    public final Context f18688a;

    /* renamed from: b */
    public final C7617q1 f18689b;

    /* renamed from: c */
    public final C7298a f18690c;

    /* renamed from: d */
    public String f18691d;

    /* renamed from: e */
    public boolean f18692e = true;

    public C7437h4(C7617q1 q1Var, C7298a aVar, Context context) {
        this.f18689b = q1Var;
        this.f18690c = aVar;
        this.f18688a = context;
    }

    /* renamed from: a */
    public static C7437h4 m19248a(C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7437h4(q1Var, aVar, context);
    }

    /* renamed from: a */
    public C7303a3 mo50290a(JSONObject jSONObject, String str, float f) {
        C7303a3 a = C7303a3.m18693a(str);
        if (jSONObject.has("pvalue")) {
            float optDouble = (float) jSONObject.optDouble("pvalue", (double) a.mo49574d());
            if (optDouble >= 0.0f && optDouble <= 100.0f) {
                if (f > 0.0f) {
                    a.mo49573b((optDouble * f) / 100.0f);
                } else {
                    a.mo49572a(optDouble);
                }
                return a;
            }
        }
        if (!jSONObject.has("value")) {
            return null;
        }
        float optDouble2 = (float) jSONObject.optDouble("value", (double) a.mo49575e());
        if (optDouble2 < 0.0f) {
            return null;
        }
        a.mo49573b(optDouble2);
        return a;
    }

    /* renamed from: a */
    public C7328b3 mo50069a(JSONObject jSONObject, float f) {
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            mo50293a("Required field", "failed to parse stat: no type or url");
            return null;
        }
        optString.hashCode();
        C7328b3 a = !optString.equals("playheadViewabilityValue") ? !optString.equals("playheadReachedValue") ? C7328b3.m18775a(optString, optString2) : mo50290a(jSONObject, optString2, f) : mo50294b(jSONObject, optString2, f);
        if (a != null) {
            a.mo49728a(jSONObject.optBoolean("needDecodeUrl", a.mo49730c()));
        }
        return a;
    }

    /* renamed from: a */
    public void mo50291a(C7343c3 c3Var, JSONObject jSONObject, String str, float f) {
        int length;
        C7328b3 a;
        c3Var.mo49802a(this.f18689b.mo51396h(), f);
        JSONArray optJSONArray = jSONObject.optJSONArray("statistics");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            this.f18691d = str;
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (a = mo50069a(optJSONObject, f)) == null)) {
                    c3Var.mo49801a(a);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo50292a(Boolean bool) {
        this.f18692e = bool.booleanValue();
    }

    /* renamed from: a */
    public void mo50293a(String str, String str2) {
        if (this.f18692e) {
            String str3 = this.f18689b.f19226a;
            C7498k3 c = C7498k3.m19572a(str).mo50704d(str2).mo50699a(this.f18690c.getSlotId()).mo50703c(this.f18691d);
            if (str3 == null) {
                str3 = this.f18689b.f19227b;
            }
            c.mo50701b(str3).mo50702b(this.f18688a);
        }
    }

    /* renamed from: b */
    public final C7328b3 mo50294b(JSONObject jSONObject, String str, float f) {
        String str2;
        int optInt = jSONObject.optInt("viewablePercent", -1);
        if (optInt < 0 || optInt > 100) {
            str2 = "failed to parse viewabilityStat: invalid viewable percent value";
        } else {
            if (jSONObject.has("ovv")) {
                C7769z2 a = C7769z2.m20975a(str, optInt);
                a.mo51981b(jSONObject.optBoolean("ovv", false));
                if (jSONObject.has("pvalue")) {
                    float optDouble = (float) jSONObject.optDouble("pvalue", (double) a.mo51982d());
                    if (optDouble >= 0.0f && optDouble <= 100.0f) {
                        if (f > 0.0f) {
                            a.mo51980b((optDouble * f) / 100.0f);
                        } else {
                            a.mo51979a(optDouble);
                        }
                        return a;
                    }
                }
                if (jSONObject.has("value")) {
                    float optDouble2 = (float) jSONObject.optDouble("value", (double) a.mo51983e());
                    if (optDouble2 >= 0.0f) {
                        a.mo51980b(optDouble2);
                        return a;
                    }
                }
            }
            float optDouble3 = (float) jSONObject.optDouble("duration", -1.0d);
            if (optDouble3 >= 0.0f) {
                return C7747y2.m20868a(str, optDouble3, optInt, jSONObject.optBoolean("mrc", true));
            }
            str2 = "failed to parse viewabilityStat: no ovv or wrong duration";
        }
        mo50293a("Bad value", str2);
        return null;
    }
}
