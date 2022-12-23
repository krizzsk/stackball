package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.billing_interface.C10075g;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.o */
public final class C11573o implements C11830v {

    /* renamed from: a */
    private final C10075g f27802a;

    public C11573o(C10075g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "systemTimeProvider");
        this.f27802a = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
        if ((r3 - r5.f24203e) >= java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r10.f27868a)) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        if ((r3 - r2.f24202d) <= java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r10.f27869b)) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x001c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, com.yandex.metrica.billing_interface.C10068a> mo63136a(com.yandex.metrica.impl.p265ob.C11614p r10, java.util.Map<java.lang.String, ? extends com.yandex.metrica.billing_interface.C10068a> r11, com.yandex.metrica.impl.p265ob.C11727s r12) {
        /*
            r9 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "history"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "storage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x001c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0094
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.yandex.metrica.billing_interface.a r2 = (com.yandex.metrica.billing_interface.C10068a) r2
            com.yandex.metrica.billing_interface.g r3 = r9.f27802a
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            com.yandex.metrica.billing_interface.e r5 = r2.f24199a
            com.yandex.metrica.billing_interface.e r6 = com.yandex.metrica.billing_interface.C10073e.INAPP
            r7 = 1
            if (r5 != r6) goto L_0x0055
            boolean r5 = r12.mo63054a()
            if (r5 != 0) goto L_0x0055
            long r5 = r2.f24202d
            long r3 = r3 - r5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            int r5 = r10.f27869b
            long r5 = (long) r5
            long r5 = r2.toMillis(r5)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0085
            goto L_0x0086
        L_0x0055:
            java.lang.String r5 = r2.f24200b
            com.yandex.metrica.billing_interface.a r5 = r12.mo63052a((java.lang.String) r5)
            if (r5 == 0) goto L_0x0086
            java.lang.String r6 = "storage[historyEntry.sku] ?: return true"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = r5.f24201c
            java.lang.String r8 = r2.f24201c
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r8)
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x006e
            goto L_0x0086
        L_0x006e:
            com.yandex.metrica.billing_interface.e r2 = r2.f24199a
            com.yandex.metrica.billing_interface.e r6 = com.yandex.metrica.billing_interface.C10073e.SUBS
            if (r2 != r6) goto L_0x0085
            long r5 = r5.f24203e
            long r3 = r3 - r5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            int r5 = r10.f27868a
            long r5 = (long) r5
            long r5 = r2.toMillis(r5)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r7 = 0
        L_0x0086:
            if (r7 == 0) goto L_0x001c
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L_0x001c
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11573o.mo63136a(com.yandex.metrica.impl.ob.p, java.util.Map, com.yandex.metrica.impl.ob.s):java.util.Map");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11573o(C10075g gVar, int i) {
        this((i & 1) != 0 ? new C10075g() : null);
    }
}
