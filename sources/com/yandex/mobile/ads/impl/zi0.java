package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.yandex.mobile.ads.base.C12135y;
import com.yandex.mobile.ads.impl.h41;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class zi0 implements tv0 {

    /* renamed from: a */
    private final Context f43131a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C15318b f43132b = new C15318b(Looper.getMainLooper());

    /* renamed from: c */
    private final oe1 f43133c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f43134d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<C15317a> f43135e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List<C15317a> f43136f;

    /* renamed from: g */
    private final wd0 f43137g;

    /* renamed from: h */
    private final C12356a5 f43138h;

    /* renamed from: i */
    private final l71 f43139i;

    /* renamed from: j */
    private xd0 f43140j;

    /* renamed from: k */
    private boolean f43141k;

    /* renamed from: l */
    private int f43142l;

    /* renamed from: m */
    private boolean f43143m;

    /* renamed from: n */
    private boolean f43144n;

    /* renamed from: com.yandex.mobile.ads.impl.zi0$a */
    static class C15317a {

        /* renamed from: a */
        String f43145a;

        /* renamed from: b */
        long f43146b;

        /* renamed from: c */
        int f43147c;

        C15317a(String str, long j, int i) {
            this.f43145a = str;
            this.f43146b = j;
            this.f43147c = i;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zi0$b */
    private static class C15318b extends Handler {
        C15318b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            zi0 zi0;
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                zi0 zi02 = (zi0) ((WeakReference) pair.first).get();
                if (zi02 != null) {
                    C15317a aVar = (C15317a) pair.second;
                    String unused = zi02.f43134d;
                    zi02.f43135e.remove(aVar);
                    C12135y a = zi0.m44637a(zi02, aVar);
                    zi0.m44639a(zi02, aVar, a);
                    if (zi02.m44642b(a)) {
                        zi02.f43136f.remove(aVar);
                        if (zi02.f43136f.isEmpty()) {
                            zi02.mo71219a(a.mo64678c());
                            return;
                        }
                        return;
                    }
                    zi02.mo69631b();
                }
            } else if (i == 2 && (zi0 = (zi0) ((WeakReference) message.obj).get()) != null) {
                zi0.f43136f.size();
                String unused2 = zi0.f43134d;
                int size = zi0.f43136f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C15317a aVar2 = (C15317a) zi0.f43136f.get(i2);
                    if (!zi0.f43135e.contains(aVar2)) {
                        C12135y a2 = zi0.m44637a(zi0, aVar2);
                        if (zi0.m44642b(a2)) {
                            zi0.f43132b.sendMessageDelayed(Message.obtain(zi0.f43132b, 1, new Pair(new WeakReference(zi0), aVar2)), aVar2.f43146b);
                            zi0.f43135e.add(aVar2);
                            zi0.mo71220b(a2.mo64679d());
                        } else {
                            zi0.mo71218a(a2);
                        }
                    }
                }
                if (zi0.m44645e(zi0)) {
                    zi0.f43132b.sendMessageDelayed(Message.obtain(zi0.f43132b, 2, new WeakReference(zi0)), 300);
                }
            }
        }
    }

    zi0(Context context, C14645t1 t1Var, wd0 wd0, oe1 oe1, String str) {
        this.f43131a = context;
        this.f43133c = oe1;
        this.f43137g = wd0;
        this.f43134d = str;
        this.f43135e = new ArrayList();
        this.f43136f = new ArrayList();
        this.f43138h = new C12356a5(context, t1Var);
        this.f43139i = l71.m38631c();
    }

    /* renamed from: e */
    static boolean m44645e(zi0 zi0) {
        boolean z;
        synchronized (zi0) {
            z = zi0.f43136f.size() > zi0.f43135e.size();
        }
        return z;
    }

    /* renamed from: a */
    static void m44639a(zi0 zi0, C15317a aVar, C12135y yVar) {
        synchronized (zi0) {
            if (zi0.m44642b(yVar)) {
                zi0.f43138h.mo65674a(aVar.f43145a);
            } else {
                zi0.mo71218a(yVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public synchronized void mo69631b() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.yandex.mobile.ads.base.v r0 = com.yandex.mobile.ads.base.C12130v.m31590a()     // Catch:{ all -> 0x0044 }
            android.content.Context r1 = r4.f43131a     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.mo64672b(r1)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            r0 = 1
            java.util.Collection[] r1 = new java.util.Collection[r0]     // Catch:{ all -> 0x0044 }
            java.util.List<com.yandex.mobile.ads.impl.zi0$a> r2 = r4.f43136f     // Catch:{ all -> 0x0044 }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x0044 }
            boolean r1 = com.yandex.mobile.ads.impl.C13378i5.m37281a((java.util.Collection[]) r1)     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x0042
            monitor-enter(r4)     // Catch:{ all -> 0x0044 }
            java.util.List<com.yandex.mobile.ads.impl.zi0$a> r1 = r4.f43136f     // Catch:{ all -> 0x003f }
            int r1 = r1.size()     // Catch:{ all -> 0x003f }
            java.util.List<com.yandex.mobile.ads.impl.zi0$a> r2 = r4.f43135e     // Catch:{ all -> 0x003f }
            int r2 = r2.size()     // Catch:{ all -> 0x003f }
            if (r1 <= r2) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            monitor-exit(r4)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.yandex.mobile.ads.impl.zi0$b r0 = r4.f43132b     // Catch:{ all -> 0x0044 }
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0044 }
            r1.<init>(r4)     // Catch:{ all -> 0x0044 }
            r2 = 2
            android.os.Message r1 = android.os.Message.obtain(r0, r2, r1)     // Catch:{ all -> 0x0044 }
            r0.sendMessage(r1)     // Catch:{ all -> 0x0044 }
            goto L_0x0042
        L_0x003f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zi0.mo69631b():void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public synchronized void mo69633c() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.List<com.yandex.mobile.ads.impl.zi0$a> r0 = r8.f43136f     // Catch:{ all -> 0x00ac }
            r0.size()     // Catch:{ all -> 0x00ac }
            r8.mo69625a()     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.h41$b r0 = com.yandex.mobile.ads.impl.h41.C13276b.IMPRESSION_TRACKING_SUCCESS     // Catch:{ all -> 0x00ac }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ac }
            r1.<init>()     // Catch:{ all -> 0x00ac }
            r2 = 0
            r8.f43144n = r2     // Catch:{ all -> 0x00ac }
            java.util.List<com.yandex.mobile.ads.impl.zi0$a> r3 = r8.f43136f     // Catch:{ all -> 0x00ac }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00ac }
        L_0x0019:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.zi0$a r4 = (com.yandex.mobile.ads.impl.zi0.C15317a) r4     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.l71 r5 = r8.f43139i     // Catch:{ all -> 0x00ac }
            android.content.Context r6 = r8.f43131a     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.d71 r5 = r5.mo68362a((android.content.Context) r6)     // Catch:{ all -> 0x00ac }
            if (r5 == 0) goto L_0x0034
            boolean r5 = r5.mo66473u()     // Catch:{ all -> 0x00ac }
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x0040
            com.yandex.mobile.ads.impl.oe1 r5 = r8.f43133c     // Catch:{ all -> 0x00ac }
            int r6 = r4.f43147c     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.base.y r5 = r5.mo68679b(r6)     // Catch:{ all -> 0x00ac }
            goto L_0x0048
        L_0x0040:
            com.yandex.mobile.ads.impl.oe1 r5 = r8.f43133c     // Catch:{ all -> 0x00ac }
            int r6 = r4.f43147c     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.base.y r5 = r5.mo68678a(r6)     // Catch:{ all -> 0x00ac }
        L_0x0048:
            com.yandex.mobile.ads.base.y$a r6 = r5.mo64680e()     // Catch:{ all -> 0x00ac }
            r6.mo64681a()     // Catch:{ all -> 0x00ac }
            monitor-enter(r8)     // Catch:{ all -> 0x00ac }
            monitor-enter(r8)     // Catch:{ all -> 0x008e }
            boolean r6 = r8.m44642b((com.yandex.mobile.ads.base.C12135y) r5)     // Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x005f
            com.yandex.mobile.ads.impl.a5 r6 = r8.f43138h     // Catch:{ all -> 0x008b }
            java.lang.String r7 = r4.f43145a     // Catch:{ all -> 0x008b }
            r6.mo65674a(r7)     // Catch:{ all -> 0x008b }
            goto L_0x0062
        L_0x005f:
            r8.mo71218a((com.yandex.mobile.ads.base.C12135y) r5)     // Catch:{ all -> 0x008b }
        L_0x0062:
            monitor-exit(r8)     // Catch:{ all -> 0x008e }
            boolean r6 = r8.f43144n     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x0075
            boolean r6 = r8.m44642b((com.yandex.mobile.ads.base.C12135y) r5)     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x0075
            com.yandex.mobile.ads.impl.wd0 r6 = r8.f43137g     // Catch:{ all -> 0x008e }
            r6.mo70678b(r5)     // Catch:{ all -> 0x008e }
            r6 = 1
            r8.f43144n = r6     // Catch:{ all -> 0x008e }
        L_0x0075:
            monitor-exit(r8)     // Catch:{ all -> 0x00ac }
            boolean r6 = r8.m44642b((com.yandex.mobile.ads.base.C12135y) r5)     // Catch:{ all -> 0x00ac }
            if (r6 == 0) goto L_0x0019
            r1.add(r4)     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.h41$b r0 = r5.mo64678c()     // Catch:{ all -> 0x00ac }
            com.yandex.mobile.ads.impl.h41$b r4 = r5.mo64679d()     // Catch:{ all -> 0x00ac }
            r8.mo71220b((com.yandex.mobile.ads.impl.h41.C13276b) r4)     // Catch:{ all -> 0x00ac }
            goto L_0x0019
        L_0x008b:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x0091:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00ac }
            if (r2 != 0) goto L_0x00a7
            java.util.List<com.yandex.mobile.ads.impl.zi0$a> r2 = r8.f43136f     // Catch:{ all -> 0x00ac }
            r2.removeAll(r1)     // Catch:{ all -> 0x00ac }
            java.util.List<com.yandex.mobile.ads.impl.zi0$a> r1 = r8.f43136f     // Catch:{ all -> 0x00ac }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x00a7
            r8.mo71219a((com.yandex.mobile.ads.impl.h41.C13276b) r0)     // Catch:{ all -> 0x00ac }
        L_0x00a7:
            r8.mo69631b()     // Catch:{ all -> 0x00ac }
            monitor-exit(r8)
            return
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zi0.mo69633c():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m44642b(C12135y yVar) {
        return yVar.mo64680e() == C12135y.C12136a.SUCCESS;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo71220b(h41.C13276b bVar) {
        if (!this.f43143m) {
            this.f43137g.mo70677a(bVar);
            c21.m34569b("Ad binding successful", new Object[0]);
            this.f43143m = true;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo69627a(com.yandex.mobile.ads.base.AdResponse r6, java.util.List<com.yandex.mobile.ads.impl.k81> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.mobile.ads.impl.wd0 r0 = r5.f43137g     // Catch:{ all -> 0x0045 }
            r0.mo70675a((com.yandex.mobile.ads.base.AdResponse) r6)     // Catch:{ all -> 0x0045 }
            java.util.List<com.yandex.mobile.ads.impl.zi0$a> r6 = r5.f43136f     // Catch:{ all -> 0x0045 }
            r6.clear()     // Catch:{ all -> 0x0045 }
            r6 = 0
            r5.f43142l = r6     // Catch:{ all -> 0x0045 }
            r5.f43141k = r6     // Catch:{ all -> 0x0045 }
            r5.f43143m = r6     // Catch:{ all -> 0x0045 }
            r5.f43144n = r6     // Catch:{ all -> 0x0045 }
            r5.mo69625a()     // Catch:{ all -> 0x0045 }
            monitor-enter(r5)     // Catch:{ all -> 0x0045 }
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x0042 }
        L_0x001c:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0042 }
            if (r7 == 0) goto L_0x003f
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0042 }
            com.yandex.mobile.ads.impl.k81 r7 = (com.yandex.mobile.ads.impl.k81) r7     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r7.mo68162b()     // Catch:{ all -> 0x0042 }
            long r1 = r7.mo68158a()     // Catch:{ all -> 0x0042 }
            int r7 = r7.mo68163c()     // Catch:{ all -> 0x0042 }
            java.util.List<com.yandex.mobile.ads.impl.zi0$a> r3 = r5.f43136f     // Catch:{ all -> 0x0042 }
            com.yandex.mobile.ads.impl.zi0$a r4 = new com.yandex.mobile.ads.impl.zi0$a     // Catch:{ all -> 0x0042 }
            r4.<init>(r0, r1, r7)     // Catch:{ all -> 0x0042 }
            r3.add(r4)     // Catch:{ all -> 0x0042 }
            goto L_0x001c
        L_0x003f:
            monitor-exit(r5)     // Catch:{ all -> 0x0045 }
            monitor-exit(r5)
            return
        L_0x0042:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0045 }
            throw r6     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zi0.mo69627a(com.yandex.mobile.ads.base.AdResponse, java.util.List):void");
    }

    /* renamed from: a */
    public synchronized void mo69625a() {
        this.f43132b.removeMessages(2);
        this.f43132b.removeMessages(1);
        this.f43135e.clear();
    }

    /* renamed from: a */
    static C12135y m44637a(zi0 zi0, C15317a aVar) {
        C12135y b = zi0.f43133c.mo68679b(aVar.f43147c);
        b.mo64680e().getClass();
        return b;
    }

    /* renamed from: a */
    public synchronized void mo69626a(Intent intent, boolean z) {
        String action = intent.getAction();
        action.getClass();
        char c = 65535;
        int hashCode = action.hashCode();
        if (hashCode != -2128145023) {
            if (hashCode != -1454123155) {
                if (hashCode == 823795052) {
                    if (action.equals("android.intent.action.USER_PRESENT")) {
                        c = 2;
                    }
                }
            } else if (action.equals("android.intent.action.SCREEN_ON")) {
                c = 1;
            }
        } else if (action.equals("android.intent.action.SCREEN_OFF")) {
            c = 0;
        }
        if (c == 0) {
            mo69625a();
        } else if (c == 1 || c == 2) {
            if (z) {
                mo69631b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo71219a(h41.C13276b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("failure_tracked", Boolean.valueOf(this.f43141k));
        this.f43137g.mo70679b(bVar, hashMap);
        xd0 xd0 = this.f43140j;
        if (xd0 != null) {
            xd0.mo69956f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo71218a(C12135y yVar) {
        int i = this.f43142l + 1;
        this.f43142l = i;
        if (i == 20) {
            this.f43137g.mo70680c(yVar);
            this.f43141k = true;
        }
    }

    /* renamed from: a */
    public void mo69630a(xd0 xd0) {
        this.f43140j = xd0;
    }
}
