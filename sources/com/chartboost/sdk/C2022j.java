package com.chartboost.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.webkit.WebSettings;
import com.appsflyer.internal.referrer.Payload;
import com.chartboost.sdk.Banner.C1812a;
import com.chartboost.sdk.Libraries.C1823d;
import com.chartboost.sdk.Libraries.C1825e;
import com.chartboost.sdk.Libraries.C1828g;
import com.chartboost.sdk.Libraries.C1832j;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Model.C1844h;
import com.chartboost.sdk.Model.C1847i;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.C1855g;
import com.chartboost.sdk.Networking.C1856h;
import com.chartboost.sdk.Networking.C1857i;
import com.chartboost.sdk.Networking.C1860j;
import com.chartboost.sdk.Networking.C1863m;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1872c;
import com.chartboost.sdk.Tracking.C1873d;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.Tracking.C1876g;
import com.chartboost.sdk.impl.C1894a;
import com.chartboost.sdk.impl.C1897a1;
import com.chartboost.sdk.impl.C1900b1;
import com.chartboost.sdk.impl.C1903c1;
import com.chartboost.sdk.impl.C1904d;
import com.chartboost.sdk.impl.C1906d1;
import com.chartboost.sdk.impl.C1912f1;
import com.chartboost.sdk.impl.C1913g;
import com.chartboost.sdk.impl.C1950m1;
import com.chartboost.sdk.impl.C1952n;
import com.chartboost.sdk.impl.C1956o;
import com.chartboost.sdk.impl.C1965p0;
import com.chartboost.sdk.impl.C1995w0;
import com.chartboost.sdk.impl.C2014x;
import com.chartboost.sdk.impl.C2015x0;
import com.chartboost.sdk.impl.C2019y0;
import com.chartboost.sdk.impl.C2021z0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.j */
public class C2022j {

    /* renamed from: G */
    private static C2022j f5203G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static C1995w0 f5204H;

    /* renamed from: A */
    public final AtomicReference<C1844h> f5205A;

    /* renamed from: B */
    public final Handler f5206B;

    /* renamed from: C */
    public final C1883d f5207C;

    /* renamed from: D */
    public final C1857i f5208D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public Runnable f5209E;

    /* renamed from: F */
    private final C1965p0.C1966a f5210F = new C2023a();

    /* renamed from: a */
    private final C2014x f5211a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f5212b;

    /* renamed from: c */
    final C1828g f5213c;

    /* renamed from: d */
    final C1856h f5214d;

    /* renamed from: e */
    final C1832j f5215e;

    /* renamed from: f */
    final C1885e f5216f;

    /* renamed from: g */
    final C1860j f5217g;

    /* renamed from: h */
    final C1952n f5218h;

    /* renamed from: i */
    final C1876g f5219i;

    /* renamed from: j */
    final C1874e f5220j;

    /* renamed from: k */
    final C1912f1 f5221k;

    /* renamed from: l */
    public C1881b f5222l = new C1881b();

    /* renamed from: m */
    final SharedPreferences f5223m;

    /* renamed from: n */
    public C1956o f5224n;

    /* renamed from: o */
    boolean f5225o = false;

    /* renamed from: p */
    boolean f5226p = true;

    /* renamed from: q */
    public final Executor f5227q;

    /* renamed from: r */
    public final C1823d f5228r;

    /* renamed from: s */
    public final C1913g f5229s;

    /* renamed from: t */
    public final C1894a f5230t;

    /* renamed from: u */
    public final C1913g f5231u;

    /* renamed from: v */
    public final C1894a f5232v;

    /* renamed from: w */
    public final C1855g f5233w;

    /* renamed from: x */
    public final C1842g f5234x;

    /* renamed from: y */
    public final C1913g f5235y;

    /* renamed from: z */
    public final C1894a f5236z;

    /* renamed from: com.chartboost.sdk.j$a */
    class C2023a implements C1965p0.C1966a {
        C2023a() {
        }

        /* renamed from: a */
        public void mo14615a(C1965p0 p0Var, JSONObject jSONObject) {
            C2022j jVar = C2022j.this;
            jVar.mo14897a(jVar.f5209E, jSONObject);
        }

        /* renamed from: a */
        public void mo14614a(C1965p0 p0Var, CBError cBError) {
            C1874e.m4311e(new C1872c("config_request_error", cBError != null ? cBError.getErrorDesc() : "Config failure", "", ""));
            C2022j jVar = C2022j.this;
            jVar.mo14896a(jVar.f5209E);
        }
    }

    /* renamed from: com.chartboost.sdk.j$b */
    public class C2024b implements Runnable {

        /* renamed from: a */
        final int f5238a;

        /* renamed from: b */
        String f5239b = null;

        /* renamed from: c */
        boolean f5240c = false;

        /* renamed from: d */
        boolean f5241d = false;

        /* renamed from: e */
        ChartboostBanner f5242e = null;

        /* renamed from: com.chartboost.sdk.j$b$a */
        class C2025a implements C1965p0.C1966a {
            C2025a(C2024b bVar) {
            }

            /* renamed from: a */
            public void mo14614a(C1965p0 p0Var, CBError cBError) {
                C1874e.m4311e(new C1872c("install_request_error", cBError != null ? cBError.getErrorDesc() : "Install failure", "", ""));
            }

            /* renamed from: a */
            public void mo14615a(C1965p0 p0Var, JSONObject jSONObject) {
            }
        }

        C2024b(int i) {
            this.f5238a = i;
        }

        /* renamed from: a */
        private void m4983a() {
            String c;
            AtomicReference<C1844h> atomicReference = C2022j.this.f5205A;
            if (atomicReference != null && atomicReference.get() != null && (c = C2022j.this.f5205A.get().mo14319c()) != null) {
                CBLogging.m3997e("Sdk", c);
            }
        }

        /* renamed from: b */
        private void m4984b() {
            C1892h a = C1892h.m4431a();
            Context b = C2022j.this.f5212b;
            C1904d a2 = C1904d.m4478a(this.f5242e);
            C2022j jVar = C2022j.this;
            C2022j jVar2 = jVar;
            C1812a aVar = r2;
            C1812a aVar2 = new C1812a(b, a2, (ScheduledExecutorService) jVar.f5227q, jVar.f5218h, jVar.f5213c, jVar.f5233w, jVar.f5214d, jVar.f5234x, jVar.f5205A, jVar.f5223m, jVar.f5215e, jVar.f5206B, jVar2.f5207C, jVar2.f5208D, jVar2.f5216f, jVar2.f5217g, jVar2.f5219i);
            C1812a aVar3 = (C1812a) a.mo14549a(aVar);
            aVar3.mo14136a(this.f5242e);
            Executor executor = C2022j.this.f5227q;
            aVar3.getClass();
            executor.execute(new C1913g.C1915b(0, (String) null, (C1920h) null, (CBError.CBImpressionError) null));
            C2022j.this.f5222l.mo14477a(this.f5242e.getLocation(), aVar3);
        }

        /* renamed from: c */
        private void m4985c() {
            C1956o oVar = C2022j.this.f5224n;
            if (oVar != null) {
                oVar.mo14719b();
            }
        }

        /* renamed from: d */
        private void m4986d() {
            m4985c();
        }

        public void run() {
            try {
                switch (this.f5238a) {
                    case 1:
                        C2026k.f5257n = this.f5240c;
                        return;
                    case 2:
                        C2026k.f5259p = this.f5241d;
                        if (!this.f5241d || !C2022j.m4962l()) {
                            C2022j.this.f5224n.mo14718a();
                            return;
                        } else {
                            C2022j.this.f5224n.mo14719b();
                            return;
                        }
                    case 3:
                        m4983a();
                        if (!(C2022j.f5204H == null || C2022j.this.f5205A == null || C2022j.this.f5205A.get() == null)) {
                            C2022j.f5204H.mo14856a(C2022j.this.f5205A.get().f4545z);
                        }
                        C1965p0 p0Var = new C1965p0("https://live.chartboost.com", "/api/install", C2022j.this.f5234x, 2, new C2025a(this));
                        p0Var.f5055m = true;
                        C2022j.this.f5233w.mo14335a(p0Var);
                        Executor executor = C2022j.this.f5227q;
                        C1913g gVar = C2022j.this.f5229s;
                        gVar.getClass();
                        executor.execute(new C1913g.C1915b(0, (String) null, (C1920h) null, (CBError.CBImpressionError) null));
                        Executor executor2 = C2022j.this.f5227q;
                        C1913g gVar2 = C2022j.this.f5231u;
                        gVar2.getClass();
                        executor2.execute(new C1913g.C1915b(0, (String) null, (C1920h) null, (CBError.CBImpressionError) null));
                        Executor executor3 = C2022j.this.f5227q;
                        C1913g gVar3 = C2022j.this.f5235y;
                        gVar3.getClass();
                        executor3.execute(new C1913g.C1915b(0, (String) null, (C1920h) null, (CBError.CBImpressionError) null));
                        m4986d();
                        C2022j.this.f5226p = false;
                        return;
                    case 4:
                        C2022j.this.f5224n.mo14719b();
                        return;
                    case 5:
                        if (C2026k.f5247d != null) {
                            C2026k.f5247d.didFailToLoadMoreApps(this.f5239b, CBError.CBImpressionError.END_POINT_DISABLED);
                            return;
                        }
                        return;
                    case 6:
                        m4984b();
                        return;
                    default:
                        return;
                }
            } catch (Exception e) {
                CBLogging.m3993b("Sdk", "Sdk command: " + this.f5238a + " : " + e.toString());
            }
            CBLogging.m3993b("Sdk", "Sdk command: " + this.f5238a + " : " + e.toString());
        }
    }

    C2022j(Context context, String str, String str2, C2014x xVar, ScheduledExecutorService scheduledExecutorService, Handler handler, Executor executor) {
        JSONObject jSONObject;
        Context context2 = context;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        Handler handler2 = handler;
        C1892h a = C1892h.m4431a();
        this.f5212b = context2;
        this.f5228r = (C1823d) a.mo14549a(new C1823d());
        this.f5214d = (C1856h) a.mo14549a(new C1856h(context2));
        this.f5215e = (C1832j) a.mo14549a(new C1832j());
        this.f5233w = (C1855g) a.mo14549a(new C1855g(scheduledExecutorService, (C1863m) a.mo14549a(new C1863m()), this.f5214d, this.f5215e, handler, executor));
        SharedPreferences b = m4953b(context);
        this.f5219i = (C1876g) a.mo14549a(new C1876g(b));
        try {
            jSONObject = new JSONObject(b.getString("config", "{}"));
        } catch (Exception e) {
            CBLogging.m3993b("Sdk", "Unable to process config");
            e.printStackTrace();
            jSONObject = new JSONObject();
        }
        AtomicReference<C1844h> atomicReference = new AtomicReference<>((Object) null);
        if (!C1882c.m4360a(atomicReference, jSONObject)) {
            atomicReference.set(new C1844h(new JSONObject()));
        }
        C1844h hVar = atomicReference.get();
        hVar = hVar == null ? new C1844h(new JSONObject()) : hVar;
        this.f5211a = xVar;
        this.f5227q = scheduledExecutorService2;
        this.f5205A = atomicReference;
        this.f5223m = b;
        this.f5206B = handler2;
        this.f5213c = new C1828g(context2, atomicReference);
        if (!hVar.f4536q) {
            C2026k.f5260q = "";
        } else {
            m4958c(context);
        }
        this.f5221k = (C1912f1) a.mo14549a(new C1912f1());
        C1995w0 w0Var = (C1995w0) a.mo14549a(m4948a(context));
        f5204H = w0Var;
        w0Var.mo14856a(hVar.f4545z);
        C1823d dVar = this.f5228r;
        C1856h hVar2 = this.f5214d;
        C1832j jVar = this.f5215e;
        C1912f1 f1Var = this.f5221k;
        C1912f1 f1Var2 = f1Var;
        AtomicReference<C1844h> atomicReference2 = atomicReference;
        C1832j jVar2 = jVar;
        C1844h hVar3 = hVar;
        C1842g gVar = r8;
        C1842g gVar2 = new C1842g(context, str, dVar, hVar2, atomicReference2, b, jVar2, f1Var2, this.f5219i, f5204H);
        this.f5234x = (C1842g) a.mo14549a(gVar);
        this.f5218h = (C1952n) a.mo14549a(new C1952n(scheduledExecutorService, this.f5213c, this.f5233w, this.f5214d, atomicReference2, this.f5215e));
        this.f5216f = (C1885e) a.mo14549a(new C1885e((C1950m1) C1892h.m4431a().mo14549a(new C1950m1(handler2)), this.f5218h, atomicReference, handler2));
        this.f5208D = (C1857i) a.mo14549a(new C1857i(scheduledExecutorService2, this.f5233w, this.f5214d, handler2));
        C1844h hVar4 = hVar3;
        SharedPreferences sharedPreferences = b;
        C1892h hVar5 = a;
        this.f5207C = (C1883d) hVar5.mo14549a(new C1883d(context, this.f5214d, this, handler, this.f5216f));
        this.f5217g = (C1860j) hVar5.mo14549a(new C1860j(this.f5213c));
        this.f5230t = C1894a.m4439b();
        this.f5232v = C1894a.m4440c();
        this.f5236z = C1894a.m4441d();
        Context context3 = context;
        C1892h hVar6 = hVar5;
        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService;
        AtomicReference<C1844h> atomicReference3 = atomicReference;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        Handler handler3 = handler;
        this.f5229s = (C1913g) hVar6.mo14549a(new C1913g(context3, this.f5230t, scheduledExecutorService3, this.f5218h, this.f5213c, this.f5233w, this.f5214d, this.f5234x, atomicReference3, sharedPreferences2, this.f5215e, handler3, this.f5207C, this.f5208D, this.f5216f, this.f5217g, this.f5219i));
        this.f5231u = (C1913g) hVar6.mo14549a(new C1913g(context3, this.f5232v, scheduledExecutorService3, this.f5218h, this.f5213c, this.f5233w, this.f5214d, this.f5234x, atomicReference3, sharedPreferences2, this.f5215e, handler3, this.f5207C, this.f5208D, this.f5216f, this.f5217g, this.f5219i));
        this.f5235y = (C1913g) hVar6.mo14549a(new C1913g(context3, this.f5236z, scheduledExecutorService3, this.f5218h, this.f5213c, this.f5233w, this.f5214d, this.f5234x, atomicReference3, sharedPreferences2, this.f5215e, handler3, this.f5207C, this.f5208D, this.f5216f, this.f5217g, this.f5219i));
        this.f5224n = (C1956o) hVar6.mo14549a(new C1956o(this.f5218h, this.f5213c, this.f5233w, this.f5234x, atomicReference));
        C2026k.f5253j = str;
        C2026k.f5254k = str2;
        C1847i d = hVar4.mo14320d();
        this.f5220j = (C1874e) hVar6.mo14549a(new C1874e(context, (C1873d) hVar6.mo14549a(new C1873d(d.mo14326b(), d.mo14327c())), this.f5233w, this.f5234x, scheduledExecutorService, d));
    }

    /* renamed from: c */
    public static void m4959c(C2022j jVar) {
        f5203G = jVar;
    }

    /* renamed from: d */
    private void m4960d(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: l */
    public static boolean m4962l() {
        C2022j b = m4955b();
        if (b == null || !b.mo14905j().mo14318b()) {
            return true;
        }
        try {
            throw new Exception("Chartboost Integration Warning: your account has been disabled for this session. This app has no active publishing campaigns, please create a publishing campaign in the Chartboost dashboard and wait at least 30 minutes to re-enable. If you need assistance, please visit http://chartboo.st/publishing .");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: n */
    private void m4963n() {
        if (!this.f5225o) {
            C1880a aVar = C2026k.f5247d;
            if (aVar != null) {
                aVar.didInitialize();
            }
            this.f5225o = true;
        }
    }

    /* renamed from: p */
    private void m4964p() {
        C1876g gVar = this.f5219i;
        if (gVar != null && !this.f5225o) {
            gVar.mo14446a();
            CBLogging.m3995c("Sdk", "Current session count: " + this.f5219i.mo14449c());
        }
    }

    /* renamed from: q */
    private void m4965q() {
        C1847i d;
        C1844h j = mo14905j();
        if (this.f5220j != null && j != null && (d = j.mo14320d()) != null) {
            this.f5220j.mo14442a(d);
        }
    }

    /* renamed from: e */
    public C1874e mo14900e() {
        return this.f5220j;
    }

    /* renamed from: f */
    public C1913g mo14901f() {
        return this.f5231u;
    }

    /* renamed from: g */
    public C1894a mo14902g() {
        return this.f5232v;
    }

    /* renamed from: h */
    public C1913g mo14903h() {
        return this.f5235y;
    }

    /* renamed from: i */
    public C1894a mo14904i() {
        return this.f5236z;
    }

    /* renamed from: j */
    public C1844h mo14905j() {
        return this.f5205A.get();
    }

    /* renamed from: k */
    public Handler mo14906k() {
        return this.f5206B;
    }

    /* renamed from: m */
    public boolean mo14907m() {
        return this.f5225o;
    }

    /* renamed from: o */
    public void mo14908o() {
        this.f5218h.mo14711c();
    }

    /* renamed from: b */
    public static C2022j m4955b() {
        return f5203G;
    }

    /* renamed from: e */
    public static void m4961e(Runnable runnable) {
        C2014x b = C2014x.m4911b();
        if (!b.mo14885c()) {
            b.f5197a.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14898c(Runnable runnable) {
        this.f5209E = runnable;
        C1965p0 p0Var = new C1965p0("https://live.chartboost.com", "/api/config", this.f5234x, 1, this.f5210F);
        p0Var.f5055m = true;
        this.f5233w.mo14335a(p0Var);
    }

    /* renamed from: d */
    public Context mo14899d() {
        return this.f5212b;
    }

    /* renamed from: b */
    private static SharedPreferences m4953b(Context context) {
        return context.getSharedPreferences("cbPrefs", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14895a(Activity activity) {
        if (this.f5211a.mo14883a(23)) {
            C1882c.m4362b(activity);
        }
        if (!this.f5226p && !this.f5207C.mo14498g()) {
            this.f5218h.mo14710b();
        }
    }

    /* renamed from: b */
    private void m4956b(Runnable runnable) {
        m4965q();
        m4960d(runnable);
        m4964p();
        m4963n();
    }

    /* renamed from: b */
    static DataUseConsent m4954b(Context context, String str) {
        return m4948a(context).mo14859b(str);
    }

    /* renamed from: c */
    public static C1881b m4957c() {
        C2022j b = m4955b();
        if (b != null) {
            return b.f5222l;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14897a(Runnable runnable, JSONObject jSONObject) {
        m4951a(C1825e.m4024a(jSONObject, Payload.RESPONSE));
        m4956b(runnable);
    }

    /* renamed from: c */
    public static void m4958c(Context context) {
        String property = System.getProperty("http.agent");
        try {
            property = WebSettings.getDefaultUserAgent(context);
        } catch (Exception e) {
            try {
                C1874e.m4311e(new C1872c("user_agent_update_error", e.getMessage(), "", ""));
            } catch (Exception unused) {
            }
        }
        C2026k.f5260q = property;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14896a(Runnable runnable) {
        m4956b(runnable);
    }

    /* renamed from: a */
    private void m4951a(JSONObject jSONObject) {
        SharedPreferences.Editor edit;
        if (jSONObject != null && C1882c.m4360a(this.f5205A, jSONObject) && (edit = this.f5223m.edit()) != null) {
            edit.putString("config", jSONObject.toString()).apply();
        }
    }

    /* renamed from: a */
    public void mo14894a(int i) {
        C1876g gVar = this.f5219i;
        if (gVar != null && this.f5225o) {
            gVar.mo14447a(i);
            CBLogging.m3995c("Sdk", "Current session impression count: " + this.f5219i.mo14448b(i) + " in session: " + this.f5219i.mo14449c());
        }
    }

    /* renamed from: a */
    public static C1995w0 m4948a(Context context) {
        if (f5204H == null) {
            SharedPreferences b = m4953b(context);
            C2015x0 x0Var = new C2015x0(m4953b(context));
            f5204H = new C1995w0(new C1900b1(x0Var), new C2019y0(x0Var), new C1903c1(x0Var), new C2021z0(), new C1897a1(x0Var), new C1906d1(x0Var, b));
        }
        return f5204H;
    }

    /* renamed from: a */
    static void m4950a(Context context, DataUseConsent dataUseConsent) {
        if (dataUseConsent.getPrivacyStandard() == null || dataUseConsent.getConsent() == null) {
            try {
                C1874e.m4311e(new C1868a("consent_persistence_error", "", "", ""));
            } catch (Exception unused) {
            }
            CBLogging.m3993b("Sdk", "addDataUseConsent failed");
            return;
        }
        m4948a(context).mo14857a(dataUseConsent);
    }

    /* renamed from: a */
    static DataUseConsent m4946a(Context context, String str) {
        return m4948a(context).mo14855a(str);
    }
}
