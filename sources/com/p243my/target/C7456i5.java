package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7402f5;
import com.p243my.target.common.MyTargetVersion;
import java.util.Map;

/* renamed from: com.my.target.i5 */
public final class C7456i5 extends C7438h5 {

    /* renamed from: a */
    public static final C7456i5 f18750a = new C7456i5();

    /* renamed from: b */
    public final C7402f5 f18751b = new C7402f5();

    /* renamed from: c */
    public final C7416g5 f18752c = new C7416g5();

    /* renamed from: d */
    public final C7484j5 f18753d = new C7484j5();

    /* renamed from: e */
    public final C7545m5 f18754e = new C7545m5();

    /* renamed from: f */
    public final C7505k5 f18755f = new C7505k5();

    /* renamed from: g */
    public final C7380e5 f18756g = new C7380e5();

    /* renamed from: h */
    public final C7362d5 f18757h = new C7362d5();

    /* renamed from: i */
    public final C7345c5 f18758i = new C7345c5();

    /* renamed from: j */
    public final C7563n5 f18759j = new C7563n5();

    /* renamed from: k */
    public final C7529l5 f18760k = new C7529l5();

    /* renamed from: l */
    public volatile String f18761l = null;

    /* renamed from: m */
    public C7524l3 f18762m;

    /* renamed from: n */
    public boolean f18763n = true;

    /* renamed from: c */
    public static C7456i5 m19373c() {
        return f18750a;
    }

    /* renamed from: a */
    public final long mo50394a(int i, long j) {
        if (this.f18762m == null) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f18762m.mo50801b(i, currentTimeMillis - j);
        return currentTimeMillis;
    }

    /* renamed from: a */
    public C7402f5.C7403a mo50395a() {
        return this.f18751b.mo50144a();
    }

    /* renamed from: a */
    public String mo50396a(Context context) {
        if (C7395f0.m19089b()) {
            C7374e0.m18989a("FingerprintDataProvider: You must not call getBidderToken method from main thread");
            return "";
        }
        if (this.f18761l == null) {
            synchronized (C7456i5.class) {
                if (this.f18761l == null) {
                    removeAll();
                    this.f18751b.collectData(context);
                    if (this.f18763n) {
                        this.f18753d.collectData(context);
                        this.f18755f.collectData(context);
                    }
                    Map<String, String> map = getMap();
                    this.f18751b.putDataTo(map);
                    if (this.f18763n) {
                        this.f18753d.putDataTo(map);
                        this.f18755f.putDataTo(map);
                    }
                    map.put("sdk_ver_int", MyTargetVersion.VERSION_INT);
                    this.f18761l = C7466i8.m19411a(map);
                }
            }
        }
        String str = this.f18761l;
        return str != null ? str : "";
    }

    /* renamed from: a */
    public void mo50397a(C7524l3 l3Var) {
        this.f18762m = l3Var;
    }

    /* renamed from: a */
    public void mo50398a(boolean z) {
        this.f18763n = z;
    }

    /* renamed from: b */
    public C7416g5 mo50399b() {
        return this.f18752c;
    }

    /* renamed from: b */
    public String mo50400b(Context context) {
        return this.f18751b.mo50149e(context);
    }

    /* renamed from: c */
    public void mo50401c(Context context) {
        if (C7395f0.m19089b()) {
            C7374e0.m18989a("FingerprintDataProvider: You must not call collectData method from main thread");
            return;
        }
        this.f18751b.collectData(context);
        this.f18753d.collectData(context);
        this.f18755f.collectData(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void collectData(android.content.Context r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = com.p243my.target.C7395f0.m19089b()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "FingerprintDataProvider: You must not call collectData method from main thread"
            com.p243my.target.C7374e0.m18989a(r4)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r3)
            return
        L_0x000e:
            r3.removeAll()     // Catch:{ all -> 0x00c4 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00c4 }
            com.my.target.f5 r2 = r3.f18751b     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 10
            long r0 = r3.mo50394a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.n5 r2 = r3.f18759j     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 21
            r3.mo50394a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.c5 r2 = r3.f18758i     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 16
            long r0 = r3.mo50394a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.l5 r2 = r3.f18760k     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 22
            r3.mo50394a(r2, r0)     // Catch:{ all -> 0x00c4 }
            boolean r2 = r3.f18763n     // Catch:{ all -> 0x00c4 }
            if (r2 == 0) goto L_0x0084
            com.my.target.g5 r2 = r3.f18752c     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 15
            long r0 = r3.mo50394a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.j5 r2 = r3.f18753d     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 11
            long r0 = r3.mo50394a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.m5 r2 = r3.f18754e     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 14
            long r0 = r3.mo50394a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.k5 r2 = r3.f18755f     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 13
            long r0 = r3.mo50394a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.d5 r2 = r3.f18757h     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 17
            long r0 = r3.mo50394a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.e5 r2 = r3.f18756g     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r4 = 18
            r3.mo50394a(r4, r0)     // Catch:{ all -> 0x00c4 }
        L_0x0084:
            r4 = 0
            r3.mo50397a((com.p243my.target.C7524l3) r4)     // Catch:{ all -> 0x00c4 }
            java.util.Map r4 = r3.getMap()     // Catch:{ all -> 0x00c4 }
            com.my.target.f5 r0 = r3.f18751b     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.n5 r0 = r3.f18759j     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.c5 r0 = r3.f18758i     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.l5 r0 = r3.f18760k     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            boolean r0 = r3.f18763n     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00c2
            com.my.target.g5 r0 = r3.f18752c     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.j5 r0 = r3.f18753d     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.m5 r0 = r3.f18754e     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.k5 r0 = r3.f18755f     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.d5 r0 = r3.f18757h     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.e5 r0 = r3.f18756g     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
        L_0x00c2:
            monitor-exit(r3)
            return
        L_0x00c4:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7456i5.collectData(android.content.Context):void");
    }
}
