package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.vb */
public class C14878vb implements cv0 {

    /* renamed from: a */
    private final C14576sb f41237a;

    /* renamed from: b */
    protected final C12724cd f41238b;

    public C14878vb(C14576sb sbVar, C12724cd cdVar) {
        this.f41237a = sbVar;
        this.f41238b = cdVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0088  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.fv0 mo70466a(com.yandex.mobile.ads.impl.l41<?> r19) throws com.yandex.mobile.ads.impl.op1 {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            long r3 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.Collections.emptyList()
            r5 = 0
            r6 = 0
            com.yandex.mobile.ads.impl.fd$a r0 = r19.mo68340c()     // Catch:{ IOException -> 0x006f }
            java.util.Map r0 = com.yandex.mobile.ads.impl.xb0.m43998a((com.yandex.mobile.ads.impl.C13045fd.C13046a) r0)     // Catch:{ IOException -> 0x006f }
            com.yandex.mobile.ads.impl.sb r7 = r1.f41237a     // Catch:{ IOException -> 0x006f }
            com.yandex.mobile.ads.impl.bc0 r7 = r7.mo65925a(r2, r0)     // Catch:{ IOException -> 0x006f }
            int r9 = r7.mo66039d()     // Catch:{ IOException -> 0x006c }
            java.util.List r14 = r7.mo66038c()     // Catch:{ IOException -> 0x006c }
            r0 = 304(0x130, float:4.26E-43)
            if (r9 != r0) goto L_0x0031
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x006c }
            long r8 = r8 - r3
            com.yandex.mobile.ads.impl.fv0 r0 = com.yandex.mobile.ads.impl.kv0.m38495a((com.yandex.mobile.ads.impl.l41<?>) r2, (long) r8, (java.util.List<com.yandex.mobile.ads.impl.n90>) r14)     // Catch:{ IOException -> 0x006c }
            return r0
        L_0x0031:
            java.io.InputStream r0 = r7.mo66036a()     // Catch:{ IOException -> 0x006c }
            if (r0 == 0) goto L_0x0042
            int r8 = r7.mo66037b()     // Catch:{ IOException -> 0x006c }
            com.yandex.mobile.ads.impl.cd r10 = r1.f41238b     // Catch:{ IOException -> 0x006c }
            byte[] r0 = com.yandex.mobile.ads.impl.kv0.m38497a((java.io.InputStream) r0, (int) r8, (com.yandex.mobile.ads.impl.C12724cd) r10)     // Catch:{ IOException -> 0x006c }
            goto L_0x0044
        L_0x0042:
            byte[] r0 = new byte[r5]     // Catch:{ IOException -> 0x006c }
        L_0x0044:
            r15 = r0
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0069 }
            long r10 = r10 - r3
            com.yandex.mobile.ads.impl.kv0.m38496a(r10, r2, r15, r9)     // Catch:{ IOException -> 0x0069 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r9 < r0) goto L_0x0063
            r0 = 299(0x12b, float:4.19E-43)
            if (r9 > r0) goto L_0x0063
            com.yandex.mobile.ads.impl.fv0 r0 = new com.yandex.mobile.ads.impl.fv0     // Catch:{ IOException -> 0x0069 }
            r11 = 0
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0069 }
            long r12 = r12 - r3
            r8 = r0
            r10 = r15
            r8.<init>((int) r9, (byte[]) r10, (boolean) r11, (long) r12, (java.util.List<com.yandex.mobile.ads.impl.n90>) r14)     // Catch:{ IOException -> 0x0069 }
            return r0
        L_0x0063:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0069 }
            r0.<init>()     // Catch:{ IOException -> 0x0069 }
            throw r0     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            r10 = r15
            goto L_0x0072
        L_0x006c:
            r0 = move-exception
            r10 = r6
            goto L_0x0072
        L_0x006f:
            r0 = move-exception
            r7 = r6
            r10 = r7
        L_0x0072:
            boolean r8 = r0 instanceof java.net.SocketTimeoutException
            r15 = 1
            r14 = 2
            if (r8 == 0) goto L_0x0088
            com.yandex.mobile.ads.impl.kv0$b r0 = new com.yandex.mobile.ads.impl.kv0$b
            com.yandex.mobile.ads.impl.yd1 r7 = new com.yandex.mobile.ads.impl.yd1
            r7.<init>()
            java.lang.String r8 = "socket"
            r0.<init>(r8, r7)
            r6 = r0
            r5 = 2
            goto L_0x00f7
        L_0x0088:
            boolean r8 = r0 instanceof java.net.MalformedURLException
            if (r8 != 0) goto L_0x0142
            if (r7 == 0) goto L_0x013c
            int r0 = r7.mo66039d()
            java.lang.Object[] r8 = new java.lang.Object[r14]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r8[r5] = r9
            java.lang.String r9 = r19.mo67768l()
            r8[r15] = r9
            java.lang.String r9 = "Unexpected response code %d for %s"
            com.yandex.mobile.ads.impl.pp1.m40900c(r9, r8)
            if (r10 == 0) goto L_0x00e9
            java.util.List r7 = r7.mo66038c()
            com.yandex.mobile.ads.impl.fv0 r12 = new com.yandex.mobile.ads.impl.fv0
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r16 = r8 - r3
            r11 = 0
            r8 = r12
            r9 = r0
            r15 = r12
            r12 = r16
            r5 = 2
            r14 = r7
            r8.<init>((int) r9, (byte[]) r10, (boolean) r11, (long) r12, (java.util.List<com.yandex.mobile.ads.impl.n90>) r14)
            r7 = 401(0x191, float:5.62E-43)
            if (r0 == r7) goto L_0x00dc
            r7 = 403(0x193, float:5.65E-43)
            if (r0 != r7) goto L_0x00c7
            goto L_0x00dc
        L_0x00c7:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x00d6
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r2) goto L_0x00d0
            goto L_0x00d6
        L_0x00d0:
            com.yandex.mobile.ads.impl.hf r0 = new com.yandex.mobile.ads.impl.hf
            r0.<init>(r15)
            throw r0
        L_0x00d6:
            com.yandex.mobile.ads.impl.b81 r0 = new com.yandex.mobile.ads.impl.b81
            r0.<init>(r15)
            throw r0
        L_0x00dc:
            com.yandex.mobile.ads.impl.kv0$b r0 = new com.yandex.mobile.ads.impl.kv0$b
            com.yandex.mobile.ads.impl.ma r7 = new com.yandex.mobile.ads.impl.ma
            r7.<init>(r15)
            java.lang.String r8 = "auth"
            r0.<init>(r8, r7)
            goto L_0x00f6
        L_0x00e9:
            r5 = 2
            com.yandex.mobile.ads.impl.kv0$b r0 = new com.yandex.mobile.ads.impl.kv0$b
            com.yandex.mobile.ads.impl.ev0 r7 = new com.yandex.mobile.ads.impl.ev0
            r7.<init>()
            java.lang.String r8 = "network"
            r0.<init>(r8, r7)
        L_0x00f6:
            r6 = r0
        L_0x00f7:
            com.yandex.mobile.ads.impl.sk r0 = r19.mo68345h()
            int r7 = r19.mo68347j()
            com.yandex.mobile.ads.impl.op1 r8 = r6.f36429b     // Catch:{ op1 -> 0x0121 }
            r0.mo70003a(r8)     // Catch:{ op1 -> 0x0121 }
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r5 = r6.f36428a
            r6 = 0
            r0[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r6 = 1
            r0[r6] = r5
            java.lang.String r5 = "%s-retry [timeout=%s]"
            java.lang.String r0 = java.lang.String.format(r5, r0)
            r2.mo68337a((java.lang.String) r0)
            goto L_0x0008
        L_0x0121:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r4 = r6.f36428a
            r5 = 0
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r5 = 1
            r3[r5] = r4
            java.lang.String r4 = "%s-timeout-giveup [timeout=%s]"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.mo68337a((java.lang.String) r3)
            throw r0
        L_0x013c:
            com.yandex.mobile.ads.impl.qv0 r2 = new com.yandex.mobile.ads.impl.qv0
            r2.<init>(r0)
            throw r2
        L_0x0142:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Bad URL "
            r4.append(r5)
            java.lang.String r2 = r19.mo67768l()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14878vb.mo70466a(com.yandex.mobile.ads.impl.l41):com.yandex.mobile.ads.impl.fv0");
    }
}
