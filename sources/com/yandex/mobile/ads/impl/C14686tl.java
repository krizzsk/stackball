package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.tl */
public class C14686tl {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0.canWrite() != false) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[Catch:{ Exception -> 0x002d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File mo70191a(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = "mounted"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "mounted_ro"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x002d }
            boolean r2 = android.os.Environment.isExternalStorageRemovable()     // Catch:{ Exception -> 0x002d }
            if (r1 != 0) goto L_0x001d
            if (r2 != 0) goto L_0x001b
            if (r0 != 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = 0
            goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            if (r0 == 0) goto L_0x002d
            java.io.File r0 = r4.getExternalCacheDir()     // Catch:{ Exception -> 0x002d }
            if (r0 == 0) goto L_0x002d
            boolean r1 = r0.canWrite()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            if (r0 == 0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            java.io.File r0 = r4.getCacheDir()
        L_0x0035:
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.getPath()
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14686tl.mo70191a(android.content.Context, java.lang.String):java.io.File");
    }
}
