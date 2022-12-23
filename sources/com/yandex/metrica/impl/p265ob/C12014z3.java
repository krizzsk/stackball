package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.z3 */
public final class C12014z3 {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = r1.getField("VERSION_NAME");
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.yandex.metrica.billing_interface.C10069b m31038a() {
        /*
            r0 = 0
            java.lang.String r1 = "com.android.billingclient.BuildConfig"
            java.lang.Class r1 = com.yandex.metrica.impl.p265ob.C10122B2.m26038b((java.lang.String) r1)     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = "VERSION_NAME"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001a }
            goto L_0x0017
        L_0x0016:
            r1 = r0
        L_0x0017:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r1 = r0
        L_0x001b:
            if (r1 != 0) goto L_0x0020
            com.yandex.metrica.billing_interface.b r0 = com.yandex.metrica.billing_interface.C10069b.NONE
            goto L_0x0045
        L_0x0020:
            java.lang.String r2 = "2."
            r3 = 0
            r4 = 2
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r1, r2, r3, r4, r0)
            if (r2 == 0) goto L_0x002d
            com.yandex.metrica.billing_interface.b r0 = com.yandex.metrica.billing_interface.C10069b.LIBRARY_V3
            goto L_0x0045
        L_0x002d:
            java.lang.String r2 = "3."
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r1, r2, r3, r4, r0)
            if (r2 == 0) goto L_0x0038
            com.yandex.metrica.billing_interface.b r0 = com.yandex.metrica.billing_interface.C10069b.LIBRARY_V3
            goto L_0x0045
        L_0x0038:
            java.lang.String r2 = "4."
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r1, r2, r3, r4, r0)
            if (r0 == 0) goto L_0x0043
            com.yandex.metrica.billing_interface.b r0 = com.yandex.metrica.billing_interface.C10069b.LIBRARY_V4
            goto L_0x0045
        L_0x0043:
            com.yandex.metrica.billing_interface.b r0 = com.yandex.metrica.billing_interface.C10069b.LIBRARY_V4
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C12014z3.m31038a():com.yandex.metrica.billing_interface.b");
    }
}
