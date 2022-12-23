package com.ogury.p245ed.internal;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.dn */
public final class C8162dn extends C8166dr {

    /* renamed from: a */
    private final C8212ez f21130a;

    /* renamed from: b */
    private final C8165dq f21131b;

    public /* synthetic */ C8162dn(Context context, C8165dq dqVar) {
        this(context, new C8216fa(context), new C8244fx(context), new C8212ez(context), dqVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C8162dn(Context context, C8216fa faVar, C8244fx fxVar, C8212ez ezVar, C8165dq dqVar) {
        super(context, faVar, fxVar);
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C8467mq.m23881b(fxVar, "coreWrapper");
        C8467mq.m23881b(ezVar, "androidDevice");
        C8467mq.m23881b(dqVar, "configurableRequestFieldPermission");
        this.f21130a = ezVar;
        this.f21131b = dqVar;
    }

    public final Map<String, String> loadHeaders() {
        Map<String, String> loadHeaders = super.loadHeaders();
        loadHeaders.put("WebView-User-Agent", mo53314b().mo53478g());
        loadHeaders.put(ExifInterface.TAG_ORIENTATION, this.f21130a.mo53461n());
        return loadHeaders;
    }

    /* renamed from: a */
    public final String mo53310a() {
        if (!this.f21131b.mo53312a()) {
            return "00000000-0000-0000-0000-000000000000";
        }
        String id = mo53315c().mo53566a().getId();
        C8467mq.m23878a((Object) id, "{\n            coreWrapper.getAaid().id\n        }");
        return id;
    }
}
