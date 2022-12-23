package com.applovin.impl.sdk.p026c;

import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.p027d.C1449y;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.c.c */
public class C1376c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1469j f3215a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1505q f3216b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f3217c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1381c f3218d = new C1381c();

    /* renamed from: com.applovin.impl.sdk.c.c$a */
    private static class C1379a {

        /* renamed from: a */
        private final C1469j f3221a;

        /* renamed from: b */
        private final JSONObject f3222b;

        private C1379a(String str, String str2, String str3, C1469j jVar) {
            JSONObject jSONObject = new JSONObject();
            this.f3222b = jSONObject;
            this.f3221a = jVar;
            C1521i.m3477a(jSONObject, "pk", str, jVar);
            C1521i.m3493b(this.f3222b, "ts", System.currentTimeMillis(), jVar);
            if (C1553o.m3554b(str2)) {
                C1521i.m3477a(this.f3222b, "sk1", str2, jVar);
            }
            if (C1553o.m3554b(str3)) {
                C1521i.m3477a(this.f3222b, "sk2", str3, jVar);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m2711a() throws OutOfMemoryError {
            return this.f3222b.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12889a(String str, long j) {
            mo12891b(str, C1521i.m3461a(this.f3222b, str, 0, this.f3221a) + j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12890a(String str, String str2) {
            JSONArray b = C1521i.m3491b(this.f3222b, str, new JSONArray(), this.f3221a);
            b.put(str2);
            C1521i.m3478a(this.f3222b, str, b, this.f3221a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo12891b(String str, long j) {
            C1521i.m3493b(this.f3222b, str, j, this.f3221a);
        }

        public String toString() {
            return "AdEventStats{stats='" + this.f3222b + '\'' + '}';
        }
    }

    /* renamed from: com.applovin.impl.sdk.c.c$b */
    public class C1380b {

        /* renamed from: b */
        private final AppLovinAdBase f3224b;

        /* renamed from: c */
        private final C1376c f3225c;

        public C1380b(AppLovinAdBase appLovinAdBase, C1376c cVar) {
            this.f3224b = appLovinAdBase;
            this.f3225c = cVar;
        }

        /* renamed from: a */
        public C1380b mo12893a(C1375b bVar) {
            this.f3225c.m2691a(bVar, 1, this.f3224b);
            return this;
        }

        /* renamed from: a */
        public C1380b mo12894a(C1375b bVar, long j) {
            this.f3225c.m2698b(bVar, j, this.f3224b);
            return this;
        }

        /* renamed from: a */
        public C1380b mo12895a(C1375b bVar, String str) {
            this.f3225c.m2692a(bVar, str, this.f3224b);
            return this;
        }

        /* renamed from: a */
        public void mo12896a() {
            this.f3225c.m2704e();
        }
    }

    /* renamed from: com.applovin.impl.sdk.c.c$c */
    private class C1381c extends LinkedHashMap<String, C1379a> {
        private C1381c() {
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry<String, C1379a> entry) {
            return size() > ((Integer) C1376c.this.f3215a.mo13088a(C1369c.f3118ez)).intValue();
        }
    }

    public C1376c(C1469j jVar) {
        if (jVar != null) {
            this.f3215a = jVar;
            this.f3216b = jVar.mo13139v();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2691a(C1375b bVar, long j, AppLovinAdBase appLovinAdBase) {
        if (appLovinAdBase == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (bVar == null) {
            throw new IllegalArgumentException("No key specified");
        } else if (((Boolean) this.f3215a.mo13088a(C1369c.f3115ew)).booleanValue()) {
            synchronized (this.f3217c) {
                m2696b(appLovinAdBase).mo12889a(((Boolean) this.f3215a.mo13088a(C1369c.f3067eA)).booleanValue() ? bVar.mo12884b() : bVar.mo12883a(), j);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2692a(C1375b bVar, String str, AppLovinAdBase appLovinAdBase) {
        if (appLovinAdBase == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (bVar == null) {
            throw new IllegalArgumentException("No key specified");
        } else if (((Boolean) this.f3215a.mo13088a(C1369c.f3115ew)).booleanValue()) {
            synchronized (this.f3218d) {
                m2696b(appLovinAdBase).mo12890a(((Boolean) this.f3215a.mo13088a(C1369c.f3067eA)).booleanValue() ? bVar.mo12884b() : bVar.mo12883a(), str);
            }
        }
    }

    /* renamed from: a */
    private void m2695a(JSONObject jSONObject) {
        C13771 r0 = new C1449y<Object>(C1488b.m3193a(this.f3215a).mo13200a(m2701c()).mo13210c(m2703d()).mo13201a(C1520h.m3451e(this.f3215a)).mo13206b("POST").mo13202a(jSONObject).mo13205b(((Integer) this.f3215a.mo13088a(C1369c.f3116ex)).intValue()).mo13198a(((Integer) this.f3215a.mo13088a(C1369c.f3117ey)).intValue()).mo13204a(), this.f3215a) {
            /* renamed from: a */
            public void mo12144a(int i) {
                C1505q a = C1376c.this.f3216b;
                a.mo13281e("AdEventStatsManager", "Failed to submitted ad stats: " + i);
            }

            /* renamed from: a */
            public void mo12145a(Object obj, int i) {
                C1505q a = C1376c.this.f3216b;
                a.mo13277b("AdEventStatsManager", "Ad stats submitted: " + i);
            }
        };
        r0.mo13035a(C1369c.f2870aM);
        r0.mo13037b(C1369c.f2871aN);
        this.f3215a.mo13071K().mo13014a((C1392a) r0, C1435s.C1437a.BACKGROUND);
    }

    /* renamed from: b */
    private C1379a m2696b(AppLovinAdBase appLovinAdBase) {
        C1379a aVar;
        synchronized (this.f3217c) {
            String primaryKey = appLovinAdBase.getPrimaryKey();
            aVar = (C1379a) this.f3218d.get(primaryKey);
            if (aVar == null) {
                C1379a aVar2 = new C1379a(primaryKey, appLovinAdBase.getSecondaryKey1(), appLovinAdBase.getSecondaryKey2(), this.f3215a);
                this.f3218d.put(primaryKey, aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2698b(C1375b bVar, long j, AppLovinAdBase appLovinAdBase) {
        if (appLovinAdBase == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (bVar == null) {
            throw new IllegalArgumentException("No key specified");
        } else if (((Boolean) this.f3215a.mo13088a(C1369c.f3115ew)).booleanValue()) {
            synchronized (this.f3217c) {
                m2696b(appLovinAdBase).mo12891b(((Boolean) this.f3215a.mo13088a(C1369c.f3067eA)).booleanValue() ? bVar.mo12884b() : bVar.mo12883a(), j);
            }
        }
    }

    /* renamed from: c */
    private String m2701c() {
        return C1520h.m3438a("2.0/s", this.f3215a);
    }

    /* renamed from: d */
    private String m2703d() {
        return C1520h.m3448b("2.0/s", this.f3215a);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m2704e() {
        if (((Boolean) this.f3215a.mo13088a(C1369c.f3115ew)).booleanValue()) {
            this.f3215a.mo13071K().mo13018b().execute(new Runnable() {
                public void run() {
                    HashSet hashSet;
                    synchronized (C1376c.this.f3217c) {
                        hashSet = new HashSet(C1376c.this.f3218d.size());
                        for (C1379a aVar : C1376c.this.f3218d.values()) {
                            try {
                                hashSet.add(aVar.m2711a());
                            } catch (OutOfMemoryError e) {
                                C1505q a = C1376c.this.f3216b;
                                a.mo13278b("AdEventStatsManager", "Failed to serialize " + aVar + " due to OOM error", e);
                                C1376c.this.mo12887b();
                            }
                        }
                    }
                    C1376c.this.f3215a.mo13095a(C1371e.f3169u, hashSet);
                }
            });
        }
    }

    /* renamed from: a */
    public C1380b mo12885a(AppLovinAdBase appLovinAdBase) {
        return new C1380b(appLovinAdBase, this);
    }

    /* renamed from: a */
    public void mo12886a() {
        if (((Boolean) this.f3215a.mo13088a(C1369c.f3115ew)).booleanValue()) {
            Set<String> set = (Set) this.f3215a.mo13112b(C1371e.f3169u, new HashSet(0));
            this.f3215a.mo13116b(C1371e.f3169u);
            if (set == null || set.isEmpty()) {
                this.f3216b.mo13277b("AdEventStatsManager", "No serialized ad events found");
                return;
            }
            C1505q qVar = this.f3216b;
            qVar.mo13277b("AdEventStatsManager", "De-serializing " + set.size() + " stat ad events");
            JSONArray jSONArray = new JSONArray();
            for (String str : set) {
                try {
                    jSONArray.put(new JSONObject(str));
                } catch (JSONException e) {
                    C1505q qVar2 = this.f3216b;
                    qVar2.mo13278b("AdEventStatsManager", "Failed to parse: " + str, e);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stats", jSONArray);
                m2695a(jSONObject);
            } catch (JSONException e2) {
                this.f3216b.mo13278b("AdEventStatsManager", "Failed to create stats to submit", e2);
            }
        }
    }

    /* renamed from: b */
    public void mo12887b() {
        synchronized (this.f3217c) {
            this.f3216b.mo13277b("AdEventStatsManager", "Clearing ad stats...");
            this.f3218d.clear();
        }
    }
}
