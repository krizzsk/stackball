package com.adcolony.sdk;

import android.os.SystemClock;
import com.adcolony.sdk.C0580a0;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.adcolony.sdk.o0 */
class C0769o0 {

    /* renamed from: a */
    private long f1241a = TapjoyConstants.SESSION_ID_INACTIVITY_TIME;

    /* renamed from: b */
    private int f1242b;

    /* renamed from: c */
    private long f1243c;

    /* renamed from: d */
    private boolean f1244d = true;

    /* renamed from: e */
    private boolean f1245e = true;

    /* renamed from: f */
    private boolean f1246f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f1247g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f1248h = false;

    /* renamed from: i */
    private boolean f1249i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f1250j;

    /* renamed from: k */
    private boolean f1251k;

    /* renamed from: l */
    private C0776p0 f1252l;

    /* renamed from: com.adcolony.sdk.o0$a */
    class C0770a implements C0685f0 {
        C0770a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0769o0.this.f1250j = true;
        }
    }

    /* renamed from: com.adcolony.sdk.o0$b */
    class C0771b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0872w0 f1254a;

        /* renamed from: b */
        final /* synthetic */ C0693i f1255b;

        C0771b(C0872w0 w0Var, C0693i iVar) {
            this.f1254a = w0Var;
            this.f1255b = iVar;
        }

        public void run() {
            this.f1254a.mo9952F();
            this.f1255b.mo9616t().mo9491c();
        }
    }

    /* renamed from: com.adcolony.sdk.o0$c */
    class C0772c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f1257a;

        C0772c(boolean z) {
            this.f1257a = z;
        }

        public void run() {
            ArrayList<C0687g0> c = C0578a.m143c().mo9617u().mo9545c();
            synchronized (c) {
                Iterator<C0687g0> it = c.iterator();
                while (it.hasNext()) {
                    C0687g0 next = it.next();
                    C0897z0 b = C0894y.m1151b();
                    C0894y.m1158b(b, "from_window_focus", this.f1257a);
                    if (C0769o0.this.f1248h && !C0769o0.this.f1247g) {
                        C0894y.m1158b(b, "app_in_foreground", false);
                        boolean unused = C0769o0.this.f1248h = false;
                    }
                    new C0645d0("SessionInfo.on_pause", next.mo9562e(), b).mo9536d();
                }
            }
            C0578a.m147g();
        }
    }

    /* renamed from: com.adcolony.sdk.o0$d */
    class C0773d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f1259a;

        C0773d(boolean z) {
            this.f1259a = z;
        }

        public void run() {
            C0693i c = C0578a.m143c();
            ArrayList<C0687g0> c2 = c.mo9617u().mo9545c();
            synchronized (c2) {
                Iterator<C0687g0> it = c2.iterator();
                while (it.hasNext()) {
                    C0687g0 next = it.next();
                    C0897z0 b = C0894y.m1151b();
                    C0894y.m1158b(b, "from_window_focus", this.f1259a);
                    if (C0769o0.this.f1248h && C0769o0.this.f1247g) {
                        C0894y.m1158b(b, "app_in_foreground", true);
                        boolean unused = C0769o0.this.f1248h = false;
                    }
                    new C0645d0("SessionInfo.on_resume", next.mo9562e(), b).mo9536d();
                }
            }
            c.mo9616t().mo9491c();
        }
    }

    C0769o0() {
    }

    /* renamed from: j */
    private void m698j() {
        mo9792a(false);
    }

    /* renamed from: k */
    private void m699k() {
        mo9794b(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9796c(boolean z) {
        C0693i c = C0578a.m143c();
        if (!this.f1246f) {
            if (this.f1249i) {
                c.mo9596c(false);
                this.f1249i = false;
            }
            this.f1242b = 0;
            this.f1243c = SystemClock.uptimeMillis();
            this.f1244d = true;
            this.f1250j = false;
            this.f1246f = true;
            this.f1247g = true;
            this.f1248h = false;
            AdColony.m45d();
            if (z) {
                C0897z0 b = C0894y.m1151b();
                C0894y.m1148a(b, "id", C0849u0.m907a());
                new C0645d0("SessionInfo.on_start", 1, b).mo9536d();
                C0872w0 w0Var = (C0872w0) C0578a.m143c().mo9617u().mo9547d().get(1);
                if (w0Var != null && !AdColony.m40a((Runnable) new C0771b(w0Var, c))) {
                    new C0580a0.C0581a().mo9419a("RejectedExecutionException on controller update.").mo9421a(C0580a0.f192j);
                }
            }
            c.mo9617u().mo9550h();
            C0796s.m784b().mo9861c();
        }
    }

    /* renamed from: d */
    public void mo9797d() {
        C0578a.m139a("SessionInfo.stopped", (C0685f0) new C0770a());
        this.f1252l = new C0776p0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9800e() {
        return this.f1244d;
    }

    /* renamed from: f */
    public boolean mo9802f() {
        return this.f1245e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9803g(boolean z) {
        this.f1251k = z;
    }

    /* renamed from: h */
    public boolean mo9805h() {
        return this.f1250j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9806i() {
        return this.f1251k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo9807l() {
        C0760n0 a = C0578a.m143c().mo9616t().mo9482a();
        this.f1246f = false;
        this.f1244d = false;
        if (a != null) {
            a.mo9773b();
        }
        C0897z0 b = C0894y.m1151b();
        C0894y.m1145a(b, "session_length", ((double) (SystemClock.uptimeMillis() - this.f1243c)) / 1000.0d);
        new C0645d0("SessionInfo.on_stop", 1, b).mo9536d();
        C0578a.m147g();
        AdColony.m49h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9799e(boolean z) {
        if (this.f1247g != z) {
            this.f1247g = z;
            this.f1248h = true;
            if (!z) {
                m698j();
            }
        }
    }

    /* renamed from: f */
    public void mo9801f(boolean z) {
        this.f1249i = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9804g() {
        return this.f1246f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9792a(boolean z) {
        this.f1245e = true;
        this.f1252l.mo9813b();
        if (!AdColony.m40a((Runnable) new C0772c(z))) {
            new C0580a0.C0581a().mo9419a("RejectedExecutionException on session pause.").mo9421a(C0580a0.f192j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9794b(boolean z) {
        this.f1245e = false;
        this.f1252l.mo9814c();
        if (!AdColony.m40a((Runnable) new C0773d(z))) {
            new C0580a0.C0581a().mo9419a("RejectedExecutionException on session resume.").mo9421a(C0580a0.f192j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9798d(boolean z) {
        if (z && this.f1245e) {
            m699k();
        } else if (!z && !this.f1245e) {
            m698j();
        }
        this.f1244d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo9790a() {
        return this.f1241a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9791a(int i) {
        this.f1241a = i <= 0 ? this.f1241a : (long) (i * 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9793b() {
        return this.f1242b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9795c() {
        this.f1242b++;
    }
}
