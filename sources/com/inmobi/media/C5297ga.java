package com.inmobi.media;

import com.google.common.net.HttpHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ga */
/* compiled from: NetworkConnection */
class C5297ga {

    /* renamed from: a */
    protected static final String f12117a = C5297ga.class.getSimpleName();

    /* renamed from: b */
    protected C5299gc f12118b;

    /* renamed from: c */
    protected HttpURLConnection f12119c;

    public C5297ga(C5299gc gcVar) {
        this.f12118b = gcVar;
    }

    /* renamed from: a */
    public C5300gd mo40612a() {
        C5300gd gdVar;
        this.f12118b.mo40207a();
        if (this.f12118b.f12139r != 1) {
            C5300gd gdVar2 = new C5300gd();
            gdVar2.f12145a = new C5298gb(-8, "Network Request dropped as current request is not GDPR compliant.");
            return gdVar2;
        } else if (C5328gx.m12274a()) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f12118b.mo40621f()).openConnection();
                m12121a(httpURLConnection);
                this.f12119c = httpURLConnection;
                if (!this.f12118b.f12134m) {
                    this.f12119c.setInstanceFollowRedirects(false);
                }
                if ("POST".equals(this.f12118b.f12131j)) {
                    String g = this.f12118b.mo40622g();
                    this.f12119c.setRequestProperty(HttpHeaders.CONTENT_LENGTH, Integer.toString(g.length()));
                    this.f12119c.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    BufferedWriter bufferedWriter = null;
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(this.f12119c.getOutputStream()));
                        try {
                            bufferedWriter2.write(g);
                            C5328gx.m12271a((Closeable) bufferedWriter2);
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            C5328gx.m12271a((Closeable) bufferedWriter);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C5328gx.m12271a((Closeable) bufferedWriter);
                        throw th;
                    }
                }
                return mo40613b();
            } catch (IOException e) {
                gdVar = new C5300gd();
                gdVar.f12145a = new C5298gb(-2, e.getLocalizedMessage());
                return gdVar;
            } catch (Exception e2) {
                gdVar = new C5300gd();
                gdVar.f12145a = new C5298gb(-1, e2.getLocalizedMessage());
                return gdVar;
            }
        } else {
            C5300gd gdVar3 = new C5300gd();
            gdVar3.f12145a = new C5298gb(0, "Network not reachable currently. Please try again.");
            return gdVar3;
        }
    }

    /* renamed from: a */
    private void m12121a(HttpURLConnection httpURLConnection) throws ProtocolException {
        httpURLConnection.setConnectTimeout(this.f12118b.f12132k);
        httpURLConnection.setReadTimeout(this.f12118b.f12133l);
        httpURLConnection.setUseCaches(false);
        Map<String, String> e = this.f12118b.mo40620e();
        if (e != null) {
            for (String next : e.keySet()) {
                httpURLConnection.setRequestProperty(next, e.get(next));
            }
        }
        String str = this.f12118b.f12131j;
        httpURLConnection.setRequestMethod(str);
        if (!"GET".equals(str)) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r1.f12145a = new com.inmobi.media.C5298gb(-1, "UNKNOWN_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r1.f12145a = new com.inmobi.media.C5298gb(-3, "OUT_OF_MEMORY_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        com.inmobi.media.C5328gx.m12272a(r13.f12119c);
        r13.f12119c.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00da, code lost:
        r1.f12145a = new com.inmobi.media.C5298gb(-1, "UNKNOWN_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r1.f12145a = new com.inmobi.media.C5298gb(-2, "NETWORK_IO_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        com.inmobi.media.C5328gx.m12272a(r13.f12119c);
        r13.f12119c.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f6, code lost:
        r1.f12145a = new com.inmobi.media.C5298gb(-1, "UNKNOWN_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r1.f12145a = new com.inmobi.media.C5298gb(504, "HTTP_GATEWAY_TIMEOUT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.inmobi.media.C5328gx.m12272a(r13.f12119c);
        r13.f12119c.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0112, code lost:
        r1.f12145a = new com.inmobi.media.C5298gb(-1, "UNKNOWN_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        com.inmobi.media.C5328gx.m12272a(r13.f12119c);
        r13.f12119c.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0125, code lost:
        r1.f12145a = new com.inmobi.media.C5298gb(-1, "UNKNOWN_ERROR");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012c, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:42:0x00ac, B:48:0x00c6, B:54:0x00e2, B:60:0x00fe] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00fe */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068 A[Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007c A[Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.inmobi.media.C5300gd mo40613b() {
        /*
            r13 = this;
            java.lang.String r0 = "UNKNOWN_ERROR"
            com.inmobi.media.gd r1 = new com.inmobi.media.gd
            r1.<init>()
            r2 = -3
            r3 = -2
            r4 = 504(0x1f8, float:7.06E-43)
            r5 = -1
            java.net.HttpURLConnection r6 = r13.f12119c     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            int r6 = r6.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r7 = 0
            r8 = 200(0xc8, float:2.8E-43)
            if (r6 != r8) goto L_0x001c
            r13.m12120a(r1, r7)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            goto L_0x0095
        L_0x001c:
            r9 = 400(0x190, float:5.6E-43)
            r10 = -9
            r11 = 500(0x1f4, float:7.0E-43)
            r12 = -7
            if (r9 > r6) goto L_0x0029
            if (r11 <= r6) goto L_0x0029
        L_0x0027:
            r7 = -7
            goto L_0x0066
        L_0x0029:
            if (r8 >= r6) goto L_0x0030
            r8 = 300(0x12c, float:4.2E-43)
            if (r8 <= r6) goto L_0x0030
            goto L_0x0064
        L_0x0030:
            if (r6 == 0) goto L_0x0066
            switch(r6) {
                case -9: goto L_0x0064;
                case -8: goto L_0x0062;
                case -7: goto L_0x0027;
                case -6: goto L_0x0060;
                case -5: goto L_0x005e;
                case -4: goto L_0x005c;
                case -3: goto L_0x005a;
                case -2: goto L_0x0058;
                default: goto L_0x0035;
            }     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
        L_0x0035:
            switch(r6) {
                case 302: goto L_0x0055;
                case 303: goto L_0x0052;
                case 304: goto L_0x004f;
                default: goto L_0x0038;
            }     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
        L_0x0038:
            switch(r6) {
                case 500: goto L_0x004c;
                case 501: goto L_0x0049;
                case 502: goto L_0x0046;
                case 503: goto L_0x0043;
                case 504: goto L_0x0040;
                case 505: goto L_0x003d;
                default: goto L_0x003b;
            }     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
        L_0x003b:
            r7 = -1
            goto L_0x0066
        L_0x003d:
            r7 = 505(0x1f9, float:7.08E-43)
            goto L_0x0066
        L_0x0040:
            r7 = 504(0x1f8, float:7.06E-43)
            goto L_0x0066
        L_0x0043:
            r7 = 503(0x1f7, float:7.05E-43)
            goto L_0x0066
        L_0x0046:
            r7 = 502(0x1f6, float:7.03E-43)
            goto L_0x0066
        L_0x0049:
            r7 = 501(0x1f5, float:7.02E-43)
            goto L_0x0066
        L_0x004c:
            r7 = 500(0x1f4, float:7.0E-43)
            goto L_0x0066
        L_0x004f:
            r7 = 304(0x130, float:4.26E-43)
            goto L_0x0066
        L_0x0052:
            r7 = 303(0x12f, float:4.25E-43)
            goto L_0x0066
        L_0x0055:
            r7 = 302(0x12e, float:4.23E-43)
            goto L_0x0066
        L_0x0058:
            r7 = -2
            goto L_0x0066
        L_0x005a:
            r7 = -3
            goto L_0x0066
        L_0x005c:
            r7 = -4
            goto L_0x0066
        L_0x005e:
            r7 = -5
            goto L_0x0066
        L_0x0060:
            r7 = -6
            goto L_0x0066
        L_0x0062:
            r7 = -8
            goto L_0x0066
        L_0x0064:
            r7 = -9
        L_0x0066:
            if (r7 != r12) goto L_0x007c
            r6 = 1
            r13.m12120a(r1, r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.lang.String r6 = r1.mo40625b()     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.lang.String r6 = m12119a((java.lang.String) r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            com.inmobi.media.gb r8 = new com.inmobi.media.gb     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r8.<init>(r7, r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r1.f12145a = r8     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            goto L_0x0095
        L_0x007c:
            com.inmobi.media.gb r8 = new com.inmobi.media.gb     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.lang.String r9 = "HTTP:"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.lang.String r6 = r9.concat(r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r8.<init>(r7, r6)     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r1.f12145a = r8     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.net.HttpURLConnection r6 = r13.f12119c     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            java.util.Map r6 = r6.getHeaderFields()     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
            r1.f12147c = r6     // Catch:{ SocketTimeoutException -> 0x00fe, IOException -> 0x00e2, OutOfMemoryError -> 0x00c6, Exception -> 0x00ac }
        L_0x0095:
            java.net.HttpURLConnection r2 = r13.f12119c     // Catch:{ Exception -> 0x00a1 }
            com.inmobi.media.C5328gx.m12272a((java.net.HttpURLConnection) r2)     // Catch:{ Exception -> 0x00a1 }
            java.net.HttpURLConnection r2 = r13.f12119c     // Catch:{ Exception -> 0x00a1 }
            r2.disconnect()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0119
        L_0x00a1:
            com.inmobi.media.gb r2 = new com.inmobi.media.gb
            r2.<init>(r5, r0)
            r1.f12145a = r2
            goto L_0x0119
        L_0x00aa:
            r2 = move-exception
            goto L_0x011a
        L_0x00ac:
            com.inmobi.media.gb r2 = new com.inmobi.media.gb     // Catch:{ all -> 0x00aa }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x00aa }
            r1.f12145a = r2     // Catch:{ all -> 0x00aa }
            java.net.HttpURLConnection r2 = r13.f12119c     // Catch:{ Exception -> 0x00be }
            com.inmobi.media.C5328gx.m12272a((java.net.HttpURLConnection) r2)     // Catch:{ Exception -> 0x00be }
            java.net.HttpURLConnection r2 = r13.f12119c     // Catch:{ Exception -> 0x00be }
            r2.disconnect()     // Catch:{ Exception -> 0x00be }
            goto L_0x0119
        L_0x00be:
            com.inmobi.media.gb r2 = new com.inmobi.media.gb
            r2.<init>(r5, r0)
            r1.f12145a = r2
            goto L_0x0119
        L_0x00c6:
            com.inmobi.media.gb r3 = new com.inmobi.media.gb     // Catch:{ all -> 0x00aa }
            java.lang.String r4 = "OUT_OF_MEMORY_ERROR"
            r3.<init>(r2, r4)     // Catch:{ all -> 0x00aa }
            r1.f12145a = r3     // Catch:{ all -> 0x00aa }
            java.net.HttpURLConnection r2 = r13.f12119c     // Catch:{ Exception -> 0x00da }
            com.inmobi.media.C5328gx.m12272a((java.net.HttpURLConnection) r2)     // Catch:{ Exception -> 0x00da }
            java.net.HttpURLConnection r2 = r13.f12119c     // Catch:{ Exception -> 0x00da }
            r2.disconnect()     // Catch:{ Exception -> 0x00da }
            goto L_0x0119
        L_0x00da:
            com.inmobi.media.gb r2 = new com.inmobi.media.gb
            r2.<init>(r5, r0)
            r1.f12145a = r2
            goto L_0x0119
        L_0x00e2:
            com.inmobi.media.gb r2 = new com.inmobi.media.gb     // Catch:{ all -> 0x00aa }
            java.lang.String r4 = "NETWORK_IO_ERROR"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00aa }
            r1.f12145a = r2     // Catch:{ all -> 0x00aa }
            java.net.HttpURLConnection r2 = r13.f12119c     // Catch:{ Exception -> 0x00f6 }
            com.inmobi.media.C5328gx.m12272a((java.net.HttpURLConnection) r2)     // Catch:{ Exception -> 0x00f6 }
            java.net.HttpURLConnection r2 = r13.f12119c     // Catch:{ Exception -> 0x00f6 }
            r2.disconnect()     // Catch:{ Exception -> 0x00f6 }
            goto L_0x0119
        L_0x00f6:
            com.inmobi.media.gb r2 = new com.inmobi.media.gb
            r2.<init>(r5, r0)
            r1.f12145a = r2
            goto L_0x0119
        L_0x00fe:
            com.inmobi.media.gb r2 = new com.inmobi.media.gb     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "HTTP_GATEWAY_TIMEOUT"
            r2.<init>(r4, r3)     // Catch:{ all -> 0x00aa }
            r1.f12145a = r2     // Catch:{ all -> 0x00aa }
            java.net.HttpURLConnection r2 = r13.f12119c     // Catch:{ Exception -> 0x0112 }
            com.inmobi.media.C5328gx.m12272a((java.net.HttpURLConnection) r2)     // Catch:{ Exception -> 0x0112 }
            java.net.HttpURLConnection r2 = r13.f12119c     // Catch:{ Exception -> 0x0112 }
            r2.disconnect()     // Catch:{ Exception -> 0x0112 }
            goto L_0x0119
        L_0x0112:
            com.inmobi.media.gb r2 = new com.inmobi.media.gb
            r2.<init>(r5, r0)
            r1.f12145a = r2
        L_0x0119:
            return r1
        L_0x011a:
            java.net.HttpURLConnection r3 = r13.f12119c     // Catch:{ Exception -> 0x0125 }
            com.inmobi.media.C5328gx.m12272a((java.net.HttpURLConnection) r3)     // Catch:{ Exception -> 0x0125 }
            java.net.HttpURLConnection r3 = r13.f12119c     // Catch:{ Exception -> 0x0125 }
            r3.disconnect()     // Catch:{ Exception -> 0x0125 }
            goto L_0x012c
        L_0x0125:
            com.inmobi.media.gb r3 = new com.inmobi.media.gb
            r3.<init>(r5, r0)
            r1.f12145a = r3
        L_0x012c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5297ga.mo40613b():com.inmobi.media.gd");
    }

    /* renamed from: a */
    private void m12120a(C5300gd gdVar, boolean z) throws IOException {
        if (!this.f12118b.mo40619d() || ((long) this.f12119c.getContentLength()) <= this.f12118b.f12137p) {
            byte[] a = C5328gx.m12275a(z ? this.f12119c.getErrorStream() : this.f12119c.getInputStream());
            if (a.length != 0) {
                if (this.f12118b.f12135n && (a = this.f12118b.mo40615a(a)) == null) {
                    gdVar.f12145a = new C5298gb(-4, "Unable to decrypt the server response.");
                }
                if (a != null && this.f12118b.f12138q && (a = C5328gx.m12276a(a)) == null) {
                    gdVar.f12145a = new C5298gb(-6, "Failed to uncompress gzip response");
                }
                if (a != null) {
                    gdVar.mo40626b(a);
                }
            }
            gdVar.f12147c = this.f12119c.getHeaderFields();
            return;
        }
        gdVar.f12145a = new C5298gb(-5, "Response size greater than specified max response size");
    }

    /* renamed from: a */
    private static String m12119a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errorMessage")) {
                return jSONObject.getString("errorMessage");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
