package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3623ae;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.n */
public final class C2800n implements C2801o, C3623ae.C3624a {

    /* renamed from: a */
    Integer f6632a = null;

    /* renamed from: b */
    public UnitDisplayType f6633b;

    /* renamed from: c */
    Boolean f6634c;

    /* renamed from: d */
    Integer f6635d;

    /* renamed from: a */
    public final void mo18058a(boolean z) {
        this.f6634c = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final UnitDisplayType mo18057a() {
        return this.f6633b;
    }

    /* renamed from: b */
    public final Integer mo18059b() {
        return this.f6632a;
    }

    /* renamed from: c */
    public final JSONObject mo18060c() {
        JSONObject jSONObject = new JSONObject();
        C3623ae.m9046a(jSONObject, "refresh", this.f6632a);
        C3623ae.m9046a(jSONObject, "unitDisplayType", this.f6633b);
        C3623ae.m9046a(jSONObject, "close", this.f6634c);
        C3623ae.m9046a(jSONObject, "hideDelay", this.f6635d);
        return jSONObject;
    }
}
