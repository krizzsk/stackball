package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10258Fi;
import com.yandex.metrica.impl.p265ob.C10675Qi;
import com.yandex.metrica.impl.p265ob.C10726Ri;
import com.yandex.metrica.impl.p265ob.C11464kh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: com.yandex.metrica.impl.ob.Si */
public class C10757Si {

    /* renamed from: a */
    private final C11101c4 f25790a;

    /* renamed from: b */
    private final C10645Pi f25791b;

    /* renamed from: c */
    private final C10675Qi.C10677b f25792c;

    /* renamed from: d */
    private volatile C10417K2 f25793d;

    /* renamed from: e */
    private C10316Gi f25794e;

    /* renamed from: f */
    private final C10616Om f25795f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10651Q f25796g;

    /* renamed from: h */
    private final C11719ri f25797h;

    /* renamed from: i */
    private final C10238F3 f25798i;

    /* renamed from: com.yandex.metrica.impl.ob.Si$a */
    class C10758a implements Function0<C10651Q> {
        C10758a() {
        }

        public Object invoke() {
            return C10757Si.this.f25796g;
        }
    }

    public C10757Si(Context context, String str, C11464kh.C11466b bVar, C10645Pi pi) {
        this(context, new C10945Y3(str), bVar, pi, new C10675Qi.C10677b(context), new C11827um(context), new C10580Nm(), C10619P0.m27164i().mo61878e(), new C11719ri(), C10238F3.m26224a());
    }

    /* renamed from: b */
    public synchronized C10417K2 mo62240b() {
        if (!mo62242d()) {
            return null;
        }
        if (this.f25793d == null) {
            this.f25793d = new C10417K2(this, (C11464kh) this.f25794e.mo62907b());
        }
        return this.f25793d;
    }

    /* renamed from: c */
    public C10675Qi mo62241c() {
        return this.f25794e.mo62909d();
    }

    /* renamed from: d */
    public synchronized boolean mo62242d() {
        boolean b;
        C10675Qi d = this.f25794e.mo62909d();
        b = C10612Oi.m27149b(d);
        if (!b && !(!C10612Oi.m27146a(d)) && !this.f25797h.mo63604a(((C11464kh) this.f25794e.mo62907b()).mo63225D(), d, this.f25796g)) {
            b = true;
        }
        return b;
    }

    /* renamed from: a */
    private void m27723a(C11827um umVar, C10227Ej ej, C10675Qi qi) {
        C10675Qi.C10676a a = qi.mo62009a();
        if (!C10612Oi.m27148a(qi.mo62007V())) {
            a = a.mo62084l(ej.mo61244a().f26933a);
        }
        String a2 = umVar.mo63814a();
        if (!C10612Oi.m27148a(qi.mo62017i())) {
            a = a.mo62066c(a2).mo62071e("");
        }
        if (!C10612Oi.m27148a(qi.mo62018j())) {
            a = a.mo62069d(a2);
        }
        C10675Qi a3 = a.mo62058a();
        m27724b(a3);
        m27722a(a3);
    }

    /* renamed from: b */
    private synchronized void m27724b(C10675Qi qi) {
        this.f25794e.mo62904a(qi);
        this.f25792c.mo62086a(qi);
        C10619P0.m27164i().mo61874a(qi);
        this.f25798i.mo61255a((C10327H3) new C10418K3(this.f25790a.mo62716b(), qi));
    }

    private C10757Si(Context context, C11101c4 c4Var, C11464kh.C11466b bVar, C10645Pi pi, C10675Qi.C10677b bVar2, C11827um umVar, C10616Om om, C10651Q q, C11719ri riVar, C10238F3 f3) {
        this(context, c4Var, bVar, pi, bVar2, bVar2.mo62085a(), umVar, om, q, riVar, f3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C10757Si(android.content.Context r14, com.yandex.metrica.impl.p265ob.C11101c4 r15, com.yandex.metrica.impl.p265ob.C11464kh.C11466b r16, com.yandex.metrica.impl.p265ob.C10645Pi r17, com.yandex.metrica.impl.p265ob.C10675Qi.C10677b r18, com.yandex.metrica.impl.p265ob.C10675Qi r19, com.yandex.metrica.impl.p265ob.C11827um r20, com.yandex.metrica.impl.p265ob.C10616Om r21, com.yandex.metrica.impl.p265ob.C10651Q r22, com.yandex.metrica.impl.p265ob.C11719ri r23, com.yandex.metrica.impl.p265ob.C10238F3 r24) {
        /*
            r13 = this;
            r1 = r14
            com.yandex.metrica.impl.ob.Gi r7 = new com.yandex.metrica.impl.ob.Gi
            com.yandex.metrica.impl.ob.kh$c r0 = new com.yandex.metrica.impl.ob.kh$c
            java.lang.String r2 = r15.mo62716b()
            r0.<init>(r14, r2)
            r2 = r16
            r5 = r19
            r7.<init>(r0, r5, r2)
            com.yandex.metrica.impl.ob.Fj r0 = com.yandex.metrica.impl.p265ob.C10261Fj.m26320a(r14)
            com.yandex.metrica.impl.ob.Jj r2 = new com.yandex.metrica.impl.ob.Jj
            r4 = r18
            r2.<init>(r4)
            com.yandex.metrica.impl.ob.Ej r11 = r0.mo61332a(r14, r2)
            r0 = r13
            r2 = r15
            r3 = r17
            r6 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r12 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10757Si.<init>(android.content.Context, com.yandex.metrica.impl.ob.c4, com.yandex.metrica.impl.ob.kh$b, com.yandex.metrica.impl.ob.Pi, com.yandex.metrica.impl.ob.Qi$b, com.yandex.metrica.impl.ob.Qi, com.yandex.metrica.impl.ob.um, com.yandex.metrica.impl.ob.Om, com.yandex.metrica.impl.ob.Q, com.yandex.metrica.impl.ob.ri, com.yandex.metrica.impl.ob.F3):void");
    }

    /* renamed from: a */
    public C11101c4 mo62235a() {
        return this.f25790a;
    }

    /* renamed from: a */
    public void mo62236a(C10342Hi hi) {
        ArrayList<C10466Li> arrayList;
        synchronized (this) {
            this.f25793d = null;
        }
        C10645Pi pi = this.f25791b;
        String b = this.f25790a.mo62716b();
        C10675Qi d = this.f25794e.mo62909d();
        C10258Fi.C10259a aVar = (C10258Fi.C10259a) pi;
        synchronized (C10258Fi.this.f24697b) {
            Collection a = C10258Fi.this.f24696a.mo62600a(b);
            if (a == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = new ArrayList<>(a);
            }
        }
        for (C10466Li a2 : arrayList) {
            a2.mo61737a(hi, d);
        }
    }

    C10757Si(Context context, C11101c4 c4Var, C10645Pi pi, C10675Qi.C10677b bVar, C10675Qi qi, C11827um umVar, C10316Gi gi, C10616Om om, C10651Q q, C11719ri riVar, C10227Ej ej, C10238F3 f3) {
        this.f25790a = c4Var;
        this.f25791b = pi;
        this.f25792c = bVar;
        this.f25794e = gi;
        this.f25795f = om;
        this.f25796g = q;
        this.f25797h = riVar;
        this.f25798i = f3;
        m27723a(umVar, ej, qi);
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
    /* renamed from: a */
    public void mo62238a(com.yandex.metrica.impl.p265ob.C11885vj r6, com.yandex.metrica.impl.p265ob.C11464kh r7, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.yandex.metrica.impl.p265ob.C10796U2.m27897b((java.util.Map) r8)     // Catch:{ all -> 0x005f }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "Date"
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x005f }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x005f }
            boolean r0 = com.yandex.metrica.impl.p265ob.C10796U2.m27896b((java.util.Collection) r8)     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0033
            r0 = 0
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0033 }
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x0033 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0033 }
            java.util.Date r8 = r0.parse(r8)     // Catch:{ all -> 0x0033 }
            long r2 = r8.getTime()     // Catch:{ all -> 0x0033 }
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r8 = r1
        L_0x0034:
            r2 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x005f }
            if (r8 != 0) goto L_0x003d
            r8 = r0
        L_0x003d:
            java.lang.Long r0 = r6.mo63922M()     // Catch:{ all -> 0x005f }
            com.yandex.metrica.impl.ob.Lm r2 = com.yandex.metrica.impl.p265ob.C10470Lm.m26853c()     // Catch:{ all -> 0x005f }
            long r3 = r8.longValue()     // Catch:{ all -> 0x005f }
            r2.mo61744a(r3, r0)     // Catch:{ all -> 0x005f }
            com.yandex.metrica.impl.ob.Qi r6 = r5.mo62234a((com.yandex.metrica.impl.p265ob.C11885vj) r6, (com.yandex.metrica.impl.p265ob.C11464kh) r7, (java.lang.Long) r8)     // Catch:{ all -> 0x005f }
            monitor-enter(r5)     // Catch:{ all -> 0x005f }
            r5.f25793d = r1     // Catch:{ all -> 0x005c }
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            r5.m27724b(r6)     // Catch:{ all -> 0x005f }
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            r5.m27722a((com.yandex.metrica.impl.p265ob.C10675Qi) r6)
            return
        L_0x005c:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            throw r6     // Catch:{ all -> 0x005f }
        L_0x005f:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10757Si.mo62238a(com.yandex.metrica.impl.ob.vj, com.yandex.metrica.impl.ob.kh, java.util.Map):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10675Qi mo62234a(C11885vj vjVar, C11464kh khVar, Long l) {
        boolean z;
        String c = C11993ym.m30987c(khVar.mo63225D());
        Map<String, String> b = khVar.mo63224C().mo61907b();
        String n = vjVar.mo63979n();
        String o = this.f25794e.mo62909d().mo62023o();
        if (!C11993ym.m30991d(C11993ym.m30966a(n))) {
            n = C11993ym.m30991d(C11993ym.m30966a(o)) ? o : null;
        }
        String i = this.f25794e.mo62909d().mo62017i();
        if (TextUtils.isEmpty(i)) {
            i = vjVar.mo63974i();
        }
        C10675Qi d = this.f25794e.mo62909d();
        C10675Qi.C10676a i2 = new C10675Qi.C10676a(new C10726Ri.C10728b(vjVar.mo63962e())).mo62066c(i).mo62071e(vjVar.mo63971h()).mo62064c(this.f25795f.mo61841b()).mo62069d(d.mo62018j()).mo62084l(d.mo62007V()).mo62075g(vjVar.mo63980o()).mo62067c(vjVar.mo63915F()).mo62062b(khVar.mo63232K()).mo62080i(vjVar.mo63989x()).mo62072e(vjVar.mo63983r()).mo62081j(vjVar.mo63988w()).mo62083k(vjVar.mo63912C()).mo62054a(vjVar.mo63959d()).mo62055a(vjVar.mo63975j()).mo62076g(vjVar.mo63985t()).mo62056a((Map<String, ? extends List<String>>) vjVar.mo63968g()).mo62073f(n).mo62079i(c);
        this.f25797h.getClass();
        Map<String, String> a = C11993ym.m30966a(n);
        if (C10796U2.m27897b((Map) b)) {
            z = C10796U2.m27897b((Map) a);
        } else {
            z = a.equals(b);
        }
        C10675Qi.C10676a a2 = i2.mo62068c(z).mo62077h(C11993ym.m30987c(b)).mo62041a(vjVar.mo63913D()).mo62070d((List<? extends C10883Wc>) vjVar.mo63982q()).mo62040a(vjVar.mo63923N()).mo62082j((List<? extends C10140Bi>) vjVar.mo63990y()).mo62061b(vjVar.mo63965f()).mo62037a(vjVar.mo63987v()).mo62078h((List<? extends C11347ie>) vjVar.mo63986u()).mo62039a(vjVar.mo63911B()).mo62045a(vjVar.mo63916G()).mo62057a(true);
        Long valueOf = Long.valueOf((System.currentTimeMillis() / 1000) * 1000);
        if (l != null) {
            valueOf = l;
        }
        return a2.mo62059b(valueOf.longValue()).mo62036a(((C11464kh) this.f25794e.mo62907b()).mo63235a(l.longValue())).mo62063b(false).mo62053a(vjVar.mo63981p()).mo62038a(vjVar.mo63910A()).mo62048a(vjVar.mo63920K()).mo62060b(vjVar.mo63919J()).mo62065c(vjVar.mo63921L()).mo62043a(vjVar.mo63918I()).mo62046a(vjVar.mo63917H()).mo62051a(vjVar.mo63955c()).mo62047a(vjVar.mo63976k()).mo62074f(vjVar.mo63984s()).mo62050a(vjVar.mo63951b()).mo62049a(vjVar.mo63925a()).mo62042a(vjVar.mo63977l()).mo62052a(vjVar.mo63978m()).mo62044a(vjVar.mo63914E()).mo62058a();
    }

    /* renamed from: a */
    private void m27722a(C10675Qi qi) {
        ArrayList<C10466Li> arrayList;
        C10645Pi pi = this.f25791b;
        String b = this.f25790a.mo62716b();
        C10258Fi.C10259a aVar = (C10258Fi.C10259a) pi;
        synchronized (C10258Fi.this.f24697b) {
            C10675Qi unused = C10258Fi.this.f24698c = qi;
            Collection a = C10258Fi.this.f24696a.mo62600a(b);
            if (a == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = new ArrayList<>(a);
            }
        }
        for (C10466Li a2 : arrayList) {
            a2.mo61738a(qi);
        }
    }

    /* renamed from: a */
    public synchronized boolean mo62239a(List<String> list, Map<String, String> map) {
        return !C10612Oi.m27147a(this.f25794e.mo62909d(), list, map, new C10758a());
    }

    /* renamed from: a */
    public synchronized void mo62237a(C11464kh.C11466b bVar) {
        this.f25794e.mo61399a(bVar);
        C11464kh khVar = (C11464kh) this.f25794e.mo62907b();
        if (khVar.mo63233L()) {
            boolean z = false;
            List<String> H = khVar.mo63229H();
            boolean z2 = true;
            C10675Qi.C10676a aVar = null;
            if (C10796U2.m27896b((Collection) H) && !C10796U2.m27896b((Collection) khVar.mo63232K())) {
                aVar = this.f25794e.mo62909d().mo62009a().mo62062b((List<String>) null);
                z = true;
            }
            if (C10796U2.m27896b((Collection) H) || C10796U2.m27892a((Object) H, (Object) khVar.mo63232K())) {
                z2 = z;
            } else {
                aVar = this.f25794e.mo62909d().mo62009a().mo62062b(H);
            }
            if (z2) {
                C10675Qi a = aVar.mo62058a();
                m27724b(a);
                m27722a(a);
            }
        }
    }
}
