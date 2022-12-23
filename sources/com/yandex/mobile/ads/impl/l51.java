package com.yandex.mobile.ads.impl;

import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.b51;
import com.yandex.mobile.ads.impl.jh0;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

public final class l51 implements jh0 {

    /* renamed from: a */
    private final hw0 f36540a;

    public l51(hw0 hw0) {
        Intrinsics.checkNotNullParameter(hw0, "client");
        this.f36540a = hw0;
    }

    /* renamed from: a */
    public b51 mo66058a(jh0.C13502a aVar) throws IOException {
        Intrinsics.checkNotNullParameter(aVar, "chain");
        c31 c31 = (c31) aVar;
        m41 f = c31.mo66198f();
        x21 b = c31.mo66194b();
        List emptyList = CollectionsKt.emptyList();
        b51 b51 = null;
        boolean z = true;
        int i = 0;
        while (true) {
            b.mo70794a(f, z);
            try {
                if (!b.mo70805g()) {
                    b51 a = c31.mo66193a(f);
                    if (b51 != null) {
                        a = new b51.C12571a(a).mo66007c(new b51.C12571a(b51).mo65994a((e51) null).mo66001a()).mo66001a();
                    }
                    b51 = a;
                    d40 e = b.mo70803e();
                    m41 a2 = m38619a(b51, e);
                    if (a2 == null) {
                        if (e != null && e.mo66418j()) {
                            b.mo70808j();
                        }
                        b.mo70796a(false);
                        return b51;
                    }
                    e51 b2 = b51.mo65974b();
                    if (b2 != null) {
                        jh1.m37826a((Closeable) b2);
                    }
                    i++;
                    if (i <= 20) {
                        b.mo70796a(true);
                        f = a2;
                        z = true;
                    } else {
                        throw new ProtocolException(Intrinsics.stringPlus("Too many follow-up requests: ", Integer.valueOf(i)));
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (m61 e2) {
                if (m38620a(e2.mo68583b(), b, f, false)) {
                    emptyList = CollectionsKt.plus(emptyList, e2.mo68581a());
                    b.mo70796a(true);
                    z = false;
                } else {
                    throw jh1.m37822a((Exception) e2.mo68581a(), (List<? extends Exception>) emptyList);
                }
            } catch (IOException e3) {
                if (m38620a(e3, b, f, !(e3 instanceof C13412ih))) {
                    emptyList = CollectionsKt.plus(emptyList, e3);
                    b.mo70796a(true);
                    z = false;
                } else {
                    throw jh1.m37822a((Exception) e3, (List<? extends Exception>) emptyList);
                }
            } catch (Throwable th) {
                b.mo70796a(true);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private final boolean m38620a(IOException iOException, x21 x21, m41 m41, boolean z) {
        if (!this.f36540a.mo67664v()) {
            return false;
        }
        if (z) {
            m41.getClass();
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if ((!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z)) && x21.mo70807i()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r13.mo66414f();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.yandex.mobile.ads.impl.m41 m38619a(com.yandex.mobile.ads.impl.b51 r12, com.yandex.mobile.ads.impl.d40 r13) throws java.io.IOException {
        /*
            r11 = this;
            r0 = 0
            if (r13 != 0) goto L_0x0004
            goto L_0x000a
        L_0x0004:
            com.yandex.mobile.ads.impl.y21 r1 = r13.mo66414f()
            if (r1 != 0) goto L_0x000c
        L_0x000a:
            r1 = r0
            goto L_0x0010
        L_0x000c:
            com.yandex.mobile.ads.impl.k61 r1 = r1.mo70988k()
        L_0x0010:
            int r2 = r12.mo65979f()
            com.yandex.mobile.ads.impl.m41 r3 = r12.mo65988o()
            java.lang.String r3 = r3.mo68567f()
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            if (r2 == r6) goto L_0x00cc
            if (r2 == r5) goto L_0x00cc
            r7 = 401(0x191, float:5.62E-43)
            if (r2 == r7) goto L_0x00c1
            r7 = 421(0x1a5, float:5.9E-43)
            if (r2 == r7) goto L_0x00a4
            r13 = 503(0x1f7, float:7.05E-43)
            if (r2 == r13) goto L_0x0088
            r13 = 407(0x197, float:5.7E-43)
            if (r2 == r13) goto L_0x0066
            r13 = 408(0x198, float:5.72E-43)
            if (r2 == r13) goto L_0x003d
            switch(r2) {
                case 300: goto L_0x00cc;
                case 301: goto L_0x00cc;
                case 302: goto L_0x00cc;
                case 303: goto L_0x00cc;
                default: goto L_0x003c;
            }
        L_0x003c:
            return r0
        L_0x003d:
            com.yandex.mobile.ads.impl.hw0 r1 = r11.f36540a
            boolean r1 = r1.mo67664v()
            if (r1 != 0) goto L_0x0046
            return r0
        L_0x0046:
            com.yandex.mobile.ads.impl.m41 r1 = r12.mo65988o()
            r1.mo68561a()
            com.yandex.mobile.ads.impl.b51 r1 = r12.mo65985l()
            if (r1 == 0) goto L_0x005a
            int r1 = r1.mo65979f()
            if (r1 != r13) goto L_0x005a
            return r0
        L_0x005a:
            int r13 = r11.m38618a((com.yandex.mobile.ads.impl.b51) r12, (int) r4)
            if (r13 <= 0) goto L_0x0061
            return r0
        L_0x0061:
            com.yandex.mobile.ads.impl.m41 r12 = r12.mo65988o()
            return r12
        L_0x0066:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.net.Proxy r13 = r1.mo68141b()
            java.net.Proxy$Type r13 = r13.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r13 != r0) goto L_0x0080
            com.yandex.mobile.ads.impl.hw0 r13 = r11.f36540a
            com.yandex.mobile.ads.impl.oa r13 = r13.mo67661s()
            com.yandex.mobile.ads.impl.m41 r12 = r13.mo68945a(r1, r12)
            return r12
        L_0x0080:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r13 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r12.<init>(r13)
            throw r12
        L_0x0088:
            com.yandex.mobile.ads.impl.b51 r1 = r12.mo65985l()
            if (r1 == 0) goto L_0x0095
            int r1 = r1.mo65979f()
            if (r1 != r13) goto L_0x0095
            return r0
        L_0x0095:
            r13 = 2147483647(0x7fffffff, float:NaN)
            int r13 = r11.m38618a((com.yandex.mobile.ads.impl.b51) r12, (int) r13)
            if (r13 != 0) goto L_0x00a3
            com.yandex.mobile.ads.impl.m41 r12 = r12.mo65988o()
            return r12
        L_0x00a3:
            return r0
        L_0x00a4:
            com.yandex.mobile.ads.impl.m41 r1 = r12.mo65988o()
            r1.mo68561a()
            if (r13 == 0) goto L_0x00c0
            boolean r1 = r13.mo66417i()
            if (r1 != 0) goto L_0x00b4
            goto L_0x00c0
        L_0x00b4:
            com.yandex.mobile.ads.impl.y21 r13 = r13.mo66414f()
            r13.mo70986i()
            com.yandex.mobile.ads.impl.m41 r12 = r12.mo65988o()
            return r12
        L_0x00c0:
            return r0
        L_0x00c1:
            com.yandex.mobile.ads.impl.hw0 r13 = r11.f36540a
            com.yandex.mobile.ads.impl.oa r13 = r13.mo67644c()
            com.yandex.mobile.ads.impl.m41 r12 = r13.mo68945a(r1, r12)
            return r12
        L_0x00cc:
            com.yandex.mobile.ads.impl.hw0 r13 = r11.f36540a
            boolean r13 = r13.mo67654l()
            if (r13 != 0) goto L_0x00d6
            goto L_0x01a1
        L_0x00d6:
            r13 = 2
            java.lang.String r1 = "Location"
            java.lang.String r13 = com.yandex.mobile.ads.impl.b51.m34138a(r12, r1, r0, r13)
            if (r13 != 0) goto L_0x00e1
            goto L_0x01a1
        L_0x00e1:
            com.yandex.mobile.ads.impl.m41 r1 = r12.mo65988o()
            com.yandex.mobile.ads.impl.fc0 r1 = r1.mo68568g()
            r1.getClass()
            java.lang.String r2 = "link"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            com.yandex.mobile.ads.impl.fc0$a r2 = new com.yandex.mobile.ads.impl.fc0$a     // Catch:{ IllegalArgumentException -> 0x00fe }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x00fe }
            com.yandex.mobile.ads.impl.fc0$a r13 = r2.mo66969a(r1, r13)     // Catch:{ IllegalArgumentException -> 0x00fe }
            goto L_0x00ff
        L_0x00fe:
            r13 = r0
        L_0x00ff:
            if (r13 != 0) goto L_0x0103
            r13 = r0
            goto L_0x0107
        L_0x0103:
            com.yandex.mobile.ads.impl.fc0 r13 = r13.mo66971a()
        L_0x0107:
            if (r13 != 0) goto L_0x010b
            goto L_0x01a1
        L_0x010b:
            java.lang.String r1 = r13.mo66964l()
            com.yandex.mobile.ads.impl.m41 r2 = r12.mo65988o()
            com.yandex.mobile.ads.impl.fc0 r2 = r2.mo68568g()
            java.lang.String r2 = r2.mo66964l()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 != 0) goto L_0x012b
            com.yandex.mobile.ads.impl.hw0 r1 = r11.f36540a
            boolean r1 = r1.mo67655m()
            if (r1 != 0) goto L_0x012b
            goto L_0x01a1
        L_0x012b:
            com.yandex.mobile.ads.impl.m41 r1 = r12.mo65988o()
            r1.getClass()
            com.yandex.mobile.ads.impl.m41$a r2 = new com.yandex.mobile.ads.impl.m41$a
            r2.<init>(r1)
            boolean r1 = com.yandex.mobile.ads.impl.zb0.m44524a(r3)
            if (r1 == 0) goto L_0x0186
            int r1 = r12.mo65979f()
            java.lang.String r7 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            java.lang.String r8 = "PROPFIND"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r8)
            r10 = 1
            if (r9 != 0) goto L_0x0153
            if (r1 == r5) goto L_0x0153
            if (r1 != r6) goto L_0x0154
        L_0x0153:
            r4 = 1
        L_0x0154:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r8)
            r7 = r7 ^ r10
            if (r7 == 0) goto L_0x0168
            if (r1 == r5) goto L_0x0168
            if (r1 == r6) goto L_0x0168
            java.lang.String r1 = "GET"
            r2.mo68573a((java.lang.String) r1, (com.yandex.mobile.ads.impl.o41) r0)
            goto L_0x0175
        L_0x0168:
            if (r4 == 0) goto L_0x0172
            com.yandex.mobile.ads.impl.m41 r0 = r12.mo65988o()
            com.yandex.mobile.ads.impl.o41 r0 = r0.mo68561a()
        L_0x0172:
            r2.mo68573a((java.lang.String) r3, (com.yandex.mobile.ads.impl.o41) r0)
        L_0x0175:
            if (r4 != 0) goto L_0x0186
            java.lang.String r0 = "Transfer-Encoding"
            r2.mo68572a((java.lang.String) r0)
            java.lang.String r0 = "Content-Length"
            r2.mo68572a((java.lang.String) r0)
            java.lang.String r0 = "Content-Type"
            r2.mo68572a((java.lang.String) r0)
        L_0x0186:
            com.yandex.mobile.ads.impl.m41 r12 = r12.mo65988o()
            com.yandex.mobile.ads.impl.fc0 r12 = r12.mo68568g()
            boolean r12 = com.yandex.mobile.ads.impl.jh1.m37828a((com.yandex.mobile.ads.impl.fc0) r12, (com.yandex.mobile.ads.impl.fc0) r13)
            if (r12 != 0) goto L_0x0199
            java.lang.String r12 = "Authorization"
            r2.mo68572a((java.lang.String) r12)
        L_0x0199:
            com.yandex.mobile.ads.impl.m41$a r12 = r2.mo68570a((com.yandex.mobile.ads.impl.fc0) r13)
            com.yandex.mobile.ads.impl.m41 r0 = r12.mo68576a()
        L_0x01a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.l51.m38619a(com.yandex.mobile.ads.impl.b51, com.yandex.mobile.ads.impl.d40):com.yandex.mobile.ads.impl.m41");
    }

    /* renamed from: a */
    private final int m38618a(b51 b51, int i) {
        String a = b51.m34138a(b51, HttpHeaders.RETRY_AFTER, (String) null, 2);
        if (a == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(a)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }
}
