package com.ogury.p245ed.internal;

import android.app.Application;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ce */
public final class C8096ce implements C8044au {

    /* renamed from: a */
    private final C8443lv<C8185eb, List<C8185eb>, C8386ke> f21016a;

    public C8096ce(C8443lv<? super C8185eb, ? super List<C8185eb>, C8386ke> lvVar) {
        C8467mq.m23881b(lvVar, "showNextAd");
        this.f21016a = lvVar;
    }

    /* renamed from: a */
    public final boolean mo53120a(Application application, List<C8185eb> list, String str) {
        C8467mq.m23881b(application, "application");
        C8467mq.m23881b(list, CampaignUnit.JSON_KEY_ADS);
        C8467mq.m23881b(str, "nextAdId");
        C8185eb a = C8107cm.m22598a(list, str);
        if (a == null) {
            return false;
        }
        this.f21016a.mo53233a(a, list);
        return true;
    }
}
