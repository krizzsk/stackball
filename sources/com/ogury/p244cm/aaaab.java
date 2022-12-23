package com.ogury.p244cm;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.p244cm.internal.aabcc;
import com.ogury.p244cm.internal.aacaa;
import com.ogury.p244cm.internal.babca;
import com.ogury.p244cm.internal.bbabc;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.aaaab */
public final class aaaab {

    /* renamed from: a */
    public static final aaaab f20237a = new aaaab();

    private aaaab() {
    }

    /* renamed from: a */
    public static int m21639a(String str, int i, JSONObject jSONObject) {
        bbabc.m22051b(str, SDKConstants.PARAM_KEY);
        bbabc.m22051b(str, SDKConstants.PARAM_KEY);
        JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
        if (optJSONObject == null) {
            return 0;
        }
        bbabc.m22051b(optJSONObject, "jsonObject");
        Iterator<String> keys = optJSONObject.keys();
        bbabc.m22048a((Object) keys, "keysInJson");
        int i2 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = optJSONObject.optString(next);
            bbabc.m22048a((Object) optString, "jsonObject.optString(key)");
            Object[] array = aacaa.aaaaa.m21769a(aacaa.aaaaa.m21772b(optString)).toArray(new Integer[0]);
            if (array != null) {
                aabcc aabcc = aabcc.f20363a;
                if (aabcc.m21767a((Integer[]) array, i)) {
                    bbabc.m22048a((Object) next, SDKConstants.PARAM_KEY);
                    i2 += (int) Math.pow(2.0d, (double) Integer.parseInt(next));
                }
            } else {
                throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return i2;
    }
}
