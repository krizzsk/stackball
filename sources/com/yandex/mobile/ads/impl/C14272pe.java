package com.yandex.mobile.ads.impl;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.yandex.mobile.ads.impl.pe */
abstract class C14272pe implements zb1 {

    /* renamed from: a */
    private final ArrayDeque<C14274b> f38589a = new ArrayDeque<>();

    /* renamed from: b */
    private final ArrayDeque<dc1> f38590b;

    /* renamed from: c */
    private final PriorityQueue<C14274b> f38591c;

    /* renamed from: d */
    private C14274b f38592d;

    /* renamed from: e */
    private long f38593e;

    /* renamed from: f */
    private long f38594f;

    /* renamed from: com.yandex.mobile.ads.impl.pe$b */
    private static final class C14274b extends cc1 implements Comparable<C14274b> {
        /* access modifiers changed from: private */

        /* renamed from: j */
        public long f38595j;

        private C14274b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compareTo(java.lang.Object r7) {
            /*
                r6 = this;
                com.yandex.mobile.ads.impl.pe$b r7 = (com.yandex.mobile.ads.impl.C14272pe.C14274b) r7
                boolean r0 = r6.mo71021e()
                boolean r1 = r7.mo71021e()
                if (r0 == r1) goto L_0x0013
                boolean r7 = r6.mo71021e()
                if (r7 == 0) goto L_0x002f
                goto L_0x002d
            L_0x0013:
                long r0 = r6.f39149f
                long r2 = r7.f39149f
                long r0 = r0 - r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0029
                long r0 = r6.f38595j
                long r4 = r7.f38595j
                long r0 = r0 - r4
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto L_0x0029
                r7 = 0
                goto L_0x0030
            L_0x0029:
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 <= 0) goto L_0x002f
            L_0x002d:
                r7 = 1
                goto L_0x0030
            L_0x002f:
                r7 = -1
            L_0x0030:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14272pe.C14274b.compareTo(java.lang.Object):int");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pe$c */
    private final class C14275c extends dc1 {
        private C14275c() {
        }

        /* renamed from: g */
        public final void mo68281g() {
            C14272pe.this.mo69358a((dc1) this);
        }
    }

    public C14272pe() {
        for (int i = 0; i < 10; i++) {
            this.f38589a.add(new C14274b());
        }
        this.f38590b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f38590b.add(new C14275c());
        }
        this.f38591c = new PriorityQueue<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo68658a(cc1 cc1);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract yb1 mo68659c();

    /* renamed from: d */
    public cc1 mo69166b() throws ac1 {
        C13479j9.m37708b(this.f38592d == null);
        if (this.f38589a.isEmpty()) {
            return null;
        }
        C14274b pollFirst = this.f38589a.pollFirst();
        this.f38592d = pollFirst;
        return pollFirst;
    }

    /* renamed from: e */
    public dc1 mo69164a() throws ac1 {
        if (this.f38590b.isEmpty()) {
            return null;
        }
        while (!this.f38591c.isEmpty() && this.f38591c.peek().f39149f <= this.f38593e) {
            C14274b poll = this.f38591c.poll();
            if (poll.mo71021e()) {
                dc1 pollFirst = this.f38590b.pollFirst();
                pollFirst.mo71015b(4);
                m40752a(poll);
                return pollFirst;
            }
            mo68658a((cc1) poll);
            if (mo68660f()) {
                yb1 c = mo68659c();
                if (!poll.mo71018d()) {
                    dc1 pollFirst2 = this.f38590b.pollFirst();
                    pollFirst2.mo66556a(poll.f39149f, c, Long.MAX_VALUE);
                    m40752a(poll);
                    return pollFirst2;
                }
            }
            m40752a(poll);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo68660f();

    public void flush() {
        this.f38594f = 0;
        this.f38593e = 0;
        while (!this.f38591c.isEmpty()) {
            m40752a(this.f38591c.poll());
        }
        C14274b bVar = this.f38592d;
        if (bVar != null) {
            m40752a(bVar);
            this.f38592d = null;
        }
    }

    /* renamed from: b */
    public void mo69165a(cc1 cc1) throws ac1 {
        C13479j9.m37705a(cc1 == this.f38592d);
        if (cc1.mo71018d()) {
            m40752a(this.f38592d);
        } else {
            C14274b bVar = this.f38592d;
            long j = this.f38594f;
            this.f38594f = 1 + j;
            long unused = bVar.f38595j = j;
            this.f38591c.add(this.f38592d);
        }
        this.f38592d = null;
    }

    /* renamed from: a */
    public void mo69357a(long j) {
        this.f38593e = j;
    }

    /* renamed from: a */
    private void m40752a(C14274b bVar) {
        bVar.mo66557b();
        this.f38589a.add(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69358a(dc1 dc1) {
        dc1.mo66557b();
        this.f38590b.add(dc1);
    }
}
