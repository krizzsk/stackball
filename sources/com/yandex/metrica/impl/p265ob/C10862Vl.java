package com.yandex.metrica.impl.p265ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Vl */
class C10862Vl implements C11536ml {

    /* renamed from: a */
    private final C10615Ol f26133a;

    /* renamed from: b */
    private final C10819Ul f26134b;

    /* renamed from: com.yandex.metrica.impl.ob.Vl$a */
    static class C10863a {
        C10863a() {
        }
    }

    C10862Vl(C10615Ol ol, C10819Ul ul) {
        this.f26133a = ol;
        this.f26134b = ul;
        ul.mo62370b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62432a(boolean z) {
        this.f26134b.mo62369a(z);
    }

    public void onError(String str) {
        this.f26134b.mo62368a();
        this.f26133a.onError(str);
    }

    public void onResult(JSONObject jSONObject) {
        this.f26134b.mo62368a();
        this.f26133a.onResult(jSONObject);
    }
}
