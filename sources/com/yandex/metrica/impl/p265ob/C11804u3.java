package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.billing_interface.C10068a;
import com.yandex.metrica.billing_interface.C10073e;
import com.yandex.metrica.impl.p265ob.C11113cg;

/* renamed from: com.yandex.metrica.impl.ob.u3 */
class C11804u3 implements C11194ea<C10068a, C11113cg.C11114a> {
    C11804u3() {
    }

    /* renamed from: a */
    public C11113cg.C11114a mo61050b(C10068a aVar) {
        C11113cg.C11114a aVar2 = new C11113cg.C11114a();
        int ordinal = aVar.f24199a.ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = 2;
        } else if (ordinal == 1) {
            i = 3;
        }
        aVar2.f26655b = i;
        aVar2.f26656c = aVar.f24200b;
        aVar2.f26657d = aVar.f24201c;
        aVar2.f26658e = aVar.f24202d;
        aVar2.f26659f = aVar.f24203e;
        return aVar2;
    }

    /* renamed from: a */
    public C10068a mo61049a(C11113cg.C11114a aVar) {
        C10073e eVar;
        int i = aVar.f26655b;
        if (i == 2) {
            eVar = C10073e.INAPP;
        } else if (i != 3) {
            eVar = C10073e.UNKNOWN;
        } else {
            eVar = C10073e.SUBS;
        }
        return new C10068a(eVar, aVar.f26656c, aVar.f26657d, aVar.f26658e, aVar.f26659f);
    }
}
