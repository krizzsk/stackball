package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.my.target.f4 */
public class C7401f4 {

    /* renamed from: a */
    public final C7617q1 f18572a;

    /* renamed from: b */
    public final C7298a f18573b;

    /* renamed from: c */
    public final Context f18574c;

    /* renamed from: d */
    public final C7648s3 f18575d;

    /* renamed from: e */
    public boolean f18576e = true;

    public C7401f4(C7617q1 q1Var, C7298a aVar, Context context) {
        this.f18572a = q1Var;
        this.f18573b = aVar;
        this.f18574c = context;
        this.f18575d = C7648s3.m20309a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C7401f4 m19128a(C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7401f4(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final void mo50142a(String str, String str2, String str3) {
        if (this.f18576e) {
            String str4 = this.f18572a.f19226a;
            C7498k3 c = C7498k3.m19572a(str).mo50704d(str2).mo50699a(this.f18573b.getSlotId()).mo50703c(str3);
            if (str4 == null) {
                str4 = this.f18572a.f19227b;
            }
            c.mo50701b(str4).mo50702b(this.f18574c);
        }
    }

    /* renamed from: a */
    public boolean mo50143a(JSONObject jSONObject, C7523l2 l2Var, String str) {
        this.f18575d.mo51485a(jSONObject, (C7768z1) l2Var);
        this.f18576e = l2Var.isLogErrors();
        if (!TJAdUnitConstants.String.HTML.equals(l2Var.getType())) {
            C7374e0.m18989a("standard banner with unsupported type " + l2Var.getType());
            return false;
        }
        if (jSONObject.has("timeout")) {
            int optInt = jSONObject.optInt("timeout");
            if (optInt >= 5) {
                l2Var.setTimeout(optInt);
            } else {
                mo50142a("Required field", "Wrong banner timeout: " + optInt, l2Var.getId());
            }
        }
        String c = C7648s3.m20311c(jSONObject);
        if (TextUtils.isEmpty(c)) {
            mo50142a("Required field", "Banner has no source field", l2Var.getId());
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            l2Var.setMraidJs(str);
            String a = C7648s3.m20310a(str, c);
            if (a != null) {
                l2Var.setSource(a);
                l2Var.setType(CampaignEx.JSON_KEY_MRAID);
                c = a;
            }
        }
        if (l2Var.getOmData() != null) {
            c = C7599p3.m20070a(c);
        }
        l2Var.setSource(c);
        return true;
    }
}
