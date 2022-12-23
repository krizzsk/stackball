package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.C15526t;

class b61 {

    /* renamed from: a */
    private final C13371i0 f31258a;

    b61(C13371i0 i0Var) {
        this.f31258a = i0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public o80 mo66009a(Context context, AdResponse<?> adResponse, C15526t tVar, C12947e0 e0Var, C14384qh qhVar) {
        AdResponse<?> adResponse2 = adResponse;
        C12947e0 e0Var2 = e0Var;
        C14384qh qhVar2 = qhVar;
        y51 y51 = new y51(context, new z51(qhVar2, adResponse.mo64443w()), qhVar2);
        C15249yg ygVar = new C15249yg(y51, new q51(this.f31258a));
        f30 f30 = new f30();
        ht0 a = tVar.mo71674a();
        return new o80(new C14383qg(new C12586bg(adResponse, e0Var, f30, y51, new cr0()), new p51(adResponse2, e0Var2, ygVar, a), new g61(adResponse2, e0Var2, new be1(), a)));
    }
}
