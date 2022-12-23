package com.adcolony.sdk;

import java.net.URL;

/* renamed from: com.adcolony.sdk.z */
class C0896z {

    /* renamed from: a */
    private URL f1610a;

    C0896z(URL url) {
        this.f1610a = url;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.io.DataOutputStream} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo10052a(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = r6.f1610a     // Catch:{ IOException -> 0x0074, all -> 0x0070 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0074, all -> 0x0070 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0074, all -> 0x0070 }
            java.lang.String r3 = "POST"
            r2.setRequestMethod(r3)     // Catch:{ IOException -> 0x006b, all -> 0x0066 }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r4 = "gzip"
            r2.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x006b, all -> 0x0066 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json"
            r2.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x006b, all -> 0x0066 }
            r3 = 1
            r2.setDoInput(r3)     // Catch:{ IOException -> 0x006b, all -> 0x0066 }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x006b, all -> 0x0066 }
            java.io.OutputStream r5 = r2.getOutputStream()     // Catch:{ IOException -> 0x006b, all -> 0x0066 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x006b, all -> 0x0066 }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0063, all -> 0x0061 }
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ IOException -> 0x005f, all -> 0x005d }
            byte[] r7 = r7.getBytes(r0)     // Catch:{ IOException -> 0x005f, all -> 0x005d }
            r5.write(r7)     // Catch:{ IOException -> 0x005f, all -> 0x005d }
            r5.close()     // Catch:{ IOException -> 0x005f, all -> 0x005d }
            int r7 = r2.getResponseCode()     // Catch:{ IOException -> 0x005a, all -> 0x0057 }
            r4.close()
            java.io.InputStream r0 = r2.getInputStream()
            if (r0 == 0) goto L_0x0053
            java.io.InputStream r0 = r2.getInputStream()
            r0.close()
        L_0x0053:
            r2.disconnect()
            return r7
        L_0x0057:
            r7 = move-exception
            r1 = 1
            goto L_0x007a
        L_0x005a:
            r7 = move-exception
            r1 = 1
            goto L_0x006e
        L_0x005d:
            r7 = move-exception
            goto L_0x007a
        L_0x005f:
            r7 = move-exception
            goto L_0x006e
        L_0x0061:
            r7 = move-exception
            goto L_0x007b
        L_0x0063:
            r7 = move-exception
            r5 = r0
            goto L_0x006e
        L_0x0066:
            r7 = move-exception
            r4 = r0
            r5 = r4
            r0 = r2
            goto L_0x0079
        L_0x006b:
            r7 = move-exception
            r4 = r0
            r5 = r4
        L_0x006e:
            r0 = r2
            goto L_0x0077
        L_0x0070:
            r7 = move-exception
            r4 = r0
            r5 = r4
            goto L_0x0079
        L_0x0074:
            r7 = move-exception
            r4 = r0
            r5 = r4
        L_0x0077:
            throw r7     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r7 = move-exception
        L_0x0079:
            r2 = r0
        L_0x007a:
            r0 = r5
        L_0x007b:
            if (r0 == 0) goto L_0x0082
            if (r1 != 0) goto L_0x0082
            r0.close()
        L_0x0082:
            if (r4 == 0) goto L_0x0087
            r4.close()
        L_0x0087:
            if (r2 == 0) goto L_0x0099
            java.io.InputStream r0 = r2.getInputStream()
            if (r0 == 0) goto L_0x0096
            java.io.InputStream r0 = r2.getInputStream()
            r0.close()
        L_0x0096:
            r2.disconnect()
        L_0x0099:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0896z.mo10052a(java.lang.String):int");
    }
}
