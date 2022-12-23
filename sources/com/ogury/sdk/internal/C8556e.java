package com.ogury.sdk.internal;

import com.google.common.net.HttpHeaders;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.sdk.internal.e */
/* compiled from: MonitoringInfoHeaders.kt */
public final class C8556e {

    /* renamed from: a */
    private final C8558f f21779a;

    static {
        new C8557a((byte) 0);
    }

    public C8556e(C8558f fVar) {
        C8567m.m24059b(fVar, "monitoringInfoHelper");
        this.f21779a = fVar;
    }

    /* renamed from: a */
    public final Map<String, String> mo54037a() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(HttpHeaders.CONTENT_ENCODING, "gzip");
        linkedHashMap.put("Content-Type", WebRequest.CONTENT_TYPE_JSON);
        linkedHashMap.put("Asset-Key", this.f21779a.mo54038a());
        try {
            linkedHashMap.put("Package-Name", this.f21779a.mo54039c());
        } catch (Exception unused) {
        }
        return linkedHashMap;
    }

    /* renamed from: com.ogury.sdk.internal.e$a */
    /* compiled from: MonitoringInfoHeaders.kt */
    public static final class C8557a {
        private C8557a() {
        }

        public /* synthetic */ C8557a(byte b) {
            this();
        }
    }
}
