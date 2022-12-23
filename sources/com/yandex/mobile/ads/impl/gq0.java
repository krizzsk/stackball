package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.C15511m0;
import java.util.HashMap;
import java.util.Map;

public class gq0 {

    /* renamed from: a */
    private static final Map<C15511m0, fq0> f34084a = new C13229a();

    /* renamed from: com.yandex.mobile.ads.impl.gq0$a */
    class C13229a extends HashMap<C15511m0, fq0> {
        C13229a() {
            put(C15511m0.APP_INSTALL, new C13689k8());
            put(C15511m0.CONTENT, new C14758uh());
            put(C15511m0.f43908e, new cd0());
        }
    }

    /* renamed from: a */
    public fq0 mo67343a(C15511m0 m0Var) {
        if (m0Var != null) {
            return (fq0) ((HashMap) f34084a).get(m0Var);
        }
        return null;
    }
}
