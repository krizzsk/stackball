package com.tapjoy.internal;

import java.net.URL;

/* renamed from: com.tapjoy.internal.ce */
public final class C9124ce implements C9123cd {

    /* renamed from: a */
    private final String f22443a;

    /* renamed from: b */
    private final URL f22444b;

    public C9124ce(String str, URL url) {
        this.f22443a = str;
        this.f22444b = url;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:37|38|39|41|42|43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0132, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013c, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013f, code lost:
        throw r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0134 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo57910a(com.tapjoy.internal.C9120ca r9) {
        /*
            r8 = this;
            java.net.URL r0 = new java.net.URL
            java.net.URL r1 = r8.f22444b
            java.lang.String r2 = r9.mo57905c()
            r0.<init>(r1, r2)
            java.lang.String r1 = r9.mo57904b()
            java.lang.String r2 = "GET"
            boolean r3 = r2.equals(r1)
            java.lang.String r4 = "DELETE"
            if (r3 != 0) goto L_0x001f
            boolean r3 = r4.equals(r1)
            if (r3 == 0) goto L_0x004b
        L_0x001f:
            java.util.Map r3 = r9.mo57907e()
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x004b
            java.net.URL r5 = new java.net.URL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r0.getPath()
            r6.append(r7)
            java.lang.String r7 = "?"
            r6.append(r7)
            java.lang.String r3 = com.tapjoy.internal.C9273fk.m24876a(r3)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r5.<init>(r0, r3)
            r0 = r5
        L_0x004b:
            java.net.URLConnection r0 = com.tapjoy.internal.C9272fj.m24875a(r0)
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r0.setRequestMethod(r1)
            java.lang.String r3 = r8.f22443a
            java.lang.String r5 = "User-Agent"
            r0.setRequestProperty(r5, r3)
            java.util.Map r3 = r9.mo57900a()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0067:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = r5.toString()
            r0.setRequestProperty(r6, r5)
            goto L_0x0067
        L_0x0085:
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00f8
            boolean r2 = r4.equals(r1)
            if (r2 != 0) goto L_0x00f8
            java.lang.String r2 = "POST"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00b6
            java.lang.String r2 = "PUT"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00a2
            goto L_0x00b6
        L_0x00a2:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown method: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00b6:
            java.lang.String r1 = r9.mo57906d()
            if (r1 != 0) goto L_0x00cc
            java.util.Map r1 = r9.mo57907e()
            java.lang.String r1 = com.tapjoy.internal.C9273fk.m24876a(r1)
            java.nio.charset.Charset r2 = com.tapjoy.internal.C9460jm.f23555c
            java.lang.String r3 = "application/x-www-form-urlencoded"
            com.tapjoy.internal.C9273fk.m24877a(r0, r3, r1, r2)
            goto L_0x00f8
        L_0x00cc:
            java.lang.String r2 = "application/json"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00e4
            java.util.Map r1 = r9.mo57907e()
            java.lang.String r1 = com.tapjoy.internal.C9092bh.m24336a((java.lang.Object) r1)
            java.nio.charset.Charset r2 = com.tapjoy.internal.C9460jm.f23555c
            java.lang.String r3 = "application/json; charset=utf-8"
            com.tapjoy.internal.C9273fk.m24877a(r0, r3, r1, r2)
            goto L_0x00f8
        L_0x00e4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown content type: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00f8:
            r0.connect()
            int r1 = r0.getResponseCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x0124
            r2 = 201(0xc9, float:2.82E-43)
            if (r1 == r2) goto L_0x0124
            r2 = 409(0x199, float:5.73E-43)
            if (r1 != r2) goto L_0x010c
            goto L_0x0124
        L_0x010c:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected status code: "
            r1.<init>(r2)
            int r0 = r0.getResponseCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L_0x0124:
            java.io.InputStream r1 = r0.getInputStream()
            r2 = 0
            java.net.URL r0 = r0.getURL()     // Catch:{ URISyntaxException -> 0x0134 }
            java.net.URI r2 = r0.toURI()     // Catch:{ URISyntaxException -> 0x0134 }
            goto L_0x0134
        L_0x0132:
            r9 = move-exception
            goto L_0x013c
        L_0x0134:
            java.lang.Object r9 = r9.mo57899a((java.net.URI) r2, (java.io.InputStream) r1)     // Catch:{ all -> 0x0132 }
            r1.close()
            return r9
        L_0x013c:
            r1.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9124ce.mo57910a(com.tapjoy.internal.ca):java.lang.Object");
    }
}
