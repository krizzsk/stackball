package com.yandex.mobile.ads.impl;

public final class zp0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double mo71270a(java.util.List<? extends com.yandex.mobile.ads.impl.hd0> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "imageValues"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r11, r1)
            r0.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
        L_0x0014:
            boolean r2 = r11.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r11.next()
            com.yandex.mobile.ads.impl.hd0 r2 = (com.yandex.mobile.ads.impl.hd0) r2
            int r5 = r2.mo67516a()
            if (r5 == 0) goto L_0x0033
            int r3 = r2.mo67525e()
            double r3 = (double) r3
            int r2 = r2.mo67516a()
            double r5 = (double) r2
            double r3 = r3 / r5
        L_0x0033:
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
            r0.add(r2)
            goto L_0x0014
        L_0x003b:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r1)
            r11.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0048:
            boolean r1 = r0.hasNext()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 == 0) goto L_0x0069
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            double r5 = r1.doubleValue()
            double r1 = (double) r2
            double r5 = r5 * r1
            int r1 = kotlin.math.MathKt.roundToInt((double) r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.add(r1)
            goto L_0x0048
        L_0x0069:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0072:
            boolean r1 = r11.hasNext()
            r5 = 1
            if (r1 == 0) goto L_0x00a1
            java.lang.Object r1 = r11.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0094
            goto L_0x0099
        L_0x0094:
            int r1 = r1.intValue()
            int r5 = r5 + r1
        L_0x0099:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.put(r6, r1)
            goto L_0x0072
        L_0x00a1:
            java.util.Set r11 = r0.entrySet()
            java.util.Iterator r11 = r11.iterator()
            boolean r1 = r11.hasNext()
            r6 = 0
            if (r1 != 0) goto L_0x00b2
            r1 = r6
            goto L_0x00e5
        L_0x00b2:
            java.lang.Object r1 = r11.next()
            boolean r7 = r11.hasNext()
            if (r7 != 0) goto L_0x00bd
            goto L_0x00e5
        L_0x00bd:
            r7 = r1
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
        L_0x00ca:
            java.lang.Object r8 = r11.next()
            r9 = r8
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r7 >= r9) goto L_0x00df
            r1 = r8
            r7 = r9
        L_0x00df:
            boolean r8 = r11.hasNext()
            if (r8 != 0) goto L_0x00ca
        L_0x00e5:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 != 0) goto L_0x00ea
            goto L_0x00f1
        L_0x00ea:
            java.lang.Object r11 = r1.getValue()
            r6 = r11
            java.lang.Integer r6 = (java.lang.Integer) r6
        L_0x00f1:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00fe:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x012e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r7 = r1.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r6 != 0) goto L_0x0117
            goto L_0x011f
        L_0x0117:
            int r8 = r6.intValue()
            if (r7 != r8) goto L_0x011f
            r7 = 1
            goto L_0x0120
        L_0x011f:
            r7 = 0
        L_0x0120:
            if (r7 == 0) goto L_0x00fe
            java.lang.Object r7 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r11.put(r7, r1)
            goto L_0x00fe
        L_0x012e:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x013f:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0160
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            double r6 = (double) r1
            double r8 = (double) r2
            double r6 = r6 / r8
            java.lang.Double r1 = java.lang.Double.valueOf(r6)
            r0.add(r1)
            goto L_0x013f
        L_0x0160:
            java.util.List r11 = kotlin.collections.CollectionsKt.sorted(r0)
            int r1 = r11.size()
            int r2 = r1 / 2
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0171
            goto L_0x01a1
        L_0x0171:
            r0 = 2
            int r1 = r1 % r0
            r3 = r1 ^ 2
            int r4 = -r1
            r4 = r4 | r1
            r3 = r3 & r4
            int r3 = r3 >> 31
            r3 = r3 & r0
            int r1 = r1 + r3
            if (r1 != r5) goto L_0x0189
            java.lang.Object r11 = r11.get(r2)
            java.lang.Number r11 = (java.lang.Number) r11
            double r3 = r11.doubleValue()
            goto L_0x01a1
        L_0x0189:
            java.lang.Object r1 = r11.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            double r3 = r1.doubleValue()
            int r2 = r2 - r5
            java.lang.Object r11 = r11.get(r2)
            java.lang.Number r11 = (java.lang.Number) r11
            double r1 = r11.doubleValue()
            double r3 = r3 + r1
            double r0 = (double) r0
            double r3 = r3 / r0
        L_0x01a1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zp0.mo71270a(java.util.List):double");
    }
}
