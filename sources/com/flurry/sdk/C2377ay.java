package com.flurry.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.Toast;
import com.flurry.sdk.C2385az;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.flurry.sdk.ay */
public class C2377ay {

    /* renamed from: a */
    public static final String f5485a = C2377ay.class.getSimpleName();

    /* renamed from: b */
    public static int f5486b;

    /* renamed from: c */
    public static int f5487c;

    /* renamed from: d */
    public static AtomicInteger f5488d;

    /* renamed from: e */
    static C2508ct<List<C2385az>> f5489e;

    /* renamed from: f */
    private static C2377ay f5490f;

    /* renamed from: g */
    private static Map<Integer, C2385az> f5491g;

    /* renamed from: h */
    private final AtomicInteger f5492h;

    /* renamed from: i */
    private long f5493i;

    /* renamed from: j */
    private C2510cv<C2467bx> f5494j = new C2510cv<C2467bx>() {
        /* renamed from: a */
        public final /* synthetic */ void mo17521a(C2509cu cuVar) {
            C2467bx bxVar = (C2467bx) cuVar;
            String str = C2377ay.f5485a;
            C2530db.m5474a(4, str, "onNetworkStateChanged : isNetworkEnable = " + bxVar.f5758a);
            if (bxVar.f5758a) {
                C2494ck.m5371a().mo17685b(new Runnable() {
                    public final void run() {
                        C2394ba.m5156a().mo17612b();
                    }
                });
            }
        }
    };

    private C2377ay() {
        f5491g = new ConcurrentHashMap();
        this.f5492h = new AtomicInteger(0);
        f5488d = new AtomicInteger(0);
        if (f5487c == 0) {
            f5487c = 600000;
        }
        if (f5486b == 0) {
            f5486b = 15;
        }
        this.f5493i = C2494ck.m5371a().f5832a.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getLong("timeToSendNextPulseReport", 0);
        if (f5489e == null) {
            m5103g();
        }
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.NetworkStateEvent", this.f5494j);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m5103g() {
        f5489e = new C2508ct<>(C2494ck.m5371a().f5832a.getFileStreamPath(".yflurryanongoingpulsecallbackreporter"), ".yflurryanongoingpulsecallbackreporter", 2, new C2592dz<List<C2385az>>() {
            /* renamed from: a */
            public final C2587dw<List<C2385az>> mo17575a(int i) {
                return new C2584dv(new C2385az.C2386a());
            }
        });
    }

    /* renamed from: a */
    public static void m5093a() {
        if (f5490f != null) {
            C2511cw.m5419a().mo17724b("com.flurry.android.sdk.NetworkStateEvent", f5490f.f5494j);
            f5491g.clear();
            f5491g = null;
            f5490f = null;
        }
    }

    /* renamed from: a */
    public static void m5094a(int i) {
        f5486b = i;
    }

    /* renamed from: b */
    public static void m5096b(int i) {
        f5487c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17589a(com.flurry.sdk.C2385az r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 3
            if (r6 != 0) goto L_0x000d
            java.lang.String r6 = f5485a     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "Must add valid PulseCallbackAsyncReportInfo"
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r6, (java.lang.String) r1)     // Catch:{ all -> 0x007e }
            monitor-exit(r5)
            return
        L_0x000d:
            java.lang.String r1 = f5485a     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "Adding and sending "
            r2.<init>(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = r6.f5506d     // Catch:{ all -> 0x007e }
            r2.append(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = " report to PulseCallbackManager."
            r2.append(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007e }
            com.flurry.sdk.C2530db.m5474a((int) r0, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x007e }
            java.util.List r0 = r6.mo17600a()     // Catch:{ all -> 0x007e }
            int r0 = r0.size()     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x007c
            long r0 = r5.f5493i     // Catch:{ all -> 0x007e }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x004f
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007e }
            int r2 = f5487c     // Catch:{ all -> 0x007e }
            long r2 = (long) r2     // Catch:{ all -> 0x007e }
            long r0 = r0 + r2
            r5.f5493i = r0     // Catch:{ all -> 0x007e }
            com.flurry.sdk.ck r0 = com.flurry.sdk.C2494ck.m5371a()     // Catch:{ all -> 0x007e }
            com.flurry.sdk.ay$3 r1 = new com.flurry.sdk.ay$3     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            r0.mo17685b(r1)     // Catch:{ all -> 0x007e }
        L_0x004f:
            int r0 = r5.m5105i()     // Catch:{ all -> 0x007e }
            r6.f5505c = r0     // Catch:{ all -> 0x007e }
            java.util.Map<java.lang.Integer, com.flurry.sdk.az> r1 = f5491g     // Catch:{ all -> 0x007e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x007e }
            r1.put(r0, r6)     // Catch:{ all -> 0x007e }
            java.util.List r6 = r6.mo17600a()     // Catch:{ all -> 0x007e }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x007e }
        L_0x0066:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x007e }
            com.flurry.sdk.av r0 = (com.flurry.sdk.C2368av) r0     // Catch:{ all -> 0x007e }
            com.flurry.sdk.x r1 = com.flurry.sdk.C2669x.m5819a()     // Catch:{ all -> 0x007e }
            com.flurry.sdk.au r1 = r1.f6290c     // Catch:{ all -> 0x007e }
            r1.mo17771b(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0066
        L_0x007c:
            monitor-exit(r5)
            return
        L_0x007e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2377ay.mo17589a(com.flurry.sdk.az):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m5104h() {
        SharedPreferences.Editor edit = C2494ck.m5371a().f5832a.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        edit.putLong("timeToSendNextPulseReport", this.f5493i);
        edit.apply();
    }

    /* renamed from: i */
    private synchronized int m5105i() {
        return this.f5492h.incrementAndGet();
    }

    /* renamed from: b */
    public final synchronized void mo17593b(C2385az azVar) {
        if (azVar == null) {
            C2530db.m5474a(3, f5485a, "Must add valid PulseCallbackAsyncReportInfo");
            return;
        }
        if (this.f5493i == 0) {
            this.f5493i = System.currentTimeMillis() + ((long) f5487c);
            C2494ck.m5371a().mo17685b(new Runnable() {
                public final void run() {
                    C2377ay.this.m5104h();
                }
            });
        }
        int i = m5105i();
        azVar.f5505c = i;
        f5491g.put(Integer.valueOf(i), azVar);
        for (C2368av avVar : azVar.mo17600a()) {
            Iterator<C2372aw> it = avVar.f5453f.iterator();
            while (it.hasNext()) {
                it.next();
                f5488d.incrementAndGet();
                if (m5107k()) {
                    C2530db.m5474a(3, f5485a, "Max Callback Attempts threshold reached. Sending callback logging reports");
                    m5109m();
                }
            }
        }
        if (m5108l()) {
            C2530db.m5474a(3, f5485a, "Time threshold reached. Sending callback logging reports");
            m5109m();
        }
        String str = f5485a;
        C2530db.m5474a(3, str, "Restoring " + azVar.f5506d + " report to PulseCallbackManager. Number of stored completed callbacks: " + f5488d.get());
    }

    /* renamed from: a */
    public final synchronized void mo17588a(final C2372aw awVar) {
        String str = f5485a;
        C2530db.m5474a(3, str, awVar.f5476l.f5454g.f5506d + " report sent successfully to " + awVar.f5476l.f5459l);
        awVar.f5470f = C2376ax.COMPLETE;
        awVar.f5471g = "";
        m5099c(awVar);
        if (C2530db.m5484c() <= 3 && C2530db.m5489d()) {
            C2494ck.m5371a().mo17683a((Runnable) new Runnable() {
                public final void run() {
                    Context context = C2494ck.m5371a().f5832a;
                    Toast.makeText(context, "PulseCallbackReportInfo HTTP Response Code: " + awVar.f5469e + " for url: " + awVar.f5476l.f6001r, 1).show();
                }
            });
        }
    }

    /* renamed from: c */
    private void m5099c(C2372aw awVar) {
        awVar.f5468d = true;
        awVar.mo17585a();
        f5488d.incrementAndGet();
        awVar.f5476l.mo17581b();
        String str = f5485a;
        C2530db.m5474a(3, str, awVar.f5476l.f5454g.f5506d + " report to " + awVar.f5476l.f5459l + " finalized.");
        mo17591b();
        m5106j();
    }

    /* renamed from: b */
    public final void mo17591b() {
        C2494ck.m5371a().mo17685b(new Runnable() {
            public final void run() {
                C2377ay.m5100d();
                List<C2385az> c = C2377ay.m5097c();
                if (C2377ay.f5489e == null) {
                    C2377ay.m5103g();
                }
                C2377ay.f5489e.mo17717a(c);
            }
        });
    }

    /* renamed from: j */
    private void m5106j() {
        if (m5107k() || m5108l()) {
            C2530db.m5474a(3, f5485a, "Threshold reached. Sending callback logging reports");
            m5109m();
        }
    }

    /* renamed from: c */
    public static List<C2385az> m5097c() {
        return new ArrayList(f5491g.values());
    }

    /* renamed from: d */
    public static synchronized C2377ay m5100d() {
        C2377ay ayVar;
        synchronized (C2377ay.class) {
            if (f5490f == null) {
                f5490f = new C2377ay();
            }
            ayVar = f5490f;
        }
        return ayVar;
    }

    /* renamed from: k */
    private static boolean m5107k() {
        return f5488d.intValue() >= f5486b;
    }

    /* renamed from: l */
    private boolean m5108l() {
        return System.currentTimeMillis() > this.f5493i;
    }

    /* renamed from: m */
    private void m5109m() {
        Iterator<C2385az> it = m5097c().iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                C2385az next = it.next();
                for (C2368av avVar : next.mo17600a()) {
                    Iterator<C2372aw> it2 = avVar.f5453f.iterator();
                    while (it2.hasNext()) {
                        C2372aw next2 = it2.next();
                        if (next2.f5474j) {
                            it2.remove();
                        } else if (!next2.f5470f.equals(C2376ax.PENDING_COMPLETION)) {
                            next2.f5474j = true;
                            z = true;
                        }
                    }
                }
                if (z) {
                    C2394ba.m5156a().mo17611a(next);
                }
            } else {
                C2394ba.m5156a().mo17612b();
                this.f5493i = System.currentTimeMillis() + ((long) f5487c);
                m5104h();
                m5110n();
                f5488d = new AtomicInteger(0);
                mo17591b();
                return;
            }
        }
    }

    /* renamed from: n */
    private void m5110n() {
        for (C2385az next : m5097c()) {
            if (next.mo17601b()) {
                m5098c(next.f5505c);
            } else {
                for (C2368av next2 : next.mo17600a()) {
                    if (next2.f5460m) {
                        next.f5507e.remove(Long.valueOf(next2.f5448a));
                    } else {
                        Iterator<C2372aw> it = next2.f5453f.iterator();
                        while (it.hasNext()) {
                            if (it.next().f5474j) {
                                it.remove();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private synchronized void m5098c(int i) {
        String str = f5485a;
        C2530db.m5474a(3, str, "Removing report " + i + " from PulseCallbackManager");
        f5491g.remove(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final synchronized boolean mo17590a(C2372aw awVar, String str) {
        awVar.f5472h++;
        awVar.f5473i = System.currentTimeMillis();
        if (!(awVar.f5472h > awVar.f5476l.f5450c)) {
            if (!TextUtils.isEmpty(str)) {
                C2530db.m5474a(3, f5485a, "Report to " + awVar.f5476l.f5459l + " redirecting to url: " + str);
                awVar.f5476l.f6001r = str;
                mo17591b();
                return true;
            }
        }
        C2530db.m5474a(3, f5485a, "Maximum number of redirects attempted. Aborting: " + awVar.f5476l.f5454g.f5506d + " report to " + awVar.f5476l.f5459l);
        awVar.f5470f = C2376ax.INVALID_RESPONSE;
        awVar.f5471g = "";
        m5099c(awVar);
        return false;
    }

    /* renamed from: b */
    public final synchronized void mo17592b(C2372aw awVar) {
        String str = f5485a;
        C2530db.m5474a(3, str, "Maximum number of attempts reached. Aborting: " + awVar.f5476l.f5454g.f5506d);
        awVar.f5470f = C2376ax.f5480b;
        awVar.f5473i = System.currentTimeMillis();
        awVar.f5471g = "";
        m5099c(awVar);
    }

    /* renamed from: b */
    public final synchronized boolean mo17594b(C2372aw awVar, String str) {
        boolean z;
        awVar.f5470f = C2376ax.INVALID_RESPONSE;
        awVar.f5473i = System.currentTimeMillis();
        if (str == null) {
            str = "";
        }
        awVar.f5471g = str;
        C2368av avVar = awVar.f5476l;
        z = true;
        if (avVar.f5999p >= avVar.f5449b) {
            String str2 = f5485a;
            C2530db.m5474a(3, str2, "Maximum number of attempts reached. Aborting: " + awVar.f5476l.f5454g.f5506d + " report to " + awVar.f5476l.f5459l);
            m5099c(awVar);
        } else if (!C2626er.m5718a(awVar.f5476l.f6001r)) {
            String str3 = f5485a;
            C2530db.m5474a(3, str3, "Url: " + awVar.f5476l.f6001r + " is invalid.");
            m5099c(awVar);
        } else {
            String str4 = f5485a;
            C2530db.m5474a(3, str4, "Retrying callback to " + awVar.f5476l.f5454g.f5506d + " in: " + (awVar.f5476l.f5455h / 1000) + " seconds.");
            awVar.mo17585a();
            f5488d.incrementAndGet();
            mo17591b();
            m5106j();
        }
        z = false;
        return z;
    }

    /* renamed from: e */
    public static List<C2385az> m5101e() {
        if (f5489e == null) {
            m5103g();
        }
        return f5489e.mo17716a();
    }
}
