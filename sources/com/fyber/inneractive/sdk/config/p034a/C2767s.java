package com.fyber.inneractive.sdk.config.p034a;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2741a;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2742b;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2743c;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2744d;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2745e;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2746f;
import com.fyber.inneractive.sdk.p037d.C2826c;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.a.s */
public final class C2767s {

    /* renamed from: d */
    private static String f6509d = "SupportedFeaturesProvider";

    /* renamed from: a */
    String f6510a = "";

    /* renamed from: b */
    Map<Class, C2744d> f6511b;

    /* renamed from: c */
    JSONArray f6512c;

    /* renamed from: e */
    private final C2766r f6513e = new C2766r();

    private C2767s() {
        HashMap hashMap = new HashMap();
        hashMap.put(C2746f.class, new C2746f());
        hashMap.put(C2741a.class, new C2741a());
        hashMap.put(C2742b.class, new C2742b());
        hashMap.put(C2743c.class, new C2743c());
        hashMap.put(C2745e.class, new C2745e());
        this.f6511b = hashMap;
        this.f6512c = null;
        Map<Class, C2744d> d = m6035d();
        this.f6511b = d;
        IAlog.m9034b("%s: created. Supported features: %s", f6509d, d);
    }

    /* renamed from: d */
    private Map<Class, C2744d> m6035d() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f6511b.entrySet()) {
            hashMap.put(next.getKey(), ((C2744d) next.getValue()).mo17979c());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static C2767s m6033a() {
        return new C2767s();
    }

    /* renamed from: a */
    public final void mo18011a(C2753e eVar) {
        for (C2744d next : this.f6511b.values()) {
            List<C2750b> list = next.f6470b;
            for (int size = list.size() - 1; size >= 0; size--) {
                C2750b bVar = list.get(size);
                List<C2752d> list2 = bVar.f6487d;
                if (list2 != null) {
                    Iterator<C2752d> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C2752d next2 = it.next();
                        if (next2.mo17992a(eVar)) {
                            next.f6470b.remove(bVar);
                            next.f6471d.remove(bVar.f6484a);
                            IAlog.m9034b("%s: Experiment %s filtered! after response %s", f6509d, bVar.f6484a, next2);
                            break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final <T extends C2744d> T mo18010a(Class<T> cls) {
        if (this.f6511b.containsKey(cls)) {
            return (C2744d) this.f6511b.get(cls);
        }
        return null;
    }

    /* renamed from: b */
    public final JSONArray mo18013b() {
        if (this.f6512c == null) {
            JSONArray a = C2755g.m5988a(this.f6511b, false);
            this.f6512c = a;
            IAlog.m9034b("%s: active experiments json set = %s", f6509d, a);
        }
        return this.f6512c;
    }

    /* renamed from: c */
    public final JSONArray mo18014c() {
        JSONArray a = C2755g.m5988a(this.f6511b, true);
        IAlog.m9034b("%s: active experiments json set = %s", f6509d, a);
        return a;
    }

    /* renamed from: a */
    public final void mo18012a(String str) {
        this.f6510a = str;
        IAConfigManager.m5933e().mo17978a(this);
    }

    /* renamed from: a */
    public static JSONArray m6034a(C2826c cVar, C2836g<?> gVar) {
        if (cVar != null && cVar.f6711e != null) {
            return cVar.f6711e.mo18013b();
        }
        if (gVar == null || gVar.mo18132i() == null) {
            return null;
        }
        return gVar.mo18132i().mo18013b();
    }
}
