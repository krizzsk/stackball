package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.util.C3623ae;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.t */
public final class C2808t implements C2809u {

    /* renamed from: a */
    String f6643a;

    /* renamed from: b */
    public String f6644b;

    /* renamed from: c */
    public C2800n f6645c;

    /* renamed from: d */
    C2805q f6646d;

    /* renamed from: e */
    C2806r f6647e;

    /* renamed from: f */
    public C2810v f6648f;

    /* renamed from: g */
    C2812x f6649g;

    /* renamed from: a */
    public final String mo18064a() {
        return this.f6643a;
    }

    /* renamed from: b */
    public final String mo18065b() {
        return this.f6644b;
    }

    /* renamed from: c */
    public final C2805q mo18066c() {
        return this.f6646d;
    }

    /* renamed from: d */
    public final C2806r mo18067d() {
        return this.f6647e;
    }

    /* renamed from: e */
    public final C2812x mo18068e() {
        return this.f6649g;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        C3623ae.m9046a(jSONObject, "id", this.f6643a);
        C3623ae.m9046a(jSONObject, InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID, this.f6644b);
        C3623ae.m9046a(jSONObject, "display", this.f6645c);
        C3623ae.m9046a(jSONObject, "monitor", this.f6646d);
        C3623ae.m9046a(jSONObject, "native", this.f6647e);
        C3623ae.m9046a(jSONObject, "video", this.f6648f);
        C3623ae.m9046a(jSONObject, "viewability", this.f6649g);
        return jSONObject.toString();
    }

    /* renamed from: f */
    public final boolean mo18069f() {
        C2800n nVar = this.f6645c;
        if (nVar != null && nVar.f6633b != null) {
            return this.f6645c.f6633b.isDeprecated();
        }
        C2810v vVar = this.f6648f;
        if (vVar == null || vVar.f6659j == null) {
            return false;
        }
        return this.f6648f.f6659j.isDeprecated();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C2811w mo18070g() {
        return this.f6648f;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2801o mo18071h() {
        return this.f6645c;
    }
}
