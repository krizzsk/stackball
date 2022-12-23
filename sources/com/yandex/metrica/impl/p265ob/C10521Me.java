package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C11283gg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Me */
public class C10521Me implements C11194ea<C10459Le, C11283gg.C11284a> {

    /* renamed from: a */
    private final C10430Ke f25207a = new C10430Ke();

    /* renamed from: a */
    public C11283gg.C11284a mo61050b(C10459Le le) {
        C11283gg.C11284a aVar = new C11283gg.C11284a();
        if (!TextUtils.isEmpty(le.f25109a)) {
            aVar.f26988b = le.f25109a;
        }
        aVar.f26989c = le.f25110b.toString();
        aVar.f26990d = le.f25111c;
        aVar.f26991e = le.f25112d;
        aVar.f26992f = this.f25207a.mo61050b(le.f25113e).intValue();
        return aVar;
    }

    /* renamed from: a */
    public C10459Le mo61049a(C11283gg.C11284a aVar) {
        JSONObject jSONObject;
        String str = aVar.f26988b;
        String str2 = aVar.f26989c;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C10459Le(str, jSONObject, aVar.f26990d, aVar.f26991e, this.f25207a.mo61049a(Integer.valueOf(aVar.f26992f)));
        }
        jSONObject = new JSONObject();
        return new C10459Le(str, jSONObject, aVar.f26990d, aVar.f26991e, this.f25207a.mo61049a(Integer.valueOf(aVar.f26992f)));
    }
}
