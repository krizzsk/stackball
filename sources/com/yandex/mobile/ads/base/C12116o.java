package com.yandex.mobile.ads.base;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.mobile.ads.banner.C12077d;
import com.yandex.mobile.ads.base.C12130v;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.core.initializer.C12158e;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C12581bc;
import com.yandex.mobile.ads.impl.C13175g5;
import com.yandex.mobile.ads.impl.C13403ib;
import com.yandex.mobile.ads.impl.C14056n5;
import com.yandex.mobile.ads.impl.C14447ra;
import com.yandex.mobile.ads.impl.C14568s8;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.C14661ta;
import com.yandex.mobile.ads.impl.C14662tb;
import com.yandex.mobile.ads.impl.C14749ua;
import com.yandex.mobile.ads.impl.C15026w1;
import com.yandex.mobile.ads.impl.C15139x2;
import com.yandex.mobile.ads.impl.C15224y1;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.C15243ye;
import com.yandex.mobile.ads.impl.C15301zb;
import com.yandex.mobile.ads.impl.a51;
import com.yandex.mobile.ads.impl.c21;
import com.yandex.mobile.ads.impl.d71;
import com.yandex.mobile.ads.impl.gz0;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.ji0;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.l71;
import com.yandex.mobile.ads.impl.le0;
import com.yandex.mobile.ads.impl.op1;
import com.yandex.mobile.ads.impl.pj0;
import com.yandex.mobile.ads.impl.ug1;
import com.yandex.mobile.ads.impl.vb1;
import com.yandex.mobile.ads.impl.y71;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.mobile.ads.base.o */
public abstract class C12116o<T> implements C12130v.C12132b, C15243ye, C14662tb.C14663a<AdResponse<T>> {
    /* access modifiers changed from: protected */

    /* renamed from: a */
    public final Handler f29208a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public final Context f29209b;

    /* renamed from: c */
    protected final C12100g f29210c = new C12100g(this);

    /* renamed from: d */
    private final Executor f29211d;

    /* renamed from: e */
    private final C12130v f29212e = C12130v.m31590a();

    /* renamed from: f */
    protected final C14645t1 f29213f;

    /* renamed from: g */
    private final ug1 f29214g = new C13175g5();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final y71 f29215h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C14447ra f29216i;

    /* renamed from: j */
    protected final C15230y2 f29217j;

    /* renamed from: k */
    protected final jj0 f29218k;

    /* renamed from: l */
    protected final C12158e f29219l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C14661ta f29220m;

    /* renamed from: n */
    private final C15301zb f29221n;

    /* renamed from: o */
    private final vb1 f29222o = vb1.m43082a();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final a51 f29223p = new a51();

    /* renamed from: q */
    private C12101h f29224q = C12101h.NOT_STARTED;

    /* renamed from: r */
    private boolean f29225r;

    /* renamed from: s */
    private long f29226s;

    /* renamed from: t */
    protected AdResponse<T> f29227t;

    /* renamed from: u */
    private C15224y1 f29228u;

    /* renamed from: v */
    private String f29229v;

    /* renamed from: w */
    private le0 f29230w;

    /* renamed from: com.yandex.mobile.ads.base.o$a */
    class C12117a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AdRequest f29231b;

        /* renamed from: c */
        final /* synthetic */ ug1 f29232c;

        C12117a(AdRequest adRequest, ug1 ug1) {
            this.f29231b = adRequest;
            this.f29232c = ug1;
        }

        public void run() {
            C12116o oVar = C12116o.this;
            AdRequest adRequest = this.f29231b;
            synchronized (oVar) {
                oVar.f29213f.mo70085a(adRequest);
            }
            C12350a2 s = C12116o.this.mo64606s();
            if (s == null) {
                C12116o.m31426a(C12116o.this, this.f29232c);
            } else {
                C12116o.this.mo64404a(s);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.base.o$b */
    class C12118b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ug1 f29234b;

        /* renamed from: com.yandex.mobile.ads.base.o$b$a */
        class C12119a implements C14749ua {
            C12119a() {
            }

            /* renamed from: a */
            public void mo64609a(String str) {
                C12116o.this.f29217j.mo70965a(C15139x2.AUTOGRAB_LOADING);
                C12116o.this.f29213f.mo70094b(str);
                C12118b bVar = C12118b.this;
                C12116o.this.mo64590c(bVar.f29234b);
            }
        }

        C12118b(ug1 ug1) {
            this.f29234b = ug1;
        }

        public void run() {
            C14447ra b = C12116o.this.f29216i;
            C12116o oVar = C12116o.this;
            b.mo69710a(oVar.f29209b, oVar.f29220m, new C12119a());
        }
    }

    /* renamed from: com.yandex.mobile.ads.base.o$c */
    class C12120c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12350a2 f29237b;

        C12120c(C12350a2 a2Var) {
            this.f29237b = a2Var;
        }

        public void run() {
            C12116o.this.mo64585b(this.f29237b);
        }
    }

    protected C12116o(Context context, C12115n nVar, C15230y2 y2Var) {
        this.f29209b = context;
        this.f29217j = y2Var;
        C14645t1 t1Var = new C14645t1(nVar);
        this.f29213f = t1Var;
        Executor b = pj0.m40784a().mo69371b();
        this.f29211d = b;
        this.f29219l = new C12158e(context, b, y2Var);
        y71 y71 = new y71();
        this.f29215h = y71;
        this.f29216i = new C14447ra(y71);
        this.f29220m = C14568s8.m41841b();
        this.f29221n = new C15301zb(t1Var);
        this.f29218k = new jj0(context, t1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C13403ib<T> mo64575a(String str, String str2);

    /* renamed from: e */
    public C15230y2 mo64593e() {
        return this.f29217j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public synchronized AdRequest mo64594f() {
        return this.f29213f.mo70080a();
    }

    /* renamed from: g */
    public AdResponse<T> mo64595g() {
        return this.f29227t;
    }

    /* renamed from: h */
    public Context mo64596h() {
        return this.f29209b;
    }

    /* renamed from: i */
    public synchronized boolean mo64597i() {
        return this.f29224q == C12101h.CANCELLED;
    }

    /* renamed from: j */
    public synchronized boolean mo64598j() {
        return this.f29224q == C12101h.SUCCESSFULLY_LOADED;
    }

    /* renamed from: k */
    public synchronized boolean mo64599k() {
        return this.f29225r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo64600l() {
        return !this.f29212e.mo64672b(this.f29209b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo64601m() {
        mo64406n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public synchronized void mo64406n() {
        C15224y1 y1Var = this.f29228u;
        if (y1Var != null) {
            ((C12077d) y1Var).mo64381d();
        }
    }

    /* renamed from: o */
    public void mo64602o() {
        this.f29217j.mo70966a(C15139x2.ADAPTER_LOADING, (gz0) new C14056n5(h41.C13277c.SUCCESS, this.f29229v));
        this.f29217j.mo70965a(C15139x2.AD_LOADING);
        this.f29222o.mo70468a(ji0.LOAD, this);
        C12101h hVar = C12101h.SUCCESSFULLY_LOADED;
        synchronized (this) {
            Objects.toString(hVar);
            this.f29224q = hVar;
        }
        this.f29226s = SystemClock.elapsedRealtime();
    }

    public void onAdLoaded() {
        mo64602o();
        mo64406n();
    }

    /* renamed from: p */
    public void mo64603p() {
        getClass().toString();
        this.f29212e.mo64670a(this, this.f29209b);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: q */
    protected synchronized void mo64604q() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.yandex.mobile.ads.base.h r0 = com.yandex.mobile.ads.base.C12101h.NOT_STARTED     // Catch:{ all -> 0x000f }
            monitor-enter(r1)     // Catch:{ all -> 0x000f }
            java.util.Objects.toString(r0)     // Catch:{ all -> 0x000c }
            r1.f29224q = r0     // Catch:{ all -> 0x000c }
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            monitor-exit(r1)
            return
        L_0x000c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x000f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.base.C12116o.mo64604q():void");
    }

    /* renamed from: r */
    public void mo64605r() {
        getClass().toString();
        this.f29212e.mo64671b(this, this.f29209b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public C12350a2 mo64606s() {
        return this.f29218k.mo68009a();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public synchronized void mo64584b(com.yandex.mobile.ads.common.AdRequest r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x003f }
            com.yandex.mobile.ads.base.h r0 = r2.f29224q     // Catch:{ all -> 0x003c }
            java.util.Objects.toString(r0)     // Catch:{ all -> 0x003c }
            com.yandex.mobile.ads.base.h r0 = r2.f29224q     // Catch:{ all -> 0x003c }
            com.yandex.mobile.ads.base.h r1 = com.yandex.mobile.ads.base.C12101h.LOADING     // Catch:{ all -> 0x003c }
            if (r0 == r1) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003a
            boolean r0 = r2.mo64582a((com.yandex.mobile.ads.common.AdRequest) r3)     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0037
            com.yandex.mobile.ads.impl.y2 r0 = r2.f29217j     // Catch:{ all -> 0x003f }
            r0.mo70964a()     // Catch:{ all -> 0x003f }
            com.yandex.mobile.ads.impl.y2 r0 = r2.f29217j     // Catch:{ all -> 0x003f }
            com.yandex.mobile.ads.impl.x2 r1 = com.yandex.mobile.ads.impl.C15139x2.AD_LOADING     // Catch:{ all -> 0x003f }
            r0.mo70970b(r1)     // Catch:{ all -> 0x003f }
            com.yandex.mobile.ads.impl.vb1 r0 = r2.f29222o     // Catch:{ all -> 0x003f }
            com.yandex.mobile.ads.impl.ji0 r1 = com.yandex.mobile.ads.impl.ji0.LOAD     // Catch:{ all -> 0x003f }
            r0.mo70469b(r1, r2)     // Catch:{ all -> 0x003f }
            monitor-enter(r2)     // Catch:{ all -> 0x003f }
            com.yandex.mobile.ads.impl.ug1 r0 = r2.f29214g     // Catch:{ all -> 0x0034 }
            r2.mo64578a((com.yandex.mobile.ads.common.AdRequest) r3, (com.yandex.mobile.ads.impl.ug1) r0)     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            goto L_0x003a
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            throw r3     // Catch:{ all -> 0x003f }
        L_0x0037:
            r2.mo64601m()     // Catch:{ all -> 0x003f }
        L_0x003a:
            monitor-exit(r2)
            return
        L_0x003c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            throw r3     // Catch:{ all -> 0x003f }
        L_0x003f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.base.C12116o.mo64584b(com.yandex.mobile.ads.common.AdRequest):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final synchronized void mo64589c(AdRequest adRequest) {
        mo64578a(adRequest, this.f29214g);
    }

    /* renamed from: d */
    public C14645t1 mo64592d() {
        return this.f29213f;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    protected final synchronized void mo64578a(com.yandex.mobile.ads.common.AdRequest r3, com.yandex.mobile.ads.impl.ug1 r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.mobile.ads.base.h r0 = com.yandex.mobile.ads.base.C12101h.LOADING     // Catch:{ all -> 0x0019 }
            monitor-enter(r2)     // Catch:{ all -> 0x0019 }
            java.util.Objects.toString(r0)     // Catch:{ all -> 0x0016 }
            r2.f29224q = r0     // Catch:{ all -> 0x0016 }
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            android.os.Handler r0 = r2.f29208a     // Catch:{ all -> 0x0019 }
            com.yandex.mobile.ads.base.o$a r1 = new com.yandex.mobile.ads.base.o$a     // Catch:{ all -> 0x0019 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0019 }
            r0.post(r1)     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)
            return
        L_0x0016:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r3     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.base.C12116o.mo64578a(com.yandex.mobile.ads.common.AdRequest, com.yandex.mobile.ads.impl.ug1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo64590c(ug1 ug1) {
        d71 a = l71.m38631c().mo68362a(this.f29209b);
        BiddingSettings d = a != null ? a.mo66454d() : null;
        if (d != null) {
            this.f29217j.mo70970b(C15139x2.BIDDING_DATA_LOADING);
            this.f29211d.execute(new Runnable(d, ug1) {
                public final /* synthetic */ BiddingSettings f$1;
                public final /* synthetic */ ug1 f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C12116o.this.m31425a(this.f$1, this.f$2);
                }
            });
            return;
        }
        synchronized (this) {
            this.f29211d.execute(new C12122q(this, ug1));
        }
    }

    /* renamed from: a */
    static void m31426a(C12116o oVar, ug1 ug1) {
        oVar.f29219l.mo64752a(oVar.f29230w, (C12158e.C12160b) new C12121p(oVar, ug1));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31425a(BiddingSettings biddingSettings, ug1 ug1) {
        this.f29221n.mo71193a(this.f29209b, biddingSettings, new C12581bc(ug1) {
            public final /* synthetic */ ug1 f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo64408a(String str) {
                C12116o.this.m31427a(this.f$1, str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31427a(ug1 ug1, String str) {
        this.f29217j.mo70965a(C15139x2.BIDDING_DATA_LOADING);
        this.f29213f.mo70097c(str);
        synchronized (this) {
            this.f29211d.execute(new C12122q(this, ug1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo64586b(ug1 ug1) {
        this.f29217j.mo70970b(C15139x2.AUTOGRAB_LOADING);
        this.f29211d.execute(new C12118b(ug1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo64577a(C12101h hVar) {
        Objects.toString(hVar);
        this.f29224q = hVar;
    }

    /* renamed from: b */
    public void mo64587b(String str) {
        this.f29213f.mo70089a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo64583b() {
        this.f29216i.mo69711a(this.f29220m);
    }

    /* renamed from: a */
    public void mo64581a(C15224y1 y1Var) {
        this.f29228u = y1Var;
    }

    /* renamed from: b */
    public void mo64588b(boolean z) {
        this.f29213f.mo70095b(z);
    }

    /* renamed from: a */
    public void mo64576a(SizeInfo sizeInfo) {
        this.f29213f.mo70082a(sizeInfo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo64585b(C12350a2 a2Var) {
        C15224y1 y1Var = this.f29228u;
        if (y1Var != null) {
            ((C12077d) y1Var).mo64377a(a2Var);
        }
    }

    /* renamed from: a */
    public void mo64404a(C12350a2 a2Var) {
        c21.m34570c(a2Var.mo65652b(), new Object[0]);
        C12101h hVar = C12101h.ERRONEOUSLY_LOADED;
        synchronized (this) {
            Objects.toString(hVar);
            this.f29224q = hVar;
        }
        this.f29217j.mo70966a(C15139x2.ADAPTER_LOADING, (gz0) new C14056n5(h41.C13277c.ERROR, this.f29229v));
        this.f29217j.mo70965a(C15139x2.AD_LOADING);
        this.f29222o.mo70468a(ji0.LOAD, this);
        this.f29208a.post(new C12120c(a2Var));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public synchronized void mo64364c() {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0034 }
            boolean r0 = r2.f29225r     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x002f
            r0 = 1
            r2.f29225r = r0     // Catch:{ all -> 0x0034 }
            r2.mo64605r()     // Catch:{ all -> 0x0034 }
            com.yandex.mobile.ads.core.initializer.e r0 = r2.f29219l     // Catch:{ all -> 0x0034 }
            r0.mo64751a()     // Catch:{ all -> 0x0034 }
            com.yandex.mobile.ads.impl.ra r0 = r2.f29216i     // Catch:{ all -> 0x0034 }
            com.yandex.mobile.ads.impl.ta r1 = r2.f29220m     // Catch:{ all -> 0x0034 }
            r0.mo69711a(r1)     // Catch:{ all -> 0x0034 }
            com.yandex.mobile.ads.base.g r0 = r2.f29210c     // Catch:{ all -> 0x0034 }
            r0.mo64526b()     // Catch:{ all -> 0x0034 }
            com.yandex.mobile.ads.impl.vb1 r0 = r2.f29222o     // Catch:{ all -> 0x0034 }
            com.yandex.mobile.ads.impl.ji0 r1 = com.yandex.mobile.ads.impl.ji0.LOAD     // Catch:{ all -> 0x0034 }
            r0.mo70468a(r1, r2)     // Catch:{ all -> 0x0034 }
            r0 = 0
            r2.f29227t = r0     // Catch:{ all -> 0x0034 }
            java.lang.Class r0 = r2.getClass()     // Catch:{ all -> 0x0034 }
            r0.toString()     // Catch:{ all -> 0x0034 }
        L_0x002f:
            monitor-exit(r2)
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.base.C12116o.mo64364c():void");
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
    protected synchronized boolean mo64582a(com.yandex.mobile.ads.common.AdRequest r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.yandex.mobile.ads.base.AdResponse<T> r0 = r7.f29227t     // Catch:{ all -> 0x0043 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0040
            long r3 = r7.f29226s     // Catch:{ all -> 0x0043 }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0043 }
            long r5 = r7.f29226s     // Catch:{ all -> 0x0043 }
            long r3 = r3 - r5
            com.yandex.mobile.ads.base.AdResponse<T> r0 = r7.f29227t     // Catch:{ all -> 0x0043 }
            int r0 = r0.mo64427g()     // Catch:{ all -> 0x0043 }
            long r5 = (long) r0     // Catch:{ all -> 0x0043 }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0040
            if (r8 == 0) goto L_0x002f
            com.yandex.mobile.ads.impl.t1 r0 = r7.f29213f     // Catch:{ all -> 0x0043 }
            com.yandex.mobile.ads.common.AdRequest r0 = r0.mo70080a()     // Catch:{ all -> 0x0043 }
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x0043 }
            if (r8 == 0) goto L_0x0040
        L_0x002f:
            monitor-enter(r7)     // Catch:{ all -> 0x0043 }
            com.yandex.mobile.ads.base.h r8 = r7.f29224q     // Catch:{ all -> 0x003d }
            com.yandex.mobile.ads.base.h r0 = com.yandex.mobile.ads.base.C12101h.ERRONEOUSLY_LOADED     // Catch:{ all -> 0x003d }
            if (r8 != r0) goto L_0x0038
            r8 = 1
            goto L_0x0039
        L_0x0038:
            r8 = 0
        L_0x0039:
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            if (r8 == 0) goto L_0x0041
            goto L_0x0040
        L_0x003d:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x0040:
            r1 = 1
        L_0x0041:
            monitor-exit(r7)
            return r1
        L_0x0043:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.base.C12116o.mo64582a(com.yandex.mobile.ads.common.AdRequest):boolean");
    }

    /* renamed from: c */
    public void mo64591c(String str) {
        this.f29229v = str;
    }

    /* renamed from: a */
    public void mo64403a(Intent intent) {
        intent.getAction();
    }

    /* renamed from: a */
    public synchronized void mo64360a(AdResponse<T> adResponse) {
        this.f29217j.mo70965a(C15139x2.NETWORK_REQUEST);
        this.f29227t = adResponse;
    }

    /* renamed from: a */
    public void mo64579a(op1 op1) {
        if (op1 instanceof C15026w1) {
            mo64404a(C12100g.m31393a(((C15026w1) op1).mo70619a()));
        }
    }

    /* renamed from: a */
    public void mo64580a(ug1 ug1) {
        mo64578a(this.f29213f.mo70080a(), ug1);
    }
}
