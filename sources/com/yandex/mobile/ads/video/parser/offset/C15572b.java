package com.yandex.mobile.ads.video.parser.offset;

import com.yandex.mobile.ads.impl.s01;
import com.yandex.mobile.ads.impl.vd1;
import com.yandex.mobile.ads.impl.zy0;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.video.parser.offset.b */
public class C15572b {

    /* renamed from: a */
    private final Set<C15571a> f44169a;

    /* renamed from: b */
    private final zy0 f44170b = new zy0();

    /* renamed from: c */
    private final s01 f44171c = new s01();

    /* renamed from: d */
    private final vd1 f44172d = new vd1();

    public C15572b(Set<C15571a> set) {
        this.f44169a = set;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.video.parser.offset.VastTimeOffset mo72005a(java.lang.String r7) {
        /*
            r6 = this;
            com.yandex.mobile.ads.video.parser.offset.a r0 = com.yandex.mobile.ads.video.parser.offset.C15571a.START
            java.util.Set<com.yandex.mobile.ads.video.parser.offset.a> r1 = r6.f44169a
            boolean r0 = r1.contains(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = "start"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x001d
            com.yandex.mobile.ads.video.parser.offset.VastTimeOffset r2 = new com.yandex.mobile.ads.video.parser.offset.VastTimeOffset
            com.yandex.mobile.ads.video.parser.offset.VastTimeOffset$b r7 = com.yandex.mobile.ads.video.parser.offset.VastTimeOffset.C15570b.MILLISECONDS
            r2.<init>(r7, r1)
            goto L_0x00fe
        L_0x001d:
            com.yandex.mobile.ads.video.parser.offset.a r0 = com.yandex.mobile.ads.video.parser.offset.C15571a.END
            java.util.Set<com.yandex.mobile.ads.video.parser.offset.a> r3 = r6.f44169a
            boolean r0 = r3.contains(r0)
            r3 = 1120403456(0x42c80000, float:100.0)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "end"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x003a
            com.yandex.mobile.ads.video.parser.offset.VastTimeOffset r2 = new com.yandex.mobile.ads.video.parser.offset.VastTimeOffset
            com.yandex.mobile.ads.video.parser.offset.VastTimeOffset$b r7 = com.yandex.mobile.ads.video.parser.offset.VastTimeOffset.C15570b.PERCENTS
            r2.<init>(r7, r3)
            goto L_0x00fe
        L_0x003a:
            com.yandex.mobile.ads.video.parser.offset.a r0 = com.yandex.mobile.ads.video.parser.offset.C15571a.PERCENTAGE
            java.util.Set<com.yandex.mobile.ads.video.parser.offset.a> r4 = r6.f44169a
            boolean r0 = r4.contains(r0)
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = "%"
            boolean r0 = r7.endsWith(r0)
            if (r0 == 0) goto L_0x0086
            com.yandex.mobile.ads.impl.zy0 r0 = r6.f44170b
            r0.getClass()
            int r0 = r7.length()     // Catch:{ all -> 0x0076 }
            int r0 = r0 - r5
            java.lang.String r7 = r7.substring(r4, r0)     // Catch:{ all -> 0x0076 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0061 }
            goto L_0x0062
        L_0x0061:
            r7 = r2
        L_0x0062:
            float r7 = r7.floatValue()     // Catch:{ all -> 0x0076 }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006f
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x006f
            r4 = 1
        L_0x006f:
            if (r4 == 0) goto L_0x0076
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ all -> 0x0076 }
            goto L_0x0077
        L_0x0076:
            r7 = r2
        L_0x0077:
            if (r7 == 0) goto L_0x00fe
            com.yandex.mobile.ads.video.parser.offset.VastTimeOffset r2 = new com.yandex.mobile.ads.video.parser.offset.VastTimeOffset
            com.yandex.mobile.ads.video.parser.offset.VastTimeOffset$b r0 = com.yandex.mobile.ads.video.parser.offset.VastTimeOffset.C15570b.PERCENTS
            float r7 = r7.floatValue()
            r2.<init>(r0, r7)
            goto L_0x00fe
        L_0x0086:
            com.yandex.mobile.ads.video.parser.offset.a r0 = com.yandex.mobile.ads.video.parser.offset.C15571a.POSITION
            java.util.Set<com.yandex.mobile.ads.video.parser.offset.a> r1 = r6.f44169a
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "#"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00bf
            com.yandex.mobile.ads.impl.s01 r0 = r6.f44171c
            r0.getClass()
            java.lang.String r7 = r7.substring(r5)     // Catch:{ Exception -> 0x00af }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x00af }
            if (r7 < r5) goto L_0x00a8
            r4 = 1
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00af }
            goto L_0x00b0
        L_0x00af:
            r7 = r2
        L_0x00b0:
            if (r7 == 0) goto L_0x00fe
            com.yandex.mobile.ads.video.parser.offset.VastTimeOffset r2 = new com.yandex.mobile.ads.video.parser.offset.VastTimeOffset
            com.yandex.mobile.ads.video.parser.offset.VastTimeOffset$b r0 = com.yandex.mobile.ads.video.parser.offset.VastTimeOffset.C15570b.POSITION
            int r7 = r7.intValue()
            float r7 = (float) r7
            r2.<init>(r0, r7)
            goto L_0x00fe
        L_0x00bf:
            com.yandex.mobile.ads.video.parser.offset.a r0 = com.yandex.mobile.ads.video.parser.offset.C15571a.TIME
            java.util.Set<com.yandex.mobile.ads.video.parser.offset.a> r1 = r6.f44169a
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00fe
            com.yandex.mobile.ads.impl.vd1 r0 = r6.f44172d
            r0.getClass()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x00ef }
            java.lang.String r1 = "hh:mm:ss"
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ ParseException -> 0x00ef }
            r0.<init>(r1, r3)     // Catch:{ ParseException -> 0x00ef }
            java.lang.String r1 = "00:00:00"
            java.util.Date r1 = r0.parse(r1)     // Catch:{ ParseException -> 0x00ef }
            long r3 = r1.getTime()     // Catch:{ ParseException -> 0x00ef }
            java.util.Date r7 = r0.parse(r7)     // Catch:{ ParseException -> 0x00ef }
            long r0 = r7.getTime()     // Catch:{ ParseException -> 0x00ef }
            long r0 = r0 - r3
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ ParseException -> 0x00ef }
            goto L_0x00f0
        L_0x00ef:
            r7 = r2
        L_0x00f0:
            if (r7 == 0) goto L_0x00fe
            com.yandex.mobile.ads.video.parser.offset.VastTimeOffset r2 = new com.yandex.mobile.ads.video.parser.offset.VastTimeOffset
            com.yandex.mobile.ads.video.parser.offset.VastTimeOffset$b r0 = com.yandex.mobile.ads.video.parser.offset.VastTimeOffset.C15570b.MILLISECONDS
            long r3 = r7.longValue()
            float r7 = (float) r3
            r2.<init>(r0, r7)
        L_0x00fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.video.parser.offset.C15572b.mo72005a(java.lang.String):com.yandex.mobile.ads.video.parser.offset.VastTimeOffset");
    }
}
