package com.ogury.p245ed.internal;

import android.app.Application;

/* renamed from: com.ogury.ed.internal.v */
public final class C8539v {

    /* renamed from: a */
    private final C8039ap f21756a;

    public C8539v(C8039ap apVar) {
        C8467mq.m23881b(apVar, "interstitialShowCommand");
        this.f21756a = apVar;
    }

    /* renamed from: a */
    public final C8535u mo54006a(Application application) {
        C8467mq.m23881b(application, "application");
        return new C8535u(application, this.f21756a);
    }
}
