package com.ogury.p245ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.dy */
public class C8180dy extends C8166dr {

    /* renamed from: a */
    private final C8212ez f21168a;

    /* renamed from: a */
    public final String mo53310a() {
        return "00000000-0000-0000-0000-000000000000";
    }

    public /* synthetic */ C8180dy(Context context) {
        this(context, new C8216fa(context), new C8244fx(context), new C8212ez(context));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8180dy(Context context, C8216fa faVar, C8244fx fxVar, C8212ez ezVar) {
        super(context, faVar, fxVar);
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C8467mq.m23881b(fxVar, "coreWrapper");
        C8467mq.m23881b(ezVar, "androidDevice");
        this.f21168a = ezVar;
    }

    public Map<String, String> loadHeaders() {
        Map<String, String> loadHeaders = super.loadHeaders();
        loadHeaders.put("Api-Key", "[" + mo53314b().mo53473b() + ']');
        loadHeaders.put("Sdk-Version", "[4.2.0]");
        loadHeaders.put("Timezone", C8212ez.m22973f());
        loadHeaders.put("Connectivity", this.f21168a.mo53457j());
        loadHeaders.put("Sdk-Version-Type", CampaignUnit.JSON_KEY_ADS);
        loadHeaders.put("Sdk-Type", String.valueOf(mo53315c().mo53567b()));
        return loadHeaders;
    }
}
