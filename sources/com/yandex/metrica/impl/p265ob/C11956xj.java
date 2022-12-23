package com.yandex.metrica.impl.p265ob;

import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.impl.p265ob.C10856Vi;
import com.yandex.metrica.impl.p265ob.C11428kg;
import com.yandex.metrica.impl.p265ob.C11993ym;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xj */
public class C11956xj {

    /* renamed from: a */
    private static final C11428kg.C11457t f28727a = new C11428kg.C11457t();

    /* renamed from: a */
    public C10856Vi mo64099a(C11993ym.C11994a aVar, String str) {
        C10856Vi.C10857a aVar2;
        JSONObject optJSONObject = aVar.optJSONObject(str);
        C10856Vi.C10857a aVar3 = null;
        if (optJSONObject == null) {
            return null;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("cell");
        if (optJSONObject2 != null) {
            C11428kg.C11457t tVar = f28727a;
            aVar2 = new C10856Vi.C10857a(optJSONObject2.optInt("refresh_event_count", tVar.f27561b), optJSONObject2.optLong("refresh_period_seconds", tVar.f27562c));
        } else {
            aVar2 = null;
        }
        JSONObject optJSONObject3 = optJSONObject.optJSONObject(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
        if (optJSONObject3 != null) {
            C11428kg.C11457t tVar2 = f28727a;
            aVar3 = new C10856Vi.C10857a(optJSONObject3.optInt("refresh_event_count", tVar2.f27561b), optJSONObject3.optLong("refresh_period_seconds", tVar2.f27562c));
        }
        return new C10856Vi(aVar2, aVar3);
    }
}
