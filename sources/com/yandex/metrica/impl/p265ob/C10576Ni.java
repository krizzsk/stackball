package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.IParamsCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Ni */
public class C10576Ni {

    /* renamed from: a */
    private final Set<String> f25284a;

    /* renamed from: b */
    private final Map<String, C11258g1> f25285b;

    /* renamed from: c */
    private List<String> f25286c;

    /* renamed from: d */
    private Map<String, String> f25287d;

    /* renamed from: e */
    private long f25288e;

    /* renamed from: f */
    private boolean f25289f;

    /* renamed from: g */
    private C10378Il f25290g;

    /* renamed from: h */
    private C10921Xa f25291h;

    /* renamed from: i */
    private long f25292i;

    /* renamed from: j */
    private final List<C10410Jl> f25293j;

    /* renamed from: k */
    private final C10248F9 f25294k;

    /* renamed from: l */
    private final C11719ri f25295l;

    /* renamed from: m */
    private final C11793ti f25296m;

    /* renamed from: n */
    private final C11916wi f25297n;

    public C10576Ni(Context context, C10248F9 f9) {
        this(f9, new C11566ni(), new C11719ri(), C10261Fj.m26320a(context).mo61332a(context, new C10376Ij(f9)), new C11793ti(), new C11916wi(), new C11884vi());
    }

    /* renamed from: b */
    private void m27057b(String str, C11258g1 g1Var) {
        if (!m27056a(g1Var)) {
            this.f25285b.put(str, g1Var);
        }
    }

    /* renamed from: h */
    private void m27059h() {
        this.f25294k.mo61294i(this.f25285b.get("yandex_mobile_metrica_uuid")).mo61281e(this.f25285b.get("yandex_mobile_metrica_device_id")).mo61278d(this.f25285b.get("appmetrica_device_id_hash")).mo61265a(this.f25285b.get("yandex_mobile_metrica_get_ad_url")).mo61271b(this.f25285b.get("yandex_mobile_metrica_report_ad_url")).mo61291h(this.f25288e).mo61292h(this.f25285b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)).mo61312q(C11993ym.m30987c(this.f25287d)).mo61263a(this.f25290g).mo61264a(this.f25291h).mo61284f(this.f25285b.get("yandex_mobile_metrica_google_adv_id")).mo61288g(this.f25285b.get("yandex_mobile_metrica_huawei_oaid")).mo61297j(this.f25285b.get("yandex_mobile_metrica_yandex_adv_id")).mo61279d(this.f25289f).mo61275c(this.f25296m.mo63743a()).mo61287g(this.f25292i).mo61266a(this.f25297n.mo64043a()).mo61454c();
    }

    /* renamed from: a */
    public void mo61824a(Map<String, String> map) {
        if (!C10796U2.m27897b((Map) map) && !C10796U2.m27892a((Object) map, (Object) this.f25287d)) {
            this.f25287d = new HashMap(map);
            this.f25289f = true;
            m27059h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo61829c() {
        C11258g1 g1Var = this.f25285b.get("yandex_mobile_metrica_device_id");
        if (g1Var == null) {
            return null;
        }
        return g1Var.f26933a;
    }

    /* renamed from: d */
    public C10921Xa mo61830d() {
        return this.f25291h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo61831e() {
        return this.f25288e;
    }

    /* renamed from: f */
    public C10378Il mo61832f() {
        return this.f25290g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo61833g() {
        C11258g1 g1Var = this.f25285b.get("yandex_mobile_metrica_uuid");
        if (g1Var == null) {
            return null;
        }
        return g1Var.f26933a;
    }

    /* renamed from: b */
    private boolean m27058b(C11258g1 g1Var) {
        return g1Var == null || TextUtils.isEmpty(g1Var.f26933a);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    synchronized boolean mo61828b(java.util.List<java.lang.String> r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Collection r0 = com.yandex.metrica.impl.p265ob.C10612Oi.m27144a((java.util.Collection<java.lang.String>) r7)     // Catch:{ all -> 0x0056 }
            boolean r0 = r6.mo61826a((java.util.Collection<java.lang.String>) r0)     // Catch:{ all -> 0x0056 }
            r1 = 1
            r0 = r0 ^ r1
            monitor-enter(r6)     // Catch:{ all -> 0x0056 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0053 }
        L_0x0010:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x0053 }
            r3 = 0
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0053 }
            java.util.Set<java.lang.String> r4 = r6.f25284a     // Catch:{ all -> 0x0053 }
            boolean r2 = r4.contains(r2)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0010
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            r7 = 1
            goto L_0x002a
        L_0x0028:
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            r7 = 0
        L_0x002a:
            long r4 = r6.f25292i     // Catch:{ all -> 0x0056 }
            boolean r2 = com.yandex.metrica.impl.p265ob.C10612Oi.m27145a((long) r4)     // Catch:{ all -> 0x0056 }
            monitor-enter(r6)     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.impl.ob.Il r4 = r6.f25290g     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x003d
            boolean r4 = r4.mo61560a()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x003d
            r4 = 1
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            r4 = r4 ^ r1
            if (r0 != 0) goto L_0x004e
            if (r7 != 0) goto L_0x004e
            if (r2 != 0) goto L_0x004e
            boolean r7 = r6.f25289f     // Catch:{ all -> 0x0056 }
            if (r7 != 0) goto L_0x004e
            if (r4 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            monitor-exit(r6)
            return r1
        L_0x0050:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            throw r7     // Catch:{ all -> 0x0056 }
        L_0x0053:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            throw r7     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10576Ni.mo61828b(java.util.List):boolean");
    }

    C10576Ni(C10248F9 f9, C11566ni niVar, C11719ri riVar, C10227Ej ej, C11793ti tiVar, C11916wi wiVar, C11884vi viVar) {
        HashSet hashSet = new HashSet();
        this.f25284a = hashSet;
        this.f25285b = new HashMap();
        this.f25293j = new ArrayList();
        hashSet.add("yandex_mobile_metrica_google_adv_id");
        hashSet.add("yandex_mobile_metrica_huawei_oaid");
        hashSet.add("yandex_mobile_metrica_yandex_adv_id");
        this.f25294k = f9;
        this.f25295l = riVar;
        this.f25296m = tiVar;
        this.f25297n = wiVar;
        m27055a("yandex_mobile_metrica_uuid", ej.mo61244a());
        m27055a("yandex_mobile_metrica_device_id", f9.mo61300k());
        m27055a("appmetrica_device_id_hash", f9.mo61298j());
        m27055a("yandex_mobile_metrica_get_ad_url", f9.mo61282e());
        m27055a("yandex_mobile_metrica_report_ad_url", f9.mo61285f());
        m27057b(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, f9.mo61313q());
        m27055a("yandex_mobile_metrica_google_adv_id", f9.mo61307n());
        m27055a("yandex_mobile_metrica_huawei_oaid", f9.mo61309o());
        m27055a("yandex_mobile_metrica_yandex_adv_id", f9.mo61319u());
        tiVar.mo63744a(f9.mo61295i());
        wiVar.mo64044a(f9.mo61304m());
        this.f25286c = f9.mo61293h();
        Map<String, String> map = null;
        String j = f9.mo61299j((String) null);
        this.f25287d = j != null ? C11993ym.m30966a(j) : map;
        this.f25289f = f9.mo61273b(true);
        this.f25288e = f9.mo61277d(0);
        this.f25290g = f9.mo61317s();
        this.f25291h = f9.mo61302l();
        this.f25292i = f9.mo61310p();
        m27059h();
    }

    /* renamed from: a */
    public boolean mo61825a() {
        C11258g1 g1Var = this.f25285b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        if (!m27056a(g1Var) && g1Var.f26933a.isEmpty()) {
            return C10796U2.m27897b((Map) this.f25287d);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<String> mo61827b() {
        return this.f25286c;
    }

    /* renamed from: a */
    private void m27055a(String str, C11258g1 g1Var) {
        if (!m27058b(g1Var)) {
            this.f25285b.put(str, g1Var);
        }
    }

    /* renamed from: a */
    private boolean m27056a(C11258g1 g1Var) {
        return g1Var == null || g1Var.f26933a == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo61823a(List<String> list, Map<String, C11258g1> map) {
        for (String next : list) {
            C11258g1 g1Var = this.f25285b.get(next);
            if (g1Var != null) {
                map.put(next, g1Var);
            }
        }
        this.f25296m.mo63745a(list, map);
        this.f25297n.mo64045a(list, map);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo61826a(java.util.Collection<java.lang.String> r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x006b }
        L_0x0005:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x006b }
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.g1> r1 = r4.f25285b     // Catch:{ all -> 0x006b }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006b }
            com.yandex.metrica.impl.ob.g1 r1 = (com.yandex.metrica.impl.p265ob.C11258g1) r1     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0027
            com.yandex.metrica.impl.ob.ti r1 = r4.f25296m     // Catch:{ all -> 0x006b }
            java.util.Map r1 = r1.mo63746b()     // Catch:{ all -> 0x006b }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006b }
            com.yandex.metrica.impl.ob.g1 r1 = (com.yandex.metrica.impl.p265ob.C11258g1) r1     // Catch:{ all -> 0x006b }
        L_0x0027:
            if (r1 != 0) goto L_0x002f
            com.yandex.metrica.impl.ob.wi r1 = r4.f25297n     // Catch:{ all -> 0x006b }
            com.yandex.metrica.impl.ob.g1 r1 = r1.mo64042a((java.lang.String) r0)     // Catch:{ all -> 0x006b }
        L_0x002f:
            java.lang.String r2 = "yandex_mobile_metrica_clids"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x006b }
            r3 = 0
            if (r2 == 0) goto L_0x0054
            boolean r0 = r4.f25289f     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0052
            boolean r0 = r4.m27056a((com.yandex.metrica.impl.p265ob.C11258g1) r1)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = r1.f26933a     // Catch:{ all -> 0x006b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0005
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f25287d     // Catch:{ all -> 0x006b }
            boolean r0 = com.yandex.metrica.impl.p265ob.C10796U2.m27897b((java.util.Map) r0)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0005
        L_0x0052:
            monitor-exit(r4)
            return r3
        L_0x0054:
            java.lang.String r2 = "yandex_mobile_metrica_lib_ssl_enabled"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0005
            monitor-exit(r4)
            return r3
        L_0x0060:
            boolean r0 = r4.m27058b((com.yandex.metrica.impl.p265ob.C11258g1) r1)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0005
            monitor-exit(r4)
            return r3
        L_0x0068:
            r5 = 1
            monitor-exit(r4)
            return r5
        L_0x006b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10576Ni.mo61826a(java.util.Collection):boolean");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    synchronized void mo61820a(android.os.Bundle r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.yandex.metrica.impl.ob.U r0 = new com.yandex.metrica.impl.ob.U     // Catch:{ all -> 0x0141 }
            r0.<init>(r5)     // Catch:{ all -> 0x0141 }
            monitor-enter(r4)     // Catch:{ all -> 0x0141 }
            com.yandex.metrica.impl.ob.g1 r5 = r0.mo62325o()     // Catch:{ all -> 0x013e }
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.g1> r1 = r4.f25285b     // Catch:{ all -> 0x013e }
            java.lang.String r2 = "yandex_mobile_metrica_uuid"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x013e }
            com.yandex.metrica.impl.ob.g1 r1 = (com.yandex.metrica.impl.p265ob.C11258g1) r1     // Catch:{ all -> 0x013e }
            boolean r1 = r4.m27058b((com.yandex.metrica.impl.p265ob.C11258g1) r1)     // Catch:{ all -> 0x013e }
            if (r1 == 0) goto L_0x002e
            boolean r1 = r4.m27058b((com.yandex.metrica.impl.p265ob.C11258g1) r5)     // Catch:{ all -> 0x013e }
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = "yandex_mobile_metrica_uuid"
            boolean r2 = r4.m27058b((com.yandex.metrica.impl.p265ob.C11258g1) r5)     // Catch:{ all -> 0x013e }
            if (r2 != 0) goto L_0x002e
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.g1> r2 = r4.f25285b     // Catch:{ all -> 0x013e }
            r2.put(r1, r5)     // Catch:{ all -> 0x013e }
        L_0x002e:
            java.lang.String r5 = "yandex_mobile_metrica_device_id"
            com.yandex.metrica.impl.ob.g1 r1 = r0.mo62312c()     // Catch:{ all -> 0x013e }
            boolean r2 = r4.m27058b((com.yandex.metrica.impl.p265ob.C11258g1) r1)     // Catch:{ all -> 0x013e }
            if (r2 != 0) goto L_0x003f
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.g1> r2 = r4.f25285b     // Catch:{ all -> 0x013e }
            r2.put(r5, r1)     // Catch:{ all -> 0x013e }
        L_0x003f:
            java.lang.String r5 = "appmetrica_device_id_hash"
            com.yandex.metrica.impl.ob.g1 r1 = r0.mo62314d()     // Catch:{ all -> 0x013e }
            boolean r2 = r4.m27058b((com.yandex.metrica.impl.p265ob.C11258g1) r1)     // Catch:{ all -> 0x013e }
            if (r2 != 0) goto L_0x0050
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.g1> r2 = r4.f25285b     // Catch:{ all -> 0x013e }
            r2.put(r5, r1)     // Catch:{ all -> 0x013e }
        L_0x0050:
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.g1> r5 = r4.f25285b     // Catch:{ all -> 0x013e }
            com.yandex.metrica.impl.ob.g1 r1 = r0.mo62317g()     // Catch:{ all -> 0x013e }
            java.lang.String r2 = "yandex_mobile_metrica_google_adv_id"
            r5.put(r2, r1)     // Catch:{ all -> 0x013e }
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.g1> r5 = r4.f25285b     // Catch:{ all -> 0x013e }
            com.yandex.metrica.impl.ob.g1 r1 = r0.mo62319i()     // Catch:{ all -> 0x013e }
            java.lang.String r2 = "yandex_mobile_metrica_huawei_oaid"
            r5.put(r2, r1)     // Catch:{ all -> 0x013e }
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.g1> r5 = r4.f25285b     // Catch:{ all -> 0x013e }
            com.yandex.metrica.impl.ob.g1 r1 = r0.mo62326p()     // Catch:{ all -> 0x013e }
            java.lang.String r2 = "yandex_mobile_metrica_yandex_adv_id"
            r5.put(r2, r1)     // Catch:{ all -> 0x013e }
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            com.yandex.metrica.impl.ob.ti r5 = r4.f25296m     // Catch:{ all -> 0x0141 }
            com.yandex.metrica.impl.ob.g1 r1 = r0.mo62311b()     // Catch:{ all -> 0x0141 }
            r5.mo63744a(r1)     // Catch:{ all -> 0x0141 }
            com.yandex.metrica.impl.ob.wi r5 = r4.f25297n     // Catch:{ all -> 0x0141 }
            com.yandex.metrica.impl.ob.xi r1 = r0.mo62316f()     // Catch:{ all -> 0x0141 }
            r5.mo64044a((com.yandex.metrica.impl.p265ob.C11954xi) r1)     // Catch:{ all -> 0x0141 }
            monitor-enter(r4)     // Catch:{ all -> 0x0141 }
            com.yandex.metrica.impl.ob.g1 r5 = r0.mo62318h()     // Catch:{ all -> 0x013b }
            boolean r1 = r4.m27056a((com.yandex.metrica.impl.p265ob.C11258g1) r5)     // Catch:{ all -> 0x013b }
            if (r1 != 0) goto L_0x009c
            monitor-enter(r4)     // Catch:{ all -> 0x013b }
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.g1> r1 = r4.f25285b     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = "yandex_mobile_metrica_get_ad_url"
            r1.put(r2, r5)     // Catch:{ all -> 0x0099 }
            monitor-exit(r4)     // Catch:{ all -> 0x013b }
            goto L_0x009c
        L_0x0099:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x013b }
            throw r5     // Catch:{ all -> 0x013b }
        L_0x009c:
            com.yandex.metrica.impl.ob.g1 r5 = r0.mo62321k()     // Catch:{ all -> 0x013b }
            boolean r1 = r4.m27056a((com.yandex.metrica.impl.p265ob.C11258g1) r5)     // Catch:{ all -> 0x013b }
            if (r1 != 0) goto L_0x00b3
            monitor-enter(r4)     // Catch:{ all -> 0x013b }
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.g1> r1 = r4.f25285b     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "yandex_mobile_metrica_report_ad_url"
            r1.put(r2, r5)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r4)     // Catch:{ all -> 0x013b }
            goto L_0x00b3
        L_0x00b0:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x013b }
            throw r5     // Catch:{ all -> 0x013b }
        L_0x00b3:
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            long r1 = r0.mo62323m()     // Catch:{ all -> 0x0141 }
            monitor-enter(r4)     // Catch:{ all -> 0x0141 }
            r4.f25288e = r1     // Catch:{ all -> 0x0138 }
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            com.yandex.metrica.impl.ob.ri r5 = r4.f25295l     // Catch:{ all -> 0x0141 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.f25287d     // Catch:{ all -> 0x0141 }
            com.yandex.metrica.impl.ob.g1 r2 = r0.mo62310a()     // Catch:{ all -> 0x0141 }
            java.lang.String r2 = r2.f26933a     // Catch:{ all -> 0x0141 }
            if (r2 != 0) goto L_0x00ca
            r2 = 0
            goto L_0x00da
        L_0x00ca:
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0141 }
            if (r3 == 0) goto L_0x00d6
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0141 }
            r2.<init>()     // Catch:{ all -> 0x0141 }
            goto L_0x00da
        L_0x00d6:
            java.util.HashMap r2 = com.yandex.metrica.impl.p265ob.C11993ym.m30990d((java.lang.String) r2)     // Catch:{ all -> 0x0141 }
        L_0x00da:
            r5.getClass()     // Catch:{ all -> 0x0141 }
            boolean r5 = com.yandex.metrica.impl.p265ob.C10796U2.m27897b((java.util.Map) r1)     // Catch:{ all -> 0x0141 }
            if (r5 == 0) goto L_0x00e8
            boolean r5 = com.yandex.metrica.impl.p265ob.C10796U2.m27897b((java.util.Map) r2)     // Catch:{ all -> 0x0141 }
            goto L_0x00ec
        L_0x00e8:
            boolean r5 = r1.equals(r2)     // Catch:{ all -> 0x0141 }
        L_0x00ec:
            if (r5 == 0) goto L_0x00fc
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.g1> r5 = r4.f25285b     // Catch:{ all -> 0x0141 }
            com.yandex.metrica.impl.ob.g1 r1 = r0.mo62322l()     // Catch:{ all -> 0x0141 }
            java.lang.String r2 = "yandex_mobile_metrica_clids"
            r5.put(r2, r1)     // Catch:{ all -> 0x0141 }
            r5 = 0
            r4.f25289f = r5     // Catch:{ all -> 0x0141 }
        L_0x00fc:
            monitor-enter(r4)     // Catch:{ all -> 0x0141 }
            com.yandex.metrica.impl.ob.Il r5 = r0.mo62324n()     // Catch:{ all -> 0x0135 }
            if (r5 == 0) goto L_0x0123
            boolean r1 = r5.mo61560a()     // Catch:{ all -> 0x0135 }
            if (r1 == 0) goto L_0x0123
            r4.f25290g = r5     // Catch:{ all -> 0x0135 }
            java.util.List<com.yandex.metrica.impl.ob.Jl> r5 = r4.f25293j     // Catch:{ all -> 0x0135 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0135 }
        L_0x0111:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0135 }
            if (r1 == 0) goto L_0x0123
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0135 }
            com.yandex.metrica.impl.ob.Jl r1 = (com.yandex.metrica.impl.p265ob.C10410Jl) r1     // Catch:{ all -> 0x0135 }
            com.yandex.metrica.impl.ob.Il r2 = r4.f25290g     // Catch:{ all -> 0x0135 }
            r1.mo61633a(r2)     // Catch:{ all -> 0x0135 }
            goto L_0x0111
        L_0x0123:
            com.yandex.metrica.impl.ob.Xa r5 = r0.mo62315e()     // Catch:{ all -> 0x0135 }
            r4.f25291h = r5     // Catch:{ all -> 0x0135 }
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            long r0 = r0.mo62320j()     // Catch:{ all -> 0x0141 }
            r4.f25292i = r0     // Catch:{ all -> 0x0141 }
            r4.m27059h()     // Catch:{ all -> 0x0141 }
            monitor-exit(r4)
            return
        L_0x0135:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            throw r5     // Catch:{ all -> 0x0141 }
        L_0x0138:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            throw r5     // Catch:{ all -> 0x0141 }
        L_0x013b:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            throw r5     // Catch:{ all -> 0x0141 }
        L_0x013e:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            throw r5     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10576Ni.mo61820a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public synchronized void mo61821a(C10410Jl jl) {
        this.f25293j.add(jl);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo61822a(List<String> list) {
        this.f25286c = list;
        this.f25294k.mo61272b(list);
    }
}
