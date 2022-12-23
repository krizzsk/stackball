package com.ogury.p245ed.internal;

import android.content.Context;
import com.google.common.net.HttpHeaders;
import com.ogury.core.internal.network.HeadersLoader;
import com.tapjoy.TapjoyConstants;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.dr */
public abstract class C8166dr implements HeadersLoader {

    /* renamed from: a */
    private final Context f21139a;

    /* renamed from: b */
    private final C8216fa f21140b;

    /* renamed from: c */
    private final C8244fx f21141c;

    /* renamed from: a */
    public abstract String mo53310a();

    public C8166dr(Context context, C8216fa faVar, C8244fx fxVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C8467mq.m23881b(fxVar, "coreWrapper");
        this.f21139a = context;
        this.f21140b = faVar;
        this.f21141c = fxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C8216fa mo53314b() {
        return this.f21140b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C8244fx mo53315c() {
        return this.f21141c;
    }

    public Map<String, String> loadHeaders() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Content-Type", WebRequest.CONTENT_TYPE_JSON);
        linkedHashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
        linkedHashMap.put(HttpHeaders.CONTENT_ENCODING, "gzip");
        linkedHashMap.put("Device-OS", "android");
        linkedHashMap.put("User-Agent", this.f21140b.mo53476e());
        linkedHashMap.put("Package-Name", this.f21140b.mo53477f());
        linkedHashMap.put("User", mo53310a());
        linkedHashMap.put("Instance-Token", this.f21141c.mo53569d());
        return linkedHashMap;
    }
}
