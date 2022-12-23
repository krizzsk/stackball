package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.C2791i;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.util.e */
public final class C3647e {
    /* renamed from: a */
    public static boolean m9075a(UnitDisplayType unitDisplayType, C2791i iVar) {
        return !unitDisplayType.isFullscreenUnit() || iVar.mo18049a("use_fraud_detection_fullscreen", true);
    }
}
