package com.fyber.inneractive.sdk.player.p059c.p063d;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3479a;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3497b;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.d */
public final class C3263d implements C3278n {

    /* renamed from: a */
    public final int f8339a;

    /* renamed from: b */
    public final C3265b f8340b = new C3265b();

    /* renamed from: c */
    public final LinkedBlockingDeque<C3479a> f8341c = new LinkedBlockingDeque<>();

    /* renamed from: d */
    public final C3264a f8342d = new C3264a((byte) 0);

    /* renamed from: e */
    public final C3548k f8343e = new C3548k(32);

    /* renamed from: f */
    public long f8344f;

    /* renamed from: g */
    public C3290h f8345g;

    /* renamed from: h */
    public C3266c f8346h;

    /* renamed from: i */
    private final C3497b f8347i;

    /* renamed from: j */
    private final AtomicInteger f8348j = new AtomicInteger();

    /* renamed from: k */
    private boolean f8349k;

    /* renamed from: l */
    private C3290h f8350l;

    /* renamed from: m */
    private long f8351m;

    /* renamed from: n */
    private long f8352n;

    /* renamed from: o */
    private C3479a f8353o;

    /* renamed from: p */
    private int f8354p = this.f8339a;

    /* renamed from: q */
    private boolean f8355q;

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d$c */
    public interface C3266c {
        /* renamed from: a */
        void mo19055a();
    }

    public C3263d(C3497b bVar) {
        this.f8347i = bVar;
        this.f8339a = bVar.mo19344c();
    }

    /* renamed from: a */
    public final void mo19042a(boolean z) {
        int andSet = this.f8348j.getAndSet(z ? 0 : 2);
        m7987d();
        C3265b bVar = this.f8340b;
        bVar.f8364e = Long.MIN_VALUE;
        bVar.f8365f = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f8345g = null;
        }
    }

    /* renamed from: a */
    public final void mo19036a() {
        if (this.f8348j.getAndSet(2) == 0) {
            m7987d();
        }
    }

    /* renamed from: a */
    public final boolean mo19043a(long j, boolean z) {
        long a = this.f8340b.mo19046a(j, z);
        if (a == -1) {
            return false;
        }
        mo19037a(a);
        return true;
    }

    /* renamed from: a */
    public final void mo19039a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            mo19037a(j);
            int i3 = (int) (j - this.f8344f);
            int min = Math.min(i - i2, this.f8339a - i3);
            C3479a peek = this.f8341c.peek();
            System.arraycopy(peek.f9412a, peek.f9413b + i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
        }
    }

    /* renamed from: a */
    public final void mo19037a(long j) {
        int i = ((int) (j - this.f8344f)) / this.f8339a;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8347i.mo19341a(this.f8341c.remove());
            this.f8344f += (long) this.f8339a;
        }
    }

    /* renamed from: a */
    public final void mo19040a(C3290h hVar) {
        C3290h hVar2;
        long j = this.f8351m;
        if (hVar == null) {
            hVar2 = null;
        } else {
            hVar2 = (j == 0 || hVar.f8510w == Long.MAX_VALUE) ? hVar : hVar.mo19088a(hVar.f8510w + j);
        }
        boolean a = this.f8340b.mo19049a(hVar2);
        this.f8350l = hVar;
        this.f8349k = false;
        C3266c cVar = this.f8346h;
        if (cVar != null && a) {
            cVar.mo19055a();
        }
    }

    /* renamed from: a */
    public final int mo19035a(C3269g gVar, int i, boolean z) throws IOException, InterruptedException {
        if (!m7985b()) {
            int a = gVar.mo19004a(i);
            if (a != -1) {
                return a;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int a2 = m7984a(i);
            int a3 = gVar.mo19005a(this.f8353o.f9412a, this.f8353o.f9413b + this.f8354p, a2);
            if (a3 != -1) {
                this.f8354p += a3;
                this.f8352n += (long) a3;
                m7986c();
                return a3;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        } finally {
            m7986c();
        }
    }

    /* renamed from: a */
    public final void mo19041a(C3548k kVar, int i) {
        if (!m7985b()) {
            kVar.mo19388d(i);
            return;
        }
        while (i > 0) {
            int a = m7984a(i);
            kVar.mo19382a(this.f8353o.f9412a, this.f8353o.f9413b + this.f8354p, a);
            this.f8354p += a;
            this.f8352n += (long) a;
            i -= a;
        }
        m7986c();
    }

    /* renamed from: a */
    public final void mo19038a(long j, int i, int i2, int i3, byte[] bArr) {
        long j2 = j;
        if (this.f8349k) {
            mo19040a(this.f8350l);
        }
        if (!m7985b()) {
            this.f8340b.mo19047a(j);
            return;
        }
        try {
            if (this.f8355q) {
                if ((i & 1) != 0) {
                    if (this.f8340b.mo19051b(j)) {
                        this.f8355q = false;
                    }
                }
                return;
            }
            this.f8340b.mo19048a(j2 + this.f8351m, i, (this.f8352n - ((long) i2)) - ((long) i3), i2, bArr);
            m7986c();
        } finally {
            m7986c();
        }
    }

    /* renamed from: b */
    private boolean m7985b() {
        return this.f8348j.compareAndSet(0, 1);
    }

    /* renamed from: c */
    private void m7986c() {
        if (!this.f8348j.compareAndSet(1, 0)) {
            m7987d();
        }
    }

    /* renamed from: d */
    private void m7987d() {
        C3265b bVar = this.f8340b;
        bVar.f8361b = 0;
        bVar.f8362c = 0;
        bVar.f8363d = 0;
        bVar.f8360a = 0;
        bVar.f8366g = true;
        C3497b bVar2 = this.f8347i;
        LinkedBlockingDeque<C3479a> linkedBlockingDeque = this.f8341c;
        bVar2.mo19342a((C3479a[]) linkedBlockingDeque.toArray(new C3479a[linkedBlockingDeque.size()]));
        this.f8341c.clear();
        this.f8347i.mo19343b();
        this.f8344f = 0;
        this.f8352n = 0;
        this.f8353o = null;
        this.f8354p = this.f8339a;
    }

    /* renamed from: a */
    private int m7984a(int i) {
        if (this.f8354p == this.f8339a) {
            this.f8354p = 0;
            C3479a a = this.f8347i.mo19340a();
            this.f8353o = a;
            this.f8341c.add(a);
        }
        return Math.min(i, this.f8339a - this.f8354p);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d$b */
    private static final class C3265b {

        /* renamed from: a */
        int f8360a;

        /* renamed from: b */
        int f8361b;

        /* renamed from: c */
        int f8362c;

        /* renamed from: d */
        int f8363d;

        /* renamed from: e */
        long f8364e = Long.MIN_VALUE;

        /* renamed from: f */
        long f8365f = Long.MIN_VALUE;

        /* renamed from: g */
        boolean f8366g = true;

        /* renamed from: h */
        private int f8367h = 1000;

        /* renamed from: i */
        private int[] f8368i = new int[1000];

        /* renamed from: j */
        private long[] f8369j = new long[1000];

        /* renamed from: k */
        private int[] f8370k = new int[1000];

        /* renamed from: l */
        private int[] f8371l = new int[1000];

        /* renamed from: m */
        private long[] f8372m = new long[1000];

        /* renamed from: n */
        private byte[][] f8373n = new byte[1000][];

        /* renamed from: o */
        private C3290h[] f8374o = new C3290h[1000];

        /* renamed from: p */
        private boolean f8375p = true;

        /* renamed from: q */
        private C3290h f8376q;

        /* renamed from: r */
        private int f8377r;

        /* renamed from: a */
        public final int mo19044a() {
            return this.f8361b + this.f8360a;
        }

        /* renamed from: b */
        public final synchronized boolean mo19050b() {
            return this.f8360a == 0;
        }

        /* renamed from: c */
        public final synchronized C3290h mo19052c() {
            if (this.f8375p) {
                return null;
            }
            return this.f8376q;
        }

        /* renamed from: d */
        public final synchronized long mo19053d() {
            return Math.max(this.f8364e, this.f8365f);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
            return -3;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int mo19045a(com.fyber.inneractive.sdk.player.p059c.C3292i r5, com.fyber.inneractive.sdk.player.p059c.p061b.C3225d r6, boolean r7, boolean r8, com.fyber.inneractive.sdk.player.p059c.C3290h r9, com.fyber.inneractive.sdk.player.p059c.p063d.C3263d.C3264a r10) {
            /*
                r4 = this;
                monitor-enter(r4)
                int r0 = r4.f8360a     // Catch:{ all -> 0x00a4 }
                r1 = -5
                r2 = -3
                r3 = -4
                if (r0 != 0) goto L_0x0021
                if (r8 == 0) goto L_0x000f
                r5 = 4
                r6.f8109a = r5     // Catch:{ all -> 0x00a4 }
                monitor-exit(r4)
                return r3
            L_0x000f:
                com.fyber.inneractive.sdk.player.c.h r6 = r4.f8376q     // Catch:{ all -> 0x00a4 }
                if (r6 == 0) goto L_0x001f
                if (r7 != 0) goto L_0x0019
                com.fyber.inneractive.sdk.player.c.h r6 = r4.f8376q     // Catch:{ all -> 0x00a4 }
                if (r6 == r9) goto L_0x001f
            L_0x0019:
                com.fyber.inneractive.sdk.player.c.h r6 = r4.f8376q     // Catch:{ all -> 0x00a4 }
                r5.f8514a = r6     // Catch:{ all -> 0x00a4 }
                monitor-exit(r4)
                return r1
            L_0x001f:
                monitor-exit(r4)
                return r2
            L_0x0021:
                if (r7 != 0) goto L_0x009a
                com.fyber.inneractive.sdk.player.c.h[] r7 = r4.f8374o     // Catch:{ all -> 0x00a4 }
                int r8 = r4.f8362c     // Catch:{ all -> 0x00a4 }
                r7 = r7[r8]     // Catch:{ all -> 0x00a4 }
                if (r7 == r9) goto L_0x002c
                goto L_0x009a
            L_0x002c:
                java.nio.ByteBuffer r5 = r6.f8130c     // Catch:{ all -> 0x00a4 }
                r7 = 0
                r8 = 1
                if (r5 != 0) goto L_0x0038
                int r5 = r6.f8132e     // Catch:{ all -> 0x00a4 }
                if (r5 != 0) goto L_0x0038
                r5 = 1
                goto L_0x0039
            L_0x0038:
                r5 = 0
            L_0x0039:
                if (r5 == 0) goto L_0x003d
                monitor-exit(r4)
                return r2
            L_0x003d:
                long[] r5 = r4.f8372m     // Catch:{ all -> 0x00a4 }
                int r9 = r4.f8362c     // Catch:{ all -> 0x00a4 }
                r0 = r5[r9]     // Catch:{ all -> 0x00a4 }
                r6.f8131d = r0     // Catch:{ all -> 0x00a4 }
                int[] r5 = r4.f8371l     // Catch:{ all -> 0x00a4 }
                int r9 = r4.f8362c     // Catch:{ all -> 0x00a4 }
                r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
                r6.f8109a = r5     // Catch:{ all -> 0x00a4 }
                int[] r5 = r4.f8370k     // Catch:{ all -> 0x00a4 }
                int r9 = r4.f8362c     // Catch:{ all -> 0x00a4 }
                r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
                r10.f8356a = r5     // Catch:{ all -> 0x00a4 }
                long[] r5 = r4.f8369j     // Catch:{ all -> 0x00a4 }
                int r9 = r4.f8362c     // Catch:{ all -> 0x00a4 }
                r0 = r5[r9]     // Catch:{ all -> 0x00a4 }
                r10.f8357b = r0     // Catch:{ all -> 0x00a4 }
                byte[][] r5 = r4.f8373n     // Catch:{ all -> 0x00a4 }
                int r9 = r4.f8362c     // Catch:{ all -> 0x00a4 }
                r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
                r10.f8359d = r5     // Catch:{ all -> 0x00a4 }
                long r0 = r4.f8364e     // Catch:{ all -> 0x00a4 }
                long r5 = r6.f8131d     // Catch:{ all -> 0x00a4 }
                long r5 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x00a4 }
                r4.f8364e = r5     // Catch:{ all -> 0x00a4 }
                int r5 = r4.f8360a     // Catch:{ all -> 0x00a4 }
                int r5 = r5 - r8
                r4.f8360a = r5     // Catch:{ all -> 0x00a4 }
                int r5 = r4.f8362c     // Catch:{ all -> 0x00a4 }
                int r5 = r5 + r8
                r4.f8362c = r5     // Catch:{ all -> 0x00a4 }
                int r6 = r4.f8361b     // Catch:{ all -> 0x00a4 }
                int r6 = r6 + r8
                r4.f8361b = r6     // Catch:{ all -> 0x00a4 }
                int r6 = r4.f8367h     // Catch:{ all -> 0x00a4 }
                if (r5 != r6) goto L_0x0084
                r4.f8362c = r7     // Catch:{ all -> 0x00a4 }
            L_0x0084:
                int r5 = r4.f8360a     // Catch:{ all -> 0x00a4 }
                if (r5 <= 0) goto L_0x008f
                long[] r5 = r4.f8369j     // Catch:{ all -> 0x00a4 }
                int r6 = r4.f8362c     // Catch:{ all -> 0x00a4 }
                r6 = r5[r6]     // Catch:{ all -> 0x00a4 }
                goto L_0x0096
            L_0x008f:
                long r5 = r10.f8357b     // Catch:{ all -> 0x00a4 }
                int r7 = r10.f8356a     // Catch:{ all -> 0x00a4 }
                long r7 = (long) r7     // Catch:{ all -> 0x00a4 }
                long r6 = r5 + r7
            L_0x0096:
                r10.f8358c = r6     // Catch:{ all -> 0x00a4 }
                monitor-exit(r4)
                return r3
            L_0x009a:
                com.fyber.inneractive.sdk.player.c.h[] r6 = r4.f8374o     // Catch:{ all -> 0x00a4 }
                int r7 = r4.f8362c     // Catch:{ all -> 0x00a4 }
                r6 = r6[r7]     // Catch:{ all -> 0x00a4 }
                r5.f8514a = r6     // Catch:{ all -> 0x00a4 }
                monitor-exit(r4)
                return r1
            L_0x00a4:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.C3263d.C3265b.mo19045a(com.fyber.inneractive.sdk.player.c.i, com.fyber.inneractive.sdk.player.c.b.d, boolean, boolean, com.fyber.inneractive.sdk.player.c.h, com.fyber.inneractive.sdk.player.c.d.d$a):int");
        }

        /* renamed from: e */
        public final synchronized long mo19054e() {
            if (this.f8360a == 0) {
                return -1;
            }
            int i = ((this.f8362c + this.f8360a) - 1) % this.f8367h;
            this.f8362c = (this.f8362c + this.f8360a) % this.f8367h;
            this.f8361b += this.f8360a;
            this.f8360a = 0;
            return this.f8369j[i] + ((long) this.f8370k[i]);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
            return -1;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized long mo19046a(long r9, boolean r11) {
            /*
                r8 = this;
                monitor-enter(r8)
                int r0 = r8.f8360a     // Catch:{ all -> 0x005c }
                r1 = -1
                if (r0 == 0) goto L_0x005a
                long[] r0 = r8.f8372m     // Catch:{ all -> 0x005c }
                int r3 = r8.f8362c     // Catch:{ all -> 0x005c }
                r3 = r0[r3]     // Catch:{ all -> 0x005c }
                int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r0 >= 0) goto L_0x0012
                goto L_0x005a
            L_0x0012:
                long r3 = r8.f8365f     // Catch:{ all -> 0x005c }
                int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r0 <= 0) goto L_0x001c
                if (r11 != 0) goto L_0x001c
                monitor-exit(r8)
                return r1
            L_0x001c:
                r11 = 0
                int r0 = r8.f8362c     // Catch:{ all -> 0x005c }
                r3 = -1
                r4 = -1
            L_0x0021:
                int r5 = r8.f8363d     // Catch:{ all -> 0x005c }
                if (r0 == r5) goto L_0x003e
                long[] r5 = r8.f8372m     // Catch:{ all -> 0x005c }
                r6 = r5[r0]     // Catch:{ all -> 0x005c }
                int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r5 > 0) goto L_0x003e
                int[] r5 = r8.f8371l     // Catch:{ all -> 0x005c }
                r5 = r5[r0]     // Catch:{ all -> 0x005c }
                r5 = r5 & 1
                if (r5 == 0) goto L_0x0036
                r4 = r11
            L_0x0036:
                int r0 = r0 + 1
                int r5 = r8.f8367h     // Catch:{ all -> 0x005c }
                int r0 = r0 % r5
                int r11 = r11 + 1
                goto L_0x0021
            L_0x003e:
                if (r4 != r3) goto L_0x0042
                monitor-exit(r8)
                return r1
            L_0x0042:
                int r9 = r8.f8362c     // Catch:{ all -> 0x005c }
                int r9 = r9 + r4
                int r10 = r8.f8367h     // Catch:{ all -> 0x005c }
                int r9 = r9 % r10
                r8.f8362c = r9     // Catch:{ all -> 0x005c }
                int r10 = r8.f8361b     // Catch:{ all -> 0x005c }
                int r10 = r10 + r4
                r8.f8361b = r10     // Catch:{ all -> 0x005c }
                int r10 = r8.f8360a     // Catch:{ all -> 0x005c }
                int r10 = r10 - r4
                r8.f8360a = r10     // Catch:{ all -> 0x005c }
                long[] r10 = r8.f8369j     // Catch:{ all -> 0x005c }
                r9 = r10[r9]     // Catch:{ all -> 0x005c }
                monitor-exit(r8)
                return r9
            L_0x005a:
                monitor-exit(r8)
                return r1
            L_0x005c:
                r9 = move-exception
                monitor-exit(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.C3263d.C3265b.mo19046a(long, boolean):long");
        }

        /* renamed from: a */
        public final synchronized boolean mo19049a(C3290h hVar) {
            if (hVar == null) {
                this.f8375p = true;
                return false;
            }
            this.f8375p = false;
            if (C3560t.m8885a((Object) hVar, (Object) this.f8376q)) {
                return false;
            }
            this.f8376q = hVar;
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e8, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo19048a(long r6, int r8, long r9, int r11, byte[] r12) {
            /*
                r5 = this;
                monitor-enter(r5)
                boolean r0 = r5.f8366g     // Catch:{ all -> 0x00e9 }
                r1 = 0
                if (r0 == 0) goto L_0x000e
                r0 = r8 & 1
                if (r0 != 0) goto L_0x000c
                monitor-exit(r5)
                return
            L_0x000c:
                r5.f8366g = r1     // Catch:{ all -> 0x00e9 }
            L_0x000e:
                boolean r0 = r5.f8375p     // Catch:{ all -> 0x00e9 }
                r2 = 1
                if (r0 != 0) goto L_0x0015
                r0 = 1
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r0)     // Catch:{ all -> 0x00e9 }
                r5.mo19047a((long) r6)     // Catch:{ all -> 0x00e9 }
                long[] r0 = r5.f8372m     // Catch:{ all -> 0x00e9 }
                int r3 = r5.f8363d     // Catch:{ all -> 0x00e9 }
                r0[r3] = r6     // Catch:{ all -> 0x00e9 }
                long[] r6 = r5.f8369j     // Catch:{ all -> 0x00e9 }
                int r7 = r5.f8363d     // Catch:{ all -> 0x00e9 }
                r6[r7] = r9     // Catch:{ all -> 0x00e9 }
                int[] r6 = r5.f8370k     // Catch:{ all -> 0x00e9 }
                int r7 = r5.f8363d     // Catch:{ all -> 0x00e9 }
                r6[r7] = r11     // Catch:{ all -> 0x00e9 }
                int[] r6 = r5.f8371l     // Catch:{ all -> 0x00e9 }
                int r7 = r5.f8363d     // Catch:{ all -> 0x00e9 }
                r6[r7] = r8     // Catch:{ all -> 0x00e9 }
                byte[][] r6 = r5.f8373n     // Catch:{ all -> 0x00e9 }
                int r7 = r5.f8363d     // Catch:{ all -> 0x00e9 }
                r6[r7] = r12     // Catch:{ all -> 0x00e9 }
                com.fyber.inneractive.sdk.player.c.h[] r6 = r5.f8374o     // Catch:{ all -> 0x00e9 }
                int r7 = r5.f8363d     // Catch:{ all -> 0x00e9 }
                com.fyber.inneractive.sdk.player.c.h r8 = r5.f8376q     // Catch:{ all -> 0x00e9 }
                r6[r7] = r8     // Catch:{ all -> 0x00e9 }
                int[] r6 = r5.f8368i     // Catch:{ all -> 0x00e9 }
                int r7 = r5.f8363d     // Catch:{ all -> 0x00e9 }
                int r8 = r5.f8377r     // Catch:{ all -> 0x00e9 }
                r6[r7] = r8     // Catch:{ all -> 0x00e9 }
                int r6 = r5.f8360a     // Catch:{ all -> 0x00e9 }
                int r6 = r6 + r2
                r5.f8360a = r6     // Catch:{ all -> 0x00e9 }
                int r7 = r5.f8367h     // Catch:{ all -> 0x00e9 }
                if (r6 != r7) goto L_0x00dc
                int r6 = r5.f8367h     // Catch:{ all -> 0x00e9 }
                int r6 = r6 + 1000
                int[] r7 = new int[r6]     // Catch:{ all -> 0x00e9 }
                long[] r8 = new long[r6]     // Catch:{ all -> 0x00e9 }
                long[] r9 = new long[r6]     // Catch:{ all -> 0x00e9 }
                int[] r10 = new int[r6]     // Catch:{ all -> 0x00e9 }
                int[] r11 = new int[r6]     // Catch:{ all -> 0x00e9 }
                byte[][] r12 = new byte[r6][]     // Catch:{ all -> 0x00e9 }
                com.fyber.inneractive.sdk.player.c.h[] r0 = new com.fyber.inneractive.sdk.player.p059c.C3290h[r6]     // Catch:{ all -> 0x00e9 }
                int r2 = r5.f8367h     // Catch:{ all -> 0x00e9 }
                int r3 = r5.f8362c     // Catch:{ all -> 0x00e9 }
                int r2 = r2 - r3
                long[] r3 = r5.f8369j     // Catch:{ all -> 0x00e9 }
                int r4 = r5.f8362c     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00e9 }
                long[] r3 = r5.f8372m     // Catch:{ all -> 0x00e9 }
                int r4 = r5.f8362c     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00e9 }
                int[] r3 = r5.f8371l     // Catch:{ all -> 0x00e9 }
                int r4 = r5.f8362c     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00e9 }
                int[] r3 = r5.f8370k     // Catch:{ all -> 0x00e9 }
                int r4 = r5.f8362c     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00e9 }
                byte[][] r3 = r5.f8373n     // Catch:{ all -> 0x00e9 }
                int r4 = r5.f8362c     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00e9 }
                com.fyber.inneractive.sdk.player.c.h[] r3 = r5.f8374o     // Catch:{ all -> 0x00e9 }
                int r4 = r5.f8362c     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00e9 }
                int[] r3 = r5.f8368i     // Catch:{ all -> 0x00e9 }
                int r4 = r5.f8362c     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00e9 }
                int r3 = r5.f8362c     // Catch:{ all -> 0x00e9 }
                long[] r4 = r5.f8369j     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00e9 }
                long[] r4 = r5.f8372m     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00e9 }
                int[] r4 = r5.f8371l     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00e9 }
                int[] r4 = r5.f8370k     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00e9 }
                byte[][] r4 = r5.f8373n     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00e9 }
                com.fyber.inneractive.sdk.player.c.h[] r4 = r5.f8374o     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00e9 }
                int[] r4 = r5.f8368i     // Catch:{ all -> 0x00e9 }
                java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00e9 }
                r5.f8369j = r8     // Catch:{ all -> 0x00e9 }
                r5.f8372m = r9     // Catch:{ all -> 0x00e9 }
                r5.f8371l = r10     // Catch:{ all -> 0x00e9 }
                r5.f8370k = r11     // Catch:{ all -> 0x00e9 }
                r5.f8373n = r12     // Catch:{ all -> 0x00e9 }
                r5.f8374o = r0     // Catch:{ all -> 0x00e9 }
                r5.f8368i = r7     // Catch:{ all -> 0x00e9 }
                r5.f8362c = r1     // Catch:{ all -> 0x00e9 }
                int r7 = r5.f8367h     // Catch:{ all -> 0x00e9 }
                r5.f8363d = r7     // Catch:{ all -> 0x00e9 }
                int r7 = r5.f8367h     // Catch:{ all -> 0x00e9 }
                r5.f8360a = r7     // Catch:{ all -> 0x00e9 }
                r5.f8367h = r6     // Catch:{ all -> 0x00e9 }
                monitor-exit(r5)
                return
            L_0x00dc:
                int r6 = r5.f8363d     // Catch:{ all -> 0x00e9 }
                int r6 = r6 + r2
                r5.f8363d = r6     // Catch:{ all -> 0x00e9 }
                int r7 = r5.f8367h     // Catch:{ all -> 0x00e9 }
                if (r6 != r7) goto L_0x00e7
                r5.f8363d = r1     // Catch:{ all -> 0x00e9 }
            L_0x00e7:
                monitor-exit(r5)
                return
            L_0x00e9:
                r6 = move-exception
                monitor-exit(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.C3263d.C3265b.mo19048a(long, int, long, int, byte[]):void");
        }

        /* renamed from: a */
        public final synchronized void mo19047a(long j) {
            this.f8365f = Math.max(this.f8365f, j);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
            return true;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean mo19051b(long r7) {
            /*
                r6 = this;
                monitor-enter(r6)
                long r0 = r6.f8364e     // Catch:{ all -> 0x006d }
                r2 = 0
                int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r3 < 0) goto L_0x000a
                monitor-exit(r6)
                return r2
            L_0x000a:
                int r0 = r6.f8360a     // Catch:{ all -> 0x006d }
            L_0x000c:
                r1 = 1
                if (r0 <= 0) goto L_0x0021
                long[] r3 = r6.f8372m     // Catch:{ all -> 0x006d }
                int r4 = r6.f8362c     // Catch:{ all -> 0x006d }
                int r4 = r4 + r0
                int r4 = r4 - r1
                int r5 = r6.f8367h     // Catch:{ all -> 0x006d }
                int r4 = r4 % r5
                r4 = r3[r4]     // Catch:{ all -> 0x006d }
                int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r3 < 0) goto L_0x0021
                int r0 = r0 + -1
                goto L_0x000c
            L_0x0021:
                int r7 = r6.f8361b     // Catch:{ all -> 0x006d }
                int r7 = r7 + r0
                int r8 = r6.mo19044a()     // Catch:{ all -> 0x006d }
                int r8 = r8 - r7
                if (r8 < 0) goto L_0x0030
                int r7 = r6.f8360a     // Catch:{ all -> 0x006d }
                if (r8 > r7) goto L_0x0030
                r2 = 1
            L_0x0030:
                com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8782a((boolean) r2)     // Catch:{ all -> 0x006d }
                if (r8 != 0) goto L_0x0038
                int r7 = r6.f8361b     // Catch:{ all -> 0x006d }
                goto L_0x006b
            L_0x0038:
                int r7 = r6.f8360a     // Catch:{ all -> 0x006d }
                int r7 = r7 - r8
                r6.f8360a = r7     // Catch:{ all -> 0x006d }
                int r0 = r6.f8363d     // Catch:{ all -> 0x006d }
                int r2 = r6.f8367h     // Catch:{ all -> 0x006d }
                int r0 = r0 + r2
                int r0 = r0 - r8
                int r8 = r6.f8367h     // Catch:{ all -> 0x006d }
                int r0 = r0 % r8
                r6.f8363d = r0     // Catch:{ all -> 0x006d }
                r2 = -9223372036854775808
                r6.f8365f = r2     // Catch:{ all -> 0x006d }
                int r7 = r7 - r1
            L_0x004d:
                if (r7 < 0) goto L_0x006b
                int r8 = r6.f8362c     // Catch:{ all -> 0x006d }
                int r8 = r8 + r7
                int r0 = r6.f8367h     // Catch:{ all -> 0x006d }
                int r8 = r8 % r0
                long r2 = r6.f8365f     // Catch:{ all -> 0x006d }
                long[] r0 = r6.f8372m     // Catch:{ all -> 0x006d }
                r4 = r0[r8]     // Catch:{ all -> 0x006d }
                long r2 = java.lang.Math.max(r2, r4)     // Catch:{ all -> 0x006d }
                r6.f8365f = r2     // Catch:{ all -> 0x006d }
                int[] r0 = r6.f8371l     // Catch:{ all -> 0x006d }
                r8 = r0[r8]     // Catch:{ all -> 0x006d }
                r8 = r8 & r1
                if (r8 != 0) goto L_0x006b
                int r7 = r7 + -1
                goto L_0x004d
            L_0x006b:
                monitor-exit(r6)
                return r1
            L_0x006d:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.C3263d.C3265b.mo19051b(long):boolean");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d$a */
    private static final class C3264a {

        /* renamed from: a */
        public int f8356a;

        /* renamed from: b */
        public long f8357b;

        /* renamed from: c */
        public long f8358c;

        /* renamed from: d */
        public byte[] f8359d;

        private C3264a() {
        }

        /* synthetic */ C3264a(byte b) {
            this();
        }
    }
}
