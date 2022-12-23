package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10089A;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.V3 */
class C10826V3 {

    /* renamed from: a */
    private final HashMap<String, C10089A> f25978a = new HashMap<>();

    C10826V3() {
    }

    /* renamed from: a */
    public synchronized C10089A mo62373a(C11101c4 c4Var, C10380Im im, C10306G9 g9) {
        C10089A a;
        a = this.f25978a.get(c4Var.toString());
        if (a == null) {
            C10089A.C10090a e = g9.mo61363e();
            a = new C10089A(e.f24296a, e.f24297b, im);
            this.f25978a.put(c4Var.toString(), a);
        }
        return a;
    }
}
