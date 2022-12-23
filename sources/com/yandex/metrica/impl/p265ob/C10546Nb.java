package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10515Mb;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* renamed from: com.yandex.metrica.impl.ob.Nb */
public final class C10546Nb {

    /* renamed from: a */
    private final C10515Mb.C10517b f25242a = new C10515Mb.C10517b(false, 1);

    /* renamed from: a */
    public final C10515Mb mo61814a(C11823ui uiVar) {
        C10515Mb.C10517b bVar = this.f25242a;
        Random.Default defaultR = Random.Default;
        C10619P0 i = C10619P0.m27164i();
        Intrinsics.checkNotNullExpressionValue(i, "GlobalServiceLocator.getInstance()");
        C12039zn s = i.mo61891s();
        Intrinsics.checkNotNullExpressionValue(s, "GlobalServiceLocator.get…).serviceExecutorProvider");
        C11769sn h = s.mo64214h();
        Intrinsics.checkNotNullExpressionValue(h, "GlobalServiceLocator.get…ortDataCollectingExecutor");
        C10601Ob ob = new C10601Ob(uiVar);
        C10868W0 a = C10611Oh.m27142a();
        Intrinsics.checkNotNullExpressionValue(a, "YandexMetricaSelfReportFacade.getReporter()");
        return new C10515Mb(uiVar, bVar, defaultR, h, new C10701Rb(ob, new C10664Qb(uiVar, a)));
    }
}
