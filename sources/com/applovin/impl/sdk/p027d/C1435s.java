package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1515d;
import com.applovin.impl.sdk.utils.C1519g;
import com.applovin.impl.sdk.utils.C1557r;
import com.facebook.internal.security.CertificateUtil;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.d.s */
public class C1435s {

    /* renamed from: a */
    private final String f3341a = "TaskManager";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1469j f3342b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1505q f3343c;

    /* renamed from: d */
    private final ScheduledThreadPoolExecutor f3344d;

    /* renamed from: e */
    private final ScheduledThreadPoolExecutor f3345e;

    /* renamed from: f */
    private final ScheduledThreadPoolExecutor f3346f;

    /* renamed from: g */
    private final ScheduledThreadPoolExecutor f3347g;

    /* renamed from: h */
    private final ScheduledThreadPoolExecutor f3348h;

    /* renamed from: i */
    private final ScheduledThreadPoolExecutor f3349i;

    /* renamed from: j */
    private final ScheduledThreadPoolExecutor f3350j;

    /* renamed from: k */
    private final ScheduledThreadPoolExecutor f3351k;

    /* renamed from: l */
    private final ScheduledThreadPoolExecutor f3352l;

    /* renamed from: m */
    private final ScheduledThreadPoolExecutor f3353m;

    /* renamed from: n */
    private final ScheduledThreadPoolExecutor f3354n;

    /* renamed from: o */
    private final ScheduledThreadPoolExecutor f3355o;

    /* renamed from: p */
    private final ScheduledThreadPoolExecutor f3356p;

    /* renamed from: q */
    private final ScheduledThreadPoolExecutor f3357q;

    /* renamed from: r */
    private final ScheduledThreadPoolExecutor f3358r;

    /* renamed from: s */
    private final ScheduledThreadPoolExecutor f3359s;

    /* renamed from: t */
    private final ScheduledThreadPoolExecutor f3360t;

    /* renamed from: u */
    private final ScheduledThreadPoolExecutor f3361u;

    /* renamed from: v */
    private final ScheduledThreadPoolExecutor f3362v;

    /* renamed from: w */
    private final ScheduledThreadPoolExecutor f3363w;

    /* renamed from: x */
    private final List<C1440c> f3364x = new ArrayList(5);

    /* renamed from: y */
    private final Object f3365y = new Object();

    /* renamed from: z */
    private boolean f3366z;

    /* renamed from: com.applovin.impl.sdk.d.s$a */
    public enum C1437a {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        ADVERTISING_INFO_COLLECTION,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BANNER,
        MEDIATION_INTERSTITIAL,
        MEDIATION_INCENTIVIZED,
        MEDIATION_REWARD
    }

    /* renamed from: com.applovin.impl.sdk.d.s$b */
    private class C1438b implements ThreadFactory {

        /* renamed from: b */
        private final String f3389b;

        C1438b(String str) {
            this.f3389b = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f3389b + CertificateUtil.DELIMITER + C1557r.m3589a(C1435s.this.f3342b.mo13136t()));
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    C1435s.this.f3343c.mo13278b("TaskManager", "Caught unhandled exception", th);
                }
            });
            return thread;
        }
    }

    /* renamed from: com.applovin.impl.sdk.d.s$c */
    private class C1440c implements Runnable {

        /* renamed from: b */
        private final String f3392b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C1392a f3393c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C1437a f3394d;

        C1440c(C1392a aVar, C1437a aVar2) {
            this.f3392b = aVar.mo12950e();
            this.f3393c = aVar;
            this.f3394d = aVar2;
        }

        public void run() {
            StringBuilder sb;
            C1505q qVar;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                C1519g.m3429a();
                if (C1435s.this.f3342b.mo13119c()) {
                    if (!this.f3393c.mo12952g()) {
                        C1435s.this.f3343c.mo13279c(this.f3392b, "Task re-scheduled...");
                        C1435s.this.mo13015a(this.f3393c, this.f3394d, 2000);
                        j = C1435s.this.m2947a(this.f3394d) - 1;
                        qVar = C1435s.this.f3343c;
                        sb = new StringBuilder();
                        sb.append(this.f3394d);
                        sb.append(" queue finished task ");
                        sb.append(this.f3393c.mo12950e());
                        sb.append(" with queue size ");
                        sb.append(j);
                        qVar.mo13279c("TaskManager", sb.toString());
                    }
                }
                C1435s.this.f3343c.mo13279c(this.f3392b, "Task started execution...");
                this.f3393c.run();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                C1505q b = C1435s.this.f3343c;
                String str = this.f3392b;
                b.mo13279c(str, "Task finished executing in " + currentTimeMillis2 + " ms...");
                j = C1435s.this.m2947a(this.f3394d) - 1;
                qVar = C1435s.this.f3343c;
                sb = new StringBuilder();
            } catch (Throwable th) {
                C1505q b2 = C1435s.this.f3343c;
                b2.mo13279c("TaskManager", this.f3394d + " queue finished task " + this.f3393c.mo12950e() + " with queue size " + (C1435s.this.m2947a(this.f3394d) - 1));
                throw th;
            }
            sb.append(this.f3394d);
            sb.append(" queue finished task ");
            sb.append(this.f3393c.mo12950e());
            sb.append(" with queue size ");
            sb.append(j);
            qVar.mo13279c("TaskManager", sb.toString());
        }
    }

    public C1435s(C1469j jVar) {
        this.f3342b = jVar;
        this.f3343c = jVar.mo13139v();
        this.f3344d = m2950a("main");
        this.f3345e = m2950a("timeout");
        this.f3346f = m2950a("back");
        this.f3347g = m2950a("advertising_info_collection");
        this.f3348h = m2950a("postbacks");
        this.f3349i = m2950a("caching_interstitial");
        this.f3350j = m2950a("caching_incentivized");
        this.f3351k = m2950a("caching_other");
        this.f3352l = m2950a("reward");
        this.f3353m = m2950a("mediation_main");
        this.f3354n = m2950a("mediation_timeout");
        this.f3355o = m2950a("mediation_background");
        this.f3356p = m2950a("mediation_postbacks");
        this.f3357q = m2950a("mediation_banner");
        this.f3358r = m2950a("mediation_interstitial");
        this.f3359s = m2950a("mediation_incentivized");
        this.f3360t = m2950a("mediation_reward");
        this.f3361u = m2951a("auxiliary_operations", ((Integer) jVar.mo13088a(C1369c.f3010cv)).intValue());
        this.f3362v = m2951a("caching_operations", ((Integer) jVar.mo13088a(C1369c.f3011cw)).intValue());
        this.f3363w = m2951a("shared_thread_pool", ((Integer) jVar.mo13088a(C1369c.f2893aj)).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public long m2947a(C1437a aVar) {
        long taskCount;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        if (aVar == C1437a.MAIN) {
            taskCount = this.f3344d.getTaskCount();
            scheduledThreadPoolExecutor = this.f3344d;
        } else if (aVar == C1437a.TIMEOUT) {
            taskCount = this.f3345e.getTaskCount();
            scheduledThreadPoolExecutor = this.f3345e;
        } else if (aVar == C1437a.BACKGROUND) {
            taskCount = this.f3346f.getTaskCount();
            scheduledThreadPoolExecutor = this.f3346f;
        } else if (aVar == C1437a.ADVERTISING_INFO_COLLECTION) {
            taskCount = this.f3347g.getTaskCount();
            scheduledThreadPoolExecutor = this.f3347g;
        } else if (aVar == C1437a.POSTBACKS) {
            taskCount = this.f3348h.getTaskCount();
            scheduledThreadPoolExecutor = this.f3348h;
        } else if (aVar == C1437a.CACHING_INTERSTITIAL) {
            taskCount = this.f3349i.getTaskCount();
            scheduledThreadPoolExecutor = this.f3349i;
        } else if (aVar == C1437a.CACHING_INCENTIVIZED) {
            taskCount = this.f3350j.getTaskCount();
            scheduledThreadPoolExecutor = this.f3350j;
        } else if (aVar == C1437a.CACHING_OTHER) {
            taskCount = this.f3351k.getTaskCount();
            scheduledThreadPoolExecutor = this.f3351k;
        } else if (aVar == C1437a.REWARD) {
            taskCount = this.f3352l.getTaskCount();
            scheduledThreadPoolExecutor = this.f3352l;
        } else if (aVar == C1437a.MEDIATION_MAIN) {
            taskCount = this.f3353m.getTaskCount();
            scheduledThreadPoolExecutor = this.f3353m;
        } else if (aVar == C1437a.MEDIATION_TIMEOUT) {
            taskCount = this.f3354n.getTaskCount();
            scheduledThreadPoolExecutor = this.f3354n;
        } else if (aVar == C1437a.MEDIATION_BACKGROUND) {
            taskCount = this.f3355o.getTaskCount();
            scheduledThreadPoolExecutor = this.f3355o;
        } else if (aVar == C1437a.MEDIATION_POSTBACKS) {
            taskCount = this.f3356p.getTaskCount();
            scheduledThreadPoolExecutor = this.f3356p;
        } else if (aVar == C1437a.MEDIATION_BANNER) {
            taskCount = this.f3357q.getTaskCount();
            scheduledThreadPoolExecutor = this.f3357q;
        } else if (aVar == C1437a.MEDIATION_INTERSTITIAL) {
            taskCount = this.f3358r.getTaskCount();
            scheduledThreadPoolExecutor = this.f3358r;
        } else if (aVar == C1437a.MEDIATION_INCENTIVIZED) {
            taskCount = this.f3359s.getTaskCount();
            scheduledThreadPoolExecutor = this.f3359s;
        } else if (aVar != C1437a.MEDIATION_REWARD) {
            return 0;
        } else {
            taskCount = this.f3360t.getTaskCount();
            scheduledThreadPoolExecutor = this.f3360t;
        }
        return taskCount - scheduledThreadPoolExecutor.getCompletedTaskCount();
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m2950a(String str) {
        return m2951a(str, 1);
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m2951a(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new C1438b(str));
    }

    /* renamed from: a */
    private void m2952a(final Runnable runnable, long j, final ScheduledExecutorService scheduledExecutorService, boolean z) {
        if (j <= 0) {
            scheduledExecutorService.submit(runnable);
        } else if (z) {
            C1515d.m3417a(j, this.f3342b, new Runnable() {
                public void run() {
                    scheduledExecutorService.execute(runnable);
                }
            });
        } else {
            scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    private boolean m2953a(C1440c cVar) {
        if (cVar.f3393c.mo12952g()) {
            return false;
        }
        synchronized (this.f3365y) {
            if (this.f3366z) {
                return false;
            }
            this.f3364x.add(cVar);
            return true;
        }
    }

    /* renamed from: a */
    public void mo13013a(C1392a aVar) {
        if (aVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                C1505q qVar = this.f3343c;
                qVar.mo13279c("TaskManager", "Executing " + aVar.mo12950e() + " immediately...");
                aVar.run();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                C1505q qVar2 = this.f3343c;
                qVar2.mo13279c("TaskManager", aVar.mo12950e() + " finished executing in " + currentTimeMillis2 + " ms...");
            } catch (Throwable th) {
                this.f3343c.mo13278b(aVar.mo12950e(), "Task failed execution", th);
            }
        } else {
            this.f3343c.mo13281e("TaskManager", "Attempted to execute null task immediately");
        }
    }

    /* renamed from: a */
    public void mo13014a(C1392a aVar, C1437a aVar2) {
        mo13015a(aVar, aVar2, 0);
    }

    /* renamed from: a */
    public void mo13015a(C1392a aVar, C1437a aVar2, long j) {
        mo13016a(aVar, aVar2, j, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.applovin.impl.sdk.d.s$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: com.applovin.impl.sdk.d.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: com.applovin.impl.sdk.d.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: com.applovin.impl.sdk.d.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13016a(com.applovin.impl.sdk.p027d.C1392a r12, com.applovin.impl.sdk.p027d.C1435s.C1437a r13, long r14, boolean r16) {
        /*
            r11 = this;
            r6 = r11
            r1 = r12
            r0 = r13
            r2 = r14
            if (r1 == 0) goto L_0x0124
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x010d
            com.applovin.impl.sdk.d.s$c r4 = new com.applovin.impl.sdk.d.s$c
            r4.<init>(r12, r13)
            boolean r5 = r11.m2953a((com.applovin.impl.sdk.p027d.C1435s.C1440c) r4)
            if (r5 != 0) goto L_0x00e9
            com.applovin.impl.sdk.j r5 = r6.f3342b
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r7 = com.applovin.impl.sdk.p025b.C1369c.f2894ak
            java.lang.Object r5 = r5.mo13088a(r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0033
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r6.f3363w
            r0 = r11
            r1 = r12
            r2 = r14
        L_0x002c:
            r5 = r16
            r0.m2952a((java.lang.Runnable) r1, (long) r2, (java.util.concurrent.ScheduledExecutorService) r4, (boolean) r5)
            goto L_0x010c
        L_0x0033:
            long r7 = r11.m2947a((com.applovin.impl.sdk.p027d.C1435s.C1437a) r13)
            r9 = 1
            long r7 = r7 + r9
            com.applovin.impl.sdk.q r5 = r6.f3343c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Scheduling "
            r9.append(r10)
            java.lang.String r1 = r12.mo12950e()
            r9.append(r1)
            java.lang.String r1 = " on "
            r9.append(r1)
            r9.append(r13)
            java.lang.String r1 = " queue in "
            r9.append(r1)
            r9.append(r14)
            java.lang.String r1 = "ms with new queue size "
            r9.append(r1)
            r9.append(r7)
            java.lang.String r1 = r9.toString()
            java.lang.String r7 = "TaskManager"
            r5.mo13277b(r7, r1)
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.MAIN
            if (r0 != r1) goto L_0x0079
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3344d
        L_0x0074:
            r0 = r11
            r1 = r4
            r2 = r14
            r4 = r5
            goto L_0x002c
        L_0x0079:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.TIMEOUT
            if (r0 != r1) goto L_0x0080
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3345e
            goto L_0x0074
        L_0x0080:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.BACKGROUND
            if (r0 != r1) goto L_0x0087
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3346f
            goto L_0x0074
        L_0x0087:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.ADVERTISING_INFO_COLLECTION
            if (r0 != r1) goto L_0x008e
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3347g
            goto L_0x0074
        L_0x008e:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.POSTBACKS
            if (r0 != r1) goto L_0x0095
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3348h
            goto L_0x0074
        L_0x0095:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.CACHING_INTERSTITIAL
            if (r0 != r1) goto L_0x009c
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3349i
            goto L_0x0074
        L_0x009c:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.CACHING_INCENTIVIZED
            if (r0 != r1) goto L_0x00a3
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3350j
            goto L_0x0074
        L_0x00a3:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.CACHING_OTHER
            if (r0 != r1) goto L_0x00aa
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3351k
            goto L_0x0074
        L_0x00aa:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.REWARD
            if (r0 != r1) goto L_0x00b1
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3352l
            goto L_0x0074
        L_0x00b1:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.MEDIATION_MAIN
            if (r0 != r1) goto L_0x00b8
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3353m
            goto L_0x0074
        L_0x00b8:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.MEDIATION_TIMEOUT
            if (r0 != r1) goto L_0x00bf
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3354n
            goto L_0x0074
        L_0x00bf:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.MEDIATION_BACKGROUND
            if (r0 != r1) goto L_0x00c6
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3355o
            goto L_0x0074
        L_0x00c6:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.MEDIATION_POSTBACKS
            if (r0 != r1) goto L_0x00cd
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3356p
            goto L_0x0074
        L_0x00cd:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.MEDIATION_BANNER
            if (r0 != r1) goto L_0x00d4
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3357q
            goto L_0x0074
        L_0x00d4:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.MEDIATION_INTERSTITIAL
            if (r0 != r1) goto L_0x00db
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3358r
            goto L_0x0074
        L_0x00db:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.MEDIATION_INCENTIVIZED
            if (r0 != r1) goto L_0x00e2
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3359s
            goto L_0x0074
        L_0x00e2:
            com.applovin.impl.sdk.d.s$a r1 = com.applovin.impl.sdk.p027d.C1435s.C1437a.MEDIATION_REWARD
            if (r0 != r1) goto L_0x010c
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r6.f3360t
            goto L_0x0074
        L_0x00e9:
            com.applovin.impl.sdk.q r0 = r6.f3343c
            java.lang.String r2 = r12.mo12950e()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Task "
            r3.append(r4)
            java.lang.String r1 = r12.mo12950e()
            r3.append(r1)
            java.lang.String r1 = " execution delayed until after init"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.mo13279c(r2, r1)
        L_0x010c:
            return
        L_0x010d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Invalid delay specified: "
            r1.append(r4)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0124:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No task specified"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p027d.C1435s.mo13016a(com.applovin.impl.sdk.d.a, com.applovin.impl.sdk.d.s$a, long, boolean):void");
    }

    /* renamed from: a */
    public boolean mo13017a() {
        return this.f3366z;
    }

    /* renamed from: b */
    public ScheduledExecutorService mo13018b() {
        return this.f3361u;
    }

    /* renamed from: c */
    public ScheduledExecutorService mo13019c() {
        return this.f3362v;
    }

    /* renamed from: d */
    public void mo13020d() {
        synchronized (this.f3365y) {
            this.f3366z = false;
        }
    }

    /* renamed from: e */
    public void mo13021e() {
        synchronized (this.f3365y) {
            this.f3366z = true;
            for (C1440c next : this.f3364x) {
                mo13014a(next.f3393c, next.f3394d);
            }
            this.f3364x.clear();
        }
    }
}
