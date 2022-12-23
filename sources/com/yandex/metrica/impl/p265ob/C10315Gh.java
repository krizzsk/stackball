package com.yandex.metrica.impl.p265ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Gh */
public class C10315Gh {

    /* renamed from: a */
    private final C10662Q9<C10225Eh> f24788a;

    /* renamed from: b */
    private final C10257Fh f24789b;

    /* renamed from: c */
    private final C10868W0 f24790c;

    public C10315Gh(C10662Q9<C10225Eh> q9) {
        this(q9, new C10257Fh(), C10611Oh.m27142a());
    }

    /* renamed from: a */
    public void mo61398a() {
        C10868W0 w0 = this.f24790c;
        C10257Fh fh = this.f24789b;
        List<C10341Hh> list = ((C10225Eh) this.f24788a.mo61953b()).f24588a;
        fh.getClass();
        ArrayList arrayList = new ArrayList();
        for (C10341Hh next : list) {
            ArrayList arrayList2 = new ArrayList(next.f24836b.size());
            for (String next2 : next.f24836b) {
                if (C10122B2.m26036a(next2)) {
                    arrayList2.add(next2);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new C10341Hh(next.f24835a, arrayList2));
            }
        }
        fh.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C10341Hh hh = (C10341Hh) it.next();
            try {
                jSONObject.put(hh.f24835a, new JSONObject().put("classes", new JSONArray(hh.f24836b)));
            } catch (Throwable unused) {
            }
        }
        w0.reportEvent("sdk_list", jSONObject.toString());
    }

    public C10315Gh(C10662Q9<C10225Eh> q9, C10257Fh fh, C10868W0 w0) {
        this.f24788a = q9;
        this.f24789b = fh;
        this.f24790c = w0;
    }
}
