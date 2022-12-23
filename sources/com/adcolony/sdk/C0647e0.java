package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0580a0;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.e0 */
class C0647e0 {

    /* renamed from: k */
    private static final int f358k = 17;

    /* renamed from: a */
    private final ArrayList<C0687g0> f359a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<Integer, C0687g0> f360b = new HashMap<>();

    /* renamed from: c */
    private int f361c = 2;

    /* renamed from: d */
    private final HashMap<String, ArrayList<C0685f0>> f362d = new HashMap<>();

    /* renamed from: e */
    private int f363e = 1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final LinkedBlockingQueue<C0897z0> f364f = new LinkedBlockingQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f365g = false;

    /* renamed from: h */
    private final ScheduledExecutorService f366h = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: i */
    private final ExecutorService f367i = Executors.newSingleThreadExecutor();

    /* renamed from: j */
    private ScheduledFuture<?> f368j;

    /* renamed from: com.adcolony.sdk.e0$a */
    class C0648a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f369a;

        C0648a(Context context) {
            this.f369a = context;
        }

        public void run() {
            C0897z0 b = C0578a.m143c().mo9620x().mo9271b();
            C0897z0 b2 = C0894y.m1151b();
            C0894y.m1148a(b, "os_name", "android");
            C0894y.m1148a(b2, "filepath", C0578a.m143c().mo9571C().mo9826a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            C0894y.m1147a(b2, TJAdUnitConstants.String.VIDEO_INFO, b);
            C0894y.m1156b(b2, "m_origin", 0);
            C0894y.m1156b(b2, "m_id", C0647e0.m335a(C0647e0.this));
            C0894y.m1148a(b2, "m_type", "Controller.create");
            try {
                new C0872w0(this.f369a, 1, false).mo9957a(true, new C0645d0(b2));
            } catch (RuntimeException e) {
                C0580a0.C0581a aVar = new C0580a0.C0581a();
                aVar.mo9419a(e.toString() + ": during WebView initialization.").mo9419a(" Disabling AdColony.").mo9421a(C0580a0.f191i);
                AdColony.disable();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.e0$b */
    class C0649b implements Runnable {
        C0649b() {
        }

        public void run() {
            while (true) {
                try {
                    C0897z0 z0Var = (C0897z0) C0647e0.this.f364f.poll(60, TimeUnit.SECONDS);
                    if (z0Var != null) {
                        C0647e0.this.m343b(z0Var);
                    } else {
                        synchronized (C0647e0.this.f364f) {
                            if (C0647e0.this.f364f.peek() == null) {
                                boolean unused = C0647e0.this.f365g = false;
                                return;
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    new C0580a0.C0581a().mo9419a("Native messages thread was interrupted: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.e0$c */
    class C0650c implements Runnable {
        C0650c() {
        }

        public void run() {
            C0578a.m147g();
            if (!C0647e0.this.mo9549f()) {
                C0647e0.this.mo9551i();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.e0$d */
    class C0651d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f373a;

        /* renamed from: b */
        final /* synthetic */ C0897z0 f374b;

        C0651d(String str, C0897z0 z0Var) {
            this.f373a = str;
            this.f374b = z0Var;
        }

        public void run() {
            C0647e0.this.m339a(this.f373a, this.f374b);
        }
    }

    C0647e0() {
    }

    /* renamed from: a */
    static /* synthetic */ int m335a(C0647e0 e0Var) {
        int i = e0Var.f363e;
        e0Var.f363e = i + 1;
        return i;
    }

    /* renamed from: g */
    private void m344g() {
        if (this.f368j == null) {
            try {
                this.f368j = this.f366h.scheduleAtFixedRate(new C0650c(), 0, 17, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C0580a0.C0581a().mo9419a("Error when scheduling message pumping").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9546c(C0897z0 z0Var) {
        try {
            if (z0Var.mo10072c("m_id", this.f363e)) {
                this.f363e++;
            }
            z0Var.mo10072c("m_origin", 0);
            int c = z0Var.mo10071c("m_target");
            if (c == 0) {
                m338a(z0Var);
                return;
            }
            C0687g0 g0Var = this.f360b.get(Integer.valueOf(c));
            if (g0Var != null) {
                g0Var.mo9557a(z0Var);
            }
        } catch (JSONException e) {
            new C0580a0.C0581a().mo9419a("JSON error in ADCMessageDispatcher's sendMessage(): ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public HashMap<Integer, C0687g0> mo9547d() {
        return this.f360b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo9548e() {
        int i = this.f361c;
        this.f361c = i + 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo9549f() {
        Iterator<C0687g0> it = this.f359a.iterator();
        while (it.hasNext()) {
            if (it.next().mo9558a()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9550h() {
        if (mo9549f()) {
            m344g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9551i() {
        ScheduledFuture<?> scheduledFuture = this.f368j;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f368j.cancel(false);
            }
            this.f368j = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9552j() {
        synchronized (this.f359a) {
            for (int size = this.f359a.size() - 1; size >= 0; size--) {
                this.f359a.get(size).mo9559b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9544b(String str, C0685f0 f0Var) {
        synchronized (this.f362d) {
            ArrayList arrayList = this.f362d.get(str);
            if (arrayList != null) {
                arrayList.remove(f0Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9543a(String str, C0685f0 f0Var) {
        ArrayList arrayList = this.f362d.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f362d.put(str, arrayList);
        }
        arrayList.add(f0Var);
    }

    /* renamed from: b */
    private void m342b() {
        if (!this.f365g) {
            synchronized (this.f364f) {
                if (!this.f365g) {
                    this.f365g = true;
                    new Thread(new C0649b()).start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9542a() {
        Context b;
        C0693i c = C0578a.m143c();
        if (!c.mo9576H() && !c.mo9577I() && (b = C0578a.m141b()) != null) {
            m342b();
            C0849u0.m931b((Runnable) new C0648a(b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<C0687g0> mo9545c() {
        return this.f359a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0687g0 mo9541a(C0687g0 g0Var) {
        synchronized (this.f359a) {
            int d = g0Var.mo9561d();
            if (d <= 0) {
                d = g0Var.mo9562e();
            }
            this.f359a.add(g0Var);
            this.f360b.put(Integer.valueOf(d), g0Var);
            mo9550h();
        }
        return g0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0687g0 mo9540a(int i) {
        synchronized (this.f359a) {
            C0687g0 g0Var = this.f360b.get(Integer.valueOf(i));
            if (g0Var == null) {
                return null;
            }
            this.f359a.remove(g0Var);
            this.f360b.remove(Integer.valueOf(i));
            g0Var.mo9560c();
            return g0Var;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m343b(C0897z0 z0Var) {
        try {
            String g = z0Var.mo10078g("m_type");
            int c = z0Var.mo10071c("m_origin");
            C0651d dVar = new C0651d(g, z0Var);
            if (c >= 2) {
                C0849u0.m931b((Runnable) dVar);
            } else {
                this.f367i.execute(dVar);
            }
        } catch (RejectedExecutionException e) {
            new C0580a0.C0581a().mo9419a("RejectedExecutionException from message dispatcher's dispatchNativeMessage(): ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
        } catch (JSONException e2) {
            new C0580a0.C0581a().mo9419a("JSON error from message dispatcher's dispatchNativeMessage(): ").mo9419a(e2.toString()).mo9421a(C0580a0.f192j);
        }
    }

    /* renamed from: a */
    private void m338a(C0897z0 z0Var) {
        m342b();
        this.f364f.add(z0Var);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r4.hasNext() == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        ((com.adcolony.sdk.C0685f0) r4.next()).mo9426a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        new com.adcolony.sdk.C0580a0.C0581a().mo9418a((java.lang.Object) r3).mo9421a(com.adcolony.sdk.C0580a0.f192j);
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r3 = new com.adcolony.sdk.C0645d0(r4);
        r4 = r1.iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m339a(java.lang.String r3, com.adcolony.sdk.C0897z0 r4) {
        /*
            r2 = this;
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.adcolony.sdk.f0>> r0 = r2.f362d
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.adcolony.sdk.f0>> r1 = r2.f362d     // Catch:{ all -> 0x0041 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0041 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0041 }
            if (r3 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x000f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0041 }
            r1.<init>(r3)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            com.adcolony.sdk.d0 r3 = new com.adcolony.sdk.d0
            r3.<init>(r4)
            java.util.Iterator r4 = r1.iterator()
        L_0x001e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r4.next()
            com.adcolony.sdk.f0 r0 = (com.adcolony.sdk.C0685f0) r0
            r0.mo9426a(r3)     // Catch:{ RuntimeException -> 0x002e }
            goto L_0x001e
        L_0x002e:
            r3 = move-exception
            com.adcolony.sdk.a0$a r4 = new com.adcolony.sdk.a0$a
            r4.<init>()
            com.adcolony.sdk.a0$a r4 = r4.mo9418a((java.lang.Object) r3)
            com.adcolony.sdk.a0 r0 = com.adcolony.sdk.C0580a0.f192j
            r4.mo9421a((com.adcolony.sdk.C0580a0) r0)
            r3.printStackTrace()
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0647e0.m339a(java.lang.String, com.adcolony.sdk.z0):void");
    }
}
