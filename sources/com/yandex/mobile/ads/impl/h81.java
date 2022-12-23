package com.yandex.mobile.ads.impl;

import com.mbridge.msdk.foundation.entity.RewardPlus;
import org.json.JSONException;
import org.json.JSONObject;

class h81 implements C13822l<f81> {

    /* renamed from: a */
    private final vg1 f34288a;

    public h81(vg1 vg1) {
        this.f34288a = vg1;
    }

    /* renamed from: a */
    public C13370i mo65683a(JSONObject jSONObject) throws JSONException, xr0 {
        return new f81(ft0.m36302a(jSONObject, "type"), ft0.m36302a(jSONObject, RewardPlus.ICON), ft0.m36302a(jSONObject, "title"), this.f34288a.mo70490a(jSONObject, "url"));
    }
}
