package com.applovin.impl.sdk.network;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1399ad;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.e */
public class C1493e {

    /* renamed from: a */
    private final C1469j f3634a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1505q f3635b;

    /* renamed from: c */
    private final SharedPreferences f3636c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f3637d = new Object();

    /* renamed from: e */
    private final ArrayList<C1496f> f3638e;

    /* renamed from: f */
    private final ArrayList<C1496f> f3639f = new ArrayList<>();

    /* renamed from: g */
    private final Set<C1496f> f3640g = new HashSet();

    public C1493e(C1469j jVar) {
        if (jVar != null) {
            this.f3634a = jVar;
            this.f3635b = jVar.mo13139v();
            this.f3636c = jVar.mo13065D().getSharedPreferences("com.applovin.sdk.impl.postbackQueue.domain", 0);
            this.f3638e = m3239b();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        r0 = ((java.lang.Integer) r4.f3634a.mo13088a(com.applovin.impl.sdk.p025b.C1369c.f3057dq)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        if (r5.mo13227h() <= r0) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        r6 = r4.f3635b;
        r6.mo13280d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + r0 + ". Dequeuing postback: " + r5);
        m3247d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0092, code lost:
        r1 = r4.f3637d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f3640g.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        if (r5.mo13223e() == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a1, code lost:
        r0 = new org.json.JSONObject(r5.mo13223e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ab, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ac, code lost:
        r4.f3634a.mo13077Q().dispatchPostbackRequest(com.applovin.impl.sdk.network.C1499g.m3280b(r4.f3634a).mo13249d(r5.mo13219a()).mo13252e(r5.mo13220b()).mo13246c(r5.mo13221c()).mo13250d(r5.mo13222d()).mo13244b(r0).mo13247c(r5.mo13225f()).mo13255g(r5.mo13226g()).mo13245b(), new com.applovin.impl.sdk.network.C1493e.C14952(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m3237a(final com.applovin.impl.sdk.network.C1496f r5, final com.applovin.sdk.AppLovinPostbackListener r6) {
        /*
            r4 = this;
            com.applovin.impl.sdk.q r0 = r4.f3635b
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Preparing to submit postback..."
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.mo13277b(r1, r2)
            com.applovin.impl.sdk.j r0 = r4.f3634a
            boolean r0 = r0.mo13119c()
            if (r0 == 0) goto L_0x002a
            com.applovin.impl.sdk.q r5 = r4.f3635b
            java.lang.String r6 = "PersistentPostbackManager"
            java.lang.String r0 = "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards"
            r5.mo13277b(r6, r0)
            return
        L_0x002a:
            java.lang.Object r0 = r4.f3637d
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.network.f> r1 = r4.f3640g     // Catch:{ all -> 0x00fc }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x0053
            com.applovin.impl.sdk.q r6 = r4.f3635b     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r2.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = "Skip pending postback: "
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = r5.mo13219a()     // Catch:{ all -> 0x00fc }
            r2.append(r5)     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x00fc }
            r6.mo13277b(r1, r5)     // Catch:{ all -> 0x00fc }
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            return
        L_0x0053:
            r5.mo13229i()     // Catch:{ all -> 0x00fc }
            r4.m3242c()     // Catch:{ all -> 0x00fc }
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            com.applovin.impl.sdk.j r0 = r4.f3634a
            com.applovin.impl.sdk.b.c<java.lang.Integer> r1 = com.applovin.impl.sdk.p025b.C1369c.f3057dq
            java.lang.Object r0 = r0.mo13088a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = r5.mo13227h()
            if (r1 <= r0) goto L_0x0092
            com.applovin.impl.sdk.q r6 = r4.f3635b
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exceeded maximum persisted attempt count of "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ". Dequeuing postback: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            r6.mo13280d(r1, r0)
            r4.m3247d(r5)
            goto L_0x00f8
        L_0x0092:
            java.lang.Object r1 = r4.f3637d
            monitor-enter(r1)
            java.util.Set<com.applovin.impl.sdk.network.f> r0 = r4.f3640g     // Catch:{ all -> 0x00f9 }
            r0.add(r5)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f9 }
            java.util.Map r0 = r5.mo13223e()
            if (r0 == 0) goto L_0x00ab
            org.json.JSONObject r0 = new org.json.JSONObject
            java.util.Map r1 = r5.mo13223e()
            r0.<init>(r1)
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            com.applovin.impl.sdk.j r1 = r4.f3634a
            com.applovin.impl.sdk.network.g$a r1 = com.applovin.impl.sdk.network.C1499g.m3280b(r1)
            java.lang.String r2 = r5.mo13219a()
            com.applovin.impl.sdk.network.g$a r1 = r1.mo13200a((java.lang.String) r2)
            java.lang.String r2 = r5.mo13220b()
            com.applovin.impl.sdk.network.g$a r1 = r1.mo13210c((java.lang.String) r2)
            java.util.Map r2 = r5.mo13221c()
            com.applovin.impl.sdk.network.g$a r1 = r1.mo13201a((java.util.Map<java.lang.String, java.lang.String>) r2)
            java.util.Map r2 = r5.mo13222d()
            com.applovin.impl.sdk.network.g$a r1 = r1.mo13207b((java.util.Map<java.lang.String, java.lang.String>) r2)
            com.applovin.impl.sdk.network.g$a r0 = r1.mo13202a((org.json.JSONObject) r0)
            boolean r1 = r5.mo13225f()
            com.applovin.impl.sdk.network.g$a r0 = r0.mo13203a((boolean) r1)
            java.lang.String r1 = r5.mo13226g()
            com.applovin.impl.sdk.network.g$a r0 = r0.mo13255g(r1)
            com.applovin.impl.sdk.network.g r0 = r0.mo13204a()
            com.applovin.impl.sdk.j r1 = r4.f3634a
            com.applovin.impl.sdk.network.PostbackServiceImpl r1 = r1.mo13077Q()
            com.applovin.impl.sdk.network.e$2 r2 = new com.applovin.impl.sdk.network.e$2
            r2.<init>(r5, r6)
            r1.dispatchPostbackRequest(r0, r2)
        L_0x00f8:
            return
        L_0x00f9:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f9 }
            throw r5
        L_0x00fc:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fc }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C1493e.m3237a(com.applovin.impl.sdk.network.f, com.applovin.sdk.AppLovinPostbackListener):void");
    }

    /* renamed from: b */
    private ArrayList<C1496f> m3239b() {
        Set<String> set = (Set) this.f3634a.mo13113b(C1371e.f3161m, new LinkedHashSet(0), this.f3636c);
        ArrayList<C1496f> arrayList = new ArrayList<>(Math.max(1, set.size()));
        int intValue = ((Integer) this.f3634a.mo13088a(C1369c.f3057dq)).intValue();
        C1505q qVar = this.f3635b;
        qVar.mo13277b("PersistentPostbackManager", "Deserializing " + set.size() + " postback(s).");
        for (String str : set) {
            try {
                C1496f fVar = new C1496f(new JSONObject(str), this.f3634a);
                if (fVar.mo13227h() < intValue) {
                    arrayList.add(fVar);
                } else {
                    C1505q qVar2 = this.f3635b;
                    qVar2.mo13277b("PersistentPostbackManager", "Skipping deserialization because maximum attempt count exceeded for postback: " + fVar);
                }
            } catch (Throwable th) {
                C1505q qVar3 = this.f3635b;
                qVar3.mo13278b("PersistentPostbackManager", "Unable to deserialize postback request from json: " + str, th);
            }
        }
        C1505q qVar4 = this.f3635b;
        qVar4.mo13277b("PersistentPostbackManager", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3241b(C1496f fVar) {
        synchronized (this.f3637d) {
            this.f3638e.add(fVar);
            m3242c();
            C1505q qVar = this.f3635b;
            qVar.mo13277b("PersistentPostbackManager", "Enqueued postback: " + fVar);
        }
    }

    /* renamed from: c */
    private void m3242c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3638e.size());
        Iterator<C1496f> it = this.f3638e.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(it.next().mo13231k().toString());
            } catch (Throwable th) {
                this.f3635b.mo13278b("PersistentPostbackManager", "Unable to serialize postback request to JSON.", th);
            }
        }
        this.f3634a.mo13096a(C1371e.f3161m, linkedHashSet, this.f3636c);
        this.f3635b.mo13277b("PersistentPostbackManager", "Wrote updated postback queue to disk.");
    }

    /* renamed from: c */
    private void m3245c(C1496f fVar) {
        m3237a(fVar, (AppLovinPostbackListener) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m3246d() {
        synchronized (this.f3637d) {
            Iterator<C1496f> it = this.f3639f.iterator();
            while (it.hasNext()) {
                m3245c(it.next());
            }
            this.f3639f.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m3247d(C1496f fVar) {
        synchronized (this.f3637d) {
            this.f3640g.remove(fVar);
            this.f3638e.remove(fVar);
            m3242c();
        }
        C1505q qVar = this.f3635b;
        qVar.mo13277b("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m3248e(C1496f fVar) {
        synchronized (this.f3637d) {
            this.f3640g.remove(fVar);
            this.f3639f.add(fVar);
        }
    }

    /* renamed from: a */
    public void mo13214a() {
        synchronized (this.f3637d) {
            if (this.f3638e != null) {
                for (C1496f c : new ArrayList(this.f3638e)) {
                    m3245c(c);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13215a(C1496f fVar) {
        mo13216a(fVar, true);
    }

    /* renamed from: a */
    public void mo13216a(C1496f fVar, boolean z) {
        mo13217a(fVar, z, (AppLovinPostbackListener) null);
    }

    /* renamed from: a */
    public void mo13217a(final C1496f fVar, boolean z, final AppLovinPostbackListener appLovinPostbackListener) {
        if (C1553o.m3554b(fVar.mo13219a())) {
            if (z) {
                fVar.mo13230j();
            }
            C14941 r3 = new Runnable() {
                public void run() {
                    synchronized (C1493e.this.f3637d) {
                        C1493e.this.m3241b(fVar);
                        C1493e.this.m3237a(fVar, appLovinPostbackListener);
                    }
                }
            };
            if (C1557r.m3620b()) {
                this.f3634a.mo13071K().mo13014a((C1392a) new C1399ad(this.f3634a, r3), C1435s.C1437a.POSTBACKS);
                return;
            }
            r3.run();
        }
    }
}
