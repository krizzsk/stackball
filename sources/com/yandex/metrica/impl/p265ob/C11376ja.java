package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.ja */
public final class C11376ja implements C11194ea<C11823ui, C11428kg.C11438h> {
    /* renamed from: a */
    public C11428kg.C11438h mo61050b(C11823ui uiVar) {
        C11428kg.C11438h hVar = new C11428kg.C11438h();
        hVar.f27464b = uiVar.mo63801c();
        hVar.f27465c = uiVar.mo63800b();
        hVar.f27466d = uiVar.mo63799a();
        hVar.f27468f = uiVar.mo63803e();
        hVar.f27467e = uiVar.mo63802d();
        return hVar;
    }

    /* renamed from: a */
    public C11823ui mo61049a(C11428kg.C11438h hVar) {
        String str = hVar.f27464b;
        Intrinsics.checkNotNullExpressionValue(str, "nano.url");
        return new C11823ui(str, hVar.f27465c, hVar.f27466d, hVar.f27467e, hVar.f27468f);
    }
}
