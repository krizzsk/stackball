package com.yandex.metrica.impl.p265ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.C9 */
public final class C10158C9 {

    /* renamed from: a */
    private final C10363I8 f24446a;

    public C10158C9(C10363I8 i8) {
        this.f24446a = i8;
    }

    /* renamed from: a */
    public final int mo61141a(int i) {
        JSONObject f = this.f24446a.mo61491f();
        if (f != null) {
            return f.optInt(String.valueOf(i));
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo61142a(int i, int i2) {
        JSONObject f = this.f24446a.mo61491f();
        if (f == null) {
            f = new JSONObject();
        }
        f.put(String.valueOf(i), i2);
        this.f24446a.mo61484b(f);
    }
}
