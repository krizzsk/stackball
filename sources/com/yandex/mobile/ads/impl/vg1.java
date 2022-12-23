package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class vg1 {
    /* renamed from: a */
    public String mo70490a(JSONObject jSONObject, String str) throws JSONException, xr0 {
        String a = ft0.m36302a(jSONObject, str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        throw new xr0("Native Ad json has not required attributes");
    }
}
