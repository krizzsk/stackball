package com.yandex.mobile.ads.impl;

import java.util.HashMap;

final class b71 extends vc1 {

    /* renamed from: b */
    private long f31262b = -9223372036854775807L;

    public b71() {
        super(new l20());
    }

    /* renamed from: a */
    public long mo66010a() {
        return this.f31262b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo66011a(fy0 fy0) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo66012b(fy0 fy0, long j) throws jy0 {
        if (fy0.mo67126r() == 2) {
            int x = fy0.mo67132x();
            int b = fy0.mo67105b();
            fy0.mo67114f(x);
            if (!"onMetaData".equals(new String(fy0.f33778a, b, x)) || fy0.mo67126r() != 8) {
                return false;
            }
            HashMap<String, Object> b2 = m34177b(fy0);
            if (b2.containsKey("duration")) {
                double doubleValue = ((Double) b2.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f31262b = (long) (doubleValue * 1000000.0d);
                }
            }
            return false;
        }
        throw new jy0();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m34176a(com.yandex.mobile.ads.impl.fy0 r4, int r5) {
        /*
            r0 = 8
            if (r5 == r0) goto L_0x00a6
            r0 = 10
            r1 = 0
            if (r5 == r0) goto L_0x008a
            r0 = 11
            r2 = 2
            if (r5 == r0) goto L_0x0070
            if (r5 == 0) goto L_0x0063
            r0 = 1
            if (r5 == r0) goto L_0x0057
            if (r5 == r2) goto L_0x0044
            r0 = 3
            if (r5 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x001f:
            int r0 = r4.mo67132x()
            int r1 = r4.mo67105b()
            r4.mo67114f(r0)
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r4.f33778a
            r2.<init>(r3, r1, r0)
            int r0 = r4.mo67126r()
            r1 = 9
            if (r0 != r1) goto L_0x003a
            return r5
        L_0x003a:
            java.lang.Object r0 = m34176a(r4, r0)
            if (r0 == 0) goto L_0x001f
            r5.put(r2, r0)
            goto L_0x001f
        L_0x0044:
            int r5 = r4.mo67132x()
            int r0 = r4.mo67105b()
            r4.mo67114f(r5)
            java.lang.String r1 = new java.lang.String
            byte[] r4 = r4.f33778a
            r1.<init>(r4, r0, r5)
            return r1
        L_0x0057:
            int r4 = r4.mo67126r()
            if (r4 != r0) goto L_0x005e
            r1 = 1
        L_0x005e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L_0x0063:
            long r4 = r4.mo67122n()
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        L_0x0070:
            java.util.Date r5 = new java.util.Date
            long r0 = r4.mo67122n()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r0 = r0.doubleValue()
            long r0 = (long) r0
            r5.<init>(r0)
            r4.mo67114f(r2)
            return r5
        L_0x008a:
            int r5 = r4.mo67130v()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
        L_0x0093:
            if (r1 >= r5) goto L_0x00a5
            int r2 = r4.mo67126r()
            java.lang.Object r2 = m34176a(r4, r2)
            if (r2 == 0) goto L_0x00a2
            r0.add(r2)
        L_0x00a2:
            int r1 = r1 + 1
            goto L_0x0093
        L_0x00a5:
            return r0
        L_0x00a6:
            java.util.HashMap r4 = m34177b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.b71.m34176a(com.yandex.mobile.ads.impl.fy0, int):java.lang.Object");
    }

    /* renamed from: b */
    private static HashMap<String, Object> m34177b(fy0 fy0) {
        int v = fy0.mo67130v();
        HashMap<String, Object> hashMap = new HashMap<>(v);
        for (int i = 0; i < v; i++) {
            int x = fy0.mo67132x();
            int b = fy0.mo67105b();
            fy0.mo67114f(x);
            String str = new String(fy0.f33778a, b, x);
            Object a = m34176a(fy0, fy0.mo67126r());
            if (a != null) {
                hashMap.put(str, a);
            }
        }
        return hashMap;
    }
}
