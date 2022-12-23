package com.applovin.impl.mediation.p020b;

import com.applovin.impl.sdk.C1469j;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.g */
public class C1230g extends C1227e {
    public C1230g(JSONObject jSONObject, JSONObject jSONObject2, C1469j jVar) {
        super(jSONObject, jSONObject2, jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo12284a() {
        return mo12354b("max_signal_length", 2048);
    }

    /* renamed from: b */
    public boolean mo12285b() {
        return mo12360b("only_collect_signal_when_initialized", (Boolean) false);
    }

    public String toString() {
        return "SignalProviderSpec{specObject=" + mo12335G() + '}';
    }
}
