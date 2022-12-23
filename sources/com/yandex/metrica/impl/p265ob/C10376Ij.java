package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.Ij */
public class C10376Ij implements C10168Cj {

    /* renamed from: a */
    private final C10248F9 f24916a;

    public C10376Ij(C10248F9 f9) {
        this.f24916a = f9;
    }

    /* renamed from: a */
    public String mo61155a() {
        C11258g1 t = this.f24916a.mo61318t();
        String str = !TextUtils.isEmpty(t.f26933a) ? t.f26933a : null;
        if (str != null) {
            return str;
        }
        String m = this.f24916a.mo61305m((String) null);
        return !TextUtils.isEmpty(m) ? m : str;
    }
}
