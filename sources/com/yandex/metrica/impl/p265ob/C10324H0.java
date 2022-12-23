package com.yandex.metrica.impl.p265ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.H0 */
public class C10324H0 {

    /* renamed from: a */
    private C10320Gm f24805a = new C10320Gm();

    /* renamed from: b */
    private C10473Ln f24806b;

    C10324H0(C10473Ln ln) {
        this.f24806b = ln;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo61414a(String str, String str2) {
        this.f24806b.mo61749b(this.f24805a, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo61413a() {
        if (this.f24805a.isEmpty()) {
            return null;
        }
        return new JSONObject(this.f24805a).toString();
    }
}
