package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.x2 */
public class C11932x2 {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f A[Catch:{ all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0027 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.p265ob.C11900w2 mo64065a(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 30
            r1 = 0
            boolean r0 = com.yandex.metrica.impl.p265ob.C10796U2.m27890a((int) r0)     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x000e
            android.view.Display r0 = r10.getDisplay()     // Catch:{ all -> 0x000e }
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "window"
            java.lang.Object r0 = r10.getSystemService(r0)     // Catch:{ all -> 0x0024 }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ all -> 0x0024 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x0024 }
        L_0x001d:
            if (r0 == 0) goto L_0x0024
            android.graphics.Point r0 = r9.m30821a((android.view.Display) r0)     // Catch:{ all -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            if (r0 != 0) goto L_0x0028
            return r1
        L_0x0028:
            int r1 = r0.x
            int r2 = r0.y
            int r4 = java.lang.Math.max(r1, r2)
            int r1 = r0.x
            int r2 = r0.y
            int r5 = java.lang.Math.min(r1, r2)
            r1 = 0
            r2 = 0
            android.content.res.Resources r3 = r10.getResources()     // Catch:{ all -> 0x0049 }
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch:{ all -> 0x0049 }
            int r1 = r3.densityDpi     // Catch:{ all -> 0x0049 }
            float r2 = r3.density     // Catch:{ all -> 0x0049 }
            r6 = r1
            r7 = r2
            goto L_0x004b
        L_0x0049:
            r6 = r1
            r7 = 0
        L_0x004b:
            com.yandex.metrica.impl.ob.w2 r1 = new com.yandex.metrica.impl.ob.w2
            com.yandex.metrica.e r8 = com.yandex.metrica.impl.p265ob.C11060b2.m28556a((android.content.Context) r10, (android.graphics.Point) r0)
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11932x2.mo64065a(android.content.Context):com.yandex.metrica.impl.ob.w2");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r5 = r7.getWidth();
        r0 = r7.getHeight();
        r7 = r5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0044 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Point m30821a(android.view.Display r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0055
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0055 }
            r1 = 17
            if (r0 < r1) goto L_0x0015
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ all -> 0x0055 }
            r0.<init>()     // Catch:{ all -> 0x0055 }
            r7.getRealMetrics(r0)     // Catch:{ all -> 0x0055 }
            int r7 = r0.widthPixels     // Catch:{ all -> 0x0055 }
            int r0 = r0.heightPixels     // Catch:{ all -> 0x0055 }
            goto L_0x004f
        L_0x0015:
            java.lang.Class<android.view.Display> r0 = android.view.Display.class
            java.lang.String r1 = "getRawHeight"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0044 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ all -> 0x0044 }
            java.lang.Class<android.view.Display> r1 = android.view.Display.class
            java.lang.String r3 = "getRawWidth"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0044 }
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch:{ all -> 0x0044 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0044 }
            java.lang.Object r1 = r1.invoke(r7, r3)     // Catch:{ all -> 0x0044 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0044 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0044 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r0.invoke(r7, r2)     // Catch:{ all -> 0x0044 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0044 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0044 }
            r7 = r1
            goto L_0x004f
        L_0x0044:
            int r0 = r7.getWidth()     // Catch:{ all -> 0x0055 }
            int r7 = r7.getHeight()     // Catch:{ all -> 0x0055 }
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x004f:
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ all -> 0x0055 }
            r1.<init>(r7, r0)     // Catch:{ all -> 0x0055 }
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11932x2.m30821a(android.view.Display):android.graphics.Point");
    }
}
