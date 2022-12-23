package com.applovin.impl.sdk.p024ad;

import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.e */
public class C1350e {

    /* renamed from: a */
    private final C1469j f2732a;

    /* renamed from: b */
    private final C1505q f2733b;

    /* renamed from: c */
    private final AtomicBoolean f2734c;

    /* renamed from: d */
    private final Map<MaxAdFormat, C1351f> f2735d;

    /* renamed from: e */
    private LinkedHashSet<C1349d> f2736e;

    /* renamed from: f */
    private final Object f2737f = new Object();

    /* renamed from: g */
    private volatile boolean f2738g;

    public C1350e(C1469j jVar) {
        this.f2732a = jVar;
        this.f2733b = jVar.mo13139v();
        this.f2736e = m2480c();
        this.f2734c = new AtomicBoolean();
        HashMap hashMap = new HashMap(5);
        this.f2735d = hashMap;
        hashMap.put(MaxAdFormat.BANNER, new C1351f(MaxAdFormat.BANNER, jVar));
        this.f2735d.put(MaxAdFormat.LEADER, new C1351f(MaxAdFormat.LEADER, jVar));
        this.f2735d.put(MaxAdFormat.MREC, new C1351f(MaxAdFormat.MREC, jVar));
        this.f2735d.put(MaxAdFormat.INTERSTITIAL, new C1351f(MaxAdFormat.INTERSTITIAL, jVar));
        this.f2735d.put(MaxAdFormat.REWARDED, new C1351f(MaxAdFormat.REWARDED, jVar));
    }

    /* renamed from: b */
    private boolean m2479b() {
        return ((Boolean) this.f2732a.mo13088a(C1369c.f3128fj)).booleanValue() && this.f2734c.get();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: c */
    private java.util.LinkedHashSet<com.applovin.impl.sdk.p024ad.C1349d> m2480c() {
        /*
            r7 = this;
            java.lang.String r0 = "Retrieved persisted zones: "
            java.lang.String r1 = "AdZoneManager"
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            com.applovin.impl.sdk.j r3 = r7.f2732a     // Catch:{ all -> 0x006f }
            com.applovin.impl.sdk.b.e<java.lang.String> r4 = com.applovin.impl.sdk.p025b.C1371e.f3168t     // Catch:{ all -> 0x006f }
            java.lang.Object r3 = r3.mo13089a(r4)     // Catch:{ all -> 0x006f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x006f }
            boolean r4 = com.applovin.impl.sdk.utils.C1553o.m3554b(r3)     // Catch:{ all -> 0x006f }
            if (r4 == 0) goto L_0x003f
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x006f }
            r4.<init>(r3)     // Catch:{ all -> 0x006f }
            int r5 = r4.length()     // Catch:{ all -> 0x006f }
            if (r5 <= 0) goto L_0x0029
            java.util.LinkedHashSet r2 = r7.m2481c(r4)     // Catch:{ all -> 0x006f }
            goto L_0x003f
        L_0x0029:
            com.applovin.impl.sdk.q r4 = r7.f2733b     // Catch:{ all -> 0x006f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r5.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r6 = "Unable to inflate json string: "
            r5.append(r6)     // Catch:{ all -> 0x006f }
            r5.append(r3)     // Catch:{ all -> 0x006f }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x006f }
            r4.mo13281e(r1, r3)     // Catch:{ all -> 0x006f }
        L_0x003f:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x00a7
            com.applovin.impl.sdk.q r3 = r7.f2733b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r3.mo13277b(r1, r0)
            java.util.Iterator r0 = r2.iterator()
        L_0x005d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a7
            java.lang.Object r1 = r0.next()
            com.applovin.impl.sdk.ad.d r1 = (com.applovin.impl.sdk.p024ad.C1349d) r1
            com.applovin.impl.sdk.j r3 = r7.f2732a
            r1.mo12713a(r3)
            goto L_0x005d
        L_0x006f:
            r3 = move-exception
            com.applovin.impl.sdk.q r4 = r7.f2733b     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = "Encountered error retrieving persisted zones"
            r4.mo13278b(r1, r5, r3)     // Catch:{ all -> 0x00a8 }
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x00a7
            com.applovin.impl.sdk.q r3 = r7.f2733b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r3.mo13277b(r1, r0)
            java.util.Iterator r0 = r2.iterator()
        L_0x0095:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a7
            java.lang.Object r1 = r0.next()
            com.applovin.impl.sdk.ad.d r1 = (com.applovin.impl.sdk.p024ad.C1349d) r1
            com.applovin.impl.sdk.j r3 = r7.f2732a
            r1.mo12713a(r3)
            goto L_0x0095
        L_0x00a7:
            return r2
        L_0x00a8:
            r3 = move-exception
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x00d9
            com.applovin.impl.sdk.q r4 = r7.f2733b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r4.mo13277b(r1, r0)
            java.util.Iterator r0 = r2.iterator()
        L_0x00c7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d9
            java.lang.Object r1 = r0.next()
            com.applovin.impl.sdk.ad.d r1 = (com.applovin.impl.sdk.p024ad.C1349d) r1
            com.applovin.impl.sdk.j r2 = r7.f2732a
            r1.mo12713a(r2)
            goto L_0x00c7
        L_0x00d9:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p024ad.C1350e.m2480c():java.util.LinkedHashSet");
    }

    /* renamed from: c */
    private LinkedHashSet<C1349d> m2481c(JSONArray jSONArray) {
        LinkedHashSet<C1349d> linkedHashSet = new LinkedHashSet<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject a = C1521i.m3474a(jSONArray, i, (JSONObject) null, this.f2732a);
            linkedHashSet.add(C1349d.m2455a(C1521i.m3487b(a, "id", (String) null, this.f2732a), a, this.f2732a));
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    private void m2482d(JSONArray jSONArray) {
        if (((Boolean) this.f2732a.mo13088a(C1369c.f3021dG)).booleanValue()) {
            this.f2733b.mo13277b("AdZoneManager", "Persisting zones...");
            this.f2732a.mo13095a(C1371e.f3168t, jSONArray.toString());
        }
    }

    /* renamed from: a */
    public LinkedHashSet<C1349d> mo12726a() {
        LinkedHashSet<C1349d> linkedHashSet;
        synchronized (this.f2737f) {
            linkedHashSet = this.f2736e;
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public void mo12727a(AppLovinAdBase appLovinAdBase, boolean z, boolean z2) {
        if (m2479b()) {
            this.f2735d.get(appLovinAdBase.getAdZone().mo12714b()).mo12734a(appLovinAdBase, z, z2);
        }
    }

    /* renamed from: a */
    public void mo12728a(C1349d dVar, boolean z, int i) {
        if (m2479b()) {
            MaxAdFormat b = dVar.mo12714b();
            if (b != null) {
                this.f2735d.get(b).mo12735a(dVar, z, i);
            } else {
                C1351f.m2492a(dVar, i, this.f2732a);
            }
        }
    }

    /* renamed from: a */
    public void mo12729a(C1355g gVar) {
        if (m2479b()) {
            this.f2735d.get(gVar.getAdZone().mo12714b()).mo12733a();
        }
    }

    /* renamed from: a */
    public void mo12730a(JSONArray jSONArray) {
        if (((Boolean) this.f2732a.mo13088a(C1369c.f3128fj)).booleanValue()) {
            if (this.f2734c.compareAndSet(false, true)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject a = C1521i.m3474a(jSONArray, i, (JSONObject) null, this.f2732a);
                    C1349d a2 = C1349d.m2455a(C1521i.m3487b(a, "id", (String) null, this.f2732a), a, this.f2732a);
                    MaxAdFormat b = a2.mo12714b();
                    if (b == MaxAdFormat.BANNER) {
                        arrayList.add(a2);
                    } else if (b == MaxAdFormat.LEADER) {
                        arrayList2.add(a2);
                    } else if (b == MaxAdFormat.MREC) {
                        arrayList3.add(a2);
                    } else if (b == MaxAdFormat.INTERSTITIAL) {
                        arrayList4.add(a2);
                    } else if (b == MaxAdFormat.REWARDED) {
                        arrayList5.add(a2);
                    }
                }
                this.f2735d.get(MaxAdFormat.BANNER).mo12736a((List<C1349d>) arrayList);
                this.f2735d.get(MaxAdFormat.LEADER).mo12736a((List<C1349d>) arrayList2);
                this.f2735d.get(MaxAdFormat.MREC).mo12736a((List<C1349d>) arrayList3);
                this.f2735d.get(MaxAdFormat.INTERSTITIAL).mo12736a((List<C1349d>) arrayList4);
                this.f2735d.get(MaxAdFormat.REWARDED).mo12736a((List<C1349d>) arrayList5);
            }
        }
    }

    /* renamed from: a */
    public boolean mo12731a(C1349d dVar) {
        boolean contains;
        synchronized (this.f2737f) {
            contains = this.f2736e.contains(dVar);
        }
        return contains;
    }

    /* renamed from: b */
    public LinkedHashSet<C1349d> mo12732b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new LinkedHashSet<>();
        }
        LinkedHashSet<C1349d> linkedHashSet = new LinkedHashSet<>(jSONArray.length());
        LinkedHashSet<C1349d> linkedHashSet2 = null;
        synchronized (this.f2737f) {
            if (!this.f2738g) {
                C1505q qVar = this.f2733b;
                qVar.mo13277b("AdZoneManager", "Found " + jSONArray.length() + " zone(s)...");
                linkedHashSet2 = m2481c(jSONArray);
                linkedHashSet = new LinkedHashSet<>(linkedHashSet2);
                linkedHashSet.removeAll(this.f2736e);
                this.f2736e = linkedHashSet2;
                this.f2738g = true;
            }
        }
        if (linkedHashSet2 != null) {
            m2482d(jSONArray);
        }
        return linkedHashSet;
    }
}
