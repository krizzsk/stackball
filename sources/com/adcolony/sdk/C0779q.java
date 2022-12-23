package com.adcolony.sdk;

import com.adcolony.sdk.C0580a0;
import com.adcolony.sdk.C0774p;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.q */
class C0779q implements C0774p.C0775a {

    /* renamed from: a */
    private LinkedBlockingQueue<Runnable> f1285a = new LinkedBlockingQueue<>();

    /* renamed from: b */
    private int f1286b = 4;

    /* renamed from: c */
    private int f1287c = 16;

    /* renamed from: d */
    private double f1288d = 1.0d;

    /* renamed from: e */
    private ThreadPoolExecutor f1289e = new ThreadPoolExecutor(this.f1286b, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, this.f1285a);

    /* renamed from: com.adcolony.sdk.q$a */
    class C0780a implements C0685f0 {
        C0780a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0779q qVar = C0779q.this;
            qVar.mo9820a(new C0774p(d0Var, qVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$b */
    class C0781b implements C0685f0 {
        C0781b() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0779q qVar = C0779q.this;
            qVar.mo9820a(new C0774p(d0Var, qVar));
        }
    }

    /* renamed from: com.adcolony.sdk.q$c */
    class C0782c implements C0685f0 {
        C0782c() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0779q qVar = C0779q.this;
            qVar.mo9820a(new C0774p(d0Var, qVar));
        }
    }

    C0779q() {
    }

    /* renamed from: d */
    private void m734d() {
        int corePoolSize = this.f1289e.getCorePoolSize();
        int size = this.f1285a.size();
        int i = this.f1286b;
        if (((double) size) * this.f1288d > ((double) ((corePoolSize - i) + 1)) && corePoolSize < this.f1287c) {
            this.f1289e.setCorePoolSize(corePoolSize + 1);
        } else if (size == 0 && corePoolSize > i) {
            this.f1289e.setCorePoolSize(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9820a(C0774p pVar) {
        m734d();
        try {
            this.f1289e.execute(pVar);
        } catch (RejectedExecutionException unused) {
            C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("RejectedExecutionException: ThreadPoolExecutor unable to ");
            a.mo9419a("execute download for url " + pVar.f1274n).mo9421a(C0580a0.f192j);
            mo9627a(pVar, pVar.mo9811b(), (Map<String, List<String>>) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9822b(int i) {
        this.f1287c = i;
        int corePoolSize = this.f1289e.getCorePoolSize();
        int i2 = this.f1287c;
        if (corePoolSize > i2) {
            this.f1289e.setCorePoolSize(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9823c() {
        this.f1289e.allowCoreThreadTimeOut(true);
        C0578a.m139a("WebServices.download", (C0685f0) new C0780a());
        C0578a.m139a("WebServices.get", (C0685f0) new C0781b());
        C0578a.m139a("WebServices.post", (C0685f0) new C0782c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9821b() {
        return this.f1287c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9819a(int i) {
        this.f1286b = i;
        int corePoolSize = this.f1289e.getCorePoolSize();
        int i2 = this.f1286b;
        if (corePoolSize < i2) {
            this.f1289e.setCorePoolSize(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9817a() {
        return this.f1286b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9818a(double d) {
        this.f1288d = d;
    }

    /* renamed from: a */
    public void mo9627a(C0774p pVar, C0645d0 d0Var, Map<String, List<String>> map) {
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "url", pVar.f1274n);
        C0894y.m1158b(b, "success", pVar.f1276p);
        C0894y.m1156b(b, "status", pVar.f1278r);
        C0894y.m1148a(b, "body", pVar.f1275o);
        C0894y.m1156b(b, "size", pVar.f1277q);
        if (map != null) {
            C0897z0 b2 = C0894y.m1151b();
            for (Map.Entry next : map.entrySet()) {
                String obj = ((List) next.getValue()).toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (next.getKey() != null) {
                    C0894y.m1148a(b2, (String) next.getKey(), substring);
                }
            }
            C0894y.m1147a(b, "headers", b2);
        }
        d0Var.mo9530a(b).mo9536d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9824c(int i) {
        this.f1289e.setKeepAliveTime((long) i, TimeUnit.SECONDS);
    }
}
