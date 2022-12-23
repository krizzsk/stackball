package com.ogury.sdk.internal;

import com.ogury.core.internal.network.HeadersLoader;
import java.util.Map;

/* renamed from: com.ogury.sdk.internal.j */
/* compiled from: MonitoringRequestHeader.kt */
public final class C8564j implements HeadersLoader {

    /* renamed from: a */
    private final C8558f f21786a;

    public C8564j(C8558f fVar) {
        C8567m.m24059b(fVar, "monitoringInfoHelper");
        this.f21786a = fVar;
    }

    public final Map<String, String> loadHeaders() {
        return new C8556e(this.f21786a).mo54037a();
    }
}
