package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7524l3;
import com.p243my.target.C7770z3;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.c0 */
public class C7338c0 extends C7337c<C7731x2> implements C7770z3.C7771a {

    /* renamed from: a */
    public String f18390a;

    /* renamed from: a */
    public static C7337c<C7731x2> m18823a() {
        return new C7338c0();
    }

    /* renamed from: a */
    public C7618q2 mo49777a(JSONObject jSONObject, C7617q1 q1Var, C7298a aVar, Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("banners", jSONArray);
            new JSONObject().put(aVar.getFormat(), jSONObject2);
            C7731x2 e = C7731x2.m20796e();
            C7523l2 b = mo49780b(jSONObject, q1Var, aVar, context);
            if (b == null) {
                return null;
            }
            e.mo51821a(b);
            return e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C7731x2 mo49776a(String str, C7617q1 q1Var, C7731x2 x2Var, C7298a aVar, C7524l3.C7525a aVar2, C7524l3 l3Var, Context context) {
        JSONObject optJSONObject;
        C7523l2 b;
        JSONObject optJSONObject2;
        C7541m2 b2;
        JSONObject a = C7337c.m18819a(str, aVar2, l3Var);
        if (a == null) {
            return null;
        }
        if (x2Var == null) {
            x2Var = C7731x2.m20796e();
        }
        this.f18390a = a.optString("mraid.js");
        JSONObject a2 = mo49779a(a, aVar.getFormat());
        if (a2 != null) {
            JSONArray optJSONArray = a2.optJSONArray("banners");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                C7415g4.m19175a().mo50218a(a2, x2Var);
                if (!(optJSONArray.length() <= 0 || (optJSONObject = optJSONArray.optJSONObject(0)) == null || (b = mo49780b(optJSONObject, q1Var, aVar, context)) == null)) {
                    x2Var.mo51821a(b);
                    return x2Var;
                }
            }
            return null;
        } else if (!aVar.isMediationEnabled() || (optJSONObject2 = a.optJSONObject("mediation")) == null || (b2 = C7770z3.m20982a(this, q1Var, aVar, context).mo51987b(optJSONObject2)) == null) {
            return null;
        } else {
            x2Var.mo51417a(b2);
            return x2Var;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo49779a(org.json.JSONObject r8, java.lang.String r9) {
        /*
            r7 = this;
            r9.hashCode()
            int r0 = r9.hashCode()
            r1 = -1292723836(0xffffffffb2f29984, float:-2.8242319E-8)
            r2 = 2
            r3 = 1
            java.lang.String r4 = "standard_728x90"
            java.lang.String r5 = "standard_320x50"
            java.lang.String r6 = "standard"
            if (r0 == r1) goto L_0x0031
            r1 = -1177968780(0xffffffffb9c99f74, float:-3.845651E-4)
            if (r0 == r1) goto L_0x0028
            r1 = 1312628413(0x4e3d1ebd, float:7.9322707E8)
            if (r0 == r1) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            boolean r0 = r9.equals(r6)
            if (r0 != 0) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            r0 = 2
            goto L_0x003a
        L_0x0028:
            boolean r0 = r9.equals(r4)
            if (r0 != 0) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            r0 = 1
            goto L_0x003a
        L_0x0031:
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto L_0x0039
        L_0x0037:
            r0 = -1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x0063
            if (r0 == r3) goto L_0x0057
            if (r0 == r2) goto L_0x0045
            org.json.JSONObject r8 = r8.optJSONObject(r9)
            return r8
        L_0x0045:
            org.json.JSONObject r9 = r8.optJSONObject(r6)
            if (r9 != 0) goto L_0x004f
            org.json.JSONObject r9 = r8.optJSONObject(r5)
        L_0x004f:
            if (r9 == 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            org.json.JSONObject r9 = r8.optJSONObject(r4)
        L_0x0056:
            return r9
        L_0x0057:
            org.json.JSONObject r9 = r8.optJSONObject(r6)
            if (r9 == 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            org.json.JSONObject r9 = r8.optJSONObject(r4)
        L_0x0062:
            return r9
        L_0x0063:
            org.json.JSONObject r9 = r8.optJSONObject(r6)
            if (r9 == 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            org.json.JSONObject r9 = r8.optJSONObject(r5)
        L_0x006e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7338c0.mo49779a(org.json.JSONObject, java.lang.String):org.json.JSONObject");
    }

    /* renamed from: b */
    public final C7523l2 mo49780b(JSONObject jSONObject, C7617q1 q1Var, C7298a aVar, Context context) {
        C7401f4 a = C7401f4.m19128a(q1Var, aVar, context);
        C7523l2 newBanner = C7523l2.newBanner();
        if (!a.mo50143a(jSONObject, newBanner, this.f18390a)) {
            return null;
        }
        return newBanner;
    }
}
