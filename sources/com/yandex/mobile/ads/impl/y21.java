package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.b51;
import com.yandex.mobile.ads.impl.lz0;
import com.yandex.mobile.ads.impl.m41;
import com.yandex.mobile.ads.impl.nb0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

public final class y21 extends nb0.C14079c implements C13205gh {

    /* renamed from: b */
    private final k61 f42748b;

    /* renamed from: c */
    private Socket f42749c;

    /* renamed from: d */
    private Socket f42750d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public m90 f42751e;

    /* renamed from: f */
    private w11 f42752f;

    /* renamed from: g */
    private nb0 f42753g;

    /* renamed from: h */
    private BufferedSource f42754h;

    /* renamed from: i */
    private BufferedSink f42755i;

    /* renamed from: j */
    private boolean f42756j;

    /* renamed from: k */
    private boolean f42757k;

    /* renamed from: l */
    private int f42758l;

    /* renamed from: m */
    private int f42759m;

    /* renamed from: n */
    private int f42760n;

    /* renamed from: o */
    private int f42761o = 1;

    /* renamed from: p */
    private final List<Reference<x21>> f42762p = new ArrayList();

    /* renamed from: q */
    private long f42763q = Long.MAX_VALUE;

    /* renamed from: com.yandex.mobile.ads.impl.y21$a */
    public /* synthetic */ class C15231a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42764a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f42764a = iArr;
        }
    }

    public y21(b31 b31, k61 k61) {
        Intrinsics.checkNotNullParameter(b31, "connectionPool");
        Intrinsics.checkNotNullParameter(k61, "route");
        this.f42748b = k61;
    }

    /* renamed from: b */
    public final void mo70979b(boolean z) {
        this.f42756j = z;
    }

    /* renamed from: c */
    public final long mo70980c() {
        return this.f42763q;
    }

    /* renamed from: d */
    public final boolean mo70981d() {
        return this.f42756j;
    }

    /* renamed from: e */
    public final int mo70982e() {
        return this.f42758l;
    }

    /* renamed from: f */
    public m90 mo70983f() {
        return this.f42751e;
    }

    /* renamed from: g */
    public final synchronized void mo70984g() {
        this.f42759m++;
    }

    /* renamed from: h */
    public final boolean mo70985h() {
        return this.f42753g != null;
    }

    /* renamed from: i */
    public final synchronized void mo70986i() {
        this.f42757k = true;
    }

    /* renamed from: j */
    public final synchronized void mo70987j() {
        this.f42756j = true;
    }

    /* renamed from: k */
    public k61 mo70988k() {
        return this.f42748b;
    }

    /* renamed from: l */
    public Socket mo70989l() {
        Socket socket = this.f42750d;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f42748b.mo68140a().mo69885k().mo66958g());
        sb.append(':');
        sb.append(this.f42748b.mo68140a().mo69885k().mo66961i());
        sb.append(", proxy=");
        sb.append(this.f42748b.mo68141b());
        sb.append(" hostAddress=");
        sb.append(this.f42748b.mo68143d());
        sb.append(" cipherSuite=");
        m90 m90 = this.f42751e;
        if (m90 == null || (obj = m90.mo68623a()) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f42752f);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo70974a(long j) {
        this.f42763q = j;
    }

    /* renamed from: b */
    public final List<Reference<x21>> mo70978b() {
        return this.f42762p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0164  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70973a(int r18, int r19, int r20, int r21, boolean r22, com.yandex.mobile.ads.impl.C12380ae r23, com.yandex.mobile.ads.impl.b40 r24) {
        /*
            r17 = this;
            r7 = r17
            r8 = r23
            r9 = r24
            java.lang.String r10 = "proxy"
            java.lang.String r11 = "inetSocketAddress"
            java.lang.String r12 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r12)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.yandex.mobile.ads.impl.w11 r0 = r7.f42752f
            r13 = 1
            if (r0 != 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x0180
            com.yandex.mobile.ads.impl.k61 r0 = r7.f42748b
            com.yandex.mobile.ads.impl.s5 r0 = r0.mo68140a()
            java.util.List r0 = r0.mo69874b()
            com.yandex.mobile.ads.impl.kh r14 = new com.yandex.mobile.ads.impl.kh
            r14.<init>(r0)
            com.yandex.mobile.ads.impl.k61 r1 = r7.f42748b
            com.yandex.mobile.ads.impl.s5 r1 = r1.mo68140a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo69884j()
            if (r1 != 0) goto L_0x008a
            com.yandex.mobile.ads.impl.jh r1 = com.yandex.mobile.ads.impl.C13500jh.f35296f
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x007d
            com.yandex.mobile.ads.impl.k61 r0 = r7.f42748b
            com.yandex.mobile.ads.impl.s5 r0 = r0.mo68140a()
            com.yandex.mobile.ads.impl.fc0 r0 = r0.mo69885k()
            java.lang.String r0 = r0.mo66958g()
            com.yandex.mobile.ads.impl.lz0$a r1 = com.yandex.mobile.ads.impl.lz0.f37135a
            com.yandex.mobile.ads.impl.lz0 r1 = com.yandex.mobile.ads.impl.lz0.f37136b
            boolean r1 = r1.mo68542b((java.lang.String) r0)
            if (r1 == 0) goto L_0x005c
            goto L_0x009c
        L_0x005c:
            com.yandex.mobile.ads.impl.m61 r1 = new com.yandex.mobile.ads.impl.m61
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x007d:
            com.yandex.mobile.ads.impl.m61 r0 = new com.yandex.mobile.ads.impl.m61
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x008a:
            com.yandex.mobile.ads.impl.k61 r0 = r7.f42748b
            com.yandex.mobile.ads.impl.s5 r0 = r0.mo68140a()
            java.util.List r0 = r0.mo69877e()
            com.yandex.mobile.ads.impl.w11 r1 = com.yandex.mobile.ads.impl.w11.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0173
        L_0x009c:
            r15 = 0
            r6 = r15
        L_0x009e:
            com.yandex.mobile.ads.impl.k61 r0 = r7.f42748b     // Catch:{ IOException -> 0x0114 }
            boolean r0 = r0.mo68142c()     // Catch:{ IOException -> 0x0114 }
            if (r0 == 0) goto L_0x00c7
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r23
            r16 = r6
            r6 = r24
            r1.m44175a(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00c1 }
            java.net.Socket r0 = r7.f42749c     // Catch:{ IOException -> 0x00c1 }
            if (r0 != 0) goto L_0x00bc
            goto L_0x00ed
        L_0x00bc:
            r1 = r18
            r2 = r19
            goto L_0x00d0
        L_0x00c1:
            r0 = move-exception
            r1 = r18
            r2 = r19
            goto L_0x0111
        L_0x00c7:
            r1 = r18
            r2 = r19
            r16 = r6
            r7.m44176a((int) r1, (int) r2, (com.yandex.mobile.ads.impl.C12380ae) r8, (com.yandex.mobile.ads.impl.b40) r9)     // Catch:{ IOException -> 0x0110 }
        L_0x00d0:
            r3 = r21
            r7.m44177a((com.yandex.mobile.ads.impl.C13708kh) r14, (int) r3, (com.yandex.mobile.ads.impl.C12380ae) r8, (com.yandex.mobile.ads.impl.b40) r9)     // Catch:{ IOException -> 0x010e }
            com.yandex.mobile.ads.impl.k61 r0 = r7.f42748b     // Catch:{ IOException -> 0x010e }
            java.net.InetSocketAddress r0 = r0.mo68143d()     // Catch:{ IOException -> 0x010e }
            com.yandex.mobile.ads.impl.k61 r4 = r7.f42748b     // Catch:{ IOException -> 0x010e }
            java.net.Proxy r4 = r4.mo68141b()     // Catch:{ IOException -> 0x010e }
            r24.getClass()     // Catch:{ IOException -> 0x010e }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r12)     // Catch:{ IOException -> 0x010e }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r11)     // Catch:{ IOException -> 0x010e }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r10)     // Catch:{ IOException -> 0x010e }
        L_0x00ed:
            com.yandex.mobile.ads.impl.k61 r0 = r7.f42748b
            boolean r0 = r0.mo68142c()
            if (r0 == 0) goto L_0x0107
            java.net.Socket r0 = r7.f42749c
            if (r0 == 0) goto L_0x00fa
            goto L_0x0107
        L_0x00fa:
            com.yandex.mobile.ads.impl.m61 r0 = new com.yandex.mobile.ads.impl.m61
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0107:
            long r0 = java.lang.System.nanoTime()
            r7.f42763q = r0
            return
        L_0x010e:
            r0 = move-exception
            goto L_0x011d
        L_0x0110:
            r0 = move-exception
        L_0x0111:
            r3 = r21
            goto L_0x011d
        L_0x0114:
            r0 = move-exception
            r1 = r18
            r2 = r19
            r3 = r21
            r16 = r6
        L_0x011d:
            java.net.Socket r4 = r7.f42750d
            if (r4 != 0) goto L_0x0122
            goto L_0x0125
        L_0x0122:
            com.yandex.mobile.ads.impl.jh1.m37827a((java.net.Socket) r4)
        L_0x0125:
            java.net.Socket r4 = r7.f42749c
            if (r4 != 0) goto L_0x012a
            goto L_0x012d
        L_0x012a:
            com.yandex.mobile.ads.impl.jh1.m37827a((java.net.Socket) r4)
        L_0x012d:
            r7.f42750d = r15
            r7.f42749c = r15
            r7.f42754h = r15
            r7.f42755i = r15
            r7.f42751e = r15
            r7.f42752f = r15
            r7.f42753g = r15
            r7.f42761o = r13
            com.yandex.mobile.ads.impl.k61 r4 = r7.f42748b
            java.net.InetSocketAddress r4 = r4.mo68143d()
            com.yandex.mobile.ads.impl.k61 r5 = r7.f42748b
            java.net.Proxy r5 = r5.mo68141b()
            r24.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r10)
            java.lang.String r4 = "ioe"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            r4 = r16
            if (r4 != 0) goto L_0x0164
            com.yandex.mobile.ads.impl.m61 r6 = new com.yandex.mobile.ads.impl.m61
            r6.<init>(r0)
            goto L_0x0168
        L_0x0164:
            r4.mo68582a(r0)
            r6 = r4
        L_0x0168:
            if (r22 == 0) goto L_0x0172
            boolean r0 = r14.mo68227a((java.io.IOException) r0)
            if (r0 == 0) goto L_0x0172
            goto L_0x009e
        L_0x0172:
            throw r6
        L_0x0173:
            com.yandex.mobile.ads.impl.m61 r0 = new com.yandex.mobile.ads.impl.m61
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0180:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.y21.mo70973a(int, int, int, int, boolean, com.yandex.mobile.ads.impl.ae, com.yandex.mobile.ads.impl.b40):void");
    }

    /* renamed from: a */
    private final void m44176a(int i, int i2, C12380ae aeVar, b40 b40) throws IOException {
        Socket socket;
        Proxy b = this.f42748b.mo68141b();
        C14563s5 a = this.f42748b.mo68140a();
        Proxy.Type type = b.type();
        int i3 = type == null ? -1 : C15231a.f42764a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socket = a.mo69883i().createSocket();
            Intrinsics.checkNotNull(socket);
        } else {
            socket = new Socket(b);
        }
        this.f42749c = socket;
        InetSocketAddress d = this.f42748b.mo68143d();
        b40.getClass();
        Intrinsics.checkNotNullParameter(aeVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(d, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(b, "proxy");
        socket.setSoTimeout(i2);
        try {
            lz0.C13944a aVar = lz0.f37135a;
            lz0.f37136b.mo68536a(socket, this.f42748b.mo68143d(), i);
            try {
                this.f42754h = Okio.buffer(Okio.source(socket));
                this.f42755i = Okio.buffer(Okio.sink(socket));
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual((Object) e.getMessage(), (Object) "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(Intrinsics.stringPlus("Failed to connect to ", this.f42748b.mo68143d()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x021c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m44177a(com.yandex.mobile.ads.impl.C13708kh r11, int r12, com.yandex.mobile.ads.impl.C12380ae r13, com.yandex.mobile.ads.impl.b40 r14) throws java.io.IOException {
        /*
            r10 = this;
            com.yandex.mobile.ads.impl.k61 r0 = r10.f42748b
            com.yandex.mobile.ads.impl.s5 r0 = r0.mo68140a()
            javax.net.ssl.SSLSocketFactory r0 = r0.mo69884j()
            if (r0 != 0) goto L_0x0031
            com.yandex.mobile.ads.impl.k61 r11 = r10.f42748b
            com.yandex.mobile.ads.impl.s5 r11 = r11.mo68140a()
            java.util.List r11 = r11.mo69877e()
            com.yandex.mobile.ads.impl.w11 r13 = com.yandex.mobile.ads.impl.w11.H2_PRIOR_KNOWLEDGE
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L_0x0028
            java.net.Socket r11 = r10.f42749c
            r10.f42750d = r11
            r10.f42752f = r13
            r10.m44174a((int) r12)
            return
        L_0x0028:
            java.net.Socket r11 = r10.f42749c
            r10.f42750d = r11
            com.yandex.mobile.ads.impl.w11 r11 = com.yandex.mobile.ads.impl.w11.HTTP_1_1
            r10.f42752f = r11
            return
        L_0x0031:
            r14.getClass()
            java.lang.String r14 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r14)
            com.yandex.mobile.ads.impl.k61 r0 = r10.f42748b
            com.yandex.mobile.ads.impl.s5 r0 = r0.mo68140a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo69884j()
            r2 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ all -> 0x020d }
            java.net.Socket r3 = r10.f42749c     // Catch:{ all -> 0x020d }
            com.yandex.mobile.ads.impl.fc0 r4 = r0.mo69885k()     // Catch:{ all -> 0x020d }
            java.lang.String r4 = r4.mo66958g()     // Catch:{ all -> 0x020d }
            com.yandex.mobile.ads.impl.fc0 r5 = r0.mo69885k()     // Catch:{ all -> 0x020d }
            int r5 = r5.mo66961i()     // Catch:{ all -> 0x020d }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x020d }
            if (r1 == 0) goto L_0x0205
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x020d }
            com.yandex.mobile.ads.impl.jh r11 = r11.mo68226a((javax.net.ssl.SSLSocket) r1)     // Catch:{ all -> 0x0202 }
            boolean r3 = r11.mo67994c()     // Catch:{ all -> 0x0202 }
            if (r3 == 0) goto L_0x0081
            com.yandex.mobile.ads.impl.lz0$a r3 = com.yandex.mobile.ads.impl.lz0.f37135a     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.lz0 r3 = com.yandex.mobile.ads.impl.lz0.f37136b     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.fc0 r4 = r0.mo69885k()     // Catch:{ all -> 0x0202 }
            java.lang.String r4 = r4.mo66958g()     // Catch:{ all -> 0x0202 }
            java.util.List r5 = r0.mo69877e()     // Catch:{ all -> 0x0202 }
            r3.mo68538a((javax.net.ssl.SSLSocket) r1, (java.lang.String) r4, (java.util.List<com.yandex.mobile.ads.impl.w11>) r5)     // Catch:{ all -> 0x0202 }
        L_0x0081:
            r1.startHandshake()     // Catch:{ all -> 0x0202 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.m90$a r4 = com.yandex.mobile.ads.impl.m90.f37265e     // Catch:{ all -> 0x0202 }
            java.lang.String r5 = "sslSocketSession"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.m90 r4 = r4.mo68630a(r3)     // Catch:{ all -> 0x0202 }
            javax.net.ssl.HostnameVerifier r5 = r0.mo69876d()     // Catch:{ all -> 0x0202 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.fc0 r7 = r0.mo69885k()     // Catch:{ all -> 0x0202 }
            java.lang.String r7 = r7.mo66958g()     // Catch:{ all -> 0x0202 }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x0202 }
            if (r3 != 0) goto L_0x0132
            java.util.List r11 = r4.mo68625c()     // Catch:{ all -> 0x0202 }
            boolean r12 = r11.isEmpty()     // Catch:{ all -> 0x0202 }
            r12 = r12 ^ r6
            if (r12 == 0) goto L_0x010e
            r12 = 0
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x0202 }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x0202 }
            javax.net.ssl.SSLPeerUnverifiedException r12 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0202 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0202 }
            r13.<init>()     // Catch:{ all -> 0x0202 }
            java.lang.String r14 = "\n              |Hostname "
            r13.append(r14)     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.fc0 r14 = r0.mo69885k()     // Catch:{ all -> 0x0202 }
            java.lang.String r14 = r14.mo66958g()     // Catch:{ all -> 0x0202 }
            r13.append(r14)     // Catch:{ all -> 0x0202 }
            java.lang.String r14 = " not verified:\n              |    certificate: "
            r13.append(r14)     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.te$b r14 = com.yandex.mobile.ads.impl.C14669te.f40290c     // Catch:{ all -> 0x0202 }
            java.lang.String r14 = r14.mo70165a((java.security.cert.Certificate) r11)     // Catch:{ all -> 0x0202 }
            r13.append(r14)     // Catch:{ all -> 0x0202 }
            java.lang.String r14 = "\n              |    DN: "
            r13.append(r14)     // Catch:{ all -> 0x0202 }
            java.security.Principal r14 = r11.getSubjectDN()     // Catch:{ all -> 0x0202 }
            java.lang.String r14 = r14.getName()     // Catch:{ all -> 0x0202 }
            r13.append(r14)     // Catch:{ all -> 0x0202 }
            java.lang.String r14 = "\n              |    subjectAltNames: "
            r13.append(r14)     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.gw0 r14 = com.yandex.mobile.ads.impl.gw0.f34161a     // Catch:{ all -> 0x0202 }
            java.util.List r11 = r14.mo67355a((java.security.cert.X509Certificate) r11)     // Catch:{ all -> 0x0202 }
            r13.append(r11)     // Catch:{ all -> 0x0202 }
            java.lang.String r11 = "\n              "
            r13.append(r11)     // Catch:{ all -> 0x0202 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x0202 }
            java.lang.String r11 = kotlin.text.StringsKt.trimMargin$default(r11, r2, r6, r2)     // Catch:{ all -> 0x0202 }
            r12.<init>(r11)     // Catch:{ all -> 0x0202 }
            throw r12     // Catch:{ all -> 0x0202 }
        L_0x010e:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0202 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0202 }
            r12.<init>()     // Catch:{ all -> 0x0202 }
            java.lang.String r13 = "Hostname "
            r12.append(r13)     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.fc0 r13 = r0.mo69885k()     // Catch:{ all -> 0x0202 }
            java.lang.String r13 = r13.mo66958g()     // Catch:{ all -> 0x0202 }
            r12.append(r13)     // Catch:{ all -> 0x0202 }
            java.lang.String r13 = " not verified (no certificates)"
            r12.append(r13)     // Catch:{ all -> 0x0202 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0202 }
            r11.<init>(r12)     // Catch:{ all -> 0x0202 }
            throw r11     // Catch:{ all -> 0x0202 }
        L_0x0132:
            com.yandex.mobile.ads.impl.te r3 = r0.mo69872a()     // Catch:{ all -> 0x0202 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.m90 r5 = new com.yandex.mobile.ads.impl.m90     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.fe1 r6 = r4.mo68626d()     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.xe r7 = r4.mo68623a()     // Catch:{ all -> 0x0202 }
            java.util.List r8 = r4.mo68624b()     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.z21 r9 = new com.yandex.mobile.ads.impl.z21     // Catch:{ all -> 0x0202 }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x0202 }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0202 }
            r10.f42751e = r5     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.fc0 r0 = r0.mo69885k()     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r0.mo66958g()     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.a31 r4 = new com.yandex.mobile.ads.impl.a31     // Catch:{ all -> 0x0202 }
            r4.<init>(r10)     // Catch:{ all -> 0x0202 }
            r3.mo70161a((java.lang.String) r0, (kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.X509Certificate>>) r4)     // Catch:{ all -> 0x0202 }
            boolean r11 = r11.mo67994c()     // Catch:{ all -> 0x0202 }
            if (r11 == 0) goto L_0x0171
            com.yandex.mobile.ads.impl.lz0$a r11 = com.yandex.mobile.ads.impl.lz0.f37135a     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.lz0 r11 = com.yandex.mobile.ads.impl.lz0.f37136b     // Catch:{ all -> 0x0202 }
            java.lang.String r2 = r11.mo68540b((javax.net.ssl.SSLSocket) r1)     // Catch:{ all -> 0x0202 }
        L_0x0171:
            r10.f42750d = r1     // Catch:{ all -> 0x0202 }
            okio.Source r11 = okio.Okio.source((java.net.Socket) r1)     // Catch:{ all -> 0x0202 }
            okio.BufferedSource r11 = okio.Okio.buffer((okio.Source) r11)     // Catch:{ all -> 0x0202 }
            r10.f42754h = r11     // Catch:{ all -> 0x0202 }
            okio.Sink r11 = okio.Okio.sink((java.net.Socket) r1)     // Catch:{ all -> 0x0202 }
            okio.BufferedSink r11 = okio.Okio.buffer((okio.Sink) r11)     // Catch:{ all -> 0x0202 }
            r10.f42755i = r11     // Catch:{ all -> 0x0202 }
            if (r2 == 0) goto L_0x01e8
            java.lang.String r11 = "protocol"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r11)     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.w11 r11 = com.yandex.mobile.ads.impl.w11.HTTP_1_0     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r11.f41847b     // Catch:{ all -> 0x0202 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x019b
            goto L_0x01ea
        L_0x019b:
            com.yandex.mobile.ads.impl.w11 r11 = com.yandex.mobile.ads.impl.w11.HTTP_1_1     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r11.f41847b     // Catch:{ all -> 0x0202 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x01a8
            goto L_0x01ea
        L_0x01a8:
            com.yandex.mobile.ads.impl.w11 r11 = com.yandex.mobile.ads.impl.w11.H2_PRIOR_KNOWLEDGE     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r11.f41847b     // Catch:{ all -> 0x0202 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x01b5
            goto L_0x01ea
        L_0x01b5:
            com.yandex.mobile.ads.impl.w11 r11 = com.yandex.mobile.ads.impl.w11.HTTP_2     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r11.f41847b     // Catch:{ all -> 0x0202 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x01c2
            goto L_0x01ea
        L_0x01c2:
            com.yandex.mobile.ads.impl.w11 r11 = com.yandex.mobile.ads.impl.w11.SPDY_3     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r11.f41847b     // Catch:{ all -> 0x0202 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x01cf
            goto L_0x01ea
        L_0x01cf:
            com.yandex.mobile.ads.impl.w11 r11 = com.yandex.mobile.ads.impl.w11.QUIC     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r11.f41847b     // Catch:{ all -> 0x0202 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x01dc
            goto L_0x01ea
        L_0x01dc:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x0202 }
            java.lang.String r12 = "Unexpected protocol: "
            java.lang.String r12 = kotlin.jvm.internal.Intrinsics.stringPlus(r12, r2)     // Catch:{ all -> 0x0202 }
            r11.<init>(r12)     // Catch:{ all -> 0x0202 }
            throw r11     // Catch:{ all -> 0x0202 }
        L_0x01e8:
            com.yandex.mobile.ads.impl.w11 r11 = com.yandex.mobile.ads.impl.w11.HTTP_1_1     // Catch:{ all -> 0x0202 }
        L_0x01ea:
            r10.f42752f = r11     // Catch:{ all -> 0x0202 }
            com.yandex.mobile.ads.impl.lz0$a r11 = com.yandex.mobile.ads.impl.lz0.f37135a
            com.yandex.mobile.ads.impl.lz0 r11 = com.yandex.mobile.ads.impl.lz0.f37136b
            r11.mo68537a((javax.net.ssl.SSLSocket) r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r14)
            com.yandex.mobile.ads.impl.w11 r11 = r10.f42752f
            com.yandex.mobile.ads.impl.w11 r13 = com.yandex.mobile.ads.impl.w11.HTTP_2
            if (r11 != r13) goto L_0x0201
            r10.m44174a((int) r12)
        L_0x0201:
            return
        L_0x0202:
            r11 = move-exception
            r2 = r1
            goto L_0x020e
        L_0x0205:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x020d }
            java.lang.String r12 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r12)     // Catch:{ all -> 0x020d }
            throw r11     // Catch:{ all -> 0x020d }
        L_0x020d:
            r11 = move-exception
        L_0x020e:
            if (r2 == 0) goto L_0x0219
            com.yandex.mobile.ads.impl.lz0$a r12 = com.yandex.mobile.ads.impl.lz0.f37135a
            com.yandex.mobile.ads.impl.lz0 r12 = com.yandex.mobile.ads.impl.lz0.f37136b
            r12.mo68537a((javax.net.ssl.SSLSocket) r2)
        L_0x0219:
            if (r2 != 0) goto L_0x021c
            goto L_0x021f
        L_0x021c:
            com.yandex.mobile.ads.impl.jh1.m37827a((java.net.Socket) r2)
        L_0x021f:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.y21.m44177a(com.yandex.mobile.ads.impl.kh, int, com.yandex.mobile.ads.impl.ae, com.yandex.mobile.ads.impl.b40):void");
    }

    /* renamed from: a */
    private final void m44174a(int i) throws IOException {
        Socket socket = this.f42750d;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.f42754h;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.f42755i;
        Intrinsics.checkNotNull(bufferedSink);
        socket.setSoTimeout(0);
        nb0 nb0 = new nb0(new nb0.C14077a(true, cd1.f31895i).mo69001a(socket, this.f42748b.mo68140a().mo69885k().mo66958g(), bufferedSource, bufferedSink).mo69000a((nb0.C14079c) this).mo68999a(i));
        this.f42753g = nb0;
        nb0.C14078b bVar = nb0.f37718D;
        this.f42761o = nb0.f37719E.mo66782c();
        nb0.m39940a(nb0, false, (cd1) null, 3);
    }

    /* renamed from: a */
    private final void m44175a(int i, int i2, int i3, C12380ae aeVar, b40 b40) throws IOException {
        m41 m41;
        int i4 = i2;
        C12380ae aeVar2 = aeVar;
        hw0 hw0 = null;
        boolean z = true;
        m41 a = new m41.C13954a().mo68570a(this.f42748b.mo68140a().mo69885k()).mo68573a("CONNECT", (o41) null).mo68577b(HttpHeaders.HOST, jh1.m37819a(this.f42748b.mo68140a().mo69885k(), true)).mo68577b("Proxy-Connection", "Keep-Alive").mo68577b("User-Agent", "okhttp/4.9.3").mo68576a();
        m41 a2 = this.f42748b.mo68140a().mo69880g().mo68945a(this.f42748b, new b51.C12571a().mo65995a(a).mo65998a(w11.HTTP_1_1).mo65991a(407).mo65999a("Preemptive Authenticate").mo65994a(jh1.f35307c).mo66004b(-1).mo65992a(-1).mo66006b(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive").mo66001a());
        if (a2 != null) {
            a = a2;
        }
        fc0 g = m41.mo68568g();
        int i5 = 0;
        while (true) {
            i5 += z ? 1 : 0;
            m44176a(i, i4, aeVar2, b40);
            String str = "CONNECT " + jh1.m37819a(g, z) + " HTTP/1.1";
            while (true) {
                BufferedSource bufferedSource = this.f42754h;
                Intrinsics.checkNotNull(bufferedSource);
                BufferedSink bufferedSink = this.f42755i;
                Intrinsics.checkNotNull(bufferedSink);
                lb0 lb0 = new lb0(hw0, this, bufferedSource, bufferedSink);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                bufferedSource.timeout().timeout((long) i4, timeUnit);
                bufferedSink.timeout().timeout((long) i3, timeUnit);
                lb0.mo68396a(m41.mo68565d(), str);
                lb0.mo66760b();
                b51.C12571a a3 = lb0.mo66754a(false);
                Intrinsics.checkNotNull(a3);
                b51 a4 = a3.mo65995a(m41).mo66001a();
                lb0.mo68397c(a4);
                int f = a4.mo65979f();
                if (f != 200) {
                    if (f == 407) {
                        m41 a5 = this.f42748b.mo68140a().mo69880g().mo68945a(this.f42748b, a4);
                        if (a5 == null) {
                            throw new IOException("Failed to authenticate with proxy");
                        } else if (StringsKt.equals("close", b51.m34138a(a4, HttpHeaders.CONNECTION, (String) null, 2), true)) {
                            m41 = a5;
                            break;
                        } else {
                            int i6 = i;
                            b40 b402 = b40;
                            m41 = a5;
                            hw0 = null;
                        }
                    } else {
                        throw new IOException(Intrinsics.stringPlus("Unexpected response code for CONNECT: ", Integer.valueOf(a4.mo65979f())));
                    }
                } else if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    m41 = null;
                }
            }
            if (m41 != null) {
                Socket socket = this.f42749c;
                if (socket != null) {
                    jh1.m37827a(socket);
                }
                this.f42749c = null;
                this.f42755i = null;
                this.f42754h = null;
                InetSocketAddress d = this.f42748b.mo68143d();
                Proxy b = this.f42748b.mo68141b();
                Intrinsics.checkNotNullParameter(aeVar2, NotificationCompat.CATEGORY_CALL);
                Intrinsics.checkNotNullParameter(d, "inetSocketAddress");
                Intrinsics.checkNotNullParameter(b, "proxy");
                if (i5 < 21) {
                    hw0 = null;
                    z = true;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        throw new IOException("TLS tunnel buffered too many bytes!");
    }

    /* renamed from: a */
    public final e40 mo70971a(hw0 hw0, c31 c31) throws SocketException {
        Intrinsics.checkNotNullParameter(hw0, "client");
        Intrinsics.checkNotNullParameter(c31, "chain");
        Socket socket = this.f42750d;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.f42754h;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.f42755i;
        Intrinsics.checkNotNull(bufferedSink);
        nb0 nb0 = this.f42753g;
        if (nb0 != null) {
            return new pb0(hw0, this, c31, nb0);
        }
        socket.setSoTimeout(c31.mo66200h());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bufferedSource.timeout().timeout((long) c31.mo66197e(), timeUnit);
        bufferedSink.timeout().timeout((long) c31.mo66199g(), timeUnit);
        return new lb0(hw0, this, bufferedSource, bufferedSink);
    }

    /* renamed from: a */
    public final void mo70972a() {
        Socket socket = this.f42749c;
        if (socket != null) {
            jh1.m37827a(socket);
        }
    }

    /* renamed from: a */
    public void mo69012a(rb0 rb0) throws IOException {
        Intrinsics.checkNotNullParameter(rb0, "stream");
        rb0.mo69715a(o30.REFUSED_STREAM, (IOException) null);
    }

    /* renamed from: a */
    public synchronized void mo69011a(nb0 nb0, e81 e81) {
        Intrinsics.checkNotNullParameter(nb0, "connection");
        Intrinsics.checkNotNullParameter(e81, "settings");
        this.f42761o = e81.mo66782c();
    }

    /* renamed from: a */
    public final synchronized void mo70975a(x21 x21, IOException iOException) {
        Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
        if (iOException instanceof nb1) {
            o30 o30 = ((nb1) iOException).f37792b;
            if (o30 == o30.REFUSED_STREAM) {
                int i = this.f42760n + 1;
                this.f42760n = i;
                if (i > 1) {
                    this.f42756j = true;
                    this.f42758l++;
                }
            } else if (o30 != o30.CANCEL || !x21.mo70805g()) {
                this.f42756j = true;
                this.f42758l++;
            }
        } else if (!mo70985h() || (iOException instanceof C13412ih)) {
            this.f42756j = true;
            if (this.f42759m == 0) {
                if (iOException != null) {
                    hw0 c = x21.mo70800c();
                    k61 k61 = this.f42748b;
                    Intrinsics.checkNotNullParameter(c, "client");
                    Intrinsics.checkNotNullParameter(k61, "failedRoute");
                    Intrinsics.checkNotNullParameter(iOException, "failure");
                    if (k61.mo68141b().type() != Proxy.Type.DIRECT) {
                        C14563s5 a = k61.mo68140a();
                        a.mo69881h().connectFailed(a.mo69885k().mo66965m(), k61.mo68141b().address(), iOException);
                    }
                    c.mo67656n().mo68360b(k61);
                }
                this.f42758l++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014f, code lost:
        if (((r1.isEmpty() ^ true) && r0.mo67356a(r9.mo66958g(), (java.security.cert.X509Certificate) r1.get(0))) != false) goto L_0x0151;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0156 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0157 A[SYNTHETIC, Splitter:B:65:0x0157] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo70976a(com.yandex.mobile.ads.impl.C14563s5 r8, java.util.List<com.yandex.mobile.ads.impl.k61> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = com.yandex.mobile.ads.impl.jh1.f35310f
            java.lang.String r1 = " MUST hold lock on "
            java.lang.String r2 = "Thread "
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r7)
            if (r0 == 0) goto L_0x0014
            goto L_0x0037
        L_0x0014:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r9.append(r0)
            r9.append(r1)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0037:
            java.util.List<java.lang.ref.Reference<com.yandex.mobile.ads.impl.x21>> r0 = r7.f42762p
            int r0 = r0.size()
            int r3 = r7.f42761o
            r4 = 0
            if (r0 >= r3) goto L_0x0173
            boolean r0 = r7.f42756j
            if (r0 == 0) goto L_0x0048
            goto L_0x0173
        L_0x0048:
            com.yandex.mobile.ads.impl.k61 r0 = r7.f42748b
            com.yandex.mobile.ads.impl.s5 r0 = r0.mo68140a()
            boolean r0 = r0.mo69873a(r8)
            if (r0 != 0) goto L_0x0055
            return r4
        L_0x0055:
            com.yandex.mobile.ads.impl.fc0 r0 = r8.mo69885k()
            java.lang.String r0 = r0.mo66958g()
            com.yandex.mobile.ads.impl.k61 r3 = r7.f42748b
            com.yandex.mobile.ads.impl.s5 r3 = r3.mo68140a()
            com.yandex.mobile.ads.impl.fc0 r3 = r3.mo69885k()
            java.lang.String r3 = r3.mo66958g()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            r3 = 1
            if (r0 == 0) goto L_0x0073
            return r3
        L_0x0073:
            com.yandex.mobile.ads.impl.nb0 r0 = r7.f42753g
            if (r0 != 0) goto L_0x0078
            return r4
        L_0x0078:
            if (r9 == 0) goto L_0x0173
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0081
            goto L_0x00c2
        L_0x0081:
            java.util.Iterator r9 = r9.iterator()
        L_0x0085:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = r9.next()
            com.yandex.mobile.ads.impl.k61 r0 = (com.yandex.mobile.ads.impl.k61) r0
            java.net.Proxy r5 = r0.mo68141b()
            java.net.Proxy$Type r5 = r5.type()
            java.net.Proxy$Type r6 = java.net.Proxy.Type.DIRECT
            if (r5 != r6) goto L_0x00bd
            com.yandex.mobile.ads.impl.k61 r5 = r7.f42748b
            java.net.Proxy r5 = r5.mo68141b()
            java.net.Proxy$Type r5 = r5.type()
            java.net.Proxy$Type r6 = java.net.Proxy.Type.DIRECT
            if (r5 != r6) goto L_0x00bd
            com.yandex.mobile.ads.impl.k61 r5 = r7.f42748b
            java.net.InetSocketAddress r5 = r5.mo68143d()
            java.net.InetSocketAddress r0 = r0.mo68143d()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x00bd
            r0 = 1
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            if (r0 == 0) goto L_0x0085
            r9 = 1
            goto L_0x00c3
        L_0x00c2:
            r9 = 0
        L_0x00c3:
            if (r9 != 0) goto L_0x00c7
            goto L_0x0173
        L_0x00c7:
            javax.net.ssl.HostnameVerifier r9 = r8.mo69876d()
            com.yandex.mobile.ads.impl.gw0 r0 = com.yandex.mobile.ads.impl.gw0.f34161a
            if (r9 == r0) goto L_0x00d0
            return r4
        L_0x00d0:
            com.yandex.mobile.ads.impl.fc0 r9 = r8.mo69885k()
            boolean r5 = com.yandex.mobile.ads.impl.jh1.f35310f
            if (r5 == 0) goto L_0x0102
            boolean r5 = java.lang.Thread.holdsLock(r7)
            if (r5 == 0) goto L_0x00df
            goto L_0x0102
        L_0x00df:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r9.append(r0)
            r9.append(r1)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0102:
            com.yandex.mobile.ads.impl.k61 r1 = r7.f42748b
            com.yandex.mobile.ads.impl.s5 r1 = r1.mo68140a()
            com.yandex.mobile.ads.impl.fc0 r1 = r1.mo69885k()
            int r2 = r9.mo66961i()
            int r5 = r1.mo66961i()
            if (r2 == r5) goto L_0x0117
            goto L_0x0153
        L_0x0117:
            java.lang.String r2 = r9.mo66958g()
            java.lang.String r1 = r1.mo66958g()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x0126
            goto L_0x0151
        L_0x0126:
            boolean r1 = r7.f42757k
            if (r1 != 0) goto L_0x0153
            com.yandex.mobile.ads.impl.m90 r1 = r7.f42751e
            if (r1 == 0) goto L_0x0153
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.util.List r1 = r1.mo68625c()
            boolean r2 = r1.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x014e
            java.lang.String r9 = r9.mo66958g()
            java.lang.Object r1 = r1.get(r4)
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            boolean r9 = r0.mo67356a((java.lang.String) r9, (java.security.cert.X509Certificate) r1)
            if (r9 == 0) goto L_0x014e
            r9 = 1
            goto L_0x014f
        L_0x014e:
            r9 = 0
        L_0x014f:
            if (r9 == 0) goto L_0x0153
        L_0x0151:
            r9 = 1
            goto L_0x0154
        L_0x0153:
            r9 = 0
        L_0x0154:
            if (r9 != 0) goto L_0x0157
            return r4
        L_0x0157:
            com.yandex.mobile.ads.impl.te r9 = r8.mo69872a()     // Catch:{ SSLPeerUnverifiedException -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)     // Catch:{ SSLPeerUnverifiedException -> 0x0173 }
            com.yandex.mobile.ads.impl.fc0 r8 = r8.mo69885k()     // Catch:{ SSLPeerUnverifiedException -> 0x0173 }
            java.lang.String r8 = r8.mo66958g()     // Catch:{ SSLPeerUnverifiedException -> 0x0173 }
            com.yandex.mobile.ads.impl.m90 r0 = r7.f42751e     // Catch:{ SSLPeerUnverifiedException -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0173 }
            java.util.List r0 = r0.mo68625c()     // Catch:{ SSLPeerUnverifiedException -> 0x0173 }
            r9.mo70160a((java.lang.String) r8, (java.util.List<? extends java.security.cert.Certificate>) r0)     // Catch:{ SSLPeerUnverifiedException -> 0x0173 }
            return r3
        L_0x0173:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.y21.mo70976a(com.yandex.mobile.ads.impl.s5, java.util.List):boolean");
    }

    /* renamed from: a */
    public final boolean mo70977a(boolean z) {
        long j;
        if (!jh1.f35310f || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f42749c;
            Intrinsics.checkNotNull(socket);
            Socket socket2 = this.f42750d;
            Intrinsics.checkNotNull(socket2);
            BufferedSource bufferedSource = this.f42754h;
            Intrinsics.checkNotNull(bufferedSource);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            nb0 nb0 = this.f42753g;
            if (nb0 != null) {
                return nb0.mo68979a(nanoTime);
            }
            synchronized (this) {
                j = nanoTime - this.f42763q;
            }
            if (j < 10000000000L || !z) {
                return true;
            }
            return jh1.m37830a(socket2, bufferedSource);
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }
}
