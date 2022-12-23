package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.gj */
public final class C11289gj {

    /* renamed from: a */
    private final C11342ia f27000a;

    public C11289gj(C11342ia iaVar) {
        this.f27000a = iaVar;
    }

    /* renamed from: a */
    public final void mo62974a(C11885vj vjVar, JSONObject jSONObject) {
        C11428kg.C11437g gVar = new C11428kg.C11437g();
        JSONObject optJSONObject = jSONObject.optJSONObject("easy_collecting");
        if (optJSONObject != null) {
            gVar.f27463b = optJSONObject.optLong("first_delay_seconds", gVar.f27463b);
        }
        vjVar.mo63931a(this.f27000a.mo61049a(gVar));
    }

    public C11289gj() {
        this(new C11342ia());
    }
}
