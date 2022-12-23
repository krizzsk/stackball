package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.a8 */
class C11028a8 implements C10791Tm<String, Bundle, C10984Z7> {

    /* renamed from: a */
    private final C11521m8 f26509a;

    /* renamed from: b */
    private final C11625p8 f26510b;

    C11028a8() {
        this(new C11521m8(), new C11625p8());
    }

    C11028a8(C11521m8 m8Var, C11625p8 p8Var) {
        this.f26509a = m8Var;
        this.f26510b = p8Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1 = new com.yandex.metrica.impl.p265ob.C11593o8((java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x008b */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.p265ob.C10984Z7 mo61165a(java.lang.String r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "arg_hv"
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            goto L_0x0025
        L_0x000a:
            java.lang.String r1 = "arg_df"
            boolean r3 = r9.containsKey(r1)
            if (r3 == 0) goto L_0x0025
            java.lang.String r3 = "arg_ct"
            boolean r4 = r9.containsKey(r3)
            if (r4 != 0) goto L_0x001b
            goto L_0x0025
        L_0x001b:
            java.lang.String r1 = r9.getString(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0027
        L_0x0025:
            r5 = r2
            goto L_0x0030
        L_0x0027:
            long r3 = r9.getLong(r3)
            com.yandex.metrica.impl.ob.c8 r5 = new com.yandex.metrica.impl.ob.c8
            r5.<init>(r8, r1, r3)
        L_0x0030:
            if (r5 == 0) goto L_0x009c
            java.lang.String r8 = "arg_cd"
            java.lang.String r8 = r9.getString(r8)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x009c
            com.yandex.metrica.impl.ob.m8 r1 = r7.f26509a
            com.yandex.metrica.impl.ob.C4 r8 = r1.mo63316a((java.lang.String) r8)
            if (r8 == 0) goto L_0x009c
            com.yandex.metrica.impl.ob.p8 r1 = r7.f26510b
            java.lang.String r3 = "arg_rc"
            java.lang.String r9 = r9.getString(r3)
            java.lang.String r3 = ""
            if (r9 != 0) goto L_0x0053
            r9 = r3
        L_0x0053:
            r1.getClass()
            com.yandex.metrica.impl.ob.ym$a r1 = new com.yandex.metrica.impl.ob.ym$a     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0091 }
            r6 = 0
            byte[] r9 = android.util.Base64.decode(r9, r6)     // Catch:{ Exception -> 0x0091 }
            r4.<init>(r9)     // Catch:{ Exception -> 0x0091 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r9 = "arg_ee"
            java.lang.String r9 = r1.optString(r9, r3)     // Catch:{ Exception -> 0x008b }
            boolean r3 = r1.has(r0)     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x0076
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x008b }
            goto L_0x0077
        L_0x0076:
            r0 = r2
        L_0x0077:
            com.yandex.metrica.impl.ob.o8 r1 = new com.yandex.metrica.impl.ob.o8     // Catch:{ Exception -> 0x008b }
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x0080
            r9 = r2
        L_0x0080:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x0087
            r0 = r2
        L_0x0087:
            r1.<init>(r9, r0)     // Catch:{ Exception -> 0x008b }
            goto L_0x0096
        L_0x008b:
            com.yandex.metrica.impl.ob.o8 r1 = new com.yandex.metrica.impl.ob.o8     // Catch:{ Exception -> 0x0091 }
            r1.<init>(r2, r2)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0096
        L_0x0091:
            com.yandex.metrica.impl.ob.o8 r1 = new com.yandex.metrica.impl.ob.o8
            r1.<init>(r2, r2)
        L_0x0096:
            com.yandex.metrica.impl.ob.Z7 r9 = new com.yandex.metrica.impl.ob.Z7
            r9.<init>(r5, r8, r1)
            return r9
        L_0x009c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11028a8.mo61165a(java.lang.String, android.os.Bundle):com.yandex.metrica.impl.ob.Z7");
    }
}
