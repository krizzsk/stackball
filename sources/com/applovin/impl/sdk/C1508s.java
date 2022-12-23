package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p024ad.C1361h;
import com.applovin.impl.sdk.p024ad.C1363j;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.s */
abstract class C1508s implements C1483n, AppLovinNativeAdLoadListener {

    /* renamed from: a */
    protected final C1469j f3682a;

    /* renamed from: b */
    protected final C1505q f3683b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f3684c = new Object();

    /* renamed from: d */
    private final Map<C1349d, C1510t> f3685d = new HashMap();

    /* renamed from: e */
    private final Map<C1349d, C1510t> f3686e = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map<C1349d, Object> f3687f = new HashMap();

    /* renamed from: g */
    private final Set<C1349d> f3688g = new HashSet();

    C1508s(C1469j jVar) {
        this.f3682a = jVar;
        this.f3683b = jVar.mo13139v();
    }

    /* renamed from: b */
    private void m3375b(final C1349d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        synchronized (this.f3684c) {
            if (this.f3687f.containsKey(dVar)) {
                this.f3683b.mo13280d("PreloadManager", "Possibly missing prior registered preload callback.");
            }
            this.f3687f.put(dVar, appLovinAdLoadListener);
        }
        final int intValue = ((Integer) this.f3682a.mo13088a(C1369c.f2937ba)).intValue();
        if (intValue > 0) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    synchronized (C1508s.this.f3684c) {
                        Object obj = C1508s.this.f3687f.get(dVar);
                        if (obj != null) {
                            C1508s.this.f3687f.remove(dVar);
                            C1505q qVar = C1508s.this.f3683b;
                            qVar.mo13281e("PreloadManager", "Load callback for zone " + dVar + " timed out after " + intValue + " seconds");
                            C1508s.this.mo12866a(obj, dVar, AppLovinErrorCodes.FETCH_AD_TIMEOUT);
                        }
                    }
                }
            }, TimeUnit.SECONDS.toMillis((long) intValue));
        }
    }

    /* renamed from: j */
    private C1510t m3376j(C1349d dVar) {
        C1510t tVar;
        synchronized (this.f3684c) {
            tVar = this.f3685d.get(dVar);
            if (tVar == null) {
                tVar = new C1510t(dVar.mo12719f());
                this.f3685d.put(dVar, tVar);
            }
        }
        return tVar;
    }

    /* renamed from: k */
    private C1510t m3377k(C1349d dVar) {
        C1510t tVar;
        synchronized (this.f3684c) {
            tVar = this.f3686e.get(dVar);
            if (tVar == null) {
                tVar = new C1510t(dVar.mo12720g());
                this.f3686e.put(dVar, tVar);
            }
        }
        return tVar;
    }

    /* renamed from: l */
    private boolean m3378l(C1349d dVar) {
        boolean z;
        synchronized (this.f3684c) {
            C1510t j = m3376j(dVar);
            z = j != null && j.mo13290c();
        }
        return z;
    }

    /* renamed from: m */
    private C1510t m3379m(C1349d dVar) {
        synchronized (this.f3684c) {
            C1510t k = m3377k(dVar);
            if (k != null && k.mo13286a() > 0) {
                return k;
            }
            C1510t j = m3376j(dVar);
            return j;
        }
    }

    /* renamed from: n */
    private boolean m3380n(C1349d dVar) {
        boolean contains;
        synchronized (this.f3684c) {
            contains = this.f3688g.contains(dVar);
        }
        return contains;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C1349d mo12862a(C1363j jVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C1392a mo12863a(C1349d dVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo12866a(Object obj, C1349d dVar, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo12867a(Object obj, C1363j jVar);

    /* renamed from: a */
    public void mo12868a(LinkedHashSet<C1349d> linkedHashSet) {
        Map<C1349d, Object> map = this.f3687f;
        if (map != null && !map.isEmpty()) {
            synchronized (this.f3684c) {
                Iterator<C1349d> it = this.f3687f.keySet().iterator();
                while (it.hasNext()) {
                    C1349d next = it.next();
                    if (!next.mo12724j() && !linkedHashSet.contains(next)) {
                        Object obj = this.f3687f.get(next);
                        it.remove();
                        C1505q.m3345i("AppLovinAdService", "Failed to load ad for zone (" + next.mo12712a() + "). Please check that the zone has been added to your AppLovin account and given at least 30 minutes to fully propagate.");
                        mo12866a(obj, next, -7);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo12869a(C1349d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        boolean z;
        synchronized (this.f3684c) {
            if (!m3380n(dVar)) {
                m3375b(dVar, appLovinAdLoadListener);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo12870b(C1349d dVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            mo12878i(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13283b(C1363j jVar) {
        Object obj;
        C1349d a = mo12862a(jVar);
        synchronized (this.f3684c) {
            obj = this.f3687f.get(a);
            this.f3687f.remove(a);
            this.f3688g.add(a);
            m3376j(a).mo13288a(jVar);
            C1505q qVar = this.f3683b;
            qVar.mo13277b("PreloadManager", "Ad enqueued: " + jVar);
        }
        if (obj != null) {
            C1505q qVar2 = this.f3683b;
            qVar2.mo13277b("PreloadManager", "Called additional callback regarding " + jVar);
            mo12867a(obj, (C1363j) new C1361h(a, this.f3682a));
        }
        C1505q qVar3 = this.f3683b;
        qVar3.mo13277b("PreloadManager", "Pulled ad from network and saved to preload cache: " + jVar);
    }

    /* renamed from: b */
    public boolean mo12871b(C1349d dVar) {
        return this.f3687f.containsKey(dVar);
    }

    /* renamed from: c */
    public C1363j mo12872c(C1349d dVar) {
        C1363j f;
        synchronized (this.f3684c) {
            C1510t m = m3379m(dVar);
            f = m != null ? m.mo13293f() : null;
        }
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo13284c(C1349d dVar, int i) {
        Object remove;
        C1505q qVar = this.f3683b;
        qVar.mo13277b("PreloadManager", "Failed to pre-load an ad of zone " + dVar + ", error code " + i);
        synchronized (this.f3684c) {
            remove = this.f3687f.remove(dVar);
            this.f3688g.add(dVar);
        }
        if (remove != null) {
            try {
                mo12866a(remove, dVar, i);
            } catch (Throwable th) {
                C1505q.m3341c("PreloadManager", "Encountered exception while invoking user callback", th);
            }
        }
    }

    /* renamed from: d */
    public C1363j mo12873d(C1349d dVar) {
        C1363j e;
        synchronized (this.f3684c) {
            C1510t m = m3379m(dVar);
            e = m != null ? m.mo13292e() : null;
        }
        return e;
    }

    /* renamed from: e */
    public C1363j mo12874e(C1349d dVar) {
        C1361h hVar;
        StringBuilder sb;
        String str;
        C1361h hVar2;
        synchronized (this.f3684c) {
            C1510t j = m3376j(dVar);
            hVar = null;
            if (j != null) {
                C1510t k = m3377k(dVar);
                if (k.mo13290c()) {
                    hVar2 = new C1361h(dVar, this.f3682a);
                } else if (j.mo13286a() > 0) {
                    k.mo13288a(j.mo13292e());
                    hVar2 = new C1361h(dVar, this.f3682a);
                }
                hVar = hVar2;
            }
        }
        C1505q qVar = this.f3683b;
        if (hVar != null) {
            str = "Retrieved ad of zone ";
        } else {
            sb = new StringBuilder();
            str = "Unable to retrieve ad of zone ";
        }
        sb.append(str);
        sb.append(dVar);
        sb.append("...");
        qVar.mo13277b("PreloadManager", sb.toString());
        return hVar;
    }

    /* renamed from: f */
    public void mo12875f(C1349d dVar) {
        if (dVar != null) {
            int i = 0;
            synchronized (this.f3684c) {
                C1510t j = m3376j(dVar);
                if (j != null) {
                    i = j.mo13289b() - j.mo13286a();
                }
            }
            mo12870b(dVar, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        return r2;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12876g(com.applovin.impl.sdk.p024ad.C1349d r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3684c
            monitor-enter(r0)
            com.applovin.impl.sdk.t r1 = r3.m3377k(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            if (r1 == 0) goto L_0x0012
            int r1 = r1.mo13286a()     // Catch:{ all -> 0x0022 }
            if (r1 <= 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r2
        L_0x0012:
            com.applovin.impl.sdk.t r4 = r3.m3376j(r4)     // Catch:{ all -> 0x0022 }
            if (r4 == 0) goto L_0x001f
            boolean r4 = r4.mo13291d()     // Catch:{ all -> 0x0022 }
            if (r4 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r2
        L_0x0022:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1508s.mo12876g(com.applovin.impl.sdk.ad.d):boolean");
    }

    /* renamed from: h */
    public void mo12877h(C1349d dVar) {
        synchronized (this.f3684c) {
            C1510t j = m3376j(dVar);
            if (j != null) {
                j.mo13287a(dVar.mo12719f());
            } else {
                this.f3685d.put(dVar, new C1510t(dVar.mo12719f()));
            }
            C1510t k = m3377k(dVar);
            if (k != null) {
                k.mo13287a(dVar.mo12720g());
            } else {
                this.f3686e.put(dVar, new C1510t(dVar.mo12720g()));
            }
        }
    }

    /* renamed from: i */
    public void mo12878i(C1349d dVar) {
        if (((Boolean) this.f3682a.mo13088a(C1369c.f2938bb)).booleanValue() && !m3378l(dVar)) {
            C1505q qVar = this.f3683b;
            qVar.mo13277b("PreloadManager", "Preloading ad for zone " + dVar + "...");
            this.f3682a.mo13071K().mo13015a(mo12863a(dVar), C1435s.C1437a.MAIN, 500);
        }
    }
}
