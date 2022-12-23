package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.tapjoy.internal.il */
public final class C9421il extends C9417ii {

    /* renamed from: c */
    private final C9247fa f23404c;

    /* renamed from: d */
    private final C9229eu f23405d;

    /* renamed from: e */
    private final C9268fh f23406e;

    /* renamed from: f */
    private final String f23407f;

    /* renamed from: c */
    public final String mo57905c() {
        return "api/v1/tokens";
    }

    private C9421il(C9247fa faVar, C9229eu euVar, C9268fh fhVar, String str) {
        this.f23404c = faVar;
        this.f23405d = euVar;
        this.f23406e = fhVar;
        this.f23407f = str;
    }

    public C9421il(C9250fb fbVar, String str) {
        this(fbVar.f22800d, fbVar.f22801e, fbVar.f22802f, str);
    }

    /* renamed from: e */
    public final Map mo57907e() {
        Map e = super.mo57907e();
        e.put(TJAdUnitConstants.String.VIDEO_INFO, new C9100bm(C9379hp.m25206a(this.f23404c)));
        e.put(TapjoyConstants.TJC_APP_PLACEMENT, new C9100bm(C9379hp.m25202a(this.f23405d)));
        e.put("user", new C9100bm(C9379hp.m25207a(this.f23406e)));
        if (!C9067al.m24297a(this.f23407f)) {
            e.put("push_token", this.f23407f);
        }
        return e;
    }
}
