package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;

/* renamed from: com.yandex.metrica.impl.ob.sa */
public class C11744sa implements Object<C10883Wc, C11428kg.C11441k> {

    /* renamed from: a */
    private final C11711ra f28134a;

    /* renamed from: b */
    private final C11785ta f28135b;

    public C11744sa() {
        this(new C11711ra(), new C11785ta());
    }

    C11744sa(C11711ra raVar, C11785ta taVar) {
        this.f28134a = raVar;
        this.f28135b = taVar;
    }

    /* renamed from: a */
    public C11428kg.C11441k mo63629b(C10883Wc wc) {
        C11428kg.C11441k kVar = new C11428kg.C11441k();
        kVar.f27496b = this.f28134a.mo63596b(wc.f26154a);
        kVar.f27497c = this.f28135b.mo63722b(wc.f26155b);
        return kVar;
    }

    /* renamed from: a */
    public C10883Wc mo63628a(C11428kg.C11441k kVar) {
        C11711ra raVar = this.f28134a;
        C11428kg.C11441k.C11442a aVar = kVar.f27496b;
        C11428kg.C11441k.C11442a aVar2 = new C11428kg.C11441k.C11442a();
        if (aVar == null) {
            aVar = aVar2;
        }
        C10807Uc a = raVar.mo63595a(aVar);
        C11785ta taVar = this.f28135b;
        C11428kg.C11441k.C11447b bVar = kVar.f27497c;
        C11428kg.C11441k.C11447b bVar2 = new C11428kg.C11441k.C11447b();
        if (bVar == null) {
            bVar = bVar2;
        }
        return new C10883Wc(a, taVar.mo63721a(bVar));
    }
}
