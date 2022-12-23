package com.tapjoy.internal;

import java.io.File;

/* renamed from: com.tapjoy.internal.gx */
public final class C9341gx implements Runnable {

    /* renamed from: a */
    final C9371hl f23096a;

    /* renamed from: b */
    C9123cd f23097b;

    /* renamed from: c */
    private final Object f23098c;

    /* renamed from: d */
    private final Thread f23099d;

    /* renamed from: e */
    private boolean f23100e;

    public C9341gx(File file) {
        C9371hl hlVar = new C9371hl(file);
        this.f23096a = hlVar;
        this.f23098c = hlVar;
        Integer.valueOf(hlVar.mo58311b());
        Thread thread = new Thread(this, "5Rocks");
        this.f23099d = thread;
        thread.start();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00dc */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092 A[Catch:{ Exception | InterruptedException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e8 A[Catch:{ Exception | InterruptedException -> 0x0123 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            r0 = 1
            r1 = 1
        L_0x0002:
            r2 = 0
            r3 = 0
            r5 = r3
        L_0x0006:
            com.tapjoy.internal.cd r7 = r14.f23097b     // Catch:{ Exception | InterruptedException -> 0x0123 }
            if (r7 == 0) goto L_0x00eb
            com.tapjoy.internal.hl r7 = r14.f23096a     // Catch:{ Exception | InterruptedException -> 0x0123 }
            int r7 = r7.mo58311b()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            if (r7 <= 0) goto L_0x00eb
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto L_0x00eb
            com.tapjoy.internal.hl r7 = r14.f23096a     // Catch:{ Exception | InterruptedException -> 0x0123 }
            int r7 = r7.mo58311b()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r7 <= r8) goto L_0x002c
            com.tapjoy.internal.hl r7 = r14.f23096a     // Catch:{ Exception | InterruptedException -> 0x0123 }
            com.tapjoy.internal.hl r9 = r14.f23096a     // Catch:{ Exception | InterruptedException -> 0x0123 }
            int r9 = r9.mo58311b()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            int r9 = r9 - r8
            r7.mo58310a(r9)     // Catch:{ Exception | InterruptedException -> 0x0123 }
        L_0x002c:
            com.tapjoy.internal.hl r7 = r14.f23096a     // Catch:{ Exception | InterruptedException -> 0x0123 }
            com.tapjoy.internal.ev r7 = r7.mo58312b(r2)     // Catch:{ Exception | InterruptedException -> 0x0123 }
            if (r7 == 0) goto L_0x00eb
            com.tapjoy.internal.fh r5 = r7.f22704w     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r8 = 3
            if (r5 == 0) goto L_0x0045
            java.lang.String r5 = r5.f22883G     // Catch:{ Exception | InterruptedException -> 0x0123 }
            if (r5 != 0) goto L_0x0045
            java.util.concurrent.CountDownLatch r5 = com.tapjoy.internal.C9376hn.f23243c     // Catch:{ Exception | InterruptedException -> 0x0123 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r5.await(r8, r6)     // Catch:{ Exception | InterruptedException -> 0x0123 }
        L_0x0045:
            boolean r5 = com.tapjoy.internal.C9503v.m25546c()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            if (r5 != 0) goto L_0x0052
            java.util.concurrent.CountDownLatch r5 = com.tapjoy.internal.C9376hn.f23242b     // Catch:{ Exception | InterruptedException -> 0x0123 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r5.await(r8, r6)     // Catch:{ Exception | InterruptedException -> 0x0123 }
        L_0x0052:
            boolean r5 = r14.f23100e     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r6 = 100
            if (r5 != 0) goto L_0x008d
            com.tapjoy.internal.ey r5 = r7.f22695n     // Catch:{ Exception | InterruptedException -> 0x0123 }
            com.tapjoy.internal.ey r8 = com.tapjoy.internal.C9241ey.APP     // Catch:{ Exception | InterruptedException -> 0x0123 }
            if (r5 == r8) goto L_0x008d
            com.tapjoy.internal.hl r5 = r14.f23096a     // Catch:{ Exception | InterruptedException -> 0x0123 }
            int r5 = r5.mo58311b()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            if (r5 >= r6) goto L_0x008d
            java.lang.Long r5 = r7.f22697p     // Catch:{ Exception | InterruptedException -> 0x0123 }
            long r8 = r5.longValue()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0075
            goto L_0x008d
        L_0x0075:
            java.lang.Long r5 = r7.f22697p     // Catch:{ Exception | InterruptedException -> 0x0123 }
            long r8 = r5.longValue()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r10 = 60000(0xea60, double:2.9644E-319)
            long r8 = r8 + r10
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            long r8 = r8 - r12
            long r8 = java.lang.Math.max(r8, r3)     // Catch:{ Exception | InterruptedException -> 0x0123 }
            long r8 = java.lang.Math.min(r8, r10)     // Catch:{ Exception | InterruptedException -> 0x0123 }
            goto L_0x008e
        L_0x008d:
            r8 = r3
        L_0x008e:
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x00e8
            com.tapjoy.internal.ik r5 = new com.tapjoy.internal.ik     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r5.<init>()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r5.mo58360a(r7)     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r7 = 1
        L_0x009b:
            if (r7 >= r6) goto L_0x00b6
            com.tapjoy.internal.hl r10 = r14.f23096a     // Catch:{ Exception | InterruptedException -> 0x0123 }
            int r10 = r10.mo58311b()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            if (r7 >= r10) goto L_0x00b6
            com.tapjoy.internal.hl r10 = r14.f23096a     // Catch:{ Exception | InterruptedException -> 0x0123 }
            com.tapjoy.internal.ev r10 = r10.mo58312b(r7)     // Catch:{ Exception | InterruptedException -> 0x0123 }
            if (r10 == 0) goto L_0x00b6
            boolean r10 = r5.mo58360a(r10)     // Catch:{ Exception | InterruptedException -> 0x0123 }
            if (r10 == 0) goto L_0x00b6
            int r7 = r7 + 1
            goto L_0x009b
        L_0x00b6:
            int r1 = r1 + 1
            int r6 = r5.mo58361g()     // Catch:{ Exception -> 0x00dc }
            java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00dc }
            java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00dc }
            com.tapjoy.internal.cd r6 = r14.f23097b     // Catch:{ Exception -> 0x00dc }
            r6.mo57910a(r5)     // Catch:{ Exception -> 0x00dc }
            com.tapjoy.internal.hl r6 = r14.f23096a     // Catch:{ Exception -> 0x00dc }
            int r7 = r5.mo58361g()     // Catch:{ Exception -> 0x00dc }
            r6.mo58310a(r7)     // Catch:{ Exception -> 0x00dc }
            int r1 = r5.mo58361g()     // Catch:{ Exception -> 0x00db }
            java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00db }
            r5 = r8
            r1 = 0
            goto L_0x0006
        L_0x00db:
            r1 = 0
        L_0x00dc:
            int r5 = r5.mo58361g()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            java.lang.Integer.valueOf(r5)     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r5 = 300000(0x493e0, double:1.482197E-318)
            goto L_0x0006
        L_0x00e8:
            r5 = r8
            goto L_0x0006
        L_0x00eb:
            com.tapjoy.internal.hl r7 = r14.f23096a     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r7.flush()     // Catch:{ Exception | InterruptedException -> 0x0123 }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0107
            java.lang.Object r3 = r14.f23098c     // Catch:{ Exception | InterruptedException -> 0x0123 }
            monitor-enter(r3)     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r14.f23100e = r2     // Catch:{ all -> 0x0104 }
            java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0104 }
            java.lang.Object r2 = r14.f23098c     // Catch:{ all -> 0x0104 }
            r2.wait(r5)     // Catch:{ all -> 0x0104 }
            monitor-exit(r3)     // Catch:{ all -> 0x0104 }
            goto L_0x0002
        L_0x0104:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0104 }
            throw r0     // Catch:{ Exception | InterruptedException -> 0x0123 }
        L_0x0107:
            java.lang.Object r3 = r14.f23098c     // Catch:{ Exception | InterruptedException -> 0x0123 }
            monitor-enter(r3)     // Catch:{ Exception | InterruptedException -> 0x0123 }
            r14.f23100e = r2     // Catch:{ all -> 0x0120 }
            com.tapjoy.internal.cd r2 = r14.f23097b     // Catch:{ all -> 0x0120 }
            if (r2 == 0) goto L_0x0118
            com.tapjoy.internal.hl r2 = r14.f23096a     // Catch:{ all -> 0x0120 }
            boolean r2 = r2.mo58313c()     // Catch:{ all -> 0x0120 }
            if (r2 == 0) goto L_0x011d
        L_0x0118:
            java.lang.Object r2 = r14.f23098c     // Catch:{ all -> 0x0120 }
            r2.wait()     // Catch:{ all -> 0x0120 }
        L_0x011d:
            monitor-exit(r3)     // Catch:{ all -> 0x0120 }
            goto L_0x0002
        L_0x0120:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0120 }
            throw r0     // Catch:{ Exception | InterruptedException -> 0x0123 }
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9341gx.run():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58231a(boolean z) {
        synchronized (this.f23098c) {
            this.f23100e = z;
            this.f23098c.notify();
        }
    }

    /* renamed from: a */
    public final void mo58230a() {
        if (this.f23097b != null && !this.f23096a.mo58313c()) {
            mo58231a(true);
        }
    }
}
