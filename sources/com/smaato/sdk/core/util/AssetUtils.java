package com.smaato.sdk.core.util;

public final class AssetUtils {
    private AssetUtils() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileFromAssets(android.content.Context r5, com.smaato.sdk.core.log.Logger r6, java.lang.String r7) {
        /*
            com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.core.util.Objects.requireNonNull(r6)
            com.smaato.sdk.core.util.Objects.requireNonNull(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0041 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0041 }
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch:{ IOException -> 0x0041 }
            java.io.InputStream r5 = r5.open(r7)     // Catch:{ IOException -> 0x0041 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r5, r3)     // Catch:{ IOException -> 0x0041 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0041 }
        L_0x0022:
            java.lang.String r5 = r1.readLine()     // Catch:{ all -> 0x0035 }
            if (r5 == 0) goto L_0x0031
            r0.append(r5)     // Catch:{ all -> 0x0035 }
            java.lang.String r5 = "\n"
            r0.append(r5)     // Catch:{ all -> 0x0035 }
            goto L_0x0022
        L_0x0031:
            r1.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0057
        L_0x0035:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch:{ IOException -> 0x0041 }
        L_0x0040:
            throw r2     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            r5 = move-exception
            com.smaato.sdk.core.log.LogDomain r1 = com.smaato.sdk.core.log.LogDomain.CORE
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r7
            java.lang.String r7 = "Could not read '%s' file from assets"
            java.lang.String r7 = java.lang.String.format(r7, r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r5
            r6.error(r1, r7, r2)
        L_0x0057:
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.util.AssetUtils.getFileFromAssets(android.content.Context, com.smaato.sdk.core.log.Logger, java.lang.String):java.lang.String");
    }
}
