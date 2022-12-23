package com.ogury.p245ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;
import p269io.presage.interstitial.p270ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gw */
public final class C8276gw implements C8534t {

    /* renamed from: a */
    public static final C8276gw f21393a = new C8276gw();

    /* renamed from: b */
    private static InterstitialActivity.C15581a f21394b = InterstitialActivity.f44191a;

    private C8276gw() {
    }

    /* renamed from: a */
    public final void mo53251a(Context context, List<C8185eb> list) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(list, CampaignUnit.JSON_KEY_ADS);
        if (!list.isEmpty()) {
            f21394b.mo53196a(context, list.remove(0), list);
        }
    }
}
