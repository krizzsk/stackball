package com.applovin.impl.sdk.p026c;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1371e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.c.h */
public class C1388h {

    /* renamed from: a */
    private final C1469j f3270a;

    /* renamed from: b */
    private final Map<String, Long> f3271b = new HashMap();

    public C1388h(C1469j jVar) {
        if (jVar != null) {
            this.f3270a = jVar;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* renamed from: e */
    private void m2756e() {
        try {
            this.f3270a.mo13095a(C1371e.f3162n, mo12932c().toString());
        } catch (Throwable th) {
            this.f3270a.mo13139v().mo13278b("GlobalStatsManager", "Unable to save stats", th);
        }
    }

    /* renamed from: a */
    public long mo12926a(C1387g gVar) {
        return mo12927a(gVar, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo12927a(C1387g gVar, long j) {
        long longValue;
        synchronized (this.f3271b) {
            Long l = this.f3271b.get(gVar.mo12925a());
            if (l == null) {
                l = 0L;
            }
            longValue = l.longValue() + j;
            this.f3271b.put(gVar.mo12925a(), Long.valueOf(longValue));
        }
        m2756e();
        return longValue;
    }

    /* renamed from: a */
    public void mo12928a() {
        synchronized (this.f3271b) {
            this.f3271b.clear();
        }
        m2756e();
    }

    /* renamed from: b */
    public long mo12929b(C1387g gVar) {
        long longValue;
        synchronized (this.f3271b) {
            Long l = this.f3271b.get(gVar.mo12925a());
            if (l == null) {
                l = 0L;
            }
            longValue = l.longValue();
        }
        return longValue;
    }

    /* renamed from: b */
    public void mo12930b() {
        synchronized (this.f3271b) {
            for (C1387g a : C1387g.m2754b()) {
                this.f3271b.remove(a.mo12925a());
            }
            m2756e();
        }
    }

    /* renamed from: b */
    public void mo12931b(C1387g gVar, long j) {
        synchronized (this.f3271b) {
            this.f3271b.put(gVar.mo12925a(), Long.valueOf(j));
        }
        m2756e();
    }

    /* renamed from: c */
    public JSONObject mo12932c() throws JSONException {
        JSONObject jSONObject;
        synchronized (this.f3271b) {
            jSONObject = new JSONObject();
            for (Map.Entry next : this.f3271b.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    public void mo12933c(C1387g gVar) {
        synchronized (this.f3271b) {
            this.f3271b.remove(gVar.mo12925a());
        }
        m2756e();
    }

    /* renamed from: d */
    public void mo12934d() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.f3270a.mo13112b(C1371e.f3162n, "{}"));
            synchronized (this.f3271b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.f3271b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f3270a.mo13139v().mo13278b("GlobalStatsManager", "Unable to load stats", th);
        }
    }
}
