package com.adcolony.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import com.adcolony.sdk.C0580a0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.adcolony.sdk.d */
class C0612d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ConcurrentHashMap<String, Runnable> f289a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public HashMap<String, C0589c> f290b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ConcurrentHashMap<String, AdColonyInterstitial> f291c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ConcurrentHashMap<String, AdColonyAdViewListener> f292d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ConcurrentHashMap<String, AdColonyAdViewListener> f293e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<String, AdColonyAdView> f294f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f295g = new Object();

    /* renamed from: com.adcolony.sdk.d$a */
    class C0613a implements C0685f0 {
        C0613a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0612d.this.mo9508e(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$a0 */
    class C0614a0 implements C0685f0 {
        C0614a0() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0612d.this.mo9501a(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$b */
    class C0615b implements C0685f0 {

        /* renamed from: com.adcolony.sdk.d$b$a */
        class C0616a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f299a;

            C0616a(C0645d0 d0Var) {
                this.f299a = d0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C0612d.this.f291c.get(C0894y.m1169h(this.f299a.mo9532b(), "id"));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStopped(adColonyInterstitial);
                }
            }
        }

        C0615b() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0849u0.m931b((Runnable) new C0616a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$c */
    class C0617c implements C0685f0 {

        /* renamed from: com.adcolony.sdk.d$c$a */
        class C0618a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f302a;

            C0618a(C0645d0 d0Var) {
                this.f302a = d0Var;
            }

            public void run() {
                AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C0612d.this.f291c.get(C0894y.m1169h(this.f302a.mo9532b(), "id"));
                if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
                    adColonyInterstitial.getListener().onAudioStarted(adColonyInterstitial);
                }
            }
        }

        C0617c() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0849u0.m931b((Runnable) new C0618a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$d */
    class C0619d implements C0685f0 {
        C0619d() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0612d.this.mo9513i(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$e */
    class C0620e implements C0685f0 {
        C0620e() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0612d.this.mo9512h(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$f */
    class C0621f implements C0685f0 {
        C0621f() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0612d.this.m282g(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$g */
    class C0622g implements C0685f0 {
        C0622g() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0897z0 b = C0894y.m1151b();
            C0894y.m1158b(b, "success", true);
            d0Var.mo9530a(b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.d$h */
    class C0623h implements C0685f0 {

        /* renamed from: com.adcolony.sdk.d$h$a */
        class C0624a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f309a;

            C0624a(C0645d0 d0Var) {
                this.f309a = d0Var;
            }

            public void run() {
                C0645d0 d0Var = this.f309a;
                d0Var.mo9530a(d0Var.mo9532b()).mo9536d();
            }
        }

        C0623h() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0849u0.m931b((Runnable) new C0624a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$i */
    class C0625i implements C0685f0 {
        C0625i() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0735j0.m537d().mo9668a(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$j */
    class C0626j implements Runnable {
        C0626j() {
        }

        public void run() {
            C0763o p = C0578a.m143c().mo9612p();
            if (p.mo9782a() != null) {
                p.mo9782a().dismiss();
                p.mo9783a((AlertDialog) null);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$k */
    class C0627k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f313a;

        /* renamed from: b */
        final /* synthetic */ C0645d0 f314b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdViewListener f315c;

        /* renamed from: d */
        final /* synthetic */ String f316d;

        C0627k(Context context, C0645d0 d0Var, AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f313a = context;
            this.f314b = d0Var;
            this.f315c = adColonyAdViewListener;
            this.f316d = str;
        }

        public void run() {
            AdColonyAdView adColonyAdView = new AdColonyAdView(this.f313a, this.f314b, this.f315c);
            synchronized (C0612d.this.f295g) {
                if (C0612d.this.f293e.remove(this.f316d) != null) {
                    C0612d.this.f294f.put(this.f316d, adColonyAdView);
                    adColonyAdView.setOmidManager(this.f315c.mo9260b());
                    adColonyAdView.mo9224e();
                    this.f315c.mo9258a((C0742k0) null);
                    this.f315c.onRequestFilled(adColonyAdView);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$l */
    class C0628l implements C0685f0 {

        /* renamed from: com.adcolony.sdk.d$l$a */
        class C0629a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f319a;

            C0629a(C0645d0 d0Var) {
                this.f319a = d0Var;
            }

            public void run() {
                C0612d.this.mo9505c(this.f319a);
            }
        }

        C0628l() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0849u0.m931b((Runnable) new C0629a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$m */
    class C0630m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0645d0 f321a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitial f322b;

        /* renamed from: c */
        final /* synthetic */ AdColonyInterstitialListener f323c;

        C0630m(C0645d0 d0Var, AdColonyInterstitial adColonyInterstitial, AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f321a = d0Var;
            this.f322b = adColonyInterstitial;
            this.f323c = adColonyInterstitialListener;
        }

        public void run() {
            C0897z0 b = this.f321a.mo9532b();
            if (this.f322b.mo9334f() == null) {
                this.f322b.mo9320a(C0894y.m1167f(b, "iab"));
            }
            this.f322b.mo9321a(C0894y.m1169h(b, "ad_id"));
            this.f322b.mo9328c(C0894y.m1169h(b, CampaignEx.JSON_KEY_CREATIVE_ID));
            this.f322b.setViewNetworkPassFilter(C0894y.m1169h(b, "view_network_pass_filter"));
            C0742k0 f = this.f322b.mo9334f();
            if (!(f == null || f.mo9695d() == 2)) {
                try {
                    f.mo9688a();
                } catch (IllegalArgumentException unused) {
                    new C0580a0.C0581a().mo9419a("IllegalArgumentException when creating omid session").mo9421a(C0580a0.f192j);
                }
            }
            this.f323c.onRequestFilled(this.f322b);
        }
    }

    /* renamed from: com.adcolony.sdk.d$n */
    class C0631n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f325a;

        /* renamed from: b */
        final /* synthetic */ C0645d0 f326b;

        C0631n(String str, C0645d0 d0Var) {
            this.f325a = str;
            this.f326b = d0Var;
        }

        public void run() {
            Context b = C0578a.m141b();
            if (b instanceof C0585b) {
                C0612d.this.mo9495a(b, C0894y.m1151b(), "Controller was reloaded and current ad was closed");
                C0589c cVar = (C0589c) C0612d.this.f290b.get(this.f325a);
                if (cVar != null) {
                    C0612d.this.mo9496a(cVar);
                }
                C0645d0 d0Var = this.f326b;
                if (d0Var != null) {
                    d0Var.mo9536d();
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$o */
    class C0632o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAdViewListener f328a;

        C0632o(AdColonyAdViewListener adColonyAdViewListener) {
            this.f328a = adColonyAdViewListener;
        }

        public void run() {
            AdColonyAdViewListener adColonyAdViewListener = this.f328a;
            adColonyAdViewListener.onRequestNotFilled(AdColony.m31a(adColonyAdViewListener.mo9261c()));
            if (!C0578a.m144d()) {
                new C0580a0.C0581a().mo9419a("RequestNotFilled called for AdView due to a missing context. ").mo9421a(C0580a0.f192j);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$p */
    class C0633p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f330a;

        /* renamed from: b */
        final /* synthetic */ String f331b;

        /* renamed from: c */
        final /* synthetic */ long f332c;

        C0633p(String str, String str2, long j) {
            this.f330a = str;
            this.f331b = str2;
            this.f332c = j;
        }

        public void run() {
            C0612d.this.f289a.remove(this.f330a);
            AdColonyAdViewListener adColonyAdViewListener = (AdColonyAdViewListener) C0612d.this.f292d.remove(this.f330a);
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onRequestNotFilled(AdColony.m31a(this.f331b));
                C0897z0 b = C0894y.m1151b();
                C0894y.m1148a(b, "id", this.f330a);
                C0894y.m1148a(b, "zone_id", this.f331b);
                C0894y.m1156b(b, "type", 1);
                C0894y.m1156b(b, "request_fail_reason", 26);
                new C0645d0("AdSession.on_request_failure", 1, b).mo9536d();
                C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("RequestNotFilled called due to a native timeout. ");
                C0580a0.C0581a a2 = a.mo9419a("Timeout set to: " + C0578a.m143c().mo9600e() + " ms. ");
                C0580a0.C0581a a3 = a2.mo9419a("AdView request time allowed: " + this.f332c + " ms. ");
                a3.mo9419a("AdView with adSessionId(" + this.f330a + ") - request failed.").mo9421a(C0580a0.f192j);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$q */
    class C0634q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f334a;

        /* renamed from: b */
        final /* synthetic */ String f335b;

        /* renamed from: c */
        final /* synthetic */ long f336c;

        C0634q(String str, String str2, long j) {
            this.f334a = str;
            this.f335b = str2;
            this.f336c = j;
        }

        public void run() {
            AdColonyInterstitialListener adColonyInterstitialListener;
            C0612d.this.f289a.remove(this.f334a);
            AdColonyInterstitial adColonyInterstitial = (AdColonyInterstitial) C0612d.this.f291c.remove(this.f334a);
            if (adColonyInterstitial == null) {
                adColonyInterstitialListener = null;
            } else {
                adColonyInterstitialListener = adColonyInterstitial.getListener();
            }
            if (adColonyInterstitialListener != null) {
                adColonyInterstitialListener.onRequestNotFilled(AdColony.m31a(this.f335b));
                C0897z0 b = C0894y.m1151b();
                C0894y.m1148a(b, "id", this.f334a);
                C0894y.m1148a(b, "zone_id", this.f335b);
                C0894y.m1156b(b, "type", 0);
                C0894y.m1156b(b, "request_fail_reason", 26);
                new C0645d0("AdSession.on_request_failure", 1, b).mo9536d();
                C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("RequestNotFilled called due to a native timeout. ");
                C0580a0.C0581a a2 = a.mo9419a("Timeout set to: " + C0578a.m143c().mo9600e() + " ms. ");
                C0580a0.C0581a a3 = a2.mo9419a("Interstitial request time allowed: " + this.f336c + " ms. ");
                a3.mo9419a("Interstitial with adSessionId(" + this.f334a + ") - request failed.").mo9421a(C0580a0.f192j);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$r */
    class C0635r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f338a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitial f339b;

        C0635r(AdColonyInterstitialListener adColonyInterstitialListener, AdColonyInterstitial adColonyInterstitial) {
            this.f338a = adColonyInterstitialListener;
            this.f339b = adColonyInterstitial;
        }

        public void run() {
            C0578a.m143c().mo9601e(false);
            this.f338a.onClosed(this.f339b);
        }
    }

    /* renamed from: com.adcolony.sdk.d$s */
    class C0636s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f341a;

        /* renamed from: b */
        final /* synthetic */ C0872w0 f342b;

        /* renamed from: c */
        final /* synthetic */ C0589c f343c;

        C0636s(String str, C0872w0 w0Var, C0589c cVar) {
            this.f341a = str;
            this.f342b = w0Var;
            this.f343c = cVar;
        }

        public void run() {
            C0742k0 k0Var;
            int i;
            try {
                AdColonyInterstitial adColonyInterstitial = C0612d.this.mo9509f().get(this.f341a);
                AdColonyAdView adColonyAdView = C0612d.this.mo9506d().get(this.f341a);
                if (adColonyInterstitial == null) {
                    k0Var = null;
                } else {
                    k0Var = adColonyInterstitial.mo9334f();
                }
                if (k0Var == null && adColonyAdView != null) {
                    k0Var = adColonyAdView.getOmidManager();
                }
                if (k0Var == null) {
                    i = -1;
                } else {
                    i = k0Var.mo9695d();
                }
                if (k0Var != null && i == 2) {
                    k0Var.mo9689a((WebView) this.f342b);
                    k0Var.mo9690a(this.f343c);
                }
            } catch (IllegalArgumentException unused) {
                new C0580a0.C0581a().mo9419a("IllegalArgumentException when creating omid session").mo9421a(C0580a0.f192j);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$t */
    class C0637t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0589c f345a;

        C0637t(C0589c cVar) {
            this.f345a = cVar;
        }

        public void run() {
            for (int i = 0; i < this.f345a.mo9465i().size(); i++) {
                C0578a.m142b(this.f345a.mo9467j().get(i), this.f345a.mo9465i().get(i));
            }
            this.f345a.mo9467j().clear();
            this.f345a.mo9465i().clear();
            this.f345a.removeAllViews();
            C0589c cVar = this.f345a;
            cVar.f246z = null;
            cVar.f245y = null;
            for (C0872w0 next : cVar.mo9472n().values()) {
                if (!next.mo9948A()) {
                    int d = next.mo9561d();
                    if (d <= 0) {
                        d = next.mo9562e();
                    }
                    next.loadUrl("about:blank");
                    next.clearCache(true);
                    next.removeAllViews();
                    next.mo9956a(true);
                    C0578a.m143c().mo9591a(d);
                }
            }
            for (C0857v0 next2 : this.f345a.mo9471m().values()) {
                next2.mo9930j();
                next2.mo9931k();
            }
            this.f345a.mo9471m().clear();
            this.f345a.mo9470l().clear();
            this.f345a.mo9472n().clear();
            this.f345a.mo9463h().clear();
            this.f345a.mo9456e().clear();
            this.f345a.mo9459f().clear();
            this.f345a.mo9461g().clear();
            this.f345a.f233m = true;
        }
    }

    /* renamed from: com.adcolony.sdk.d$u */
    class C0638u implements C0685f0 {

        /* renamed from: com.adcolony.sdk.d$u$a */
        class C0639a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f348a;

            C0639a(C0645d0 d0Var) {
                this.f348a = d0Var;
            }

            public void run() {
                boolean unused = C0612d.this.m274d(this.f348a);
            }
        }

        C0638u() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0849u0.m931b((Runnable) new C0639a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.d$v */
    class C0640v implements C0685f0 {
        C0640v() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0612d.this.m284k(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$w */
    class C0641w implements C0685f0 {
        C0641w() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0612d.this.m283j(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$x */
    class C0642x implements C0685f0 {
        C0642x() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0612d.this.m279f(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$y */
    class C0643y implements C0685f0 {
        C0643y() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            boolean unused = C0612d.this.m285l(d0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.d$z */
    class C0644z implements C0685f0 {
        C0644z() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0612d.this.mo9503b(d0Var);
        }
    }

    C0612d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m283j(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        String c = d0Var.mo9535c();
        String h = C0894y.m1169h(b, "ad_session_id");
        int d = C0894y.m1163d(b, "view_id");
        C0589c cVar = this.f290b.get(h);
        if (cVar == null) {
            mo9500a(c, h);
            return false;
        }
        View view = cVar.mo9456e().get(Integer.valueOf(d));
        if (view == null) {
            mo9500a(c, "" + d);
            return false;
        }
        cVar.removeView(view);
        cVar.addView(view, view.getLayoutParams());
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public boolean m284k(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        String c = d0Var.mo9535c();
        String h = C0894y.m1169h(b, "ad_session_id");
        int d = C0894y.m1163d(b, "view_id");
        C0589c cVar = this.f290b.get(h);
        if (cVar == null) {
            mo9500a(c, h);
            return false;
        }
        View view = cVar.mo9456e().get(Integer.valueOf(d));
        if (view == null) {
            mo9500a(c, "" + d);
            return false;
        }
        view.bringToFront();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public boolean m285l(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        String h = C0894y.m1169h(b, "id");
        AdColonyInterstitial adColonyInterstitial = this.f291c.get(h);
        AdColonyAdView adColonyAdView = this.f294f.get(h);
        int a = C0894y.m1132a(b, "orientation", -1);
        boolean z = adColonyAdView != null;
        if (adColonyInterstitial != null || z) {
            C0894y.m1148a(C0894y.m1151b(), "id", h);
            if (adColonyInterstitial != null) {
                adColonyInterstitial.mo9316a(a);
                adColonyInterstitial.mo9347p();
            }
            return true;
        }
        mo9500a(d0Var.mo9535c(), h);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9511h() {
        this.f289a = new ConcurrentHashMap<>();
        this.f290b = new HashMap<>();
        this.f291c = new ConcurrentHashMap<>();
        this.f292d = new ConcurrentHashMap<>();
        this.f293e = new ConcurrentHashMap<>();
        this.f294f = Collections.synchronizedMap(new HashMap());
        C0578a.m139a("AdContainer.create", (C0685f0) new C0628l());
        C0578a.m139a("AdContainer.destroy", (C0685f0) new C0638u());
        C0578a.m139a("AdContainer.move_view_to_index", (C0685f0) new C0640v());
        C0578a.m139a("AdContainer.move_view_to_front", (C0685f0) new C0641w());
        C0578a.m139a("AdSession.finish_fullscreen_ad", (C0685f0) new C0642x());
        C0578a.m139a("AdSession.start_fullscreen_ad", (C0685f0) new C0643y());
        C0578a.m139a("AdSession.ad_view_available", (C0685f0) new C0644z());
        C0578a.m139a("AdSession.ad_view_unavailable", (C0685f0) new C0614a0());
        C0578a.m139a("AdSession.expiring", (C0685f0) new C0613a());
        C0578a.m139a("AdSession.audio_stopped", (C0685f0) new C0615b());
        C0578a.m139a("AdSession.audio_started", (C0685f0) new C0617c());
        C0578a.m139a("AdSession.interstitial_available", (C0685f0) new C0619d());
        C0578a.m139a("AdSession.interstitial_unavailable", (C0685f0) new C0620e());
        C0578a.m139a("AdSession.has_audio", (C0685f0) new C0621f());
        C0578a.m139a("WebView.prepare", (C0685f0) new C0622g());
        C0578a.m139a("AdSession.expanded", (C0685f0) new C0623h());
        C0578a.m139a("AdColony.odt_event", (C0685f0) new C0625i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo9513i(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        String h = C0894y.m1169h(b, "id");
        AdColonyInterstitial adColonyInterstitial = this.f291c.get(h);
        if (adColonyInterstitial == null || adColonyInterstitial.mo9343k()) {
            return false;
        }
        AdColonyInterstitialListener listener = adColonyInterstitial.getListener();
        if (listener == null) {
            mo9500a(d0Var.mo9535c(), h);
            return false;
        }
        C0849u0.m935c(this.f289a.remove(h));
        if (!C0578a.m144d()) {
            m267a(adColonyInterstitial);
            return false;
        }
        adColonyInterstitial.mo9356v();
        adColonyInterstitial.mo9321a(C0894y.m1169h(b, "ad_id"));
        adColonyInterstitial.mo9328c(C0894y.m1169h(b, CampaignEx.JSON_KEY_CREATIVE_ID));
        adColonyInterstitial.mo9331d(C0894y.m1169h(b, "ad_request_id"));
        C0849u0.m931b((Runnable) new C0630m(d0Var, adColonyInterstitial, listener));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m282g(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "id");
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "id", h);
        Context b2 = C0578a.m141b();
        if (b2 == null) {
            C0894y.m1158b(b, "has_audio", false);
            d0Var.mo9530a(b).mo9536d();
            return false;
        }
        boolean b3 = C0849u0.m930b(C0849u0.m904a(b2));
        double a = C0849u0.m899a(C0849u0.m904a(b2));
        C0894y.m1158b(b, "has_audio", b3);
        C0894y.m1145a(b, "volume", a);
        d0Var.mo9530a(b).mo9536d();
        return b3;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m274d(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "ad_session_id");
        C0589c cVar = this.f290b.get(h);
        if (cVar == null) {
            mo9500a(d0Var.mo9535c(), h);
            return false;
        }
        mo9496a(cVar);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m279f(C0645d0 d0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        C0897z0 b = d0Var.mo9532b();
        int d = C0894y.m1163d(b, "status");
        if (d == 5 || d == 1 || d == 0 || d == 6) {
            return false;
        }
        String h = C0894y.m1169h(b, "id");
        AdColonyInterstitial remove = this.f291c.remove(h);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo9500a(d0Var.mo9535c(), h);
            return false;
        }
        C0849u0.m931b((Runnable) new C0635r(adColonyInterstitialListener, remove));
        remove.mo9348q();
        remove.mo9319a((C0589c) null);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9501a(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "id");
        AdColonyAdViewListener remove = this.f292d.remove(h);
        if (remove == null) {
            mo9500a(d0Var.mo9535c(), h);
            return false;
        }
        C0849u0.m935c(this.f289a.remove(h));
        m266a(remove);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9503b(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "id");
        AdColonyAdViewListener remove = this.f292d.remove(h);
        if (remove == null) {
            mo9500a(d0Var.mo9535c(), h);
            return false;
        }
        this.f293e.put(h, remove);
        C0849u0.m935c(this.f289a.remove(h));
        Context b = C0578a.m141b();
        if (b == null) {
            m266a(remove);
            return false;
        }
        C0849u0.m931b((Runnable) new C0627k(b, d0Var, remove, h));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9505c(C0645d0 d0Var) {
        Context b = C0578a.m141b();
        if (b == null) {
            return false;
        }
        C0897z0 b2 = d0Var.mo9532b();
        String h = C0894y.m1169h(b2, "ad_session_id");
        C0589c cVar = new C0589c(b.getApplicationContext(), h);
        cVar.mo9468j(d0Var);
        this.f290b.put(h, cVar);
        if (C0894y.m1163d(b2, "width") == 0) {
            AdColonyInterstitial adColonyInterstitial = this.f291c.get(h);
            if (adColonyInterstitial == null) {
                mo9500a(d0Var.mo9535c(), h);
                return false;
            }
            adColonyInterstitial.mo9319a(cVar);
        } else {
            cVar.mo9452c(false);
        }
        C0897z0 b3 = C0894y.m1151b();
        C0894y.m1158b(b3, "success", true);
        d0Var.mo9530a(b3).mo9536d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9508e(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        String h = C0894y.m1169h(b, "id");
        if (C0894y.m1163d(b, "type") != 0) {
            return true;
        }
        AdColonyInterstitial remove = this.f291c.remove(h);
        if (!C0578a.m144d() || remove == null || !remove.mo9349r()) {
            mo9500a(d0Var.mo9535c(), h);
            return true;
        }
        C0849u0.m931b((Runnable) new C0626j());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, AdColonyAdView> mo9506d() {
        return this.f294f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9494a() {
        for (AdColonyInterstitial next : this.f291c.values()) {
            if (next != null && next.mo9346o()) {
                C0645d0 d0Var = null;
                AdColonyZone adColonyZone = C0578a.m143c().mo9574F().get(next.getZoneID());
                if (adColonyZone != null && adColonyZone.isRewarded()) {
                    C0897z0 z0Var = new C0897z0();
                    C0894y.m1156b(z0Var, CampaignEx.JSON_KEY_REWARD_AMOUNT, adColonyZone.getRewardAmount());
                    C0894y.m1148a(z0Var, CampaignEx.JSON_KEY_REWARD_NAME, adColonyZone.getRewardName());
                    C0894y.m1158b(z0Var, "success", true);
                    C0894y.m1148a(z0Var, "zone_id", next.getZoneID());
                    d0Var = new C0645d0("AdColony.v4vc_reward", 0, z0Var);
                }
                C0849u0.m931b((Runnable) new C0631n(next.mo9324b(), d0Var));
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9502b() {
        HashSet<AdColonyAdViewListener> hashSet = new HashSet<>();
        synchronized (this.f295g) {
            for (String remove : this.f293e.keySet()) {
                AdColonyAdViewListener remove2 = this.f293e.remove(remove);
                if (remove2 != null) {
                    hashSet.add(remove2);
                }
            }
            for (String remove3 : this.f292d.keySet()) {
                AdColonyAdViewListener remove4 = this.f292d.remove(remove3);
                if (remove4 != null) {
                    hashSet.add(remove4);
                }
            }
        }
        for (AdColonyAdViewListener a : hashSet) {
            m266a(a);
        }
        for (String next : this.f291c.keySet()) {
            AdColonyInterstitial adColonyInterstitial = this.f291c.get(next);
            if (adColonyInterstitial != null && adColonyInterstitial.mo9345n()) {
                this.f291c.remove(next);
                m267a(adColonyInterstitial);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<AdColonyInterstitial> mo9510g() {
        ArrayList arrayList = new ArrayList();
        for (AdColonyInterstitial next : mo9509f().values()) {
            if (!next.isExpired()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ConcurrentHashMap<String, AdColonyAdViewListener> mo9507e() {
        return this.f292d;
    }

    /* renamed from: a */
    private void m266a(AdColonyAdViewListener adColonyAdViewListener) {
        C0849u0.m931b((Runnable) new C0632o(adColonyAdViewListener));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public HashMap<String, C0589c> mo9504c() {
        return this.f290b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ConcurrentHashMap<String, AdColonyInterstitial> mo9509f() {
        return this.f291c;
    }

    /* renamed from: a */
    private void m267a(AdColonyInterstitial adColonyInterstitial) {
        adColonyInterstitial.mo9350s();
        if (!C0578a.m144d()) {
            C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("RequestNotFilled called due to a missing context. ");
            a.mo9419a("Interstitial with adSessionId(" + adColonyInterstitial.mo9324b() + ").").mo9421a(C0580a0.f192j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9498a(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, long j) {
        C0897z0 z0Var;
        String a = C0849u0.m907a();
        float o = C0578a.m143c().mo9611o().mo9750o();
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "zone_id", str);
        C0894y.m1156b(b, "type", 1);
        C0894y.m1156b(b, "width_pixels", (int) (((float) adColonyAdSize.getWidth()) * o));
        C0894y.m1156b(b, "height_pixels", (int) (((float) adColonyAdSize.getHeight()) * o));
        C0894y.m1156b(b, "width", adColonyAdSize.getWidth());
        C0894y.m1156b(b, "height", adColonyAdSize.getHeight());
        C0894y.m1148a(b, "id", a);
        if (!(adColonyAdOptions == null || (z0Var = adColonyAdOptions.f87d) == null)) {
            C0894y.m1147a(b, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, z0Var);
        }
        adColonyAdViewListener.mo9259a(str);
        adColonyAdViewListener.mo9257a(adColonyAdSize);
        this.f292d.put(a, adColonyAdViewListener);
        this.f289a.put(a, new C0633p(a, str, j));
        new C0645d0("AdSession.on_request", 1, b).mo9536d();
        C0849u0.m916a(this.f289a.get(a), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9499a(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, long j) {
        String a = C0849u0.m907a();
        C0693i c = C0578a.m143c();
        AdColonyInterstitial adColonyInterstitial = new AdColonyInterstitial(a, adColonyInterstitialListener, str);
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "zone_id", str);
        C0894y.m1158b(b, "fullscreen", true);
        Rect s = c.mo9611o().mo9754s();
        C0894y.m1156b(b, "width", s.width());
        C0894y.m1156b(b, "height", s.height());
        C0894y.m1156b(b, "type", 0);
        C0894y.m1148a(b, "id", a);
        if (!(adColonyAdOptions == null || adColonyAdOptions.f87d == null)) {
            adColonyInterstitial.mo9317a(adColonyAdOptions);
            C0894y.m1147a(b, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, adColonyAdOptions.f87d);
        }
        this.f291c.put(a, adColonyInterstitial);
        this.f289a.put(a, new C0634q(a, str, j));
        new C0645d0("AdSession.on_request", 1, b).mo9536d();
        C0849u0.m916a(this.f289a.get(a), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9495a(Context context, C0897z0 z0Var, String str) {
        C0645d0 d0Var = new C0645d0("AdSession.finish_fullscreen_ad", 0);
        C0894y.m1156b(z0Var, "status", 1);
        d0Var.mo9533b(z0Var);
        new C0580a0.C0581a().mo9419a(str).mo9421a(C0580a0.f191i);
        ((C0585b) context).mo9361a(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9497a(C0872w0 w0Var, String str, C0589c cVar) {
        C0849u0.m931b((Runnable) new C0636s(str, w0Var, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9496a(C0589c cVar) {
        C0849u0.m931b((Runnable) new C0637t(cVar));
        AdColonyAdView adColonyAdView = this.f294f.get(cVar.mo9441a());
        if (adColonyAdView == null || adColonyAdView.mo9222d()) {
            this.f290b.remove(cVar.mo9441a());
            cVar.f245y = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9512h(C0645d0 d0Var) {
        AdColonyInterstitialListener adColonyInterstitialListener;
        String h = C0894y.m1169h(d0Var.mo9532b(), "id");
        AdColonyInterstitial remove = this.f291c.remove(h);
        if (remove == null) {
            adColonyInterstitialListener = null;
        } else {
            adColonyInterstitialListener = remove.getListener();
        }
        if (adColonyInterstitialListener == null) {
            mo9500a(d0Var.mo9535c(), h);
            return false;
        }
        C0849u0.m935c(this.f289a.remove(h));
        m267a(remove);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9500a(String str, String str2) {
        new C0580a0.C0581a().mo9419a("Message '").mo9419a(str).mo9419a("' sent with invalid id: ").mo9419a(str2).mo9421a(C0580a0.f191i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAdView mo9493a(String str) {
        AdColonyAdView remove;
        synchronized (this.f295g) {
            remove = this.f294f.remove(str);
        }
        return remove;
    }
}
