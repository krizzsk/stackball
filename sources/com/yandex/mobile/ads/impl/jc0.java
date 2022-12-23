package com.yandex.mobile.ads.impl;

import javax.net.ssl.SSLSocketFactory;

public class jc0 extends C14576sb {

    /* renamed from: a */
    private final wg1 f35220a;

    /* renamed from: b */
    private final SSLSocketFactory f35221b;

    /* renamed from: c */
    private final kw0 f35222c;

    public jc0(wg1 wg1, SSLSocketFactory sSLSocketFactory) {
        this.f35220a = wg1;
        this.f35221b = sSLSocketFactory;
        this.f35222c = new kw0(wg1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0093, code lost:
        if (r0 != 304) goto L_0x0097;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.bc0 mo65925a(com.yandex.mobile.ads.impl.l41<?> r9, java.util.Map<java.lang.String, java.lang.String> r10) throws java.io.IOException, com.yandex.mobile.ads.impl.C13965ma {
        /*
            r8 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r1 = "additionalHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            com.yandex.mobile.ads.impl.iw0 r1 = com.yandex.mobile.ads.impl.iw0.f35056a
            com.yandex.mobile.ads.impl.wg1 r2 = r8.f35220a
            javax.net.ssl.SSLSocketFactory r3 = r8.f35221b
            com.yandex.mobile.ads.impl.hw0 r1 = r1.mo67898a(r9, r2, r3)
            com.yandex.mobile.ads.impl.kw0 r2 = r8.f35222c
            com.yandex.mobile.ads.impl.m41 r10 = r2.mo68279a(r9, r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.yandex.mobile.ads.impl.x21 r0 = new com.yandex.mobile.ads.impl.x21
            r2 = 0
            r0.<init>(r1, r10, r2)
            com.yandex.mobile.ads.impl.b51 r10 = r0.mo70797b()
            int r0 = r10.mo65979f()
            com.yandex.mobile.ads.impl.q90 r1 = r10.mo65982i()
            java.util.Map r1 = r1.mo69512b()
            java.lang.String r3 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.TreeMap r1 = (java.util.TreeMap) r1
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0047:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0078
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0063:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0047
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            com.yandex.mobile.ads.impl.n90 r7 = new com.yandex.mobile.ads.impl.n90
            r7.<init>(r5, r6)
            r3.add(r7)
            goto L_0x0063
        L_0x0078:
            int r9 = r9.mo68344f()
            r1 = 4
            r4 = 1
            if (r9 == r1) goto L_0x0096
            r9 = 100
            if (r9 > r0) goto L_0x008a
            r9 = 200(0xc8, float:2.8E-43)
            if (r0 >= r9) goto L_0x008a
            r9 = 1
            goto L_0x008b
        L_0x008a:
            r9 = 0
        L_0x008b:
            if (r9 != 0) goto L_0x0096
            r9 = 204(0xcc, float:2.86E-43)
            if (r0 == r9) goto L_0x0096
            r9 = 304(0x130, float:4.26E-43)
            if (r0 == r9) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r4 = 0
        L_0x0097:
            r9 = 0
            if (r4 != 0) goto L_0x00a1
            com.yandex.mobile.ads.impl.bc0 r10 = new com.yandex.mobile.ads.impl.bc0
            r1 = -1
            r10.<init>(r0, r3, r1, r9)
            return r10
        L_0x00a1:
            com.yandex.mobile.ads.impl.e51 r1 = r10.mo65974b()
            if (r1 != 0) goto L_0x00a9
            r1 = r9
            goto L_0x00b1
        L_0x00a9:
            long r4 = r1.mo66401b()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
        L_0x00b1:
            if (r1 != 0) goto L_0x00b4
            goto L_0x00b9
        L_0x00b4:
            long r1 = r1.longValue()
            int r2 = (int) r1
        L_0x00b9:
            com.yandex.mobile.ads.impl.bc0 r1 = new com.yandex.mobile.ads.impl.bc0
            java.lang.String r4 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r4)
            com.yandex.mobile.ads.impl.e51 r10 = r10.mo65974b()
            if (r10 == 0) goto L_0x00ce
            okio.BufferedSource r9 = r10.mo66402c()
            java.io.InputStream r9 = r9.inputStream()
        L_0x00ce:
            r1.<init>(r0, r3, r2, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jc0.mo65925a(com.yandex.mobile.ads.impl.l41, java.util.Map):com.yandex.mobile.ads.impl.bc0");
    }
}
