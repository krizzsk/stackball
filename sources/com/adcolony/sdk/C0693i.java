package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.adcolony.sdk.ADCFunction;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.C0580a0;
import com.adcolony.sdk.C0746l;
import com.adcolony.sdk.C0774p;
import com.adcolony.sdk.C0796s;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iab.omid.library.adcolony.Omid;
import com.iab.omid.library.adcolony.adsession.Partner;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.adcolony.sdk.i */
class C0693i {

    /* renamed from: a0 */
    static final String f990a0 = "026ae9c9824b3e483fa6c71fa88f57ae27816141";

    /* renamed from: b0 */
    static final String f991b0 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5";

    /* renamed from: c0 */
    static String f992c0 = "https://adc3-launch.adcolony.com/v4/launch";

    /* renamed from: d0 */
    private static volatile String f993d0 = "";

    /* renamed from: A */
    private String f994A = "";

    /* renamed from: B */
    private boolean f995B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f996C;

    /* renamed from: D */
    private boolean f997D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f998E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f999F;

    /* renamed from: G */
    private boolean f1000G;

    /* renamed from: H */
    private boolean f1001H;

    /* renamed from: I */
    private boolean f1002I;

    /* renamed from: J */
    private boolean f1003J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f1004K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f1005L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f1006M;

    /* renamed from: N */
    private int f1007N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f1008O = 1;

    /* renamed from: P */
    private final int f1009P = 120;

    /* renamed from: Q */
    private Application.ActivityLifecycleCallbacks f1010Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public Partner f1011R = null;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C0897z0 f1012S = new C0897z0();

    /* renamed from: T */
    private long f1013T = 500;

    /* renamed from: U */
    private long f1014U = 500;

    /* renamed from: V */
    private boolean f1015V;

    /* renamed from: W */
    private long f1016W = SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US;

    /* renamed from: X */
    private long f1017X = 300000;

    /* renamed from: Y */
    private long f1018Y = MBInterstitialActivity.WEB_LOAD_TIME;

    /* renamed from: Z */
    private int f1019Z;

    /* renamed from: a */
    private C0733j f1020a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0647e0 f1021b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0779q f1022c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0769o0 f1023d;

    /* renamed from: e */
    private C0612d f1024e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C0763o f1025f;

    /* renamed from: g */
    private C0830u f1026g;

    /* renamed from: h */
    private C0800s0 f1027h;

    /* renamed from: i */
    private C0783q0 f1028i;

    /* renamed from: j */
    private C0601c0 f1029j;

    /* renamed from: k */
    private C0756n f1030k;

    /* renamed from: l */
    private C0689h0 f1031l;

    /* renamed from: m */
    private C0589c f1032m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C0853v f1033n;

    /* renamed from: o */
    private AdColonyAdView f1034o;

    /* renamed from: p */
    private AdColonyInterstitial f1035p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public AdColonyRewardListener f1036q;

    /* renamed from: r */
    private HashMap<String, AdColonyCustomMessageListener> f1037r = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public AdColonyAppOptions f1038s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C0645d0 f1039t;

    /* renamed from: u */
    private C0897z0 f1040u;

    /* renamed from: v */
    private HashMap<String, AdColonyZone> f1041v = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public HashMap<Integer, C0872w0> f1042w = new HashMap<>();

    /* renamed from: x */
    private String f1043x;

    /* renamed from: y */
    private String f1044y;

    /* renamed from: z */
    private String f1045z;

    /* renamed from: com.adcolony.sdk.i$a */
    class C0694a implements C0685f0 {
        C0694a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0897z0 b = C0894y.m1151b();
            C0894y.m1156b(b, "crc32", C0849u0.m903a(C0894y.m1169h(d0Var.mo9532b(), "data")));
            d0Var.mo9530a(b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.i$a0 */
    class C0695a0 implements C0685f0 {
        C0695a0() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0693i.this.m414f(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$b */
    class C0696b implements C0685f0 {
        C0696b() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            int d = C0894y.m1163d(d0Var.mo9532b(), "number");
            C0897z0 b = C0894y.m1151b();
            C0894y.m1146a(b, "uuids", C0849u0.m905a(d));
            d0Var.mo9530a(b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.i$b0 */
    class C0697b0 implements C0685f0 {
        C0697b0() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0693i.this.m395a(true, true);
        }
    }

    /* renamed from: com.adcolony.sdk.i$c */
    class C0698c implements C0685f0 {

        /* renamed from: com.adcolony.sdk.i$c$a */
        class C0699a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f1051a;

            /* renamed from: b */
            final /* synthetic */ C0645d0 f1052b;

            C0699a(Context context, C0645d0 d0Var) {
                this.f1051a = context;
                this.f1052b = d0Var;
            }

            public void run() {
                C0693i.this.mo9592a(this.f1051a, this.f1052b);
            }
        }

        C0698c() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            Context b = C0578a.m141b();
            if (b != null && !C0849u0.m915a((Runnable) new C0699a(b, d0Var))) {
                new C0580a0.C0581a().mo9419a("Executing ADCController.configure queryAdvertisingId failed").mo9421a(C0580a0.f192j);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$c0 */
    class C0700c0 implements C0685f0 {
        C0700c0() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0897z0 b = C0894y.m1151b();
            C0894y.m1148a(b, "sha1", C0849u0.m929b(C0894y.m1169h(d0Var.mo9532b(), "data")));
            d0Var.mo9530a(b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.i$d */
    class C0701d implements C0685f0 {
        C0701d() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0760n0 a = C0693i.this.mo9616t().mo9482a();
            C0693i.this.mo9611o().mo9736b(C0894y.m1169h(d0Var.mo9532b(), "version"));
            if (a != null) {
                a.mo9778e(C0693i.this.mo9611o().mo9746k());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$e */
    class C0702e implements C0685f0 {
        C0702e() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0897z0 unused = C0693i.this.f1012S = C0894y.m1167f(d0Var.mo9532b(), "signals");
        }
    }

    /* renamed from: com.adcolony.sdk.i$f */
    class C0703f implements C0685f0 {

        /* renamed from: com.adcolony.sdk.i$f$a */
        class C0704a implements ADCFunction.Consumer<C0746l.C0748b> {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1058a;

            C0704a(C0645d0 d0Var) {
                this.f1058a = d0Var;
            }

            /* renamed from: a */
            public void accept(C0746l.C0748b bVar) {
                C0897z0 b = C0894y.m1151b();
                if (bVar != null) {
                    C0894y.m1147a(b, "odt", bVar.mo9702c());
                }
                this.f1058a.mo9530a(b).mo9536d();
            }
        }

        C0703f() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0693i.this.mo9578J()) {
                C0735j0.m537d().mo9667a((ADCFunction.Consumer<C0746l.C0748b>) new C0704a(d0Var), C0693i.this.mo9604h());
                return;
            }
            C0746l.C0748b c = C0735j0.m537d().mo9672c();
            C0897z0 b = C0894y.m1151b();
            if (c != null) {
                C0894y.m1147a(b, "odt", c.mo9702c());
            }
            d0Var.mo9530a(b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.i$g */
    class C0705g implements C0685f0 {
        C0705g() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0735j0.m537d().mo9665a();
        }
    }

    /* renamed from: com.adcolony.sdk.i$h */
    class C0706h implements C0685f0 {
        C0706h() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0693i.this.f1033n.mo9917a(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$i */
    class C0707i implements Runnable {
        C0707i() {
        }

        public void run() {
            Context b = C0578a.m141b();
            if (!C0693i.this.f1006M && b != null) {
                try {
                    Omid.activate(b.getApplicationContext());
                    boolean unused = C0693i.this.f1006M = true;
                } catch (IllegalArgumentException unused2) {
                    new C0580a0.C0581a().mo9419a("IllegalArgumentException when activating Omid").mo9421a(C0580a0.f192j);
                    boolean unused3 = C0693i.this.f1006M = false;
                }
            }
            if (C0693i.this.f1006M && C0693i.this.f1011R == null) {
                try {
                    Partner unused4 = C0693i.this.f1011R = Partner.createPartner("AdColony", "4.6.5");
                } catch (IllegalArgumentException unused5) {
                    new C0580a0.C0581a().mo9419a("IllegalArgumentException when creating Omid Partner").mo9421a(C0580a0.f192j);
                    boolean unused6 = C0693i.this.f1006M = false;
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$j */
    class C0708j implements Runnable {

        /* renamed from: com.adcolony.sdk.i$j$a */
        class C0709a implements C0774p.C0775a {
            C0709a() {
            }

            /* renamed from: a */
            public void mo9627a(C0774p pVar, C0645d0 d0Var, Map<String, List<String>> map) {
                C0693i.this.m387a(pVar);
            }
        }

        C0708j() {
        }

        public void run() {
            C0897z0 b = C0894y.m1151b();
            C0894y.m1148a(b, "url", C0693i.f992c0);
            C0894y.m1148a(b, FirebaseAnalytics.Param.CONTENT_TYPE, WebRequest.CONTENT_TYPE_JSON);
            C0894y.m1148a(b, "content", C0849u0.m924b(C0693i.this.mo9611o().mo9729a(2000)).toString());
            C0693i.this.f1022c.mo9820a(new C0774p(new C0645d0("WebServices.post", 0, b), new C0709a()));
        }
    }

    /* renamed from: com.adcolony.sdk.i$k */
    class C0710k implements C0796s.C0799c {
        C0710k() {
        }

        /* renamed from: a */
        public void mo9628a() {
            C0735j0.m537d().mo9673e();
        }
    }

    /* renamed from: com.adcolony.sdk.i$l */
    class C0711l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f1066a;

        /* renamed from: b */
        final /* synthetic */ boolean f1067b;

        /* renamed from: c */
        final /* synthetic */ C0645d0 f1068c;

        C0711l(Context context, boolean z, C0645d0 d0Var) {
            this.f1066a = context;
            this.f1067b = z;
            this.f1068c = d0Var;
        }

        public void run() {
            C0872w0 w0Var = new C0872w0(this.f1066a.getApplicationContext(), C0693i.this.f1021b.mo9548e(), this.f1067b);
            w0Var.mo9957a(true, this.f1068c);
            C0693i.this.f1042w.put(Integer.valueOf(w0Var.mo9562e()), w0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$m */
    class C0712m implements Runnable {

        /* renamed from: com.adcolony.sdk.i$m$a */
        class C0713a implements Runnable {
            C0713a() {
            }

            public void run() {
                if (C0578a.m143c().mo9569A().mo9804g()) {
                    C0693i.this.m377M();
                }
            }
        }

        C0712m() {
        }

        public void run() {
            new Handler().postDelayed(new C0713a(), (long) (C0693i.this.f1008O * 1000));
        }
    }

    /* renamed from: com.adcolony.sdk.i$n */
    class C0714n implements C0774p.C0775a {
        C0714n() {
        }

        /* renamed from: a */
        public void mo9627a(C0774p pVar, C0645d0 d0Var, Map<String, List<String>> map) {
            C0693i.this.m380P();
        }
    }

    /* renamed from: com.adcolony.sdk.i$o */
    class C0715o implements Runnable {
        C0715o() {
        }

        public void run() {
            boolean unused = C0693i.this.m378N();
        }
    }

    /* renamed from: com.adcolony.sdk.i$p */
    class C0716p implements AdColonyInterstitial.C0576c {
        C0716p() {
        }

        /* renamed from: a */
        public void mo9360a() {
            C0693i.this.m402c();
        }
    }

    /* renamed from: com.adcolony.sdk.i$q */
    class C0717q implements AdColonyAdView.C0572c {
        C0717q() {
        }

        /* renamed from: a */
        public void mo9246a() {
            C0693i.this.m402c();
        }
    }

    /* renamed from: com.adcolony.sdk.i$r */
    class C0718r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0872w0 f1076a;

        C0718r(C0872w0 w0Var) {
            this.f1076a = w0Var;
        }

        public void run() {
            C0872w0 w0Var = this.f1076a;
            if (w0Var != null && w0Var.mo9948A()) {
                this.f1076a.loadUrl("about:blank");
                this.f1076a.clearCache(true);
                this.f1076a.removeAllViews();
                this.f1076a.mo9956a(true);
                this.f1076a.destroy();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$s */
    class C0719s implements ADCFunction.Consumer<C0727i0> {
        C0719s() {
        }

        /* renamed from: a */
        public void accept(C0727i0 i0Var) {
            C0735j0.m537d().mo9669a(i0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$t */
    class C0720t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0645d0 f1079a;

        C0720t(C0645d0 d0Var) {
            this.f1079a = d0Var;
        }

        public void run() {
            C0693i.this.f1036q.onReward(new AdColonyReward(this.f1079a));
        }
    }

    /* renamed from: com.adcolony.sdk.i$u */
    class C0721u implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private final Set<Integer> f1081a = new HashSet();

        C0721u() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!C0693i.this.f1023d.mo9804g()) {
                C0693i.this.f1023d.mo9796c(true);
            }
            C0578a.m137a(activity);
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            C0578a.f183d = false;
            C0693i.this.f1023d.mo9798d(false);
        }

        public void onActivityResumed(Activity activity) {
            ScheduledExecutorService scheduledExecutorService;
            this.f1081a.add(Integer.valueOf(activity.hashCode()));
            C0578a.f183d = true;
            C0578a.m137a(activity);
            C0760n0 a = C0693i.this.mo9616t().mo9482a();
            Context b = C0578a.m141b();
            if (b == null || !C0693i.this.f1023d.mo9800e() || !(b instanceof C0585b) || ((C0585b) b).f206e) {
                C0578a.m137a(activity);
                if (C0693i.this.f1039t != null) {
                    if (!Objects.equals(C0894y.m1169h(C0693i.this.f1039t.mo9532b(), "m_origin"), "")) {
                        C0693i.this.f1039t.mo9530a(C0693i.this.f1039t.mo9532b()).mo9536d();
                    }
                    C0645d0 unused = C0693i.this.f1039t = null;
                }
                boolean unused2 = C0693i.this.f996C = false;
                C0693i.this.f1023d.mo9803g(false);
                if (C0693i.this.f999F && !C0693i.this.f1023d.mo9804g()) {
                    C0693i.this.f1023d.mo9796c(true);
                }
                C0693i.this.f1023d.mo9798d(true);
                C0693i.this.f1025f.mo9785c();
                if (a == null || (scheduledExecutorService = a.f1220b) == null || scheduledExecutorService.isShutdown() || a.f1220b.isTerminated()) {
                    AdColony.m36a((Context) activity, C0578a.m143c().f1038s);
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            C0693i.this.f1023d.mo9799e(true);
        }

        public void onActivityStopped(Activity activity) {
            this.f1081a.remove(Integer.valueOf(activity.hashCode()));
            if (this.f1081a.isEmpty()) {
                C0693i.this.f1023d.mo9799e(false);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i$v */
    class C0722v implements C0685f0 {
        C0722v() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0693i.this.m404c(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$w */
    class C0723w implements C0685f0 {
        C0723w() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0693i.this.m385a(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$x */
    class C0724x implements C0685f0 {
        C0724x() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0760n0 a = C0693i.this.mo9616t().mo9482a();
            boolean unused = C0693i.this.f998E = true;
            if (C0693i.this.f1004K) {
                C0897z0 b = C0894y.m1151b();
                C0897z0 b2 = C0894y.m1151b();
                C0894y.m1148a(b2, TapjoyConstants.TJC_APP_VERSION_NAME, C0849u0.m934c());
                C0894y.m1147a(b, "app_bundle_info", b2);
                new C0645d0("AdColony.on_update", 1, b).mo9536d();
                boolean unused2 = C0693i.this.f1004K = false;
            }
            if (C0693i.this.f1005L) {
                new C0645d0("AdColony.on_install", 1).mo9536d();
            }
            C0897z0 b3 = d0Var.mo9532b();
            if (a != null) {
                a.mo9779f(C0894y.m1169h(b3, "app_session_id"));
            }
            if (AdColonyEventTracker.m82a()) {
                AdColonyEventTracker.m84b();
            }
            Integer k = b3.mo10082k("base_download_threads");
            if (k != null) {
                C0693i.this.f1022c.mo9819a(k.intValue());
            }
            Integer k2 = b3.mo10082k("concurrent_requests");
            if (k2 != null) {
                C0693i.this.f1022c.mo9822b(k2.intValue());
            }
            Integer k3 = b3.mo10082k("threads_keep_alive_time");
            if (k3 != null) {
                C0693i.this.f1022c.mo9824c(k3.intValue());
            }
            double j = b3.mo10081j("thread_pool_scaling_factor");
            if (!Double.isNaN(j)) {
                C0693i.this.f1022c.mo9818a(j);
            }
            C0693i.this.f1033n.mo9918b();
            C0693i.this.m379O();
        }
    }

    /* renamed from: com.adcolony.sdk.i$y */
    class C0725y implements C0685f0 {
        C0725y() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0693i.this.m397b(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.i$z */
    class C0726z implements C0685f0 {
        C0726z() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0693i.this.m412e(d0Var);
        }
    }

    C0693i() {
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m377M() {
        new Thread(new C0708j()).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public boolean m378N() {
        this.f1021b.mo9542a();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m379O() {
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "type", "AdColony.on_configuration_completed");
        C0895y0 y0Var = new C0895y0();
        for (String b2 : mo9574F().keySet()) {
            y0Var.mo10030b(b2);
        }
        C0897z0 b3 = C0894y.m1151b();
        C0894y.m1146a(b3, "zone_ids", y0Var);
        C0894y.m1147a(b, "message", b3);
        new C0645d0("CustomMessage.controller_send", 0, b).mo9536d();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m380P() {
        if (m393a(this.f1044y) || C0872w0.f1538Q) {
            if (!this.f1000G && !this.f1003J) {
                C0849u0.m931b((Runnable) new C0715o());
            }
            if (this.f1000G && this.f1003J) {
                mo9582S();
                return;
            }
            return;
        }
        new C0580a0.C0581a().mo9419a("Downloaded controller sha1 does not match, retrying.").mo9421a(C0580a0.f189g);
        m382U();
    }

    /* renamed from: Q */
    private void m381Q() {
        Application application;
        Context b = C0578a.m141b();
        if (b != null && this.f1010Q == null && Build.VERSION.SDK_INT > 14) {
            this.f1010Q = new C0721u();
            if (b instanceof Application) {
                application = (Application) b;
            } else {
                application = ((Activity) b).getApplication();
            }
            application.registerActivityLifecycleCallbacks(this.f1010Q);
        }
    }

    /* renamed from: U */
    private void m382U() {
        if (C0578a.m143c().mo9569A().mo9804g()) {
            int i = this.f1007N + 1;
            this.f1007N = i;
            this.f1008O = Math.min(this.f1008O * i, 120);
            C0849u0.m931b((Runnable) new C0712m());
            return;
        }
        new C0580a0.C0581a().mo9419a("Max launch server download attempts hit, or AdColony is no longer").mo9419a(" active.").mo9421a(C0580a0.f190h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C0769o0 mo9569A() {
        if (this.f1023d == null) {
            C0769o0 o0Var = new C0769o0();
            this.f1023d = o0Var;
            o0Var.mo9797d();
        }
        return this.f1023d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public long mo9570B() {
        return this.f1013T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public C0783q0 mo9571C() {
        if (this.f1028i == null) {
            C0783q0 q0Var = new C0783q0();
            this.f1028i = q0Var;
            q0Var.mo9831e();
        }
        return this.f1028i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public C0800s0 mo9572D() {
        if (this.f1027h == null) {
            C0800s0 s0Var = new C0800s0();
            this.f1027h = s0Var;
            s0Var.mo9864a();
        }
        return this.f1027h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public HashMap<Integer, C0872w0> mo9573E() {
        return this.f1042w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public HashMap<String, AdColonyZone> mo9574F() {
        return this.f1041v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo9575G() {
        return this.f1038s != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo9576H() {
        return this.f996C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo9577I() {
        return this.f997D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo9578J() {
        return this.f1015V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo9579K() {
        return this.f998E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo9580L() {
        return this.f995B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo9581R() {
        this.f998E = false;
        this.f1024e.mo9502b();
        Object option = this.f1038s.getOption("force_ad_id");
        if ((option instanceof String) && !((String) option).isEmpty()) {
            mo9583T();
        }
        AdColony.m36a(C0578a.m141b(), this.f1038s);
        mo9591a(1);
        this.f1041v.clear();
        this.f1021b.mo9542a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo9582S() {
        this.f1019Z = 0;
        for (AdColonyInterstitial next : this.f1024e.mo9509f().values()) {
            if (next.mo9346o()) {
                this.f1019Z++;
                next.mo9318a((AdColonyInterstitial.C0576c) new C0716p());
            }
        }
        for (AdColonyAdView onDestroyListenerOrCall : this.f1024e.mo9506d().values()) {
            this.f1019Z++;
            onDestroyListenerOrCall.setOnDestroyListenerOrCall(new C0717q());
        }
        if (this.f1019Z == 0) {
            mo9581R();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo9583T() {
        synchronized (this.f1024e.mo9509f()) {
            for (AdColonyInterstitial r : this.f1024e.mo9509f().values()) {
                r.mo9349r();
            }
            this.f1024e.mo9509f().clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C0647e0 mo9617u() {
        if (this.f1021b == null) {
            C0647e0 e0Var = new C0647e0();
            this.f1021b = e0Var;
            e0Var.mo9542a();
        }
        return this.f1021b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C0689h0 mo9618v() {
        if (this.f1031l == null) {
            this.f1031l = new C0689h0();
        }
        return this.f1031l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public Partner mo9619w() {
        return this.f1011R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public AdColonyAppOptions mo9620x() {
        if (this.f1038s == null) {
            this.f1038s = new AdColonyAppOptions();
        }
        return this.f1038s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo9621y() {
        return f993d0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public AdColonyRewardListener mo9622z() {
        return this.f1036q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo9603g() {
        return this.f994A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public long mo9604h() {
        return this.f1014U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public long mo9605i() {
        return this.f1017X;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public long mo9606j() {
        return this.f1018Y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public AdColonyInterstitial mo9607k() {
        return this.f1035p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public AdColonyAdView mo9608l() {
        return this.f1034o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0589c mo9609m() {
        return this.f1032m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public HashMap<String, AdColonyCustomMessageListener> mo9610n() {
        return this.f1037r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C0756n mo9611o() {
        if (this.f1030k == null) {
            C0756n nVar = new C0756n();
            this.f1030k = nVar;
            nVar.mo9727I();
        }
        return this.f1030k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0763o mo9612p() {
        if (this.f1025f == null) {
            this.f1025f = new C0763o();
        }
        return this.f1025f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C0779q mo9613q() {
        if (this.f1022c == null) {
            this.f1022c = new C0779q();
        }
        return this.f1022c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0830u mo9614r() {
        if (this.f1026g == null) {
            C0830u uVar = new C0830u();
            this.f1026g = uVar;
            uVar.mo9898b();
        }
        return this.f1026g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0897z0 mo9615s() {
        return this.f1040u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C0601c0 mo9616t() {
        if (this.f1029j == null) {
            C0601c0 c0Var = new C0601c0();
            this.f1029j = c0Var;
            c0Var.mo9488b();
        }
        return this.f1029j;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m412e(C0645d0 d0Var) {
        if (this.f1036q == null) {
            return false;
        }
        C0849u0.m931b((Runnable) new C0720t(d0Var));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m414f(C0645d0 d0Var) {
        AdColonyZone adColonyZone;
        if (!this.f997D) {
            String h = C0894y.m1169h(d0Var.mo9532b(), "zone_id");
            if (this.f1041v.containsKey(h)) {
                adColonyZone = this.f1041v.get(h);
            } else {
                AdColonyZone adColonyZone2 = new AdColonyZone(h);
                this.f1041v.put(h, adColonyZone2);
                adColonyZone = adColonyZone2;
            }
            adColonyZone.mo9401a(d0Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m404c(C0645d0 d0Var) {
        Context b = C0578a.m141b();
        if (b == null) {
            return false;
        }
        try {
            int l = d0Var.mo9532b().mo10083l("id");
            if (l <= 0) {
                l = this.f1021b.mo9548e();
            }
            mo9591a(l);
            C0849u0.m931b((Runnable) new C0711l(b, C0894y.m1155b(d0Var.mo9532b(), "is_display_module"), d0Var));
            return true;
        } catch (RuntimeException e) {
            C0580a0.C0581a aVar = new C0580a0.C0581a();
            aVar.mo9419a(e.toString() + ": during WebView initialization.").mo9419a(" Disabling AdColony.").mo9421a(C0580a0.f191i);
            AdColony.disable();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Context mo9593b() {
        return C0578a.m141b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9598d(C0645d0 d0Var) {
        this.f1039t = d0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9595b(boolean z) {
        this.f997D = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0612d mo9597d() {
        if (this.f1024e == null) {
            C0612d dVar = new C0612d();
            this.f1024e = dVar;
            dVar.mo9511h();
        }
        return this.f1024e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9601e(boolean z) {
        this.f995B = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m397b(C0645d0 d0Var) {
        C0897z0 b = this.f1038s.mo9271b();
        C0894y.m1148a(b, "app_id", this.f1038s.mo9270a());
        C0894y.m1146a(b, "zone_ids", this.f1038s.mo9274d());
        C0897z0 b2 = C0894y.m1151b();
        C0894y.m1147a(b2, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, b);
        d0Var.mo9530a(b2).mo9536d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo9600e() {
        return this.f1016W;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0111  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9587a(com.adcolony.sdk.AdColonyAppOptions r5, boolean r6) {
        /*
            r4 = this;
            r4.f997D = r6
            r4.f1038s = r5
            com.adcolony.sdk.e0 r0 = new com.adcolony.sdk.e0
            r0.<init>()
            r4.f1021b = r0
            com.adcolony.sdk.j r0 = new com.adcolony.sdk.j
            r0.<init>()
            r4.f1020a = r0
            com.adcolony.sdk.n r0 = new com.adcolony.sdk.n
            r0.<init>()
            r4.f1030k = r0
            r0.mo9727I()
            com.adcolony.sdk.q r0 = new com.adcolony.sdk.q
            r0.<init>()
            r4.f1022c = r0
            r0.mo9823c()
            com.adcolony.sdk.o0 r0 = new com.adcolony.sdk.o0
            r0.<init>()
            r4.f1023d = r0
            r0.mo9797d()
            com.adcolony.sdk.d r0 = new com.adcolony.sdk.d
            r0.<init>()
            r4.f1024e = r0
            r0.mo9511h()
            com.adcolony.sdk.o r0 = new com.adcolony.sdk.o
            r0.<init>()
            r4.f1025f = r0
            com.adcolony.sdk.u r0 = new com.adcolony.sdk.u
            r0.<init>()
            r4.f1026g = r0
            r0.mo9898b()
            com.adcolony.sdk.c0 r0 = new com.adcolony.sdk.c0
            r0.<init>()
            r4.f1029j = r0
            r0.mo9488b()
            com.adcolony.sdk.q0 r0 = new com.adcolony.sdk.q0
            r0.<init>()
            r4.f1028i = r0
            r0.mo9831e()
            com.adcolony.sdk.s0 r0 = new com.adcolony.sdk.s0
            r0.<init>()
            r4.f1027h = r0
            r0.mo9864a()
            com.adcolony.sdk.h0 r0 = new com.adcolony.sdk.h0
            r0.<init>()
            r4.f1031l = r0
            com.adcolony.sdk.v r0 = new com.adcolony.sdk.v
            r0.<init>()
            r4.f1033n = r0
            com.adcolony.sdk.h0 r0 = r4.f1031l
            r0.mo9566b()
            android.content.Context r0 = com.adcolony.sdk.C0578a.m141b()
            com.adcolony.sdk.AdColony.m36a((android.content.Context) r0, (com.adcolony.sdk.AdColonyAppOptions) r5)
            r5 = 0
            r0 = 1
            if (r6 != 0) goto L_0x0137
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.q0 r2 = r4.f1028i
            java.lang.String r2 = r2.mo9826a()
            r1.append(r2)
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.<init>(r1)
            boolean r6 = r6.exists()
            r4.f1001H = r6
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.q0 r3 = r4.f1028i
            java.lang.String r3 = r3.mo9826a()
            r1.append(r3)
            java.lang.String r3 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r6.<init>(r1)
            boolean r6 = r6.exists()
            r4.f1002I = r6
            boolean r1 = r4.f1001H
            if (r1 == 0) goto L_0x00fe
            if (r6 == 0) goto L_0x00fe
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.adcolony.sdk.q0 r1 = r4.f1028i
            java.lang.String r1 = r1.mo9826a()
            r6.append(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.adcolony.sdk.z0 r6 = com.adcolony.sdk.C0894y.m1161c(r6)
            java.lang.String r1 = "sdkVersion"
            java.lang.String r6 = com.adcolony.sdk.C0894y.m1169h(r6, r1)
            com.adcolony.sdk.n r1 = r4.f1030k
            java.lang.String r1 = r1.mo9723E()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x00fe
            r6 = 1
            goto L_0x00ff
        L_0x00fe:
            r6 = 0
        L_0x00ff:
            r4.f1000G = r6
            com.adcolony.sdk.s r6 = com.adcolony.sdk.C0796s.m784b()
            com.adcolony.sdk.i$k r1 = new com.adcolony.sdk.i$k
            r1.<init>()
            r6.mo9858a((com.adcolony.sdk.C0796s.C0799c) r1)
            boolean r6 = r4.f1001H
            if (r6 == 0) goto L_0x012f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.adcolony.sdk.q0 r1 = r4.f1028i
            java.lang.String r1 = r1.mo9826a()
            r6.append(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.adcolony.sdk.z0 r6 = com.adcolony.sdk.C0894y.m1161c(r6)
            r4.f1040u = r6
            r4.m399b((com.adcolony.sdk.C0897z0) r6)
        L_0x012f:
            boolean r6 = r4.f1000G
            r4.m394a((boolean) r6)
            r4.m381Q()
        L_0x0137:
            com.adcolony.sdk.i$v r6 = new com.adcolony.sdk.i$v
            r6.<init>()
            java.lang.String r1 = "Module.load"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$w r6 = new com.adcolony.sdk.i$w
            r6.<init>()
            java.lang.String r1 = "Module.unload"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$x r6 = new com.adcolony.sdk.i$x
            r6.<init>()
            java.lang.String r1 = "AdColony.on_configured"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$y r6 = new com.adcolony.sdk.i$y
            r6.<init>()
            java.lang.String r1 = "AdColony.get_app_info"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$z r6 = new com.adcolony.sdk.i$z
            r6.<init>()
            java.lang.String r1 = "AdColony.v4vc_reward"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$a0 r6 = new com.adcolony.sdk.i$a0
            r6.<init>()
            java.lang.String r1 = "AdColony.zone_info"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$b0 r6 = new com.adcolony.sdk.i$b0
            r6.<init>()
            java.lang.String r1 = "AdColony.probe_launch_server"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$c0 r6 = new com.adcolony.sdk.i$c0
            r6.<init>()
            java.lang.String r1 = "Crypto.sha1"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$a r6 = new com.adcolony.sdk.i$a
            r6.<init>()
            java.lang.String r1 = "Crypto.crc32"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$b r6 = new com.adcolony.sdk.i$b
            r6.<init>()
            java.lang.String r1 = "Crypto.uuid"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$c r6 = new com.adcolony.sdk.i$c
            r6.<init>()
            java.lang.String r1 = "Device.query_advertiser_info"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$d r6 = new com.adcolony.sdk.i$d
            r6.<init>()
            java.lang.String r1 = "AdColony.controller_version"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$e r6 = new com.adcolony.sdk.i$e
            r6.<init>()
            java.lang.String r1 = "AdColony.provide_signals"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$f r6 = new com.adcolony.sdk.i$f
            r6.<init>()
            java.lang.String r1 = "AdColony.odt_calculate"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$g r6 = new com.adcolony.sdk.i$g
            r6.<init>()
            java.lang.String r1 = "AdColony.odt_cache"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.i$h r6 = new com.adcolony.sdk.i$h
            r6.<init>()
            java.lang.String r1 = "AdColony.heartbeat"
            com.adcolony.sdk.C0578a.m139a((java.lang.String) r1, (com.adcolony.sdk.C0685f0) r6)
            com.adcolony.sdk.q0 r6 = r4.f1028i
            int r6 = com.adcolony.sdk.C0849u0.m923b((com.adcolony.sdk.C0783q0) r6)
            if (r6 != r0) goto L_0x01e1
            r1 = 1
            goto L_0x01e2
        L_0x01e1:
            r1 = 0
        L_0x01e2:
            r4.f1004K = r1
            r1 = 2
            if (r6 != r1) goto L_0x01e8
            r5 = 1
        L_0x01e8:
            r4.f1005L = r5
            com.adcolony.sdk.i$i r5 = new com.adcolony.sdk.i$i
            r5.<init>()
            com.adcolony.sdk.C0849u0.m931b((java.lang.Runnable) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0693i.mo9587a(com.adcolony.sdk.AdColonyAppOptions, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9599d(boolean z) {
        this.f999F = z;
    }

    /* renamed from: b */
    private void m399b(C0897z0 z0Var) {
        if (!C0872w0.f1538Q) {
            C0897z0 f = C0894y.m1167f(z0Var, "logging");
            C0601c0.f270n = C0894y.m1132a(f, "send_level", 1);
            C0601c0.f261e = C0894y.m1155b(f, "log_private");
            C0601c0.f269m = C0894y.m1132a(f, "print_level", 3);
            this.f1029j.mo9490b(C0894y.m1136a(f, "modules"));
        }
        C0897z0 f2 = C0894y.m1167f(z0Var, "metadata");
        mo9611o().mo9732a(f2);
        mo9569A().mo9791a(C0894y.m1163d(f2, "session_timeout"));
        f993d0 = C0894y.m1169h(z0Var, "pie");
        this.f994A = C0894y.m1169h(C0894y.m1167f(z0Var, "controller"), "version");
        this.f1013T = C0894y.m1133a(f2, "signals_timeout", this.f1013T);
        this.f1014U = C0894y.m1133a(f2, "calculate_odt_timeout", this.f1014U);
        this.f1015V = C0894y.m1149a(f2, "async_odt_query", this.f1015V);
        this.f1016W = C0894y.m1133a(f2, "ad_request_timeout", this.f1016W);
        this.f1017X = C0894y.m1133a(f2, "controller_heartbeat_interval", this.f1017X);
        this.f1018Y = C0894y.m1133a(f2, "controller_heartbeat_timeout", this.f1018Y);
        C0796s.m784b().mo9859a(f2.mo10087p("odt_config"), (ADCFunction.Consumer<C0727i0>) new C0719s());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0897z0 mo9602f() {
        return this.f1012S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9594b(AdColonyAppOptions adColonyAppOptions) {
        this.f1038s = adColonyAppOptions;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m402c() {
        int i = this.f1019Z - 1;
        this.f1019Z = i;
        if (i == 0) {
            mo9581R();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        new java.io.File(r3.f1028i.mo9826a() + f990a0).delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002f */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m406c(com.adcolony.sdk.C0897z0 r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "controller"
            com.adcolony.sdk.z0 r1 = com.adcolony.sdk.C0894y.m1167f(r4, r1)     // Catch:{ Exception -> 0x002f }
            java.lang.String r2 = "url"
            java.lang.String r2 = com.adcolony.sdk.C0894y.m1169h(r1, r2)     // Catch:{ Exception -> 0x002f }
            r3.f1043x = r2     // Catch:{ Exception -> 0x002f }
            java.lang.String r2 = "sha1"
            java.lang.String r1 = com.adcolony.sdk.C0894y.m1169h(r1, r2)     // Catch:{ Exception -> 0x002f }
            r3.f1044y = r1     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = "status"
            java.lang.String r1 = com.adcolony.sdk.C0894y.m1169h(r4, r1)     // Catch:{ Exception -> 0x002f }
            r3.f1045z = r1     // Catch:{ Exception -> 0x002f }
            r3.m399b((com.adcolony.sdk.C0897z0) r4)     // Catch:{ Exception -> 0x002f }
            boolean r4 = com.adcolony.sdk.AdColonyEventTracker.m82a()     // Catch:{ Exception -> 0x002f }
            if (r4 == 0) goto L_0x0050
            com.adcolony.sdk.AdColonyEventTracker.m84b()     // Catch:{ Exception -> 0x002f }
            goto L_0x0050
        L_0x002f:
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x004f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004f }
            r1.<init>()     // Catch:{ Exception -> 0x004f }
            com.adcolony.sdk.q0 r2 = r3.f1028i     // Catch:{ Exception -> 0x004f }
            java.lang.String r2 = r2.mo9826a()     // Catch:{ Exception -> 0x004f }
            r1.append(r2)     // Catch:{ Exception -> 0x004f }
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x004f }
            r4.<init>(r1)     // Catch:{ Exception -> 0x004f }
            r4.delete()     // Catch:{ Exception -> 0x004f }
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            java.lang.String r4 = r3.f1045z
            java.lang.String r1 = "disable"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0097
            boolean r4 = com.adcolony.sdk.C0872w0.f1538Q
            if (r4 != 0) goto L_0x0097
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x007d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
            r1.<init>()     // Catch:{ Exception -> 0x007d }
            com.adcolony.sdk.q0 r2 = r3.f1028i     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = r2.mo9826a()     // Catch:{ Exception -> 0x007d }
            r1.append(r2)     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r2)     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x007d }
            r4.<init>(r1)     // Catch:{ Exception -> 0x007d }
            r4.delete()     // Catch:{ Exception -> 0x007d }
        L_0x007d:
            com.adcolony.sdk.a0$a r4 = new com.adcolony.sdk.a0$a
            r4.<init>()
            java.lang.String r1 = "Launch server response with disabled status. Disabling AdColony "
            com.adcolony.sdk.a0$a r4 = r4.mo9419a((java.lang.String) r1)
            java.lang.String r1 = "until next launch."
            com.adcolony.sdk.a0$a r4 = r4.mo9419a((java.lang.String) r1)
            com.adcolony.sdk.a0 r1 = com.adcolony.sdk.C0580a0.f190h
            r4.mo9421a((com.adcolony.sdk.C0580a0) r1)
            com.adcolony.sdk.AdColony.disable()
            return r0
        L_0x0097:
            java.lang.String r4 = r3.f1043x
            java.lang.String r1 = ""
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00a9
            java.lang.String r4 = r3.f1045z
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x00c4
        L_0x00a9:
            boolean r4 = com.adcolony.sdk.C0872w0.f1538Q
            if (r4 != 0) goto L_0x00c4
            com.adcolony.sdk.a0$a r4 = new com.adcolony.sdk.a0$a
            r4.<init>()
            java.lang.String r1 = "Missing controller status or URL. Disabling AdColony until next "
            com.adcolony.sdk.a0$a r4 = r4.mo9419a((java.lang.String) r1)
            java.lang.String r1 = "launch."
            com.adcolony.sdk.a0$a r4 = r4.mo9419a((java.lang.String) r1)
            com.adcolony.sdk.a0 r1 = com.adcolony.sdk.C0580a0.f192j
            r4.mo9421a((com.adcolony.sdk.C0580a0) r1)
            return r0
        L_0x00c4:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0693i.m406c(com.adcolony.sdk.z0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9596c(boolean z) {
        this.f996C = z;
    }

    /* renamed from: a */
    private boolean m394a(boolean z) {
        return m395a(z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m395a(boolean z, boolean z2) {
        if (!C0578a.m144d()) {
            return false;
        }
        this.f1003J = z2;
        this.f1000G = z;
        if (z && !z2 && !m378N()) {
            return false;
        }
        m377M();
        return true;
    }

    /* renamed from: a */
    private boolean m392a(C0897z0 z0Var) {
        if (!this.f1000G) {
            return true;
        }
        C0897z0 z0Var2 = this.f1040u;
        if (z0Var2 != null && C0894y.m1169h(C0894y.m1167f(z0Var2, "controller"), "sha1").equals(C0894y.m1169h(C0894y.m1167f(z0Var, "controller"), "sha1"))) {
            return false;
        }
        new C0580a0.C0581a().mo9419a("Controller sha1 does not match, downloading new controller.").mo9421a(C0580a0.f190h);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m385a(C0645d0 d0Var) {
        mo9591a(C0894y.m1163d(d0Var.mo9532b(), "id"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m387a(C0774p pVar) {
        if (pVar.f1276p) {
            C0897z0 a = C0894y.m1140a(pVar.f1275o, "Parsing launch response");
            C0894y.m1148a(a, "sdkVersion", mo9611o().mo9723E());
            C0894y.m1170i(a, this.f1028i.mo9826a() + f990a0);
            if (m406c(a)) {
                if (m392a(a)) {
                    C0897z0 b = C0894y.m1151b();
                    C0894y.m1148a(b, "url", this.f1043x);
                    C0894y.m1148a(b, "filepath", this.f1028i.mo9826a() + f991b0);
                    this.f1022c.mo9820a(new C0774p(new C0645d0("WebServices.download", 0, b), new C0714n()));
                }
                this.f1040u = a;
            } else if (!this.f1000G) {
                new C0580a0.C0581a().mo9419a("Incomplete or disabled launch server response. ").mo9419a("Disabling AdColony until next launch.").mo9421a(C0580a0.f191i);
                mo9595b(true);
            }
        } else {
            m382U();
        }
    }

    /* renamed from: a */
    private boolean m393a(String str) {
        Context b = C0578a.m141b();
        if (b == null) {
            return false;
        }
        File file = new File(b.getFilesDir().getAbsolutePath() + "/adc3/" + f991b0);
        if (file.exists()) {
            return C0849u0.m918a(str, file);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9592a(Context context, C0645d0 d0Var) {
        boolean z;
        if (context == null) {
            return false;
        }
        String str = "";
        AdvertisingIdClient.Info info = null;
        C0760n0 a = mo9616t().mo9482a();
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (NoClassDefFoundError unused) {
            new C0580a0.C0581a().mo9419a("Google Play Services ads dependencies are missing. Collecting ").mo9419a("Android ID instead of Advertising ID.").mo9421a(C0580a0.f189g);
            return false;
        } catch (NoSuchMethodError unused2) {
            new C0580a0.C0581a().mo9419a("Google Play Services is out of date, please update to GPS 4.0+. ").mo9419a("Collecting Android ID instead of Advertising ID.").mo9421a(C0580a0.f189g);
        } catch (Exception e) {
            e.printStackTrace();
            if (!Build.MANUFACTURER.equals("Amazon")) {
                new C0580a0.C0581a().mo9419a("Advertising ID is not available. Collecting Android ID instead of").mo9419a(" Advertising ID.").mo9421a(C0580a0.f189g);
                return false;
            }
            str = mo9611o().mo9739d();
            z = mo9611o().mo9740e();
        }
        z = false;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && info == null) {
            return false;
        }
        if (!str2.equals("Amazon")) {
            str = info.getId();
            z = info.isLimitAdTrackingEnabled();
        }
        mo9611o().mo9733a(str);
        if (a != null) {
            a.f1223e.put("advertisingId", mo9611o().mo9738c());
        }
        mo9611o().mo9737b(z);
        mo9611o().mo9734a(true);
        if (d0Var != null) {
            C0897z0 b = C0894y.m1151b();
            C0894y.m1148a(b, "advertiser_id", mo9611o().mo9738c());
            C0894y.m1158b(b, "limit_ad_tracking", mo9611o().mo9758w());
            d0Var.mo9530a(b).mo9536d();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9584a() {
        this.f1024e.mo9494a();
        mo9581R();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9586a(AdColonyAppOptions adColonyAppOptions) {
        this.f998E = false;
        this.f1024e.mo9502b();
        mo9583T();
        AdColony.m36a(C0578a.m141b(), adColonyAppOptions);
        mo9591a(1);
        this.f1041v.clear();
        this.f1038s = adColonyAppOptions;
        this.f1021b.mo9542a();
        m395a(true, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9591a(int i) {
        C0687g0 a = this.f1021b.mo9540a(i);
        C0872w0 remove = this.f1042w.remove(Integer.valueOf(i));
        boolean z = false;
        if (a == null) {
            return false;
        }
        if (remove != null && remove.mo9949B()) {
            z = true;
        }
        C0718r rVar = new C0718r(remove);
        if (z) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            new Handler().postDelayed(rVar, 1000);
        } else {
            rVar.run();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9589a(AdColonyRewardListener adColonyRewardListener) {
        this.f1036q = adColonyRewardListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9590a(C0589c cVar) {
        this.f1032m = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9585a(AdColonyAdView adColonyAdView) {
        this.f1034o = adColonyAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9588a(AdColonyInterstitial adColonyInterstitial) {
        this.f1035p = adColonyInterstitial;
    }
}
