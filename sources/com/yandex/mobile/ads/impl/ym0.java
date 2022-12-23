package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.HashMap;
import java.util.Map;

public class ym0 {

    /* renamed from: a */
    protected final C14645t1 f42896a;

    public ym0(C14645t1 t1Var) {
        this.f42896a = t1Var;
    }

    /* renamed from: a */
    public Map<String, Object> mo71101a(Context context) {
        HashMap hashMap = new HashMap();
        AdRequest a = this.f42896a.mo70080a();
        if (a != null) {
            Map<String, String> parameters = a.getParameters();
            if (parameters != null) {
                hashMap.putAll(parameters);
            }
            hashMap.put("age", a.getAge());
            hashMap.put("context_tags", a.getContextTags());
            hashMap.put(InneractiveMediationDefs.KEY_GENDER, a.getGender());
            d71 a2 = l71.m38631c().mo68362a(context);
            Boolean C = a2 != null ? a2.mo66438C() : null;
            if (C != null) {
                hashMap.put("user_consent", C);
            }
        }
        return hashMap;
    }
}
