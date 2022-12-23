package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.util.Pair;
import com.yandex.metrica.impl.p265ob.C10140Bi;
import com.yandex.metrica.impl.p265ob.C11060b2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.lg */
public class C11493lg {

    /* renamed from: i */
    private static final Map<C10140Bi.C10141a, C11060b2.C11064d> f27663i = Collections.unmodifiableMap(new C11494a());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f27664a;

    /* renamed from: b */
    private final C10662Q9<C11498e> f27665b;

    /* renamed from: c */
    private final C11769sn f27666c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10433Kh f27667d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10490M2 f27668e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C11921wm f27669f;

    /* renamed from: g */
    private C11498e f27670g;

    /* renamed from: h */
    private boolean f27671h = false;

    /* renamed from: com.yandex.metrica.impl.ob.lg$a */
    class C11494a extends HashMap<C10140Bi.C10141a, C11060b2.C11064d> {
        C11494a() {
            put(C10140Bi.C10141a.CELL, C11060b2.C11064d.CELL);
            put(C10140Bi.C10141a.WIFI, C11060b2.C11064d.WIFI);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$b */
    class C11495b implements Runnable {
        C11495b() {
        }

        public void run() {
            C11493lg.m29737a(C11493lg.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$c */
    class C11496c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f27673a;

        /* renamed from: b */
        final /* synthetic */ C10675Qi f27674b;

        C11496c(List list, C10675Qi qi) {
            this.f27673a = list;
            this.f27674b = qi;
        }

        public void run() {
            C11493lg.m29739a(C11493lg.this, this.f27673a, this.f27674b.mo61988C());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$d */
    class C11497d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11498e.C11499a f27676a;

        C11497d(C11498e.C11499a aVar) {
            this.f27676a = aVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(13:8|9|10|(5:13|14|15|16|11)|28|17|18|19|20|21|22|23|24) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00d2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                com.yandex.metrica.impl.ob.lg r0 = com.yandex.metrica.impl.p265ob.C11493lg.this
                com.yandex.metrica.impl.ob.M2 r0 = r0.f27668e
                boolean r0 = r0.mo61775e()
                if (r0 != 0) goto L_0x00e3
                com.yandex.metrica.impl.ob.lg r0 = com.yandex.metrica.impl.p265ob.C11493lg.this
                com.yandex.metrica.impl.ob.Kh r0 = r0.f27667d
                com.yandex.metrica.impl.ob.lg$e$a r1 = r6.f27676a
                r0.mo61669b(r1)
                com.yandex.metrica.impl.ob.lg$e$b r0 = new com.yandex.metrica.impl.ob.lg$e$b
                com.yandex.metrica.impl.ob.lg$e$a r1 = r6.f27676a
                r0.<init>(r1)
                com.yandex.metrica.impl.ob.lg r1 = com.yandex.metrica.impl.p265ob.C11493lg.this
                com.yandex.metrica.impl.ob.wm r1 = r1.f27669f
                com.yandex.metrica.impl.ob.lg r2 = com.yandex.metrica.impl.p265ob.C11493lg.this
                android.content.Context r2 = r2.f27664a
                com.yandex.metrica.impl.ob.rm r1 = (com.yandex.metrica.impl.p265ob.C11724rm) r1
                r1.getClass()
                com.yandex.metrica.impl.ob.b2$d r1 = com.yandex.metrica.impl.p265ob.C11060b2.m28557a((android.content.Context) r2)
                r0.mo63295a((com.yandex.metrica.impl.p265ob.C11060b2.C11064d) r1)
                com.yandex.metrica.impl.ob.b2$d r2 = com.yandex.metrica.impl.p265ob.C11060b2.C11064d.OFFLINE
                if (r1 != r2) goto L_0x0041
                com.yandex.metrica.impl.ob.lg$e$b$a r1 = com.yandex.metrica.impl.p265ob.C11493lg.C11498e.C11500b.C11501a.OFFLINE
                r0.mo63296a((com.yandex.metrica.impl.p265ob.C11493lg.C11498e.C11500b.C11501a) r1)
                goto L_0x00de
            L_0x0041:
                com.yandex.metrica.impl.ob.lg$e$a r2 = r6.f27676a
                java.util.List<com.yandex.metrica.impl.ob.b2$d> r2 = r2.f27685f
                boolean r1 = r2.contains(r1)
                if (r1 != 0) goto L_0x0052
                com.yandex.metrica.impl.ob.lg$e$b$a r1 = com.yandex.metrica.impl.p265ob.C11493lg.C11498e.C11500b.C11501a.INCOMPATIBLE_NETWORK_TYPE
                r0.mo63296a((com.yandex.metrica.impl.p265ob.C11493lg.C11498e.C11500b.C11501a) r1)
                goto L_0x00de
            L_0x0052:
                com.yandex.metrica.impl.ob.lg$e$b$a r1 = com.yandex.metrica.impl.p265ob.C11493lg.C11498e.C11500b.C11501a.ERROR
                r0.mo63296a((com.yandex.metrica.impl.p265ob.C11493lg.C11498e.C11500b.C11501a) r1)
                com.yandex.metrica.impl.ob.P0 r1 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()     // Catch:{ all -> 0x00da }
                com.yandex.metrica.impl.ob.Zd r1 = r1.mo61896x()     // Catch:{ all -> 0x00da }
                com.yandex.metrica.impl.ob.lg$e$a r2 = r6.f27676a     // Catch:{ all -> 0x00da }
                java.lang.String r2 = r2.f27681b     // Catch:{ all -> 0x00da }
                javax.net.ssl.HttpsURLConnection r1 = r1.mo62577a((java.lang.String) r2)     // Catch:{ all -> 0x00da }
                com.yandex.metrica.impl.ob.lg$e$a r2 = r6.f27676a     // Catch:{ all -> 0x00da }
                com.yandex.metrica.impl.ob.Zm<java.lang.String, java.lang.String> r2 = r2.f27683d     // Catch:{ all -> 0x00da }
                java.util.Set r2 = r2.mo62602a()     // Catch:{ all -> 0x00da }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00da }
            L_0x0073:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00da }
                if (r3 == 0) goto L_0x0095
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00da }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00da }
                java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00da }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00da }
                java.lang.String r5 = ","
                java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00da }
                java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x00da }
                java.lang.String r3 = android.text.TextUtils.join(r5, r3)     // Catch:{ all -> 0x00da }
                r1.setRequestProperty(r4, r3)     // Catch:{ all -> 0x00da }
                goto L_0x0073
            L_0x0095:
                r2 = 1
                r1.setInstanceFollowRedirects(r2)     // Catch:{ all -> 0x00da }
                com.yandex.metrica.impl.ob.lg$e$a r2 = r6.f27676a     // Catch:{ all -> 0x00da }
                java.lang.String r2 = r2.f27682c     // Catch:{ all -> 0x00da }
                r1.setRequestMethod(r2)     // Catch:{ all -> 0x00da }
                int r2 = com.yandex.metrica.impl.p265ob.C10839Vd.C10840a.f26007a     // Catch:{ all -> 0x00da }
                r1.setConnectTimeout(r2)     // Catch:{ all -> 0x00da }
                r1.setReadTimeout(r2)     // Catch:{ all -> 0x00da }
                r1.connect()     // Catch:{ all -> 0x00da }
                int r2 = r1.getResponseCode()     // Catch:{ all -> 0x00da }
                com.yandex.metrica.impl.ob.lg$e$b$a r3 = com.yandex.metrica.impl.p265ob.C11493lg.C11498e.C11500b.C11501a.COMPLETE     // Catch:{ all -> 0x00da }
                r0.mo63296a((com.yandex.metrica.impl.p265ob.C11493lg.C11498e.C11500b.C11501a) r3)     // Catch:{ all -> 0x00da }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00da }
                r0.mo63297a((java.lang.Integer) r2)     // Catch:{ all -> 0x00da }
                r2 = 102400(0x19000, float:1.43493E-40)
                java.io.InputStream r3 = r1.getInputStream()     // Catch:{ IOException -> 0x00c8 }
                byte[] r3 = com.yandex.metrica.impl.p265ob.C10823V0.m27967a((java.io.InputStream) r3, (int) r2)     // Catch:{ IOException -> 0x00c8 }
                r0.f27690e = r3     // Catch:{ IOException -> 0x00c8 }
            L_0x00c8:
                java.io.InputStream r3 = r1.getErrorStream()     // Catch:{ IOException -> 0x00d2 }
                byte[] r2 = com.yandex.metrica.impl.p265ob.C10823V0.m27967a((java.io.InputStream) r3, (int) r2)     // Catch:{ IOException -> 0x00d2 }
                r0.f27691f = r2     // Catch:{ IOException -> 0x00d2 }
            L_0x00d2:
                java.util.Map r1 = r1.getHeaderFields()     // Catch:{ all -> 0x00da }
                r0.mo63299a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r1)     // Catch:{ all -> 0x00da }
                goto L_0x00de
            L_0x00da:
                r1 = move-exception
                r0.mo63298a((java.lang.Throwable) r1)
            L_0x00de:
                com.yandex.metrica.impl.ob.lg r1 = com.yandex.metrica.impl.p265ob.C11493lg.this
                com.yandex.metrica.impl.p265ob.C11493lg.m29738a(r1, r0)
            L_0x00e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11493lg.C11497d.run():void");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$e */
    public static class C11498e {

        /* renamed from: a */
        private final List<C11499a> f27678a;

        /* renamed from: b */
        private final LinkedHashMap<String, Object> f27679b = new LinkedHashMap<>();

        /* renamed from: com.yandex.metrica.impl.ob.lg$e$a */
        public static class C11499a {

            /* renamed from: a */
            public final String f27680a;

            /* renamed from: b */
            public final String f27681b;

            /* renamed from: c */
            public final String f27682c;

            /* renamed from: d */
            public final C11007Zm<String, String> f27683d;

            /* renamed from: e */
            public final long f27684e;

            /* renamed from: f */
            public final List<C11060b2.C11064d> f27685f;

            public C11499a(String str, String str2, String str3, C11007Zm<String, String> zm, long j, List<C11060b2.C11064d> list) {
                this.f27680a = str;
                this.f27681b = str2;
                this.f27682c = str3;
                this.f27684e = j;
                this.f27685f = list;
                this.f27683d = zm;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C11499a.class != obj.getClass()) {
                    return false;
                }
                return this.f27680a.equals(((C11499a) obj).f27680a);
            }

            public int hashCode() {
                return this.f27680a.hashCode();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.lg$e$b */
        public static class C11500b {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public final C11499a f27686a;

            /* renamed from: b */
            private C11501a f27687b;

            /* renamed from: c */
            private C11060b2.C11064d f27688c;

            /* renamed from: d */
            private Integer f27689d;

            /* renamed from: e */
            byte[] f27690e;

            /* renamed from: f */
            byte[] f27691f;

            /* renamed from: g */
            private Map<String, List<String>> f27692g;

            /* renamed from: h */
            private Throwable f27693h;

            /* renamed from: com.yandex.metrica.impl.ob.lg$e$b$a */
            public enum C11501a {
                OFFLINE,
                INCOMPATIBLE_NETWORK_TYPE,
                COMPLETE,
                ERROR
            }

            public C11500b(C11499a aVar) {
                this.f27686a = aVar;
            }

            /* renamed from: b */
            public byte[] mo63300b() {
                return this.f27691f;
            }

            /* renamed from: c */
            public Throwable mo63301c() {
                return this.f27693h;
            }

            /* renamed from: d */
            public C11499a mo63302d() {
                return this.f27686a;
            }

            /* renamed from: e */
            public byte[] mo63303e() {
                return this.f27690e;
            }

            /* renamed from: f */
            public Integer mo63304f() {
                return this.f27689d;
            }

            /* renamed from: g */
            public Map<String, List<String>> mo63305g() {
                return this.f27692g;
            }

            /* renamed from: h */
            public C11501a mo63306h() {
                return this.f27687b;
            }

            /* renamed from: a */
            public void mo63296a(C11501a aVar) {
                this.f27687b = aVar;
            }

            /* renamed from: a */
            public C11060b2.C11064d mo63294a() {
                return this.f27688c;
            }

            /* renamed from: a */
            public void mo63295a(C11060b2.C11064d dVar) {
                this.f27688c = dVar;
            }

            /* renamed from: a */
            public void mo63297a(Integer num) {
                this.f27689d = num;
            }

            /* renamed from: a */
            public void mo63299a(Map<String, List<String>> map) {
                this.f27692g = map;
            }

            /* renamed from: a */
            public void mo63298a(Throwable th) {
                this.f27693h = th;
            }
        }

        public C11498e(List<C11499a> list, List<String> list2) {
            this.f27678a = list;
            if (!C10796U2.m27896b((Collection) list2)) {
                for (String put : list2) {
                    this.f27679b.put(put, new Object());
                }
            }
        }

        /* renamed from: a */
        public boolean mo63289a(C11499a aVar) {
            if (this.f27679b.get(aVar.f27680a) != null || this.f27678a.contains(aVar)) {
                return false;
            }
            this.f27678a.add(aVar);
            return true;
        }

        /* renamed from: b */
        public List<C11499a> mo63290b() {
            return this.f27678a;
        }

        /* renamed from: b */
        public void mo63291b(C11499a aVar) {
            this.f27679b.put(aVar.f27680a, new Object());
            this.f27678a.remove(aVar);
        }

        /* renamed from: a */
        public Set<String> mo63288a() {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (String add : this.f27679b.keySet()) {
                hashSet.add(add);
                i++;
                if (i > 1000) {
                    break;
                }
            }
            return hashSet;
        }
    }

    public C11493lg(Context context, C10662Q9<C11498e> q9, C10490M2 m2, C10433Kh kh, C11769sn snVar, C11921wm wmVar) {
        this.f27664a = context;
        this.f27665b = q9;
        this.f27668e = m2;
        this.f27667d = kh;
        this.f27670g = (C11498e) q9.mo61953b();
        this.f27666c = snVar;
        this.f27669f = wmVar;
    }

    /* renamed from: a */
    static void m29739a(C11493lg lgVar, List list, long j) {
        Long l;
        lgVar.getClass();
        if (!C10796U2.m27896b((Collection) list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C10140Bi bi = (C10140Bi) it.next();
                if (!(bi.f24407a == null || bi.f24408b == null || bi.f24409c == null || (l = bi.f24411e) == null || l.longValue() < 0 || C10796U2.m27896b((Collection) bi.f24412f))) {
                    String str = bi.f24407a;
                    String str2 = bi.f24408b;
                    String str3 = bi.f24409c;
                    List<Pair<String, String>> list2 = bi.f24410d;
                    C11007Zm zm = new C11007Zm(false);
                    for (Pair next : list2) {
                        zm.mo62601a(next.first, next.second);
                    }
                    long millis = TimeUnit.SECONDS.toMillis(bi.f24411e.longValue() + j);
                    List<C10140Bi.C10141a> list3 = bi.f24412f;
                    ArrayList arrayList = new ArrayList(list3.size());
                    for (C10140Bi.C10141a aVar : list3) {
                        arrayList.add(f27663i.get(aVar));
                    }
                    lgVar.m29740a(new C11498e.C11499a(str, str2, str3, zm, millis, arrayList));
                }
            }
        }
    }

    /* renamed from: b */
    private void m29742b(C11498e.C11499a aVar) {
        long max = Math.max(aVar.f27684e - System.currentTimeMillis(), 0);
        ((C11725rn) this.f27666c).mo63613a(new C11497d(aVar), Math.max(C11892w.f28609c, max));
    }

    /* renamed from: a */
    public synchronized void mo63283a() {
        ((C11725rn) this.f27666c).execute(new C11495b());
    }

    /* renamed from: a */
    static void m29737a(C11493lg lgVar) {
        if (!lgVar.f27671h) {
            C11498e eVar = (C11498e) lgVar.f27665b.mo61953b();
            lgVar.f27670g = eVar;
            for (C11498e.C11499a b : eVar.mo63290b()) {
                lgVar.m29742b(b);
            }
            lgVar.f27671h = true;
        }
    }

    /* renamed from: a */
    public synchronized void mo63284a(C10675Qi qi) {
        List<C10140Bi> I = qi.mo61994I();
        ((C11725rn) this.f27666c).execute(new C11496c(I, qi));
    }

    /* renamed from: a */
    private boolean m29740a(C11498e.C11499a aVar) {
        boolean a = this.f27670g.mo63289a(aVar);
        if (a) {
            m29742b(aVar);
            this.f27667d.mo61667a(aVar);
        }
        this.f27665b.mo61952a(this.f27670g);
        return a;
    }

    /* renamed from: a */
    static void m29738a(C11493lg lgVar, C11498e.C11500b bVar) {
        synchronized (lgVar) {
            lgVar.f27670g.mo63291b(bVar.f27686a);
            lgVar.f27665b.mo61952a(lgVar.f27670g);
            lgVar.f27667d.mo61668a(bVar);
        }
    }
}
