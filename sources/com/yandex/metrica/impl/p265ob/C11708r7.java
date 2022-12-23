package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.r7 */
public class C11708r7 implements C11194ea<C11189e7, C10370If> {

    /* renamed from: a */
    private C10182D7 f28072a;

    public C11708r7(C10182D7 d7) {
        this.f28072a = d7;
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C10370If ifR = (C10370If) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C10370If mo61050b(C11189e7 e7Var) {
        C10370If ifR = new C10370If();
        C11520m7 m7Var = e7Var.f26798a;
        if (m7Var != null) {
            ifR.f24901b = this.f28072a.mo61050b(m7Var);
        }
        ifR.f24902c = new C10641Pf[e7Var.f26799b.size()];
        int i = 0;
        for (C11520m7 a : e7Var.f26799b) {
            ifR.f24902c[i] = this.f28072a.mo61050b(a);
            i++;
        }
        String str = e7Var.f26800c;
        if (str != null) {
            ifR.f24903d = str;
        }
        return ifR;
    }
}
