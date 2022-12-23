package com.fyber.inneractive.sdk.player.p059c.p078j;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3520r;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3550m;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.n */
public final class C3515n implements C3520r {

    /* renamed from: b */
    private static final Pattern f9534b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: c */
    private static final AtomicReference<byte[]> f9535c = new AtomicReference<>();

    /* renamed from: d */
    private final boolean f9536d;

    /* renamed from: e */
    private final int f9537e;

    /* renamed from: f */
    private final int f9538f;

    /* renamed from: g */
    private final String f9539g;

    /* renamed from: h */
    private final C3550m<String> f9540h;

    /* renamed from: i */
    private final C3520r.C3527f f9541i;

    /* renamed from: j */
    private final C3520r.C3527f f9542j;

    /* renamed from: k */
    private final C3534u<? super C3515n> f9543k;

    /* renamed from: l */
    private C3509i f9544l;

    /* renamed from: m */
    private HttpURLConnection f9545m;

    /* renamed from: n */
    private InputStream f9546n;

    /* renamed from: o */
    private boolean f9547o;

    /* renamed from: p */
    private long f9548p;

    /* renamed from: q */
    private long f9549q;

    /* renamed from: r */
    private long f9550r;

    /* renamed from: s */
    private long f9551s;

    public C3515n(String str, C3534u<? super C3515n> uVar, int i, int i2, boolean z, C3520r.C3527f fVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f9539g = str;
            this.f9540h = null;
            this.f9543k = uVar;
            this.f9542j = new C3520r.C3527f();
            this.f9537e = i;
            this.f9538f = i2;
            this.f9536d = z;
            this.f9541i = fVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final Uri mo18704a() {
        HttpURLConnection httpURLConnection = this.f9545m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: a */
    public final long mo18703a(C3509i iVar) throws C3520r.C3524c {
        HttpURLConnection httpURLConnection;
        HttpURLConnection a;
        C3509i iVar2 = iVar;
        this.f9544l = iVar2;
        long j = 0;
        this.f9551s = 0;
        this.f9550r = 0;
        try {
            URL url = new URL(iVar2.f9498a.toString());
            byte[] bArr = iVar2.f9499b;
            long j2 = iVar2.f9501d;
            long j3 = iVar2.f9502e;
            boolean a2 = iVar2.mo19345a(1);
            if (!this.f9536d) {
                httpURLConnection = m8745a(url, bArr, j2, j3, a2, true);
            } else {
                int i = 0;
                URL url2 = url;
                byte[] bArr2 = bArr;
                while (true) {
                    int i2 = i + 1;
                    if (i <= 20) {
                        URL url3 = url2;
                        int i3 = i2;
                        long j4 = j3;
                        long j5 = j2;
                        a = m8745a(url2, bArr2, j2, j3, a2, false);
                        int responseCode = a.getResponseCode();
                        if (!(responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303)) {
                            if (bArr2 == null) {
                                if (responseCode != 307) {
                                    if (responseCode != 308) {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        bArr2 = null;
                        String headerField = a.getHeaderField(HttpHeaders.LOCATION);
                        a.disconnect();
                        if (headerField != null) {
                            url2 = new URL(url3, headerField);
                            String protocol = url2.getProtocol();
                            if (!"https".equals(protocol)) {
                                if (!"http".equals(protocol)) {
                                    throw new ProtocolException("Unsupported protocol redirect: " + protocol);
                                }
                            }
                            i = i3;
                            j3 = j4;
                            j2 = j5;
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        throw new NoRouteToHostException("Too many redirects: " + i2);
                    }
                }
                httpURLConnection = a;
            }
            this.f9545m = httpURLConnection;
            try {
                int responseCode2 = httpURLConnection.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map headerFields = this.f9545m.getHeaderFields();
                    m8746c();
                    C3520r.C3526e eVar = new C3520r.C3526e(responseCode2, headerFields, iVar2);
                    if (responseCode2 == 416) {
                        eVar.initCause(new C3508h());
                    }
                    throw eVar;
                }
                String contentType = this.f9545m.getContentType();
                C3550m<String> mVar = this.f9540h;
                if (mVar == null || mVar.mo19355a(contentType)) {
                    if (responseCode2 == 200 && iVar2.f9501d != 0) {
                        j = iVar2.f9501d;
                    }
                    this.f9548p = j;
                    if (!iVar2.mo19345a(1)) {
                        long j6 = -1;
                        if (iVar2.f9502e != -1) {
                            this.f9549q = iVar2.f9502e;
                        } else {
                            long a3 = m8744a(this.f9545m);
                            if (a3 != -1) {
                                j6 = a3 - this.f9548p;
                            }
                            this.f9549q = j6;
                        }
                    } else {
                        this.f9549q = iVar2.f9502e;
                    }
                    try {
                        this.f9546n = this.f9545m.getInputStream();
                        this.f9547o = true;
                        C3534u<? super C3515n> uVar = this.f9543k;
                        if (uVar != null) {
                            uVar.mo19350a();
                        }
                        return this.f9549q;
                    } catch (IOException e) {
                        m8746c();
                        throw new C3520r.C3524c(e, iVar2, 1);
                    }
                } else {
                    m8746c();
                    throw new C3520r.C3525d(contentType, iVar2);
                }
            } catch (IOException e2) {
                m8746c();
                throw new C3520r.C3524c("Unable to connect to " + iVar2.f9498a.toString(), e2, iVar2);
            }
        } catch (IOException e3) {
            throw new C3520r.C3524c("Unable to connect to " + iVar2.f9498a.toString(), e3, iVar2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(1:19)|21|(1:25))|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r3 > android.support.p003v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) goto L_0x003a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18705b() throws com.fyber.inneractive.sdk.player.p059c.p078j.C3520r.C3524c {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f9546n     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x007b
            java.net.HttpURLConnection r2 = r9.f9545m     // Catch:{ all -> 0x008e }
            long r3 = r9.f9549q     // Catch:{ all -> 0x008e }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r9.f9549q     // Catch:{ all -> 0x008e }
            goto L_0x0018
        L_0x0013:
            long r3 = r9.f9549q     // Catch:{ all -> 0x008e }
            long r7 = r9.f9551s     // Catch:{ all -> 0x008e }
            long r3 = r3 - r7
        L_0x0018:
            int r7 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ all -> 0x008e }
            r8 = 19
            if (r7 == r8) goto L_0x0024
            int r7 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a     // Catch:{ all -> 0x008e }
            r8 = 20
            if (r7 != r8) goto L_0x006b
        L_0x0024:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x006b }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0034
            int r3 = r2.read()     // Catch:{ Exception -> 0x006b }
            r4 = -1
            if (r3 != r4) goto L_0x003a
            goto L_0x006b
        L_0x0034:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x006b
        L_0x003a:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006b }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x006b }
            if (r4 != 0) goto L_0x0052
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x006b }
            if (r3 == 0) goto L_0x006b
        L_0x0052:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006b }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006b }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006b }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006b }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006b }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            java.io.InputStream r2 = r9.f9546n     // Catch:{ IOException -> 0x0071 }
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x007b
        L_0x0071:
            r2 = move-exception
            com.fyber.inneractive.sdk.player.c.j.r$c r3 = new com.fyber.inneractive.sdk.player.c.j.r$c     // Catch:{ all -> 0x008e }
            com.fyber.inneractive.sdk.player.c.j.i r4 = r9.f9544l     // Catch:{ all -> 0x008e }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.fyber.inneractive.sdk.player.p059c.p078j.C3509i) r4, (int) r5)     // Catch:{ all -> 0x008e }
            throw r3     // Catch:{ all -> 0x008e }
        L_0x007b:
            r9.f9546n = r0
            r9.m8746c()
            boolean r0 = r9.f9547o
            if (r0 == 0) goto L_0x008d
            r9.f9547o = r1
            com.fyber.inneractive.sdk.player.c.j.u<? super com.fyber.inneractive.sdk.player.c.j.n> r0 = r9.f9543k
            if (r0 == 0) goto L_0x008d
            r0.mo19352b()
        L_0x008d:
            return
        L_0x008e:
            r2 = move-exception
            r9.f9546n = r0
            r9.m8746c()
            boolean r0 = r9.f9547o
            if (r0 == 0) goto L_0x00a1
            r9.f9547o = r1
            com.fyber.inneractive.sdk.player.c.j.u<? super com.fyber.inneractive.sdk.player.c.j.n> r0 = r9.f9543k
            if (r0 == 0) goto L_0x00a1
            r0.mo19352b()
        L_0x00a1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p078j.C3515n.mo18705b():void");
    }

    /* renamed from: a */
    private HttpURLConnection m8745a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f9537e);
        httpURLConnection.setReadTimeout(this.f9538f);
        C3520r.C3527f fVar = this.f9541i;
        if (fVar != null) {
            for (Map.Entry next : fVar.mo19356a().entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        for (Map.Entry next2 : this.f9542j.mo19356a().entrySet()) {
            httpURLConnection.setRequestProperty((String) next2.getKey(), (String) next2.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f9539g);
        if (!z) {
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m8744a(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x0029
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x002b
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.<init>(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
        L_0x0029:
            r4 = -1
        L_0x002b:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x009b
            java.util.regex.Pattern r1 = f9534b
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x009b
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x0087 }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0087 }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x0087 }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0087 }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0061
            r4 = r6
            goto L_0x009b
        L_0x0061:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x009b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.String r8 = "Inconsistent headers ["
            r1.<init>(r8)     // Catch:{ NumberFormatException -> 0x0087 }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0087 }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x0087 }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x0087 }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x0087 }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x0087 }
            r4 = r0
            goto L_0x009b
        L_0x0087:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.<init>(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            android.util.Log.e(r3, r10)
        L_0x009b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p078j.C3515n.m8744a(java.net.HttpURLConnection):long");
    }

    /* renamed from: c */
    private void m8746c() {
        HttpURLConnection httpURLConnection = this.f9545m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f9545m = null;
        }
    }

    /* renamed from: a */
    public final int mo18702a(byte[] bArr, int i, int i2) throws C3520r.C3524c {
        try {
            if (this.f9550r != this.f9548p) {
                byte[] andSet = f9535c.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.f9550r != this.f9548p) {
                    int read = this.f9546n.read(andSet, 0, (int) Math.min(this.f9548p - this.f9550r, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f9550r += (long) read;
                        if (this.f9543k != null) {
                            this.f9543k.mo19351a(read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                f9535c.set(andSet);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.f9549q != -1) {
                long j = this.f9549q - this.f9551s;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j);
            }
            int read2 = this.f9546n.read(bArr, i, i2);
            if (read2 != -1) {
                this.f9551s += (long) read2;
                if (this.f9543k != null) {
                    this.f9543k.mo19351a(read2);
                }
                return read2;
            } else if (this.f9549q == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new C3520r.C3524c(e, this.f9544l, 2);
        }
    }
}
