package com.yandex.metrica.impl.p265ob;

import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Lk */
public class C10468Lk {

    /* renamed from: a */
    private final LinkedList<JSONObject> f25130a;

    /* renamed from: b */
    private final C10248F9 f25131b;

    /* renamed from: c */
    private final LinkedList<String> f25132c;

    /* renamed from: d */
    private final C11323hl f25133d;

    /* renamed from: e */
    private int f25134e;

    C10468Lk(int i, C10248F9 f9) {
        this(i, f9, new C10318Gk());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo61740a(JSONObject jSONObject) {
        if (this.f25130a.size() == this.f25134e) {
            JSONObject removeLast = this.f25130a.removeLast();
            this.f25132c.removeLast();
        }
        String jSONObject2 = jSONObject.toString();
        this.f25130a.addFirst(jSONObject);
        this.f25132c.addFirst(jSONObject2);
        if (!this.f25132c.isEmpty()) {
            this.f25131b.mo61267a((List<String>) this.f25132c);
        }
    }

    /* renamed from: b */
    public List<JSONObject> mo61741b() {
        return this.f25130a;
    }

    C10468Lk(int i, C10248F9 f9, C11323hl hlVar) {
        this.f25130a = new LinkedList<>();
        this.f25132c = new LinkedList<>();
        this.f25134e = i;
        this.f25131b = f9;
        this.f25133d = hlVar;
        m26847a(f9);
    }

    /* renamed from: a */
    private void m26847a(C10248F9 f9) {
        List<String> g = f9.mo61290g();
        for (int max = Math.max(0, g.size() - this.f25134e); max < g.size(); max++) {
            String str = g.get(max);
            try {
                this.f25130a.addLast(new JSONObject(str));
                this.f25132c.addLast(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo61739a() {
        return this.f25133d.mo61402a(new JSONArray(this.f25130a));
    }
}
