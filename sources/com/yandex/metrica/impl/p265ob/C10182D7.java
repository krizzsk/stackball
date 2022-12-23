package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.D7 */
public class C10182D7 implements C11194ea<C11520m7, C10641Pf> {

    /* renamed from: a */
    private final C10128B7 f24479a;

    public C10182D7() {
        this(new C10128B7());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C10641Pf pf = (C10641Pf) obj;
        throw new UnsupportedOperationException();
    }

    C10182D7(C10128B7 b7) {
        this.f24479a = b7;
    }

    /* renamed from: a */
    public C10641Pf mo61050b(C11520m7 m7Var) {
        C10641Pf pf = new C10641Pf();
        Integer num = m7Var.f27720e;
        pf.f25430f = num == null ? -1 : num.intValue();
        pf.f25429e = m7Var.f27719d;
        pf.f25427c = m7Var.f27717b;
        pf.f25426b = m7Var.f27716a;
        pf.f25428d = m7Var.f27718c;
        C10128B7 b7 = this.f24479a;
        List<StackTraceElement> list = m7Var.f27721f;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement l7Var : list) {
            arrayList.add(new C11484l7(l7Var));
        }
        pf.f25431g = b7.mo61101b((List<C11484l7>) arrayList);
        return pf;
    }
}
