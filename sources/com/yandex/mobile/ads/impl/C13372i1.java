package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.i1 */
public class C13372i1 {

    /* renamed from: a */
    private final Map<og0, C13270h1> f34725a;

    public C13372i1(List<og0> list) {
        this.f34725a = m37250a(list);
    }

    /* renamed from: a */
    public C13270h1 mo67707a(og0 og0) {
        C13270h1 h1Var = this.f34725a.get(og0);
        return h1Var != null ? h1Var : C13270h1.UNKNOWN;
    }

    /* renamed from: a */
    public void mo67708a(og0 og0, C13270h1 h1Var) {
        if (h1Var == C13270h1.PREPARING) {
            for (og0 next : this.f34725a.keySet()) {
                C13270h1 h1Var2 = this.f34725a.get(next);
                if (C13270h1.PREPARING.equals(h1Var2) || C13270h1.PREPARED.equals(h1Var2)) {
                    this.f34725a.put(next, C13270h1.INITIAL);
                }
            }
        }
        this.f34725a.put(og0, h1Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67709a() {
        /*
            r3 = this;
            java.util.Map<com.yandex.mobile.ads.impl.og0, com.yandex.mobile.ads.impl.h1> r0 = r3.f34725a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            com.yandex.mobile.ads.impl.h1 r1 = (com.yandex.mobile.ads.impl.C13270h1) r1
            com.yandex.mobile.ads.impl.h1 r2 = com.yandex.mobile.ads.impl.C13270h1.PAUSED
            if (r1 == r2) goto L_0x001e
            com.yandex.mobile.ads.impl.h1 r2 = com.yandex.mobile.ads.impl.C13270h1.PLAYING
            if (r1 != r2) goto L_0x000a
        L_0x001e:
            r0 = 1
            return r0
        L_0x0020:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13372i1.mo67709a():boolean");
    }

    /* renamed from: a */
    private Map<og0, C13270h1> m37250a(List<og0> list) {
        HashMap hashMap = new HashMap();
        for (og0 put : list) {
            hashMap.put(put, C13270h1.INITIAL);
        }
        return hashMap;
    }
}
