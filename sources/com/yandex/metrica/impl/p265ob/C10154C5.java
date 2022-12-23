package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.C5 */
public class C10154C5 extends C11737s5 {

    /* renamed from: b */
    private final C11099c2 f24439b;

    /* renamed from: c */
    private final C10363I8 f24440c;

    /* renamed from: d */
    private final C10898Wn f24441d;

    public C10154C5(C11229f4 f4Var) {
        this(f4Var, f4Var.mo62889w(), C10619P0.m27164i().mo61885m(), new C10898Wn());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:17|18|19|20|21|(5:23|24|25|26|(3:28|29|30))|31|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo61047a(com.yandex.metrica.impl.p265ob.C11411k0 r8) {
        /*
            r7 = this;
            com.yandex.metrica.impl.ob.f4 r0 = r7.mo63623a()
            com.yandex.metrica.impl.ob.I8 r1 = r7.f24440c
            boolean r1 = r1.mo61499n()
            if (r1 != 0) goto L_0x0097
            com.yandex.metrica.impl.ob.jh r1 = r0.mo62880m()
            boolean r1 = r1.mo63086Q()
            if (r1 == 0) goto L_0x001b
            com.yandex.metrica.impl.ob.k0 r8 = com.yandex.metrica.impl.p265ob.C11411k0.m29417e((com.yandex.metrica.impl.p265ob.C11411k0) r8)
            goto L_0x001f
        L_0x001b:
            com.yandex.metrica.impl.ob.k0 r8 = com.yandex.metrica.impl.p265ob.C11411k0.m29415c((com.yandex.metrica.impl.p265ob.C11411k0) r8)
        L_0x001f:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.yandex.metrica.impl.ob.Wn r2 = r7.f24441d
            android.content.Context r3 = r0.mo62874g()
            com.yandex.metrica.impl.ob.c4 r4 = r0.mo62872e()
            java.lang.String r4 = r4.mo62716b()
            r2.getClass()
            r2 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ all -> 0x004c }
            r5 = 30
            boolean r5 = com.yandex.metrica.impl.p265ob.C10796U2.m27890a((int) r5)     // Catch:{ all -> 0x004c }
            if (r5 == 0) goto L_0x0047
            java.lang.String r3 = com.yandex.metrica.impl.p265ob.C10940Xn.m28233a(r3, r4)     // Catch:{ all -> 0x004c }
            goto L_0x004d
        L_0x0047:
            java.lang.String r3 = r3.getInstallerPackageName(r4)     // Catch:{ all -> 0x004c }
            goto L_0x004d
        L_0x004c:
            r3 = r2
        L_0x004d:
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = ""
        L_0x0051:
            java.lang.String r4 = "appInstaller"
            r1.put(r4, r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "preloadInfo"
            com.yandex.metrica.impl.ob.c2 r4 = r7.f24439b     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.F0 r4 = r4.mo61074a()     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.Le r4 = (com.yandex.metrica.impl.p265ob.C10459Le) r4     // Catch:{ all -> 0x0082 }
            boolean r5 = r4.f25111c     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x007f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0082 }
            r2.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = "trackingId"
            java.lang.String r6 = r4.f25109a     // Catch:{ all -> 0x007f }
            r2.put(r5, r6)     // Catch:{ all -> 0x007f }
            org.json.JSONObject r5 = r4.f25110b     // Catch:{ all -> 0x007f }
            int r5 = r5.length()     // Catch:{ all -> 0x007f }
            if (r5 <= 0) goto L_0x007f
            java.lang.String r5 = "additionalParams"
            org.json.JSONObject r4 = r4.f25110b     // Catch:{ all -> 0x007f }
            r2.put(r5, r4)     // Catch:{ all -> 0x007f }
        L_0x007f:
            r1.put(r3, r2)     // Catch:{ all -> 0x0082 }
        L_0x0082:
            com.yandex.metrica.impl.ob.u4 r0 = r0.mo62885r()
            java.lang.String r1 = r1.toString()
            com.yandex.metrica.impl.ob.k0 r8 = r8.mo62216f(r1)
            r0.mo63762b(r8)
            com.yandex.metrica.impl.ob.I8 r8 = r7.f24440c
            r0 = 1
            r8.mo61485b((boolean) r0)
        L_0x0097:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10154C5.mo61047a(com.yandex.metrica.impl.ob.k0):boolean");
    }

    C10154C5(C11229f4 f4Var, C10363I8 i8, C11099c2 c2Var, C10898Wn wn) {
        super(f4Var);
        this.f24440c = i8;
        this.f24439b = c2Var;
        this.f24441d = wn;
    }
}
