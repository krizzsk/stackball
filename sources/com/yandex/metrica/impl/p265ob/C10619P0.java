package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10490M2;
import com.yandex.metrica.impl.p265ob.C10501Ma;
import com.yandex.metrica.impl.p265ob.C11196ec;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.P0 */
public final class C10619P0 {

    /* renamed from: y */
    private static volatile C10619P0 f25364y;

    /* renamed from: a */
    private final Context f25365a;

    /* renamed from: b */
    private volatile C10813Ug f25366b;

    /* renamed from: c */
    private volatile C10433Kh f25367c;

    /* renamed from: d */
    private volatile C11493lg f25368d;

    /* renamed from: e */
    private volatile C10631Pb f25369e;

    /* renamed from: f */
    private volatile C10490M2 f25370f;

    /* renamed from: g */
    private C11892w f25371g;

    /* renamed from: h */
    private volatile C10192Dh f25372h;

    /* renamed from: i */
    private volatile C10479M0 f25373i;

    /* renamed from: j */
    private volatile C12039zn f25374j = new C12039zn();

    /* renamed from: k */
    private volatile C11991yk f25375k;

    /* renamed from: l */
    private volatile C10474M f25376l;

    /* renamed from: m */
    private volatile C10176D2 f25377m;

    /* renamed from: n */
    private volatile C10688R1 f25378n;

    /* renamed from: o */
    private volatile C10956Yc f25379o;

    /* renamed from: p */
    private volatile C11196ec f25380p;

    /* renamed from: q */
    private volatile C11344ic f25381q;

    /* renamed from: r */
    private volatile C11099c2 f25382r;

    /* renamed from: s */
    private volatile C10651Q f25383s;

    /* renamed from: t */
    private volatile C10364I9 f25384t;

    /* renamed from: u */
    private volatile C10423K8 f25385u;

    /* renamed from: v */
    private C11969y2 f25386v;

    /* renamed from: w */
    private C11575o1 f25387w;

    /* renamed from: x */
    private C10990Zd f25388x;

    private C10619P0(Context context) {
        this.f25365a = context;
        this.f25387w = new C11575o1(context, this.f25374j.mo64207b());
        this.f25376l = new C10474M(this.f25374j.mo64207b(), this.f25387w.mo63392b());
        this.f25371g = new C11892w();
        this.f25386v = new C11969y2();
    }

    /* renamed from: A */
    private void m27162A() {
        if (this.f25382r == null) {
            synchronized (this) {
                if (this.f25382r == null) {
                    C10662Q9<C10135Be> a = C10501Ma.C10503b.m26925a(C10135Be.class).mo61785a(this.f25365a);
                    C10135Be be = (C10135Be) a.mo61953b();
                    Context context = this.f25365a;
                    C10369Ie ie = new C10369Ie();
                    C10108Ae ae = new C10108Ae(be);
                    C10549Ne ne = new C10549Ne();
                    C10338He he = new C10338He(this.f25365a);
                    C10619P0 i = m27164i();
                    Intrinsics.checkNotNullExpressionValue(i, "GlobalServiceLocator.getInstance()");
                    C10364I9 u = i.mo61893u();
                    Intrinsics.checkNotNullExpressionValue(u, "GlobalServiceLocator.get…ance().servicePreferences");
                    this.f25382r = new C11099c2(context, a, ie, ae, ne, he, new C10403Je(u), new C10163Ce(), be, "[PreloadInfoStorage]");
                }
            }
        }
    }

    /* renamed from: a */
    public static void m27163a(Context context) {
        if (f25364y == null) {
            synchronized (C10619P0.class) {
                if (f25364y == null) {
                    f25364y = new C10619P0(context.getApplicationContext());
                }
            }
        }
    }

    /* renamed from: i */
    public static C10619P0 m27164i() {
        return f25364y;
    }

    /* renamed from: b */
    public C11344ic mo61875b() {
        if (this.f25381q == null) {
            synchronized (this) {
                if (this.f25381q == null) {
                    this.f25381q = new C11344ic(this.f25365a, C11378jc.m29290a());
                }
            }
        }
        return this.f25381q;
    }

    /* renamed from: c */
    public C10199E mo61876c() {
        return this.f25387w.mo63390a();
    }

    /* renamed from: d */
    public C10474M mo61877d() {
        return this.f25376l;
    }

    /* renamed from: e */
    public C10651Q mo61878e() {
        if (this.f25383s == null) {
            synchronized (this) {
                if (this.f25383s == null) {
                    C10662Q9<C10622P3> a = C10501Ma.C10503b.m26925a(C10622P3.class).mo61785a(this.f25365a);
                    this.f25383s = new C10651Q(this.f25365a, a, new C10656Q3(), new C10445L3(), new C10739S3(), new C11803u2(this.f25365a), new C10692R3(mo61893u()), new C10493M3(), (C10622P3) a.mo61953b(), "[ClidsInfoStorage]");
                }
            }
        }
        return this.f25383s;
    }

    /* renamed from: f */
    public Context mo61879f() {
        return this.f25365a;
    }

    /* renamed from: g */
    public C10631Pb mo61880g() {
        if (this.f25369e == null) {
            synchronized (this) {
                if (this.f25369e == null) {
                    this.f25369e = new C10631Pb(this.f25387w.mo63390a(), new C10546Nb());
                }
            }
        }
        return this.f25369e;
    }

    /* renamed from: h */
    public C10479M0 mo61881h() {
        if (this.f25373i == null) {
            synchronized (this) {
                if (this.f25373i == null) {
                    this.f25373i = new C10479M0();
                }
            }
        }
        return this.f25373i;
    }

    /* renamed from: j */
    public C11575o1 mo61882j() {
        return this.f25387w;
    }

    /* renamed from: k */
    public C10956Yc mo61883k() {
        C10956Yc yc = this.f25379o;
        if (yc == null) {
            synchronized (this) {
                yc = this.f25379o;
                if (yc == null) {
                    yc = new C10956Yc(this.f25365a);
                    this.f25379o = yc;
                }
            }
        }
        return yc;
    }

    /* renamed from: l */
    public C10688R1 mo61884l() {
        return this.f25378n;
    }

    /* renamed from: m */
    public C11099c2 mo61885m() {
        m27162A();
        return this.f25382r;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: n */
    public com.yandex.metrica.impl.p265ob.C11493lg mo61886n() {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.lg r0 = r8.f25368d
            if (r0 != 0) goto L_0x004a
            monitor-enter(r8)
            com.yandex.metrica.impl.ob.lg r0 = r8.f25368d     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0045
            com.yandex.metrica.impl.ob.lg r0 = new com.yandex.metrica.impl.ob.lg     // Catch:{ all -> 0x0047 }
            android.content.Context r2 = r8.f25365a     // Catch:{ all -> 0x0047 }
            java.lang.Class<com.yandex.metrica.impl.ob.lg$e> r1 = com.yandex.metrica.impl.p265ob.C11493lg.C11498e.class
            com.yandex.metrica.impl.ob.Ma r1 = com.yandex.metrica.impl.p265ob.C10501Ma.C10503b.m26925a(r1)     // Catch:{ all -> 0x0047 }
            android.content.Context r3 = r8.f25365a     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.Q9 r3 = r1.mo61785a(r3)     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.M2 r4 = r8.mo61894v()     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.Kh r1 = r8.f25367c     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0032
            monitor-enter(r8)     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.Kh r1 = r8.f25367c     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x002d
            com.yandex.metrica.impl.ob.Kh r1 = new com.yandex.metrica.impl.ob.Kh     // Catch:{ all -> 0x002f }
            r1.<init>()     // Catch:{ all -> 0x002f }
            r8.f25367c = r1     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0032
        L_0x002f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0032:
            com.yandex.metrica.impl.ob.Kh r5 = r8.f25367c     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.zn r1 = r8.f25374j     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.sn r6 = r1.mo64214h()     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.rm r7 = new com.yandex.metrica.impl.ob.rm     // Catch:{ all -> 0x0047 }
            r7.<init>()     // Catch:{ all -> 0x0047 }
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0047 }
            r8.f25368d = r0     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r8)     // Catch:{ all -> 0x0047 }
            goto L_0x004a
        L_0x0047:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0047 }
            throw r0
        L_0x004a:
            com.yandex.metrica.impl.ob.lg r0 = r8.f25368d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10619P0.mo61886n():com.yandex.metrica.impl.ob.lg");
    }

    /* renamed from: o */
    public C10813Ug mo61887o() {
        if (this.f25366b == null) {
            synchronized (this) {
                if (this.f25366b == null) {
                    this.f25366b = new C10813Ug(this.f25365a);
                }
            }
        }
        return this.f25366b;
    }

    /* renamed from: p */
    public C11969y2 mo61888p() {
        return this.f25386v;
    }

    /* renamed from: q */
    public C10192Dh mo61889q() {
        if (this.f25372h == null) {
            synchronized (this) {
                if (this.f25372h == null) {
                    this.f25372h = new C10192Dh(this.f25365a, this.f25374j.mo64214h());
                }
            }
        }
        return this.f25372h;
    }

    /* renamed from: r */
    public synchronized C10176D2 mo61890r() {
        return this.f25377m;
    }

    /* renamed from: s */
    public C12039zn mo61891s() {
        return this.f25374j;
    }

    /* renamed from: t */
    public C11196ec mo61892t() {
        if (this.f25380p == null) {
            synchronized (this) {
                if (this.f25380p == null) {
                    this.f25380p = new C11196ec(new C11196ec.C11204h(), new C11196ec.C11200d(), new C11196ec.C11199c(), this.f25374j.mo64207b(), "ServiceInternal");
                }
            }
        }
        return this.f25380p;
    }

    /* renamed from: u */
    public C10364I9 mo61893u() {
        if (this.f25384t == null) {
            synchronized (this) {
                if (this.f25384t == null) {
                    this.f25384t = new C10364I9(C10663Qa.m27298a(this.f25365a).mo61966i());
                }
            }
        }
        return this.f25384t;
    }

    /* renamed from: v */
    public C10490M2 mo61894v() {
        if (this.f25370f == null) {
            synchronized (this) {
                if (this.f25370f == null) {
                    this.f25370f = new C10490M2(new C10490M2.C10492b(mo61893u()));
                }
            }
        }
        return this.f25370f;
    }

    /* renamed from: w */
    public C11991yk mo61895w() {
        if (this.f25375k == null) {
            synchronized (this) {
                if (this.f25375k == null) {
                    this.f25375k = new C11991yk(this.f25365a, this.f25374j.mo64216j());
                }
            }
        }
        return this.f25375k;
    }

    /* renamed from: x */
    public synchronized C10990Zd mo61896x() {
        if (this.f25388x == null) {
            this.f25388x = new C10990Zd(this.f25365a, new C10957Yd(), new C10925Xd());
        }
        return this.f25388x;
    }

    /* renamed from: y */
    public synchronized C10423K8 mo61897y() {
        if (this.f25385u == null) {
            this.f25385u = new C10423K8(this.f25365a);
        }
        return this.f25385u;
    }

    /* renamed from: z */
    public synchronized void mo61898z() {
        mo61886n().mo63283a();
        m27162A();
        if (this.f25378n == null) {
            C10688R1 r1 = new C10688R1(this.f25365a, this.f25374j.mo64215i(), mo61893u());
            r1.setName(C11922wn.m30801a("YMM-NC"));
            this.f25387w.mo63391a(r1);
            r1.start();
            this.f25378n = r1;
        }
        mo61883k().mo62537b();
    }

    /* renamed from: a */
    public C11892w mo61872a() {
        return this.f25371g;
    }

    /* renamed from: a */
    public synchronized void mo61874a(C10675Qi qi) {
        if (this.f25380p != null) {
            this.f25380p.mo62819a(qi);
        }
        if (this.f25372h != null) {
            this.f25372h.mo61198b(qi);
        }
        if (this.f25373i != null) {
            this.f25373i.mo61756a(qi);
        }
        if (this.f25369e != null) {
            this.f25369e.mo61914b(qi);
        }
        C10990Zd zd = this.f25388x;
        if (zd != null) {
            zd.mo62578a(qi);
        }
    }

    /* renamed from: a */
    public synchronized void mo61873a(C10205E2 e2) {
        this.f25377m = new C10176D2(this.f25365a, e2);
    }
}
