package com.flurry.sdk;

/* renamed from: com.flurry.sdk.fd */
public class C2648fd {

    /* renamed from: a */
    private static final String f6209a = C2648fd.class.getSimpleName();

    /* renamed from: b */
    private static boolean f6210b;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0022 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0033 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m5752a() {
        /*
            java.lang.Class<com.flurry.sdk.fd> r0 = com.flurry.sdk.C2648fd.class
            monitor-enter(r0)
            boolean r1 = f6210b     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            java.lang.Class<com.flurry.sdk.bq> r1 = com.flurry.sdk.C2449bq.class
            com.flurry.sdk.C2533de.m5493a((java.lang.Class<? extends com.flurry.sdk.C2534df>) r1)     // Catch:{ all -> 0x003f }
            r1 = 3
            java.lang.Class<com.flurry.sdk.x> r2 = com.flurry.sdk.C2669x.class
            com.flurry.sdk.C2533de.m5493a((java.lang.Class<? extends com.flurry.sdk.C2534df>) r2)     // Catch:{ NoClassDefFoundError -> 0x0015 }
            goto L_0x001c
        L_0x0015:
            java.lang.String r2 = f6209a     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "Analytics module not available"
            com.flurry.sdk.C2530db.m5474a((int) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x003f }
        L_0x001c:
            java.lang.Class<com.flurry.sdk.ev> r2 = com.flurry.sdk.C2631ev.class
            com.flurry.sdk.C2533de.m5493a((java.lang.Class<? extends com.flurry.sdk.C2534df>) r2)     // Catch:{ NoClassDefFoundError -> 0x0022 }
            goto L_0x0029
        L_0x0022:
            java.lang.String r2 = f6209a     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "Crash module not available"
            com.flurry.sdk.C2530db.m5474a((int) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x003f }
        L_0x0029:
            java.lang.String r2 = "com.flurry.android.bridge.FlurryBridgeModule"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0033 }
            com.flurry.sdk.C2533de.m5493a((java.lang.Class<? extends com.flurry.sdk.C2534df>) r2)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0033 }
            goto L_0x003a
        L_0x0033:
            java.lang.String r2 = f6209a     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "Ads module not available"
            com.flurry.sdk.C2530db.m5474a((int) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x003f }
        L_0x003a:
            r1 = 1
            f6210b = r1     // Catch:{ all -> 0x003f }
            monitor-exit(r0)
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2648fd.m5752a():void");
    }

    /* renamed from: b */
    public static synchronized void m5753b() {
        synchronized (C2648fd.class) {
            if (f6210b) {
                C2533de.m5491a();
                f6210b = false;
            }
        }
    }
}
