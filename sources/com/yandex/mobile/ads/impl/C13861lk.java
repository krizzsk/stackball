package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.support.p003v4.media.session.PlaybackStateCompat;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.mobile.ads.impl.lk */
public class C13861lk extends C13966mb {

    /* renamed from: u */
    private static final Pattern f36709u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v */
    private static final AtomicReference<byte[]> f36710v = new AtomicReference<>();

    /* renamed from: e */
    private final boolean f36711e;

    /* renamed from: f */
    private final int f36712f;

    /* renamed from: g */
    private final int f36713g;

    /* renamed from: h */
    private final String f36714h;

    /* renamed from: i */
    private final vb0 f36715i;

    /* renamed from: j */
    private final vb0 f36716j = new vb0();

    /* renamed from: k */
    private C13504jj f36717k;

    /* renamed from: l */
    private HttpURLConnection f36718l;

    /* renamed from: m */
    private InputStream f36719m;

    /* renamed from: n */
    private SSLSocketFactory f36720n;

    /* renamed from: o */
    private boolean f36721o;

    /* renamed from: p */
    private int f36722p;

    /* renamed from: q */
    private long f36723q;

    /* renamed from: r */
    private long f36724r;

    /* renamed from: s */
    private long f36725s;

    /* renamed from: t */
    private long f36726t;

    public C13861lk(String str, int i, int i2, boolean z, vb0 vb0, SSLSocketFactory sSLSocketFactory) {
        super(true);
        this.f36714h = C13479j9.m37704a(str);
        this.f36712f = i;
        this.f36713g = i2;
        this.f36711e = z;
        this.f36715i = vb0;
        this.f36720n = sSLSocketFactory;
    }

    /* renamed from: d */
    private HttpURLConnection m38806d(C13504jj jjVar) throws IOException {
        HttpURLConnection a;
        C13504jj jjVar2 = jjVar;
        URL url = new URL(jjVar2.f35322a.toString());
        int i = jjVar2.f35323b;
        byte[] bArr = jjVar2.f35324c;
        long j = jjVar2.f35327f;
        long j2 = jjVar2.f35328g;
        boolean b = jjVar2.mo68007b(1);
        if (!this.f36711e) {
            return m38803a(url, i, bArr, j, j2, b, true, jjVar2.f35325d);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 <= 20) {
                Map<String, String> map = jjVar2.f35325d;
                int i4 = i3;
                byte[] bArr2 = bArr;
                long j3 = j2;
                long j4 = j;
                a = m38803a(url, i, bArr, j, j2, b, false, map);
                int responseCode = a.getResponseCode();
                String headerField = a.getHeaderField(HttpHeaders.LOCATION);
                if ((i == 1 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    a.disconnect();
                    url = m38804a(url, headerField);
                    i2 = i4;
                    bArr = bArr2;
                    j2 = j3;
                    j = j4;
                } else if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return a;
                } else {
                    a.disconnect();
                    url = m38804a(url, headerField);
                    i2 = i4;
                    bArr = null;
                    j2 = j3;
                    j = j4;
                    i = 1;
                }
                jjVar2 = jjVar;
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i3);
            }
        }
        return a;
    }

    /* renamed from: e */
    private void m38808e() throws IOException {
        if (this.f36725s != this.f36723q) {
            byte[] andSet = f36710v.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j = this.f36725s;
                long j2 = this.f36723q;
                if (j != j2) {
                    int read = this.f36719m.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f36725s += (long) read;
                        mo68634a(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    f36710v.set(andSet);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public Uri mo65276a() {
        HttpURLConnection httpURLConnection = this.f36718l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: b */
    public Map<String, List<String>> mo65278b() {
        HttpURLConnection httpURLConnection = this.f36718l;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public void close() throws tb0 {
        try {
            if (this.f36719m != null) {
                HttpURLConnection httpURLConnection = this.f36718l;
                long j = this.f36724r;
                if (j != -1) {
                    j -= this.f36726t;
                }
                m38805a(httpURLConnection, j);
                this.f36719m.close();
            }
            this.f36719m = null;
            m38807d();
            if (this.f36721o) {
                this.f36721o = false;
                mo68636c();
            }
        } catch (IOException e) {
            throw new tb0(e, this.f36717k, 3);
        } catch (Throwable th) {
            this.f36719m = null;
            m38807d();
            if (this.f36721o) {
                this.f36721o = false;
                mo68636c();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r7 != 0) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo65275a(com.yandex.mobile.ads.impl.C13504jj r20) throws com.yandex.mobile.ads.impl.tb0 {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "Unable to connect"
            r1.f36717k = r2
            r4 = 0
            r1.f36726t = r4
            r1.f36725s = r4
            r19.mo68635b(r20)
            r6 = 1
            java.net.HttpURLConnection r0 = r19.m38806d(r20)     // Catch:{ IOException -> 0x0164 }
            r1.f36718l = r0     // Catch:{ IOException -> 0x0164 }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x015a }
            r1.f36722p = r0     // Catch:{ IOException -> 0x015a }
            java.net.HttpURLConnection r0 = r1.f36718l     // Catch:{ IOException -> 0x015a }
            java.lang.String r0 = r0.getResponseMessage()     // Catch:{ IOException -> 0x015a }
            int r3 = r1.f36722p
            r7 = 200(0xc8, float:2.8E-43)
            if (r3 < r7) goto L_0x013a
            r8 = 299(0x12b, float:4.19E-43)
            if (r3 <= r8) goto L_0x0030
            goto L_0x013a
        L_0x0030:
            java.net.HttpURLConnection r0 = r1.f36718l
            r0.getContentType()
            int r0 = r1.f36722p
            if (r0 != r7) goto L_0x0040
            long r7 = r2.f35327f
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r7 = r4
        L_0x0041:
            r1.f36723q = r7
            java.net.HttpURLConnection r0 = r1.f36718l
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r0 = r0.getHeaderField(r3)
            java.lang.String r3 = "gzip"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0111
            long r7 = r2.f35328g
            r9 = -1
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x005f
            r1.f36724r = r7
            goto L_0x0115
        L_0x005f:
            java.net.HttpURLConnection r3 = r1.f36718l
            java.lang.String r7 = "Content-Length"
            java.lang.String r7 = r3.getHeaderField(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r11 = "DefaultHttpDataSourceHttpURLConnection"
            java.lang.String r12 = "]"
            if (r8 != 0) goto L_0x008d
            long r13 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0076 }
            goto L_0x008e
        L_0x0076:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r13 = "Unexpected Content-Length ["
            r8.append(r13)
            r8.append(r7)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r11, r8)
        L_0x008d:
            r13 = r9
        L_0x008e:
            java.lang.String r8 = "Content-Range"
            java.lang.String r3 = r3.getHeaderField(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r3)
            if (r8 != 0) goto L_0x0102
            java.util.regex.Pattern r8 = f36709u
            java.util.regex.Matcher r8 = r8.matcher(r3)
            boolean r15 = r8.find()
            if (r15 == 0) goto L_0x0102
            r15 = 2
            java.lang.String r15 = r8.group(r15)     // Catch:{ NumberFormatException -> 0x00eb }
            long r15 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x00eb }
            java.lang.String r8 = r8.group(r6)     // Catch:{ NumberFormatException -> 0x00eb }
            long r17 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x00eb }
            long r15 = r15 - r17
            r17 = 1
            long r9 = r15 + r17
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x00c3
            r13 = r9
            goto L_0x0102
        L_0x00c3:
            int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0102
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00eb }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00eb }
            java.lang.String r5 = "Inconsistent headers ["
            r4.append(r5)     // Catch:{ NumberFormatException -> 0x00eb }
            r4.append(r7)     // Catch:{ NumberFormatException -> 0x00eb }
            java.lang.String r5 = "] ["
            r4.append(r5)     // Catch:{ NumberFormatException -> 0x00eb }
            r4.append(r3)     // Catch:{ NumberFormatException -> 0x00eb }
            r4.append(r12)     // Catch:{ NumberFormatException -> 0x00eb }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00eb }
            android.util.Log.w(r11, r4)     // Catch:{ NumberFormatException -> 0x00eb }
            long r13 = java.lang.Math.max(r13, r9)     // Catch:{ NumberFormatException -> 0x00eb }
            goto L_0x0102
        L_0x00eb:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unexpected Content-Range ["
            r4.append(r5)
            r4.append(r3)
            r4.append(r12)
            java.lang.String r3 = r4.toString()
            android.util.Log.e(r11, r3)
        L_0x0102:
            r3 = -1
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x010d
            long r3 = r1.f36723q
            long r9 = r13 - r3
            goto L_0x010e
        L_0x010d:
            r9 = r3
        L_0x010e:
            r1.f36724r = r9
            goto L_0x0115
        L_0x0111:
            long r3 = r2.f35328g
            r1.f36724r = r3
        L_0x0115:
            java.net.HttpURLConnection r3 = r1.f36718l     // Catch:{ IOException -> 0x0130 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0130 }
            r1.f36719m = r3     // Catch:{ IOException -> 0x0130 }
            if (r0 == 0) goto L_0x0128
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0130 }
            java.io.InputStream r3 = r1.f36719m     // Catch:{ IOException -> 0x0130 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0130 }
            r1.f36719m = r0     // Catch:{ IOException -> 0x0130 }
        L_0x0128:
            r1.f36721o = r6
            r19.mo68637c(r20)
            long r2 = r1.f36724r
            return r2
        L_0x0130:
            r0 = move-exception
            r19.m38807d()
            com.yandex.mobile.ads.impl.tb0 r3 = new com.yandex.mobile.ads.impl.tb0
            r3.<init>((java.io.IOException) r0, (com.yandex.mobile.ads.impl.C13504jj) r2, (int) r6)
            throw r3
        L_0x013a:
            java.net.HttpURLConnection r3 = r1.f36718l
            java.util.Map r3 = r3.getHeaderFields()
            r19.m38807d()
            com.yandex.mobile.ads.impl.ub0 r4 = new com.yandex.mobile.ads.impl.ub0
            int r5 = r1.f36722p
            r4.<init>(r5, r0, r3, r2)
            int r0 = r1.f36722p
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x0159
            com.yandex.mobile.ads.impl.ij r0 = new com.yandex.mobile.ads.impl.ij
            r2 = 0
            r0.<init>(r2)
            r4.initCause(r0)
        L_0x0159:
            throw r4
        L_0x015a:
            r0 = move-exception
            r19.m38807d()
            com.yandex.mobile.ads.impl.tb0 r4 = new com.yandex.mobile.ads.impl.tb0
            r4.<init>(r3, r0, r2, r6)
            throw r4
        L_0x0164:
            r0 = move-exception
            com.yandex.mobile.ads.impl.tb0 r4 = new com.yandex.mobile.ads.impl.tb0
            r4.<init>(r3, r0, r2, r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13861lk.mo65275a(com.yandex.mobile.ads.impl.jj):long");
    }

    /* renamed from: d */
    private void m38807d() {
        HttpURLConnection httpURLConnection = this.f36718l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                bk0.m34269a("DefaultHttpDataSourceHttpURLConnection", "Unexpected error while disconnecting", e);
            }
            this.f36718l = null;
        }
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws tb0 {
        try {
            m38808e();
            if (i2 == 0) {
                return 0;
            }
            long j = this.f36724r;
            if (j != -1) {
                long j2 = j - this.f36726t;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j2);
            }
            int read = this.f36719m.read(bArr, i, i2);
            if (read != -1) {
                this.f36726t += (long) read;
                mo68634a(read);
                return read;
            } else if (this.f36724r == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new tb0(e, this.f36717k, 2);
        }
    }

    /* renamed from: a */
    private HttpURLConnection m38803a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.f36720n;
        if (sSLSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        httpURLConnection.setConnectTimeout(this.f36712f);
        httpURLConnection.setReadTimeout(this.f36713g);
        HashMap hashMap = new HashMap();
        vb0 vb0 = this.f36715i;
        if (vb0 != null) {
            hashMap.putAll(vb0.mo70467a());
        }
        hashMap.putAll(this.f36716j.mo70467a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f36714h);
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(C13504jj.m37845a(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: a */
    private static URL m38804a(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException("Unsupported protocol redirect: " + protocol);
        }
        throw new ProtocolException("Null location redirect");
    }

    /* renamed from: a */
    private static void m38805a(HttpURLConnection httpURLConnection, long j) {
        int i = ih1.f34858a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }
}
