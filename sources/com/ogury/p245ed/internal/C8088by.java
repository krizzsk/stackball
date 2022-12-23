package com.ogury.p245ed.internal;

import android.app.Application;
import com.ogury.p245ed.internal.C8020aj;

/* renamed from: com.ogury.ed.internal.by */
public final class C8088by {

    /* renamed from: a */
    private final C8039ap f21007a;

    public C8088by(C8039ap apVar) {
        C8467mq.m23881b(apVar, "interstitialShowCommand");
        this.f21007a = apVar;
    }

    /* renamed from: a */
    public final C8020aj mo53253a(Application application, C8248g gVar) {
        C8467mq.m23881b(application, "application");
        C8467mq.m23881b(gVar, "adLayout");
        return new C8020aj.C8021a(application, gVar, new C8038ao(C8193ej.OVERLAY_THUMBNAIL, this.f21007a), false).mo53189p();
    }
}
