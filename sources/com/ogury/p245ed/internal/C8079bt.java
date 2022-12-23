package com.ogury.p245ed.internal;

import android.app.Application;

/* renamed from: com.ogury.ed.internal.bt */
public final class C8079bt {

    /* renamed from: a */
    private final C8039ap f20981a;

    public C8079bt(C8039ap apVar) {
        C8467mq.m23881b(apVar, "interstitialShowCommand");
        this.f20981a = apVar;
    }

    /* renamed from: a */
    public final C8076bs mo53234a(Application application, C8095cd cdVar, C8105ck ckVar) {
        C8467mq.m23881b(application, "application");
        C8467mq.m23881b(cdVar, "publisherActivityFilter");
        C8467mq.m23881b(ckVar, "publisherFragmentFilter");
        return new C8076bs(application, new C8087bx(cdVar, ckVar), this.f20981a);
    }
}
