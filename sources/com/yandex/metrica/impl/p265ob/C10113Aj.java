package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Aj */
class C10113Aj {
    C10113Aj() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11428kg.C11461x[] mo61067a(JSONArray jSONArray) {
        Integer num;
        String e;
        if (jSONArray == null) {
            return new C11428kg.C11461x[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Integer c = C11993ym.m30985c(jSONObject, "type");
                if (c != null) {
                    int intValue = c.intValue();
                    if (intValue == 0) {
                        num = 0;
                    } else if (intValue == 1) {
                        num = 1;
                    } else if (intValue == 2) {
                        num = 2;
                    } else if (intValue == 3) {
                        num = 3;
                    }
                    e = C11993ym.m30992e(jSONObject, "value");
                    if (!(num == null || e == null)) {
                        C11428kg.C11461x xVar = new C11428kg.C11461x();
                        xVar.f27590b = num.intValue();
                        xVar.f27591c = e;
                        arrayList.add(xVar);
                    }
                }
                num = null;
                e = C11993ym.m30992e(jSONObject, "value");
                C11428kg.C11461x xVar2 = new C11428kg.C11461x();
                xVar2.f27590b = num.intValue();
                xVar2.f27591c = e;
                arrayList.add(xVar2);
            } catch (Throwable unused) {
            }
        }
        return (C11428kg.C11461x[]) arrayList.toArray(new C11428kg.C11461x[0]);
    }
}
