package com.ogury.p245ed.internal;

import android.app.Application;
import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;
import p269io.presage.interstitial.p270ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gx */
public final class C8277gx implements C8044au {

    /* renamed from: a */
    private final InterstitialActivity.C15581a f21395a;

    public /* synthetic */ C8277gx() {
        this(InterstitialActivity.f44191a);
    }

    private C8277gx(InterstitialActivity.C15581a aVar) {
        C8467mq.m23881b(aVar, "interstitialStartCommand");
        this.f21395a = aVar;
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
        this.f21395a.mo53196a((Context) application, a, list);
        return true;
    }
}
