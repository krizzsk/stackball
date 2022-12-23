package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.C15526t;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.vu */
public class C14934vu {
    /* renamed from: a */
    public C14535ru mo70592a(C15526t tVar) {
        List<C14535ru> b = tVar.mo71676b();
        if (b == null) {
            return null;
        }
        for (C14535ru next : b) {
            if ("ad".equals(next.mo69820c())) {
                return next;
            }
        }
        return null;
    }
}
