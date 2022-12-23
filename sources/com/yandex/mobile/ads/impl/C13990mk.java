package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.support.p003v4.media.session.PlaybackStateCompat;
import com.facebook.share.internal.ShareConstants;
import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.m41;
import com.yandex.mobile.ads.impl.o41;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.mk */
public class C13990mk extends C13966mb {

    /* renamed from: u */
    private static final Pattern f37413u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v */
    private static final AtomicReference<byte[]> f37414v = new AtomicReference<>();

    /* renamed from: e */
    private final boolean f37415e;

    /* renamed from: f */
    private final int f37416f;

    /* renamed from: g */
    private final int f37417g;

    /* renamed from: h */
    private final String f37418h;

    /* renamed from: i */
    private final vb0 f37419i;

    /* renamed from: j */
    private final vb0 f37420j = new vb0();

    /* renamed from: k */
    private final hw0 f37421k;

    /* renamed from: l */
    private C13504jj f37422l;

    /* renamed from: m */
    private b51 f37423m;

    /* renamed from: n */
    private InputStream f37424n;

    /* renamed from: o */
    private boolean f37425o;

    /* renamed from: p */
    private int f37426p;

    /* renamed from: q */
    private long f37427q;

    /* renamed from: r */
    private long f37428r;

    /* renamed from: s */
    private long f37429s;

    /* renamed from: t */
    private long f37430t;

    public C13990mk(String str, int i, int i2, boolean z, vb0 vb0) {
        super(true);
        this.f37418h = C13479j9.m37704a(str);
        this.f37416f = i;
        this.f37417g = i2;
        this.f37415e = z;
        this.f37419i = vb0;
        this.f37421k = m39493d();
    }

    /* renamed from: d */
    private b51 m39492d(C13504jj jjVar) throws IOException {
        C13504jj jjVar2 = jjVar;
        URL url = new URL(jjVar2.f35322a.toString());
        int i = jjVar2.f35323b;
        byte[] bArr = jjVar2.f35324c;
        long j = jjVar2.f35327f;
        long j2 = jjVar2.f35328g;
        boolean b = jjVar2.mo68007b(1);
        if (!this.f37415e) {
            return m39489a(url, i, bArr, j, j2, b, jjVar2.f35325d);
        }
        int i2 = 0;
        while (i2 <= 20) {
            Map<String, String> map = jjVar2.f35325d;
            int i3 = i2;
            byte[] bArr2 = bArr;
            long j3 = j2;
            b51 a = m39489a(url, i, bArr, j, j2, b, map);
            int f = a.mo65979f();
            String a2 = a.mo65973a(HttpHeaders.LOCATION);
            if ((i == 1 || i == 3) && (f == 300 || f == 301 || f == 302 || f == 303 || f == 307 || f == 308)) {
                url = m39490a(url, a2);
            } else if (i != 2 || (f != 300 && f != 301 && f != 302 && f != 303)) {
                return a;
            } else {
                url = m39490a(url, a2);
                bArr2 = null;
                i = 1;
            }
            i2 = i3 + 1;
            jjVar2 = jjVar;
            bArr = bArr2;
            j2 = j3;
        }
        throw new NoRouteToHostException("Too many redirects: " + i2);
    }

    /* renamed from: e */
    private void m39494e() throws IOException {
        if (this.f37429s != this.f37427q) {
            byte[] andSet = f37414v.getAndSet((Object) null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j = this.f37429s;
                long j2 = this.f37427q;
                if (j != j2) {
                    int read = this.f37424n.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f37429s += (long) read;
                        mo68634a(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    f37414v.set(andSet);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public Uri mo65276a() {
        b51 b51 = this.f37423m;
        if (b51 == null) {
            return null;
        }
        return Uri.parse(b51.mo65988o().mo68568g().toString());
    }

    /* renamed from: b */
    public Map<String, List<String>> mo65278b() {
        b51 b51 = this.f37423m;
        return b51 == null ? Collections.emptyMap() : b51.mo65982i().mo69512b();
    }

    public void close() throws tb0 {
        try {
            if (this.f37424n != null) {
                b51 b51 = this.f37423m;
                long j = this.f37428r;
                if (j != -1) {
                    j -= this.f37430t;
                }
                m39491a(b51, j);
                this.f37424n.close();
            }
            this.f37424n = null;
            if (this.f37425o) {
                this.f37425o = false;
                mo68636c();
            }
        } catch (IOException e) {
            throw new tb0(e, this.f37422l, 3);
        } catch (Throwable th) {
            this.f37424n = null;
            if (this.f37425o) {
                this.f37425o = false;
                mo68636c();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (r6 != 0) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo65275a(com.yandex.mobile.ads.impl.C13504jj r20) throws com.yandex.mobile.ads.impl.tb0 {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r1.f37422l = r2
            r3 = 0
            r1.f37430t = r3
            r1.f37429s = r3
            r19.mo68635b(r20)
            r5 = 1
            com.yandex.mobile.ads.impl.b51 r0 = r19.m39492d(r20)     // Catch:{ IOException -> 0x0168 }
            r1.f37423m = r0     // Catch:{ IOException -> 0x0168 }
            int r0 = r0.mo65979f()
            r1.f37426p = r0
            com.yandex.mobile.ads.impl.b51 r0 = r1.f37423m
            java.lang.String r0 = r0.mo65983j()
            int r6 = r1.f37426p
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 < r7) goto L_0x0147
            r8 = 299(0x12b, float:4.19E-43)
            if (r6 <= r8) goto L_0x002e
            goto L_0x0147
        L_0x002e:
            com.yandex.mobile.ads.impl.b51 r0 = r1.f37423m
            java.lang.String r6 = "Content-Type"
            r0.mo65973a(r6)
            int r0 = r1.f37426p
            if (r0 != r7) goto L_0x0040
            long r6 = r2.f35327f
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r6 = r3
        L_0x0041:
            r1.f37427q = r6
            com.yandex.mobile.ads.impl.b51 r0 = r1.f37423m
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r0 = r0.mo65973a(r6)
            java.lang.String r6 = "gzip"
            boolean r0 = r6.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0111
            long r6 = r2.f35328g
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x005f
            r1.f37428r = r6
            goto L_0x0115
        L_0x005f:
            com.yandex.mobile.ads.impl.b51 r6 = r1.f37423m
            java.lang.String r7 = "Content-Length"
            java.lang.String r7 = r6.mo65973a(r7)
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r11 = "DefaultHttpDataSource"
            java.lang.String r12 = "]"
            if (r10 != 0) goto L_0x008d
            long r13 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0076 }
            goto L_0x008e
        L_0x0076:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "Unexpected Content-Length ["
            r10.append(r13)
            r10.append(r7)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r11, r10)
        L_0x008d:
            r13 = r8
        L_0x008e:
            java.lang.String r10 = "Content-Range"
            java.lang.String r6 = r6.mo65973a(r10)
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 != 0) goto L_0x0102
            java.util.regex.Pattern r10 = f37413u
            java.util.regex.Matcher r10 = r10.matcher(r6)
            boolean r15 = r10.find()
            if (r15 == 0) goto L_0x0102
            r15 = 2
            java.lang.String r15 = r10.group(r15)     // Catch:{ NumberFormatException -> 0x00eb }
            long r15 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x00eb }
            java.lang.String r10 = r10.group(r5)     // Catch:{ NumberFormatException -> 0x00eb }
            long r17 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x00eb }
            long r15 = r15 - r17
            r17 = 1
            long r8 = r15 + r17
            int r10 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c3
            r13 = r8
            goto L_0x0102
        L_0x00c3:
            int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0102
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00eb }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x00eb }
            java.lang.String r4 = "Inconsistent headers ["
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x00eb }
            r3.append(r7)     // Catch:{ NumberFormatException -> 0x00eb }
            java.lang.String r4 = "] ["
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x00eb }
            r3.append(r6)     // Catch:{ NumberFormatException -> 0x00eb }
            r3.append(r12)     // Catch:{ NumberFormatException -> 0x00eb }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x00eb }
            android.util.Log.w(r11, r3)     // Catch:{ NumberFormatException -> 0x00eb }
            long r13 = java.lang.Math.max(r13, r8)     // Catch:{ NumberFormatException -> 0x00eb }
            goto L_0x0102
        L_0x00eb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected Content-Range ["
            r3.append(r4)
            r3.append(r6)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r11, r3)
        L_0x0102:
            r3 = -1
            int r6 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x010d
            long r3 = r1.f37427q
            long r8 = r13 - r3
            goto L_0x010e
        L_0x010d:
            r8 = r3
        L_0x010e:
            r1.f37428r = r8
            goto L_0x0115
        L_0x0111:
            long r3 = r2.f35328g
            r1.f37428r = r3
        L_0x0115:
            com.yandex.mobile.ads.impl.b51 r3 = r1.f37423m     // Catch:{ IOException -> 0x0140 }
            com.yandex.mobile.ads.impl.e51 r3 = r3.mo65974b()     // Catch:{ IOException -> 0x0140 }
            if (r3 == 0) goto L_0x0138
            com.yandex.mobile.ads.impl.b51 r3 = r1.f37423m     // Catch:{ IOException -> 0x0140 }
            com.yandex.mobile.ads.impl.e51 r3 = r3.mo65974b()     // Catch:{ IOException -> 0x0140 }
            okio.BufferedSource r3 = r3.mo66402c()     // Catch:{ IOException -> 0x0140 }
            java.io.InputStream r3 = r3.inputStream()     // Catch:{ IOException -> 0x0140 }
            r1.f37424n = r3     // Catch:{ IOException -> 0x0140 }
            if (r0 == 0) goto L_0x0138
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0140 }
            java.io.InputStream r3 = r1.f37424n     // Catch:{ IOException -> 0x0140 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0140 }
            r1.f37424n = r0     // Catch:{ IOException -> 0x0140 }
        L_0x0138:
            r1.f37425o = r5
            r19.mo68637c(r20)
            long r2 = r1.f37428r
            return r2
        L_0x0140:
            r0 = move-exception
            com.yandex.mobile.ads.impl.tb0 r3 = new com.yandex.mobile.ads.impl.tb0
            r3.<init>((java.io.IOException) r0, (com.yandex.mobile.ads.impl.C13504jj) r2, (int) r5)
            throw r3
        L_0x0147:
            com.yandex.mobile.ads.impl.b51 r3 = r1.f37423m
            com.yandex.mobile.ads.impl.q90 r3 = r3.mo65982i()
            java.util.Map r3 = r3.mo69512b()
            com.yandex.mobile.ads.impl.ub0 r4 = new com.yandex.mobile.ads.impl.ub0
            int r5 = r1.f37426p
            r4.<init>(r5, r0, r3, r2)
            int r0 = r1.f37426p
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x0167
            com.yandex.mobile.ads.impl.ij r0 = new com.yandex.mobile.ads.impl.ij
            r2 = 0
            r0.<init>(r2)
            r4.initCause(r0)
        L_0x0167:
            throw r4
        L_0x0168:
            r0 = move-exception
            com.yandex.mobile.ads.impl.tb0 r3 = new com.yandex.mobile.ads.impl.tb0
            java.lang.String r4 = "Unable to connect"
            r3.<init>(r4, r0, r2, r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13990mk.mo65275a(com.yandex.mobile.ads.impl.jj):long");
    }

    /* renamed from: d */
    private hw0 m39493d() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new hw0(new hw0.C13355a().mo67668a((long) this.f37416f, timeUnit).mo67672b((long) this.f37417g, timeUnit).mo67670a(!this.f37415e));
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws tb0 {
        try {
            m39494e();
            if (i2 == 0) {
                return 0;
            }
            long j = this.f37428r;
            if (j != -1) {
                long j2 = j - this.f37430t;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j2);
            }
            int read = this.f37424n.read(bArr, i, i2);
            if (read != -1) {
                this.f37430t += (long) read;
                mo68634a(read);
                return read;
            } else if (this.f37428r == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new tb0(e, this.f37422l, 2);
        }
    }

    /* renamed from: a */
    private b51 m39489a(URL url, int i, byte[] bArr, long j, long j2, boolean z, Map map) throws IOException {
        o41 o41;
        m41.C13954a a = new m41.C13954a().mo68575a(url);
        HashMap hashMap = new HashMap();
        vb0 vb0 = this.f37419i;
        if (vb0 != null) {
            hashMap.putAll(vb0.mo70467a());
        }
        hashMap.putAll(this.f37420j.mo70467a());
        hashMap.putAll(map);
        m41.C13954a a2 = a.mo68571a(q90.f39028c.mo69522a((Map<String, String>) hashMap));
        if (!(j == 0 && j2 == -1)) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            a2 = a2.mo68574a("Range", str);
        }
        if (bArr == null) {
            o41 = null;
        } else {
            o41.C14166a aVar = o41.f38088a;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            o41 = o41.C14166a.m40287a(aVar, bArr, 0, 0, 7);
        }
        m41.C13954a a3 = a2.mo68574a("User-Agent", this.f37418h).mo68574a(HttpHeaders.ACCEPT_ENCODING, z ? "gzip" : "identity").mo68573a(C13504jj.m37845a(i), o41);
        hw0 hw0 = this.f37421k;
        m41 a4 = a3.mo68576a();
        hw0.getClass();
        Intrinsics.checkNotNullParameter(a4, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        return new x21(hw0, a4, false).mo70797b();
    }

    /* renamed from: a */
    private static URL m39490a(URL url, String str) throws IOException {
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
    private static void m39491a(b51 b51, long j) {
        int i = ih1.f34858a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = b51.mo65974b().mo66402c().inputStream();
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
