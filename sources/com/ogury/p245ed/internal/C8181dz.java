package com.ogury.p245ed.internal;

import android.content.Context;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.ed.internal.dz */
public final class C8181dz extends C8166dr {

    /* renamed from: a */
    private final C8165dq f21169a;

    public /* synthetic */ C8181dz(Context context, C8165dq dqVar) {
        this(context, new C8216fa(context), new C8244fx(context), dqVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C8181dz(Context context, C8216fa faVar, C8244fx fxVar, C8165dq dqVar) {
        super(context, faVar, fxVar);
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C8467mq.m23881b(fxVar, "coreWrapper");
        C8467mq.m23881b(dqVar, "configurableRequestFieldPermission");
        this.f21169a = dqVar;
    }

    /* renamed from: a */
    public final String mo53310a() {
        if (!this.f21169a.mo53313b()) {
            return "00000000-0000-0000-0000-000000000000";
        }
        String id = mo53315c().mo53566a().getId();
        C8467mq.m23878a((Object) id, "{\n            coreWrapper.getAaid().id\n        }");
        return id;
    }
}
