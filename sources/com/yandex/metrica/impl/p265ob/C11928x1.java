package com.yandex.metrica.impl.p265ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.yandex.metrica.IMetricaService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.x1 */
public class C11928x1 {

    /* renamed from: j */
    public static final long f28690j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    private final Context f28691a;

    /* renamed from: b */
    private final C11769sn f28692b;

    /* renamed from: c */
    private boolean f28693c;

    /* renamed from: d */
    private final List<C11931c> f28694d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public IMetricaService f28695e;

    /* renamed from: f */
    private final Object f28696f;

    /* renamed from: g */
    private final C10443L1 f28697g;

    /* renamed from: h */
    private final Runnable f28698h;

    /* renamed from: i */
    private final ServiceConnection f28699i;

    /* renamed from: com.yandex.metrica.impl.ob.x1$a */
    class C11929a implements Runnable {
        C11929a() {
        }

        public void run() {
            C11928x1.m30810a(C11928x1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x1$b */
    class C11930b implements ServiceConnection {
        C11930b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (C11928x1.this) {
                IMetricaService unused = C11928x1.this.f28695e = IMetricaService.C10020a.m25815a(iBinder);
            }
            C11928x1.m30811b(C11928x1.this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (C11928x1.this) {
                IMetricaService unused = C11928x1.this.f28695e = null;
            }
            C11928x1.m30812c(C11928x1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x1$c */
    interface C11931c {
        void onServiceConnected();

        void onServiceDisconnected();
    }

    public C11928x1(Context context, C11769sn snVar) {
        this(context, snVar, C10941Y.m28234g().mo62504i());
    }

    /* renamed from: c */
    static void m30812c(C11928x1 x1Var) {
        for (C11931c onServiceDisconnected : x1Var.f28694d) {
            onServiceDisconnected.onServiceDisconnected();
        }
    }

    /* renamed from: b */
    public synchronized void mo64056b() {
        if (this.f28695e == null) {
            Intent b = C10326H2.m26428b(this.f28691a);
            try {
                this.f28697g.mo61702a(this.f28691a);
                this.f28691a.bindService(b, this.f28699i, 1);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public synchronized IMetricaService mo64058d() {
        return this.f28695e;
    }

    /* renamed from: e */
    public synchronized boolean mo64059e() {
        return this.f28695e != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo64060f() {
        synchronized (this.f28696f) {
            ((C11725rn) this.f28692b).mo63612a(this.f28698h);
        }
    }

    /* renamed from: g */
    public void mo64061g() {
        C11769sn snVar = this.f28692b;
        synchronized (this.f28696f) {
            C11725rn rnVar = (C11725rn) snVar;
            rnVar.mo63612a(this.f28698h);
            if (!this.f28693c) {
                rnVar.mo63613a(this.f28698h, f28690j);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|(2:6|7)|8|9|(2:12|10)|18|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[LOOP:0: B:10:0x001d->B:12:0x0023, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m30810a(com.yandex.metrica.impl.p265ob.C11928x1 r3) {
        /*
            monitor-enter(r3)
            android.content.Context r0 = r3.f28691a     // Catch:{ all -> 0x002f }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            boolean r0 = r3.mo64059e()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0015
            r3.f28695e = r1     // Catch:{ all -> 0x0015 }
            android.content.Context r0 = r3.f28691a     // Catch:{ all -> 0x0015 }
            android.content.ServiceConnection r2 = r3.f28699i     // Catch:{ all -> 0x0015 }
            r0.unbindService(r2)     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r3.f28695e = r1     // Catch:{ all -> 0x002f }
            java.util.List<com.yandex.metrica.impl.ob.x1$c> r0 = r3.f28694d     // Catch:{ all -> 0x002f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002f }
        L_0x001d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.x1$c r1 = (com.yandex.metrica.impl.p265ob.C11928x1.C11931c) r1     // Catch:{ all -> 0x002f }
            r1.onServiceDisconnected()     // Catch:{ all -> 0x002f }
            goto L_0x001d
        L_0x002d:
            monitor-exit(r3)
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11928x1.m30810a(com.yandex.metrica.impl.ob.x1):void");
    }

    C11928x1(Context context, C11769sn snVar, C10443L1 l1) {
        this.f28694d = new CopyOnWriteArrayList();
        this.f28695e = null;
        this.f28696f = new Object();
        this.f28698h = new C11929a();
        this.f28699i = new C11930b();
        this.f28691a = context.getApplicationContext();
        this.f28692b = snVar;
        this.f28693c = false;
        this.f28697g = l1;
    }

    /* renamed from: c */
    public void mo64057c() {
        synchronized (this.f28696f) {
            this.f28693c = true;
            mo64060f();
        }
    }

    /* renamed from: b */
    static void m30811b(C11928x1 x1Var) {
        for (C11931c onServiceConnected : x1Var.f28694d) {
            onServiceConnected.onServiceConnected();
        }
    }

    /* renamed from: a */
    public void mo64055a(C11931c cVar) {
        this.f28694d.add(cVar);
    }

    /* renamed from: a */
    public void mo64054a() {
        synchronized (this.f28696f) {
            this.f28693c = false;
            mo64061g();
        }
    }
}
