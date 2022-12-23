package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.d4 */
public final class C7361d4 {

    /* renamed from: a */
    public final boolean f18446a;

    /* renamed from: b */
    public final C7298a f18447b;

    /* renamed from: c */
    public final String f18448c;

    /* renamed from: d */
    public final Context f18449d;

    public C7361d4(C7298a aVar, String str, boolean z, Context context) {
        this.f18447b = aVar;
        this.f18448c = str;
        this.f18446a = z;
        this.f18449d = context;
    }

    /* renamed from: a */
    public static C7361d4 m18928a(C7298a aVar, String str, boolean z, Context context) {
        return new C7361d4(aVar, str, z, context);
    }

    /* renamed from: a */
    public C7581o2 mo49991a(C7581o2 o2Var, JSONObject jSONObject) {
        if (o2Var == null) {
            String optString = jSONObject.optString("customReferenceData", (String) null);
            if (optString != null && optString.length() > 256) {
                mo49992a("Bad value", "customReferenceData more then 256 symbols");
                optString = null;
            }
            o2Var = C7581o2.m19997a(jSONObject.optString("contentUrl", (String) null), optString);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        if (optJSONArray != null) {
            mo49993a(optJSONArray, o2Var);
        }
        return o2Var;
    }

    /* renamed from: a */
    public final void mo49992a(String str, String str2) {
        if (this.f18446a) {
            C7498k3.m19572a(str).mo50704d(str2).mo50699a(this.f18447b.getSlotId()).mo50701b(this.f18448c).mo50702b(this.f18449d);
        }
    }

    /* renamed from: a */
    public final void mo49993a(JSONArray jSONArray, C7581o2 o2Var) {
        C7598p2 p2Var;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                if (!optJSONObject.has("url")) {
                    mo49992a("Required field", "VerificationScriptResource has no url");
                } else {
                    String optString = optJSONObject.optString("url");
                    if (!optJSONObject.has("vendorKey") || !optJSONObject.has(NativeProtocol.WEB_DIALOG_PARAMS)) {
                        p2Var = C7598p2.m20062a(optString);
                    } else {
                        String optString2 = optJSONObject.optString("vendorKey");
                        String optString3 = optJSONObject.optString(NativeProtocol.WEB_DIALOG_PARAMS);
                        if (TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
                            C7374e0.m18989a("VerificationScriptResource has empty param: vendorKey=" + optString2 + ", verificationParameters=" + optString3);
                        } else {
                            p2Var = C7598p2.m20063a(optString, optString2, optString3);
                        }
                    }
                    o2Var.f19125c.add(p2Var);
                }
            }
        }
    }
}
