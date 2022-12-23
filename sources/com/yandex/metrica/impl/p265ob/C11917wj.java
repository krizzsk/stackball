package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.wj */
public final class C11917wj {

    /* renamed from: a */
    private final C10249Fa f28676a;

    public C11917wj(C10249Fa fa) {
        this.f28676a = fa;
    }

    /* renamed from: a */
    public final void mo64046a(C11885vj vjVar, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("startup_update");
        C11428kg.C11454q qVar = new C11428kg.C11454q();
        Integer c = C11993ym.m30985c(optJSONObject, "interval_seconds");
        if (c != null) {
            Intrinsics.checkNotNullExpressionValue(c, "it");
            qVar.f27557b = c.intValue();
        }
        vjVar.mo63933a(this.f28676a.mo61049a(qVar));
    }

    public C11917wj() {
        this(new C10249Fa());
    }
}
