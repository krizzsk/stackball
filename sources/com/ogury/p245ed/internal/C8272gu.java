package com.ogury.p245ed.internal;

import android.app.Application;
import com.ogury.p245ed.internal.C8020aj;
import p269io.presage.interstitial.p270ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gu */
public final class C8272gu {

    /* renamed from: a */
    public static final C8272gu f21381a = new C8272gu();

    private C8272gu() {
    }

    /* renamed from: a */
    public static C8020aj m23232a(InterstitialActivity interstitialActivity, C8248g gVar, C8038ao aoVar) {
        C8467mq.m23881b(interstitialActivity, "activity");
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(aoVar, "expandToInterstitialViewCommand");
        Application application = interstitialActivity.getApplication();
        C8467mq.m23878a((Object) application, "activity.application");
        return new C8020aj.C8021a(application, gVar, aoVar, true).mo53189p();
    }
}
