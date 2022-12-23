package com.adcolony.sdk;

import android.util.Log;
import com.adcolony.sdk.C0587b0;
import com.appsflyer.ServerParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.n0 */
class C0760n0 {

    /* renamed from: h */
    static final String f1217h = "adcolony_android";

    /* renamed from: i */
    static final String f1218i = "adcolony_fatal_reports";

    /* renamed from: a */
    C0896z f1219a;

    /* renamed from: b */
    ScheduledExecutorService f1220b;

    /* renamed from: c */
    List<C0587b0> f1221c = new ArrayList();

    /* renamed from: d */
    List<C0587b0> f1222d = new ArrayList();

    /* renamed from: e */
    HashMap<String, Object> f1223e;

    /* renamed from: f */
    private C0892x f1224f = new C0892x(f1217h, "4.6.5", "Production");

    /* renamed from: g */
    private C0892x f1225g = new C0892x(f1218i, "4.6.5", "Production");

    /* renamed from: com.adcolony.sdk.n0$a */
    class C0761a implements Runnable {
        C0761a() {
        }

        public void run() {
            C0760n0.this.mo9768a();
        }
    }

    /* renamed from: com.adcolony.sdk.n0$b */
    class C0762b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0587b0 f1227a;

        C0762b(C0587b0 b0Var) {
            this.f1227a = b0Var;
        }

        public void run() {
            C0760n0.this.f1221c.add(this.f1227a);
        }
    }

    C0760n0(C0896z zVar, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.f1219a = zVar;
        this.f1220b = scheduledExecutorService;
        this.f1223e = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo9769a(long j, TimeUnit timeUnit) {
        try {
            if (!this.f1220b.isShutdown() && !this.f1220b.isTerminated()) {
                this.f1220b.scheduleAtFixedRate(new C0761a(), j, j, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f1220b.shutdownNow();
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo9773b() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.ScheduledExecutorService r0 = r4.f1220b     // Catch:{ all -> 0x004c }
            r0.shutdown()     // Catch:{ all -> 0x004c }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f1220b     // Catch:{ InterruptedException -> 0x003e }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x003e }
            r2 = 1
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003e }
            if (r0 != 0) goto L_0x004a
            java.util.concurrent.ScheduledExecutorService r0 = r4.f1220b     // Catch:{ InterruptedException -> 0x003e }
            r0.shutdownNow()     // Catch:{ InterruptedException -> 0x003e }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f1220b     // Catch:{ InterruptedException -> 0x003e }
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003e }
            if (r0 != 0) goto L_0x004a
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ InterruptedException -> 0x003e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x003e }
            r1.<init>()     // Catch:{ InterruptedException -> 0x003e }
            java.lang.Class r2 = r4.getClass()     // Catch:{ InterruptedException -> 0x003e }
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ InterruptedException -> 0x003e }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003e }
            java.lang.String r2 = ": ScheduledExecutorService did not terminate"
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003e }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x003e }
            r0.println(r1)     // Catch:{ InterruptedException -> 0x003e }
            goto L_0x004a
        L_0x003e:
            java.util.concurrent.ScheduledExecutorService r0 = r4.f1220b     // Catch:{ all -> 0x004c }
            r0.shutdownNow()     // Catch:{ all -> 0x004c }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004c }
            r0.interrupt()     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r4)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0760n0.mo9773b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo9776c(String str) {
        mo9774b(new C0587b0.C0588a().mo9435a(2).mo9436a(this.f1224f).mo9437a(str).mo9439a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo9777d(String str) {
        mo9774b(new C0587b0.C0588a().mo9435a(1).mo9436a(this.f1224f).mo9437a(str).mo9439a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo9778e(String str) {
        this.f1223e.put("controllerVersion", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo9779f(String str) {
        this.f1223e.put("sessionId", str);
    }

    /* renamed from: c */
    private synchronized C0897z0 m670c(C0587b0 b0Var) throws JSONException {
        C0897z0 z0Var;
        z0Var = new C0897z0((Map<?, ?>) this.f1223e);
        z0Var.mo10067b("environment", b0Var.mo9427a().mo10007a());
        z0Var.mo10067b("level", b0Var.mo9431c());
        z0Var.mo10067b("message", b0Var.mo9432d());
        z0Var.mo10067b("clientTimestamp", b0Var.mo9433e());
        C0897z0 z0Var2 = new C0897z0(C0578a.m143c().mo9620x().getMediationInfo());
        C0897z0 z0Var3 = new C0897z0(C0578a.m143c().mo9620x().getPluginInfo());
        double h = C0578a.m143c().mo9611o().mo9743h();
        z0Var.mo10067b("mediation_network", C0894y.m1169h(z0Var2, "name"));
        z0Var.mo10067b("mediation_network_version", C0894y.m1169h(z0Var2, "version"));
        z0Var.mo10067b(TapjoyConstants.TJC_PLUGIN, C0894y.m1169h(z0Var3, "name"));
        z0Var.mo10067b("plugin_version", C0894y.m1169h(z0Var3, "version"));
        z0Var.mo10064b("batteryInfo", h);
        if (b0Var instanceof C0817t) {
            z0Var = C0894y.m1141a(z0Var, ((C0817t) b0Var).mo9879f());
        }
        return z0Var;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9768a() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.adcolony.sdk.b0> r0 = r2.f1221c     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            if (r0 <= 0) goto L_0x001b
            com.adcolony.sdk.x r0 = r2.f1224f     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            java.util.List<com.adcolony.sdk.b0> r1 = r2.f1221c     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            java.lang.String r0 = r2.mo9767a((com.adcolony.sdk.C0892x) r0, (java.util.List<com.adcolony.sdk.C0587b0>) r1)     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            com.adcolony.sdk.z r1 = r2.f1219a     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            r1.mo10052a(r0)     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            java.util.List<com.adcolony.sdk.b0> r0 = r2.f1221c     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            r0.clear()     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
        L_0x001b:
            java.util.List<com.adcolony.sdk.b0> r0 = r2.f1222d     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            if (r0 <= 0) goto L_0x0043
            com.adcolony.sdk.x r0 = r2.f1225g     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            java.util.List<com.adcolony.sdk.b0> r1 = r2.f1222d     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            java.lang.String r0 = r2.mo9767a((com.adcolony.sdk.C0892x) r0, (java.util.List<com.adcolony.sdk.C0587b0>) r1)     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            com.adcolony.sdk.z r1 = r2.f1219a     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            r1.mo10052a(r0)     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            java.util.List<com.adcolony.sdk.b0> r0 = r2.f1222d     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            r0.clear()     // Catch:{ IOException -> 0x003e, JSONException -> 0x0038 }
            goto L_0x0043
        L_0x0036:
            r0 = move-exception
            goto L_0x0045
        L_0x0038:
            java.util.List<com.adcolony.sdk.b0> r0 = r2.f1221c     // Catch:{ all -> 0x0036 }
            r0.clear()     // Catch:{ all -> 0x0036 }
            goto L_0x0043
        L_0x003e:
            java.util.List<com.adcolony.sdk.b0> r0 = r2.f1221c     // Catch:{ all -> 0x0036 }
            r0.clear()     // Catch:{ all -> 0x0036 }
        L_0x0043:
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            return
        L_0x0045:
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0760n0.mo9768a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo9775b(String str) {
        mo9774b(new C0587b0.C0588a().mo9435a(0).mo9436a(this.f1224f).mo9437a(str).mo9439a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo9774b(C0587b0 b0Var) {
        try {
            if (!this.f1220b.isShutdown() && !this.f1220b.isTerminated()) {
                this.f1220b.submit(new C0762b(b0Var));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo9772a(String str) {
        mo9774b(new C0587b0.C0588a().mo9435a(3).mo9436a(this.f1224f).mo9437a(str).mo9439a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9771a(C0817t tVar) {
        tVar.mo9429a(this.f1225g);
        tVar.mo9428a(-1);
        mo9770a((C0587b0) tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo9770a(C0587b0 b0Var) {
        this.f1222d.add(b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9767a(C0892x xVar, List<C0587b0> list) throws IOException, JSONException {
        String c = C0578a.m143c().mo9611o().mo9738c();
        String str = this.f1223e.get(ServerParameters.ADVERTISING_ID_PARAM) != null ? (String) this.f1223e.get(ServerParameters.ADVERTISING_ID_PARAM) : "unknown";
        if (c != null && c.length() > 0 && !c.equals(str)) {
            this.f1223e.put(ServerParameters.ADVERTISING_ID_PARAM, c);
        }
        C0897z0 z0Var = new C0897z0();
        z0Var.mo10067b(FirebaseAnalytics.Param.INDEX, xVar.mo10009c());
        z0Var.mo10067b("environment", xVar.mo10007a());
        z0Var.mo10067b("version", xVar.mo10010d());
        C0895y0 y0Var = new C0895y0();
        for (C0587b0 c2 : list) {
            y0Var.mo10017a(m670c(c2));
        }
        z0Var.mo10056a("logs", y0Var);
        return z0Var.toString();
    }
}
