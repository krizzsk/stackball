package com.ogury.p245ed.internal;

import android.content.Context;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.dp */
public final class C8164dp {

    /* renamed from: a */
    private final Context f21132a;

    /* renamed from: b */
    private final C8212ez f21133b;

    /* renamed from: c */
    private final C8216fa f21134c;

    /* renamed from: d */
    private final C8244fx f21135d;

    private C8164dp(Context context, C8212ez ezVar, C8216fa faVar, C8244fx fxVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(ezVar, "androidDevice");
        C8467mq.m23881b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C8467mq.m23881b(fxVar, "coreWrapper");
        this.f21132a = context;
        this.f21133b = ezVar;
        this.f21134c = faVar;
        this.f21135d = fxVar;
    }

    public /* synthetic */ C8164dp(Context context) {
        this(context, new C8212ez(context), new C8216fa(context), new C8244fx(context));
    }

    /* renamed from: a */
    public final JSONObject mo53311a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("connectivity", this.f21133b.mo53457j());
        jSONObject.put("at", this.f21133b.mo53454g());
        jSONObject.put("build", 30105);
        jSONObject.put("version", "4.2.0");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f21134c.mo53473b());
        jSONObject.put("apps_publishers", jSONArray);
        return jSONObject;
    }
}
