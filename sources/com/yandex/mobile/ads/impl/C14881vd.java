package com.yandex.mobile.ads.impl;

import com.facebook.share.internal.ShareConstants;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.vd */
public final class C14881vd {

    /* renamed from: a */
    private final m41 f41245a;

    /* renamed from: b */
    private final b51 f41246b;

    /* renamed from: com.yandex.mobile.ads.impl.vd$a */
    public static final class C14882a {

        /* renamed from: a */
        private final long f41247a;

        /* renamed from: b */
        private final m41 f41248b;

        /* renamed from: c */
        private final b51 f41249c = null;

        /* renamed from: d */
        private Date f41250d;

        /* renamed from: e */
        private String f41251e;

        /* renamed from: f */
        private Date f41252f;

        /* renamed from: g */
        private String f41253g;

        /* renamed from: h */
        private Date f41254h;

        /* renamed from: i */
        private long f41255i;

        /* renamed from: j */
        private long f41256j;

        /* renamed from: k */
        private String f41257k;

        /* renamed from: l */
        private int f41258l = -1;

        public C14882a(long j, m41 m41, b51 b51) {
            Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
            this.f41247a = j;
            this.f41248b = m41;
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [com.yandex.mobile.ads.impl.m41, com.yandex.mobile.ads.impl.b51] */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: type inference failed for: r3v12 */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v25 */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
            if (r1.mo65975c().mo67237a() == false) goto L_0x00a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x014e, code lost:
            if (r2 > 0) goto L_0x0126;
         */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x01c9  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x01df  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x022f  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x0231  */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x0291  */
        /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x019a  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x01bb  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.yandex.mobile.ads.impl.C14881vd mo70473a() {
            /*
                r18 = this;
                r0 = r18
                com.yandex.mobile.ads.impl.b51 r1 = r0.f41249c
                r2 = 0
                if (r1 != 0) goto L_0x0011
                com.yandex.mobile.ads.impl.vd r1 = new com.yandex.mobile.ads.impl.vd
                com.yandex.mobile.ads.impl.m41 r3 = r0.f41248b
                r1.<init>(r3, r2)
            L_0x000e:
                r3 = r2
                goto L_0x027f
            L_0x0011:
                com.yandex.mobile.ads.impl.m41 r1 = r0.f41248b
                boolean r1 = r1.mo68566e()
                if (r1 == 0) goto L_0x0029
                com.yandex.mobile.ads.impl.b51 r1 = r0.f41249c
                com.yandex.mobile.ads.impl.m90 r1 = r1.mo65981h()
                if (r1 != 0) goto L_0x0029
                com.yandex.mobile.ads.impl.vd r1 = new com.yandex.mobile.ads.impl.vd
                com.yandex.mobile.ads.impl.m41 r3 = r0.f41248b
                r1.<init>(r3, r2)
                goto L_0x000e
            L_0x0029:
                com.yandex.mobile.ads.impl.b51 r1 = r0.f41249c
                com.yandex.mobile.ads.impl.m41 r3 = r0.f41248b
                java.lang.String r4 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
                java.lang.String r4 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
                int r4 = r1.mo65979f()
                r5 = 200(0xc8, float:2.8E-43)
                r8 = -1
                if (r4 == r5) goto L_0x0090
                r5 = 410(0x19a, float:5.75E-43)
                if (r4 == r5) goto L_0x0090
                r5 = 414(0x19e, float:5.8E-43)
                if (r4 == r5) goto L_0x0090
                r5 = 501(0x1f5, float:7.02E-43)
                if (r4 == r5) goto L_0x0090
                r5 = 203(0xcb, float:2.84E-43)
                if (r4 == r5) goto L_0x0090
                r5 = 204(0xcc, float:2.86E-43)
                if (r4 == r5) goto L_0x0090
                r5 = 307(0x133, float:4.3E-43)
                if (r4 == r5) goto L_0x0068
                r5 = 308(0x134, float:4.32E-43)
                if (r4 == r5) goto L_0x0090
                r5 = 404(0x194, float:5.66E-43)
                if (r4 == r5) goto L_0x0090
                r5 = 405(0x195, float:5.68E-43)
                if (r4 == r5) goto L_0x0090
                switch(r4) {
                    case 300: goto L_0x0090;
                    case 301: goto L_0x0090;
                    case 302: goto L_0x0068;
                    default: goto L_0x0067;
                }
            L_0x0067:
                goto L_0x00a6
            L_0x0068:
                r4 = 2
                java.lang.String r5 = "Expires"
                java.lang.String r4 = com.yandex.mobile.ads.impl.b51.m34138a(r1, r5, r2, r4)
                if (r4 != 0) goto L_0x0090
                com.yandex.mobile.ads.impl.gd r4 = r1.mo65975c()
                int r4 = r4.mo67239c()
                if (r4 != r8) goto L_0x0090
                com.yandex.mobile.ads.impl.gd r4 = r1.mo65975c()
                boolean r4 = r4.mo67238b()
                if (r4 != 0) goto L_0x0090
                com.yandex.mobile.ads.impl.gd r4 = r1.mo65975c()
                boolean r4 = r4.mo67237a()
                if (r4 != 0) goto L_0x0090
                goto L_0x00a6
            L_0x0090:
                com.yandex.mobile.ads.impl.gd r1 = r1.mo65975c()
                boolean r1 = r1.mo67244h()
                if (r1 != 0) goto L_0x00a6
                com.yandex.mobile.ads.impl.gd r1 = r3.mo68563b()
                boolean r1 = r1.mo67244h()
                if (r1 != 0) goto L_0x00a6
                r1 = 1
                goto L_0x00a7
            L_0x00a6:
                r1 = 0
            L_0x00a7:
                if (r1 != 0) goto L_0x00b2
                com.yandex.mobile.ads.impl.vd r1 = new com.yandex.mobile.ads.impl.vd
                com.yandex.mobile.ads.impl.m41 r3 = r0.f41248b
                r1.<init>(r3, r2)
                goto L_0x000e
            L_0x00b2:
                com.yandex.mobile.ads.impl.m41 r1 = r0.f41248b
                com.yandex.mobile.ads.impl.gd r1 = r1.mo68563b()
                boolean r3 = r1.mo67243g()
                if (r3 != 0) goto L_0x0277
                com.yandex.mobile.ads.impl.m41 r3 = r0.f41248b
                java.lang.String r4 = "If-Modified-Since"
                java.lang.String r5 = r3.mo68562a(r4)
                java.lang.String r9 = "If-None-Match"
                if (r5 != 0) goto L_0x00d3
                java.lang.String r3 = r3.mo68562a(r9)
                if (r3 == 0) goto L_0x00d1
                goto L_0x00d3
            L_0x00d1:
                r3 = 0
                goto L_0x00d4
            L_0x00d3:
                r3 = 1
            L_0x00d4:
                if (r3 == 0) goto L_0x00d8
                goto L_0x0277
            L_0x00d8:
                com.yandex.mobile.ads.impl.b51 r3 = r0.f41249c
                com.yandex.mobile.ads.impl.gd r3 = r3.mo65975c()
                java.util.Date r5 = r0.f41250d
                r10 = 0
                if (r5 == 0) goto L_0x00f0
                long r12 = r0.f41256j
                long r14 = r5.getTime()
                long r12 = r12 - r14
                long r12 = java.lang.Math.max(r10, r12)
                goto L_0x00f1
            L_0x00f0:
                r12 = r10
            L_0x00f1:
                int r5 = r0.f41258l
                if (r5 == r8) goto L_0x0100
                java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
                long r6 = (long) r5
                long r5 = r14.toMillis(r6)
                long r12 = java.lang.Math.max(r12, r5)
            L_0x0100:
                long r5 = r0.f41256j
                r14 = r3
                long r2 = r0.f41255i
                long r2 = r5 - r2
                long r10 = r0.f41247a
                long r10 = r10 - r5
                long r12 = r12 + r2
                long r12 = r12 + r10
                com.yandex.mobile.ads.impl.b51 r2 = r0.f41249c
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                com.yandex.mobile.ads.impl.gd r2 = r2.mo65975c()
                int r3 = r2.mo67239c()
                if (r3 == r8) goto L_0x012a
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
                int r2 = r2.mo67239c()
                long r5 = (long) r2
                long r2 = r3.toMillis(r5)
            L_0x0126:
                r5 = 0
                goto L_0x0194
            L_0x012a:
                java.util.Date r2 = r0.f41254h
                if (r2 == 0) goto L_0x0151
                java.util.Date r3 = r0.f41250d
                if (r3 != 0) goto L_0x0134
                r3 = 0
                goto L_0x013c
            L_0x0134:
                long r5 = r3.getTime()
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
            L_0x013c:
                if (r3 != 0) goto L_0x0141
                long r5 = r0.f41256j
                goto L_0x0145
            L_0x0141:
                long r5 = r3.longValue()
            L_0x0145:
                long r2 = r2.getTime()
                long r2 = r2 - r5
                r5 = 0
                int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r10 <= 0) goto L_0x0191
                goto L_0x0126
            L_0x0151:
                java.util.Date r2 = r0.f41252f
                if (r2 == 0) goto L_0x0191
                com.yandex.mobile.ads.impl.b51 r2 = r0.f41249c
                com.yandex.mobile.ads.impl.m41 r2 = r2.mo65988o()
                com.yandex.mobile.ads.impl.fc0 r2 = r2.mo68568g()
                java.lang.String r2 = r2.mo66962j()
                if (r2 != 0) goto L_0x0191
                java.util.Date r2 = r0.f41250d
                if (r2 != 0) goto L_0x016b
                r2 = 0
                goto L_0x0173
            L_0x016b:
                long r2 = r2.getTime()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
            L_0x0173:
                if (r2 != 0) goto L_0x0178
                long r2 = r0.f41255i
                goto L_0x017c
            L_0x0178:
                long r2 = r2.longValue()
            L_0x017c:
                java.util.Date r5 = r0.f41252f
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                long r5 = r5.getTime()
                long r2 = r2 - r5
                r5 = 0
                int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r10 <= 0) goto L_0x0193
                r10 = 10
                long r10 = (long) r10
                long r2 = r2 / r10
                goto L_0x0194
            L_0x0191:
                r5 = 0
            L_0x0193:
                r2 = r5
            L_0x0194:
                int r10 = r1.mo67239c()
                if (r10 == r8) goto L_0x01a9
                java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
                int r11 = r1.mo67239c()
                long r5 = (long) r11
                long r5 = r10.toMillis(r5)
                long r2 = java.lang.Math.min(r2, r5)
            L_0x01a9:
                int r5 = r1.mo67241e()
                if (r5 == r8) goto L_0x01bb
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                int r6 = r1.mo67241e()
                long r10 = (long) r6
                long r5 = r5.toMillis(r10)
                goto L_0x01bd
            L_0x01bb:
                r5 = 0
            L_0x01bd:
                boolean r10 = r14.mo67242f()
                if (r10 != 0) goto L_0x01d7
                int r10 = r1.mo67240d()
                if (r10 == r8) goto L_0x01d7
                java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
                int r1 = r1.mo67240d()
                long r7 = (long) r1
                long r7 = r10.toMillis(r7)
                r16 = r7
                goto L_0x01d9
            L_0x01d7:
                r16 = 0
            L_0x01d9:
                boolean r1 = r14.mo67243g()
                if (r1 != 0) goto L_0x022b
                long r5 = r5 + r12
                long r16 = r2 + r16
                int r1 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
                if (r1 >= 0) goto L_0x022b
                com.yandex.mobile.ads.impl.b51 r1 = r0.f41249c
                r1.getClass()
                com.yandex.mobile.ads.impl.b51$a r4 = new com.yandex.mobile.ads.impl.b51$a
                r4.<init>(r1)
                java.lang.String r1 = "Warning"
                int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r7 < 0) goto L_0x01fb
                java.lang.String r2 = "110 HttpURLConnection \"Response is stale\""
                r4.mo66000a((java.lang.String) r1, (java.lang.String) r2)
            L_0x01fb:
                r2 = 86400000(0x5265c00, double:4.2687272E-316)
                int r5 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
                if (r5 <= 0) goto L_0x0220
                com.yandex.mobile.ads.impl.b51 r2 = r0.f41249c
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                com.yandex.mobile.ads.impl.gd r2 = r2.mo65975c()
                int r2 = r2.mo67239c()
                r3 = -1
                if (r2 != r3) goto L_0x0218
                java.util.Date r2 = r0.f41254h
                if (r2 != 0) goto L_0x0218
                r6 = 1
                goto L_0x0219
            L_0x0218:
                r6 = 0
            L_0x0219:
                if (r6 == 0) goto L_0x0220
                java.lang.String r2 = "113 HttpURLConnection \"Heuristic expiration\""
                r4.mo66000a((java.lang.String) r1, (java.lang.String) r2)
            L_0x0220:
                com.yandex.mobile.ads.impl.vd r1 = new com.yandex.mobile.ads.impl.vd
                com.yandex.mobile.ads.impl.b51 r2 = r4.mo66001a()
                r3 = 0
                r1.<init>(r3, r2)
                goto L_0x027f
            L_0x022b:
                java.lang.String r1 = r0.f41257k
                if (r1 == 0) goto L_0x0231
                r4 = r9
                goto L_0x023e
            L_0x0231:
                java.util.Date r1 = r0.f41252f
                if (r1 == 0) goto L_0x0238
                java.lang.String r1 = r0.f41253g
                goto L_0x023e
            L_0x0238:
                java.util.Date r1 = r0.f41250d
                if (r1 == 0) goto L_0x026e
                java.lang.String r1 = r0.f41251e
            L_0x023e:
                com.yandex.mobile.ads.impl.m41 r2 = r0.f41248b
                com.yandex.mobile.ads.impl.q90 r2 = r2.mo68565d()
                com.yandex.mobile.ads.impl.q90$a r2 = r2.mo69508a()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r2.mo69519a(r4, r1)
                com.yandex.mobile.ads.impl.m41 r1 = r0.f41248b
                r1.getClass()
                com.yandex.mobile.ads.impl.m41$a r3 = new com.yandex.mobile.ads.impl.m41$a
                r3.<init>(r1)
                com.yandex.mobile.ads.impl.q90 r1 = r2.mo69520a()
                com.yandex.mobile.ads.impl.m41$a r1 = r3.mo68571a((com.yandex.mobile.ads.impl.q90) r1)
                com.yandex.mobile.ads.impl.m41 r1 = r1.mo68576a()
                com.yandex.mobile.ads.impl.vd r2 = new com.yandex.mobile.ads.impl.vd
                com.yandex.mobile.ads.impl.b51 r3 = r0.f41249c
                r2.<init>(r1, r3)
                r1 = r2
                r3 = 0
                goto L_0x027f
            L_0x026e:
                com.yandex.mobile.ads.impl.vd r1 = new com.yandex.mobile.ads.impl.vd
                com.yandex.mobile.ads.impl.m41 r2 = r0.f41248b
                r3 = 0
                r1.<init>(r2, r3)
                goto L_0x027f
            L_0x0277:
                r3 = r2
                com.yandex.mobile.ads.impl.vd r1 = new com.yandex.mobile.ads.impl.vd
                com.yandex.mobile.ads.impl.m41 r2 = r0.f41248b
                r1.<init>(r2, r3)
            L_0x027f:
                com.yandex.mobile.ads.impl.m41 r2 = r1.mo70472b()
                if (r2 == 0) goto L_0x0296
                com.yandex.mobile.ads.impl.m41 r2 = r0.f41248b
                com.yandex.mobile.ads.impl.gd r2 = r2.mo68563b()
                boolean r2 = r2.mo67245i()
                if (r2 == 0) goto L_0x0296
                com.yandex.mobile.ads.impl.vd r1 = new com.yandex.mobile.ads.impl.vd
                r1.<init>(r3, r3)
            L_0x0296:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14881vd.C14882a.mo70473a():com.yandex.mobile.ads.impl.vd");
        }
    }

    public C14881vd(m41 m41, b51 b51) {
        this.f41245a = m41;
        this.f41246b = b51;
    }

    /* renamed from: a */
    public final b51 mo70471a() {
        return this.f41246b;
    }

    /* renamed from: b */
    public final m41 mo70472b() {
        return this.f41245a;
    }
}
