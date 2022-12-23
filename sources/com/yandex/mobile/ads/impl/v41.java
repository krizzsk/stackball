package com.yandex.mobile.ads.impl;

public final class v41 {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        if (r0.canWrite() != false) goto L_0x0060;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yandex.mobile.ads.impl.u41 m43030a(android.content.Context r6, int r7) {
        /*
            java.lang.String r0 = com.yandex.mobile.ads.impl.pp1.f38779a
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r3 = "Yandex Mobile Ads"
            r1[r2] = r3
            java.lang.String r4 = "Changing log tag to %s"
            com.yandex.mobile.ads.impl.pp1.m40899b(r4, r1)
            com.yandex.mobile.ads.impl.pp1.f38779a = r3
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r3, r1)
            com.yandex.mobile.ads.impl.pp1.f38780b = r1
            com.yandex.mobile.ads.impl.pp1.f38780b = r2
            com.yandex.mobile.ads.impl.cc0 r1 = new com.yandex.mobile.ads.impl.cc0
            com.yandex.mobile.ads.impl.p61 r3 = new com.yandex.mobile.ads.impl.p61
            r3.<init>()
            r1.<init>(r6, r3)
            com.yandex.mobile.ads.impl.sb r1 = r1.mo66253a()
            com.yandex.mobile.ads.impl.vb r3 = new com.yandex.mobile.ads.impl.vb
            com.yandex.mobile.ads.impl.cd r4 = new com.yandex.mobile.ads.impl.cd
            r5 = 4096(0x1000, float:5.74E-42)
            r4.<init>(r5)
            r3.<init>(r1, r4)
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x005f }
            java.lang.String r4 = "mounted"
            boolean r4 = r4.equals(r1)     // Catch:{ Exception -> 0x005f }
            java.lang.String r5 = "mounted_ro"
            boolean r1 = r5.equals(r1)     // Catch:{ Exception -> 0x005f }
            boolean r5 = android.os.Environment.isExternalStorageRemovable()     // Catch:{ Exception -> 0x005f }
            if (r4 != 0) goto L_0x0050
            if (r5 != 0) goto L_0x004f
            if (r1 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x005f
            java.io.File r0 = r6.getExternalCacheDir()     // Catch:{ Exception -> 0x005f }
            if (r0 == 0) goto L_0x005f
            boolean r1 = r0.canWrite()     // Catch:{ Exception -> 0x005f }
            if (r1 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            if (r0 == 0) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            java.io.File r0 = r6.getCacheDir()
        L_0x0067:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.getPath()
            r2.append(r0)
            java.lang.String r0 = java.io.File.separator
            r2.append(r0)
            java.lang.String r0 = "mobileads-volley-cache"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            com.yandex.mobile.ads.impl.sl r0 = new com.yandex.mobile.ads.impl.sl
            r4 = 10485760(0xa00000, double:5.180654E-317)
            long r4 = com.yandex.mobile.ads.impl.mn0.m39661a(r6, r4)
            int r6 = (int) r4
            r0.<init>(r1, r6)
            com.yandex.mobile.ads.impl.u41 r6 = new com.yandex.mobile.ads.impl.u41
            com.yandex.mobile.ads.impl.g40 r1 = new com.yandex.mobile.ads.impl.g40
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r2.<init>(r4)
            r1.<init>(r2)
            r6.<init>(r0, r3, r7, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.v41.m43030a(android.content.Context, int):com.yandex.mobile.ads.impl.u41");
    }
}
