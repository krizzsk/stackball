package com.fyber.inneractive.sdk.p049h;

import android.content.SharedPreferences;

/* renamed from: com.fyber.inneractive.sdk.h.p */
public final class C2973p {

    /* renamed from: a */
    private static String f7244a = "AutoWebActionPrefs";

    /* renamed from: b */
    private static String f7245b = "lastReportTS";

    /* renamed from: c */
    private static String f7246c = "numReportsToday";

    /* renamed from: d */
    private SharedPreferences f7247d;

    /* renamed from: com.fyber.inneractive.sdk.h.p$a */
    static final class C2974a {

        /* renamed from: a */
        static C2973p f7248a = new C2973p((byte) 0);
    }

    /* synthetic */ C2973p(byte b) {
        this();
    }

    private C2973p() {
        this.f7247d = null;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.fyber.inneractive.sdk.d.g<? extends com.fyber.inneractive.sdk.j.e>, com.fyber.inneractive.sdk.d.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m6655a(android.content.Context r8, java.lang.String r9, java.lang.String r10, com.fyber.inneractive.sdk.p037d.C2836g<? extends com.fyber.inneractive.sdk.p051j.C3018e> r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x00ff
            if (r9 == 0) goto L_0x00ff
            com.fyber.inneractive.sdk.j.e r1 = r11.mo18129f()
            if (r1 != 0) goto L_0x000d
            goto L_0x00ff
        L_0x000d:
            com.fyber.inneractive.sdk.h.p r1 = com.fyber.inneractive.sdk.p049h.C2973p.C2974a.f7248a
            android.content.SharedPreferences r2 = r1.f7247d
            if (r2 != 0) goto L_0x001b
            java.lang.String r2 = f7244a
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r2, r0)
            r1.f7247d = r8
        L_0x001b:
            com.fyber.inneractive.sdk.h.p r8 = com.fyber.inneractive.sdk.p049h.C2973p.C2974a.f7248a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r0] = r9
            java.lang.String r3 = "IAautoWebActionReporter: reporting action: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r0] = r10
            java.lang.String r3 = "IAautoWebActionReporter: url: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r3, r2)
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = com.fyber.inneractive.sdk.config.IAConfigManager.f6419n
            com.fyber.inneractive.sdk.config.m r2 = r2.f6436h
            boolean r2 = r2.f6610e
            if (r2 != 0) goto L_0x0040
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r9 = "IAautoWebActionReporter: Report of Non user web actions disabled!"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r8)
            return
        L_0x0040:
            com.fyber.inneractive.sdk.h.n$a r2 = new com.fyber.inneractive.sdk.h.n$a
            com.fyber.inneractive.sdk.h.l r3 = com.fyber.inneractive.sdk.p049h.C2966l.MRAID_AUTO_ACTION_DETECTED
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r4 = r11.mo18130g()
            com.fyber.inneractive.sdk.j.e r5 = r11.mo18129f()
            com.fyber.inneractive.sdk.config.a.s r11 = r11.mo18132i()
            org.json.JSONArray r11 = r11.mo18013b()
            r2.<init>((com.fyber.inneractive.sdk.p049h.C2966l) r3, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) r4, (com.fyber.inneractive.sdk.p051j.C3018e) r5, (org.json.JSONArray) r11)
            com.fyber.inneractive.sdk.h.n$b r11 = new com.fyber.inneractive.sdk.h.n$b
            r11.<init>()
            java.lang.String r3 = "action"
            r11.mo18438a(r3, r9)
            boolean r9 = android.text.TextUtils.isEmpty(r10)
            if (r9 != 0) goto L_0x006c
            java.lang.String r9 = "url"
            r11.mo18438a(r9, r10)
        L_0x006c:
            android.content.SharedPreferences r9 = r8.f7247d
            java.lang.String r10 = f7245b
            r3 = 0
            long r9 = r9.getLong(r10, r3)
            java.lang.String r5 = "UTC"
            java.util.TimeZone r5 = java.util.TimeZone.getTimeZone(r5)
            java.util.Calendar r6 = java.util.Calendar.getInstance(r5)
            java.util.Calendar r5 = java.util.Calendar.getInstance(r5)
            r5.setTimeInMillis(r9)
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00a6
            r9 = 6
            int r10 = r6.get(r9)
            int r9 = r5.get(r9)
            if (r10 != r9) goto L_0x00a6
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r10 = "IAautoWebActionReporter: encountered same date"
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r10, r9)
            android.content.SharedPreferences r9 = r8.f7247d
            java.lang.String r10 = f7246c
            int r9 = r9.getInt(r10, r0)
            goto L_0x00a7
        L_0x00a6:
            r9 = 0
        L_0x00a7:
            com.fyber.inneractive.sdk.config.IAConfigManager r10 = com.fyber.inneractive.sdk.config.IAConfigManager.f6419n
            com.fyber.inneractive.sdk.config.m r10 = r10.f6436h
            int r10 = r10.f6611f
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r9 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3[r0] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3[r1] = r5
            java.lang.String r5 = "IAautoWebActionReporter: day counter: %d max: %d"
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r5, r3)
            if (r9 >= r10) goto L_0x00cf
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r10 = "IAautoWebActionReporter: adding ad data"
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r10, r9)
            r2.f7234g = r1
            goto L_0x00d6
        L_0x00cf:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r10 = "IAautoWebActionReporter: not adding ad data"
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r10, r9)
        L_0x00d6:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            java.lang.String r10 = "daily_count"
            r11.mo18438a(r10, r9)
            com.fyber.inneractive.sdk.h.n$a r9 = r2.mo18433a((com.fyber.inneractive.sdk.p049h.C2968n.C2971b) r11)
            r10 = 0
            r9.mo18436b(r10)
            android.content.SharedPreferences r8 = r8.f7247d
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.String r9 = f7245b
            long r10 = r6.getTimeInMillis()
            r8.putLong(r9, r10)
            java.lang.String r9 = f7246c
            r8.putInt(r9, r4)
            r8.apply()
            return
        L_0x00ff:
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r9 = "Invalid report request parameters!"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p049h.C2973p.m6655a(android.content.Context, java.lang.String, java.lang.String, com.fyber.inneractive.sdk.d.g):void");
    }
}
