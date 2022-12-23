package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.F9 */
public class C10248F9 extends C10333H9 {

    /* renamed from: A */
    static final C11984ye f24653A = new C11984ye(IronSourceConstants.TYPE_GAID, (String) null);

    /* renamed from: B */
    static final C11984ye f24654B = new C11984ye("HOAID", (String) null);

    /* renamed from: C */
    static final C11984ye f24655C = new C11984ye("YANDEX_ADV_ID", (String) null);

    /* renamed from: D */
    static final C11984ye f24656D = new C11984ye("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", (String) null);

    /* renamed from: E */
    static final C11984ye f24657E = new C11984ye("SCREEN_INFO", (String) null);

    /* renamed from: F */
    static final C11984ye f24658F = new C11984ye("SCREEN_SIZE_CHECKED_BY_DEPRECATED", (String) null);

    /* renamed from: G */
    static final C11984ye f24659G = new C11984ye("FEATURES", (String) null);
    @Deprecated

    /* renamed from: c */
    static final C11984ye f24660c = new C11984ye(IronSourceConstants.TYPE_UUID, (String) null);

    /* renamed from: d */
    static final C11984ye f24661d = new C11984ye("UUID_RESULT", (String) null);
    @Deprecated

    /* renamed from: e */
    static final C11984ye f24662e = new C11984ye("DEVICE_ID", (String) null);

    /* renamed from: f */
    static final C11984ye f24663f = new C11984ye("DEVICE_ID_RESULT", (String) null);
    @Deprecated

    /* renamed from: g */
    static final C11984ye f24664g = new C11984ye("DEVICE_ID_HASH", (String) null);

    /* renamed from: h */
    static final C11984ye f24665h = new C11984ye("DEVICE_ID_HASH_RESULT", (String) null);
    @Deprecated

    /* renamed from: i */
    static final C11984ye f24666i = new C11984ye("AD_URL_GET", (String) null);

    /* renamed from: j */
    static final C11984ye f24667j = new C11984ye("AD_URL_GET_RESULT", (String) null);
    @Deprecated

    /* renamed from: k */
    static final C11984ye f24668k = new C11984ye("AD_URL_REPORT", (String) null);

    /* renamed from: l */
    static final C11984ye f24669l = new C11984ye("AD_URL_REPORT_RESULT", (String) null);

    /* renamed from: m */
    static final C11984ye f24670m = new C11984ye("CUSTOM_HOSTS", (String) null);

    /* renamed from: n */
    static final C11984ye f24671n = new C11984ye("SERVER_TIME_OFFSET", (String) null);
    @Deprecated

    /* renamed from: o */
    static final C11984ye f24672o = new C11984ye("CLIDS", (String) null);

    /* renamed from: p */
    static final C11984ye f24673p = new C11984ye("RESPONSE_CLIDS_RESULT", (String) null);

    /* renamed from: q */
    static final C11984ye f24674q = new C11984ye("CUSTOM_SDK_HOSTS", (String) null);

    /* renamed from: r */
    static final C11984ye f24675r = new C11984ye("CLIENT_CLIDS", (String) null);

    /* renamed from: s */
    static final C11984ye f24676s = new C11984ye("DEFERRED_DEEP_LINK_WAS_CHECKED", (String) null);

    /* renamed from: t */
    static final C11984ye f24677t = new C11984ye("API_LEVEL", (String) null);

    /* renamed from: u */
    static final C11984ye f24678u = new C11984ye("ADS_REQUESTED_CONTEXT", (String) null);

    /* renamed from: v */
    static final C11984ye f24679v = new C11984ye("CONTEXT_HISTORY", (String) null);

    /* renamed from: w */
    static final C11984ye f24680w = new C11984ye("ACCESS_CONFIG", (String) null);

    /* renamed from: x */
    static final C11984ye f24681x = new C11984ye("DIAGNOSTICS_CONFIGS_HOLDER", (String) null);

    /* renamed from: y */
    static final C11984ye f24682y = new C11984ye("NEXT_STARTUP_TIME", (String) null);

    /* renamed from: z */
    static final C11984ye f24683z = new C11984ye("LAST_UI_CONTEXT_ID", (String) null);

    static {
        new C11984ye("DEPRECATED_NATIVE_CRASHES_CHECKED", (String) null);
    }

    public C10248F9(C12019z8 z8Var) {
        super(z8Var);
    }

    /* renamed from: a */
    public C10248F9 mo61265a(C11258g1 g1Var) {
        return m26242a(f24667j.mo64145a(), g1Var);
    }

    /* renamed from: b */
    public boolean mo61273b(boolean z) {
        return mo61446a(f24656D.mo64145a(), z);
    }

    /* renamed from: c */
    public C10248F9 mo61275c(C11258g1 g1Var) {
        return m26242a(f24674q.mo64145a(), g1Var);
    }

    /* renamed from: d */
    public long mo61277d(long j) {
        return mo61443a(f24671n.mo64147b(), j);
    }

    /* renamed from: e */
    public C11258g1 mo61282e() {
        return m26243h(f24667j.mo64145a());
    }

    /* renamed from: f */
    public C11258g1 mo61285f() {
        return m26243h(f24669l.mo64145a());
    }

    @Deprecated
    /* renamed from: g */
    public String mo61289g(String str) {
        return mo61444a(f24668k.mo64145a(), (String) null);
    }

    /* renamed from: h */
    public List<String> mo61293h() {
        String a = mo61444a(f24670m.mo64145a(), (String) null);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return C11993ym.m30988c(a);
    }

    /* renamed from: i */
    public C11258g1 mo61295i() {
        return m26243h(f24674q.mo64145a());
    }

    /* renamed from: j */
    public C11258g1 mo61298j() {
        return m26243h(f24665h.mo64145a());
    }

    /* renamed from: k */
    public C11258g1 mo61300k() {
        return m26243h(f24663f.mo64145a());
    }

    @Deprecated
    /* renamed from: l */
    public String mo61303l(String str) {
        return mo61444a(f24664g.mo64145a(), (String) null);
    }

    /* renamed from: m */
    public C11954xi mo61304m() {
        String a = mo61444a(f24659G.mo64145a(), (String) null);
        try {
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject = new JSONObject(a);
                return new C11954xi(C11993ym.m30976b(jSONObject, "libSslEnabled"), C11171e1.m28808a(C11993ym.m30992e(jSONObject, "STATUS")), C11993ym.m30992e(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C11954xi((Boolean) null, C11171e1.UNKNOWN, (String) null);
    }

    /* renamed from: n */
    public C11258g1 mo61307n() {
        return m26243h(f24653A.mo64145a());
    }

    /* renamed from: o */
    public C11258g1 mo61309o() {
        return m26243h(f24654B.mo64145a());
    }

    @Deprecated
    /* renamed from: p */
    public C10248F9 mo61311p(String str) {
        return (C10248F9) mo61449b(f24672o.mo64145a(), str);
    }

    /* renamed from: q */
    public C11258g1 mo61313q() {
        return m26243h(f24673p.mo64145a());
    }

    @Deprecated
    /* renamed from: r */
    public C10248F9 mo61314r(String str) {
        return (C10248F9) mo61449b(f24662e.mo64145a(), str);
    }

    @Deprecated
    /* renamed from: s */
    public C10248F9 mo61316s(String str) {
        return (C10248F9) mo61449b(f24660c.mo64145a(), str);
    }

    /* renamed from: t */
    public C11258g1 mo61318t() {
        return m26243h(f24661d.mo64145a());
    }

    /* renamed from: u */
    public C11258g1 mo61319u() {
        return m26243h(f24655C.mo64145a());
    }

    /* renamed from: v */
    public boolean mo61320v() {
        return mo61446a(f24676s.mo64145a(), false);
    }

    /* renamed from: w */
    public boolean mo61321w() {
        return mo61446a(f24658F.mo64145a(), false);
    }

    /* renamed from: x */
    public C10248F9 mo61322x() {
        return (C10248F9) mo61451b(f24676s.mo64145a(), true);
    }

    /* renamed from: y */
    public void mo61323y() {
        mo61451b(f24658F.mo64145a(), true);
    }

    /* renamed from: a */
    public C10248F9 mo61266a(C11954xi xiVar) {
        String a = f24659G.mo64145a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", xiVar.mo64090b()).put("STATUS", xiVar.mo64091c().mo62803a()).putOpt("ERROR_EXPLANATION", xiVar.mo64089a());
        } catch (Throwable unused) {
        }
        return (C10248F9) mo61449b(a, jSONObject.toString());
    }

    /* renamed from: b */
    public long mo61270b(long j) {
        return mo61443a(f24677t.mo64145a(), j);
    }

    /* renamed from: c */
    public C10248F9 mo61276c(boolean z) {
        return (C10248F9) mo61451b(f24678u.mo64145a(), z);
    }

    /* renamed from: d */
    public C10248F9 mo61278d(C11258g1 g1Var) {
        return m26242a(f24665h.mo64145a(), g1Var);
    }

    /* renamed from: e */
    public C10248F9 mo61281e(C11258g1 g1Var) {
        return m26242a(f24663f.mo64145a(), g1Var);
    }

    @Deprecated
    /* renamed from: f */
    public String mo61286f(String str) {
        return mo61444a(f24666i.mo64145a(), (String) null);
    }

    /* renamed from: g */
    public C10248F9 mo61288g(C11258g1 g1Var) {
        return m26242a(f24654B.mo64145a(), g1Var);
    }

    @Deprecated
    /* renamed from: i */
    public String mo61296i(String str) {
        return mo61444a(f24672o.mo64145a(), (String) null);
    }

    /* renamed from: j */
    public C10248F9 mo61297j(C11258g1 g1Var) {
        return m26242a(f24655C.mo64145a(), g1Var);
    }

    @Deprecated
    /* renamed from: k */
    public String mo61301k(String str) {
        return mo61444a(f24662e.mo64145a(), (String) null);
    }

    /* renamed from: l */
    public C10921Xa mo61302l() {
        C10921Xa xa = null;
        try {
            String a = mo61444a(f24681x.mo64145a(), (String) null);
            if (a != null) {
                xa = C11993ym.m30959a(new JSONObject(a));
            }
        } catch (Throwable unused) {
        }
        return xa == null ? new C10921Xa() : xa;
    }

    @Deprecated
    /* renamed from: n */
    public C10248F9 mo61306n(String str) {
        return (C10248F9) mo61449b(f24666i.mo64145a(), str);
    }

    @Deprecated
    /* renamed from: o */
    public C10248F9 mo61308o(String str) {
        return (C10248F9) mo61449b(f24668k.mo64145a(), str);
    }

    /* renamed from: p */
    public long mo61310p() {
        return mo61443a(f24682y.mo64145a(), 0);
    }

    /* renamed from: q */
    public C10248F9 mo61312q(String str) {
        return (C10248F9) mo61449b(f24675r.mo64145a(), str);
    }

    /* renamed from: r */
    public C11900w2 mo61315r() {
        return C11993ym.m30995f(mo61455d(f24657E.mo64145a()));
    }

    /* renamed from: s */
    public C10378Il mo61317s() {
        try {
            String a = mo61444a(f24680w.mo64145a(), (String) null);
            if (a != null) {
                return C11993ym.m30984c(new JSONObject(a));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public C10248F9 mo61271b(C11258g1 g1Var) {
        return m26242a(f24669l.mo64145a(), g1Var);
    }

    /* renamed from: c */
    public long mo61274c(long j) {
        return mo61443a(f24683z.mo64145a(), j);
    }

    /* renamed from: d */
    public C10248F9 mo61279d(boolean z) {
        return (C10248F9) mo61451b(f24656D.mo64145a(), z);
    }

    /* renamed from: e */
    public C10248F9 mo61280e(long j) {
        return (C10248F9) mo61448b(f24677t.mo64145a(), j);
    }

    /* renamed from: f */
    public C10248F9 mo61284f(C11258g1 g1Var) {
        return m26242a(f24653A.mo64145a(), g1Var);
    }

    /* renamed from: g */
    public List<String> mo61290g() {
        LinkedList linkedList = new LinkedList();
        List<String> a = mo61445a(f24679v.mo64145a(), (List<String>) linkedList);
        return a == null ? linkedList : a;
    }

    /* renamed from: h */
    public C10248F9 mo61292h(C11258g1 g1Var) {
        return m26242a(f24673p.mo64145a(), g1Var);
    }

    /* renamed from: i */
    public C10248F9 mo61294i(C11258g1 g1Var) {
        return m26242a(f24661d.mo64145a(), g1Var);
    }

    /* renamed from: j */
    public String mo61299j(String str) {
        return mo61444a(f24675r.mo64145a(), (String) null);
    }

    /* renamed from: b */
    public C10248F9 mo61272b(List<String> list) {
        return (C10248F9) mo61449b(f24670m.mo64145a(), C11993ym.m30986c(list));
    }

    /* renamed from: f */
    public C10248F9 mo61283f(long j) {
        return (C10248F9) mo61448b(f24683z.mo64145a(), j);
    }

    /* renamed from: h */
    public C10248F9 mo61291h(long j) {
        return (C10248F9) mo61448b(f24671n.mo64145a(), j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.p265ob.C11258g1 m26243h(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r6 = r5.mo61444a((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0028 }
            if (r6 == 0) goto L_0x0028
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            r1.<init>(r6)     // Catch:{ all -> 0x0028 }
            com.yandex.metrica.impl.ob.g1 r6 = new com.yandex.metrica.impl.ob.g1     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "ID"
            java.lang.String r2 = com.yandex.metrica.impl.p265ob.C11993ym.m30992e(r1, r2)     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "STATUS"
            java.lang.String r3 = com.yandex.metrica.impl.p265ob.C11993ym.m30992e(r1, r3)     // Catch:{ all -> 0x0028 }
            com.yandex.metrica.impl.ob.e1 r3 = com.yandex.metrica.impl.p265ob.C11171e1.m28808a(r3)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "ERROR_EXPLANATION"
            java.lang.String r1 = com.yandex.metrica.impl.p265ob.C11993ym.m30992e(r1, r4)     // Catch:{ all -> 0x0028 }
            r6.<init>(r2, r3, r1)     // Catch:{ all -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            r6 = r0
        L_0x0029:
            if (r6 != 0) goto L_0x0034
            com.yandex.metrica.impl.ob.g1 r6 = new com.yandex.metrica.impl.ob.g1
            com.yandex.metrica.impl.ob.e1 r1 = com.yandex.metrica.impl.p265ob.C11171e1.UNKNOWN
            java.lang.String r2 = "no identifier in preferences"
            r6.<init>(r0, r1, r2)
        L_0x0034:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10248F9.m26243h(java.lang.String):com.yandex.metrica.impl.ob.g1");
    }

    /* renamed from: g */
    public C10248F9 mo61287g(long j) {
        return (C10248F9) mo61448b(f24682y.mo64145a(), j);
    }

    @Deprecated
    /* renamed from: m */
    public String mo61305m(String str) {
        return mo61444a(f24660c.mo64145a(), (String) null);
    }

    /* renamed from: a */
    public boolean mo61269a(boolean z) {
        return mo61446a(f24678u.mo64145a(), z);
    }

    /* renamed from: a */
    public C10248F9 mo61267a(List<String> list) {
        return (C10248F9) mo61450b(f24679v.mo64145a(), list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.p265ob.C10248F9 mo61263a(com.yandex.metrica.impl.p265ob.C10378Il r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000b
            org.json.JSONObject r2 = com.yandex.metrica.impl.p265ob.C11993ym.m30969a((com.yandex.metrica.impl.p265ob.C10378Il) r2)     // Catch:{ all -> 0x000b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r2 == 0) goto L_0x0017
            com.yandex.metrica.impl.ob.ye r0 = f24680w
            java.lang.String r0 = r0.mo64145a()
            r1.mo61449b((java.lang.String) r0, (java.lang.String) r2)
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10248F9.mo61263a(com.yandex.metrica.impl.ob.Il):com.yandex.metrica.impl.ob.F9");
    }

    /* renamed from: a */
    public C10248F9 mo61264a(C10921Xa xa) {
        return (C10248F9) mo61449b(f24681x.mo64145a(), C11993ym.m30973a(xa).toString());
    }

    /* renamed from: a */
    public void mo61268a(C11900w2 w2Var) {
        mo61449b(f24657E.mo64145a(), C11993ym.m30963a(w2Var));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:1|2|3|4|5|6|7|8|9|10|11|12|13|(1:17)|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.p265ob.C10248F9 m26242a(java.lang.String r5, com.yandex.metrica.impl.p265ob.C11258g1 r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x0027
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0027 }
            r0.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = "ID"
            java.lang.String r2 = r6.f26933a     // Catch:{ all -> 0x0022 }
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = "STATUS"
            com.yandex.metrica.impl.ob.e1 r3 = r6.f26934b     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = r3.mo62803a()     // Catch:{ all -> 0x0022 }
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = "ERROR_EXPLANATION"
            java.lang.String r6 = r6.f26935c     // Catch:{ all -> 0x0022 }
            r1.put(r2, r6)     // Catch:{ all -> 0x0022 }
        L_0x0022:
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            if (r6 == 0) goto L_0x002d
            r4.mo61449b((java.lang.String) r5, (java.lang.String) r6)
        L_0x002d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10248F9.m26242a(java.lang.String, com.yandex.metrica.impl.ob.g1):com.yandex.metrica.impl.ob.F9");
    }
}
