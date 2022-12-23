package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.C12127t;
import java.util.HashMap;
import java.util.Map;

class xq0 {

    /* renamed from: a */
    private static final Map<C12127t, wq0> f42671a = new C15203a();

    /* renamed from: com.yandex.mobile.ads.impl.xq0$a */
    class C15203a extends HashMap<C12127t, wq0> {
        C15203a() {
            put(C12127t.AD, new zs0());
            put(C12127t.BULK, new ns0());
            put(C12127t.SLIDER, new j91());
        }
    }

    xq0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public wq0 mo70934a(C12127t tVar) {
        return (wq0) ((HashMap) f42671a).get(tVar);
    }
}
