package com.yandex.mobile.ads.impl;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

public final class rb0 {

    /* renamed from: a */
    private final int f39402a;

    /* renamed from: b */
    private final nb0 f39403b;

    /* renamed from: c */
    private long f39404c;

    /* renamed from: d */
    private long f39405d;

    /* renamed from: e */
    private long f39406e;

    /* renamed from: f */
    private long f39407f;

    /* renamed from: g */
    private final ArrayDeque<q90> f39408g;

    /* renamed from: h */
    private boolean f39409h;

    /* renamed from: i */
    private final C14450b f39410i;

    /* renamed from: j */
    private final C14449a f39411j;

    /* renamed from: k */
    private final C14451c f39412k = new C14451c(this);

    /* renamed from: l */
    private final C14451c f39413l = new C14451c(this);

    /* renamed from: m */
    private o30 f39414m;

    /* renamed from: n */
    private IOException f39415n;

    /* renamed from: com.yandex.mobile.ads.impl.rb0$a */
    public final class C14449a implements Sink {

        /* renamed from: b */
        private boolean f39416b;

        /* renamed from: c */
        private final Buffer f39417c = new Buffer();

        /* renamed from: d */
        private boolean f39418d;

        /* renamed from: e */
        final /* synthetic */ rb0 f39419e;

        public C14449a(rb0 rb0, boolean z) {
            Intrinsics.checkNotNullParameter(rb0, "this$0");
            this.f39419e = rb0;
            this.f39416b = z;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private final void m41547a(boolean z) throws IOException {
            long min;
            boolean z2;
            rb0 rb0 = this.f39419e;
            synchronized (rb0) {
                rb0.mo69735o().enter();
                while (rb0.mo69734n() >= rb0.mo69733m() && !this.f39416b && !this.f39418d && rb0.mo69723d() == null) {
                    try {
                        rb0.mo69740t();
                    } catch (Throwable th) {
                        rb0.mo69735o().mo69748a();
                        throw th;
                    }
                }
                rb0.mo69735o().mo69748a();
                rb0.mo69718b();
                min = Math.min(rb0.mo69733m() - rb0.mo69734n(), this.f39417c.size());
                rb0.mo69724d(rb0.mo69734n() + min);
                z2 = z && min == this.f39417c.size();
                Unit unit = Unit.INSTANCE;
            }
            this.f39419e.mo69735o().enter();
            try {
                this.f39419e.mo69721c().mo68974a(this.f39419e.mo69726f(), z2, this.f39417c, min);
            } finally {
                this.f39419e.mo69735o().mo69748a();
            }
        }

        /* renamed from: b */
        public final boolean mo69742b() {
            return this.f39418d;
        }

        /* renamed from: c */
        public final boolean mo69743c() {
            return this.f39416b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
            if (r10.f39419e.mo69731k().f39416b != false) goto L_0x0087;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
            if (r10.f39417c.size() <= 0) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
            if (r2 == false) goto L_0x0072;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
            if (r10.f39417c.size() <= 0) goto L_0x0087;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
            m41547a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
            if (r1 == false) goto L_0x0087;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
            r10.f39419e.mo69721c().mo68974a(r10.f39419e.mo69726f(), true, (okio.Buffer) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
            r0 = r10.f39419e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r10.f39418d = true;
            r1 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
            r10.f39419e.mo69721c().flush();
            r10.f39419e.mo69712a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r10 = this;
                com.yandex.mobile.ads.impl.rb0 r0 = r10.f39419e
                boolean r1 = com.yandex.mobile.ads.impl.jh1.f35310f
                if (r1 == 0) goto L_0x0034
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0034
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0034:
                com.yandex.mobile.ads.impl.rb0 r0 = r10.f39419e
                monitor-enter(r0)
                boolean r1 = r10.f39418d     // Catch:{ all -> 0x00a1 }
                if (r1 == 0) goto L_0x003d
                monitor-exit(r0)
                return
            L_0x003d:
                com.yandex.mobile.ads.impl.o30 r1 = r0.mo69723d()     // Catch:{ all -> 0x00a1 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0047
                r1 = 1
                goto L_0x0048
            L_0x0047:
                r1 = 0
            L_0x0048:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00a1 }
                monitor-exit(r0)
                com.yandex.mobile.ads.impl.rb0 r0 = r10.f39419e
                com.yandex.mobile.ads.impl.rb0$a r0 = r0.mo69731k()
                boolean r0 = r0.f39416b
                if (r0 != 0) goto L_0x0087
                okio.Buffer r0 = r10.f39417c
                long r4 = r0.size()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0062
                r2 = 1
            L_0x0062:
                if (r2 == 0) goto L_0x0072
            L_0x0064:
                okio.Buffer r0 = r10.f39417c
                long r0 = r0.size()
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto L_0x0087
                r10.m41547a(r3)
                goto L_0x0064
            L_0x0072:
                if (r1 == 0) goto L_0x0087
                com.yandex.mobile.ads.impl.rb0 r0 = r10.f39419e
                com.yandex.mobile.ads.impl.nb0 r4 = r0.mo69721c()
                com.yandex.mobile.ads.impl.rb0 r0 = r10.f39419e
                int r5 = r0.mo69726f()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.mo68974a((int) r5, (boolean) r6, (okio.Buffer) r7, (long) r8)
            L_0x0087:
                com.yandex.mobile.ads.impl.rb0 r0 = r10.f39419e
                monitor-enter(r0)
                r10.f39418d = r3     // Catch:{ all -> 0x009e }
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x009e }
                monitor-exit(r0)
                com.yandex.mobile.ads.impl.rb0 r0 = r10.f39419e
                com.yandex.mobile.ads.impl.nb0 r0 = r0.mo69721c()
                r0.flush()
                com.yandex.mobile.ads.impl.rb0 r0 = r10.f39419e
                r0.mo69712a()
                return
            L_0x009e:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00a1:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rb0.C14449a.close():void");
        }

        public void flush() throws IOException {
            rb0 rb0 = this.f39419e;
            if (!jh1.f35310f || !Thread.holdsLock(rb0)) {
                rb0 rb02 = this.f39419e;
                synchronized (rb02) {
                    rb02.mo69718b();
                    Unit unit = Unit.INSTANCE;
                }
                while (this.f39417c.size() > 0) {
                    m41547a(false);
                    this.f39419e.mo69721c().flush();
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + rb0);
        }

        public Timeout timeout() {
            return this.f39419e.mo69735o();
        }

        public void write(Buffer buffer, long j) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "source");
            rb0 rb0 = this.f39419e;
            if (!jh1.f35310f || !Thread.holdsLock(rb0)) {
                this.f39417c.write(buffer, j);
                while (this.f39417c.size() >= PlaybackStateCompat.ACTION_PREPARE) {
                    m41547a(false);
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + rb0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rb0$b */
    public final class C14450b implements Source {

        /* renamed from: b */
        private final long f39420b;

        /* renamed from: c */
        private boolean f39421c;

        /* renamed from: d */
        private final Buffer f39422d = new Buffer();

        /* renamed from: e */
        private final Buffer f39423e = new Buffer();

        /* renamed from: f */
        private boolean f39424f;

        /* renamed from: g */
        final /* synthetic */ rb0 f39425g;

        public C14450b(rb0 rb0, long j, boolean z) {
            Intrinsics.checkNotNullParameter(rb0, "this$0");
            this.f39425g = rb0;
            this.f39420b = j;
            this.f39421c = z;
        }

        /* renamed from: a */
        public final void mo69745a(boolean z) {
            this.f39421c = z;
        }

        /* renamed from: b */
        public final boolean mo69746b() {
            return this.f39424f;
        }

        /* renamed from: c */
        public final boolean mo69747c() {
            return this.f39421c;
        }

        public void close() throws IOException {
            long size;
            rb0 rb0 = this.f39425g;
            synchronized (rb0) {
                this.f39424f = true;
                size = this.f39423e.size();
                this.f39423e.clear();
                rb0.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (size > 0) {
                m41550a(size);
            }
            this.f39425g.mo69712a();
        }

        /* JADX INFO: finally extract failed */
        public long read(Buffer buffer, long j) throws IOException {
            long j2;
            boolean z;
            Buffer buffer2 = buffer;
            long j3 = j;
            Intrinsics.checkNotNullParameter(buffer2, "sink");
            long j4 = 0;
            if (j3 >= 0) {
                while (true) {
                    Throwable th = null;
                    rb0 rb0 = this.f39425g;
                    synchronized (rb0) {
                        rb0.mo69729i().enter();
                        try {
                            if (rb0.mo69723d() != null && (th = rb0.mo69725e()) == null) {
                                o30 d = rb0.mo69723d();
                                Intrinsics.checkNotNull(d);
                                th = new nb1(d);
                            }
                            if (!this.f39424f) {
                                if (this.f39423e.size() > j4) {
                                    Buffer buffer3 = this.f39423e;
                                    j2 = buffer3.read(buffer2, Math.min(j3, buffer3.size()));
                                    rb0.mo69722c(rb0.mo69728h() + j2);
                                    long h = rb0.mo69728h() - rb0.mo69727g();
                                    if (th == null && h >= ((long) (rb0.mo69721c().mo68993h().mo66780b() / 2))) {
                                        rb0.mo69721c().mo68969a(rb0.mo69726f(), h);
                                        rb0.mo69719b(rb0.mo69728h());
                                    }
                                } else if (this.f39421c || th != null) {
                                    j2 = -1;
                                } else {
                                    rb0.mo69740t();
                                    j2 = -1;
                                    z = true;
                                    rb0.mo69729i().mo69748a();
                                    Unit unit = Unit.INSTANCE;
                                }
                                z = false;
                                rb0.mo69729i().mo69748a();
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            rb0.mo69729i().mo69748a();
                            throw th2;
                        }
                    }
                    if (z) {
                        j4 = 0;
                    } else if (j2 != -1) {
                        m41550a(j2);
                        return j2;
                    } else if (th == null) {
                        return -1;
                    } else {
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
        }

        public Timeout timeout() {
            return this.f39425g.mo69729i();
        }

        /* renamed from: a */
        private final void m41550a(long j) {
            rb0 rb0 = this.f39425g;
            if (!jh1.f35310f || !Thread.holdsLock(rb0)) {
                this.f39425g.mo69721c().mo68981b(j);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + rb0);
        }

        /* renamed from: a */
        public final void mo69744a(BufferedSource bufferedSource, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            Intrinsics.checkNotNullParameter(bufferedSource, "source");
            rb0 rb0 = this.f39425g;
            if (!jh1.f35310f || !Thread.holdsLock(rb0)) {
                while (j > 0) {
                    synchronized (this.f39425g) {
                        z = this.f39421c;
                        z2 = true;
                        z3 = this.f39423e.size() + j > this.f39420b;
                        Unit unit = Unit.INSTANCE;
                    }
                    if (z3) {
                        bufferedSource.skip(j);
                        this.f39425g.mo69714a(o30.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        bufferedSource.skip(j);
                        return;
                    } else {
                        long read = bufferedSource.read(this.f39422d, j);
                        if (read != -1) {
                            j -= read;
                            rb0 rb02 = this.f39425g;
                            synchronized (rb02) {
                                if (this.f39424f) {
                                    j2 = this.f39422d.size();
                                    this.f39422d.clear();
                                } else {
                                    if (this.f39423e.size() != 0) {
                                        z2 = false;
                                    }
                                    this.f39423e.writeAll(this.f39422d);
                                    if (z2) {
                                        rb02.notifyAll();
                                    }
                                    j2 = 0;
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                            if (j2 > 0) {
                                m41550a(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + rb0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rb0$c */
    public final class C14451c extends AsyncTimeout {

        /* renamed from: a */
        final /* synthetic */ rb0 f39426a;

        public C14451c(rb0 rb0) {
            Intrinsics.checkNotNullParameter(rb0, "this$0");
            this.f39426a = rb0;
        }

        /* renamed from: a */
        public final void mo69748a() throws IOException {
            if (exit()) {
                throw newTimeoutException((IOException) null);
            }
        }

        /* access modifiers changed from: protected */
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void timedOut() {
            this.f39426a.mo69714a(o30.CANCEL);
            this.f39426a.mo69721c().mo68998m();
        }
    }

    public rb0(int i, nb0 nb0, boolean z, boolean z2, q90 q90) {
        Intrinsics.checkNotNullParameter(nb0, "connection");
        this.f39402a = i;
        this.f39403b = nb0;
        this.f39407f = (long) nb0.mo68994i().mo66780b();
        ArrayDeque<q90> arrayDeque = new ArrayDeque<>();
        this.f39408g = arrayDeque;
        this.f39410i = new C14450b(this, (long) nb0.mo68993h().mo66780b(), z2);
        this.f39411j = new C14449a(this, z);
        if (q90 != null) {
            if (!mo69736p()) {
                arrayDeque.add(q90);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!mo69736p()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: a */
    public final void mo69715a(o30 o30, IOException iOException) throws IOException {
        Intrinsics.checkNotNullParameter(o30, "rstStatusCode");
        if (m41516b(o30, iOException)) {
            this.f39403b.mo68980b(this.f39402a, o30);
        }
    }

    /* renamed from: b */
    public final void mo69719b(long j) {
        this.f39405d = j;
    }

    /* renamed from: c */
    public final nb0 mo69721c() {
        return this.f39403b;
    }

    /* renamed from: d */
    public final void mo69724d(long j) {
        this.f39406e = j;
    }

    /* renamed from: e */
    public final IOException mo69725e() {
        return this.f39415n;
    }

    /* renamed from: f */
    public final int mo69726f() {
        return this.f39402a;
    }

    /* renamed from: g */
    public final long mo69727g() {
        return this.f39405d;
    }

    /* renamed from: h */
    public final long mo69728h() {
        return this.f39404c;
    }

    /* renamed from: i */
    public final C14451c mo69729i() {
        return this.f39412k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okio.Sink mo69730j() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f39409h     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.mo69736p()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            com.yandex.mobile.ads.impl.rb0$a r0 = r2.f39411j
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rb0.mo69730j():okio.Sink");
    }

    /* renamed from: k */
    public final C14449a mo69731k() {
        return this.f39411j;
    }

    /* renamed from: l */
    public final C14450b mo69732l() {
        return this.f39410i;
    }

    /* renamed from: m */
    public final long mo69733m() {
        return this.f39407f;
    }

    /* renamed from: n */
    public final long mo69734n() {
        return this.f39406e;
    }

    /* renamed from: o */
    public final C14451c mo69735o() {
        return this.f39413l;
    }

    /* renamed from: p */
    public final boolean mo69736p() {
        if (this.f39403b.mo68985c() == ((this.f39402a & 1) == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final synchronized boolean mo69737q() {
        if (this.f39414m != null) {
            return false;
        }
        if ((this.f39410i.mo69747c() || this.f39410i.mo69746b()) && ((this.f39411j.mo69743c() || this.f39411j.mo69742b()) && this.f39409h)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final Timeout mo69738r() {
        return this.f39412k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r2.f39412k.mo69748a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.yandex.mobile.ads.impl.q90 mo69739s() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.mobile.ads.impl.rb0$c r0 = r2.f39412k     // Catch:{ all -> 0x004a }
            r0.enter()     // Catch:{ all -> 0x004a }
        L_0x0006:
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.q90> r0 = r2.f39408g     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0016
            com.yandex.mobile.ads.impl.o30 r0 = r2.f39414m     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0016
            r2.mo69740t()     // Catch:{ all -> 0x0043 }
            goto L_0x0006
        L_0x0016:
            com.yandex.mobile.ads.impl.rb0$c r0 = r2.f39412k     // Catch:{ all -> 0x004a }
            r0.mo69748a()     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.q90> r0 = r2.f39408g     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0034
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.q90> r0 = r2.f39408g     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "headersQueue.removeFirst()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ all -> 0x004a }
            com.yandex.mobile.ads.impl.q90 r0 = (com.yandex.mobile.ads.impl.q90) r0     // Catch:{ all -> 0x004a }
            monitor-exit(r2)
            return r0
        L_0x0034:
            java.io.IOException r0 = r2.f39415n     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0042
            com.yandex.mobile.ads.impl.nb1 r0 = new com.yandex.mobile.ads.impl.nb1     // Catch:{ all -> 0x004a }
            com.yandex.mobile.ads.impl.o30 r1 = r2.f39414m     // Catch:{ all -> 0x004a }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ all -> 0x004a }
            r0.<init>(r1)     // Catch:{ all -> 0x004a }
        L_0x0042:
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0043:
            r0 = move-exception
            com.yandex.mobile.ads.impl.rb0$c r1 = r2.f39412k     // Catch:{ all -> 0x004a }
            r1.mo69748a()     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rb0.mo69739s():com.yandex.mobile.ads.impl.q90");
    }

    /* renamed from: t */
    public final void mo69740t() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: u */
    public final Timeout mo69741u() {
        return this.f39413l;
    }

    /* renamed from: b */
    public final synchronized void mo69720b(o30 o30) {
        Intrinsics.checkNotNullParameter(o30, IronSourceConstants.EVENTS_ERROR_CODE);
        if (this.f39414m == null) {
            this.f39414m = o30;
            notifyAll();
        }
    }

    /* renamed from: c */
    public final void mo69722c(long j) {
        this.f39404c = j;
    }

    /* renamed from: d */
    public final synchronized o30 mo69723d() {
        return this.f39414m;
    }

    /* renamed from: a */
    public final void mo69714a(o30 o30) {
        Intrinsics.checkNotNullParameter(o30, IronSourceConstants.EVENTS_ERROR_CODE);
        if (m41516b(o30, (IOException) null)) {
            this.f39403b.mo68984c(this.f39402a, o30);
        }
    }

    /* renamed from: a */
    public final void mo69713a(long j) {
        this.f39407f += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo69717a(BufferedSource bufferedSource, int i) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "source");
        if (!jh1.f35310f || !Thread.holdsLock(this)) {
            this.f39410i.mo69744a(bufferedSource, (long) i);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69716a(com.yandex.mobile.ads.impl.q90 r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = com.yandex.mobile.ads.impl.jh1.f35310f
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x0037
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0037:
            monitor-enter(r2)
            boolean r0 = r2.f39409h     // Catch:{ all -> 0x0068 }
            r1 = 1
            if (r0 == 0) goto L_0x0046
            if (r4 != 0) goto L_0x0040
            goto L_0x0046
        L_0x0040:
            com.yandex.mobile.ads.impl.rb0$b r3 = r2.f39410i     // Catch:{ all -> 0x0068 }
            r3.getClass()     // Catch:{ all -> 0x0068 }
            goto L_0x004d
        L_0x0046:
            r2.f39409h = r1     // Catch:{ all -> 0x0068 }
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.q90> r0 = r2.f39408g     // Catch:{ all -> 0x0068 }
            r0.add(r3)     // Catch:{ all -> 0x0068 }
        L_0x004d:
            if (r4 == 0) goto L_0x0054
            com.yandex.mobile.ads.impl.rb0$b r3 = r2.f39410i     // Catch:{ all -> 0x0068 }
            r3.mo69745a((boolean) r1)     // Catch:{ all -> 0x0068 }
        L_0x0054:
            boolean r3 = r2.mo69737q()     // Catch:{ all -> 0x0068 }
            r2.notifyAll()     // Catch:{ all -> 0x0068 }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0068 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0067
            com.yandex.mobile.ads.impl.nb0 r3 = r2.f39403b
            int r4 = r2.f39402a
            r3.mo68983c((int) r4)
        L_0x0067:
            return
        L_0x0068:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rb0.mo69716a(com.yandex.mobile.ads.impl.q90, boolean):void");
    }

    /* renamed from: b */
    public final void mo69718b() throws IOException {
        if (this.f39411j.mo69742b()) {
            throw new IOException("stream closed");
        } else if (this.f39411j.mo69743c()) {
            throw new IOException("stream finished");
        } else if (this.f39414m != null) {
            Throwable th = this.f39415n;
            if (th == null) {
                o30 o30 = this.f39414m;
                Intrinsics.checkNotNull(o30);
                th = new nb1(o30);
            }
            throw th;
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    private final boolean m41516b(com.yandex.mobile.ads.impl.o30 r3, java.io.IOException r4) {
        /*
            r2 = this;
            boolean r0 = com.yandex.mobile.ads.impl.jh1.f35310f
            if (r0 == 0) goto L_0x0032
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x000b
            goto L_0x0032
        L_0x000b:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0032:
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0064 }
            com.yandex.mobile.ads.impl.o30 r0 = r2.f39414m     // Catch:{ all -> 0x0061 }
            monitor-exit(r2)     // Catch:{ all -> 0x0064 }
            r1 = 0
            if (r0 == 0) goto L_0x003c
            monitor-exit(r2)
            return r1
        L_0x003c:
            com.yandex.mobile.ads.impl.rb0$b r0 = r2.f39410i     // Catch:{ all -> 0x0064 }
            boolean r0 = r0.mo69747c()     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x004e
            com.yandex.mobile.ads.impl.rb0$a r0 = r2.f39411j     // Catch:{ all -> 0x0064 }
            boolean r0 = r0.mo69743c()     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x004e
            monitor-exit(r2)
            return r1
        L_0x004e:
            r2.f39414m = r3     // Catch:{ all -> 0x0064 }
            r2.f39415n = r4     // Catch:{ all -> 0x0064 }
            r2.notifyAll()     // Catch:{ all -> 0x0064 }
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0064 }
            monitor-exit(r2)
            com.yandex.mobile.ads.impl.nb0 r3 = r2.f39403b
            int r4 = r2.f39402a
            r3.mo68983c((int) r4)
            r3 = 1
            return r3
        L_0x0061:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0064 }
            throw r3     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rb0.m41516b(com.yandex.mobile.ads.impl.o30, java.io.IOException):boolean");
    }

    /* renamed from: a */
    public final void mo69712a() throws IOException {
        boolean z;
        boolean q;
        if (!jh1.f35310f || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.f39410i.mo69747c() && this.f39410i.mo69746b() && (this.f39411j.mo69743c() || this.f39411j.mo69742b());
                q = mo69737q();
                Unit unit = Unit.INSTANCE;
            }
            if (z) {
                mo69715a(o30.CANCEL, (IOException) null);
            } else if (!q) {
                this.f39403b.mo68983c(this.f39402a);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }
}
