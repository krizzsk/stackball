package com.ogury.p245ed.internal;

import android.content.Context;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;
import p269io.presage.common.PresageSdk;

/* renamed from: com.ogury.ed.internal.InternalAds */
public final class InternalAds {

    /* renamed from: a */
    public static final InternalAds f20803a = new InternalAds();

    private InternalAds() {
    }

    public static final void start(Context context, String str, OguryEventBuses oguryEventBuses) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(str, "assetKey");
        C8467mq.m23881b(oguryEventBuses, "eventBuses");
        OguryIntegrationLogger.m22104d("[Ads] Module started");
        C8126cz czVar = C8126cz.f21060a;
        C8126cz.m22644a(oguryEventBuses);
        PresageSdk presageSdk = PresageSdk.f44180a;
        PresageSdk.m45481a(new C8125cy(context, str));
    }

    public static final String getVersion() {
        return PresageSdk.getAdsSdkVersion();
    }

    public static final void setChildUnderCoppaTreatment(Boolean bool) {
        C8132dc dcVar = C8132dc.f21070a;
        C8132dc.m22655a("IS_CHILD_UNDER_COPPA", bool);
    }

    public static final void setUnderAgeOfGdprConsentTreatment(Boolean bool) {
        C8132dc dcVar = C8132dc.f21070a;
        C8132dc.m22655a("IS_UNDER_AGE_OF_GDPR_CONSENT", bool);
    }
}
