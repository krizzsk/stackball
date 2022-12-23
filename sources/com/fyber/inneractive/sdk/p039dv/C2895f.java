package com.fyber.inneractive.sdk.p039dv;

import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.p051j.C3018e;

/* renamed from: com.fyber.inneractive.sdk.dv.f */
public final class C2895f extends C3018e {

    /* renamed from: a */
    String f6852a;

    /* renamed from: a */
    public final InneractiveErrorCode mo18270a() {
        return mo18271a((InneractiveAdRequest) null, (C2767s) null);
    }

    /* renamed from: a */
    public final InneractiveErrorCode mo18271a(InneractiveAdRequest inneractiveAdRequest, C2767s sVar) {
        if (this.f6852a == null) {
            return InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        return null;
    }
}
