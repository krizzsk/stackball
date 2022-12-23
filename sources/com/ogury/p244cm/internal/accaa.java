package com.ogury.p244cm.internal;

import com.ogury.core.OguryError;
import com.ogury.p244cm.internal.aacaa;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.accaa */
public final class accaa implements acbbc {

    /* renamed from: a */
    public static final aaaaa f20554a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accaa$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo52748a(JSONObject jSONObject) {
        bbabc.m22051b(jSONObject, "jsonResponse");
        abbba abbba = abbba.f20411a;
        if (abbba.m21837f("CCPAF")) {
            if (jSONObject != null && jSONObject.has("sdk") && jSONObject.has("ccpaResponse") && jSONObject.optJSONObject("ccpaResponse").has("userConsent")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("ccpaResponse");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("userConsent");
                abbba abbba2 = abbba.f20411a;
                abbcb c = abbba.m21830c();
                String optString = optJSONObject.optString("lastOpt");
                bbabc.m22048a((Object) optString, "ccpaResponse.optString(LAST_OPT)");
                c.mo52677a(aacaa.aaaaa.m21774d(optString));
                abbba abbba3 = abbba.f20411a;
                abcaa d = abbba.m21830c().mo52681d();
                String optString2 = optJSONObject.optString("uspString");
                bbabc.m22048a((Object) optString2, "ccpaResponse.optString(USP_STRING)");
                d.mo52689a(optString2);
                abbba abbba4 = abbba.f20411a;
                abbba.m21830c().mo52681d().mo52695d(optJSONObject.optBoolean("ccpaApplies"));
                abbba abbba5 = abbba.f20411a;
                abbba.m21830c().mo52681d().mo52690a(optJSONObject2.optBoolean("explicitNotice"));
                abbba abbba6 = abbba.f20411a;
                abbba.m21830c().mo52681d().mo52691b(optJSONObject2.optBoolean("optOutSale"));
                abbba abbba7 = abbba.f20411a;
                abbba.m21830c().mo52681d().mo52693c(optJSONObject2.optBoolean("lspa"));
            } else {
                abbba abbba8 = abbba.f20411a;
                abbba.m21823a(new acbcc(false, new OguryError(1004, "Json not valid")));
            }
        }
        return false;
    }
}
