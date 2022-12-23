package com.yandex.mobile.ads.impl;

import android.util.Base64;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.sa */
class C14573sa {

    /* renamed from: a */
    private final C13188gb f39884a = new C13188gb();

    C14573sa() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo69913a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        this.f39884a.getClass();
        try {
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
