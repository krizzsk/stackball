package com.yandex.mobile.ads.impl;

public class mn0 {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c A[SYNTHETIC, Splitter:B:17:0x003c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m39661a(android.content.Context r11, long r12) {
        /*
            r0 = 52428800(0x3200000, double:2.5903269E-316)
            long r12 = java.lang.Math.min(r12, r0)
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r4 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r5 = "mounted"
            boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r6 = "mounted_ro"
            boolean r4 = r6.equals(r4)     // Catch:{ Exception -> 0x0038 }
            boolean r6 = android.os.Environment.isExternalStorageRemovable()     // Catch:{ Exception -> 0x0038 }
            if (r5 != 0) goto L_0x0027
            if (r6 != 0) goto L_0x0025
            if (r4 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r4 = 0
            goto L_0x0028
        L_0x0027:
            r4 = 1
        L_0x0028:
            if (r4 == 0) goto L_0x0039
            java.io.File r4 = r11.getExternalCacheDir()     // Catch:{ Exception -> 0x0038 }
            if (r4 == 0) goto L_0x0039
            boolean r5 = r4.canWrite()     // Catch:{ Exception -> 0x0038 }
            if (r5 == 0) goto L_0x0039
            r3 = r4
            goto L_0x0039
        L_0x0038:
        L_0x0039:
            if (r3 == 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            java.io.File r3 = r11.getCacheDir()     // Catch:{ IllegalArgumentException -> 0x0073 }
        L_0x0040:
            java.io.File r11 = new java.io.File     // Catch:{ IllegalArgumentException -> 0x0073 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0073 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x0073 }
            java.lang.String r3 = r3.getPath()     // Catch:{ IllegalArgumentException -> 0x0073 }
            r4.append(r3)     // Catch:{ IllegalArgumentException -> 0x0073 }
            java.lang.String r3 = java.io.File.separator     // Catch:{ IllegalArgumentException -> 0x0073 }
            r4.append(r3)     // Catch:{ IllegalArgumentException -> 0x0073 }
            r4.append(r2)     // Catch:{ IllegalArgumentException -> 0x0073 }
            java.lang.String r2 = r4.toString()     // Catch:{ IllegalArgumentException -> 0x0073 }
            r11.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0073 }
            android.os.StatFs r2 = new android.os.StatFs     // Catch:{ IllegalArgumentException -> 0x0073 }
            java.lang.String r11 = r11.getAbsolutePath()     // Catch:{ IllegalArgumentException -> 0x0073 }
            r2.<init>(r11)     // Catch:{ IllegalArgumentException -> 0x0073 }
            int r11 = r2.getAvailableBlocks()     // Catch:{ IllegalArgumentException -> 0x0073 }
            long r3 = (long) r11     // Catch:{ IllegalArgumentException -> 0x0073 }
            int r11 = r2.getBlockSize()     // Catch:{ IllegalArgumentException -> 0x0073 }
            long r5 = (long) r11
            long r3 = r3 * r5
            goto L_0x0074
        L_0x0073:
            r3 = r12
        L_0x0074:
            r5 = 2
            long r5 = r5 * r3
            r7 = 100
            long r5 = r5 / r7
            r9 = 50
            long r3 = r3 * r9
            long r3 = r3 / r7
            long r11 = java.lang.Math.min(r12, r3)
            long r0 = java.lang.Math.min(r5, r0)
            long r11 = java.lang.Math.max(r0, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mn0.m39661a(android.content.Context, long):long");
    }
}
