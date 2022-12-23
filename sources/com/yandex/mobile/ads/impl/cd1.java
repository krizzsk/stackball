package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class cd1 {

    /* renamed from: h */
    public static final C12727b f31894h = new C12727b((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final cd1 f31895i = new cd1(new C12728c(jh1.m37824a(Intrinsics.stringPlus(jh1.f35311g, " TaskRunner"), true)));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Logger f31896j;

    /* renamed from: a */
    private final C12726a f31897a;

    /* renamed from: b */
    private int f31898b = 10000;

    /* renamed from: c */
    private boolean f31899c;

    /* renamed from: d */
    private long f31900d;

    /* renamed from: e */
    private final List<bd1> f31901e = new ArrayList();

    /* renamed from: f */
    private final List<bd1> f31902f = new ArrayList();

    /* renamed from: g */
    private final Runnable f31903g = new C12729d(this);

    /* renamed from: com.yandex.mobile.ads.impl.cd1$a */
    public interface C12726a {
        /* renamed from: a */
        long mo66263a();

        /* renamed from: a */
        void mo66264a(cd1 cd1);

        /* renamed from: a */
        void mo66265a(cd1 cd1, long j);

        void execute(Runnable runnable);
    }

    /* renamed from: com.yandex.mobile.ads.impl.cd1$b */
    public static final class C12727b {
        private C12727b() {
        }

        public /* synthetic */ C12727b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cd1$c */
    public static final class C12728c implements C12726a {

        /* renamed from: a */
        private final ThreadPoolExecutor f31904a;

        public C12728c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f31904a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        /* renamed from: a */
        public long mo66263a() {
            return System.nanoTime();
        }

        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f31904a.execute(runnable);
        }

        /* renamed from: a */
        public void mo66265a(cd1 cd1, long j) throws InterruptedException {
            Intrinsics.checkNotNullParameter(cd1, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                cd1.wait(j2, (int) j3);
            }
        }

        /* renamed from: a */
        public void mo66264a(cd1 cd1) {
            Intrinsics.checkNotNullParameter(cd1, "taskRunner");
            cd1.notify();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cd1$d */
    public static final class C12729d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ cd1 f31905b;

        C12729d(cd1 cd1) {
            this.f31905b = cd1;
        }

        public void run() {
            xc1 b;
            while (true) {
                cd1 cd1 = this.f31905b;
                synchronized (cd1) {
                    b = cd1.mo66259b();
                }
                if (b != null) {
                    bd1 d = b.mo70881d();
                    Intrinsics.checkNotNull(d);
                    cd1 cd12 = this.f31905b;
                    long j = -1;
                    C12727b bVar = cd1.f31894h;
                    boolean isLoggable = cd1.f31896j.isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = d.mo66055h().mo66261d().mo66263a();
                        zc1.m44530a(b, d, "starting");
                    }
                    try {
                        cd1.m34679a(cd12, b);
                        Unit unit = Unit.INSTANCE;
                        if (isLoggable) {
                            zc1.m44530a(b, d, Intrinsics.stringPlus("finished run in ", zc1.m44529a(d.mo66055h().mo66261d().mo66263a() - j)));
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            zc1.m44530a(b, d, Intrinsics.stringPlus("failed a run in ", zc1.m44529a(d.mo66055h().mo66261d().mo66263a() - j)));
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(cd1.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f31896j = logger;
    }

    public cd1(C12726a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "backend");
        this.f31897a = aVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x010e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.yandex.mobile.ads.impl.xc1 mo66259b() {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = com.yandex.mobile.ads.impl.jh1.f35310f
            java.lang.String r2 = " MUST hold lock on "
            java.lang.String r3 = "Thread "
            if (r0 == 0) goto L_0x0034
            boolean r0 = java.lang.Thread.holdsLock(r17)
            if (r0 == 0) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            throw r0
        L_0x0034:
            java.util.List<com.yandex.mobile.ads.impl.bd1> r0 = r1.f31902f
            boolean r0 = r0.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x003e
            return r4
        L_0x003e:
            com.yandex.mobile.ads.impl.cd1$a r0 = r1.f31897a
            long r5 = r0.mo66263a()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<com.yandex.mobile.ads.impl.bd1> r0 = r1.f31902f
            java.util.Iterator r0 = r0.iterator()
            r9 = r4
        L_0x0050:
            boolean r10 = r0.hasNext()
            r11 = 1
            r12 = 0
            if (r10 == 0) goto L_0x0085
            java.lang.Object r10 = r0.next()
            com.yandex.mobile.ads.impl.bd1 r10 = (com.yandex.mobile.ads.impl.bd1) r10
            java.util.List r10 = r10.mo66052e()
            java.lang.Object r10 = r10.get(r12)
            com.yandex.mobile.ads.impl.xc1 r10 = (com.yandex.mobile.ads.impl.xc1) r10
            long r13 = r10.mo70880c()
            long r13 = r13 - r5
            r15 = r5
            r4 = 0
            long r13 = java.lang.Math.max(r4, r13)
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x007f
            long r7 = java.lang.Math.min(r13, r7)
        L_0x007c:
            r5 = r15
            r4 = 0
            goto L_0x0050
        L_0x007f:
            if (r9 == 0) goto L_0x0083
            r0 = 1
            goto L_0x0087
        L_0x0083:
            r9 = r10
            goto L_0x007c
        L_0x0085:
            r15 = r5
            r0 = 0
        L_0x0087:
            if (r9 == 0) goto L_0x00ee
            boolean r4 = com.yandex.mobile.ads.impl.jh1.f35310f
            if (r4 == 0) goto L_0x00b7
            boolean r4 = java.lang.Thread.holdsLock(r17)
            if (r4 == 0) goto L_0x0094
            goto L_0x00b7
        L_0x0094:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            throw r0
        L_0x00b7:
            r2 = -1
            r9.mo70876a((long) r2)
            com.yandex.mobile.ads.impl.bd1 r2 = r9.mo70881d()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.util.List r3 = r2.mo66052e()
            r3.remove(r9)
            java.util.List<com.yandex.mobile.ads.impl.bd1> r3 = r1.f31902f
            r3.remove(r2)
            r2.mo66045a((com.yandex.mobile.ads.impl.xc1) r9)
            java.util.List<com.yandex.mobile.ads.impl.bd1> r3 = r1.f31901e
            r3.add(r2)
            if (r0 != 0) goto L_0x00e6
            boolean r0 = r1.f31899c
            if (r0 != 0) goto L_0x00ed
            java.util.List<com.yandex.mobile.ads.impl.bd1> r0 = r1.f31902f
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r11
            if (r0 == 0) goto L_0x00ed
        L_0x00e6:
            com.yandex.mobile.ads.impl.cd1$a r0 = r1.f31897a
            java.lang.Runnable r2 = r1.f31903g
            r0.execute(r2)
        L_0x00ed:
            return r9
        L_0x00ee:
            boolean r0 = r1.f31899c
            if (r0 == 0) goto L_0x0100
            long r2 = r1.f31900d
            long r2 = r2 - r15
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fe
            com.yandex.mobile.ads.impl.cd1$a r0 = r1.f31897a
            r0.mo66264a(r1)
        L_0x00fe:
            r0 = 0
            return r0
        L_0x0100:
            r1.f31899c = r11
            long r5 = r15 + r7
            r1.f31900d = r5
            com.yandex.mobile.ads.impl.cd1$a r0 = r1.f31897a     // Catch:{ InterruptedException -> 0x010e }
            r0.mo66265a(r1, r7)     // Catch:{ InterruptedException -> 0x010e }
            goto L_0x0111
        L_0x010c:
            r0 = move-exception
            goto L_0x0115
        L_0x010e:
            r17.mo66260c()     // Catch:{ all -> 0x010c }
        L_0x0111:
            r1.f31899c = r12
            goto L_0x0034
        L_0x0115:
            r1.f31899c = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cd1.mo66259b():com.yandex.mobile.ads.impl.xc1");
    }

    /* renamed from: c */
    public final void mo66260c() {
        int size = this.f31901e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                this.f31901e.get(size).mo66049b();
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        int size2 = this.f31902f.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                bd1 bd1 = this.f31902f.get(size2);
                bd1.mo66049b();
                if (bd1.mo66052e().isEmpty()) {
                    this.f31902f.remove(size2);
                }
                if (i2 >= 0) {
                    size2 = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final C12726a mo66261d() {
        return this.f31897a;
    }

    /* renamed from: e */
    public final bd1 mo66262e() {
        int i;
        synchronized (this) {
            i = this.f31898b;
            this.f31898b = i + 1;
        }
        return new bd1(this, Intrinsics.stringPlus("Q", Integer.valueOf(i)));
    }

    /* renamed from: a */
    public static final void m34679a(cd1 cd1, xc1 xc1) {
        cd1.getClass();
        if (!jh1.f35310f || !Thread.holdsLock(cd1)) {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(xc1.mo70879b());
            try {
                long e = xc1.mo65736e();
                synchronized (cd1) {
                    cd1.m34680a(xc1, e);
                    Unit unit = Unit.INSTANCE;
                }
                currentThread.setName(name);
            } catch (Throwable th) {
                synchronized (cd1) {
                    cd1.m34680a(xc1, -1);
                    Unit unit2 = Unit.INSTANCE;
                    currentThread.setName(name);
                    throw th;
                }
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + cd1);
        }
    }

    /* renamed from: a */
    public final void mo66258a(bd1 bd1) {
        Intrinsics.checkNotNullParameter(bd1, "taskQueue");
        if (!jh1.f35310f || Thread.holdsLock(this)) {
            if (bd1.mo66050c() == null) {
                if (!bd1.mo66052e().isEmpty()) {
                    List<bd1> list = this.f31902f;
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    if (!list.contains(bd1)) {
                        list.add(bd1);
                    }
                } else {
                    this.f31902f.remove(bd1);
                }
            }
            if (this.f31899c) {
                this.f31897a.mo66264a(this);
            } else {
                this.f31897a.execute(this.f31903g);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
    }

    /* renamed from: a */
    private final void m34680a(xc1 xc1, long j) {
        if (!jh1.f35310f || Thread.holdsLock(this)) {
            bd1 d = xc1.mo70881d();
            Intrinsics.checkNotNull(d);
            if (d.mo66050c() == xc1) {
                boolean d2 = d.mo66051d();
                d.mo66047a(false);
                d.mo66045a((xc1) null);
                this.f31901e.remove(d);
                if (j != -1 && !d2 && !d.mo66054g()) {
                    d.mo66048a(xc1, j, true);
                }
                if (!d.mo66052e().isEmpty()) {
                    this.f31902f.add(d);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }
}
