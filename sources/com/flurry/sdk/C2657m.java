package com.flurry.sdk;

import android.util.SparseArray;
import com.flurry.sdk.C2473c;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.m */
public class C2657m {

    /* renamed from: a */
    static final String f6246a = C2657m.class.getSimpleName();

    /* renamed from: b */
    Map<C2653j, SparseArray<C2656l>> f6247b;

    /* renamed from: c */
    Map<C2653j, Map<String, C2473c>> f6248c;

    /* renamed from: d */
    long f6249d;

    /* renamed from: e */
    private Map<C2653j, Map<String, C2473c>> f6250e;

    public C2657m() {
        mo17854a();
    }

    /* renamed from: a */
    public final synchronized void mo17856a(List<C2656l> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                m5766a(list, this.f6247b);
                m5771c(list);
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo17859b(List<C2656l> list) {
        if (list == null) {
            return false;
        }
        if (list.size() != mo17862e()) {
            return true;
        }
        for (C2656l next : list) {
            SparseArray sparseArray = this.f6247b.get(next.f6241a);
            if (sparseArray == null) {
                return true;
            }
            C2656l lVar = (C2656l) sparseArray.get(next.f6242b);
            if (lVar == null) {
                return true;
            }
            if (next.f6243c != lVar.f6243c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean mo17857a(List<C2656l> list, boolean z) {
        if (list == null) {
            return true;
        }
        if (list.isEmpty()) {
            m5772f();
            return true;
        } else if (z) {
            m5772f();
            m5766a(list, this.f6247b);
            m5770b(list, this.f6248c);
            return true;
        } else {
            HashMap hashMap = new HashMap();
            m5769a(this.f6247b, (Map<C2653j, SparseArray<C2656l>>) hashMap, true, true);
            HashMap hashMap2 = new HashMap();
            m5768a(this.f6248c, (Map<C2653j, Map<String, C2473c>>) hashMap2, (C2653j) null, true);
            m5767a(list, (Map<C2653j, SparseArray<C2656l>>) hashMap, (Map<C2653j, Map<String, C2473c>>) hashMap2);
            m5766a(list, (Map<C2653j, SparseArray<C2656l>>) hashMap);
            m5770b(list, hashMap2);
            C2530db.m5476a(f6246a, "Verify ETag merged JSON: ".concat(String.valueOf(mo17853a((Map<C2653j, SparseArray<C2656l>>) hashMap, (Map<C2653j, Map<String, C2473c>>) hashMap2, true))));
            m5769a((Map<C2653j, SparseArray<C2656l>>) hashMap, this.f6247b, false, false);
            m5768a((Map<C2653j, Map<String, C2473c>>) hashMap2, this.f6248c, (C2653j) null, false);
            return true;
        }
    }

    /* renamed from: a */
    private static void m5769a(Map<C2653j, SparseArray<C2656l>> map, Map<C2653j, SparseArray<C2656l>> map2, boolean z, boolean z2) {
        SparseArray sparseArray;
        for (Map.Entry next : map.entrySet()) {
            C2653j jVar = (C2653j) next.getKey();
            if (z) {
                SparseArray sparseArray2 = (SparseArray) next.getValue();
                sparseArray = new SparseArray(sparseArray2.size());
                for (int i = 0; i < sparseArray2.size(); i++) {
                    C2656l lVar = (C2656l) sparseArray2.valueAt(i);
                    int i2 = lVar.f6242b;
                    if (z2) {
                        lVar = new C2656l(lVar);
                    }
                    sparseArray.put(i2, lVar);
                }
            } else {
                sparseArray = (SparseArray) next.getValue();
            }
            map2.put(jVar, sparseArray);
        }
    }

    /* renamed from: a */
    private synchronized void m5767a(List<C2656l> list, Map<C2653j, SparseArray<C2656l>> map, Map<C2653j, Map<String, C2473c>> map2) {
        HashMap hashMap = new HashMap();
        m5769a(map, (Map<C2653j, SparseArray<C2656l>>) hashMap, true, false);
        for (C2656l next : list) {
            SparseArray sparseArray = (SparseArray) hashMap.get(next.f6241a);
            if (sparseArray != null) {
                sparseArray.remove(next.f6242b);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C2653j jVar = (C2653j) entry.getKey();
            SparseArray sparseArray2 = (SparseArray) entry.getValue();
            SparseArray sparseArray3 = map.get(jVar);
            Map map3 = map2.get(jVar);
            for (int i = 0; i < sparseArray2.size(); i++) {
                C2656l lVar = (C2656l) sparseArray2.valueAt(i);
                sparseArray3.remove(lVar.f6242b);
                for (String remove : lVar.f6245e.keySet()) {
                    map3.remove(remove);
                }
            }
        }
    }

    /* renamed from: a */
    private synchronized void m5766a(List<C2656l> list, Map<C2653j, SparseArray<C2656l>> map) {
        for (C2656l next : list) {
            int i = next.f6242b;
            C2653j jVar = next.f6241a;
            SparseArray sparseArray = map.get(jVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                map.put(jVar, sparseArray);
            } else {
                C2656l lVar = (C2656l) sparseArray.get(i);
                if (lVar != null) {
                    next.mo17847a(lVar);
                }
            }
            sparseArray.put(i, next);
        }
    }

    /* renamed from: a */
    private static void m5768a(Map<C2653j, Map<String, C2473c>> map, Map<C2653j, Map<String, C2473c>> map2, C2653j jVar, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            C2653j jVar2 = (C2653j) next.getKey();
            if (jVar == null || jVar == jVar2) {
                Map map3 = (Map) next.getValue();
                if (z) {
                    map3 = new HashMap(map3);
                }
                map2.put(jVar2, map3);
            }
        }
    }

    /* renamed from: c */
    private synchronized void m5771c(List<C2656l> list) {
        for (C2656l next : list) {
            C2653j jVar = next.f6241a;
            Map map = this.f6250e.get(jVar);
            if (map == null) {
                map = new HashMap();
                this.f6250e.put(jVar, map);
            }
            Map map2 = this.f6248c.get(jVar);
            if (map2 == null) {
                map2 = new HashMap();
                this.f6248c.put(jVar, map2);
            }
            for (Map.Entry next2 : next.mo17846a()) {
                String str = (String) next2.getKey();
                C2473c cVar = (C2473c) next2.getValue();
                map.put(str, cVar);
                map2.put(str, cVar);
            }
        }
    }

    /* renamed from: b */
    private synchronized void m5770b(List<C2656l> list, Map<C2653j, Map<String, C2473c>> map) {
        for (C2656l next : list) {
            C2653j jVar = next.f6241a;
            Map map2 = map.get(jVar);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(jVar, map2);
            }
            for (Map.Entry next2 : next.mo17846a()) {
                String str = (String) next2.getKey();
                C2473c cVar = (C2473c) next2.getValue();
                if (cVar.f5778a == C2473c.C2474a.Tombstone) {
                    map2.remove(str);
                } else {
                    map2.put(str, cVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo17855a(C2653j jVar) {
        String str = f6246a;
        C2530db.m5474a(3, str, "original Variants properties:" + this.f6250e.keySet().toString() + " with: " + this.f6247b.values().toString());
        m5768a(this.f6248c, this.f6250e, jVar, true);
        String str2 = f6246a;
        C2530db.m5474a(3, str2, "new Variants properties:" + this.f6250e.keySet().toString());
    }

    /* renamed from: a */
    public final C2473c mo17852a(String str, C2653j jVar) {
        if (jVar == null) {
            for (Map<String, C2473c> map : this.f6250e.values()) {
                C2473c cVar = (C2473c) map.get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        Map map2 = this.f6250e.get(jVar);
        if (map2 != null) {
            return (C2473c) map2.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo17854a() {
        m5772f();
        this.f6250e = new HashMap();
        for (C2653j put : C2653j.m5758a()) {
            this.f6250e.put(put, new HashMap());
        }
    }

    /* renamed from: f */
    private synchronized void m5772f() {
        this.f6247b = new HashMap();
        this.f6248c = new HashMap();
        for (C2653j next : C2653j.m5758a()) {
            this.f6247b.put(next, new SparseArray());
            this.f6248c.put(next, new HashMap());
        }
    }

    /* renamed from: b */
    public final synchronized List<C2656l> mo17858b() {
        return m5765a(this.f6247b);
    }

    /* renamed from: a */
    private synchronized List<C2656l> m5765a(Map<C2653j, SparseArray<C2656l>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (SparseArray next : map.values()) {
            for (int i = 0; i < next.size(); i++) {
                arrayList.add(next.valueAt(i));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized String mo17860c() {
        StringBuilder sb;
        sb = new StringBuilder();
        int i = 0;
        for (SparseArray next : this.f6247b.values()) {
            i += next.size();
            for (int i2 = 0; i2 < next.size(); i2++) {
                C2656l lVar = (C2656l) next.valueAt(i2);
                sb.append("," + lVar.f6242b);
                sb.append("," + lVar.f6243c);
            }
        }
        sb.insert(0, i);
        return sb.toString();
    }

    /* renamed from: d */
    public final synchronized List<C2653j> mo17861d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.f6247b.entrySet()) {
            if (((SparseArray) next.getValue()).size() > 0) {
                arrayList.add(next.getKey());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final synchronized int mo17862e() {
        int i;
        i = 0;
        for (SparseArray<C2656l> size : this.f6247b.values()) {
            i += size.size();
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo17853a(Map<C2653j, SparseArray<C2656l>> map, Map<C2653j, Map<String, C2473c>> map2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            List<C2656l> a = m5765a(map);
            if (z) {
                Collections.sort(a);
            }
            for (C2656l next : a) {
                Map map3 = map2.get(next.f6241a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", next.f6242b);
                jSONObject2.put("version", next.f6243c);
                jSONObject2.put("document", next.f6241a.toString());
                JSONArray jSONArray2 = new JSONArray();
                for (Map.Entry<String, C2473c> key : z ? new TreeMap(next.f6245e).entrySet() : next.mo17846a()) {
                    String str = (String) key.getKey();
                    C2473c cVar = (C2473c) map3.get(str);
                    if (cVar != null) {
                        jSONArray2.put(cVar.mo17665a(str));
                    }
                }
                jSONObject2.put(FirebaseAnalytics.Param.ITEMS, jSONArray2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("variants", jSONArray);
            jSONObject.put("refreshInSeconds", this.f6249d);
            return jSONObject;
        } catch (JSONException e) {
            C2530db.m5477a(f6246a, "Error to create JSON object.", (Throwable) e);
            return null;
        }
    }
}
