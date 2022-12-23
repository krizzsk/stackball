package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

public class hc0 extends C14576sb {

    /* renamed from: a */
    private final C13311b f34363a;

    /* renamed from: b */
    private final SSLSocketFactory f34364b;

    /* renamed from: com.yandex.mobile.ads.impl.hc0$a */
    static class C13310a extends FilterInputStream {

        /* renamed from: b */
        private final HttpURLConnection f34365b;

        C13310a(HttpURLConnection httpURLConnection) {
            super(hc0.m36912a(httpURLConnection));
            this.f34365b = httpURLConnection;
        }

        public void close() throws IOException {
            super.close();
            this.f34365b.disconnect();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hc0$b */
    public interface C13311b extends wg1 {
    }

    public hc0(C13311b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f34363a = bVar;
        this.f34364b = sSLSocketFactory;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.bc0 mo65925a(com.yandex.mobile.ads.impl.l41<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException, com.yandex.mobile.ads.impl.C13965ma {
        /*
            r6 = this;
            java.lang.String r0 = r7.mo67768l()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.putAll(r8)
            java.util.Map r8 = r7.mo67426e()
            r1.putAll(r8)
            com.yandex.mobile.ads.impl.hc0$b r8 = r6.f34363a
            if (r8 == 0) goto L_0x0036
            java.lang.String r8 = r8.mo65926a(r0)
            if (r8 == 0) goto L_0x001f
            r0 = r8
            goto L_0x0036
        L_0x001f:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "URL blocked by rewriter: "
            r8.append(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0036:
            java.net.URL r8 = new java.net.URL
            r8.<init>(r0)
            java.net.URLConnection r0 = r8.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            boolean r2 = java.net.HttpURLConnection.getFollowRedirects()
            r0.setInstanceFollowRedirects(r2)
            int r2 = r7.mo68347j()
            r0.setConnectTimeout(r2)
            r0.setReadTimeout(r2)
            r2 = 0
            r0.setUseCaches(r2)
            r3 = 1
            r0.setDoInput(r3)
            java.lang.String r8 = r8.getProtocol()
            java.lang.String r4 = "https"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x0070
            javax.net.ssl.SSLSocketFactory r8 = r6.f34364b
            if (r8 == 0) goto L_0x0070
            r4 = r0
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
            r4.setSSLSocketFactory(r8)
        L_0x0070:
            java.util.Set r8 = r1.keySet()     // Catch:{ all -> 0x00e8 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00e8 }
        L_0x0078:
            boolean r4 = r8.hasNext()     // Catch:{ all -> 0x00e8 }
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00e8 }
            java.lang.Object r5 = r1.get(r4)     // Catch:{ all -> 0x00e8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00e8 }
            r0.setRequestProperty(r4, r5)     // Catch:{ all -> 0x00e8 }
            goto L_0x0078
        L_0x008e:
            r6.mo67511b(r0, r7)     // Catch:{ all -> 0x00e8 }
            int r8 = r0.getResponseCode()     // Catch:{ all -> 0x00e8 }
            r1 = -1
            if (r8 == r1) goto L_0x00e0
            int r7 = r7.mo68344f()     // Catch:{ all -> 0x00e8 }
            r4 = 4
            if (r7 == r4) goto L_0x00b1
            r7 = 100
            if (r7 > r8) goto L_0x00a7
            r7 = 200(0xc8, float:2.8E-43)
            if (r8 < r7) goto L_0x00b1
        L_0x00a7:
            r7 = 204(0xcc, float:2.86E-43)
            if (r8 == r7) goto L_0x00b1
            r7 = 304(0x130, float:4.26E-43)
            if (r8 == r7) goto L_0x00b1
            r7 = 1
            goto L_0x00b2
        L_0x00b1:
            r7 = 0
        L_0x00b2:
            if (r7 != 0) goto L_0x00c6
            com.yandex.mobile.ads.impl.bc0 r7 = new com.yandex.mobile.ads.impl.bc0     // Catch:{ all -> 0x00e8 }
            java.util.Map r3 = r0.getHeaderFields()     // Catch:{ all -> 0x00e8 }
            java.util.List r3 = m36913a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r3)     // Catch:{ all -> 0x00e8 }
            r4 = 0
            r7.<init>(r8, r3, r1, r4)     // Catch:{ all -> 0x00e8 }
            r0.disconnect()
            return r7
        L_0x00c6:
            com.yandex.mobile.ads.impl.bc0 r7 = new com.yandex.mobile.ads.impl.bc0     // Catch:{ all -> 0x00dd }
            java.util.Map r1 = r0.getHeaderFields()     // Catch:{ all -> 0x00dd }
            java.util.List r1 = m36913a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r1)     // Catch:{ all -> 0x00dd }
            int r2 = r0.getContentLength()     // Catch:{ all -> 0x00dd }
            com.yandex.mobile.ads.impl.hc0$a r4 = new com.yandex.mobile.ads.impl.hc0$a     // Catch:{ all -> 0x00dd }
            r4.<init>(r0)     // Catch:{ all -> 0x00dd }
            r7.<init>(r8, r1, r2, r4)     // Catch:{ all -> 0x00dd }
            return r7
        L_0x00dd:
            r7 = move-exception
            r2 = 1
            goto L_0x00e9
        L_0x00e0:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "Could not retrieve response code from HttpUrlConnection."
            r7.<init>(r8)     // Catch:{ all -> 0x00e8 }
            throw r7     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r7 = move-exception
        L_0x00e9:
            if (r2 != 0) goto L_0x00ee
            r0.disconnect()
        L_0x00ee:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hc0.mo65925a(com.yandex.mobile.ads.impl.l41, java.util.Map):com.yandex.mobile.ads.impl.bc0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo67511b(HttpURLConnection httpURLConnection, l41<?> l41) throws IOException, C13965ma {
        switch (l41.mo68344f()) {
            case -1:
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m36914a(httpURLConnection, l41);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m36914a(httpURLConnection, l41);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod(VersionInfo.GIT_BRANCH);
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m36914a(httpURLConnection, l41);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* renamed from: a */
    static List<n90> m36913a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String n90 : (List) next.getValue()) {
                    arrayList.add(new n90((String) next.getKey(), n90));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static InputStream m36912a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: a */
    private void m36914a(HttpURLConnection httpURLConnection, l41<?> l41) throws IOException, C13965ma {
        byte[] b = l41.mo67767b();
        if (b != null) {
            m36915a(httpURLConnection, l41, b);
        }
    }

    /* renamed from: a */
    private void m36915a(HttpURLConnection httpURLConnection, l41<?> l41, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=" + "UTF-8");
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
