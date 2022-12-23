package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11576o2;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.d7 */
public class C11135d7 {

    /* renamed from: a */
    private final C11842v7 f26688a;

    public C11135d7() {
        this(new C11842v7());
    }

    /* renamed from: a */
    public C11576o2.C11582f mo62746a(C11624p7 p7Var, C11414k2 k2Var) {
        String b;
        C11555n7 n7Var = p7Var.f27898a;
        String str = "";
        if (!(n7Var == null || (b = n7Var.mo63366b()) == null)) {
            str = b;
        }
        byte[] a = this.f26688a.mo63824a(p7Var);
        C10380Im b2 = C12038zm.m31087b(k2Var.mo62272b().mo60794a());
        List<Integer> list = C10385J0.f24953i;
        C10734S s = new C10734S(a, str, C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.mo63170b(), b2);
        s.mo63148c(k2Var.mo63175d());
        return new C11576o2.C11582f(s, k2Var).mo63412a(s.mo62218s()).mo63413a(true);
    }

    C11135d7(C11842v7 v7Var) {
        this.f26688a = v7Var;
    }
}
