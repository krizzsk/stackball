package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.yandex.metrica.impl.ob.rc */
public class C11713rc implements C11109cc {

    /* renamed from: a */
    private final String f28081a;

    /* renamed from: b */
    private final C11680qc f28082b;

    public C11713rc(String str) {
        this(str, new C11680qc());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.yandex.metrica.impl.ob.ac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.p265ob.C11078bc m30194b(android.content.Context r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "com.yandex.metrica.identifiers.AdsIdentifiersProvider"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "requestIdentifiers"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = r7.f28081a
            java.lang.String r6 = "com.yandex.metrica.identifiers.extra.PROVIDER"
            r2.putString(r6, r3)
            com.yandex.metrica.impl.ob.qc r3 = r7.f28082b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r8
            r1[r5] = r2
            r8 = 0
            java.lang.Object r0 = r0.invoke(r8, r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r3.getClass()
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "com.yandex.metrica.identifiers.extra.TRACKING_INFO"
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 == 0) goto L_0x0090
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.ac$a> r2 = com.yandex.metrica.impl.p265ob.C11629pc.f27912a
            java.lang.String r3 = r1.getString(r6)
            java.lang.Object r2 = r2.get(r3)
            if (r2 == 0) goto L_0x006c
            com.yandex.metrica.impl.ob.ac$a r2 = (com.yandex.metrica.impl.p265ob.C11037ac.C11038a) r2
            java.lang.String r3 = "com.yandex.metrica.identifiers.extra.ID"
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r4 = "com.yandex.metrica.identifiers.extra.LIMITED"
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L_0x0065
            boolean r8 = r1.getBoolean(r4)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
        L_0x0065:
            com.yandex.metrica.impl.ob.ac r1 = new com.yandex.metrica.impl.ob.ac
            r1.<init>(r2, r3, r8)
            r8 = r1
            goto L_0x0090
        L_0x006c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Provider "
            r8.append(r0)
            java.lang.String r0 = r1.getString(r6)
            r8.append(r0)
            java.lang.String r0 = " is invalid"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L_0x0090:
            java.lang.String r1 = "com.yandex.metrica.identifiers.extra.STATUS"
            java.lang.String r1 = r0.getString(r1)
            com.yandex.metrica.impl.ob.e1 r1 = com.yandex.metrica.impl.p265ob.C11171e1.m28808a(r1)
            java.lang.String r2 = "com.yandex.metrica.identifiers.extra.ERROR_MESSAGE"
            java.lang.String r0 = r0.getString(r2)
            com.yandex.metrica.impl.ob.bc r2 = new com.yandex.metrica.impl.ob.bc
            r2.<init>(r8, r1, r0)
            r8 = r2
        L_0x00a6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11713rc.m30194b(android.content.Context):com.yandex.metrica.impl.ob.bc");
    }

    /* renamed from: a */
    public C11078bc mo62727a(Context context) {
        return mo62728a(context, new C11525mc());
    }

    C11713rc(String str, C11680qc qcVar) {
        this.f28081a = str;
        this.f28082b = qcVar;
    }

    /* renamed from: a */
    public C11078bc mo62728a(Context context, C11560nc ncVar) {
        C11078bc bcVar;
        ncVar.mo63378c();
        C11078bc bcVar2 = null;
        while (ncVar.mo63377b()) {
            try {
                return m30194b(context);
            } catch (InvocationTargetException e) {
                String message = e.getTargetException() != null ? e.getTargetException().getMessage() : null;
                bcVar = new C11078bc((C11037ac) null, C11171e1.UNKNOWN, "exception while fetching " + this.f28081a + " adv_id: " + message);
                bcVar2 = bcVar;
                try {
                    Thread.sleep((long) ncVar.mo63376a());
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                bcVar = new C11078bc((C11037ac) null, C11171e1.UNKNOWN, "exception while fetching " + this.f28081a + " adv_id: " + th.getMessage());
                bcVar2 = bcVar;
                Thread.sleep((long) ncVar.mo63376a());
            }
        }
        return bcVar2 == null ? new C11078bc() : bcVar2;
    }
}
