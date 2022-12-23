package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2746f;

/* renamed from: com.fyber.inneractive.sdk.config.aa */
public final class C2768aa {
    /* renamed from: a */
    public static int m6041a(C2767s sVar) {
        return sVar != null ? ((C2746f) sVar.mo18010a(C2746f.class)).mo17981a("load_timeout_wifi", 10) : IAConfigManager.m5929c().f6586a.mo18046a("VASTLoadTimeoutWiFi", 10, 1);
    }

    /* renamed from: b */
    public static int m6042b(C2767s sVar) {
        return sVar != null ? ((C2746f) sVar.mo18010a(C2746f.class)).mo17981a("load_timeout_3g", 30) : IAConfigManager.m5929c().f6586a.mo18046a("VASTLoadTimeout3G", 30, 1);
    }
}
