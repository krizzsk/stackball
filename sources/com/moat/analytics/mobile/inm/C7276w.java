package com.moat.analytics.mobile.inm;

import android.os.Handler;
import android.os.Looper;
import com.tapjoy.TapjoyConstants;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.moat.analytics.mobile.inm.w */
class C7276w {

    /* renamed from: h */
    private static C7276w f18240h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Queue<C7283c> f18241i = new ConcurrentLinkedQueue();

    /* renamed from: a */
    volatile C7284d f18242a = C7284d.OFF;

    /* renamed from: b */
    volatile boolean f18243b = false;

    /* renamed from: c */
    volatile boolean f18244c = false;

    /* renamed from: d */
    volatile int f18245d = 200;

    /* renamed from: e */
    volatile int f18246e = 10;

    /* renamed from: f */
    private long f18247f = TapjoyConstants.SESSION_ID_INACTIVITY_TIME;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f18248g = 60000;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f18249j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final AtomicBoolean f18250k = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile long f18251l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final AtomicInteger f18252m = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final AtomicBoolean f18253n = new AtomicBoolean(false);

    /* renamed from: com.moat.analytics.mobile.inm.w$a */
    class C7280a implements Runnable {

        /* renamed from: b */
        private final Handler f18259b;

        /* renamed from: c */
        private final String f18260c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C7285e f18261d;

        private C7280a(String str, Handler handler, C7285e eVar) {
            this.f18261d = eVar;
            this.f18259b = handler;
            this.f18260c = "https://z.moatads.com/" + str + "/android/" + "c334ae8" + "/status.json";
        }

        /* renamed from: a */
        private void m18598a() {
            String b = m18599b();
            final C7251l lVar = new C7251l(b);
            C7276w.this.f18243b = lVar.mo49407a();
            C7276w.this.f18244c = lVar.mo49408b();
            C7276w.this.f18245d = lVar.mo49409c();
            C7276w.this.f18246e = lVar.mo49410d();
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    try {
                        C7280a.this.f18261d.mo49429a(lVar);
                    } catch (Exception e) {
                        C7252m.m18508a(e);
                    }
                }
            });
            long unused = C7276w.this.f18251l = System.currentTimeMillis();
            C7276w.this.f18253n.compareAndSet(true, false);
            if (b != null) {
                C7276w.this.f18252m.set(0);
            } else if (C7276w.this.f18252m.incrementAndGet() < 10) {
                C7276w wVar = C7276w.this;
                wVar.m18583a(wVar.f18248g);
            }
        }

        /* renamed from: b */
        private String m18599b() {
            try {
                return C7262q.m18549a(this.f18260c + "?ts=" + System.currentTimeMillis() + "&v=2.5.0").mo49331b();
            } catch (Exception unused) {
                return null;
            }
        }

        public void run() {
            try {
                m18598a();
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
            this.f18259b.removeCallbacks(this);
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
        }
    }

    /* renamed from: com.moat.analytics.mobile.inm.w$b */
    interface C7282b {
        /* renamed from: c */
        void mo49405c();

        /* renamed from: d */
        void mo49406d();
    }

    /* renamed from: com.moat.analytics.mobile.inm.w$c */
    class C7283c {

        /* renamed from: a */
        final Long f18264a;

        /* renamed from: b */
        final C7282b f18265b;

        C7283c(Long l, C7282b bVar) {
            this.f18264a = l;
            this.f18265b = bVar;
        }
    }

    /* renamed from: com.moat.analytics.mobile.inm.w$d */
    enum C7284d {
        OFF,
        ON
    }

    /* renamed from: com.moat.analytics.mobile.inm.w$e */
    interface C7285e {
        /* renamed from: a */
        void mo49429a(C7251l lVar);
    }

    private C7276w() {
        try {
            this.f18249j = new Handler(Looper.getMainLooper());
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }

    /* renamed from: a */
    static synchronized C7276w m18582a() {
        C7276w wVar;
        synchronized (C7276w.class) {
            if (f18240h == null) {
                f18240h = new C7276w();
            }
            wVar = f18240h;
        }
        return wVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m18583a(final long j) {
        if (this.f18253n.compareAndSet(false, true)) {
            C7261p.m18544a(3, "OnOff", (Object) this, "Performing status check.");
            new Thread() {
                public void run() {
                    Looper.prepare();
                    Handler handler = new Handler();
                    handler.postDelayed(new C7280a("INM", handler, new C7285e() {
                        /* renamed from: a */
                        public void mo49429a(C7251l lVar) {
                            synchronized (C7276w.f18241i) {
                                boolean z = ((C7250k) MoatAnalytics.getInstance()).f18187a;
                                if (C7276w.this.f18242a != lVar.mo49411e() || (C7276w.this.f18242a == C7284d.OFF && z)) {
                                    C7276w.this.f18242a = lVar.mo49411e();
                                    if (C7276w.this.f18242a == C7284d.OFF && z) {
                                        C7276w.this.f18242a = C7284d.ON;
                                    }
                                    if (C7276w.this.f18242a == C7284d.ON) {
                                        C7261p.m18544a(3, "OnOff", (Object) this, "Moat enabled - Version 2.5.0");
                                    }
                                    for (C7283c cVar : C7276w.f18241i) {
                                        if (C7276w.this.f18242a == C7284d.ON) {
                                            cVar.f18265b.mo49405c();
                                        } else {
                                            cVar.f18265b.mo49406d();
                                        }
                                    }
                                }
                                while (!C7276w.f18241i.isEmpty()) {
                                    C7276w.f18241i.remove();
                                }
                            }
                        }
                    }), j);
                    Looper.loop();
                }
            }.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m18590d() {
        synchronized (f18241i) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = f18241i.iterator();
            while (it.hasNext()) {
                if (currentTimeMillis - ((C7283c) it.next()).f18264a.longValue() >= 60000) {
                    it.remove();
                }
            }
            if (f18241i.size() >= 15) {
                for (int i = 0; i < 5; i++) {
                    f18241i.remove();
                }
            }
        }
    }

    /* renamed from: e */
    private void m18592e() {
        if (this.f18250k.compareAndSet(false, true)) {
            this.f18249j.postDelayed(new Runnable() {
                public void run() {
                    try {
                        if (C7276w.f18241i.size() > 0) {
                            C7276w.this.m18590d();
                            C7276w.this.f18249j.postDelayed(this, 60000);
                            return;
                        }
                        C7276w.this.f18250k.compareAndSet(true, false);
                        C7276w.this.f18249j.removeCallbacks(this);
                    } catch (Exception e) {
                        C7252m.m18508a(e);
                    }
                }
            }, 60000);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49426a(C7282b bVar) {
        if (this.f18242a == C7284d.ON) {
            bVar.mo49405c();
            return;
        }
        m18590d();
        f18241i.add(new C7283c(Long.valueOf(System.currentTimeMillis()), bVar));
        m18592e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo49427b() {
        if (System.currentTimeMillis() - this.f18251l > this.f18247f) {
            m18583a(0);
        }
    }
}
