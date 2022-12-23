package com.adcolony.sdk;

import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.c0 */
class C0601c0 {

    /* renamed from: e */
    static boolean f261e = false;

    /* renamed from: f */
    private static final int f262f = 4000;

    /* renamed from: g */
    private static final int f263g = 4;

    /* renamed from: h */
    static final int f264h = 3;

    /* renamed from: i */
    static final int f265i = 2;

    /* renamed from: j */
    static final int f266j = 1;

    /* renamed from: k */
    static final int f267k = 0;

    /* renamed from: l */
    static final int f268l = -1;

    /* renamed from: m */
    static int f269m = 3;

    /* renamed from: n */
    static int f270n = 1;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0897z0 f271a = C0894y.m1151b();

    /* renamed from: b */
    private ExecutorService f272b = null;

    /* renamed from: c */
    private final Queue<Runnable> f273c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    C0760n0 f274d;

    /* renamed from: com.adcolony.sdk.c0$a */
    class C0602a implements C0685f0 {
        C0602a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0601c0.this.mo9489b(C0894y.m1163d(d0Var.mo9532b(), "module"), 0, C0894y.m1169h(d0Var.mo9532b(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.c0$b */
    class C0603b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f276a;

        /* renamed from: b */
        final /* synthetic */ String f277b;

        /* renamed from: c */
        final /* synthetic */ int f278c;

        /* renamed from: d */
        final /* synthetic */ boolean f279d;

        C0603b(int i, String str, int i2, boolean z) {
            this.f276a = i;
            this.f277b = str;
            this.f278c = i2;
            this.f279d = z;
        }

        public void run() {
            C0601c0.this.m243a(this.f276a, this.f277b, this.f278c);
            int i = 0;
            while (i <= this.f277b.length() / C0601c0.f262f) {
                int i2 = i * C0601c0.f262f;
                i++;
                int min = Math.min(i * C0601c0.f262f, this.f277b.length());
                if (this.f278c == 3) {
                    C0601c0 c0Var = C0601c0.this;
                    if (c0Var.mo9487a(C0894y.m1167f(c0Var.f271a, Integer.toString(this.f276a)), 3, this.f279d)) {
                        Log.d("AdColony [TRACE]", this.f277b.substring(i2, min));
                    }
                }
                if (this.f278c == 2) {
                    C0601c0 c0Var2 = C0601c0.this;
                    if (c0Var2.mo9487a(C0894y.m1167f(c0Var2.f271a, Integer.toString(this.f276a)), 2, this.f279d)) {
                        Log.i("AdColony [INFO]", this.f277b.substring(i2, min));
                    }
                }
                if (this.f278c == 1) {
                    C0601c0 c0Var3 = C0601c0.this;
                    if (c0Var3.mo9487a(C0894y.m1167f(c0Var3.f271a, Integer.toString(this.f276a)), 1, this.f279d)) {
                        Log.w("AdColony [WARNING]", this.f277b.substring(i2, min));
                    }
                }
                if (this.f278c == 0) {
                    C0601c0 c0Var4 = C0601c0.this;
                    if (c0Var4.mo9487a(C0894y.m1167f(c0Var4.f271a, Integer.toString(this.f276a)), 0, this.f279d)) {
                        Log.e("AdColony [ERROR]", this.f277b.substring(i2, min));
                    }
                }
                if (this.f278c == -1 && C0601c0.f269m >= -1) {
                    Log.e("AdColony [FATAL]", this.f277b.substring(i2, min));
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c0$c */
    class C0604c implements C0685f0 {
        C0604c() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0601c0.f269m = C0894y.m1163d(d0Var.mo9532b(), "level");
        }
    }

    /* renamed from: com.adcolony.sdk.c0$d */
    class C0605d implements C0685f0 {
        C0605d() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0601c0.this.mo9489b(C0894y.m1163d(d0Var.mo9532b(), "module"), 3, C0894y.m1169h(d0Var.mo9532b(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.c0$e */
    class C0606e implements C0685f0 {
        C0606e() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0601c0.this.mo9489b(C0894y.m1163d(d0Var.mo9532b(), "module"), 3, C0894y.m1169h(d0Var.mo9532b(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.c0$f */
    class C0607f implements C0685f0 {
        C0607f() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0601c0.this.mo9489b(C0894y.m1163d(d0Var.mo9532b(), "module"), 2, C0894y.m1169h(d0Var.mo9532b(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.c0$g */
    class C0608g implements C0685f0 {
        C0608g() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0601c0.this.mo9489b(C0894y.m1163d(d0Var.mo9532b(), "module"), 2, C0894y.m1169h(d0Var.mo9532b(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.c0$h */
    class C0609h implements C0685f0 {
        C0609h() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0601c0.this.mo9489b(C0894y.m1163d(d0Var.mo9532b(), "module"), 1, C0894y.m1169h(d0Var.mo9532b(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.c0$i */
    class C0610i implements C0685f0 {
        C0610i() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0601c0.this.mo9489b(C0894y.m1163d(d0Var.mo9532b(), "module"), 1, C0894y.m1169h(d0Var.mo9532b(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.c0$j */
    class C0611j implements C0685f0 {
        C0611j() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0601c0.this.mo9489b(C0894y.m1163d(d0Var.mo9532b(), "module"), 0, C0894y.m1169h(d0Var.mo9532b(), "message"), false);
        }
    }

    C0601c0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9489b(int i, int i2, String str, boolean z) {
        if (!m245a(m242a(i, i2, str, z))) {
            synchronized (this.f273c) {
                this.f273c.add(m242a(i, i2, str, z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9491c() {
        ExecutorService executorService = this.f272b;
        if (executorService == null || executorService.isShutdown() || this.f272b.isTerminated()) {
            this.f272b = Executors.newSingleThreadExecutor();
        }
        synchronized (this.f273c) {
            while (!this.f273c.isEmpty()) {
                m245a(this.f273c.poll());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9484a(int i, String str, boolean z) {
        mo9489b(0, i, str, z);
    }

    /* renamed from: a */
    private Runnable m242a(int i, int i2, String str, boolean z) {
        return new C0603b(i, str, i2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9487a(C0897z0 z0Var, int i, boolean z) {
        int d = C0894y.m1163d(z0Var, "print_level");
        boolean b = C0894y.m1155b(z0Var, "log_private");
        if (z0Var.mo10070c() == 0) {
            d = f269m;
            b = f261e;
        }
        return (!z || b) && d != 4 && d >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9488b() {
        C0578a.m139a("Log.set_log_level", (C0685f0) new C0604c());
        C0578a.m139a("Log.public.trace", (C0685f0) new C0605d());
        C0578a.m139a("Log.private.trace", (C0685f0) new C0606e());
        C0578a.m139a("Log.public.info", (C0685f0) new C0607f());
        C0578a.m139a("Log.private.info", (C0685f0) new C0608g());
        C0578a.m139a("Log.public.warning", (C0685f0) new C0609h());
        C0578a.m139a("Log.private.warning", (C0685f0) new C0610i());
        C0578a.m139a("Log.public.error", (C0685f0) new C0611j());
        C0578a.m139a("Log.private.error", (C0685f0) new C0602a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9486a(C0897z0 z0Var, int i) {
        int d = C0894y.m1163d(z0Var, "send_level");
        if (z0Var.mo10070c() == 0) {
            d = f270n;
        }
        return d >= i && d != 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9485a(HashMap<String, Object> hashMap) {
        try {
            C0760n0 n0Var = new C0760n0(new C0896z(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
            this.f274d = n0Var;
            n0Var.mo9769a(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m243a(int i, String str, int i2) {
        if (this.f274d != null) {
            if (i2 == 3 && mo9486a(C0894y.m1167f(this.f271a, Integer.toString(i)), 3)) {
                this.f274d.mo9772a(str);
            } else if (i2 == 2 && mo9486a(C0894y.m1167f(this.f271a, Integer.toString(i)), 2)) {
                this.f274d.mo9776c(str);
            } else if (i2 == 1 && mo9486a(C0894y.m1167f(this.f271a, Integer.toString(i)), 1)) {
                this.f274d.mo9777d(str);
            } else if (i2 == 0 && mo9486a(C0894y.m1167f(this.f271a, Integer.toString(i)), 0)) {
                this.f274d.mo9775b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0897z0 mo9483a(C0895y0 y0Var) {
        C0897z0 b = C0894y.m1151b();
        for (int i = 0; i < y0Var.mo10032c(); i++) {
            C0897z0 b2 = C0894y.m1152b(y0Var, i);
            C0894y.m1147a(b, Integer.toString(C0894y.m1163d(b2, "id")), b2);
        }
        return b;
    }

    /* renamed from: a */
    private boolean m245a(Runnable runnable) {
        try {
            ExecutorService executorService = this.f272b;
            if (executorService == null || executorService.isShutdown() || this.f272b.isTerminated()) {
                return false;
            }
            this.f272b.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0760n0 mo9482a() {
        return this.f274d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9490b(C0895y0 y0Var) {
        this.f271a = mo9483a(y0Var);
    }
}
