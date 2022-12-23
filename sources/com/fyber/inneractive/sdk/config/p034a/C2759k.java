package com.fyber.inneractive.sdk.config.p034a;

import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.a.k */
public final class C2759k extends C2764p {

    /* renamed from: a */
    String f6502a;

    /* renamed from: b */
    int f6503b;

    C2759k() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17998a(JSONObject jSONObject) {
        mo18006a(new C2763o(jSONObject));
    }

    public final String toString() {
        return String.format("variant: id=%s, perc=%d, params=%s", new Object[]{this.f6502a, Integer.valueOf(this.f6503b), this.f6506c});
    }

    /* renamed from: a */
    public final boolean mo17999a(String str) {
        return (this.f6506c == null || this.f6506c.mo18004a() == null || !this.f6506c.mo18004a().containsKey(str)) ? false : true;
    }
}
