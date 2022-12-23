package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.n5 */
public class C14056n5 implements gz0 {

    /* renamed from: a */
    private final h41.C13277c f37643a;

    /* renamed from: b */
    private final String f37644b;

    public C14056n5(h41.C13277c cVar, String str) {
        this.f37643a = cVar;
        this.f37644b = str;
    }

    /* renamed from: a */
    public Map<String, Object> mo67135a(long j) {
        i41 i41 = new i41(new HashMap());
        i41.mo67733b("adapter", this.f37644b);
        i41.mo67733b("status", this.f37643a.mo67417a());
        i41.mo67733b("duration", Long.valueOf(j));
        return i41.mo67729a();
    }
}
