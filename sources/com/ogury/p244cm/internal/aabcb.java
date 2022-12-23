package com.ogury.p244cm.internal;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p244cm.internal.aaaca;

/* renamed from: com.ogury.cm.internal.aabcb */
public final class aabcb {

    /* renamed from: a */
    public static final aabcb f20360a = new aabcb();

    /* renamed from: b */
    private static aaabb f20361b;

    /* renamed from: c */
    private static aaaca f20362c;

    /* renamed from: com.ogury.cm.internal.aabcb$aaaaa */
    public static final class aaaaa implements aaaca.aaaaa {
        aaaaa() {
        }

        /* renamed from: a */
        public final void mo52637a(int i, String str) {
            bbabc.m22051b(str, "consentString");
            OguryIntegrationLogger.m22104d("[Consent][external] TCF consent data detected");
            aabcb aabcb = aabcb.f20360a;
            aabcb.m21764a(new aabab(i, str, aabba.AUTOMATIC));
        }
    }

    private aabcb() {
    }

    /* renamed from: a */
    public static void m21763a(Context context, String str, String str2) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(str, "assetKey");
        bbabc.m22051b(str2, "consentToken");
        OguryIntegrationLogger.m22104d("[Consent][External] Setting up...");
        if (!((f20361b == null || f20362c == null) ? false : true)) {
            f20361b = new aaabb(context, str, str2);
            OguryIntegrationLogger.m22104d("[Consent][External][setup] Completed!");
            aaaca aaaca = new aaaca(new aaacb(context));
            f20362c = aaaca;
            aaaca.mo52636a(new aaaaa());
            return;
        }
        OguryIntegrationLogger.m22104d("[Consent][External][setup] Already set up!");
    }

    /* renamed from: a */
    public static void m21764a(aaacc aaacc) {
        bbabc.m22051b(aaacc, "externalConsentData");
        OguryIntegrationLogger.m22104d("[Consent][external] Passing external consent data...");
        aaabb aaabb = f20361b;
        if (aaabb != null) {
            if (aaabb == null) {
                bbabc.m22047a();
            }
            aaabb.mo52634a(aaacc);
            return;
        }
        OguryIntegrationLogger.m22105e("Failed to pass external consent data (bad internal initialization)");
    }
}
