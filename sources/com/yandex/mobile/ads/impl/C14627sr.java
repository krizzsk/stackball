package com.yandex.mobile.ads.impl;

import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.sr */
class C14627sr {
    C14627sr() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C14008mr mo70045a(C14697tn tnVar, String str) {
        List<C14008mr> l = tnVar.mo66154l();
        if (l == null) {
            return null;
        }
        for (C14008mr next : l) {
            if (str.equals(next.f37494a)) {
                return next;
            }
        }
        return null;
    }
}
