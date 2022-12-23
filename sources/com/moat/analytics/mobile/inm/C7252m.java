package com.moat.analytics.mobile.inm;

import android.util.Log;

/* renamed from: com.moat.analytics.mobile.inm.m */
class C7252m extends Exception {

    /* renamed from: a */
    private static final Long f18200a = 60000L;

    /* renamed from: b */
    private static Long f18201b;

    /* renamed from: c */
    private static Exception f18202c = null;

    C7252m(String str) {
        super(str);
    }

    /* renamed from: a */
    static String m18506a(String str, Exception exc) {
        if (exc instanceof C7252m) {
            return str + " failed: " + exc.getMessage();
        }
        return str + " failed unexpectedly";
    }

    /* renamed from: a */
    static void m18507a() {
        Exception exc = f18202c;
        if (exc != null) {
            m18509b(exc);
            f18202c = null;
        }
    }

    /* renamed from: a */
    static void m18508a(Exception exc) {
        if (C7276w.m18582a().f18243b) {
            Log.e("MoatException", Log.getStackTraceString(exc));
        } else {
            m18509b(exc);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:12|(1:14)(1:15)|16|(5:17|18|19|(1:21)(2:22|23)|24)|25|(3:27|28|(4:29|30|31|32))|38|39|(2:43|46)(1:47)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00d5 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x016f A[Catch:{ Exception -> 0x017b }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[Catch:{ Exception -> 0x017b }, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m18509b(java.lang.Exception r13) {
        /*
            java.lang.String r0 = ""
            com.moat.analytics.mobile.inm.w r1 = com.moat.analytics.mobile.inm.C7276w.m18582a()     // Catch:{ Exception -> 0x017b }
            com.moat.analytics.mobile.inm.w$d r1 = r1.f18242a     // Catch:{ Exception -> 0x017b }
            com.moat.analytics.mobile.inm.w$d r2 = com.moat.analytics.mobile.inm.C7276w.C7284d.ON     // Catch:{ Exception -> 0x017b }
            if (r1 != r2) goto L_0x0179
            com.moat.analytics.mobile.inm.w r1 = com.moat.analytics.mobile.inm.C7276w.m18582a()     // Catch:{ Exception -> 0x017b }
            int r1 = r1.f18246e     // Catch:{ Exception -> 0x017b }
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            r2 = 100
            if (r1 >= r2) goto L_0x0026
            double r2 = (double) r1     // Catch:{ Exception -> 0x017b }
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r4
            double r4 = java.lang.Math.random()     // Catch:{ Exception -> 0x017b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            return
        L_0x0026:
            java.lang.String r2 = "https://px.moatads.com/pixel.gif?e=0&i=MOATSDK1&ac=1"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r3.<init>(r2)     // Catch:{ Exception -> 0x017b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            java.lang.String r4 = "&zt="
            r2.<init>(r4)     // Catch:{ Exception -> 0x017b }
            boolean r4 = r13 instanceof com.moat.analytics.mobile.inm.C7252m     // Catch:{ Exception -> 0x017b }
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x003c
            r4 = 1
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            r2.append(r4)     // Catch:{ Exception -> 0x017b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x017b }
            r3.append(r2)     // Catch:{ Exception -> 0x017b }
            java.lang.String r2 = "&zr="
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x017b }
            java.lang.String r1 = r2.concat(r1)     // Catch:{ Exception -> 0x017b }
            r3.append(r1)     // Catch:{ Exception -> 0x017b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "&zm="
            r1.<init>(r2)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = r13.getMessage()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r4 = "UTF-8"
            if (r2 != 0) goto L_0x0066
            java.lang.String r2 = "null"
            goto L_0x0076
        L_0x0066:
            java.lang.String r2 = r13.getMessage()     // Catch:{ Exception -> 0x00a1 }
            byte[] r2 = r2.getBytes(r4)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r6)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r4)     // Catch:{ Exception -> 0x00a1 }
        L_0x0076:
            r1.append(r2)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00a1 }
            r3.append(r1)     // Catch:{ Exception -> 0x00a1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "&k="
            r1.<init>(r2)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r13 = android.util.Log.getStackTraceString(r13)     // Catch:{ Exception -> 0x00a1 }
            byte[] r13 = r13.getBytes(r4)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r13 = android.util.Base64.encodeToString(r13, r6)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r13 = java.net.URLEncoder.encode(r13, r4)     // Catch:{ Exception -> 0x00a1 }
            r1.append(r13)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r13 = r1.toString()     // Catch:{ Exception -> 0x00a1 }
            r3.append(r13)     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            java.lang.String r13 = "INM"
            java.lang.String r1 = "&zMoatMMAKv=c334ae83accfebb8da23104450c896463c9cfab7"
            r3.append(r1)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r1 = "2.5.0"
            com.moat.analytics.mobile.inm.s$a r2 = com.moat.analytics.mobile.inm.C7264s.m18558d()     // Catch:{ Exception -> 0x00ce }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ce }
            java.lang.String r7 = "&zMoatMMAKan="
            r4.<init>(r7)     // Catch:{ Exception -> 0x00ce }
            java.lang.String r7 = r2.mo49423a()     // Catch:{ Exception -> 0x00ce }
            r4.append(r7)     // Catch:{ Exception -> 0x00ce }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00ce }
            r3.append(r4)     // Catch:{ Exception -> 0x00ce }
            java.lang.String r2 = r2.mo49424b()     // Catch:{ Exception -> 0x00ce }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r0 = java.lang.Integer.toString(r4)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00d5
        L_0x00ce:
            r2 = r0
            goto L_0x00d5
        L_0x00d0:
            r1 = r0
            goto L_0x00d4
        L_0x00d2:
            r13 = r0
            r1 = r13
        L_0x00d4:
            r2 = r1
        L_0x00d5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            java.lang.String r7 = "&d=Android:"
            r4.<init>(r7)     // Catch:{ Exception -> 0x017b }
            r4.append(r13)     // Catch:{ Exception -> 0x017b }
            java.lang.String r13 = ":"
            r4.append(r13)     // Catch:{ Exception -> 0x017b }
            r4.append(r2)     // Catch:{ Exception -> 0x017b }
            java.lang.String r13 = ":-"
            r4.append(r13)     // Catch:{ Exception -> 0x017b }
            java.lang.String r13 = r4.toString()     // Catch:{ Exception -> 0x017b }
            r3.append(r13)     // Catch:{ Exception -> 0x017b }
            java.lang.String r13 = "&bo="
            java.lang.String r13 = r13.concat(r1)     // Catch:{ Exception -> 0x017b }
            r3.append(r13)     // Catch:{ Exception -> 0x017b }
            java.lang.String r13 = "&bd="
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x017b }
            java.lang.String r13 = r13.concat(r0)     // Catch:{ Exception -> 0x017b }
            r3.append(r13)     // Catch:{ Exception -> 0x017b }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017b }
            java.lang.Long r13 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = "&t="
            java.lang.String r1 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ Exception -> 0x017b }
            r3.append(r0)     // Catch:{ Exception -> 0x017b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            java.lang.String r1 = "&de="
            r0.<init>(r1)     // Catch:{ Exception -> 0x017b }
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x017b }
            java.lang.String r2 = "%.0f"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x017b }
            double r7 = java.lang.Math.random()     // Catch:{ Exception -> 0x017b }
            r9 = 4621819117588971520(0x4024000000000000, double:10.0)
            r11 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r9 = java.lang.Math.pow(r9, r11)     // Catch:{ Exception -> 0x017b }
            double r7 = r7 * r9
            double r7 = java.lang.Math.floor(r7)     // Catch:{ Exception -> 0x017b }
            java.lang.Double r5 = java.lang.Double.valueOf(r7)     // Catch:{ Exception -> 0x017b }
            r4[r6] = r5     // Catch:{ Exception -> 0x017b }
            java.lang.String r1 = java.lang.String.format(r1, r2, r4)     // Catch:{ Exception -> 0x017b }
            r0.append(r1)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x017b }
            r3.append(r0)     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = "&cs=0"
            r3.append(r0)     // Catch:{ Exception -> 0x017b }
            java.lang.Long r0 = f18201b     // Catch:{ Exception -> 0x017b }
            if (r0 == 0) goto L_0x016f
            long r0 = r13.longValue()     // Catch:{ Exception -> 0x017b }
            java.lang.Long r2 = f18201b     // Catch:{ Exception -> 0x017b }
            long r4 = r2.longValue()     // Catch:{ Exception -> 0x017b }
            long r0 = r0 - r4
            java.lang.Long r2 = f18200a     // Catch:{ Exception -> 0x017b }
            long r4 = r2.longValue()     // Catch:{ Exception -> 0x017b }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0178
        L_0x016f:
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x017b }
            com.moat.analytics.mobile.inm.C7262q.m18551b(r0)     // Catch:{ Exception -> 0x017b }
            f18201b = r13     // Catch:{ Exception -> 0x017b }
        L_0x0178:
            return
        L_0x0179:
            f18202c = r13     // Catch:{ Exception -> 0x017b }
        L_0x017b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moat.analytics.mobile.inm.C7252m.m18509b(java.lang.Exception):void");
    }
}
