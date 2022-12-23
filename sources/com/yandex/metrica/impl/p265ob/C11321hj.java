package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.hj */
public final class C11321hj {

    /* renamed from: a */
    private final C11376ja f27080a;

    public C11321hj(C11376ja jaVar) {
        this.f27080a = jaVar;
    }

    /* renamed from: a */
    public final void mo63022a(C11885vj vjVar, JSONObject jSONObject) {
        C11428kg.C11438h hVar = new C11428kg.C11438h();
        JSONObject optJSONObject = jSONObject.optJSONObject("egress");
        if (optJSONObject != null) {
            hVar.f27464b = optJSONObject.optString("url", hVar.f27464b);
            hVar.f27465c = optJSONObject.optInt("repeated_delay", hVar.f27465c);
            hVar.f27466d = optJSONObject.optInt("random_delay_window", hVar.f27466d);
            hVar.f27467e = optJSONObject.optBoolean("background_allowed", hVar.f27467e);
            hVar.f27468f = optJSONObject.optBoolean("diagnostic_enabled", hVar.f27468f);
        }
        vjVar.mo63942a(this.f27080a.mo61049a(hVar));
    }

    public C11321hj() {
        this(new C11376ja());
    }
}
