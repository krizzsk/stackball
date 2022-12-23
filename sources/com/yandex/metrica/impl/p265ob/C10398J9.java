package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10726Ri;
import com.yandex.metrica.impl.p265ob.C11428kg;
import com.yandex.metrica.impl.p265ob.C11761si;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.J9 */
public class C10398J9 extends C10333H9 {
    @Deprecated

    /* renamed from: A */
    private static final C11984ye f24975A = new C11984ye("PREF_KEY_REPORT_URL_", (String) null);

    /* renamed from: B */
    private static final C11984ye f24976B = new C11984ye("PREF_KEY_REPORT_URLS_", (String) null);
    @Deprecated

    /* renamed from: C */
    private static final C11984ye f24977C = new C11984ye("PREF_L_URL", (String) null);

    /* renamed from: D */
    private static final C11984ye f24978D = new C11984ye("PREF_L_URLS", (String) null);

    /* renamed from: E */
    private static final C11984ye f24979E = new C11984ye("PREF_KEY_GET_AD_URL", (String) null);

    /* renamed from: F */
    private static final C11984ye f24980F = new C11984ye("PREF_KEY_REPORT_AD_URL", (String) null);

    /* renamed from: G */
    private static final C11984ye f24981G = new C11984ye("PREF_KEY_STARTUP_OBTAIN_TIME_", (String) null);

    /* renamed from: H */
    private static final C11984ye f24982H = new C11984ye("PREF_KEY_STARTUP_ENCODED_CLIDS_", (String) null);

    /* renamed from: I */
    static final C11984ye f24983I = new C11984ye("PREF_KEY_DEVICE_ID_", (String) null);

    /* renamed from: J */
    private static final C11984ye f24984J = new C11984ye("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", (String) null);
    @Deprecated

    /* renamed from: K */
    private static final C11984ye f24985K = new C11984ye("PREF_KEY_PINNING_UPDATE_URL", (String) null);

    /* renamed from: L */
    private static final C11984ye f24986L = new C11984ye("PREF_KEY_EASY_COLLECTING_ENABLED_", (String) null);

    /* renamed from: M */
    private static final C11984ye f24987M = new C11984ye("PREF_KEY_COLLECTING_PACKAGE_INFO_ENABLED_", (String) null);

    /* renamed from: N */
    private static final C11984ye f24988N = new C11984ye("PREF_KEY_PERMISSIONS_COLLECTING_ENABLED_", (String) null);

    /* renamed from: O */
    private static final C11984ye f24989O = new C11984ye("PREF_KEY_FEATURES_COLLECTING_ENABLED_", (String) null);

    /* renamed from: P */
    private static final C11984ye f24990P = new C11984ye("SOCKET_CONFIG_", (String) null);

    /* renamed from: Q */
    private static final C11984ye f24991Q = new C11984ye("LAST_STARTUP_REQUEST_CLIDS", (String) null);

    /* renamed from: w */
    static final C11984ye f24992w = new C11984ye("PREF_KEY_UID_", (String) null);

    /* renamed from: x */
    private static final C11984ye f24993x = new C11984ye("PREF_KEY_HOST_URL_", (String) null);

    /* renamed from: y */
    private static final C11984ye f24994y = new C11984ye("PREF_KEY_HOST_URLS_FROM_STARTUP", (String) null);

    /* renamed from: z */
    private static final C11984ye f24995z = new C11984ye("PREF_KEY_HOST_URLS_FROM_CLIENT", (String) null);

    /* renamed from: c */
    private C11984ye f24996c = new C11984ye(f24983I.mo64147b());

    /* renamed from: d */
    private C11984ye f24997d = mo61453c(f24992w.mo64147b());

    /* renamed from: e */
    private C11984ye f24998e = mo61453c(f24993x.mo64147b());

    /* renamed from: f */
    private C11984ye f24999f = mo61453c(f24994y.mo64147b());

    /* renamed from: g */
    private C11984ye f25000g = mo61453c(f24995z.mo64147b());
    @Deprecated

    /* renamed from: h */
    private C11984ye f25001h = mo61453c(f24975A.mo64147b());

    /* renamed from: i */
    private C11984ye f25002i = mo61453c(f24976B.mo64147b());
    @Deprecated

    /* renamed from: j */
    private C11984ye f25003j = mo61453c(f24977C.mo64147b());

    /* renamed from: k */
    private C11984ye f25004k = mo61453c(f24978D.mo64147b());

    /* renamed from: l */
    private C11984ye f25005l = mo61453c(f24979E.mo64147b());

    /* renamed from: m */
    private C11984ye f25006m = mo61453c(f24980F.mo64147b());

    /* renamed from: n */
    private C11984ye f25007n = mo61453c(f24981G.mo64147b());

    /* renamed from: o */
    private C11984ye f25008o = mo61453c(f24982H.mo64147b());

    /* renamed from: p */
    private C11984ye f25009p = mo61453c(f24984J.mo64147b());

    /* renamed from: q */
    private C11984ye f25010q = mo61453c(f24986L.mo64147b());

    /* renamed from: r */
    private C11984ye f25011r = mo61453c(f24987M.mo64147b());

    /* renamed from: s */
    private C11984ye f25012s = mo61453c(f24988N.mo64147b());

    /* renamed from: t */
    private C11984ye f25013t = mo61453c(f24989O.mo64147b());

    /* renamed from: u */
    private C11984ye f25014u = mo61453c(f24990P.mo64147b());

    /* renamed from: v */
    private C11984ye f25015v = mo61453c(f24991Q.mo64147b());

    public C10398J9(C12019z8 z8Var, String str) {
        super(z8Var, str);
    }

    /* renamed from: a */
    public C10398J9 mo61605a(List<String> list) {
        return (C10398J9) mo61449b(this.f25004k.mo64145a(), C11993ym.m30986c(list));
    }

    /* renamed from: b */
    public C10398J9 mo61608b(List<String> list) {
        return (C10398J9) mo61449b(this.f25002i.mo64145a(), C11993ym.m30986c(list));
    }

    /* renamed from: e */
    public void mo61609e() {
        mo61457e(f24985K.mo64145a());
        mo61457e(this.f24996c.mo64145a());
        mo61457e(this.f25005l.mo64145a());
        mo61457e(this.f25011r.mo64145a());
        mo61457e(this.f25010q.mo64145a());
        mo61457e(this.f25008o.mo64145a());
        mo61457e(this.f25013t.mo64145a());
        mo61457e(this.f24998e.mo64145a());
        mo61457e(this.f25000g.mo64145a());
        mo61457e(this.f24999f.mo64145a());
        mo61457e(this.f25015v.mo64145a());
        mo61457e(this.f25003j.mo64145a());
        mo61457e(this.f25004k.mo64145a());
        mo61457e(this.f25007n.mo64145a());
        mo61457e(this.f25012s.mo64145a());
        mo61457e(this.f25006m.mo64145a());
        mo61457e(this.f25001h.mo64145a());
        mo61457e(this.f25002i.mo64145a());
        mo61457e(this.f25014u.mo64145a());
        mo61457e(this.f25009p.mo64145a());
        mo61457e(this.f24997d.mo64145a());
        mo61457e(mo61453c(new C11984ye("PREF_KEY_DISTRIBUTION_REFERRER_", (String) null).mo64147b()).mo64145a());
        mo61454c();
    }

    @Deprecated
    /* renamed from: f */
    public C10726Ri mo61610f() {
        C10226Ei ei;
        C10726Ri.C10728b bVar;
        C10726Ri.C10728b bVar2;
        C10726Ri.C10728b j = new C10726Ri.C10728b(new C11761si(new C11761si.C11762a().mo63665d(mo61446a(this.f25010q.mo64145a(), C11761si.C11763b.f28230b)).mo63674m(mo61446a(this.f25011r.mo64145a(), C11761si.C11763b.f28231c)).mo63675n(mo61446a(this.f25012s.mo64145a(), C11761si.C11763b.f28232d)).mo63667f(mo61446a(this.f25013t.mo64145a(), C11761si.C11763b.f28233e)))).mo62200l(mo61455d(this.f24997d.mo64145a())).mo62183c(C11993ym.m30988c(mo61455d(this.f24999f.mo64145a()))).mo62178b(C11993ym.m30988c(mo61455d(this.f25000g.mo64145a()))).mo62189f(mo61455d(this.f25008o.mo64145a())).mo62196i(C11993ym.m30988c(mo61455d(this.f25002i.mo64145a()))).mo62188e(C11993ym.m30988c(mo61455d(this.f25004k.mo64145a()))).mo62191g(mo61455d(this.f25005l.mo64145a())).mo62197j(mo61455d(this.f25006m.mo64145a()));
        String d = mo61455d(this.f25014u.mo64145a());
        try {
            if (TextUtils.isEmpty(d)) {
                bVar = j;
                ei = null;
                return bVar.mo62157a(ei).mo62195i(mo61455d(this.f25015v.mo64145a())).mo62184c(mo61446a(this.f25009p.mo64145a(), true)).mo62180c(mo61443a(this.f25007n.mo64145a(), -1)).mo62174a();
            }
            JSONObject jSONObject = new JSONObject(d);
            C11428kg.C11453p pVar = new C11428kg.C11453p();
            long j2 = jSONObject.getLong("seconds_to_live");
            String string = jSONObject.getString("token");
            JSONArray jSONArray = jSONObject.getJSONArray("ports");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            }
            bVar2 = j;
            try {
                ei = new C10226Ei(j2, string, arrayList, new ArrayList(), jSONObject.getLong("first_delay_seconds"), jSONObject.getInt("launch_delay_seconds"), jSONObject.optLong("open_event_interval_seconds", pVar.f27553h), pVar.f27554i, pVar.f27555j, pVar.f27556k);
                bVar = bVar2;
            } catch (Throwable unused) {
                bVar = bVar2;
                ei = null;
                return bVar.mo62157a(ei).mo62195i(mo61455d(this.f25015v.mo64145a())).mo62184c(mo61446a(this.f25009p.mo64145a(), true)).mo62180c(mo61443a(this.f25007n.mo64145a(), -1)).mo62174a();
            }
            return bVar.mo62157a(ei).mo62195i(mo61455d(this.f25015v.mo64145a())).mo62184c(mo61446a(this.f25009p.mo64145a(), true)).mo62180c(mo61443a(this.f25007n.mo64145a(), -1)).mo62174a();
        } catch (Throwable unused2) {
            bVar2 = j;
            bVar = bVar2;
            ei = null;
            return bVar.mo62157a(ei).mo62195i(mo61455d(this.f25015v.mo64145a())).mo62184c(mo61446a(this.f25009p.mo64145a(), true)).mo62180c(mo61443a(this.f25007n.mo64145a(), -1)).mo62174a();
        }
    }

    @Deprecated
    /* renamed from: g */
    public String mo61612g(String str) {
        return mo61444a(this.f25001h.mo64145a(), (String) null);
    }

    @Deprecated
    /* renamed from: h */
    public C10398J9 mo61613h(String str) {
        return (C10398J9) mo61449b(this.f24996c.mo64145a(), str);
    }

    /* renamed from: i */
    public C10398J9 mo61614i(String str) {
        return (C10398J9) mo61449b(this.f25008o.mo64145a(), str);
    }

    /* renamed from: j */
    public C10398J9 mo61615j(String str) {
        return (C10398J9) mo61449b(this.f25005l.mo64145a(), str);
    }

    /* renamed from: k */
    public C10398J9 mo61616k(String str) {
        return (C10398J9) mo61449b(this.f24998e.mo64145a(), str);
    }

    /* renamed from: l */
    public C10398J9 mo61617l(String str) {
        return (C10398J9) mo61449b(this.f25006m.mo64145a(), str);
    }

    @Deprecated
    /* renamed from: m */
    public C10398J9 mo61618m(String str) {
        return (C10398J9) mo61449b(this.f25001h.mo64145a(), str);
    }

    /* renamed from: n */
    public C10398J9 mo61619n(String str) {
        return (C10398J9) mo61449b(this.f24997d.mo64145a(), str);
    }

    /* renamed from: a */
    public C10398J9 mo61606a(boolean z) {
        return (C10398J9) mo61451b(this.f25009p.mo64145a(), z);
    }

    /* renamed from: b */
    public C10398J9 mo61607b(long j) {
        return (C10398J9) mo61448b(this.f25007n.mo64145a(), j);
    }

    @Deprecated
    /* renamed from: f */
    public String mo61611f(String str) {
        return mo61444a(this.f25003j.mo64145a(), (String) null);
    }
}
