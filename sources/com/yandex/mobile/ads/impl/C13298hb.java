package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.hb */
public class C13298hb {

    /* renamed from: a */
    private final C13040fb f34343a = new C13040fb();

    /* renamed from: a */
    public String mo67507a(JSONObject jSONObject, String str) throws JSONException, xr0 {
        String str2;
        String a = ft0.m36302a(jSONObject, str);
        this.f34343a.getClass();
        try {
            str2 = new String(Base64.decode(a.getBytes(), 0), "UTF-8");
        } catch (Exception unused) {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        throw new xr0("Native Ad json has attribute with broken base64 encoding");
    }
}
