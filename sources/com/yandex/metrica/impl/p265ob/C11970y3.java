package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.billing_interface.C10069b;
import com.yandex.metrica.impl.p265ob.C10199E;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.y3 */
public class C11970y3 {

    /* renamed from: a */
    private C11698r f28757a;

    /* renamed from: b */
    private final Context f28758b;

    /* renamed from: c */
    private final Executor f28759c;

    /* renamed from: d */
    private final Executor f28760d;

    /* renamed from: e */
    private final C10069b f28761e;

    /* renamed from: f */
    private final C11800u f28762f;

    /* renamed from: g */
    private final C11771t f28763g;

    /* renamed from: h */
    private final C10199E f28764h;

    /* renamed from: i */
    private final C11933x3 f28765i;

    /* renamed from: com.yandex.metrica.impl.ob.y3$a */
    class C11971a implements C10199E.C10201b {
        C11971a() {
        }

        /* renamed from: a */
        public void mo61213a(C10199E.C10200a aVar) {
            C11970y3.m30885a(C11970y3.this, aVar);
        }
    }

    public C11970y3(Context context, Executor executor, Executor executor2, C10069b bVar, C11800u uVar, C11771t tVar, C10199E e, C11933x3 x3Var) {
        this.f28758b = context;
        this.f28759c = executor;
        this.f28760d = executor2;
        this.f28761e = bVar;
        this.f28762f = uVar;
        this.f28763g = tVar;
        this.f28764h = e;
        this.f28765i = x3Var;
    }

    /* renamed from: a */
    static void m30885a(C11970y3 y3Var, C10199E.C10200a aVar) {
        y3Var.getClass();
        if (aVar == C10199E.C10200a.VISIBLE) {
            try {
                C11698r rVar = y3Var.f28757a;
                if (rVar != null) {
                    rVar.mo60945b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo64120a(C10675Qi qi, Boolean bool) {
        C11698r a;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            synchronized (this) {
                a = this.f28765i.mo64066a(this.f28758b, this.f28759c, this.f28760d, this.f28761e, this.f28762f, this.f28763g);
                this.f28757a = a;
            }
            a.mo60944a(qi.mo62011c());
            if (this.f28764h.mo61206a((C10199E.C10201b) new C11971a()) == C10199E.C10200a.VISIBLE) {
                try {
                    C11698r rVar = this.f28757a;
                    if (rVar != null) {
                        rVar.mo60945b();
                    }
                } catch (Throwable unused) {
                }
            }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo64119a(com.yandex.metrica.impl.p265ob.C10675Qi r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0013 }
            com.yandex.metrica.impl.ob.r r0 = r1.f28757a     // Catch:{ all -> 0x0010 }
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x000e
            com.yandex.metrica.impl.ob.p r2 = r2.mo62011c()     // Catch:{ all -> 0x0013 }
            r0.mo60944a(r2)     // Catch:{ all -> 0x0013 }
        L_0x000e:
            monitor-exit(r1)
            return
        L_0x0010:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            throw r2     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11970y3.mo64119a(com.yandex.metrica.impl.ob.Qi):void");
    }
}
