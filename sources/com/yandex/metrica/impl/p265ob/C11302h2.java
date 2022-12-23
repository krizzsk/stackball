package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.h2 */
class C11302h2 implements Runnable {

    /* renamed from: a */
    private final Context f27029a;

    /* renamed from: b */
    private final C11411k0 f27030b;

    /* renamed from: c */
    private final Bundle f27031c;

    /* renamed from: d */
    private final C10178D4 f27032d;

    C11302h2(Context context, C11411k0 k0Var, Bundle bundle, C10178D4 d4) {
        this.f27029a = context;
        this.f27030b = k0Var;
        this.f27031c = bundle;
        this.f27032d = d4;
    }

    public void run() {
        C10770T3 t3 = new C10770T3(this.f27031c);
        if (!C10770T3.m27780a(t3, this.f27029a)) {
            C10153C4 a = C10153C4.m26091a(t3);
            C10910X3 x3 = new C10910X3(t3);
            this.f27032d.mo61166a(a, x3).mo61043a(this.f27030b, x3);
        }
    }
}
