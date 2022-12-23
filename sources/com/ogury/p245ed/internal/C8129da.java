package com.ogury.p245ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.crash.OguryCrashReport;

/* renamed from: com.ogury.ed.internal.da */
public final class C8129da {

    /* renamed from: a */
    public static final C8129da f21066a = new C8129da();

    private C8129da() {
    }

    /* renamed from: a */
    public static void m22652a(Throwable th) {
        C8467mq.m23881b(th, "t");
        try {
            OguryCrashReport.logException(CampaignUnit.JSON_KEY_ADS, th);
        } catch (Throwable unused) {
        }
    }
}
