package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class v10 {

    /* renamed from: a */
    private final List<Map<C14889vg, m10>> f41173a = new ArrayList();

    /* renamed from: a */
    public final boolean mo70438a(Map<C14889vg, m10> map) {
        Intrinsics.checkNotNullParameter(map, "logIds");
        return this.f41173a.add(map);
    }

    /* renamed from: b */
    public final boolean mo70440b(Map<C14889vg, m10> map) {
        return this.f41173a.remove(map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.yandex.mobile.ads.impl.vg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.yandex.mobile.ads.impl.C14889vg mo70437a(com.yandex.mobile.ads.impl.C14889vg r5) {
        /*
            r4 = this;
            java.lang.String r0 = "logId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.List<java.util.Map<com.yandex.mobile.ads.impl.vg, com.yandex.mobile.ads.impl.m10>> r0 = r4.f41173a
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.next()
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r1 = r1.keySet()
            int r3 = kotlin.collections.CollectionsKt.indexOf(r1, r5)
            if (r3 < 0) goto L_0x0029
            java.lang.Object r1 = kotlin.collections.CollectionsKt.elementAt(r1, (int) r3)
            r2 = r1
            com.yandex.mobile.ads.impl.vg r2 = (com.yandex.mobile.ads.impl.C14889vg) r2
        L_0x0029:
            if (r2 != 0) goto L_0x002c
            goto L_0x000b
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.v10.mo70437a(com.yandex.mobile.ads.impl.vg):com.yandex.mobile.ads.impl.vg");
    }

    /* renamed from: b */
    public final Map<C14889vg, m10> mo70439b(C14889vg vgVar) {
        T t;
        Intrinsics.checkNotNullParameter(vgVar, "logId");
        Iterator<T> it = this.f41173a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Map) t).containsKey(vgVar)) {
                break;
            }
        }
        return (Map) t;
    }
}
