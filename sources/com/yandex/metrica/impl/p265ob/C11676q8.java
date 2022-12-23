package com.yandex.metrica.impl.p265ob;

import android.util.Base64;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.q8 */
class C11676q8 {

    /* renamed from: a */
    private String f28008a;

    /* renamed from: b */
    private String f28009b;

    C11676q8() {
    }

    /* renamed from: a */
    public void mo63529a(String str) {
        this.f28008a = str;
    }

    /* renamed from: b */
    public void mo63530b(String str) {
        this.f28009b = str;
    }

    /* renamed from: a */
    public String mo63528a() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f28008a;
            if (str == null) {
                str = "";
            }
            return Base64.encodeToString(jSONObject.put("arg_ee", str).put("arg_hv", this.f28009b).toString().getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }
}
