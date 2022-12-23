package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ej */
public class C11212ej {

    /* renamed from: a */
    private final C11107ca f26842a;

    public C11212ej() {
        this(new C11107ca());
    }

    /* renamed from: a */
    public C11659pi mo62838a(JSONObject jSONObject) {
        C11428kg.C11433c cVar = new C11428kg.C11433c();
        JSONObject optJSONObject = jSONObject.optJSONObject("cache_control");
        if (optJSONObject != null) {
            Long d = C11993ym.m30989d(optJSONObject, "cells_around_ttl");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.f27451b = C11993ym.m30956a(d, timeUnit, cVar.f27451b);
            cVar.f27452c = C11993ym.m30956a(C11993ym.m30989d(optJSONObject, "wifi_networks_ttl"), timeUnit, cVar.f27452c);
            cVar.f27453d = C11993ym.m30956a(C11993ym.m30989d(optJSONObject, "last_known_location_ttl"), timeUnit, cVar.f27453d);
            cVar.f27454e = C11993ym.m30956a(C11993ym.m30989d(optJSONObject, "net_interfaces_ttl"), timeUnit, cVar.f27454e);
        }
        return this.f26842a.mo62725a(cVar);
    }

    C11212ej(C11107ca caVar) {
        this.f26842a = caVar;
    }
}
