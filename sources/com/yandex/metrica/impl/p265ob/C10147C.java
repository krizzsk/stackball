package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11962y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.C */
public class C10147C implements C11962y.C11964b {

    /* renamed from: a */
    private final List<C10943Y1<C11699r0>> f24424a;

    /* renamed from: b */
    private volatile C11699r0 f24425b;

    /* renamed from: c */
    private final C11962y f24426c;

    /* renamed from: d */
    private final C11769sn f24427d;

    /* renamed from: com.yandex.metrica.impl.ob.C$a */
    class C10148a implements C10943Y1<C11699r0> {

        /* renamed from: a */
        final /* synthetic */ String f24428a;

        C10148a(C10147C c, String str) {
            this.f24428a = str;
        }

        /* renamed from: b */
        public void mo61124b(Object obj) {
            ((C11699r0) obj).mo63566b(this.f24428a);
        }
    }

    public C10147C(C11769sn snVar) {
        this(snVar, C10941Y.m28234g().mo62498b());
    }

    /* renamed from: a */
    public void mo61121a() {
        this.f24426c.mo64107a((C11962y.C11964b) this, C11962y.C11963a.CREATED);
    }

    C10147C(C11769sn snVar, C11962y yVar) {
        this.f24424a = new ArrayList();
        this.f24425b = null;
        this.f24427d = snVar;
        this.f24426c = yVar;
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
    public void mo61123a(com.yandex.metrica.impl.p265ob.C11699r0 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f24425b = r3     // Catch:{ all -> 0x002a }
            monitor-enter(r2)     // Catch:{ all -> 0x002a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0027 }
            java.util.List<com.yandex.metrica.impl.ob.Y1<com.yandex.metrica.impl.ob.r0>> r1 = r2.f24424a     // Catch:{ all -> 0x0027 }
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            java.util.List<com.yandex.metrica.impl.ob.Y1<com.yandex.metrica.impl.ob.r0>> r1 = r2.f24424a     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            com.yandex.metrica.impl.ob.Y1 r1 = (com.yandex.metrica.impl.p265ob.C10943Y1) r1
            r1.mo61124b(r3)
            goto L_0x0016
        L_0x0026:
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002a }
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10147C.mo61123a(com.yandex.metrica.impl.ob.r0):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61122a(android.app.Activity r3, com.yandex.metrica.impl.p265ob.C11962y.C11963a r4) {
        /*
            r2 = this;
            r4 = 0
            if (r3 == 0) goto L_0x0008
            android.content.Intent r3 = r3.getIntent()     // Catch:{ all -> 0x0008 }
            goto L_0x0009
        L_0x0008:
            r3 = r4
        L_0x0009:
            if (r3 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            java.lang.String r4 = r3.getDataString()
        L_0x0010:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x0037
            com.yandex.metrica.impl.ob.C$a r3 = new com.yandex.metrica.impl.ob.C$a
            r3.<init>(r2, r4)
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.r0 r4 = r2.f24425b     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0026
            java.util.List<com.yandex.metrica.impl.ob.Y1<com.yandex.metrica.impl.ob.r0>> r4 = r2.f24424a     // Catch:{ all -> 0x0034 }
            r4.add(r3)     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x0026:
            com.yandex.metrica.impl.ob.sn r0 = r2.f24427d     // Catch:{ all -> 0x0034 }
            com.yandex.metrica.impl.ob.B r1 = new com.yandex.metrica.impl.ob.B     // Catch:{ all -> 0x0034 }
            r1.<init>(r2, r3, r4)     // Catch:{ all -> 0x0034 }
            com.yandex.metrica.impl.ob.rn r0 = (com.yandex.metrica.impl.p265ob.C11725rn) r0     // Catch:{ all -> 0x0034 }
            r0.execute(r1)     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r2)
            goto L_0x0037
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10147C.mo61122a(android.app.Activity, com.yandex.metrica.impl.ob.y$a):void");
    }
}
