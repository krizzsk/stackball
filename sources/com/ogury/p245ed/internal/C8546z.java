package com.ogury.p245ed.internal;

import android.app.Application;
import com.ogury.p245ed.internal.C8020aj;

/* renamed from: com.ogury.ed.internal.z */
public final class C8546z {

    /* renamed from: a */
    private final C8039ap f21772a;

    public C8546z(C8039ap apVar) {
        C8467mq.m23881b(apVar, "interstitialShowCommand");
        this.f21772a = apVar;
    }

    /* renamed from: a */
    public final C8020aj mo54016a(Application application, C8248g gVar) {
        C8467mq.m23881b(application, "application");
        C8467mq.m23881b(gVar, "adLayout");
        C8011ae aeVar = new C8011ae(gVar);
        C8020aj.C8021a aVar = new C8020aj.C8021a(application, gVar, new C8038ao(C8193ej.SMALL_BANNER, this.f21772a), false);
        aVar.mo53174a(aeVar);
        return aVar.mo53189p();
    }
}
