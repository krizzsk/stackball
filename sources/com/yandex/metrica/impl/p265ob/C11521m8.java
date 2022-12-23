package com.yandex.metrica.impl.p265ob;

import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.m8 */
class C11521m8 {

    /* renamed from: a */
    private static String[] f27722a = {"arg_ak", "arg_pn", "arg_pd", "arg_ps", "arg_rt"};

    C11521m8() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10153C4 mo63316a(String str) {
        try {
            return m29791a(new JSONObject(new String(Base64.decode(str, 0))).getJSONObject("arg_cd"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C10153C4 m29791a(JSONObject jSONObject) {
        try {
            for (String has : f27722a) {
                if (!jSONObject.has(has)) {
                    return null;
                }
            }
            int i = jSONObject.getInt("arg_pd");
            if (i == 0) {
                i = Integer.parseInt(jSONObject.getString("arg_pd"));
            }
            return new C10153C4(jSONObject.getString("arg_ak"), jSONObject.getString("arg_pn"), Integer.valueOf(i), jSONObject.getString("arg_ps"), CounterConfiguration.C10019b.m25810a(jSONObject.getString("arg_rt")));
        } catch (Exception unused) {
            return null;
        }
    }
}
