package com.ogury.p245ed.internal;

import android.content.Context;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.du */
public final class C8170du extends C8180dy {

    /* renamed from: a */
    private final C8165dq f21147a;

    public /* synthetic */ C8170du(Context context, C8165dq dqVar) {
        this(context, new C8216fa(context), new C8244fx(context), new C8212ez(context), dqVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C8170du(Context context, C8216fa faVar, C8244fx fxVar, C8212ez ezVar, C8165dq dqVar) {
        super(context, faVar, fxVar, ezVar);
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C8467mq.m23881b(fxVar, "coreWrapper");
        C8467mq.m23881b(ezVar, "androidDevice");
        C8467mq.m23881b(dqVar, "configurableRequestFieldPermission");
        this.f21147a = dqVar;
    }

    public final Map<String, String> loadHeaders() {
        Map<String, String> loadHeaders = super.loadHeaders();
        String id = this.f21147a.mo53313b() ? mo53315c().mo53566a().getId() : "00000000-0000-0000-0000-000000000000";
        C8467mq.m23878a((Object) id, "if (configurableRequestF…er.NO_DEVICE_ID\n        }");
        loadHeaders.put("User", id);
        return loadHeaders;
    }
}
