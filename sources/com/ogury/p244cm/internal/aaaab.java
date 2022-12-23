package com.ogury.p244cm.internal;

import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p244cm.OguryCmConfig;

/* renamed from: com.ogury.cm.internal.aaaab */
public final class aaaab {

    /* renamed from: a */
    public static final aaaab f20280a = new aaaab();

    /* renamed from: b */
    private static aaaaa f20281b;

    private aaaab() {
    }

    /* renamed from: a */
    public static aaaaa m21684a(OguryCmConfig oguryCmConfig) {
        bbabc.m22051b(oguryCmConfig, "oguryCmConfig");
        if (f20281b != null) {
            return f20281b;
        }
        if (oguryCmConfig.getCcpafVersion() != 1) {
            OguryIntegrationLogger.m22105e("[Consent][setup] Failed to set up versions (CCPA version " + oguryCmConfig.getCcpafVersion() + " is not allowed)");
            throw new IllegalArgumentException("Bad CCPAF version used! Please use one of the declared ones in OguryChoiceManager class.");
        } else if (oguryCmConfig.getTcfVersion() == 2) {
            return new aaaaa(new aaaba(), (babac) null, 2, (bbabb) null);
        } else {
            OguryIntegrationLogger.m22105e("[Consent][setup] Failed to set up versions (TCF version " + oguryCmConfig.getTcfVersion() + " is not allowed)");
            throw new IllegalArgumentException("Bad TCF version used! Please use one of the declared ones in OguryChoiceManager class.");
        }
    }
}
