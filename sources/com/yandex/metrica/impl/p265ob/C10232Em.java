package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Em */
public final class C10232Em implements Runnable {

    /* renamed from: a */
    final Context f24628a;

    public C10232Em(Context context) {
        this.f24628a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|(4:9|(3:11|(4:15|16|17|22)|18)|21|27)(1:26)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015 A[Catch:{ all -> 0x003f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            android.content.Context r0 = r7.f24628a
            java.lang.String r1 = r0.getPackageName()     // Catch:{ all -> 0x003f }
            r2 = 516(0x204, float:7.23E-43)
            r3 = 0
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ all -> 0x0011 }
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r1, r2)     // Catch:{ all -> 0x0011 }
        L_0x0011:
            android.content.pm.ServiceInfo[] r1 = r3.services     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003f
            int r2 = r1.length     // Catch:{ all -> 0x003f }
            r3 = 0
        L_0x0017:
            if (r3 >= r2) goto L_0x003f
            r4 = r1[r3]     // Catch:{ all -> 0x003f }
            java.lang.Class<com.yandex.metrica.MetricaService> r5 = com.yandex.metrica.MetricaService.class
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x003f }
            java.lang.String r6 = r4.name     // Catch:{ all -> 0x003f }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x003c
            boolean r4 = r4.enabled     // Catch:{ all -> 0x003f }
            if (r4 != 0) goto L_0x003c
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ all -> 0x003f }
            java.lang.Class<com.yandex.metrica.MetricaService> r5 = com.yandex.metrica.MetricaService.class
            r4.<init>(r0, r5)     // Catch:{ all -> 0x003f }
            android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch:{ all -> 0x003c }
            r6 = 1
            r5.setComponentEnabledSetting(r4, r6, r6)     // Catch:{ all -> 0x003c }
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10232Em.run():void");
    }
}
