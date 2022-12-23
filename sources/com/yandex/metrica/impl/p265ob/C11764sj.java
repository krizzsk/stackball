package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import com.yandex.metrica.impl.p265ob.C11993ym;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.sj */
public class C11764sj {

    /* renamed from: a */
    private final C10131Ba f28254a;

    C11764sj() {
        this(new C10131Ba());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63686a(C11885vj vjVar, C11993ym.C11994a aVar) {
        C11428kg.C11452o oVar = new C11428kg.C11452o();
        JSONObject optJSONObject = aVar.optJSONObject("sdk_list");
        if (optJSONObject != null) {
            Long d = C11993ym.m30989d(optJSONObject, "min_collecting_interval_seconds");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            oVar.f27543b = C11993ym.m30956a(d, timeUnit, oVar.f27543b);
            oVar.f27544c = C11993ym.m30956a(C11993ym.m30989d(optJSONObject, "min_first_collecting_delay_seconds"), timeUnit, oVar.f27544c);
            oVar.f27545d = C11993ym.m30956a(C11993ym.m30989d(optJSONObject, "min_collecting_delay_after_launch_seconds"), timeUnit, oVar.f27545d);
            oVar.f27546e = C11993ym.m30956a(C11993ym.m30989d(optJSONObject, "min_request_retry_interval_seconds"), timeUnit, oVar.f27546e);
        }
        vjVar.mo63928a(this.f28254a.mo61049a(oVar));
    }

    C11764sj(C10131Ba ba) {
        this.f28254a = ba;
    }
}
