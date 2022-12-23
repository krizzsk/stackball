package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.jk */
class C11400jk extends C10729Rj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TelephonyManager f27268a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public PhoneStateListener f27269b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f27270c;

    /* renamed from: d */
    private C10675Qi f27271d;

    /* renamed from: e */
    private C10807Uc f27272e;

    /* renamed from: f */
    private final C10582O<C10114Ak> f27273f;

    /* renamed from: g */
    private final C10582O<Collection<C10859Vj>> f27274g;

    /* renamed from: h */
    private final C11769sn f27275h;

    /* renamed from: i */
    private final Context f27276i;

    /* renamed from: j */
    private final C10931Xj f27277j;

    /* renamed from: k */
    private final C11887vk f27278k;

    /* renamed from: l */
    private final C10759Sj f27279l;

    /* renamed from: m */
    private final C11491le f27280m;

    /* renamed from: n */
    private C11241fe f27281n;

    /* renamed from: o */
    private C11535mk f27282o;

    /* renamed from: p */
    private final C11281ge f27283p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C10238F3 f27284q;

    /* renamed from: com.yandex.metrica.impl.ob.jk$a */
    class C11401a implements Runnable {
        C11401a() {
        }

        public void run() {
            PhoneStateListener unused = C11400jk.this.f27269b = new C11404d(C11400jk.this, (C11401a) null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jk$b */
    class C11402b implements Runnable {
        C11402b() {
        }

        public void run() {
            if (!C11400jk.this.f27270c) {
                boolean unused = C11400jk.this.f27270c = true;
                if (C11400jk.this.f27269b != null && C11400jk.this.f27268a != null) {
                    try {
                        C11400jk.this.f27268a.listen(C11400jk.this.f27269b, 256);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jk$c */
    class C11403c implements Runnable {
        C11403c() {
        }

        public void run() {
            if (C11400jk.this.f27270c) {
                boolean unused = C11400jk.this.f27270c = false;
                C11400jk.this.f27284q.mo61256a((Object) C11400jk.this);
                if (C11400jk.this.f27269b != null && C11400jk.this.f27268a != null) {
                    try {
                        C11400jk.this.f27268a.listen(C11400jk.this.f27269b, 0);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jk$d */
    private class C11404d extends PhoneStateListener {
        private C11404d() {
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            C11400jk.m29383a(C11400jk.this, signalStrength);
        }

        /* synthetic */ C11404d(C11400jk jkVar, C11401a aVar) {
            this();
        }
    }

    protected C11400jk(Context context, C11769sn snVar) {
        this(context, new C11491le(), snVar);
    }

    /* renamed from: e */
    public Context mo63129e() {
        return this.f27276i;
    }

    /* renamed from: f */
    public TelephonyManager mo63130f() {
        return this.f27268a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized C10114Ak mo63131g() {
        C10859Vj b;
        if (this.f27273f.mo61847b() || this.f27273f.mo61849d()) {
            C10114Ak ak = new C10114Ak(this.f27277j, this.f27278k, this.f27279l);
            C10859Vj b2 = ak.mo61069b();
            if (b2 != null && b2.mo62412p() == null && !this.f27273f.mo61847b() && (b = this.f27273f.mo61844a().mo61069b()) != null) {
                ak.mo61069b().mo62397a(b.mo62412p());
            }
            this.f27273f.mo61846a(ak);
        }
        return this.f27273f.mo61844a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected C11400jk(Context context, C11491le leVar, C11769sn snVar) {
        this(context, leVar, new C11241fe(leVar.mo63280a()), snVar, C10796U2.m27890a(17) ? new C10788Tj() : new C10817Uj(), new C11012a2(), C10238F3.m26224a());
    }

    /* renamed from: b */
    public synchronized void mo62206b() {
        ((C11725rn) this.f27275h).execute(new C11403c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean mo63127c() {
        C10807Uc uc;
        uc = this.f27272e;
        return uc != null && uc.f25921l;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    synchronized boolean mo63128d() {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x001d }
            com.yandex.metrica.impl.ob.Qi r0 = r4.f27271d     // Catch:{ all -> 0x001a }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x0017
            com.yandex.metrica.impl.ob.si r0 = r0.mo62014f()     // Catch:{ all -> 0x001d }
            boolean r0 = r0.f28198t     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r4)
            return r1
        L_0x001a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11400jk.mo63128d():boolean");
    }

    /* renamed from: a */
    public synchronized void mo62201a() {
        ((C11725rn) this.f27275h).execute(new C11402b());
    }

    /* renamed from: a */
    public synchronized void mo62202a(C10143Bk bk) {
        if (bk != null) {
            bk.mo61033a(mo63131g());
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo62204a(com.yandex.metrica.impl.p265ob.C10891Wj r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 == 0) goto L_0x00a1
            monitor-enter(r8)     // Catch:{ all -> 0x009e }
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f27274g     // Catch:{ all -> 0x009b }
            boolean r0 = r0.mo61847b()     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x0014
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f27274g     // Catch:{ all -> 0x009b }
            boolean r0 = r0.mo61849d()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x008e
        L_0x0014:
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f27274g     // Catch:{ all -> 0x009b }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            r2 = 17
            boolean r2 = com.yandex.metrica.impl.p265ob.C10796U2.m27890a((int) r2)     // Catch:{ all -> 0x009b }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x006c
            com.yandex.metrica.impl.ob.ge r2 = r8.f27283p     // Catch:{ all -> 0x009b }
            android.content.Context r5 = r8.f27276i     // Catch:{ all -> 0x009b }
            boolean r2 = r2.mo62489a(r5)     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x006c
            monitor-enter(r8)     // Catch:{ all -> 0x009b }
            com.yandex.metrica.impl.ob.Uc r2 = r8.f27272e     // Catch:{ all -> 0x0069 }
            r5 = 0
            if (r2 == 0) goto L_0x003b
            boolean r2 = r2.f25920k     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            monitor-exit(r8)     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x006c
            android.telephony.TelephonyManager r2 = r8.f27268a     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0048
            java.util.List r2 = r2.getAllCellInfo()     // Catch:{ all -> 0x0048 }
            goto L_0x0049
        L_0x0048:
            r2 = r3
        L_0x0049:
            boolean r6 = com.yandex.metrica.impl.p265ob.C10796U2.m27896b((java.util.Collection) r2)     // Catch:{ all -> 0x009b }
            if (r6 != 0) goto L_0x006c
        L_0x004f:
            int r6 = r2.size()     // Catch:{ all -> 0x009b }
            if (r5 >= r6) goto L_0x006c
            java.lang.Object r6 = r2.get(r5)     // Catch:{ all -> 0x009b }
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6     // Catch:{ all -> 0x009b }
            com.yandex.metrica.impl.ob.mk r7 = r8.f27282o     // Catch:{ all -> 0x009b }
            com.yandex.metrica.impl.ob.Vj r6 = r7.mo62307a(r6)     // Catch:{ all -> 0x009b }
            if (r6 == 0) goto L_0x0066
            r1.add(r6)     // Catch:{ all -> 0x009b }
        L_0x0066:
            int r5 = r5 + 1
            goto L_0x004f
        L_0x0069:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x009b }
            throw r9     // Catch:{ all -> 0x009b }
        L_0x006c:
            int r2 = r1.size()     // Catch:{ all -> 0x009b }
            if (r2 >= r4) goto L_0x0086
            com.yandex.metrica.impl.ob.Ak r1 = r8.mo63131g()     // Catch:{ all -> 0x009b }
            com.yandex.metrica.impl.ob.Vj r1 = r1.mo61069b()     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x007d
            goto L_0x008b
        L_0x007d:
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ all -> 0x009b }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x009b }
            goto L_0x008a
        L_0x0086:
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x009b }
        L_0x008a:
            r3 = r1
        L_0x008b:
            r0.mo61846a(r3)     // Catch:{ all -> 0x009b }
        L_0x008e:
            com.yandex.metrica.impl.ob.O<java.util.Collection<com.yandex.metrica.impl.ob.Vj>> r0 = r8.f27274g     // Catch:{ all -> 0x009b }
            java.lang.Object r0 = r0.mo61844a()     // Catch:{ all -> 0x009b }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x009b }
            monitor-exit(r8)     // Catch:{ all -> 0x009e }
            r9.mo61920a(r0)     // Catch:{ all -> 0x009e }
            goto L_0x00a1
        L_0x009b:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x009e }
            throw r9     // Catch:{ all -> 0x009e }
        L_0x009e:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        L_0x00a1:
            monitor-exit(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11400jk.mo62204a(com.yandex.metrica.impl.ob.Wj):void");
    }

    protected C11400jk(Context context, C11491le leVar, C11241fe feVar, C11769sn snVar, C11535mk mkVar, C11012a2 a2Var, C10238F3 f3) {
        TelephonyManager telephonyManager;
        this.f27270c = false;
        C11428kg.C11433c cVar = C10582O.f25302e;
        long j = cVar.f27451b;
        this.f27273f = new C10582O<>(j, j * 2);
        long j2 = cVar.f27451b;
        this.f27274g = new C10582O<>(j2, 2 * j2);
        this.f27276i = context;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable unused) {
            telephonyManager = null;
        }
        this.f27268a = telephonyManager;
        this.f27283p = m29382a(feVar, a2Var);
        this.f27275h = snVar;
        ((C11725rn) snVar).execute(new C11401a());
        this.f27277j = new C10931Xj(this, feVar);
        this.f27278k = new C11887vk(this, feVar);
        this.f27279l = new C10759Sj(this);
        this.f27280m = leVar;
        this.f27281n = feVar;
        this.f27282o = mkVar;
        this.f27284q = f3;
    }

    /* renamed from: a */
    static void m29383a(C11400jk jkVar, SignalStrength signalStrength) {
        C10859Vj b;
        int i;
        synchronized (jkVar) {
            if (!jkVar.f27273f.mo61847b() && !jkVar.f27273f.mo61849d() && (b = jkVar.f27273f.mo61844a().mo61069b()) != null) {
                if (signalStrength.isGsm()) {
                    int gsmSignalStrength = signalStrength.getGsmSignalStrength();
                    i = 99 == gsmSignalStrength ? -1 : (gsmSignalStrength * 2) - 113;
                } else {
                    int cdmaDbm = signalStrength.getCdmaDbm();
                    i = signalStrength.getEvdoDbm();
                    if (-120 == i) {
                        i = cdmaDbm;
                    } else if (-120 != cdmaDbm) {
                        i = Math.min(cdmaDbm, i);
                    }
                }
                b.mo62397a(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: a */
    public void mo62203a(C10675Qi qi) {
        this.f27271d = qi;
        this.f27280m.mo63281a(qi);
        this.f27281n.mo62897a(this.f27280m.mo63280a());
        this.f27282o.mo62308a(qi.mo62014f());
        if (qi.mo62012d() != null) {
            this.f27273f.mo61845a(qi.mo62012d().f27981a, qi.mo62012d().f27981a * 2);
            this.f27274g.mo61845a(qi.mo62012d().f27981a, qi.mo62012d().f27981a * 2);
        }
    }

    /* renamed from: a */
    public synchronized void mo62378a(C10807Uc uc) {
        this.f27272e = uc;
    }

    /* renamed from: a */
    public void mo62205a(boolean z) {
        this.f27280m.mo63282a(z);
        this.f27281n.mo62897a(this.f27280m.mo63280a());
    }

    /* renamed from: a */
    private static C11281ge m29382a(C11241fe feVar, C11012a2 a2Var) {
        if (C10796U2.m27890a(29)) {
            return a2Var.mo62631c(feVar);
        }
        return a2Var.mo62630b(feVar);
    }
}
