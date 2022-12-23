package com.yandex.metrica.impl.p265ob;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pe */
public class C11631pe {

    /* renamed from: b */
    public static final Map<String, String> f27919b = Collections.unmodifiableMap(new C11632a());

    /* renamed from: a */
    private C11682qe f27920a;

    /* renamed from: com.yandex.metrica.impl.ob.pe$a */
    class C11632a extends HashMap<String, String> {
        C11632a() {
            put("20799a27-fa80-4b36-b2db-0f8141f24180", "13");
            put("01528cc0-dd34-494d-9218-24af1317e1ee", "17233");
            put("4e610cd2-753f-4bfc-9b05-772ce8905c5e", "21952");
            put("67bb016b-be40-4c08-a190-96a3f3b503d3", "22675");
            put("e4250327-8d3c-4d35-b9e8-3c1720a64b91", "22678");
            put("6c5f504e-8928-47b5-bfb5-73af8d8bf4b4", "30404");
            put("7d962ba4-a392-449a-a02d-6c5be5613928", "30407");
        }
    }

    public C11631pe(C11682qe qeVar) {
        this.f27920a = qeVar;
    }

    /* renamed from: a */
    public void mo63484a() {
        if (this.f27920a.mo63536b((String) null) != null) {
            this.f27920a.mo63544j();
            this.f27920a.mo63540f();
        }
    }

    /* renamed from: b */
    public void mo63486b() {
        Map<String, ?> all = this.f27920a.f28085b.getAll();
        for (String yeVar : f27919b.values()) {
            int i = C11682qe.f28011j;
            all.remove(new C11984ye("init_event_pref_key", yeVar).mo64145a());
        }
        LinkedList linkedList = new LinkedList();
        for (String next : all.keySet()) {
            try {
                int i2 = C11682qe.f28011j;
                linkedList.add(Integer.valueOf(Integer.parseInt(next.replace("init_event_pref_key", ""))));
            } catch (Throwable unused) {
            }
        }
        mo63485a(linkedList.size() == 1 ? ((Integer) linkedList.getFirst()).toString() : null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63487c() {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = f27919b
            com.yandex.metrica.impl.ob.qe r1 = r4.f27920a
            java.lang.String r1 = r1.f28084a
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0035
            com.yandex.metrica.impl.ob.qe r1 = r4.f27920a
            android.content.SharedPreferences r1 = r1.f28085b
            java.util.Map r1 = r1.getAll()
            int r2 = com.yandex.metrica.impl.p265ob.C11682qe.f28011j
            com.yandex.metrica.impl.ob.ye r2 = new com.yandex.metrica.impl.ob.ye
            java.lang.String r3 = "init_event_pref_key"
            r2.<init>(r3, r0)
            java.lang.String r2 = r2.mo64145a()
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r2 = "DONE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r4.mo63485a(r0)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11631pe.mo63487c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63485a(String str) {
        if (str != null) {
            C11682qe qeVar = this.f27920a;
            qeVar.getClass();
            qeVar.f28085b.edit().remove(new C11984ye("init_event_pref_key", str).mo64145a()).apply();
            this.f27920a.mo63544j();
        }
    }
}
