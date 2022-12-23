package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.K0 */
public class C10415K0 {

    /* renamed from: a */
    private final C10535N2 f25037a;

    /* renamed from: b */
    private final C10532N f25038b;

    public C10415K0(Context context) {
        this(new C10535N2(context, "com.yandex.android.appmetrica.build_id"), new C10532N(context, "com.yandex.android.appmetrica.is_offline"));
    }

    /* renamed from: a */
    public String mo61640a() {
        return (String) this.f25037a.mo63450a();
    }

    /* renamed from: b */
    public Boolean mo61641b() {
        return (Boolean) this.f25038b.mo63450a();
    }

    C10415K0(C10535N2 n2, C10532N n) {
        this.f25037a = n2;
        this.f25038b = n;
    }
}
