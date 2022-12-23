package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.r5 */
public class C11704r5 extends C11737s5 {
    public C11704r5(C11229f4 f4Var) {
        super(f4Var);
    }

    /* renamed from: a */
    public boolean mo61047a(C11411k0 k0Var) {
        String p = k0Var.mo63163p();
        if (TextUtils.isEmpty(p)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(p);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            mo63623a().mo62889w().mo61497l();
            if (!m30152a(jSONObject.optString("link"))) {
                return false;
            }
            k0Var.mo63141a(Boolean.TRUE);
            mo63623a().mo62889w().mo61496k();
            mo63623a().mo62862C();
            mo63623a().mo62877j().mo62950a();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m30152a(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 != 0) goto L_0x008e
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "referrer"
            java.lang.String r11 = r11.getQueryParameter(r0)     // Catch:{ all -> 0x008e }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x008e
            com.yandex.metrica.impl.ob.f4 r0 = r10.mo63623a()     // Catch:{ all -> 0x008e }
            com.yandex.metrica.impl.ob.Qi r0 = r0.mo62888v()     // Catch:{ all -> 0x008e }
            com.yandex.metrica.impl.ob.oi r0 = r0.mo62010b()     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "&"
            java.lang.String[] r11 = r11.split(r2)     // Catch:{ all -> 0x008e }
            int r2 = r11.length     // Catch:{ all -> 0x008e }
            r3 = 0
        L_0x002b:
            if (r3 >= r2) goto L_0x008e
            r4 = r11[r3]     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "="
            int r5 = r4.indexOf(r5)     // Catch:{ all -> 0x008e }
            if (r5 < 0) goto L_0x008b
            java.lang.String r6 = r4.substring(r1, r5)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = android.net.Uri.decode(r6)     // Catch:{ all -> 0x008e }
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch:{ all -> 0x008e }
            java.lang.String r4 = android.net.Uri.decode(r4)     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "reattribution"
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x008e }
            r7 = 1
            if (r5 == 0) goto L_0x005b
            java.lang.String r5 = "1"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x005b
            goto L_0x0085
        L_0x005b:
            if (r0 == 0) goto L_0x0087
            java.util.List<android.util.Pair<java.lang.String, com.yandex.metrica.impl.ob.oi$a>> r5 = r0.f27864a     // Catch:{ all -> 0x008e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x008e }
        L_0x0063:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x0087
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x008e }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x008e }
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x008e }
            boolean r9 = com.yandex.metrica.impl.p265ob.C10796U2.m27892a((java.lang.Object) r9, (java.lang.Object) r6)     // Catch:{ all -> 0x008e }
            if (r9 == 0) goto L_0x0063
            java.lang.Object r8 = r8.second     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x0085
            com.yandex.metrica.impl.ob.oi$a r8 = (com.yandex.metrica.impl.p265ob.C11606oi.C11607a) r8     // Catch:{ all -> 0x008e }
            java.lang.String r8 = r8.f27865a     // Catch:{ all -> 0x008e }
            boolean r8 = r8.equals(r4)     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x0063
        L_0x0085:
            r4 = 1
            goto L_0x0088
        L_0x0087:
            r4 = 0
        L_0x0088:
            if (r4 == 0) goto L_0x008b
            return r7
        L_0x008b:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11704r5.m30152a(java.lang.String):boolean");
    }
}
