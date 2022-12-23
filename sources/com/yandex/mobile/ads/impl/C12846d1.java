package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.d1 */
public class C12846d1 {

    /* renamed from: a */
    private final hr1 f32336a;

    /* renamed from: b */
    private final C14738u4 f32337b;

    /* renamed from: c */
    private final C15040wc f32338c = new C15040wc();

    /* renamed from: d */
    private final v50 f32339d;

    /* renamed from: e */
    private final w31 f32340e = new w31();

    /* renamed from: f */
    private final ud1 f32341f = new ud1();

    /* renamed from: g */
    private final te1 f32342g = new te1();

    public C12846d1(hr1 hr1, v50 v50) {
        this.f32336a = hr1;
        this.f32339d = v50;
        this.f32337b = new C14738u4(hr1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074 A[Catch:{ Exception -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0057  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.C12563b1 mo66383a(org.xmlpull.v1.XmlPullParser r11) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r10 = this;
            com.yandex.mobile.ads.impl.hr1 r0 = r10.f32336a
            r0.getClass()
            r0 = 2
            r1 = 0
            java.lang.String r2 = "AdBreak"
            r11.require(r0, r1, r2)
            java.lang.String r0 = "breakId"
            java.lang.String r3 = r11.getAttributeValue(r1, r0)
            com.yandex.mobile.ads.impl.w31 r0 = r10.f32340e
            r0.getClass()
            java.lang.String r0 = "repeatAfter"
            java.lang.String r0 = r11.getAttributeValue(r1, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0045
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0045 }
            java.lang.String r4 = "HH:mm:ss"
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ Exception -> 0x0045 }
            r2.<init>(r4, r5)     // Catch:{ Exception -> 0x0045 }
            java.util.Date r0 = r2.parse(r0)     // Catch:{ Exception -> 0x0045 }
            long r4 = r0.getTime()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = "00:00:00"
            java.util.Date r0 = r2.parse(r0)     // Catch:{ Exception -> 0x0045 }
            long r6 = r0.getTime()     // Catch:{ Exception -> 0x0045 }
            long r4 = r4 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0045 }
            r4 = r0
            goto L_0x0046
        L_0x0045:
            r4 = r1
        L_0x0046:
            com.yandex.mobile.ads.impl.ud1 r0 = r10.f32341f
            r0.getClass()
            java.lang.String r0 = "timeOffset"
            java.lang.String r0 = r11.getAttributeValue(r1, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x005d
            com.yandex.mobile.ads.impl.td1 r0 = com.yandex.mobile.ads.impl.fp1.m36102a(r0)
            r5 = r0
            goto L_0x005e
        L_0x005d:
            r5 = r1
        L_0x005e:
            com.yandex.mobile.ads.impl.wc r0 = r10.f32338c
            r0.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "breakType"
            java.lang.String r2 = r11.getAttributeValue(r1, r2)     // Catch:{ Exception -> 0x007e }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x007e }
            if (r6 != 0) goto L_0x007e
            java.lang.String r6 = ","
            java.lang.String[] r2 = r2.split(r6)     // Catch:{ Exception -> 0x007e }
            java.util.List r0 = java.util.Arrays.asList(r2)     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            r6 = r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r2 = r1
        L_0x008a:
            com.yandex.mobile.ads.impl.hr1 r0 = r10.f32336a
            boolean r0 = r0.mo67614a(r11)
            if (r0 == 0) goto L_0x00d7
            com.yandex.mobile.ads.impl.hr1 r0 = r10.f32336a
            boolean r0 = r0.mo67616b(r11)
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r11.getName()
            java.lang.String r9 = "AdSource"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x00ad
            com.yandex.mobile.ads.impl.u4 r0 = r10.f32337b
            com.yandex.mobile.ads.impl.t4 r2 = r0.mo70282a(r11)
            goto L_0x008a
        L_0x00ad:
            java.lang.String r9 = "Extensions"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x00bf
            com.yandex.mobile.ads.impl.v50 r0 = r10.f32339d
            java.util.List r0 = r0.mo70448a(r11)
            r7.addAll(r0)
            goto L_0x008a
        L_0x00bf:
            java.lang.String r9 = "TrackingEvents"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00d1
            com.yandex.mobile.ads.impl.te1 r0 = r10.f32342g
            java.util.Map r0 = r0.mo70173a(r11)
            r8.putAll(r0)
            goto L_0x008a
        L_0x00d1:
            com.yandex.mobile.ads.impl.hr1 r0 = r10.f32336a
            r0.mo67618d(r11)
            goto L_0x008a
        L_0x00d7:
            if (r2 == 0) goto L_0x00e5
            if (r5 == 0) goto L_0x00e5
            boolean r11 = r6.isEmpty()
            if (r11 != 0) goto L_0x00e5
            com.yandex.mobile.ads.impl.b1 r1 = com.yandex.mobile.ads.impl.fp1.m36099a(r2, r3, r4, r5, r6, r7, r8)
        L_0x00e5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12846d1.mo66383a(org.xmlpull.v1.XmlPullParser):com.yandex.mobile.ads.impl.b1");
    }
}
