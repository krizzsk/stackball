package com.mbridge.msdk.foundation.download.utils;

public class UnzipUtility {
    private static final int BUFFER_SIZE = 4096;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0075 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[SYNTHETIC, Splitter:B:31:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072 A[SYNTHETIC, Splitter:B:35:0x0072] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unzip(java.lang.String r8, java.lang.String r9) throws java.io.IOException {
        /*
            r7 = this;
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0076 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0076 }
            boolean r1 = r0.exists()     // Catch:{ Exception -> 0x0076 }
            if (r1 != 0) goto L_0x000e
            r0.mkdirs()     // Catch:{ Exception -> 0x0076 }
        L_0x000e:
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x0076 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0076 }
            java.util.Enumeration r8 = r0.entries()     // Catch:{ Exception -> 0x0076 }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0076 }
        L_0x001b:
            boolean r2 = r8.hasMoreElements()     // Catch:{ Exception -> 0x0076 }
            if (r2 == 0) goto L_0x0076
            java.lang.Object r2 = r8.nextElement()     // Catch:{ Exception -> 0x0076 }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ Exception -> 0x0076 }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0076 }
            java.lang.String r4 = r2.getName()     // Catch:{ Exception -> 0x0076 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x0076 }
            boolean r4 = r2.isDirectory()     // Catch:{ Exception -> 0x0076 }
            if (r4 == 0) goto L_0x003a
            r3.mkdirs()     // Catch:{ Exception -> 0x0076 }
            goto L_0x001b
        L_0x003a:
            r4 = 0
            java.io.InputStream r2 = r0.getInputStream(r2)     // Catch:{ all -> 0x0067 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0067 }
            r5.<init>(r2)     // Catch:{ all -> 0x0067 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0063 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0063 }
            r6.<init>(r3)     // Catch:{ all -> 0x0063 }
            r2.<init>(r6)     // Catch:{ all -> 0x0063 }
        L_0x004e:
            int r3 = r5.read(r1)     // Catch:{ all -> 0x0061 }
            r4 = -1
            if (r3 == r4) goto L_0x005a
            r4 = 0
            r2.write(r1, r4, r3)     // Catch:{ all -> 0x0061 }
            goto L_0x004e
        L_0x005a:
            r5.close()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            r2.close()     // Catch:{ Exception -> 0x001b }
            goto L_0x001b
        L_0x0061:
            r8 = move-exception
            goto L_0x0065
        L_0x0063:
            r8 = move-exception
            r2 = r4
        L_0x0065:
            r4 = r5
            goto L_0x0069
        L_0x0067:
            r8 = move-exception
            r2 = r4
        L_0x0069:
            if (r4 == 0) goto L_0x0070
            r4.close()     // Catch:{ Exception -> 0x006f }
            goto L_0x0070
        L_0x006f:
        L_0x0070:
            if (r2 == 0) goto L_0x0075
            r2.close()     // Catch:{ Exception -> 0x0075 }
        L_0x0075:
            throw r8     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.utils.UnzipUtility.unzip(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void extractFile(java.util.zip.ZipInputStream r4, java.lang.String r5) throws java.io.IOException {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            java.io.File r5 = r0.getParentFile()
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x0016
            java.io.File r5 = r0.getParentFile()
            r5.mkdirs()
        L_0x0016:
            r5 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x003d }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003d }
            r2.<init>(r0)     // Catch:{ IOException -> 0x003d }
            r1.<init>(r2)     // Catch:{ IOException -> 0x003d }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
        L_0x0025:
            int r0 = r4.read(r5)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            r2 = -1
            if (r0 == r2) goto L_0x0031
            r2 = 0
            r1.write(r5, r2, r0)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            goto L_0x0025
        L_0x0031:
            r1.close()
            return
        L_0x0035:
            r4 = move-exception
            r5 = r1
            goto L_0x0044
        L_0x0038:
            r4 = move-exception
            r5 = r1
            goto L_0x003e
        L_0x003b:
            r4 = move-exception
            goto L_0x0044
        L_0x003d:
            r4 = move-exception
        L_0x003e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x003b }
            r0.<init>(r4)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x0044:
            if (r5 == 0) goto L_0x0049
            r5.close()
        L_0x0049:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.utils.UnzipUtility.extractFile(java.util.zip.ZipInputStream, java.lang.String):void");
    }
}
