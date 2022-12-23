package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.dj */
class C11162dj {

    /* renamed from: a */
    private final C10986Z9 f26748a;

    public C11162dj() {
        this(new C10986Z9());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62797a(C11885vj vjVar, JSONObject jSONObject) {
        C10986Z9 z9 = this.f26748a;
        C11428kg.C11432b bVar = new C11428kg.C11432b();
        JSONObject optJSONObject = jSONObject.optJSONObject("auto_inapp_collecting");
        if (optJSONObject != null) {
            bVar.f27449b = optJSONObject.optInt("send_frequency_seconds", bVar.f27449b);
            bVar.f27450c = optJSONObject.optInt("first_collecting_inapp_max_age_seconds", bVar.f27450c);
        }
        vjVar.mo63939a(z9.mo61049a(bVar));
    }

    C11162dj(C10986Z9 z9) {
        this.f26748a = z9;
    }
}
