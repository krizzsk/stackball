package com.yandex.mobile.ads.base;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.base.m */
enum C12106m {
    BROWSER_CONTROL_PANEL_HEIGHT,
    BROWSER_CONTROL_PANEL_BUTTON_PADDING,
    BROWSER_CONTROL_PANEL_TITLE_TEXT_SIZE;
    

    /* renamed from: e */
    private static final Map<String, Object> f29180e = null;

    static {
        C12106m mVar;
        C12106m mVar2;
        C12106m mVar3;
        HashMap hashMap = new HashMap();
        f29180e = hashMap;
        hashMap.put(mVar.mo64528a("values_dimen_%s"), 48);
        hashMap.put(mVar.mo64528a("values_dimen_%s_sw600dp"), 56);
        hashMap.put(mVar2.mo64528a("values_dimen_%s"), 15);
        hashMap.put(mVar2.mo64528a("values_dimen_%s_sw600dp"), 17);
        hashMap.put(mVar3.mo64528a("values_dimen_%s"), 19);
        hashMap.put(mVar3.mo64528a("values_dimen_%s_sw600dp"), 23);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0046 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060 A[Catch:{ Exception -> 0x0065 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo64527a(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "values_dimen_%s"
            r1 = 1
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0046 }
            java.lang.String r4 = r5.name()     // Catch:{ Exception -> 0x0046 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0046 }
            int r4 = com.yandex.mobile.ads.impl.lo1.m38873d((android.content.Context) r6)     // Catch:{ Exception -> 0x0046 }
            int r6 = com.yandex.mobile.ads.impl.lo1.m38869b((android.content.Context) r6)     // Catch:{ Exception -> 0x0046 }
            int r6 = java.lang.Math.min(r4, r6)     // Catch:{ Exception -> 0x0046 }
            r4 = 600(0x258, float:8.41E-43)
            if (r6 < r4) goto L_0x0027
            java.lang.String r6 = "_"
            r3.append(r6)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r6 = "sw600dp"
            r3.append(r6)     // Catch:{ Exception -> 0x0046 }
        L_0x0027:
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x0046 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ Exception -> 0x0046 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0046 }
            r4[r2] = r6     // Catch:{ Exception -> 0x0046 }
            java.lang.String r6 = java.lang.String.format(r3, r0, r4)     // Catch:{ Exception -> 0x0046 }
            java.util.Map<java.lang.String, java.lang.Object> r3 = f29180e     // Catch:{ Exception -> 0x0046 }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x0046 }
            java.lang.Object r6 = r3.get(r6)     // Catch:{ Exception -> 0x0046 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0046 }
            if (r6 == 0) goto L_0x0046
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0046 }
            return r6
        L_0x0046:
            java.lang.String r6 = r5.name()     // Catch:{ Exception -> 0x0065 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ Exception -> 0x0065 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0065 }
            r1[r2] = r6     // Catch:{ Exception -> 0x0065 }
            java.lang.String r6 = java.lang.String.format(r3, r0, r1)     // Catch:{ Exception -> 0x0065 }
            java.util.Map<java.lang.String, java.lang.Object> r0 = f29180e     // Catch:{ Exception -> 0x0065 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0065 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ Exception -> 0x0065 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0065 }
            if (r6 == 0) goto L_0x0065
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0065 }
            return r6
        L_0x0065:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.base.C12106m.mo64527a(android.content.Context):int");
    }

    public String toString() {
        return name();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo64528a(String str) {
        String name = name();
        return String.format(Locale.US, str, new Object[]{name});
    }
}
