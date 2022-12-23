package com.ogury.p244cm.internal;

import com.appsflyer.internal.referrer.Payload;
import com.ogury.p244cm.internal.aacaa;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.accac */
public final class accac extends accab {

    /* renamed from: b */
    public static final aaaaa f20556b = new aaaaa((bbabb) null);

    /* renamed from: c */
    private String f20557c = "userConsent";

    /* renamed from: com.ogury.cm.internal.accac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo52754a() {
        return this.f20557c;
    }

    /* renamed from: a */
    public final boolean mo52748a(JSONObject jSONObject) {
        bbabc.m22051b(jSONObject, "jsonResponse");
        abbba abbba = abbba.f20411a;
        if (!abbba.m21837f("TCF")) {
            return false;
        }
        boolean a = super.mo52748a(jSONObject);
        if (a) {
            abbba abbba2 = abbba.f20411a;
            abcac abcac = (abcac) abcab.m21880d();
            abcac.mo52704a(jSONObject.optJSONObject("iabResponse"));
            JSONObject optJSONObject = jSONObject.optJSONObject(Payload.RESPONSE);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(this.f20557c);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("sdk");
            bbabc.m22048a((Object) optJSONObject3, "jsonResponse.optJSONObject(SDK)");
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("unifiedVendors");
            bbabc.m22048a((Object) optJSONObject4, "sdkObject.optJSONObject(UNIFIED_VENDORS)");
            abbba abbba3 = abbba.f20411a;
            abbba.m21830c().mo52678a(optJSONObject.optBoolean("hasPaid"));
            abcac.mo52700a(optJSONObject.optBoolean("gdprApplies", true));
            abcac.mo52703a(optJSONObject2.optInt("purposes"));
            abcac.mo52709c(optJSONObject2.optInt("specialFeatures"));
            String optString = optJSONObject2.optString(TJAdUnitConstants.String.VENDORS, "");
            bbabc.m22048a((Object) optString, "userConsent.optString(VENDORS, \"\")");
            Object[] array = aacaa.aaaaa.m21769a(aacaa.aaaaa.m21772b(optString)).toArray(new Integer[0]);
            if (array != null) {
                abcac.mo52705a((Integer[]) array);
                String optString2 = optJSONObject2.optString("vendorsLI", "");
                bbabc.m22048a((Object) optString2, "userConsent.optString(VENDORS_LI, \"\")");
                Object[] array2 = aacaa.aaaaa.m21769a(aacaa.aaaaa.m21772b(optString2)).toArray(new Integer[0]);
                if (array2 != null) {
                    abcac.mo52708b((Integer[]) array2);
                    abcac.mo52706b(optJSONObject2.optInt("purposesLI"));
                    abcac.mo52707b(optJSONObject4.optJSONObject(TJAdUnitConstants.String.VENDORS));
                    abcac.mo52710d(optJSONObject2.optInt("maxVendorId"));
                    String optString3 = optJSONObject.optString("iabString", "");
                    bbabc.m22048a((Object) optString3, "responseObject.optString(IAB_STRING, \"\")");
                    abcac.mo52699a(optString3);
                } else {
                    throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return a;
    }
}
