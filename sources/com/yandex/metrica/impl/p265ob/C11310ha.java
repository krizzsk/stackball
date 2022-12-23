package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;

/* renamed from: com.yandex.metrica.impl.ob.ha */
public class C11310ha implements Object<C10921Xa, C11428kg.C11436f> {

    /* renamed from: a */
    private final C11277ga f27042a;

    public C11310ha() {
        this(new C11277ga());
    }

    /* renamed from: a */
    public Object mo63001a(Object obj) {
        C11428kg.C11436f fVar = (C11428kg.C11436f) obj;
        return new C10921Xa(m29122a(fVar.f27460b), m29122a(fVar.f27461c), m29122a(fVar.f27462d));
    }

    C11310ha(C11277ga gaVar) {
        this.f27042a = gaVar;
    }

    /* renamed from: a */
    public C11428kg.C11436f mo63002b(C10921Xa xa) {
        C11428kg.C11436f fVar = new C11428kg.C11436f();
        fVar.f27460b = m29123a(xa.f26252a);
        fVar.f27461c = m29123a(xa.f26253b);
        fVar.f27462d = m29123a(xa.f26254c);
        return fVar;
    }

    /* renamed from: a */
    public C10921Xa mo62999a(C11428kg.C11436f fVar) {
        return new C10921Xa(m29122a(fVar.f27460b), m29122a(fVar.f27461c), m29122a(fVar.f27462d));
    }

    /* renamed from: a */
    private C11428kg.C11435e m29123a(C10880Wa wa) {
        if (wa == null) {
            return null;
        }
        this.f27042a.getClass();
        C11428kg.C11435e eVar = new C11428kg.C11435e();
        eVar.f27458b = wa.f26152a;
        eVar.f27459c = wa.f26153b;
        return eVar;
    }

    /* renamed from: a */
    private C10880Wa m29122a(C11428kg.C11435e eVar) {
        if (eVar == null) {
            return null;
        }
        return this.f27042a.mo62957a(eVar);
    }
}
