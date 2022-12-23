package com.flurry.sdk;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.flurry.android.FlurryConfigListener;
import com.flurry.sdk.C2389b;
import com.flurry.sdk.C2649g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.flurry.sdk.d */
public class C2522d {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f5903b = C2522d.class.getSimpleName();

    /* renamed from: c */
    private static volatile C2522d f5904c;

    /* renamed from: j */
    private static final Object f5905j = new Object();

    /* renamed from: o */
    private static C2658n f5906o;

    /* renamed from: a */
    public C2593e f5907a;

    /* renamed from: d */
    private C2328a f5908d;

    /* renamed from: e */
    private C2651h f5909e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2657m f5910f;

    /* renamed from: g */
    private C2664s f5911g;

    /* renamed from: h */
    private final Map<FlurryConfigListener, Pair<C2653j, WeakReference<Handler>>> f5912h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Map<C2653j, Pair<Boolean, Boolean>> f5913i;

    /* renamed from: k */
    private volatile boolean f5914k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile boolean f5915l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile boolean f5916m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C2528a f5917n;

    /* renamed from: com.flurry.sdk.d$a */
    enum C2528a {
        Complete("Complete", 3),
        CompleteNoChange("No Change", 2),
        Fail("Fail", 1),
        None("None", 0);
        

        /* renamed from: e */
        int f5932e;

        /* renamed from: f */
        private String f5933f;

        private C2528a(String str, int i) {
            this.f5933f = str;
            this.f5932e = i;
        }

        public final String toString() {
            return this.f5933f;
        }
    }

    /* renamed from: a */
    public static synchronized C2522d m5445a() {
        C2522d h;
        synchronized (C2522d.class) {
            h = m5456h();
        }
        return h;
    }

    /* renamed from: h */
    private static synchronized C2522d m5456h() {
        C2522d dVar;
        synchronized (C2522d.class) {
            if (f5904c == null) {
                f5904c = new C2522d((byte) 0);
            }
            dVar = f5904c;
        }
        return dVar;
    }

    private C2522d() {
        this((byte) 0);
    }

    private C2522d(byte b) {
        this.f5912h = new ConcurrentHashMap();
        this.f5913i = new HashMap();
        this.f5914k = false;
        this.f5915l = false;
        this.f5916m = false;
        this.f5917n = C2528a.None;
        f5906o = null;
        for (C2653j put : C2653j.m5758a()) {
            Map<C2653j, Pair<Boolean, Boolean>> map = this.f5913i;
            Boolean bool = Boolean.FALSE;
            map.put(put, new Pair(bool, bool));
        }
        this.f5909e = new C2651h();
        this.f5910f = new C2657m();
        this.f5907a = new C2593e();
        this.f5911g = new C2664s();
        C2662r.m5794a((Runnable) new Runnable() {
            /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
                jadx.core.utils.exceptions.JadxOverflowException: 
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            public final void run() {
                /*
                    r8 = this;
                    r0 = 1
                    com.flurry.sdk.ck r1 = com.flurry.sdk.C2494ck.m5371a()     // Catch:{ Exception -> 0x00cc }
                    android.content.Context r1 = r1.f5832a     // Catch:{ Exception -> 0x00cc }
                    java.lang.String r1 = com.flurry.sdk.C2665t.m5812b(r1)     // Catch:{ Exception -> 0x00cc }
                    java.lang.String r2 = com.flurry.sdk.C2522d.f5903b     // Catch:{ Exception -> 0x00cc }
                    java.lang.String r3 = "Cached Data: "
                    java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00cc }
                    java.lang.String r3 = r3.concat(r4)     // Catch:{ Exception -> 0x00cc }
                    com.flurry.sdk.C2530db.m5476a(r2, r3)     // Catch:{ Exception -> 0x00cc }
                    if (r1 == 0) goto L_0x0086
                    com.flurry.sdk.d r2 = com.flurry.sdk.C2522d.this     // Catch:{ Exception -> 0x00cc }
                    com.flurry.sdk.e r2 = r2.f5907a     // Catch:{ Exception -> 0x00cc }
                    java.lang.String r2 = r2.mo17797d()     // Catch:{ Exception -> 0x00cc }
                    com.flurry.sdk.d r3 = com.flurry.sdk.C2522d.this     // Catch:{ Exception -> 0x00cc }
                    com.flurry.sdk.e r3 = r3.f5907a     // Catch:{ Exception -> 0x00cc }
                    android.content.SharedPreferences r4 = r3.f6067b     // Catch:{ Exception -> 0x00cc }
                    r5 = 0
                    if (r4 == 0) goto L_0x003b
                    android.content.SharedPreferences r3 = r3.f6067b     // Catch:{ Exception -> 0x00cc }
                    java.lang.String r4 = "lastRSA"
                    java.lang.String r5 = r3.getString(r4, r5)     // Catch:{ Exception -> 0x00cc }
                L_0x003b:
                    boolean r2 = com.flurry.sdk.C2665t.m5810a(r2, r1, r5)     // Catch:{ Exception -> 0x00cc }
                    if (r2 == 0) goto L_0x006b
                    com.flurry.sdk.d r2 = com.flurry.sdk.C2522d.this     // Catch:{ Exception -> 0x00cc }
                    com.flurry.sdk.m r2 = r2.f5910f     // Catch:{ Exception -> 0x00cc }
                    if (r1 == 0) goto L_0x005e
                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0056 }
                    r3.<init>(r1)     // Catch:{ Exception -> 0x0056 }
                    java.util.List r1 = com.flurry.sdk.C2638f.m5739a(r3)     // Catch:{ Exception -> 0x0056 }
                    r2.mo17856a((java.util.List<com.flurry.sdk.C2656l>) r1)     // Catch:{ Exception -> 0x0056 }
                    goto L_0x005e
                L_0x0056:
                    r1 = move-exception
                    java.lang.String r3 = com.flurry.sdk.C2657m.f6246a     // Catch:{ Exception -> 0x00cc }
                    java.lang.String r4 = "Cached variants parsing error: "
                    com.flurry.sdk.C2530db.m5477a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Throwable) r1)     // Catch:{ Exception -> 0x00cc }
                L_0x005e:
                    com.flurry.sdk.n r1 = com.flurry.sdk.C2522d.m5448b()     // Catch:{ Exception -> 0x00cc }
                    if (r1 == 0) goto L_0x0086
                    com.flurry.sdk.C2522d.m5448b()     // Catch:{ Exception -> 0x00cc }
                    com.flurry.sdk.C2658n.m5785a(r2)     // Catch:{ Exception -> 0x00cc }
                    goto L_0x0086
                L_0x006b:
                    java.lang.String r1 = com.flurry.sdk.C2522d.f5903b     // Catch:{ Exception -> 0x00cc }
                    java.lang.String r2 = "Incorrect signature for cache."
                    com.flurry.sdk.C2530db.m5482b(r1, r2)     // Catch:{ Exception -> 0x00cc }
                    com.flurry.sdk.ck r1 = com.flurry.sdk.C2494ck.m5371a()     // Catch:{ Exception -> 0x00cc }
                    android.content.Context r1 = r1.f5832a     // Catch:{ Exception -> 0x00cc }
                    com.flurry.sdk.C2665t.m5816c(r1)     // Catch:{ Exception -> 0x00cc }
                    com.flurry.sdk.d r1 = com.flurry.sdk.C2522d.this     // Catch:{ Exception -> 0x00cc }
                    com.flurry.sdk.e r1 = r1.f5907a     // Catch:{ Exception -> 0x00cc }
                    r1.mo17796c()     // Catch:{ Exception -> 0x00cc }
                L_0x0086:
                    com.flurry.sdk.d r1 = com.flurry.sdk.C2522d.this
                    com.flurry.sdk.C2522d.m5450c(r1)
                    com.flurry.sdk.d r1 = com.flurry.sdk.C2522d.this
                    com.flurry.sdk.m r1 = r1.f5910f
                    int r1 = r1.mo17862e()
                    if (r1 <= 0) goto L_0x0119
                    com.flurry.sdk.d r1 = com.flurry.sdk.C2522d.this
                    com.flurry.sdk.m r1 = r1.f5910f
                    java.util.List r1 = r1.mo17861d()
                    java.util.Iterator r1 = r1.iterator()
                L_0x00a5:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x00c9
                    java.lang.Object r2 = r1.next()
                    com.flurry.sdk.j r2 = (com.flurry.sdk.C2653j) r2
                    com.flurry.sdk.d r3 = com.flurry.sdk.C2522d.this
                    java.util.Map r3 = r3.f5913i
                    android.util.Pair r4 = new android.util.Pair
                    java.lang.Boolean r5 = java.lang.Boolean.TRUE
                    java.lang.Boolean r6 = java.lang.Boolean.FALSE
                    r4.<init>(r5, r6)
                    r3.put(r2, r4)
                    com.flurry.sdk.d r3 = com.flurry.sdk.C2522d.this
                    r3.mo17737a((com.flurry.sdk.C2653j) r2, (boolean) r0)
                    goto L_0x00a5
                L_0x00c9:
                    return
                L_0x00ca:
                    r1 = move-exception
                    goto L_0x011a
                L_0x00cc:
                    r1 = move-exception
                    java.lang.String r2 = com.flurry.sdk.C2522d.f5903b     // Catch:{ all -> 0x00ca }
                    java.lang.String r3 = "Exception!"
                    com.flurry.sdk.C2530db.m5477a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x00ca }
                    com.flurry.sdk.d r1 = com.flurry.sdk.C2522d.this
                    com.flurry.sdk.C2522d.m5450c(r1)
                    com.flurry.sdk.d r1 = com.flurry.sdk.C2522d.this
                    com.flurry.sdk.m r1 = r1.f5910f
                    int r1 = r1.mo17862e()
                    if (r1 <= 0) goto L_0x0119
                    com.flurry.sdk.d r1 = com.flurry.sdk.C2522d.this
                    com.flurry.sdk.m r1 = r1.f5910f
                    java.util.List r1 = r1.mo17861d()
                    java.util.Iterator r1 = r1.iterator()
                L_0x00f5:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0119
                    java.lang.Object r2 = r1.next()
                    com.flurry.sdk.j r2 = (com.flurry.sdk.C2653j) r2
                    com.flurry.sdk.d r3 = com.flurry.sdk.C2522d.this
                    java.util.Map r3 = r3.f5913i
                    android.util.Pair r4 = new android.util.Pair
                    java.lang.Boolean r5 = java.lang.Boolean.TRUE
                    java.lang.Boolean r6 = java.lang.Boolean.FALSE
                    r4.<init>(r5, r6)
                    r3.put(r2, r4)
                    com.flurry.sdk.d r3 = com.flurry.sdk.C2522d.this
                    r3.mo17737a((com.flurry.sdk.C2653j) r2, (boolean) r0)
                    goto L_0x00f5
                L_0x0119:
                    return
                L_0x011a:
                    com.flurry.sdk.d r2 = com.flurry.sdk.C2522d.this
                    com.flurry.sdk.C2522d.m5450c(r2)
                    com.flurry.sdk.d r2 = com.flurry.sdk.C2522d.this
                    com.flurry.sdk.m r2 = r2.f5910f
                    int r2 = r2.mo17862e()
                    if (r2 <= 0) goto L_0x015d
                    com.flurry.sdk.d r2 = com.flurry.sdk.C2522d.this
                    com.flurry.sdk.m r2 = r2.f5910f
                    java.util.List r2 = r2.mo17861d()
                    java.util.Iterator r2 = r2.iterator()
                L_0x0139:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x015d
                    java.lang.Object r3 = r2.next()
                    com.flurry.sdk.j r3 = (com.flurry.sdk.C2653j) r3
                    com.flurry.sdk.d r4 = com.flurry.sdk.C2522d.this
                    java.util.Map r4 = r4.f5913i
                    android.util.Pair r5 = new android.util.Pair
                    java.lang.Boolean r6 = java.lang.Boolean.TRUE
                    java.lang.Boolean r7 = java.lang.Boolean.FALSE
                    r5.<init>(r6, r7)
                    r4.put(r3, r5)
                    com.flurry.sdk.d r4 = com.flurry.sdk.C2522d.this
                    r4.mo17737a((com.flurry.sdk.C2653j) r3, (boolean) r0)
                    goto L_0x0139
                L_0x015d:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2522d.C25231.run():void");
            }
        });
    }

    /* renamed from: b */
    public static C2658n m5448b() {
        return f5906o;
    }

    /* renamed from: c */
    public final C2328a mo17739c() {
        if (this.f5908d == null) {
            m5458i();
            this.f5908d = new C2328a(this.f5909e, this.f5910f);
        }
        return this.f5908d;
    }

    /* renamed from: i */
    private void m5458i() {
        synchronized (f5905j) {
            while (!this.f5914k) {
                try {
                    f5905j.wait();
                } catch (InterruptedException e) {
                    C2530db.m5477a(f5903b, "Interrupted Exception!", (Throwable) e);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo17740d() {
        if (this.f5915l) {
            C2530db.m5474a(3, f5903b, "Preventing re-entry...");
            return;
        }
        this.f5915l = true;
        C2530db.m5474a(3, f5903b, "Fetch started");
        new C2389b(C2664s.m5804a(C2494ck.m5371a().f5832a, "https://cfg.flurry.com/sdk/v1/config"), new C2389b.C2393a() {
            /* renamed from: a */
            public final void mo17610a(C2649g gVar, boolean z) {
                C2528a aVar;
                if (!z) {
                    boolean unused = C2522d.this.f5915l = false;
                }
                if (gVar.f6214d == C2649g.C2650a.SUCCEED) {
                    C2530db.m5476a(C2522d.f5903b, "Fetch succeeded.");
                    aVar = C2528a.Complete;
                    boolean unused2 = C2522d.this.f5916m = true;
                    for (C2653j next : C2653j.m5758a()) {
                        boolean z2 = false;
                        if (C2522d.this.f5913i.containsKey(next)) {
                            z2 = ((Boolean) ((Pair) C2522d.this.f5913i.get(next)).first).booleanValue();
                        }
                        C2522d.this.f5913i.put(next, new Pair(Boolean.valueOf(z2), Boolean.FALSE));
                    }
                } else if (gVar.f6214d == C2649g.C2650a.NO_CHANGE) {
                    C2530db.m5476a(C2522d.f5903b, "Fetch finished.");
                    aVar = C2528a.CompleteNoChange;
                } else {
                    C2530db.m5476a(C2522d.f5903b, "Error occured while fetching: ".concat(String.valueOf(gVar)));
                    aVar = C2528a.Fail;
                }
                if (C2522d.this.f5917n.f5932e <= aVar.f5932e) {
                    C2528a unused3 = C2522d.this.f5917n = aVar;
                }
                C2522d.m5449b(C2522d.this, aVar);
            }
        }, this.f5907a, this.f5910f).mo17606a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17736a(com.flurry.android.FlurryConfigListener r5, com.flurry.sdk.C2653j r6, android.os.Handler r7) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<com.flurry.android.FlurryConfigListener, android.util.Pair<com.flurry.sdk.j, java.lang.ref.WeakReference<android.os.Handler>>> r0 = r4.f5912h
            monitor-enter(r0)
            java.util.Map<com.flurry.android.FlurryConfigListener, android.util.Pair<com.flurry.sdk.j, java.lang.ref.WeakReference<android.os.Handler>>> r1 = r4.f5912h     // Catch:{ all -> 0x008a }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0017
            java.lang.String r5 = f5903b     // Catch:{ all -> 0x008a }
            java.lang.String r6 = "The listener is already registered"
            com.flurry.sdk.C2530db.m5490e(r5, r6)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            return
        L_0x0017:
            java.util.Map<com.flurry.android.FlurryConfigListener, android.util.Pair<com.flurry.sdk.j, java.lang.ref.WeakReference<android.os.Handler>>> r1 = r4.f5912h     // Catch:{ all -> 0x008a }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x008a }
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x008a }
            r3.<init>(r7)     // Catch:{ all -> 0x008a }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x008a }
            r1.put(r5, r2)     // Catch:{ all -> 0x008a }
            int[] r7 = com.flurry.sdk.C2522d.C25275.f5926a     // Catch:{ all -> 0x008a }
            com.flurry.sdk.d$a r1 = r4.f5917n     // Catch:{ all -> 0x008a }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x008a }
            r7 = r7[r1]     // Catch:{ all -> 0x008a }
            r1 = 2
            if (r7 == r1) goto L_0x0044
            r1 = 3
            if (r7 == r1) goto L_0x0040
            r1 = 4
            if (r7 == r1) goto L_0x003a
            goto L_0x0047
        L_0x003a:
            boolean r7 = r4.f5915l     // Catch:{ all -> 0x008a }
            r5.onFetchError(r7)     // Catch:{ all -> 0x008a }
            goto L_0x0047
        L_0x0040:
            r5.onFetchNoChange()     // Catch:{ all -> 0x008a }
            goto L_0x0047
        L_0x0044:
            r5.onFetchSuccess()     // Catch:{ all -> 0x008a }
        L_0x0047:
            java.util.Map<com.flurry.sdk.j, android.util.Pair<java.lang.Boolean, java.lang.Boolean>> r7 = r4.f5913i     // Catch:{ all -> 0x008a }
            boolean r7 = r7.containsKey(r6)     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x007c
            java.util.Map<com.flurry.sdk.j, android.util.Pair<java.lang.Boolean, java.lang.Boolean>> r7 = r4.f5913i     // Catch:{ all -> 0x008a }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x008a }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ all -> 0x008a }
            java.lang.Object r7 = r6.first     // Catch:{ all -> 0x008a }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x008a }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x008a }
            if (r7 != 0) goto L_0x006b
            java.lang.Object r7 = r6.second     // Catch:{ all -> 0x008a }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x008a }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x0088
        L_0x006b:
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x008a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x008a }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x0077
            r6 = 1
            goto L_0x0078
        L_0x0077:
            r6 = 0
        L_0x0078:
            r5.onActivateComplete(r6)     // Catch:{ all -> 0x008a }
            goto L_0x0088
        L_0x007c:
            java.util.Map<com.flurry.sdk.j, android.util.Pair<java.lang.Boolean, java.lang.Boolean>> r5 = r4.f5913i     // Catch:{ all -> 0x008a }
            android.util.Pair r7 = new android.util.Pair     // Catch:{ all -> 0x008a }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            r7.<init>(r1, r1)     // Catch:{ all -> 0x008a }
            r5.put(r6, r7)     // Catch:{ all -> 0x008a }
        L_0x0088:
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            return
        L_0x008a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2522d.mo17736a(com.flurry.android.FlurryConfigListener, com.flurry.sdk.j, android.os.Handler):void");
    }

    /* renamed from: com.flurry.sdk.d$5 */
    static /* synthetic */ class C25275 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5926a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.flurry.sdk.d$a[] r0 = com.flurry.sdk.C2522d.C2528a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5926a = r0
                com.flurry.sdk.d$a r1 = com.flurry.sdk.C2522d.C2528a.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5926a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.flurry.sdk.d$a r1 = com.flurry.sdk.C2522d.C2528a.Complete     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5926a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.flurry.sdk.d$a r1 = com.flurry.sdk.C2522d.C2528a.CompleteNoChange     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5926a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.flurry.sdk.d$a r1 = com.flurry.sdk.C2522d.C2528a.Fail     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2522d.C25275.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo17735a(FlurryConfigListener flurryConfigListener) {
        if (flurryConfigListener != null) {
            synchronized (this.f5912h) {
                this.f5912h.remove(flurryConfigListener);
            }
        }
    }

    /* renamed from: a */
    public final void mo17737a(C2653j jVar, final boolean z) {
        synchronized (this.f5912h) {
            for (Map.Entry next : this.f5912h.entrySet()) {
                if (jVar == null || jVar == ((Pair) next.getValue()).first) {
                    final FlurryConfigListener flurryConfigListener = (FlurryConfigListener) next.getKey();
                    Handler handler = (Handler) ((WeakReference) ((Pair) next.getValue()).second).get();
                    C25264 r4 = new C2621eo() {
                        /* renamed from: a */
                        public final void mo17573a() {
                            flurryConfigListener.onActivateComplete(z);
                        }
                    };
                    if (handler == null) {
                        C2494ck.m5371a().mo17683a((Runnable) r4);
                    } else {
                        handler.post(r4);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final synchronized void mo17741e() {
        C2665t.m5816c(C2494ck.m5371a().f5832a);
        if (this.f5910f != null) {
            this.f5910f.mo17854a();
        }
        this.f5907a.mo17796c();
        this.f5915l = false;
        this.f5917n = C2528a.None;
        this.f5916m = false;
        for (C2653j put : C2653j.m5758a()) {
            Map<C2653j, Pair<Boolean, Boolean>> map = this.f5913i;
            Boolean bool = Boolean.FALSE;
            map.put(put, new Pair(bool, bool));
        }
    }

    /* renamed from: f */
    public final List<C2656l> mo17742f() {
        C2657m mVar = this.f5910f;
        if (mVar != null) {
            return mVar.mo17858b();
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo17738a(C2653j jVar) {
        boolean z;
        if (!this.f5916m) {
            return false;
        }
        boolean z2 = true;
        if (jVar == null) {
            boolean z3 = false;
            for (Map.Entry next : this.f5913i.entrySet()) {
                Pair pair = (Pair) next.getValue();
                if (!((Boolean) pair.second).booleanValue()) {
                    next.setValue(new Pair(pair.first, Boolean.TRUE));
                    z3 = true;
                }
            }
            z2 = z3;
        } else {
            Pair pair2 = this.f5913i.get(jVar);
            if (pair2 == null || !((Boolean) pair2.second).booleanValue()) {
                Map<C2653j, Pair<Boolean, Boolean>> map = this.f5913i;
                if (pair2 == null) {
                    z = false;
                } else {
                    z = ((Boolean) pair2.first).booleanValue();
                }
                map.put(jVar, new Pair(Boolean.valueOf(z), Boolean.TRUE));
            } else {
                z2 = false;
            }
        }
        if (z2) {
            this.f5910f.mo17855a(jVar);
            mo17737a(jVar, false);
        }
        return z2;
    }

    public String toString() {
        m5458i();
        ArrayList arrayList = new ArrayList();
        List<C2656l> f = mo17742f();
        if (f == null || f.isEmpty()) {
            return "No variants were found!";
        }
        for (C2656l lVar : f) {
            arrayList.add(lVar.toString());
        }
        return TextUtils.join(",", arrayList);
    }

    /* renamed from: c */
    static /* synthetic */ void m5450c(C2522d dVar) {
        synchronized (f5905j) {
            dVar.f5914k = true;
            f5905j.notifyAll();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m5449b(C2522d dVar, final C2528a aVar) {
        synchronized (dVar.f5912h) {
            for (Map.Entry next : dVar.f5912h.entrySet()) {
                final FlurryConfigListener flurryConfigListener = (FlurryConfigListener) next.getKey();
                Handler handler = (Handler) ((WeakReference) ((Pair) next.getValue()).second).get();
                C25253 r4 = new C2621eo() {
                    /* renamed from: a */
                    public final void mo17573a() {
                        int i = C25275.f5926a[aVar.ordinal()];
                        if (i == 2) {
                            flurryConfigListener.onFetchSuccess();
                        } else if (i == 3) {
                            flurryConfigListener.onFetchNoChange();
                        } else if (i == 4) {
                            flurryConfigListener.onFetchError(C2522d.this.f5915l);
                        }
                    }
                };
                if (handler == null) {
                    C2494ck.m5371a().mo17683a((Runnable) r4);
                } else {
                    handler.post(r4);
                }
            }
        }
    }
}
