package com.adcolony.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.adcolony.sdk.C0580a0;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.h0 */
class C0689h0 {

    /* renamed from: d */
    private static final int f983d = 1000;

    /* renamed from: a */
    private ScheduledExecutorService f984a;

    /* renamed from: b */
    private ScheduledFuture<?> f985b;

    /* renamed from: c */
    private String f986c;

    /* renamed from: com.adcolony.sdk.h0$a */
    class C0690a implements C0685f0 {
        C0690a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0689h0.this.m369c();
        }
    }

    /* renamed from: com.adcolony.sdk.h0$b */
    class C0691b implements C0685f0 {
        C0691b() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0689h0.this.m372f();
        }
    }

    /* renamed from: com.adcolony.sdk.h0$c */
    class C0692c implements Runnable {
        C0692c() {
        }

        public void run() {
            C0689h0.this.m371d();
        }
    }

    C0689h0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m371d() {
        String e = mo9567e();
        if (!e.equals(this.f986c)) {
            this.f986c = e;
            C0897z0 b = C0894y.m1151b();
            C0894y.m1148a(b, "network_type", e);
            new C0645d0("Network.on_status_change", 1, b).mo9536d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m372f() {
        ScheduledFuture<?> scheduledFuture = this.f985b;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f985b.cancel(false);
            }
            this.f985b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo9567e() {
        return m366a();
    }

    /* renamed from: a */
    private String m366a() {
        NetworkInfo networkInfo;
        Context b = C0578a.m141b();
        if (b == null) {
            return "none";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) b.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                networkInfo = null;
            } else {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo == null) {
                return "none";
            }
            int type = networkInfo.getType();
            if (type == 1) {
                return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
            }
            if (type == 0) {
                return "cell";
            }
            if (type >= 2) {
                return "cell";
            }
            return "none";
        } catch (SecurityException e) {
            new C0580a0.C0581a().mo9419a("SecurityException - please ensure you added the ").mo9419a("ACCESS_NETWORK_STATE permission: ").mo9419a(e.toString()).mo9421a(C0580a0.f191i);
            return "none";
        } catch (Exception e2) {
            new C0580a0.C0581a().mo9419a("Exception occurred when retrieving activeNetworkInfo in ").mo9419a("ADCNetwork.getConnectivityStatus(): ").mo9419a(e2.toString()).mo9421a(C0580a0.f192j);
            return "none";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m369c() {
        if (this.f984a == null) {
            this.f984a = Executors.newSingleThreadScheduledExecutor();
        }
        if (this.f985b == null) {
            try {
                this.f985b = this.f984a.scheduleAtFixedRate(new C0692c(), 0, 1000, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C0580a0.C0581a().mo9419a("Error when scheduling network checks: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            }
            m371d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9566b() {
        this.f986c = mo9567e();
        C0578a.m139a("Network.start_notifications", (C0685f0) new C0690a());
        C0578a.m139a("Network.stop_notifications", (C0685f0) new C0691b());
    }
}
