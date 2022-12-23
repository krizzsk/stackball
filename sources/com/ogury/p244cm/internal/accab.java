package com.ogury.p244cm.internal;

import com.appsflyer.internal.referrer.Payload;
import com.ogury.core.OguryError;
import com.ogury.p244cm.internal.aacaa;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.accab */
public abstract class accab implements acbbc {

    /* renamed from: a */
    public static final aaaaa f20555a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accab$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public abstract String mo52754a();

    /* renamed from: a */
    public boolean mo52748a(JSONObject jSONObject) {
        bbabc.m22051b(jSONObject, "jsonResponse");
        if (jSONObject != null && jSONObject.has("sdk") && jSONObject.has(Payload.RESPONSE) && jSONObject.optJSONObject(Payload.RESPONSE).has(mo52754a())) {
            JSONObject optJSONObject = jSONObject.optJSONObject(Payload.RESPONSE);
            if (optJSONObject.has("lastOpt")) {
                abbba abbba = abbba.f20411a;
                abbcb c = abbba.m21830c();
                String optString = optJSONObject.optString("lastOpt");
                bbabc.m22048a((Object) optString, "responseObject.optString(LAST_OPT)");
                c.mo52677a(aacaa.aaaaa.m21774d(optString));
            }
            return true;
        }
        abbba abbba2 = abbba.f20411a;
        abbba.m21823a(new acbcc(false, new OguryError(1004, "Json not valid")));
        return false;
    }
}
