package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.kh */
public final class C13708kh {

    /* renamed from: a */
    private final List<C13500jh> f36135a;

    /* renamed from: b */
    private int f36136b;

    /* renamed from: c */
    private boolean f36137c;

    /* renamed from: d */
    private boolean f36138d;

    public C13708kh(List<C13500jh> list) {
        Intrinsics.checkNotNullParameter(list, "connectionSpecs");
        this.f36135a = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.yandex.mobile.ads.impl.C13500jh mo68226a(javax.net.ssl.SSLSocket r6) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.f36136b
            java.util.List<com.yandex.mobile.ads.impl.jh> r1 = r5.f36135a
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0027
        L_0x000f:
            int r2 = r0 + 1
            java.util.List<com.yandex.mobile.ads.impl.jh> r3 = r5.f36135a
            java.lang.Object r0 = r3.get(r0)
            com.yandex.mobile.ads.impl.jh r0 = (com.yandex.mobile.ads.impl.C13500jh) r0
            boolean r3 = r0.mo67992a((javax.net.ssl.SSLSocket) r6)
            if (r3 == 0) goto L_0x0022
            r5.f36136b = r2
            goto L_0x0028
        L_0x0022:
            if (r2 < r1) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r0 = r2
            goto L_0x000f
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0054
            int r1 = r5.f36136b
            java.util.List<com.yandex.mobile.ads.impl.jh> r2 = r5.f36135a
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x004b
        L_0x0034:
            int r3 = r1 + 1
            java.util.List<com.yandex.mobile.ads.impl.jh> r4 = r5.f36135a
            java.lang.Object r1 = r4.get(r1)
            com.yandex.mobile.ads.impl.jh r1 = (com.yandex.mobile.ads.impl.C13500jh) r1
            boolean r1 = r1.mo67992a((javax.net.ssl.SSLSocket) r6)
            if (r1 == 0) goto L_0x0046
            r1 = 1
            goto L_0x004c
        L_0x0046:
            if (r3 < r2) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r1 = r3
            goto L_0x0034
        L_0x004b:
            r1 = 0
        L_0x004c:
            r5.f36137c = r1
            boolean r1 = r5.f36138d
            r0.mo67991a(r6, r1)
            return r0
        L_0x0054:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to find acceptable protocols. isFallback="
            r1.append(r2)
            boolean r2 = r5.f36138d
            r1.append(r2)
            java.lang.String r2 = ", modes="
            r1.append(r2)
            java.util.List<com.yandex.mobile.ads.impl.jh> r2 = r5.f36135a
            r1.append(r2)
            java.lang.String r2 = ", supported protocols="
            r1.append(r2)
            java.lang.String[] r6 = r6.getEnabledProtocols()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            java.lang.String r2 = "java.util.Arrays.toString(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13708kh.mo68226a(javax.net.ssl.SSLSocket):com.yandex.mobile.ads.impl.jh");
    }

    /* renamed from: a */
    public final boolean mo68227a(IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "e");
        this.f36138d = true;
        if (this.f36137c && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException))) {
            return true;
        }
        return false;
    }
}
