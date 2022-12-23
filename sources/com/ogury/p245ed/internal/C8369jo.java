package com.ogury.p245ed.internal;

import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.ogury.ed.internal.jo */
public final class C8369jo {

    /* renamed from: a */
    public static final C8369jo f21619a = new C8369jo();

    /* renamed from: b */
    private static boolean f21620b;

    private C8369jo() {
    }

    /* renamed from: a */
    public static void m23724a(Throwable th) {
        C8467mq.m23881b(th, "error");
        if (f21620b) {
            Log.e(CampaignEx.KEY_OMID, "caught_error", th);
        }
    }
}
