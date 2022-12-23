package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.oe */
public class C11599oe {

    /* renamed from: a */
    private Context f27848a;

    public C11599oe(Context context) {
        this.f27848a = context;
    }

    /* renamed from: a */
    public void mo63432a() {
        SharedPreferences a = C11327i.m29165a(this.f27848a, "_bidoptpreferences");
        if (a.getAll().size() > 0) {
            C11984ye yeVar = C11912we.f28651p;
            String string = a.getString(yeVar.mo64147b(), (String) null);
            C11912we weVar = new C11912we(this.f27848a, (String) null);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(weVar.mo64032b((String) null))) {
                weVar.mo64040i(string).mo63599b();
                a.edit().remove(yeVar.mo64147b()).apply();
            }
            Map<String, ?> all = a.getAll();
            if (all.size() > 0) {
                Iterator it = ((ArrayList) m29981a(all, C11912we.f28652q.mo64147b())).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String string2 = a.getString(new C11984ye(C11912we.f28652q.mo64147b(), str).mo64145a(), (String) null);
                    C11912we weVar2 = new C11912we(this.f27848a, str);
                    if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(weVar2.mo64039h((String) null))) {
                        weVar2.mo64041j(string2).mo63599b();
                    }
                }
            }
            a.edit().clear().apply();
        }
    }

    /* renamed from: b */
    public void mo63433b() {
        C12019z8 p = C10663Qa.m27298a(this.f27848a).mo61970p();
        SharedPreferences a = C11327i.m29165a(this.f27848a, "_startupserviceinfopreferences");
        C10398J9 j9 = new C10398J9(p, (String) null);
        C11984ye yeVar = C11912we.f28651p;
        String string = a.getString(yeVar.mo64147b(), (String) null);
        if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(j9.mo61610f().f25679b)) {
            j9.mo61613h(string).mo61454c();
            a.edit().remove(yeVar.mo64147b()).apply();
        }
        C10398J9 j92 = new C10398J9(p, this.f27848a.getPackageName());
        boolean z = a.getBoolean(C11912we.f28660y.mo64147b(), false);
        if (z) {
            j92.mo61606a(z).mo61454c();
        }
        m29982a(p, this.f27848a.getPackageName());
        Iterator it = ((ArrayList) m29981a(a.getAll(), C11912we.f28652q.mo64147b())).iterator();
        while (it.hasNext()) {
            m29982a(p, (String) it.next());
        }
    }

    /* renamed from: a */
    private List<String> m29981a(Map<String, ?> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (String next : map.keySet()) {
            if (next.startsWith(str)) {
                arrayList.add(next.replace(str, ""));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m29982a(C12019z8 z8Var, String str) {
        C10398J9 j9 = new C10398J9(z8Var, str);
        C11912we weVar = new C11912we(this.f27848a, str);
        String h = weVar.mo64039h((String) null);
        if (!TextUtils.isEmpty(h)) {
            j9.mo61619n(h);
        }
        String c = weVar.mo64033c((String) null);
        if (!TextUtils.isEmpty(c)) {
            j9.mo61614i(c);
        }
        String d = weVar.mo64034d((String) null);
        if (!TextUtils.isEmpty(d)) {
            j9.mo61615j(d);
        }
        String f = weVar.mo64036f((String) null);
        if (!TextUtils.isEmpty(f)) {
            j9.mo61617l(f);
        }
        String e = weVar.mo64035e((String) null);
        if (!TextUtils.isEmpty(e)) {
            j9.mo61616k(e);
        }
        long a = weVar.mo64031a(-1);
        if (a != -1) {
            j9.mo61607b(a);
        }
        String g = weVar.mo64038g((String) null);
        if (!TextUtils.isEmpty(g)) {
            j9.mo61618m(g);
        }
        j9.mo61454c();
        weVar.mo64037f();
    }
}
