package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10135Be;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Ae */
public final class C10108Ae implements C10769T2<C10135Be.C10136a, C10459Le> {

    /* renamed from: a */
    private final boolean f24328a;

    public C10108Ae(C10135Be be) {
        boolean z;
        List<C10135Be.C10136a> list = be.f24402b;
        Intrinsics.checkNotNullExpressionValue(list, "stateFromDisk.candidates");
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C10135Be.C10136a) it.next()).f24405c == C10202E0.APP) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = true;
        this.f24328a = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.yandex.metrica.impl.p265ob.C10135Be.C10136a> invoke(java.util.List<? extends com.yandex.metrica.impl.p265ob.C10135Be.C10136a> r7, com.yandex.metrica.impl.p265ob.C10459Le r8) {
        /*
            r6 = this;
            com.yandex.metrica.impl.ob.Be$a r0 = new com.yandex.metrica.impl.ob.Be$a
            java.lang.String r1 = r8.f25109a
            org.json.JSONObject r2 = r8.f25110b
            com.yandex.metrica.impl.ob.E0 r3 = r8.f25113e
            r0.<init>(r1, r2, r3)
            boolean r1 = r7 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0018
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x0018
            goto L_0x0034
        L_0x0018:
            java.util.Iterator r1 = r7.iterator()
        L_0x001c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0034
            java.lang.Object r4 = r1.next()
            com.yandex.metrica.impl.ob.Be$a r4 = (com.yandex.metrica.impl.p265ob.C10135Be.C10136a) r4
            com.yandex.metrica.impl.ob.E0 r4 = r4.f24405c
            com.yandex.metrica.impl.ob.E0 r5 = r8.f25113e
            if (r4 != r5) goto L_0x0030
            r4 = 1
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            if (r4 == 0) goto L_0x001c
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            if (r2 == 0) goto L_0x0048
            com.yandex.metrica.impl.ob.E0 r8 = r0.f24405c
            com.yandex.metrica.impl.ob.E0 r1 = com.yandex.metrica.impl.p265ob.C10202E0.APP
            if (r8 != r1) goto L_0x0046
            boolean r8 = r6.f24328a
            if (r8 == 0) goto L_0x0046
            java.util.List r7 = kotlin.collections.CollectionsKt.plus(r7, r0)
            goto L_0x004c
        L_0x0046:
            r7 = 0
            goto L_0x004c
        L_0x0048:
            java.util.List r7 = kotlin.collections.CollectionsKt.plus(r7, r0)
        L_0x004c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10108Ae.invoke(java.util.List, com.yandex.metrica.impl.ob.Le):java.util.List");
    }
}
