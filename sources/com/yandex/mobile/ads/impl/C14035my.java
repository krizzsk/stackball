package com.yandex.mobile.ads.impl;

import kotlin.ranges.RangesKt;

/* renamed from: com.yandex.mobile.ads.impl.my */
public final class C14035my {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Float} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.transition.Transition m39761a(com.yandex.mobile.ads.impl.C13420in r6, boolean r7, com.yandex.mobile.ads.impl.j50 r8) {
        /*
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.in$e> r0 = r6.f34937e
            java.lang.Object r0 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r8)
            com.yandex.mobile.ads.impl.in$e r0 = (com.yandex.mobile.ads.impl.C13420in.C13425e) r0
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == r1) goto L_0x00b4
            r4 = 3
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r0 == r4) goto L_0x0068
            r4 = 5
            if (r0 == r4) goto L_0x0114
            if (r7 == 0) goto L_0x0038
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r6 = r6.f34939g
            if (r6 != 0) goto L_0x0021
            r6 = r3
            goto L_0x0027
        L_0x0021:
            java.lang.Object r6 = r6.mo66924a((com.yandex.mobile.ads.impl.j50) r8)
            java.lang.Double r6 = (java.lang.Double) r6
        L_0x0027:
            if (r6 != 0) goto L_0x002a
            goto L_0x0054
        L_0x002a:
            double r3 = r6.doubleValue()
            float r6 = (float) r3
            float r6 = kotlin.ranges.RangesKt.coerceIn((float) r6, (float) r2, (float) r5)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            goto L_0x0054
        L_0x0038:
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r6 = r6.f34934b
            if (r6 != 0) goto L_0x003e
            r6 = r3
            goto L_0x0044
        L_0x003e:
            java.lang.Object r6 = r6.mo66924a((com.yandex.mobile.ads.impl.j50) r8)
            java.lang.Double r6 = (java.lang.Double) r6
        L_0x0044:
            if (r6 != 0) goto L_0x0047
            goto L_0x0054
        L_0x0047:
            double r3 = r6.doubleValue()
            float r6 = (float) r3
            float r6 = kotlin.ranges.RangesKt.coerceIn((float) r6, (float) r2, (float) r5)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
        L_0x0054:
            com.yandex.mobile.ads.impl.c60 r6 = new com.yandex.mobile.ads.impl.c60
            if (r3 != 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            float r5 = r3.floatValue()
        L_0x005d:
            r6.<init>(r5)
            if (r7 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r1 = 2
        L_0x0064:
            r6.setMode(r1)
            goto L_0x00b1
        L_0x0068:
            if (r7 == 0) goto L_0x0087
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r6 = r6.f34939g
            if (r6 != 0) goto L_0x0070
            r6 = r3
            goto L_0x0076
        L_0x0070:
            java.lang.Object r6 = r6.mo66924a((com.yandex.mobile.ads.impl.j50) r8)
            java.lang.Double r6 = (java.lang.Double) r6
        L_0x0076:
            if (r6 != 0) goto L_0x0079
            goto L_0x00a3
        L_0x0079:
            double r6 = r6.doubleValue()
            float r6 = (float) r6
            float r6 = kotlin.ranges.RangesKt.coerceAtLeast((float) r6, (float) r2)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            goto L_0x00a3
        L_0x0087:
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r6 = r6.f34934b
            if (r6 != 0) goto L_0x008d
            r6 = r3
            goto L_0x0093
        L_0x008d:
            java.lang.Object r6 = r6.mo66924a((com.yandex.mobile.ads.impl.j50) r8)
            java.lang.Double r6 = (java.lang.Double) r6
        L_0x0093:
            if (r6 != 0) goto L_0x0096
            goto L_0x00a3
        L_0x0096:
            double r6 = r6.doubleValue()
            float r6 = (float) r6
            float r6 = kotlin.ranges.RangesKt.coerceAtLeast((float) r6, (float) r2)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
        L_0x00a3:
            com.yandex.mobile.ads.impl.t61 r6 = new com.yandex.mobile.ads.impl.t61
            if (r3 != 0) goto L_0x00a8
            goto L_0x00ac
        L_0x00a8:
            float r5 = r3.floatValue()
        L_0x00ac:
            r7 = 1056964608(0x3f000000, float:0.5)
            r6.<init>(r5, r7, r7)
        L_0x00b1:
            r3 = r6
            goto L_0x0114
        L_0x00b4:
            if (r7 == 0) goto L_0x00c9
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r0 = r6.f34939g
            if (r0 != 0) goto L_0x00bb
            goto L_0x00d6
        L_0x00bb:
            java.lang.Object r0 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r8)
            java.lang.Double r0 = (java.lang.Double) r0
            if (r0 != 0) goto L_0x00c4
            goto L_0x00d6
        L_0x00c4:
            java.lang.Float r0 = m39762a(r0)
            goto L_0x00dc
        L_0x00c9:
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r0 = r6.f34934b
            if (r0 != 0) goto L_0x00ce
            goto L_0x00d6
        L_0x00ce:
            java.lang.Object r0 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r8)
            java.lang.Double r0 = (java.lang.Double) r0
            if (r0 != 0) goto L_0x00d8
        L_0x00d6:
            r0 = r3
            goto L_0x00dc
        L_0x00d8:
            java.lang.Float r0 = m39762a(r0)
        L_0x00dc:
            if (r7 == 0) goto L_0x00ef
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r6 = r6.f34934b
            if (r6 != 0) goto L_0x00e3
            goto L_0x00ea
        L_0x00e3:
            java.lang.Object r6 = r6.mo66924a((com.yandex.mobile.ads.impl.j50) r8)
            r3 = r6
            java.lang.Double r3 = (java.lang.Double) r3
        L_0x00ea:
            java.lang.Float r6 = m39762a(r3)
            goto L_0x00ff
        L_0x00ef:
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r6 = r6.f34939g
            if (r6 != 0) goto L_0x00f4
            goto L_0x00fb
        L_0x00f4:
            java.lang.Object r6 = r6.mo66924a((com.yandex.mobile.ads.impl.j50) r8)
            r3 = r6
            java.lang.Double r3 = (java.lang.Double) r3
        L_0x00fb:
            java.lang.Float r6 = m39762a(r3)
        L_0x00ff:
            com.yandex.mobile.ads.impl.jj1 r3 = new com.yandex.mobile.ads.impl.jj1
            if (r0 != 0) goto L_0x0106
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x010a
        L_0x0106:
            float r7 = r0.floatValue()
        L_0x010a:
            if (r6 != 0) goto L_0x010d
            goto L_0x0111
        L_0x010d:
            float r2 = r6.floatValue()
        L_0x0111:
            r3.<init>(r7, r2)
        L_0x0114:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14035my.m39761a(com.yandex.mobile.ads.impl.in, boolean, com.yandex.mobile.ads.impl.j50):androidx.transition.Transition");
    }

    /* renamed from: a */
    private static final Float m39762a(Double d) {
        if (d == null) {
            return null;
        }
        return Float.valueOf(RangesKt.coerceIn((float) d.doubleValue(), -1.0f, 1.0f));
    }
}
