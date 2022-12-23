package com.ogury.p244cm.internal;

import android.content.Context;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p244cm.OguryChoiceManager;
import com.ogury.p244cm.OguryCmConfig;

/* renamed from: com.ogury.cm.internal.InternalCM */
public final class InternalCM {

    /* renamed from: a */
    public static final InternalCM f20252a = new InternalCM();

    private InternalCM() {
    }

    public static final String getVersion() {
        return "3.3.0";
    }

    public static final void setChildUnderCoppaTreatment(Boolean bool) {
        aacac aacac = aacac.f20366a;
        aacac.m21778a("IS_CHILD_UNDER_COPPA", bool);
    }

    public static final void setUnderAgeOfGdprConsentTreatment(Boolean bool) {
        aacac aacac = aacac.f20366a;
        aacac.m21778a("IS_UNDER_AGE_OF_GDPR_CONSENT", bool);
    }

    public static final void start(Context context, String str, OguryEventBuses oguryEventBuses) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(str, "assetKey");
        bbabc.m22051b(oguryEventBuses, "eventBuses");
        OguryIntegrationLogger.m22104d("[Consent] Module started");
        OguryChoiceManager.initialize$default(context, str, (OguryCmConfig) null, 4, (Object) null);
        aabcb aabcb = aabcb.f20360a;
        String token = InternalCore.getToken(context, "consent_token");
        bbabc.m22048a((Object) token, "InternalCore.getToken(context, \"consent_token\")");
        aabcb.m21763a(context, str, token);
        aabca aabca = aabca.f20358a;
        aabca.m21761a(oguryEventBuses);
    }
}
