package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11369j4;

/* renamed from: com.yandex.metrica.impl.ob.a5 */
public class C11024a5<T, C extends C11369j4> {

    /* renamed from: a */
    private final C11231f5<T> f26506a;

    /* renamed from: com.yandex.metrica.impl.ob.a5$a */
    protected interface C11025a<T> {
        /* renamed from: a */
        boolean mo62636a(T t, C11411k0 k0Var);
    }

    protected C11024a5(C11231f5<T> f5Var, C c) {
        this.f26506a = f5Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo62635a(C11411k0 k0Var, C11025a<T> aVar) {
        for (Object a : this.f26506a.mo62686a(k0Var.mo63161n()).mo62721a()) {
            if (aVar.mo62636a(a, k0Var)) {
                return true;
            }
        }
        return false;
    }
}
