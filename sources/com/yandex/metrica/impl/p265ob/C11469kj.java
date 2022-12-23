package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import com.yandex.metrica.impl.p265ob.C11993ym;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kj */
public class C11469kj {

    /* renamed from: a */
    private final C11627pa f27616a;

    C11469kj() {
        this(new C11627pa());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63246a(C11885vj vjVar, C11993ym.C11994a aVar) {
        if (vjVar.mo63962e().f28184f) {
            C11428kg.C11440j jVar = new C11428kg.C11440j();
            JSONObject optJSONObject = aVar.optJSONObject("identity_light_collecting");
            if (optJSONObject != null) {
                jVar.f27494b = optJSONObject.optLong("min_interval_seconds", jVar.f27494b);
            }
            vjVar.mo63944a(this.f27616a.mo63475a(jVar));
        }
    }

    C11469kj(C11627pa paVar) {
        this.f27616a = paVar;
    }
}
