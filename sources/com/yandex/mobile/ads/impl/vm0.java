package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.mediation.base.C15434a;
import com.yandex.mobile.ads.mediation.base.C15435b;
import java.util.HashMap;
import java.util.Map;

public class vm0 implements C14157o0 {

    /* renamed from: a */
    private final C15435b f41325a = new C15435b();

    /* renamed from: b */
    private final nm0 f41326b;

    public vm0(nm0 nm0) {
        this.f41326b = nm0;
    }

    /* renamed from: a */
    public Map<String, Object> mo69092a() {
        i41 i41 = new i41(new HashMap());
        nm0 nm0 = this.f41326b;
        if (nm0 != null) {
            hn0 b = nm0.mo69063b();
            C15434a a = this.f41326b.mo69061a();
            i41.mo67733b("adapter", b.mo67571c());
            i41.mo67733b("adapter_parameters", b.mo67576g());
            i41.mo67732a((Map<String, Object>) new HashMap(this.f41325a.mo71388a(a)));
        }
        return i41.mo67729a();
    }
}
