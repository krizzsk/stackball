package com.ogury.p245ed;

import com.ogury.p245ed.internal.C8132dc;
import com.ogury.p245ed.internal.C8467mq;

/* renamed from: com.ogury.ed.OguryAdRequests */
public final class OguryAdRequests {
    public static final String AD_CONTENT_THRESHOLD_G = "G";
    public static final String AD_CONTENT_THRESHOLD_MA = "MA";
    public static final String AD_CONTENT_THRESHOLD_PG = "PG";
    public static final String AD_CONTENT_THRESHOLD_T = "T";
    public static final String AD_CONTENT_THRESHOLD_UNSPECIFIED = "";
    public static final OguryAdRequests INSTANCE = new OguryAdRequests();

    private OguryAdRequests() {
    }

    public static final void setAdContentThreshold(String str) {
        C8467mq.m23881b(str, "adConsentThreshold");
        C8132dc dcVar = C8132dc.f21070a;
        C8132dc.m22656a("AD_CONTENT_THRESHOLD", str);
    }

    public static final String getAdContentThreshold() {
        C8132dc dcVar = C8132dc.f21070a;
        return C8132dc.m22659b("AD_CONTENT_THRESHOLD", "");
    }
}
