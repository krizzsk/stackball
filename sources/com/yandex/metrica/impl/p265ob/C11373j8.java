package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.j8 */
public class C11373j8 {

    /* renamed from: c */
    private static final C11373j8 f27178c = new C11373j8(new C10395J7());

    /* renamed from: a */
    private final C10395J7 f27179a;

    /* renamed from: b */
    private C11374a f27180b = C11374a.BLANK;

    /* renamed from: com.yandex.metrica.impl.ob.j8$a */
    private enum C11374a {
        BLANK,
        LOADING_ERROR,
        LOADED
    }

    C11373j8(C10395J7 j7) {
        this.f27179a = j7;
    }

    /* renamed from: a */
    public static C11373j8 m29280a() {
        return f27178c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5.f27180b = com.yandex.metrica.impl.p265ob.C11373j8.C11374a.f27182b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0024, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x001f */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo63060b() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.metrica.impl.ob.j8$a r0 = r5.f27180b     // Catch:{ all -> 0x0025 }
            com.yandex.metrica.impl.ob.j8$a r1 = com.yandex.metrica.impl.p265ob.C11373j8.C11374a.LOADED     // Catch:{ all -> 0x0025 }
            r2 = 1
            if (r0 != r1) goto L_0x000a
            monitor-exit(r5)
            return r2
        L_0x000a:
            com.yandex.metrica.impl.ob.j8$a r3 = com.yandex.metrica.impl.p265ob.C11373j8.C11374a.LOADING_ERROR     // Catch:{ all -> 0x0025 }
            r4 = 0
            if (r0 != r3) goto L_0x0011
            monitor-exit(r5)
            return r4
        L_0x0011:
            com.yandex.metrica.impl.ob.J7 r0 = r5.f27179a     // Catch:{ all -> 0x001f }
            java.lang.String r3 = "appmetrica-service-native"
            r0.getClass()     // Catch:{ all -> 0x001f }
            java.lang.System.loadLibrary(r3)     // Catch:{ all -> 0x001f }
            r5.f27180b = r1     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r2
        L_0x001f:
            com.yandex.metrica.impl.ob.j8$a r0 = com.yandex.metrica.impl.p265ob.C11373j8.C11374a.LOADING_ERROR     // Catch:{ all -> 0x0025 }
            r5.f27180b = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r5)
            return r4
        L_0x0025:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11373j8.mo63060b():boolean");
    }
}
