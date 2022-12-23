package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.W1 */
public class C10869W1 implements Runnable {

    /* renamed from: a */
    private final C10703Rd f26138a;

    /* renamed from: b */
    private final C10750Sd f26139b;

    /* renamed from: c */
    private final C10766T1 f26140c;

    /* renamed from: d */
    private final C11798tn f26141d;

    /* renamed from: e */
    private final C10824V1 f26142e;

    public C10869W1(C10703Rd rd, C10750Sd sd, C10766T1 t1, C11798tn tnVar, C10824V1 v1, String str) {
        this.f26138a = rd;
        this.f26139b = sd;
        this.f26140c = t1;
        this.f26141d = tnVar;
        this.f26142e = v1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r7v9, types: [java.lang.Object, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0177  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            com.yandex.metrica.impl.ob.tn r0 = r12.f26141d
            boolean r0 = r0.mo63616c()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x01a7
            com.yandex.metrica.impl.ob.Rd r0 = r12.f26138a
            boolean r0 = r0.mo62128a()
            if (r0 == 0) goto L_0x01a7
            com.yandex.metrica.impl.ob.Sd r0 = r12.f26139b
            boolean r0 = r0.mo62128a()
            if (r0 == 0) goto L_0x01a7
            com.yandex.metrica.impl.ob.T1 r0 = r12.f26140c
            boolean r0 = r0.mo62264n()
            com.yandex.metrica.impl.ob.T1 r3 = r12.f26140c
            r3.mo62255d()
            r3 = 0
            r4 = r3
        L_0x0027:
            com.yandex.metrica.impl.ob.tn r5 = r12.f26141d
            boolean r5 = r5.mo63616c()
            if (r5 == 0) goto L_0x018b
            if (r0 == 0) goto L_0x018b
            com.yandex.metrica.impl.ob.V1 r0 = r12.f26142e
            com.yandex.metrica.impl.ob.T1 r4 = r12.f26140c
            r0.getClass()
            boolean r0 = r4.mo62265p()     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0135
            com.yandex.metrica.impl.ob.Vd r0 = r4.mo62255d()     // Catch:{ all -> 0x0148 }
            javax.net.ssl.HttpsURLConnection r0 = r0.mo62379a()     // Catch:{ all -> 0x0148 }
            java.util.Map r5 = r4.mo62257f()     // Catch:{ all -> 0x0132 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ all -> 0x0132 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0132 }
        L_0x0052:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0132 }
            if (r6 == 0) goto L_0x0074
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0132 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x0132 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ all -> 0x0132 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0132 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x0132 }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x0132 }
            java.lang.String r8 = ","
            java.lang.String r6 = android.text.TextUtils.join(r8, r6)     // Catch:{ all -> 0x0132 }
            r0.setRequestProperty(r7, r6)     // Catch:{ all -> 0x0132 }
            goto L_0x0052
        L_0x0074:
            r5 = 2
            int r6 = r4.mo62256e()     // Catch:{ all -> 0x0132 }
            if (r5 != r6) goto L_0x00ca
            byte[] r5 = r4.mo62258g()     // Catch:{ all -> 0x0132 }
            if (r5 == 0) goto L_0x00ca
            int r6 = r5.length     // Catch:{ all -> 0x0132 }
            if (r6 <= 0) goto L_0x00ca
            java.lang.Long r6 = r4.mo62261k()     // Catch:{ all -> 0x0132 }
            java.lang.Integer r7 = r4.mo62262l()     // Catch:{ all -> 0x0132 }
            r0.setDoOutput(r1)     // Catch:{ all -> 0x0132 }
            if (r6 == 0) goto L_0x00a4
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0132 }
            long r9 = r6.longValue()     // Catch:{ all -> 0x0132 }
            long r8 = r8.toSeconds(r9)     // Catch:{ all -> 0x0132 }
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0132 }
            java.lang.String r8 = "Send-Timestamp"
            r0.setRequestProperty(r8, r6)     // Catch:{ all -> 0x0132 }
        L_0x00a4:
            if (r7 == 0) goto L_0x00af
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0132 }
            java.lang.String r7 = "Send-Timezone"
            r0.setRequestProperty(r7, r6)     // Catch:{ all -> 0x0132 }
        L_0x00af:
            java.io.OutputStream r6 = r0.getOutputStream()     // Catch:{ all -> 0x0132 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c7 }
            int r5 = r5.length     // Catch:{ all -> 0x00c7 }
            r7.<init>(r6, r5)     // Catch:{ all -> 0x00c7 }
            byte[] r5 = r4.mo62258g()     // Catch:{ all -> 0x0127 }
            r7.write(r5)     // Catch:{ all -> 0x0127 }
            r7.flush()     // Catch:{ all -> 0x0127 }
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r6)     // Catch:{ all -> 0x0127 }
            goto L_0x00cc
        L_0x00c7:
            r5 = move-exception
            goto L_0x014b
        L_0x00ca:
            r6 = r3
            r7 = r6
        L_0x00cc:
            int r5 = r0.getResponseCode()     // Catch:{ all -> 0x0127 }
            r4.mo62247a((int) r5)     // Catch:{ all -> 0x0127 }
            java.util.Map r8 = r0.getHeaderFields()     // Catch:{ all -> 0x0127 }
            r4.f25814g = r8     // Catch:{ all -> 0x0127 }
            r8 = 400(0x190, float:5.6E-43)
            if (r5 == r8) goto L_0x00e3
            r8 = 500(0x1f4, float:7.0E-43)
            if (r5 == r8) goto L_0x00e3
            r5 = 1
            goto L_0x00e4
        L_0x00e3:
            r5 = 0
        L_0x00e4:
            r8 = 8000(0x1f40, float:1.121E-41)
            if (r5 == 0) goto L_0x0106
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ all -> 0x0127 }
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00ff }
            r9.<init>(r5, r8)     // Catch:{ all -> 0x00ff }
            r8 = 2147483647(0x7fffffff, float:NaN)
            byte[] r8 = com.yandex.metrica.impl.p265ob.C10823V0.m27967a((java.io.InputStream) r9, (int) r8)     // Catch:{ all -> 0x0125 }
            r4.mo62253b((byte[]) r8)     // Catch:{ all -> 0x0125 }
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r5)     // Catch:{ all -> 0x0125 }
            goto L_0x0111
        L_0x00ff:
            r8 = move-exception
            r11 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r11
            goto L_0x012b
        L_0x0106:
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0127 }
            java.io.InputStream r9 = r0.getErrorStream()     // Catch:{ all -> 0x0127 }
            r5.<init>(r9, r8)     // Catch:{ all -> 0x0127 }
            r9 = r5
            r5 = r3
        L_0x0111:
            boolean r4 = r4.mo62266q()     // Catch:{ all -> 0x0125 }
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r7)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r9)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r6)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r5)
            com.yandex.metrica.impl.p265ob.C10796U2.m27889a((javax.net.ssl.HttpsURLConnection) r0)
            goto L_0x0162
        L_0x0125:
            r8 = move-exception
            goto L_0x014f
        L_0x0127:
            r5 = move-exception
            r8 = r7
            r7 = r6
            r6 = r3
        L_0x012b:
            r9 = r3
            r11 = r8
            r8 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            goto L_0x014f
        L_0x0132:
            r5 = move-exception
            r6 = r3
            goto L_0x014b
        L_0x0135:
            r4.mo62250a((java.lang.Throwable) r3)     // Catch:{ all -> 0x0148 }
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r3)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r3)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r3)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r3)
            com.yandex.metrica.impl.p265ob.C10796U2.m27889a((javax.net.ssl.HttpsURLConnection) r3)
            goto L_0x0161
        L_0x0148:
            r5 = move-exception
            r0 = r3
            r6 = r0
        L_0x014b:
            r7 = r3
            r9 = r7
            r8 = r5
            r5 = r9
        L_0x014f:
            r4.mo62250a((java.lang.Throwable) r8)     // Catch:{ all -> 0x017a }
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r7)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r9)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r6)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r5)
            com.yandex.metrica.impl.p265ob.C10796U2.m27889a((javax.net.ssl.HttpsURLConnection) r0)
        L_0x0161:
            r4 = 0
        L_0x0162:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r0 = r4.booleanValue()
            if (r0 != 0) goto L_0x0177
            com.yandex.metrica.impl.ob.T1 r0 = r12.f26140c
            boolean r0 = r0.mo61729A()
            if (r0 == 0) goto L_0x0177
            r0 = 1
            goto L_0x0027
        L_0x0177:
            r0 = 0
            goto L_0x0027
        L_0x017a:
            r1 = move-exception
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r7)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r9)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r6)
            com.yandex.metrica.impl.p265ob.C10796U2.m27888a((java.io.Closeable) r5)
            com.yandex.metrica.impl.p265ob.C10796U2.m27889a((javax.net.ssl.HttpsURLConnection) r0)
            throw r1
        L_0x018b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0199
            com.yandex.metrica.impl.ob.Sd r0 = r12.f26139b
            r0.mo62229c()
            goto L_0x01a8
        L_0x0199:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x01a8
            com.yandex.metrica.impl.ob.Sd r0 = r12.f26139b
            r0.mo62230d()
            goto L_0x01a8
        L_0x01a7:
            r1 = 0
        L_0x01a8:
            if (r1 != 0) goto L_0x01af
            com.yandex.metrica.impl.ob.T1 r0 = r12.f26140c
            r0.mo61649s()
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10869W1.run():void");
    }
}
