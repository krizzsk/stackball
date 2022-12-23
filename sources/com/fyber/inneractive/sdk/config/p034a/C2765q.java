package com.fyber.inneractive.sdk.config.p034a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.a.q */
public final class C2765q extends C2764p {

    /* renamed from: a */
    String f6507a;

    /* renamed from: b */
    final Map<String, C2750b> f6508b = new HashMap();

    C2765q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18008a(JSONObject jSONObject) {
        mo18006a(new C2763o(jSONObject));
    }

    public final String toString() {
        return String.format("feature: id=%s, params=%s, exp=%s", new Object[]{this.f6507a, this.f6506c, this.f6508b});
    }
}
