package com.fyber.inneractive.sdk.player.p059c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.p059c.C3300q;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3452c;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3454d;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3456e;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3457f;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3473e;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3475f;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3476g;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3478h;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3542g;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3557q;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.g */
final class C3285g implements Handler.Callback, C3452c.C3453a, C3454d.C3455a, C3476g.C3477a {

    /* renamed from: A */
    private C3288c f8425A;

    /* renamed from: B */
    private long f8426B;

    /* renamed from: C */
    private C3286a f8427C;

    /* renamed from: D */
    private C3286a f8428D;

    /* renamed from: E */
    private C3286a f8429E;

    /* renamed from: F */
    private C3300q f8430F;

    /* renamed from: a */
    final Handler f8431a;

    /* renamed from: b */
    boolean f8432b;

    /* renamed from: c */
    int f8433c;

    /* renamed from: d */
    private final C3297n[] f8434d;

    /* renamed from: e */
    private final C3298o[] f8435e;

    /* renamed from: f */
    private final C3476g f8436f;

    /* renamed from: g */
    private final C3294k f8437g;

    /* renamed from: h */
    private final C3557q f8438h;

    /* renamed from: i */
    private final HandlerThread f8439i;

    /* renamed from: j */
    private final Handler f8440j;

    /* renamed from: k */
    private final C3279e f8441k;

    /* renamed from: l */
    private final C3300q.C3303b f8442l;

    /* renamed from: m */
    private final C3300q.C3302a f8443m;

    /* renamed from: n */
    private C3287b f8444n;

    /* renamed from: o */
    private C3296m f8445o;

    /* renamed from: p */
    private C3297n f8446p;

    /* renamed from: q */
    private C3542g f8447q;

    /* renamed from: r */
    private C3454d f8448r;

    /* renamed from: s */
    private C3297n[] f8449s;

    /* renamed from: t */
    private boolean f8450t;

    /* renamed from: u */
    private boolean f8451u;

    /* renamed from: v */
    private boolean f8452v;

    /* renamed from: w */
    private int f8453w = 1;

    /* renamed from: x */
    private int f8454x;

    /* renamed from: y */
    private long f8455y;

    /* renamed from: z */
    private int f8456z;

    /* renamed from: a */
    public final /* synthetic */ void mo19076a(C3457f fVar) {
        this.f8431a.obtainMessage(9, (C3452c) fVar).sendToTarget();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.g$b */
    public static final class C3287b {

        /* renamed from: a */
        public final int f8476a;

        /* renamed from: b */
        public final long f8477b;

        /* renamed from: c */
        public volatile long f8478c;

        /* renamed from: d */
        public volatile long f8479d;

        public C3287b(int i, long j) {
            this.f8476a = i;
            this.f8477b = j;
            this.f8478c = j;
            this.f8479d = j;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.g$d */
    public static final class C3289d {

        /* renamed from: a */
        public final C3300q f8483a;

        /* renamed from: b */
        public final Object f8484b;

        /* renamed from: c */
        public final C3287b f8485c;

        /* renamed from: d */
        public final int f8486d;

        public C3289d(C3300q qVar, Object obj, C3287b bVar, int i) {
            this.f8483a = qVar;
            this.f8484b = obj;
            this.f8485c = bVar;
            this.f8486d = i;
        }
    }

    public C3285g(C3297n[] nVarArr, C3476g gVar, C3294k kVar, boolean z, Handler handler, C3287b bVar, C3279e eVar) {
        this.f8434d = nVarArr;
        this.f8436f = gVar;
        this.f8437g = kVar;
        this.f8450t = z;
        this.f8440j = handler;
        this.f8444n = bVar;
        this.f8441k = eVar;
        this.f8435e = new C3298o[nVarArr.length];
        for (int i = 0; i < nVarArr.length; i++) {
            nVarArr[i].mo18874a(i);
            this.f8435e[i] = nVarArr[i].mo18882b();
        }
        this.f8438h = new C3557q();
        this.f8449s = new C3297n[0];
        this.f8442l = new C3300q.C3303b();
        this.f8443m = new C3300q.C3302a();
        gVar.f9407a = this;
        this.f8445o = C3296m.f8518a;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f8439i = handlerThread;
        handlerThread.start();
        this.f8431a = new Handler(this.f8439i.getLooper(), this);
    }

    /* renamed from: a */
    public final void mo19078a(C3300q qVar, int i, long j) {
        this.f8431a.obtainMessage(3, new C3288c(qVar, i, j)).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19074a() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f8432b     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f8431a     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f8432b     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f8439i     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.C3285g.mo19074a():void");
    }

    /* renamed from: a */
    public final void mo19077a(C3300q qVar) {
        this.f8431a.obtainMessage(7, Pair.create(qVar, (Object) null)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo19075a(C3452c cVar) {
        this.f8431a.obtainMessage(8, cVar).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:473:0x086e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x086f, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0871, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0872, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0880, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0881, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r8.f8440j.obtainMessage(8, com.fyber.inneractive.sdk.player.p059c.C3236d.m7870a(r1)).sendToTarget();
        m8097e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x089c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x089d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x089e, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x08ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x08bb, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x020a A[Catch:{ all -> 0x03fd, all -> 0x0336, all -> 0x0048, all -> 0x0055, all -> 0x0044, d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x020d A[Catch:{ all -> 0x03fd, all -> 0x0336, all -> 0x0048, all -> 0x0055, all -> 0x0044, d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0211 A[Catch:{ all -> 0x03fd, all -> 0x0336, all -> 0x0048, all -> 0x0055, all -> 0x0044, d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0566 A[Catch:{ all -> 0x03fd, all -> 0x0336, all -> 0x0048, all -> 0x0055, all -> 0x0044, d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0585 A[Catch:{ all -> 0x03fd, all -> 0x0336, all -> 0x0048, all -> 0x0055, all -> 0x0044, d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }, LOOP:7: B:299:0x0585->B:303:0x0597, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x06e1 A[Catch:{ all -> 0x03fd, all -> 0x0336, all -> 0x0048, all -> 0x0055, all -> 0x0044, d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0797 A[Catch:{ all -> 0x03fd, all -> 0x0336, all -> 0x0048, all -> 0x0055, all -> 0x0044, d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0880 A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r37) {
        /*
            r36 = this;
            r8 = r36
            r1 = r37
            r10 = 1
            int r2 = r1.what     // Catch:{ d -> 0x08ba, IOException -> 0x089d, RuntimeException -> 0x0880 }
            r11 = 7
            r14 = 3
            r3 = 0
            r15 = 4
            r6 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 2
            switch(r2) {
                case 0: goto L_0x083a;
                case 1: goto L_0x0807;
                case 2: goto L_0x0418;
                case 3: goto L_0x035f;
                case 4: goto L_0x033e;
                case 5: goto L_0x033a;
                case 6: goto L_0x0323;
                case 7: goto L_0x0193;
                case 8: goto L_0x015f;
                case 9: goto L_0x014c;
                case 10: goto L_0x0059;
                case 11: goto L_0x0018;
                default: goto L_0x0016;
            }
        L_0x0016:
            r1 = 0
            return r1
        L_0x0018:
            java.lang.Object r1 = r1.obj     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.e$c[] r1 = (com.fyber.inneractive.sdk.player.p059c.C3279e.C3282c[]) r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.e$c[] r1 = (com.fyber.inneractive.sdk.player.p059c.C3279e.C3282c[]) r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r1.length     // Catch:{ all -> 0x0048 }
            r12 = 0
        L_0x0020:
            if (r12 >= r2) goto L_0x0030
            r3 = r1[r12]     // Catch:{ all -> 0x0048 }
            com.fyber.inneractive.sdk.player.c.e$b r4 = r3.f8398a     // Catch:{ all -> 0x0048 }
            int r5 = r3.f8399b     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r3.f8400c     // Catch:{ all -> 0x0048 }
            r4.mo18875a(r5, r3)     // Catch:{ all -> 0x0048 }
            int r12 = r12 + 1
            goto L_0x0020
        L_0x0030:
            com.fyber.inneractive.sdk.player.c.g.d r1 = r8.f8448r     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0039
            android.os.Handler r1 = r8.f8431a     // Catch:{ all -> 0x0048 }
            r1.sendEmptyMessage(r9)     // Catch:{ all -> 0x0048 }
        L_0x0039:
            monitor-enter(r36)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r1 = r8.f8454x     // Catch:{ all -> 0x0044 }
            int r1 = r1 + r10
            r8.f8454x = r1     // Catch:{ all -> 0x0044 }
            r36.notifyAll()     // Catch:{ all -> 0x0044 }
            monitor-exit(r36)     // Catch:{ all -> 0x0044 }
            return r10
        L_0x0044:
            r0 = move-exception
            r1 = r0
            monitor-exit(r36)     // Catch:{ all -> 0x0044 }
            throw r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0048:
            r0 = move-exception
            r1 = r0
            monitor-enter(r36)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r8.f8454x     // Catch:{ all -> 0x0055 }
            int r2 = r2 + r10
            r8.f8454x = r2     // Catch:{ all -> 0x0055 }
            r36.notifyAll()     // Catch:{ all -> 0x0055 }
            monitor-exit(r36)     // Catch:{ all -> 0x0055 }
            throw r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0055:
            r0 = move-exception
            r1 = r0
            monitor-exit(r36)     // Catch:{ all -> 0x0055 }
            throw r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0059:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x014b
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = 1
        L_0x0060:
            if (r1 == 0) goto L_0x014b
            boolean r4 = r1.f8465i     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r4 != 0) goto L_0x0068
            goto L_0x014b
        L_0x0068:
            boolean r4 = r1.mo19085c()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r4 != 0) goto L_0x0076
            com.fyber.inneractive.sdk.player.c.g$a r4 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 != r4) goto L_0x0073
            r2 = 0
        L_0x0073:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r1.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0060
        L_0x0076:
            if (r2 == 0) goto L_0x0114
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r4 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 == r4) goto L_0x0080
            r2 = 1
            goto L_0x0081
        L_0x0080:
            r2 = 0
        L_0x0081:
            com.fyber.inneractive.sdk.player.c.g$a r4 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r4 = r4.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            m8083a((com.fyber.inneractive.sdk.player.p059c.C3285g.C3286a) r4)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r4 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r4.f8467k = r3     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r4 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8427C = r4     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r4 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8428D = r4     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.n[] r4 = r8.f8434d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r4 = r4.length     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean[] r4 = new boolean[r4]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r5 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$b r6 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r6 = r6.f8478c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r5 = r5.mo19082a(r6, r2, r4)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$b r2 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r12 = r2.f8478c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x00b2
            com.fyber.inneractive.sdk.player.c.g$b r2 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2.f8478c = r5     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.m8081a((long) r5)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x00b2:
            com.fyber.inneractive.sdk.player.c.n[] r2 = r8.f8434d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.length     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean[] r2 = new boolean[r2]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r5 = 0
            r6 = 0
        L_0x00b9:
            com.fyber.inneractive.sdk.player.c.n[] r7 = r8.f8434d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r7 = r7.length     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r5 >= r7) goto L_0x0105
            com.fyber.inneractive.sdk.player.c.n[] r7 = r8.f8434d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r7 = r7[r5]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r11 = r7.mo18884d()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r11 == 0) goto L_0x00ca
            r11 = 1
            goto L_0x00cb
        L_0x00ca:
            r11 = 0
        L_0x00cb:
            r2[r5] = r11     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r11 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.e[] r11 = r11.f8459c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r11 = r11[r5]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r11 == 0) goto L_0x00d7
            int r6 = r6 + 1
        L_0x00d7:
            boolean r12 = r2[r5]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r12 == 0) goto L_0x0102
            com.fyber.inneractive.sdk.player.c.g.e r12 = r7.mo18886f()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r11 == r12) goto L_0x00f9
            com.fyber.inneractive.sdk.player.c.n r12 = r8.f8446p     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r7 != r12) goto L_0x00f2
            if (r11 != 0) goto L_0x00ee
            com.fyber.inneractive.sdk.player.c.k.q r11 = r8.f8438h     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.k.g r12 = r8.f8447q     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r11.mo19420a((com.fyber.inneractive.sdk.player.p059c.p080k.C3542g) r12)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x00ee:
            r8.f8447q = r3     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8446p = r3     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x00f2:
            m8084a((com.fyber.inneractive.sdk.player.p059c.C3297n) r7)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r7.mo18892l()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0102
        L_0x00f9:
            boolean r11 = r4[r5]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r11 == 0) goto L_0x0102
            long r11 = r8.f8426B     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r7.mo18876a((long) r11)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0102:
            int r5 = r5 + 1
            goto L_0x00b9
        L_0x0105:
            android.os.Handler r3 = r8.f8440j     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.i.h r1 = r1.f8469m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.sendToTarget()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.m8087a((boolean[]) r2, (int) r6)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0140
        L_0x0114:
            r8.f8427C = r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r1 = r1.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0118:
            if (r1 == 0) goto L_0x0120
            r1.mo19086d()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r1 = r1.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0118
        L_0x0120:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.f8467k = r3     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r1 = r1.f8465i     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x0140
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r1 = r1.f8463g     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r3 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r4 = r8.f8426B     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r6 = r3.mo19080a()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r4 = r4 - r6
            long r1 = java.lang.Math.max(r1, r4)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r3 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r3.mo19081a(r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0140:
            r36.m8099g()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r36.m8096d()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Handler r1 = r8.f8431a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.sendEmptyMessage(r9)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x014b:
            return r10
        L_0x014c:
            java.lang.Object r1 = r1.obj     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.c r1 = (com.fyber.inneractive.sdk.player.p059c.p074g.C3452c) r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 == 0) goto L_0x015e
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.c r2 = r2.f8457a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 == r1) goto L_0x015b
            goto L_0x015e
        L_0x015b:
            r36.m8099g()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x015e:
            return r10
        L_0x015f:
            java.lang.Object r1 = r1.obj     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.c r1 = (com.fyber.inneractive.sdk.player.p059c.p074g.C3452c) r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 == 0) goto L_0x0192
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.c r2 = r2.f8457a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 == r1) goto L_0x016e
            goto L_0x0192
        L_0x016e:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.f8465i = r10     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.mo19085c()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r2 = r1.f8463g     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r2 = r1.mo19081a(r2)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.f8463g = r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 != 0) goto L_0x018f
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8428D = r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r1 = r1.f8463g     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.m8081a((long) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.m8091b((com.fyber.inneractive.sdk.player.p059c.C3285g.C3286a) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x018f:
            r36.m8099g()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0192:
            return r10
        L_0x0193:
            java.lang.Object r1 = r1.obj     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r9 = r1.first     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r9 = (com.fyber.inneractive.sdk.player.p059c.C3300q) r9     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8430F = r9     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r1 = r1.second     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x0205
            int r9 = r8.f8456z     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r9 <= 0) goto L_0x01d3
            com.fyber.inneractive.sdk.player.c.g$c r4 = r8.f8425A     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.util.Pair r4 = r8.m8078a((com.fyber.inneractive.sdk.player.p059c.C3285g.C3288c) r4)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r5 = r8.f8456z     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r9 = 0
            r8.f8456z = r9     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8425A = r3     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r4 != 0) goto L_0x01bb
            r8.m8085a((java.lang.Object) r1, (int) r5)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0322
        L_0x01bb:
            com.fyber.inneractive.sdk.player.c.g$b r9 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r11 = r4.first     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r11 = r11.intValue()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r4 = r4.second     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r12 = r4.longValue()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r9.<init>(r11, r12)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r9     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0206
        L_0x01d3:
            com.fyber.inneractive.sdk.player.c.g$b r9 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r11 = r9.f8477b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r9 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x0205
            com.fyber.inneractive.sdk.player.c.q r4 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r4 = r4.mo19106a()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r4 == 0) goto L_0x01e9
            r4 = 0
            r8.m8085a((java.lang.Object) r1, (int) r4)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0322
        L_0x01e9:
            r4 = 0
            android.util.Pair r5 = r8.m8088b((int) r4)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$b r4 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r9 = r5.first     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r9 = r9.intValue()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r5 = r5.second     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r11 = r5.longValue()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r4.<init>(r9, r11)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r4     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0205:
            r5 = 0
        L_0x0206:
            com.fyber.inneractive.sdk.player.c.g$a r4 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r4 == 0) goto L_0x020d
            com.fyber.inneractive.sdk.player.c.g$a r4 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x020f
        L_0x020d:
            com.fyber.inneractive.sdk.player.c.g$a r4 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x020f:
            if (r4 == 0) goto L_0x031f
            com.fyber.inneractive.sdk.player.c.q r9 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r11 = r4.f8458b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r9 = r9.mo19103a(r11)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r11 = -1
            if (r9 != r11) goto L_0x0278
            int r3 = r4.f8462f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r6 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r8.m8076a((int) r3, (com.fyber.inneractive.sdk.player.p059c.C3300q) r2, (com.fyber.inneractive.sdk.player.p059c.C3300q) r6)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != r11) goto L_0x022b
            r8.m8085a((java.lang.Object) r1, (int) r5)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0322
        L_0x022b:
            com.fyber.inneractive.sdk.player.c.q r3 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r6 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r7 = 0
            com.fyber.inneractive.sdk.player.c.q$a r2 = r3.mo19104a((int) r2, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3302a) r6, (boolean) r7)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.f8527c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.util.Pair r2 = r8.m8088b((int) r2)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r3 = r2.first     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r3 = r3.intValue()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r2 = r2.second     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r6 = r2.longValue()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r9 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2.mo19104a((int) r3, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3302a) r9, (boolean) r10)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r2 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r2 = r2.f8526b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r4.f8462f = r11     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0257:
            com.fyber.inneractive.sdk.player.c.g$a r9 = r4.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r9 == 0) goto L_0x026b
            com.fyber.inneractive.sdk.player.c.g$a r4 = r4.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r9 = r4.f8458b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r9 = r9.equals(r2)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r9 == 0) goto L_0x0267
            r9 = r3
            goto L_0x0268
        L_0x0267:
            r9 = -1
        L_0x0268:
            r4.f8462f = r9     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0257
        L_0x026b:
            long r6 = r8.m8077a((int) r3, (long) r6)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$b r2 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2.<init>(r3, r6)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x031f
        L_0x0278:
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r11 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r12 = 0
            r2.mo19104a((int) r9, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3302a) r11, (boolean) r12)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.mo19108c()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2 - r10
            if (r9 != r2) goto L_0x029b
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r11 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r11 = r11.f8527c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$b r12 = r8.f8442l     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$b r2 = r2.mo19105a((int) r11, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3303b) r12, (long) r6)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r2 = r2.f8535e     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x029b
            r2 = 1
            goto L_0x029c
        L_0x029b:
            r2 = 0
        L_0x029c:
            r4.mo19083a(r9, r2)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r4 != r2) goto L_0x02a5
            r2 = 1
            goto L_0x02a6
        L_0x02a5:
            r2 = 0
        L_0x02a6:
            com.fyber.inneractive.sdk.player.c.g$b r11 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r11 = r11.f8476a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r9 == r11) goto L_0x02bf
            com.fyber.inneractive.sdk.player.c.g$b r11 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$b r12 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r13 = r11.f8477b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r12.<init>(r9, r13)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r13 = r11.f8478c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r12.f8478c = r13     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r13 = r11.f8479d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r12.f8479d = r13     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r12     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x02bf:
            com.fyber.inneractive.sdk.player.c.g$a r11 = r4.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r11 == 0) goto L_0x031f
            com.fyber.inneractive.sdk.player.c.g$a r11 = r4.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r9 = r9 + r10
            com.fyber.inneractive.sdk.player.c.q r12 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r13 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r12.mo19104a((int) r9, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3302a) r13, (boolean) r10)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r12 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r12 = r12.mo19108c()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r12 = r12 - r10
            if (r9 != r12) goto L_0x02e8
            com.fyber.inneractive.sdk.player.c.q r12 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r13 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r13 = r13.f8527c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$b r14 = r8.f8442l     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$b r12 = r12.mo19105a((int) r13, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3303b) r14, (long) r6)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r12 = r12.f8535e     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r12 != 0) goto L_0x02e8
            r12 = 1
            goto L_0x02e9
        L_0x02e8:
            r12 = 0
        L_0x02e9:
            java.lang.Object r13 = r11.f8458b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r14 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r14 = r14.f8526b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r13 = r13.equals(r14)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r13 == 0) goto L_0x0302
            r11.mo19083a(r9, r12)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r4 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r11 != r4) goto L_0x02fe
            r4 = 1
            goto L_0x02ff
        L_0x02fe:
            r4 = 0
        L_0x02ff:
            r2 = r2 | r4
            r4 = r11
            goto L_0x02bf
        L_0x0302:
            if (r2 != 0) goto L_0x0318
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.f8462f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$b r3 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r3 = r3.f8478c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r3 = r8.m8077a((int) r2, (long) r3)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$b r6 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r6.<init>(r2, r3)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r6     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x031f
        L_0x0318:
            r8.f8427C = r4     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r4.f8467k = r3     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            m8083a((com.fyber.inneractive.sdk.player.p059c.C3285g.C3286a) r11)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x031f:
            r8.m8092b(r1, r5)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0322:
            return r10
        L_0x0323:
            r8.m8093b((boolean) r10)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.k r1 = r8.f8437g     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.mo18973c()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.m8080a((int) r10)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            monitor-enter(r36)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8432b = r10     // Catch:{ all -> 0x0336 }
            r36.notifyAll()     // Catch:{ all -> 0x0336 }
            monitor-exit(r36)     // Catch:{ all -> 0x0336 }
            return r10
        L_0x0336:
            r0 = move-exception
            r1 = r0
            monitor-exit(r36)     // Catch:{ all -> 0x0336 }
            throw r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x033a:
            r36.m8097e()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            return r10
        L_0x033e:
            java.lang.Object r1 = r1.obj     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.m r1 = (com.fyber.inneractive.sdk.player.p059c.C3296m) r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.k.g r2 = r8.f8447q     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 == 0) goto L_0x034d
            com.fyber.inneractive.sdk.player.c.k.g r2 = r8.f8447q     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.m r1 = r2.mo18947a(r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0353
        L_0x034d:
            com.fyber.inneractive.sdk.player.c.k.q r2 = r8.f8438h     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.m r1 = r2.mo18947a((com.fyber.inneractive.sdk.player.p059c.C3296m) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0353:
            r8.f8445o = r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Handler r2 = r8.f8440j     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.sendToTarget()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            return r10
        L_0x035f:
            java.lang.Object r1 = r1.obj     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$c r1 = (com.fyber.inneractive.sdk.player.p059c.C3285g.C3288c) r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x0370
            int r2 = r8.f8456z     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2 + r10
            r8.f8456z = r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8425A = r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x03fc
        L_0x0370:
            android.util.Pair r2 = r8.m8078a((com.fyber.inneractive.sdk.player.p059c.C3285g.C3288c) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x0395
            com.fyber.inneractive.sdk.player.c.g$b r1 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = 0
            r1.<init>(r2, r6)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Handler r3 = r8.f8440j     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Message r1 = r3.obtainMessage(r15, r10, r2, r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.sendToTarget()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$b r1 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.<init>(r2, r4)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.m8080a((int) r15)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.m8093b((boolean) r2)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x03fc
        L_0x0395:
            long r6 = r1.f8482c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x039d
            r1 = 1
            goto L_0x039e
        L_0x039d:
            r1 = 0
        L_0x039e:
            java.lang.Object r3 = r2.first     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r3 = r3.intValue()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r2 = r2.second     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r4 = r2.longValue()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$b r2 = r8.f8444n     // Catch:{ all -> 0x03fd }
            int r2 = r2.f8476a     // Catch:{ all -> 0x03fd }
            if (r3 != r2) goto L_0x03da
            r6 = 1000(0x3e8, double:4.94E-321)
            long r11 = r4 / r6
            com.fyber.inneractive.sdk.player.c.g$b r2 = r8.f8444n     // Catch:{ all -> 0x03fd }
            long r13 = r2.f8478c     // Catch:{ all -> 0x03fd }
            long r13 = r13 / r6
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x03da
            com.fyber.inneractive.sdk.player.c.g$b r2 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2.<init>(r3, r4)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Handler r2 = r8.f8440j     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x03ce
            r1 = 1
            goto L_0x03cf
        L_0x03ce:
            r1 = 0
        L_0x03cf:
            com.fyber.inneractive.sdk.player.c.g$b r3 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r4 = 0
            android.os.Message r1 = r2.obtainMessage(r15, r1, r4, r3)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x03d6:
            r1.sendToTarget()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x03fc
        L_0x03da:
            long r6 = r8.m8077a((int) r3, (long) r4)     // Catch:{ all -> 0x03fd }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x03e4
            r2 = 1
            goto L_0x03e5
        L_0x03e4:
            r2 = 0
        L_0x03e5:
            r1 = r1 | r2
            com.fyber.inneractive.sdk.player.c.g$b r2 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2.<init>(r3, r6)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Handler r2 = r8.f8440j     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x03f3
            r1 = 1
            goto L_0x03f4
        L_0x03f3:
            r1 = 0
        L_0x03f4:
            com.fyber.inneractive.sdk.player.c.g$b r3 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r4 = 0
            android.os.Message r1 = r2.obtainMessage(r15, r1, r4, r3)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x03d6
        L_0x03fc:
            return r10
        L_0x03fd:
            r0 = move-exception
            r2 = r0
            com.fyber.inneractive.sdk.player.c.g$b r6 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r6.<init>(r3, r4)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r6     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Handler r3 = r8.f8440j     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x040c
            r1 = 1
            goto L_0x040d
        L_0x040c:
            r1 = 0
        L_0x040d:
            com.fyber.inneractive.sdk.player.c.g$b r4 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r5 = 0
            android.os.Message r1 = r3.obtainMessage(r15, r1, r5, r4)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.sendToTarget()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            throw r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0418:
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r1 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x0691
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 != 0) goto L_0x0429
            com.fyber.inneractive.sdk.player.c.g$b r1 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r1 = r1.f8476a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x045e
        L_0x0429:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r1 = r1.f8462f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r2 = r2.f8464h     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x055f
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r2 = r2.mo19084b()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 == 0) goto L_0x055f
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r3 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r14 = 0
            com.fyber.inneractive.sdk.player.c.q$a r2 = r2.mo19104a((int) r1, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3302a) r3, (boolean) r14)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r2 = r2.f8528d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x044c
            goto L_0x055f
        L_0x044c:
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 == 0) goto L_0x0459
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.f8462f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r1 = r1 - r2
            r2 = 100
            if (r1 == r2) goto L_0x055f
        L_0x0459:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r1 = r1.f8462f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r1 = r1 + r10
        L_0x045e:
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.mo19108c()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 >= r2) goto L_0x055f
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x0476
            com.fyber.inneractive.sdk.player.c.g$b r2 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r2 = r2.f8478c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r34 = r2
            r21 = r12
            r11 = r4
            r13 = r6
            goto L_0x04e1
        L_0x0476:
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r3 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r14 = 0
            com.fyber.inneractive.sdk.player.c.q$a r2 = r2.mo19104a((int) r1, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3302a) r3, (boolean) r14)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r3 = r2.f8527c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$b r14 = r8.f8442l     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$b r2 = r2.mo19105a((int) r3, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3303b) r14, (long) r6)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.f8536f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == r2) goto L_0x0495
            r34 = r6
            r21 = r12
            r11 = r4
            r13 = r34
            goto L_0x04e1
        L_0x0495:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r1 = r1.mo19080a()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r14 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r4 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r4 = r4.f8462f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r5 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r9 = 0
            com.fyber.inneractive.sdk.player.c.q$a r4 = r14.mo19104a((int) r4, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3302a) r5, (boolean) r9)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r4 = r4.f8528d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r1 = r1 + r4
            long r4 = r8.f8426B     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r1 = r1 - r4
            com.fyber.inneractive.sdk.player.c.q r4 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r19 = java.lang.Math.max(r6, r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1 = r36
            r2 = r4
            r21 = r12
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = r17
            r13 = r6
            r6 = r19
            android.util.Pair r1 = r1.m8079a(r2, r3, r4, r6)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x0562
            java.lang.Object r2 = r1.first     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.intValue()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r1 = r1.second     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r6 = r1.longValue()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1 = r2
            r34 = r6
        L_0x04e1:
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x04ed
            r2 = 60000000(0x3938700, double:2.96439388E-316)
            long r2 = r34 + r2
        L_0x04ea:
            r26 = r2
            goto L_0x0504
        L_0x04ed:
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r2 = r2.mo19080a()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r4 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r5 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r5 = r5.f8462f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r6 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r7 = 0
            com.fyber.inneractive.sdk.player.c.q$a r4 = r4.mo19104a((int) r5, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3302a) r6, (boolean) r7)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r4 = r4.f8528d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r2 = r2 + r4
            goto L_0x04ea
        L_0x0504:
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r3 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2.mo19104a((int) r1, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3302a) r3, (boolean) r10)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.mo19108c()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2 - r10
            if (r1 != r2) goto L_0x0527
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r3 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r3 = r3.f8527c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$b r4 = r8.f8442l     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$b r2 = r2.mo19105a((int) r3, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3303b) r4, (long) r13)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r2 = r2.f8535e     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x0527
            r33 = 1
            goto L_0x0529
        L_0x0527:
            r33 = 0
        L_0x0529:
            com.fyber.inneractive.sdk.player.c.g$a r2 = new com.fyber.inneractive.sdk.player.c.g$a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.n[] r3 = r8.f8434d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.o[] r4 = r8.f8435e     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.i.g r5 = r8.f8436f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.k r6 = r8.f8437g     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.d r7 = r8.f8448r     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r13 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            java.lang.Object r13 = r13.f8526b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r23 = r2
            r24 = r3
            r25 = r4
            r28 = r5
            r29 = r6
            r30 = r7
            r31 = r13
            r32 = r1
            r23.<init>(r24, r25, r26, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x0554
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.f8467k = r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0554:
            r8.f8427C = r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.c r1 = r2.f8457a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.mo19255a((com.fyber.inneractive.sdk.player.p059c.p074g.C3452c.C3453a) r8)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.m8086a((boolean) r10)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0562
        L_0x055f:
            r21 = r12
            r11 = r4
        L_0x0562:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x057d
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r1 = r1.mo19084b()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x056f
            goto L_0x057d
        L_0x056f:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x0581
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r1 = r1.f8468l     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x0581
            r36.m8099g()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0581
        L_0x057d:
            r1 = 0
            r8.m8086a((boolean) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0581:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x0694
        L_0x0585:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == r2) goto L_0x05c2
            long r1 = r8.f8426B     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r3 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r3 = r3.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r3 = r3.f8461e     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x05c2
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.mo19086d()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r1 = r1.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.m8091b((com.fyber.inneractive.sdk.player.p059c.C3285g.C3286a) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$b r1 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.f8462f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r3 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r3 = r3.f8463g     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.<init>(r2, r3)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r36.m8096d()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Handler r1 = r8.f8440j     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = 5
            com.fyber.inneractive.sdk.player.c.g$b r3 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.sendToTarget()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0585
        L_0x05c2:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r1 = r1.f8464h     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x05ec
            r1 = 0
        L_0x05c9:
            com.fyber.inneractive.sdk.player.c.n[] r2 = r8.f8434d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.length     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 >= r2) goto L_0x0694
            com.fyber.inneractive.sdk.player.c.n[] r2 = r8.f8434d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = r2[r1]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r3 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.e[] r3 = r3.f8459c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r3 = r3[r1]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r3 == 0) goto L_0x05e9
            com.fyber.inneractive.sdk.player.c.g.e r4 = r2.mo18886f()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r4 != r3) goto L_0x05e9
            boolean r3 = r2.mo18887g()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r3 == 0) goto L_0x05e9
            r2.mo18888h()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x05e9:
            int r1 = r1 + 1
            goto L_0x05c9
        L_0x05ec:
            r1 = 0
        L_0x05ed:
            com.fyber.inneractive.sdk.player.c.n[] r2 = r8.f8434d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.length     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 >= r2) goto L_0x060f
            com.fyber.inneractive.sdk.player.c.n[] r2 = r8.f8434d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = r2[r1]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r3 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.e[] r3 = r3.f8459c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r3 = r3[r1]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.e r4 = r2.mo18886f()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r4 != r3) goto L_0x0694
            if (r3 == 0) goto L_0x060c
            boolean r2 = r2.mo18887g()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x060c
            goto L_0x0694
        L_0x060c:
            int r1 = r1 + 1
            goto L_0x05ed
        L_0x060f:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r1 = r1.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x0694
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r1 = r1.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r1 = r1.f8465i     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x0694
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.i.h r1 = r1.f8469m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r2 = r2.f8467k     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8428D = r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.i.h r2 = r2.f8469m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r3 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.c r3 = r3.f8457a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r3 = r3.mo19262g()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x0637
            r3 = 1
            goto L_0x0638
        L_0x0637:
            r3 = 0
        L_0x0638:
            r4 = 0
        L_0x0639:
            com.fyber.inneractive.sdk.player.c.n[] r5 = r8.f8434d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r5 = r5.length     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r4 >= r5) goto L_0x0694
            com.fyber.inneractive.sdk.player.c.n[] r5 = r8.f8434d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r5 = r5[r4]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.i.f r6 = r1.f9409b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.i.e[] r6 = r6.f9405b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r6 = r6[r4]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r6 == 0) goto L_0x068d
            if (r3 != 0) goto L_0x068a
            boolean r6 = r5.mo18889i()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r6 != 0) goto L_0x068d
            com.fyber.inneractive.sdk.player.c.i.f r6 = r2.f9409b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.i.e[] r6 = r6.f9405b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r6 = r6[r4]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.p[] r7 = r1.f9411d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r7 = r7[r4]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.p[] r13 = r2.f9411d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r13 = r13[r4]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r6 == 0) goto L_0x068a
            boolean r7 = r13.equals(r7)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r7 == 0) goto L_0x068a
            int r7 = r6.mo19291b()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.h[] r13 = new com.fyber.inneractive.sdk.player.p059c.C3290h[r7]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r14 = 0
        L_0x066f:
            if (r14 >= r7) goto L_0x067a
            com.fyber.inneractive.sdk.player.c.h r16 = r6.mo19290a(r14)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r13[r14] = r16     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r14 = r14 + 1
            goto L_0x066f
        L_0x067a:
            com.fyber.inneractive.sdk.player.c.g$a r6 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.e[] r6 = r6.f8459c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r6 = r6[r4]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r7 = r8.f8428D     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r9 = r7.mo19080a()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r5.mo18881a(r13, r6, r9)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x068d
        L_0x068a:
            r5.mo18888h()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x068d:
            int r4 = r4 + 1
            r10 = 1
            goto L_0x0639
        L_0x0691:
            r21 = r12
            r11 = r4
        L_0x0694:
            com.fyber.inneractive.sdk.player.c.g$a r1 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = 10
            if (r1 != 0) goto L_0x06a5
            r36.m8098f()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r4 = r21
            r8.m8082a((long) r4, (long) r2)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x06a2:
            r1 = 1
            goto L_0x0806
        L_0x06a5:
            r4 = r21
            java.lang.String r1 = "doSomeWork"
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8868a(r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r36.m8096d()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$b r1 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r6 = r1.f8478c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.n[] r1 = r8.f8449s     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r6 = r1.length     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r7 = 1
            r9 = 1
            r10 = 0
        L_0x06b9:
            if (r10 >= r6) goto L_0x06f1
            r13 = r1[r10]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r2 = r8.f8426B     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r14 = r8.f8455y     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r13.mo19099a(r2, r14)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r9 == 0) goto L_0x06ce
            boolean r2 = r13.mo18954r()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 == 0) goto L_0x06ce
            r9 = 1
            goto L_0x06cf
        L_0x06ce:
            r9 = 0
        L_0x06cf:
            boolean r2 = r13.mo18953q()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x06de
            boolean r2 = r13.mo18954r()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 == 0) goto L_0x06dc
            goto L_0x06de
        L_0x06dc:
            r2 = 0
            goto L_0x06df
        L_0x06de:
            r2 = 1
        L_0x06df:
            if (r2 != 0) goto L_0x06e4
            r13.mo18890j()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x06e4:
            if (r7 == 0) goto L_0x06ea
            if (r2 == 0) goto L_0x06ea
            r7 = 1
            goto L_0x06eb
        L_0x06ea:
            r7 = 0
        L_0x06eb:
            int r10 = r10 + 1
            r2 = 10
            r15 = 4
            goto L_0x06b9
        L_0x06f1:
            if (r7 != 0) goto L_0x06f6
            r36.m8098f()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x06f6:
            com.fyber.inneractive.sdk.player.c.k.g r1 = r8.f8447q     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x071b
            com.fyber.inneractive.sdk.player.c.k.g r1 = r8.f8447q     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.m r1 = r1.mo18956w()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.m r2 = r8.f8445o     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r2 = r1.equals(r2)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x071b
            r8.f8445o = r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.k.q r2 = r8.f8438h     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.k.g r3 = r8.f8447q     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2.mo19420a((com.fyber.inneractive.sdk.player.p059c.p080k.C3542g) r3)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Handler r2 = r8.f8440j     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.sendToTarget()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x071b:
            com.fyber.inneractive.sdk.player.c.q r1 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r2.f8462f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r3 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r6 = 0
            com.fyber.inneractive.sdk.player.c.q$a r1 = r1.mo19104a((int) r2, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3302a) r3, (boolean) r6)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r1 = r1.f8528d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r9 == 0) goto L_0x0747
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0738
            com.fyber.inneractive.sdk.player.c.g$b r3 = r8.f8444n     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r9 = r3.f8478c     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x0747
        L_0x0738:
            com.fyber.inneractive.sdk.player.c.g$a r3 = r8.f8429E     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r3 = r3.f8464h     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r3 == 0) goto L_0x0747
            r3 = 4
            r8.m8080a((int) r3)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r36.m8095c()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x07c9
        L_0x0747:
            int r3 = r8.f8453w     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r6 = 2
            if (r3 != r6) goto L_0x07ad
            com.fyber.inneractive.sdk.player.c.n[] r3 = r8.f8449s     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r3 = r3.length     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r3 <= 0) goto L_0x079b
            if (r7 == 0) goto L_0x0799
            boolean r1 = r8.f8451u     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r2 = r2.f8465i     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 != 0) goto L_0x0760
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r2 = r2.f8463g     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0768
        L_0x0760:
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.c r2 = r2.f8457a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r2 = r2.mo19263h()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0768:
            r6 = -9223372036854775808
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0785
            com.fyber.inneractive.sdk.player.c.g$a r2 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r2 = r2.f8464h     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r2 == 0) goto L_0x0776
            r14 = 1
            goto L_0x0795
        L_0x0776:
            com.fyber.inneractive.sdk.player.c.q r2 = r8.f8430F     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r3 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r3 = r3.f8462f     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.q$a r6 = r8.f8443m     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r7 = 0
            com.fyber.inneractive.sdk.player.c.q$a r2 = r2.mo19104a((int) r3, (com.fyber.inneractive.sdk.player.p059c.C3300q.C3302a) r6, (boolean) r7)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r2 = r2.f8528d     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0785:
            com.fyber.inneractive.sdk.player.c.k r6 = r8.f8437g     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g$a r7 = r8.f8427C     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r9 = r8.f8426B     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r11 = r7.mo19080a()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            long r9 = r9 - r11
            long r2 = r2 - r9
            boolean r14 = r6.mo18971a((long) r2, (boolean) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0795:
            if (r14 == 0) goto L_0x0799
            r1 = 1
            goto L_0x079f
        L_0x0799:
            r1 = 0
            goto L_0x079f
        L_0x079b:
            boolean r1 = r8.m8094b((long) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x079f:
            if (r1 == 0) goto L_0x07c9
            r1 = 3
            r8.m8080a((int) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            boolean r1 = r8.f8450t     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x07c9
            r36.m8090b()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x07c9
        L_0x07ad:
            int r3 = r8.f8453w     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r6 = 3
            if (r3 != r6) goto L_0x07c9
            com.fyber.inneractive.sdk.player.c.n[] r3 = r8.f8449s     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r3 = r3.length     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r3 <= 0) goto L_0x07b8
            goto L_0x07bc
        L_0x07b8:
            boolean r7 = r8.m8094b((long) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x07bc:
            if (r7 != 0) goto L_0x07c9
            boolean r1 = r8.f8450t     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8451u = r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1 = 2
            r8.m8080a((int) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r36.m8095c()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x07c9:
            int r1 = r8.f8453w     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = 2
            if (r1 != r2) goto L_0x07dc
            com.fyber.inneractive.sdk.player.c.n[] r1 = r8.f8449s     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r2 = r1.length     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r12 = 0
        L_0x07d2:
            if (r12 >= r2) goto L_0x07dc
            r3 = r1[r12]     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r3.mo18890j()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r12 = r12 + 1
            goto L_0x07d2
        L_0x07dc:
            boolean r1 = r8.f8450t     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x07e5
            int r1 = r8.f8453w     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = 3
            if (r1 == r2) goto L_0x07ea
        L_0x07e5:
            int r1 = r8.f8453w     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = 2
            if (r1 != r2) goto L_0x07f0
        L_0x07ea:
            r1 = 10
            r8.m8082a((long) r4, (long) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0801
        L_0x07f0:
            com.fyber.inneractive.sdk.player.c.n[] r1 = r8.f8449s     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r1 = r1.length     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x07fb
            r1 = 1000(0x3e8, double:4.94E-321)
            r8.m8082a((long) r4, (long) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0801
        L_0x07fb:
            android.os.Handler r1 = r8.f8431a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = 2
            r1.removeMessages(r2)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0801:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8867a()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x06a2
        L_0x0806:
            return r1
        L_0x0807:
            int r1 = r1.arg1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x080d
            r1 = 1
            goto L_0x080e
        L_0x080d:
            r1 = 0
        L_0x080e:
            r2 = 0
            r8.f8451u = r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8450t = r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 != 0) goto L_0x081f
            r36.m8095c()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r36.m8096d()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.m8093b((boolean) r2)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0838
        L_0x081f:
            int r1 = r8.f8453w     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = 3
            if (r1 != r2) goto L_0x082e
            r36.m8090b()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Handler r1 = r8.f8431a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = 2
            r1.sendEmptyMessage(r2)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            goto L_0x0838
        L_0x082e:
            int r1 = r8.f8453w     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2 = 2
            if (r1 != r2) goto L_0x0838
            android.os.Handler r1 = r8.f8431a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.sendEmptyMessage(r2)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x0838:
            r1 = 1
            return r1
        L_0x083a:
            r11 = r4
            java.lang.Object r2 = r1.obj     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.g.d r2 = (com.fyber.inneractive.sdk.player.p059c.p074g.C3454d) r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            int r1 = r1.arg1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r1 == 0) goto L_0x0845
            r9 = 1
            goto L_0x0846
        L_0x0845:
            r9 = 0
        L_0x0846:
            android.os.Handler r1 = r8.f8440j     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r3 = 0
            r1.sendEmptyMessage(r3)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1 = 1
            r8.m8093b((boolean) r1)     // Catch:{ d -> 0x0871, IOException -> 0x086e, RuntimeException -> 0x0880 }
            com.fyber.inneractive.sdk.player.c.k r1 = r8.f8437g     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.mo18968a()     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            if (r9 == 0) goto L_0x085e
            com.fyber.inneractive.sdk.player.c.g$b r1 = new com.fyber.inneractive.sdk.player.c.g$b     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1.<init>(r3, r11)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r8.f8444n = r1     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
        L_0x085e:
            r8.f8448r = r2     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2.mo19282a((com.fyber.inneractive.sdk.player.p059c.p074g.C3454d.C3455a) r8)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1 = 2
            r8.m8080a((int) r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            android.os.Handler r2 = r8.f8431a     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r2.sendEmptyMessage(r1)     // Catch:{ d -> 0x087a, IOException -> 0x0874, RuntimeException -> 0x0880 }
            r1 = 1
            return r1
        L_0x086e:
            r0 = move-exception
            r2 = r0
            goto L_0x0877
        L_0x0871:
            r0 = move-exception
            r2 = r0
            goto L_0x087d
        L_0x0874:
            r0 = move-exception
            r2 = r0
            r1 = 1
        L_0x0877:
            r3 = 8
            goto L_0x08a2
        L_0x087a:
            r0 = move-exception
            r2 = r0
            r1 = 1
        L_0x087d:
            r3 = 8
            goto L_0x08bf
        L_0x0880:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.f8440j
            com.fyber.inneractive.sdk.player.c.d r1 = com.fyber.inneractive.sdk.player.p059c.C3236d.m7870a((java.lang.RuntimeException) r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r36.m8097e()
            r1 = 1
            return r1
        L_0x089d:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x08a2:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Source error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f8440j
            com.fyber.inneractive.sdk.player.c.d r2 = com.fyber.inneractive.sdk.player.p059c.C3236d.m7868a((java.io.IOException) r2)
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r36.m8097e()
            return r1
        L_0x08ba:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x08bf:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Renderer error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f8440j
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r36.m8097e()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.C3285g.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: a */
    private void m8080a(int i) {
        if (this.f8453w != i) {
            this.f8453w = i;
            this.f8440j.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: a */
    private void m8086a(boolean z) {
        if (this.f8452v != z) {
            this.f8452v = z;
            this.f8440j.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: b */
    private void m8090b() throws C3236d {
        this.f8451u = false;
        C3557q qVar = this.f8438h;
        if (!qVar.f9648a) {
            qVar.f9649b = SystemClock.elapsedRealtime();
            qVar.f9648a = true;
        }
        for (C3297n e : this.f8449s) {
            e.mo18885e();
        }
    }

    /* renamed from: c */
    private void m8095c() throws C3236d {
        this.f8438h.mo19418a();
        for (C3297n a : this.f8449s) {
            m8084a(a);
        }
    }

    /* renamed from: d */
    private void m8096d() throws C3236d {
        long j;
        C3286a aVar = this.f8429E;
        if (aVar != null) {
            long g = aVar.f8457a.mo19262g();
            if (g != -9223372036854775807L) {
                m8081a(g);
            } else {
                C3297n nVar = this.f8446p;
                if (nVar == null || nVar.mo18954r()) {
                    this.f8426B = this.f8438h.mo18955v();
                } else {
                    long v = this.f8447q.mo18955v();
                    this.f8426B = v;
                    this.f8438h.mo19419a(v);
                }
                g = this.f8426B - this.f8429E.mo19080a();
            }
            this.f8444n.f8478c = g;
            this.f8455y = SystemClock.elapsedRealtime() * 1000;
            if (this.f8449s.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f8429E.f8457a.mo19263h();
            }
            C3287b bVar = this.f8444n;
            if (j == Long.MIN_VALUE) {
                j = this.f8430F.mo19104a(this.f8429E.f8462f, this.f8443m, false).f8528d;
            }
            bVar.f8479d = j;
        }
    }

    /* renamed from: a */
    private void m8082a(long j, long j2) {
        this.f8431a.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f8431a.sendEmptyMessage(2);
        } else {
            this.f8431a.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: a */
    private long m8077a(int i, long j) throws C3236d {
        C3286a aVar;
        m8095c();
        this.f8451u = false;
        m8080a(2);
        C3286a aVar2 = this.f8429E;
        if (aVar2 == null) {
            C3286a aVar3 = this.f8427C;
            if (aVar3 != null) {
                aVar3.mo19086d();
            }
            aVar = null;
        } else {
            aVar = null;
            while (aVar2 != null) {
                if (aVar2.f8462f != i || !aVar2.f8465i) {
                    aVar2.mo19086d();
                } else {
                    aVar = aVar2;
                }
                aVar2 = aVar2.f8467k;
            }
        }
        C3286a aVar4 = this.f8429E;
        if (!(aVar4 == aVar && aVar4 == this.f8428D)) {
            for (C3297n l : this.f8449s) {
                l.mo18892l();
            }
            this.f8449s = new C3297n[0];
            this.f8447q = null;
            this.f8446p = null;
            this.f8429E = null;
        }
        if (aVar != null) {
            aVar.f8467k = null;
            this.f8427C = aVar;
            this.f8428D = aVar;
            m8091b(aVar);
            if (this.f8429E.f8466j) {
                j = this.f8429E.f8457a.mo19253a(j);
            }
            m8081a(j);
            m8099g();
        } else {
            this.f8427C = null;
            this.f8428D = null;
            this.f8429E = null;
            m8081a(j);
        }
        this.f8431a.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: a */
    private void m8081a(long j) throws C3236d {
        C3286a aVar = this.f8429E;
        long a = j + (aVar == null ? 60000000 : aVar.mo19080a());
        this.f8426B = a;
        this.f8438h.mo19419a(a);
        for (C3297n a2 : this.f8449s) {
            a2.mo18876a(this.f8426B);
        }
    }

    /* renamed from: e */
    private void m8097e() {
        m8093b(true);
        this.f8437g.mo18972b();
        m8080a(1);
    }

    /* renamed from: b */
    private void m8093b(boolean z) {
        this.f8431a.removeMessages(2);
        this.f8451u = false;
        this.f8438h.mo19418a();
        this.f8447q = null;
        this.f8446p = null;
        this.f8426B = 60000000;
        for (C3297n nVar : this.f8449s) {
            try {
                m8084a(nVar);
                nVar.mo18892l();
            } catch (C3236d | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f8449s = new C3297n[0];
        C3286a aVar = this.f8429E;
        if (aVar == null) {
            aVar = this.f8427C;
        }
        m8083a(aVar);
        this.f8427C = null;
        this.f8428D = null;
        this.f8429E = null;
        m8086a(false);
        if (z) {
            C3454d dVar = this.f8448r;
            if (dVar != null) {
                dVar.mo19280a();
                this.f8448r = null;
            }
            this.f8430F = null;
        }
    }

    /* renamed from: a */
    private static void m8084a(C3297n nVar) throws C3236d {
        if (nVar.mo18884d() == 2) {
            nVar.mo18891k();
        }
    }

    /* renamed from: b */
    private boolean m8094b(long j) {
        if (j == -9223372036854775807L || this.f8444n.f8478c < j) {
            return true;
        }
        return this.f8429E.f8467k != null && this.f8429E.f8467k.f8465i;
    }

    /* renamed from: f */
    private void m8098f() throws IOException {
        C3286a aVar = this.f8427C;
        if (aVar != null && !aVar.f8465i) {
            C3286a aVar2 = this.f8428D;
            if (aVar2 == null || aVar2.f8467k == this.f8427C) {
                C3297n[] nVarArr = this.f8449s;
                int length = nVarArr.length;
                int i = 0;
                while (i < length) {
                    if (nVarArr[i].mo18887g()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f8427C.f8457a.mo19258c();
            }
        }
    }

    /* renamed from: a */
    private void m8085a(Object obj, int i) {
        this.f8444n = new C3287b(0, 0);
        m8092b(obj, i);
        this.f8444n = new C3287b(0, -9223372036854775807L);
        m8080a(4);
        m8093b(false);
    }

    /* renamed from: b */
    private void m8092b(Object obj, int i) {
        this.f8440j.obtainMessage(6, new C3289d(this.f8430F, obj, this.f8444n, i)).sendToTarget();
    }

    /* renamed from: a */
    private int m8076a(int i, C3300q qVar, C3300q qVar2) {
        int i2 = -1;
        while (i2 == -1 && i < qVar.mo19108c() - 1) {
            i++;
            i2 = qVar2.mo19103a(qVar.mo19104a(i, this.f8443m, true).f8526b);
        }
        return i2;
    }

    /* renamed from: a */
    private Pair<Integer, Long> m8078a(C3288c cVar) {
        C3300q qVar = cVar.f8480a;
        if (qVar.mo19106a()) {
            qVar = this.f8430F;
        }
        try {
            Pair<Integer, Long> b = m8089b(qVar, cVar.f8481b, cVar.f8482c);
            C3300q qVar2 = this.f8430F;
            if (qVar2 == qVar) {
                return b;
            }
            int a = qVar2.mo19103a(qVar.mo19104a(((Integer) b.first).intValue(), this.f8443m, true).f8526b);
            if (a != -1) {
                return Pair.create(Integer.valueOf(a), b.second);
            }
            int a2 = m8076a(((Integer) b.first).intValue(), qVar, this.f8430F);
            if (a2 != -1) {
                return m8088b(this.f8430F.mo19104a(a2, this.f8443m, false).f8527c);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new C3293j(this.f8430F, cVar.f8481b, cVar.f8482c);
        }
    }

    /* renamed from: b */
    private Pair<Integer, Long> m8088b(int i) {
        return m8089b(this.f8430F, i, -9223372036854775807L);
    }

    /* renamed from: b */
    private Pair<Integer, Long> m8089b(C3300q qVar, int i, long j) {
        return m8079a(qVar, i, j, 0);
    }

    /* renamed from: a */
    private Pair<Integer, Long> m8079a(C3300q qVar, int i, long j, long j2) {
        C3535a.m8780a(i, qVar.mo19107b());
        qVar.mo19105a(i, this.f8442l, j2);
        if (j == -9223372036854775807L) {
            j = this.f8442l.f8538h;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = this.f8442l.f8536f;
        long j3 = this.f8442l.f8540j + j;
        long j4 = qVar.mo19104a(i2, this.f8443m, false).f8528d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < this.f8442l.f8537g) {
            j3 -= j4;
            i2++;
            j4 = qVar.mo19104a(i2, this.f8443m, false).f8528d;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }

    /* renamed from: g */
    private void m8099g() {
        long j;
        if (!this.f8427C.f8465i) {
            j = 0;
        } else {
            j = this.f8427C.f8457a.mo19261f();
        }
        if (j == Long.MIN_VALUE) {
            m8086a(false);
            return;
        }
        C3286a aVar = this.f8427C;
        boolean a = this.f8437g.mo18970a(j - (this.f8426B - aVar.mo19080a()));
        m8086a(a);
        if (a) {
            this.f8427C.f8468l = false;
            this.f8427C.f8457a.mo19260e();
            return;
        }
        this.f8427C.f8468l = true;
    }

    /* renamed from: a */
    private static void m8083a(C3286a aVar) {
        while (aVar != null) {
            aVar.mo19086d();
            aVar = aVar.f8467k;
        }
    }

    /* renamed from: b */
    private void m8091b(C3286a aVar) throws C3236d {
        if (this.f8429E != aVar) {
            boolean[] zArr = new boolean[this.f8434d.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                C3297n[] nVarArr = this.f8434d;
                if (i < nVarArr.length) {
                    C3297n nVar = nVarArr[i];
                    zArr[i] = nVar.mo18884d() != 0;
                    C3473e eVar = aVar.f8469m.f9409b.f9405b[i];
                    if (eVar != null) {
                        i2++;
                    }
                    if (zArr[i] && (eVar == null || (nVar.mo18889i() && nVar.mo18886f() == this.f8429E.f8459c[i]))) {
                        if (nVar == this.f8446p) {
                            this.f8438h.mo19420a(this.f8447q);
                            this.f8447q = null;
                            this.f8446p = null;
                        }
                        m8084a(nVar);
                        nVar.mo18892l();
                    }
                    i++;
                } else {
                    this.f8429E = aVar;
                    this.f8440j.obtainMessage(3, aVar.f8469m).sendToTarget();
                    m8087a(zArr, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m8087a(boolean[] zArr, int i) throws C3236d {
        this.f8449s = new C3297n[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C3297n[] nVarArr = this.f8434d;
            if (i2 < nVarArr.length) {
                C3297n nVar = nVarArr[i2];
                C3473e eVar = this.f8429E.f8469m.f9409b.f9405b[i2];
                if (eVar != null) {
                    int i4 = i3 + 1;
                    this.f8449s[i3] = nVar;
                    if (nVar.mo18884d() == 0) {
                        C3299p pVar = this.f8429E.f8469m.f9411d[i2];
                        boolean z = this.f8450t && this.f8453w == 3;
                        boolean z2 = !zArr[i2] && z;
                        int b = eVar.mo19291b();
                        C3290h[] hVarArr = new C3290h[b];
                        for (int i5 = 0; i5 < b; i5++) {
                            hVarArr[i5] = eVar.mo19290a(i5);
                        }
                        nVar.mo18878a(pVar, hVarArr, this.f8429E.f8459c[i2], this.f8426B, z2, this.f8429E.mo19080a());
                        C3542g c = nVar.mo18883c();
                        if (c != null) {
                            if (this.f8447q == null) {
                                this.f8447q = c;
                                this.f8446p = nVar;
                                c.mo18947a(this.f8445o);
                            } else {
                                throw C3236d.m7870a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
                            }
                        }
                        if (z) {
                            nVar.mo18885e();
                        }
                    }
                    i3 = i4;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.g$a */
    private static final class C3286a {

        /* renamed from: a */
        public final C3452c f8457a;

        /* renamed from: b */
        public final Object f8458b;

        /* renamed from: c */
        public final C3456e[] f8459c;

        /* renamed from: d */
        public final boolean[] f8460d;

        /* renamed from: e */
        public final long f8461e;

        /* renamed from: f */
        public int f8462f;

        /* renamed from: g */
        public long f8463g;

        /* renamed from: h */
        public boolean f8464h;

        /* renamed from: i */
        public boolean f8465i;

        /* renamed from: j */
        public boolean f8466j;

        /* renamed from: k */
        public C3286a f8467k;

        /* renamed from: l */
        public boolean f8468l;

        /* renamed from: m */
        public C3478h f8469m;

        /* renamed from: n */
        private final C3297n[] f8470n;

        /* renamed from: o */
        private final C3298o[] f8471o;

        /* renamed from: p */
        private final C3476g f8472p;

        /* renamed from: q */
        private final C3294k f8473q;

        /* renamed from: r */
        private final C3454d f8474r;

        /* renamed from: s */
        private C3478h f8475s;

        public C3286a(C3297n[] nVarArr, C3298o[] oVarArr, long j, C3476g gVar, C3294k kVar, C3454d dVar, Object obj, int i, boolean z, long j2) {
            this.f8470n = nVarArr;
            this.f8471o = oVarArr;
            this.f8461e = j;
            this.f8472p = gVar;
            this.f8473q = kVar;
            this.f8474r = dVar;
            this.f8458b = C3535a.m8781a(obj);
            this.f8462f = i;
            this.f8464h = z;
            this.f8463g = j2;
            this.f8459c = new C3456e[nVarArr.length];
            this.f8460d = new boolean[nVarArr.length];
            this.f8457a = dVar.mo19279a(i, kVar.mo18974d());
        }

        /* renamed from: a */
        public final long mo19080a() {
            return this.f8461e - this.f8463g;
        }

        /* renamed from: a */
        public final void mo19083a(int i, boolean z) {
            this.f8462f = i;
            this.f8464h = z;
        }

        /* renamed from: b */
        public final boolean mo19084b() {
            if (this.f8465i) {
                return !this.f8466j || this.f8457a.mo19263h() == Long.MIN_VALUE;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo19085c() throws com.fyber.inneractive.sdk.player.p059c.C3236d {
            /*
                r6 = this;
                com.fyber.inneractive.sdk.player.c.i.g r0 = r6.f8472p
                com.fyber.inneractive.sdk.player.c.o[] r1 = r6.f8471o
                com.fyber.inneractive.sdk.player.c.g.c r2 = r6.f8457a
                com.fyber.inneractive.sdk.player.c.g.i r2 = r2.mo19259d()
                com.fyber.inneractive.sdk.player.c.i.h r0 = r0.mo19302a(r1, r2)
                com.fyber.inneractive.sdk.player.c.i.h r1 = r6.f8475s
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L_0x0016
            L_0x0014:
                r1 = 0
                goto L_0x0028
            L_0x0016:
                r4 = 0
            L_0x0017:
                com.fyber.inneractive.sdk.player.c.i.f r5 = r0.f9409b
                int r5 = r5.f9404a
                if (r4 >= r5) goto L_0x0027
                boolean r5 = r0.mo19308a(r1, r4)
                if (r5 != 0) goto L_0x0024
                goto L_0x0014
            L_0x0024:
                int r4 = r4 + 1
                goto L_0x0017
            L_0x0027:
                r1 = 1
            L_0x0028:
                if (r1 == 0) goto L_0x002b
                return r3
            L_0x002b:
                r6.f8469m = r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.C3285g.C3286a.mo19085c():boolean");
        }

        /* renamed from: a */
        public final long mo19081a(long j) {
            return mo19082a(j, false, new boolean[this.f8470n.length]);
        }

        /* renamed from: a */
        public final long mo19082a(long j, boolean z, boolean[] zArr) {
            C3475f fVar = this.f8469m.f9409b;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= fVar.f9404a) {
                    break;
                }
                boolean[] zArr2 = this.f8460d;
                if (z || !this.f8469m.mo19308a(this.f8475s, i)) {
                    z2 = false;
                }
                zArr2[i] = z2;
                i++;
            }
            long a = this.f8457a.mo19254a(fVar.mo19305a(), this.f8460d, this.f8459c, zArr, j);
            this.f8475s = this.f8469m;
            this.f8466j = false;
            int i2 = 0;
            while (true) {
                C3456e[] eVarArr = this.f8459c;
                if (i2 < eVarArr.length) {
                    if (eVarArr[i2] != null) {
                        C3535a.m8784b(fVar.f9405b[i2] != null);
                        this.f8466j = true;
                    } else {
                        C3535a.m8784b(fVar.f9405b[i2] == null);
                    }
                    i2++;
                } else {
                    this.f8473q.mo18969a(this.f8470n, fVar);
                    return a;
                }
            }
        }

        /* renamed from: d */
        public final void mo19086d() {
            try {
                this.f8474r.mo19281a(this.f8457a);
            } catch (RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Period release failed.", e);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.g$c */
    private static final class C3288c {

        /* renamed from: a */
        public final C3300q f8480a;

        /* renamed from: b */
        public final int f8481b;

        /* renamed from: c */
        public final long f8482c;

        public C3288c(C3300q qVar, int i, long j) {
            this.f8480a = qVar;
            this.f8481b = i;
            this.f8482c = j;
        }
    }
}
