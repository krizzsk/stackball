package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Ug */
public class C10813Ug {

    /* renamed from: a */
    private final Set<C10854Vg> f25951a;

    /* renamed from: b */
    private C10255Fg f25952b;

    /* renamed from: c */
    private boolean f25953c;

    /* renamed from: d */
    private final C10332H8 f25954d;

    /* renamed from: e */
    private final Context f25955e;

    /* renamed from: com.yandex.metrica.impl.ob.Ug$a */
    public interface C10814a {
        /* renamed from: a */
        void mo62363a(C10255Fg fg);
    }

    public C10813Ug(Context context) {
        this(context, C10619P0.m27164i().mo61897y().mo61658a());
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
    /* renamed from: a */
    public synchronized void mo62360a(com.yandex.metrica.impl.p265ob.C10255Fg r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f25952b = r3     // Catch:{ all -> 0x002f }
            r0 = 1
            r2.f25953c = r0     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.H8 r1 = r2.f25954d     // Catch:{ all -> 0x002f }
            r1.mo61431a((com.yandex.metrica.impl.p265ob.C10255Fg) r3)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.H8 r3 = r2.f25954d     // Catch:{ all -> 0x002f }
            r3.mo61434a((boolean) r0)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.Fg r3 = r2.f25952b     // Catch:{ all -> 0x002f }
            monitor-enter(r2)     // Catch:{ all -> 0x002f }
            java.util.Set<com.yandex.metrica.impl.ob.Vg> r0 = r2.f25951a     // Catch:{ all -> 0x002c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002c }
        L_0x0019:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002c }
            com.yandex.metrica.impl.ob.Vg r1 = (com.yandex.metrica.impl.p265ob.C10854Vg) r1     // Catch:{ all -> 0x002c }
            r1.mo62393a(r3)     // Catch:{ all -> 0x002c }
            goto L_0x0019
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r2)
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            throw r3     // Catch:{ all -> 0x002f }
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10813Ug.mo62360a(com.yandex.metrica.impl.ob.Fg):void");
    }

    /* renamed from: b */
    public void mo62362b() {
        if (!this.f25953c) {
            Context context = this.f25955e;
            C10619P0 i = C10619P0.m27164i();
            Intrinsics.checkNotNullExpressionValue(i, "GlobalServiceLocator.getInstance()");
            C12039zn s = i.mo61891s();
            Intrinsics.checkNotNullExpressionValue(s, "GlobalServiceLocator.get…).serviceExecutorProvider");
            new C10606Og(this, new C10962Yg(context, s.mo64207b()), new C10371Ig(context), new C10998Zg(context, (C10898Wn) null, (C10868W0) null, 6)).mo61861b();
        }
    }

    C10813Ug(Context context, C10332H8 h8) {
        this.f25951a = new HashSet();
        this.f25955e = context;
        this.f25954d = h8;
        this.f25952b = h8.mo61440g();
        this.f25953c = h8.mo61441h();
    }

    /* renamed from: a */
    public C10255Fg mo62359a() {
        return this.f25952b;
    }

    /* renamed from: a */
    public synchronized void mo62361a(C10854Vg vg) {
        this.f25951a.add(vg);
        if (this.f25953c) {
            vg.mo62393a(this.f25952b);
        }
    }
}
