package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.q3 */
public class C7619q3 {

    /* renamed from: a */
    public final C7617q1 f19253a;

    /* renamed from: b */
    public final C7298a f19254b;

    /* renamed from: c */
    public final Context f19255c;

    /* renamed from: d */
    public final C7437h4 f19256d;

    public C7619q3(C7617q1 q1Var, C7298a aVar, Context context) {
        this.f19253a = q1Var;
        this.f19254b = aVar;
        this.f19255c = context;
        this.f19256d = C7437h4.m19248a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C7619q3 m20188a(C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7619q3(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final C7581o2 mo51419a(C7581o2 o2Var, JSONObject jSONObject) {
        return jSONObject == null ? o2Var : C7361d4.m18928a(this.f19254b, this.f19253a.f19227b, true, this.f19255c).mo49991a(o2Var, jSONObject);
    }

    /* renamed from: a */
    public C7617q1 mo51420a(JSONObject jSONObject) {
        C7328b3 a;
        int v = this.f19253a.mo51411v();
        Boolean bool = null;
        if (v >= 5) {
            C7374e0.m18989a("got additional data, but max redirects limit exceeded");
            return null;
        }
        int optInt = jSONObject.optInt("id", this.f19253a.mo51402m());
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            mo51421a("Required field", "No url in additionalData Id = " + optInt);
            return null;
        }
        C7617q1 b = C7617q1.m20130b(optString);
        b.mo51387d(v + 1);
        b.mo51374b(optInt);
        b.mo51378b(jSONObject.optBoolean("doAfter", b.mo51414y()));
        b.mo51365a(jSONObject.optInt("doOnEmptyResponseFromId", b.mo51401l()));
        b.mo51385c(jSONObject.optBoolean("isMidrollPoint", b.mo51415z()));
        float b2 = this.f19253a.mo51372b();
        if (b2 < 0.0f) {
            b2 = (float) jSONObject.optDouble("allowCloseDelay", (double) b.mo51372b());
        }
        b.mo51364a(b2);
        Boolean a2 = this.f19253a.mo51362a();
        if (a2 == null) {
            a2 = jSONObject.has("allowClose") ? Boolean.valueOf(jSONObject.optBoolean("allowClose")) : null;
        }
        b.mo51369a(a2);
        Boolean c = this.f19253a.mo51379c();
        if (c == null) {
            c = jSONObject.has("hasPause") ? Boolean.valueOf(jSONObject.optBoolean("hasPause")) : null;
        }
        b.mo51376b(c);
        Boolean e = this.f19253a.mo51390e();
        if (e == null) {
            e = jSONObject.has("allowSeek") ? Boolean.valueOf(jSONObject.optBoolean("allowSeek")) : null;
        }
        b.mo51388d(e);
        Boolean f = this.f19253a.mo51392f();
        if (f == null) {
            f = jSONObject.has("allowSkip") ? Boolean.valueOf(jSONObject.optBoolean("allowSkip")) : null;
        }
        b.mo51391e(f);
        Boolean g = this.f19253a.mo51394g();
        if (g == null) {
            g = jSONObject.has("allowTrackChange") ? Boolean.valueOf(jSONObject.optBoolean("allowTrackChange")) : null;
        }
        b.mo51393f(g);
        Boolean r = this.f19253a.mo51407r();
        if (r == null) {
            r = jSONObject.has("openInBrowser") ? Boolean.valueOf(jSONObject.optBoolean("openInBrowser")) : null;
        }
        b.mo51397h(r);
        Boolean k = this.f19253a.mo51400k();
        if (k == null) {
            k = jSONObject.has("directLink") ? Boolean.valueOf(jSONObject.optBoolean("directLink")) : null;
        }
        b.mo51395g(k);
        Boolean d = this.f19253a.mo51386d();
        if (d != null) {
            bool = d;
        } else if (jSONObject.has("allowReplay")) {
            bool = Boolean.valueOf(jSONObject.optBoolean("allowReplay"));
        }
        b.mo51382c(bool);
        float s = this.f19253a.mo51408s();
        if (s < 0.0f && jSONObject.has("point")) {
            s = (float) jSONObject.optDouble("point");
            if (s < 0.0f) {
                mo51421a("Bad value", "Wrong value " + -1.0f + " for point in additionalData object");
                s = -1.0f;
            }
        }
        b.mo51373b(s);
        float t = this.f19253a.mo51409t();
        if (t < 0.0f && jSONObject.has("pointP")) {
            t = (float) jSONObject.optDouble("pointP");
            if (t < 0.0f || t > 100.0f) {
                mo51421a("Bad value", "Wrong value " + -1.0f + " for pointP in additionalData object");
                t = -1.0f;
            }
        }
        b.mo51380c(t);
        b.mo51370a(this.f19253a.mo51403n());
        b.mo51367a(mo51419a(this.f19253a.mo51405p(), jSONObject.optJSONObject("omdata")));
        JSONArray optJSONArray = jSONObject.optJSONArray("serviceStatistics");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (a = this.f19256d.mo50069a(optJSONObject, -1.0f)) == null)) {
                    b.mo51366a(a);
                }
            }
        }
        this.f19256d.mo50291a(b.mo51396h(), jSONObject, String.valueOf(b.mo51402m()), -1.0f);
        return b;
    }

    /* renamed from: a */
    public final void mo51421a(String str, String str2) {
        String str3 = this.f19253a.f19226a;
        C7498k3 a = C7498k3.m19572a(str).mo50704d(str2).mo50699a(this.f19254b.getSlotId());
        if (str3 == null) {
            str3 = this.f19253a.f19227b;
        }
        a.mo50701b(str3).mo50702b(this.f19255c);
    }
}
