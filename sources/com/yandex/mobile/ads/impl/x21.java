package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import com.facebook.share.internal.ShareConstants;
import com.yandex.mobile.ads.impl.lz0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;

public final class x21 implements C12380ae {

    /* renamed from: b */
    private final hw0 f42378b;

    /* renamed from: c */
    private final m41 f42379c;

    /* renamed from: d */
    private final boolean f42380d;

    /* renamed from: e */
    private final b31 f42381e;

    /* renamed from: f */
    private final b40 f42382f;

    /* renamed from: g */
    private final C15142c f42383g;

    /* renamed from: h */
    private final AtomicBoolean f42384h = new AtomicBoolean();

    /* renamed from: i */
    private Object f42385i;

    /* renamed from: j */
    private f40 f42386j;

    /* renamed from: k */
    private y21 f42387k;

    /* renamed from: l */
    private boolean f42388l;

    /* renamed from: m */
    private d40 f42389m;

    /* renamed from: n */
    private boolean f42390n;

    /* renamed from: o */
    private boolean f42391o;

    /* renamed from: p */
    private boolean f42392p = true;

    /* renamed from: q */
    private volatile boolean f42393q;

    /* renamed from: r */
    private volatile d40 f42394r;

    /* renamed from: s */
    private volatile y21 f42395s;

    /* renamed from: com.yandex.mobile.ads.impl.x21$a */
    public final class C15140a implements Runnable {
        public void run() {
            throw null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x21$b */
    public static final class C15141b extends WeakReference<x21> {

        /* renamed from: a */
        private final Object f42396a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15141b(x21 x21, Object obj) {
            super(x21);
            Intrinsics.checkNotNullParameter(x21, "referent");
            this.f42396a = obj;
        }

        /* renamed from: a */
        public final Object mo70810a() {
            return this.f42396a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x21$c */
    public static final class C15142c extends AsyncTimeout {

        /* renamed from: a */
        final /* synthetic */ x21 f42397a;

        C15142c(x21 x21) {
            this.f42397a = x21;
        }

        /* access modifiers changed from: protected */
        public void timedOut() {
            this.f42397a.mo70793a();
        }
    }

    public x21(hw0 hw0, m41 m41, boolean z) {
        Intrinsics.checkNotNullParameter(hw0, "client");
        Intrinsics.checkNotNullParameter(m41, "originalRequest");
        this.f42378b = hw0;
        this.f42379c = m41;
        this.f42380d = z;
        this.f42381e = hw0.mo67648f().mo67554a();
        this.f42382f = hw0.mo67653k().mo65537a(this);
        C15142c cVar = new C15142c(this);
        mo70800c().getClass();
        cVar.timeout((long) 0, TimeUnit.MILLISECONDS);
        Unit unit = Unit.INSTANCE;
        this.f42383g = cVar;
    }

    /* renamed from: a */
    public void mo70793a() {
        if (!this.f42393q) {
            this.f42393q = true;
            d40 d40 = this.f42394r;
            if (d40 != null) {
                d40.mo66407a();
            }
            y21 y21 = this.f42395s;
            if (y21 != null) {
                y21.mo70972a();
            }
            this.f42382f.getClass();
            Intrinsics.checkNotNullParameter(this, NotificationCompat.CATEGORY_CALL);
        }
    }

    /* renamed from: b */
    public final void mo70799b(y21 y21) {
        this.f42395s = y21;
    }

    /* renamed from: c */
    public final hw0 mo70800c() {
        return this.f42378b;
    }

    public Object clone() {
        return new x21(this.f42378b, this.f42379c, this.f42380d);
    }

    /* renamed from: d */
    public final y21 mo70802d() {
        return this.f42387k;
    }

    /* renamed from: e */
    public final d40 mo70803e() {
        return this.f42389m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.yandex.mobile.ads.impl.b51 mo70804f() throws java.io.IOException {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.yandex.mobile.ads.impl.hw0 r0 = r10.f42378b
            java.util.List r0 = r0.mo67658p()
            kotlin.collections.CollectionsKt.addAll(r2, r0)
            com.yandex.mobile.ads.impl.l51 r0 = new com.yandex.mobile.ads.impl.l51
            com.yandex.mobile.ads.impl.hw0 r1 = r10.f42378b
            r0.<init>(r1)
            r2.add(r0)
            com.yandex.mobile.ads.impl.xc r0 = new com.yandex.mobile.ads.impl.xc
            com.yandex.mobile.ads.impl.hw0 r1 = r10.f42378b
            com.yandex.mobile.ads.impl.ei r1 = r1.mo67650h()
            r0.<init>(r1)
            r2.add(r0)
            com.yandex.mobile.ads.impl.rd r0 = new com.yandex.mobile.ads.impl.rd
            com.yandex.mobile.ads.impl.hw0 r1 = r10.f42378b
            r1.getClass()
            r0.<init>()
            r2.add(r0)
            com.yandex.mobile.ads.impl.fh r0 = com.yandex.mobile.ads.impl.C13051fh.f33360a
            r2.add(r0)
            boolean r0 = r10.f42380d
            if (r0 != 0) goto L_0x0045
            com.yandex.mobile.ads.impl.hw0 r0 = r10.f42378b
            java.util.List r0 = r0.mo67659q()
            kotlin.collections.CollectionsKt.addAll(r2, r0)
        L_0x0045:
            com.yandex.mobile.ads.impl.be r0 = new com.yandex.mobile.ads.impl.be
            boolean r1 = r10.f42380d
            r0.<init>(r1)
            r2.add(r0)
            com.yandex.mobile.ads.impl.c31 r9 = new com.yandex.mobile.ads.impl.c31
            com.yandex.mobile.ads.impl.m41 r5 = r10.f42379c
            com.yandex.mobile.ads.impl.hw0 r0 = r10.f42378b
            int r6 = r0.mo67647e()
            com.yandex.mobile.ads.impl.hw0 r0 = r10.f42378b
            int r7 = r0.mo67663u()
            com.yandex.mobile.ads.impl.hw0 r0 = r10.f42378b
            int r8 = r0.mo67667z()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            com.yandex.mobile.ads.impl.m41 r2 = r10.f42379c     // Catch:{ IOException -> 0x0089, all -> 0x0087 }
            com.yandex.mobile.ads.impl.b51 r2 = r9.mo66193a(r2)     // Catch:{ IOException -> 0x0089, all -> 0x0087 }
            boolean r3 = r10.f42393q     // Catch:{ IOException -> 0x0089, all -> 0x0087 }
            if (r3 != 0) goto L_0x007c
            r10.mo70798b((java.io.IOException) r1)
            return r2
        L_0x007c:
            com.yandex.mobile.ads.impl.jh1.m37826a((java.io.Closeable) r2)     // Catch:{ IOException -> 0x0089, all -> 0x0087 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0089, all -> 0x0087 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0089, all -> 0x0087 }
            throw r2     // Catch:{ IOException -> 0x0089, all -> 0x0087 }
        L_0x0087:
            r2 = move-exception
            goto L_0x009d
        L_0x0089:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r10.mo70798b((java.io.IOException) r0)     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x0099
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x009a }
            throw r0     // Catch:{ all -> 0x009a }
        L_0x0099:
            throw r0     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x009d:
            if (r0 != 0) goto L_0x00a2
            r10.mo70798b((java.io.IOException) r1)
        L_0x00a2:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.x21.mo70804f():com.yandex.mobile.ads.impl.b51");
    }

    /* renamed from: g */
    public boolean mo70805g() {
        return this.f42393q;
    }

    /* renamed from: h */
    public final Socket mo70806h() {
        y21 y21 = this.f42387k;
        Intrinsics.checkNotNull(y21);
        if (!jh1.f35310f || Thread.holdsLock(y21)) {
            List<Reference<x21>> b = y21.mo70978b();
            Iterator<Reference<x21>> it = b.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().get(), (Object) this)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                z = true;
            }
            if (z) {
                b.remove(i);
                this.f42387k = null;
                if (b.isEmpty()) {
                    y21.mo70974a(System.nanoTime());
                    if (this.f42381e.mo65962a(y21)) {
                        return y21.mo70989l();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + y21);
    }

    /* renamed from: i */
    public final boolean mo70807i() {
        f40 f40 = this.f42386j;
        Intrinsics.checkNotNull(f40);
        return f40.mo66919b();
    }

    /* renamed from: j */
    public final void mo70808j() {
        if (!this.f42388l) {
            this.f42388l = true;
            this.f42383g.exit();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public b51 mo70797b() {
        if (this.f42384h.compareAndSet(false, true)) {
            this.f42383g.enter();
            lz0.C13944a aVar = lz0.f37135a;
            this.f42385i = lz0.f37136b.mo68533a("response.body().close()");
            this.f42382f.getClass();
            Intrinsics.checkNotNullParameter(this, NotificationCompat.CATEGORY_CALL);
            try {
                this.f42378b.mo67651i().mo70366a(this);
                return mo70804f();
            } finally {
                this.f42378b.mo67651i().mo70367b(this);
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    /* renamed from: a */
    public final void mo70794a(m41 m41, boolean z) {
        C14669te teVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        if (this.f42389m == null) {
            synchronized (this) {
                if (!(!this.f42391o)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                } else if (!this.f42390n) {
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (z) {
                b31 b31 = this.f42381e;
                fc0 g = m41.mo68568g();
                if (g.mo66959h()) {
                    SSLSocketFactory x = this.f42378b.mo67666x();
                    hostnameVerifier = this.f42378b.mo67657o();
                    sSLSocketFactory = x;
                    teVar = this.f42378b.mo67646d();
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    teVar = null;
                }
                String g2 = g.mo66958g();
                int i = g.mo66961i();
                a20 j = this.f42378b.mo67652j();
                SocketFactory w = this.f42378b.mo67665w();
                C14174oa s = this.f42378b.mo67661s();
                this.f42378b.getClass();
                this.f42386j = new f40(b31, new C14563s5(g2, i, j, w, sSLSocketFactory, hostnameVerifier, teVar, s, (Proxy) null, this.f42378b.mo67660r(), this.f42378b.mo67649g(), this.f42378b.mo67662t()), this, this.f42382f);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final IOException mo70798b(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f42392p) {
                this.f42392p = false;
                if (!this.f42390n && !this.f42391o) {
                    z = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return z ? m43916a(iOException) : iOException;
    }

    /* renamed from: a */
    public final d40 mo70791a(c31 c31) {
        Intrinsics.checkNotNullParameter(c31, "chain");
        synchronized (this) {
            if (!this.f42392p) {
                throw new IllegalStateException("released".toString());
            } else if (!(!this.f42391o)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.f42390n) {
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        f40 f40 = this.f42386j;
        Intrinsics.checkNotNull(f40);
        d40 d40 = new d40(this, this.f42382f, f40, f40.mo66915a(this.f42378b, c31));
        this.f42389m = d40;
        this.f42394r = d40;
        synchronized (this) {
            this.f42390n = true;
            this.f42391o = true;
            Unit unit2 = Unit.INSTANCE;
        }
        if (!this.f42393q) {
            return d40;
        }
        throw new IOException("Canceled");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[Catch:{ all -> 0x0017 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E mo70792a(com.yandex.mobile.ads.impl.d40 r2, boolean r3, boolean r4, E r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.yandex.mobile.ads.impl.d40 r0 = r1.f42394r
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r2 != 0) goto L_0x000e
            return r5
        L_0x000e:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L_0x0019
            boolean r0 = r1.f42390n     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0019
        L_0x0017:
            r2 = move-exception
            goto L_0x005a
        L_0x0019:
            if (r4 == 0) goto L_0x0041
            boolean r0 = r1.f42391o     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0041
        L_0x001f:
            if (r3 == 0) goto L_0x0023
            r1.f42390n = r2     // Catch:{ all -> 0x0017 }
        L_0x0023:
            if (r4 == 0) goto L_0x0027
            r1.f42391o = r2     // Catch:{ all -> 0x0017 }
        L_0x0027:
            boolean r3 = r1.f42390n     // Catch:{ all -> 0x0017 }
            r4 = 1
            if (r3 != 0) goto L_0x0032
            boolean r0 = r1.f42391o     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f42391o     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f42392p     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            r2 = 1
        L_0x003e:
            r3 = r2
            r2 = r0
            goto L_0x0042
        L_0x0041:
            r3 = 0
        L_0x0042:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0052
            r2 = 0
            r1.f42394r = r2
            com.yandex.mobile.ads.impl.y21 r2 = r1.f42387k
            if (r2 != 0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            r2.mo70984g()
        L_0x0052:
            if (r3 == 0) goto L_0x0059
            java.io.IOException r2 = r1.m43916a(r5)
            return r2
        L_0x0059:
            return r5
        L_0x005a:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.x21.mo70792a(com.yandex.mobile.ads.impl.d40, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: a */
    public final void mo70796a(boolean z) {
        d40 d40;
        synchronized (this) {
            if (this.f42392p) {
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (d40 = this.f42394r) != null) {
            d40.mo66409b();
        }
        this.f42389m = null;
    }

    /* renamed from: a */
    public final void mo70795a(y21 y21) {
        Intrinsics.checkNotNullParameter(y21, "connection");
        if (!jh1.f35310f || Thread.holdsLock(y21)) {
            if (this.f42387k == null) {
                this.f42387k = y21;
                y21.mo70978b().add(new C15141b(this, this.f42385i));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + y21);
    }

    /* renamed from: a */
    private final <E extends IOException> E m43916a(E e) {
        E e2;
        Socket h;
        boolean z = jh1.f35310f;
        if (!z || !Thread.holdsLock(this)) {
            y21 y21 = this.f42387k;
            if (y21 != null) {
                if (!z || !Thread.holdsLock(y21)) {
                    synchronized (y21) {
                        h = mo70806h();
                    }
                    if (this.f42387k == null) {
                        if (h != null) {
                            jh1.m37827a(h);
                        }
                        this.f42382f.getClass();
                        Intrinsics.checkNotNullParameter(this, NotificationCompat.CATEGORY_CALL);
                        Intrinsics.checkNotNullParameter(y21, "connection");
                    } else {
                        if (!(h == null)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                } else {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + y21);
                }
            }
            if (!this.f42388l && this.f42383g.exit()) {
                e2 = new InterruptedIOException("timeout");
                if (e != null) {
                    e2.initCause(e);
                }
            } else {
                e2 = e;
            }
            if (e != null) {
                b40 b40 = this.f42382f;
                Intrinsics.checkNotNull(e2);
                b40.getClass();
                Intrinsics.checkNotNullParameter(this, NotificationCompat.CATEGORY_CALL);
                Intrinsics.checkNotNullParameter(e2, "ioe");
            } else {
                this.f42382f.getClass();
                Intrinsics.checkNotNullParameter(this, NotificationCompat.CATEGORY_CALL);
            }
            return e2;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }
}
