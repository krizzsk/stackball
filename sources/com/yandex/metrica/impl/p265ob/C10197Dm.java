package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Dm */
public class C10197Dm implements C10348Hm {

    /* renamed from: a */
    private volatile String f24526a;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|(1:10)(4:11|12|13|14)|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo61204b() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f24526a
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = r5.f24526a
            return r0
        L_0x0007:
            monitor-enter(r5)
            java.lang.String r0 = r5.f24526a     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x003e
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0042 }
            r1 = 18
            if (r0 < r1) goto L_0x0017
            java.lang.String r0 = r5.m26170a()     // Catch:{ all -> 0x0042 }
            goto L_0x003c
        L_0x0017:
            r0 = 0
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x003c }
            com.yandex.metrica.impl.ob.Cm r2 = new com.yandex.metrica.impl.ob.Cm     // Catch:{ all -> 0x003c }
            r2.<init>(r5)     // Catch:{ all -> 0x003c }
            r1.<init>(r2)     // Catch:{ all -> 0x003c }
            com.yandex.metrica.impl.ob.Y r2 = com.yandex.metrica.impl.p265ob.C10941Y.m28234g()     // Catch:{ all -> 0x003c }
            com.yandex.metrica.impl.ob.qn r2 = r2.mo62500d()     // Catch:{ all -> 0x003c }
            android.os.Handler r2 = r2.mo63562c()     // Catch:{ all -> 0x003c }
            r2.post(r1)     // Catch:{ all -> 0x003c }
            r2 = 5
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x003c }
            java.lang.Object r1 = r1.get(r2, r4)     // Catch:{ all -> 0x003c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x003c }
            r0 = r1
        L_0x003c:
            r5.f24526a = r0     // Catch:{ all -> 0x0042 }
        L_0x003e:
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r5.f24526a
            return r0
        L_0x0042:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10197Dm.mo61204b():java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m26170a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke((Object) null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
