package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import com.adcolony.sdk.C0580a0;
import com.adcolony.sdk.C0746l;
import com.adcolony.sdk.C0849u0;
import com.appsflyer.ServerParameters;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AdColony {

    /* renamed from: a */
    private static ExecutorService f45a = C0849u0.m948h();

    /* renamed from: com.adcolony.sdk.AdColony$a */
    class C0557a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0849u0.C0851b f46a;

        /* renamed from: b */
        final /* synthetic */ String f47b;

        /* renamed from: c */
        final /* synthetic */ AdColonyInterstitialListener f48c;

        /* renamed from: d */
        final /* synthetic */ AdColonyAdOptions f49d;

        /* renamed from: e */
        final /* synthetic */ C0849u0.C0852c f50e;

        C0557a(C0849u0.C0851b bVar, String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, C0849u0.C0852c cVar) {
            this.f46a = bVar;
            this.f47b = str;
            this.f48c = adColonyInterstitialListener;
            this.f49d = adColonyAdOptions;
            this.f50e = cVar;
        }

        public void run() {
            C0693i c = C0578a.m143c();
            if (c.mo9576H() || c.mo9577I()) {
                AdColony.m48g();
                C0849u0.m914a(this.f46a);
            } else if (AdColony.m44c() || !C0578a.m144d()) {
                AdColonyZone adColonyZone = c.mo9574F().get(this.f47b);
                if (adColonyZone == null) {
                    adColonyZone = new AdColonyZone(this.f47b);
                }
                if (adColonyZone.getZoneType() == 2 || adColonyZone.getZoneType() == 1) {
                    C0849u0.m914a(this.f46a);
                    return;
                }
                C0849u0.m935c((Runnable) this.f46a);
                if (!this.f46a.mo9204a()) {
                    c.mo9597d().mo9499a(this.f47b, this.f48c, this.f49d, this.f50e.mo9914e());
                }
            } else {
                C0849u0.m914a(this.f46a);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$b */
    class C0558b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f51a;

        /* renamed from: b */
        final /* synthetic */ String f52b;

        C0558b(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
            this.f51a = adColonyInterstitialListener;
            this.f52b = str;
        }

        public void run() {
            this.f51a.onRequestNotFilled(AdColony.m31a(this.f52b));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$c */
    class C0559c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAdViewListener f53a;

        /* renamed from: b */
        final /* synthetic */ String f54b;

        C0559c(AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f53a = adColonyAdViewListener;
            this.f54b = str;
        }

        public void run() {
            this.f53a.onRequestNotFilled(AdColony.m31a(this.f54b));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$d */
    class C0560d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0693i f55a;

        C0560d(C0693i iVar) {
            this.f55a = iVar;
        }

        public void run() {
            ArrayList arrayList = new ArrayList();
            Iterator<C0687g0> it = this.f55a.mo9617u().mo9545c().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0687g0 g0Var = (C0687g0) it2.next();
                if (g0Var instanceof C0872w0) {
                    C0872w0 w0Var = (C0872w0) g0Var;
                    if (!w0Var.mo9948A()) {
                        w0Var.loadUrl("about:blank");
                        w0Var.clearCache(true);
                        w0Var.removeAllViews();
                        w0Var.mo9956a(true);
                    }
                }
                this.f55a.mo9591a(g0Var.mo9562e());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$e */
    class C0561e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0693i f56a;

        /* renamed from: b */
        final /* synthetic */ C0769o0 f57b;

        /* renamed from: c */
        final /* synthetic */ AdColonySignalsListener f58c;

        /* renamed from: com.adcolony.sdk.AdColony$e$a */
        class C0562a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f59a;

            C0562a(String str) {
                this.f59a = str;
            }

            public void run() {
                if (!this.f59a.isEmpty()) {
                    C0561e.this.f58c.onSuccess(this.f59a);
                } else {
                    C0561e.this.f58c.onFailure();
                }
            }
        }

        C0561e(C0693i iVar, C0769o0 o0Var, AdColonySignalsListener adColonySignalsListener) {
            this.f56a = iVar;
            this.f57b = o0Var;
            this.f58c = adColonySignalsListener;
        }

        public void run() {
            C0693i iVar = this.f56a;
            C0849u0.m931b((Runnable) new C0562a(AdColony.m42b(iVar, this.f57b, iVar.mo9570B())));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$f */
    class C0563f implements Callable<C0897z0> {

        /* renamed from: a */
        final /* synthetic */ C0693i f61a;

        /* renamed from: b */
        final /* synthetic */ long f62b;

        C0563f(C0693i iVar, long j) {
            this.f61a = iVar;
            this.f62b = j;
        }

        /* renamed from: b */
        public C0897z0 call() {
            return C0849u0.m906a(this.f61a.mo9611o().mo9729a(this.f62b));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$g */
    class C0564g implements Callable<C0897z0> {

        /* renamed from: a */
        final /* synthetic */ C0693i f63a;

        /* renamed from: b */
        final /* synthetic */ long f64b;

        C0564g(C0693i iVar, long j) {
            this.f63a = iVar;
            this.f64b = j;
        }

        /* renamed from: b */
        public C0897z0 call() {
            return this.f63a.mo9578J() ? AdColony.m41b(this.f64b) : AdColony.m46e();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$h */
    class C0565h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ double f65a;

        /* renamed from: b */
        final /* synthetic */ String f66b;

        /* renamed from: c */
        final /* synthetic */ String f67c;

        /* renamed from: d */
        final /* synthetic */ String f68d;

        C0565h(double d, String str, String str2, String str3) {
            this.f65a = d;
            this.f66b = str;
            this.f67c = str2;
            this.f68d = str3;
        }

        public void run() {
            AdColony.m44c();
            C0897z0 b = C0894y.m1151b();
            double d = this.f65a;
            if (d >= 0.0d) {
                C0894y.m1145a(b, "price", d);
            }
            String str = this.f66b;
            if (str != null && str.length() <= 3) {
                C0894y.m1148a(b, "currency_code", this.f66b);
            }
            C0894y.m1148a(b, "product_id", this.f67c);
            C0894y.m1148a(b, "transaction_id", this.f68d);
            new C0645d0("AdColony.on_iap_report", 1, b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$i */
    class C0566i implements C0849u0.C0851b {

        /* renamed from: a */
        private boolean f69a;

        /* renamed from: b */
        final /* synthetic */ AdColonyAdViewListener f70b;

        /* renamed from: c */
        final /* synthetic */ String f71c;

        /* renamed from: d */
        final /* synthetic */ C0849u0.C0852c f72d;

        C0566i(AdColonyAdViewListener adColonyAdViewListener, String str, C0849u0.C0852c cVar) {
            this.f70b = adColonyAdViewListener;
            this.f71c = str;
            this.f72d = cVar;
        }

        /* renamed from: a */
        public boolean mo9204a() {
            return this.f69a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            r0 = new com.adcolony.sdk.C0580a0.C0581a().mo9419a("RequestNotFilled called due to a native timeout. ");
            r0 = r0.mo9419a("Timeout set to: " + r6.f72d.mo9911b() + " ms. ");
            r0.mo9419a("Execution took: " + (java.lang.System.currentTimeMillis() - r6.f72d.mo9912c()) + " ms. ").mo9419a("AdView request not yet started.").mo9421a(com.adcolony.sdk.C0580a0.f192j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            com.adcolony.sdk.AdColony.m37a(r6.f70b, r6.f71c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            if (r6.f72d.mo9910a() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f69a     // Catch:{ all -> 0x0076 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                return
            L_0x0007:
                r0 = 1
                r6.f69a = r0     // Catch:{ all -> 0x0076 }
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                com.adcolony.sdk.AdColonyAdViewListener r0 = r6.f70b
                java.lang.String r1 = r6.f71c
                com.adcolony.sdk.AdColony.m37a((com.adcolony.sdk.AdColonyAdViewListener) r0, (java.lang.String) r1)
                com.adcolony.sdk.u0$c r0 = r6.f72d
                boolean r0 = r0.mo9910a()
                if (r0 == 0) goto L_0x0075
                com.adcolony.sdk.a0$a r0 = new com.adcolony.sdk.a0$a
                r0.<init>()
                java.lang.String r1 = "RequestNotFilled called due to a native timeout. "
                com.adcolony.sdk.a0$a r0 = r0.mo9419a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Timeout set to: "
                r1.append(r2)
                com.adcolony.sdk.u0$c r2 = r6.f72d
                long r2 = r2.mo9911b()
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.a0$a r0 = r0.mo9419a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Execution took: "
                r1.append(r2)
                long r2 = java.lang.System.currentTimeMillis()
                com.adcolony.sdk.u0$c r4 = r6.f72d
                long r4 = r4.mo9912c()
                long r2 = r2 - r4
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.a0$a r0 = r0.mo9419a((java.lang.String) r1)
                java.lang.String r1 = "AdView request not yet started."
                com.adcolony.sdk.a0$a r0 = r0.mo9419a((java.lang.String) r1)
                com.adcolony.sdk.a0 r1 = com.adcolony.sdk.C0580a0.f192j
                r0.mo9421a((com.adcolony.sdk.C0580a0) r1)
            L_0x0075:
                return
            L_0x0076:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.AdColony.C0566i.run():void");
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$j */
    class C0567j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0849u0.C0851b f73a;

        /* renamed from: b */
        final /* synthetic */ String f74b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdViewListener f75c;

        /* renamed from: d */
        final /* synthetic */ AdColonyAdSize f76d;

        /* renamed from: e */
        final /* synthetic */ AdColonyAdOptions f77e;

        /* renamed from: f */
        final /* synthetic */ C0849u0.C0852c f78f;

        C0567j(C0849u0.C0851b bVar, String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, C0849u0.C0852c cVar) {
            this.f73a = bVar;
            this.f74b = str;
            this.f75c = adColonyAdViewListener;
            this.f76d = adColonyAdSize;
            this.f77e = adColonyAdOptions;
            this.f78f = cVar;
        }

        public void run() {
            C0693i c = C0578a.m143c();
            if (c.mo9576H() || c.mo9577I()) {
                AdColony.m48g();
                C0849u0.m914a(this.f73a);
            }
            if (!AdColony.m44c() && C0578a.m144d()) {
                C0849u0.m914a(this.f73a);
            }
            C0849u0.m935c((Runnable) this.f73a);
            if (!this.f73a.mo9204a()) {
                c.mo9597d().mo9498a(this.f74b, this.f75c, this.f76d, this.f77e, this.f78f.mo9914e());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$k */
    class C0568k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAppOptions f79a;

        C0568k(AdColonyAppOptions adColonyAppOptions) {
            this.f79a = adColonyAppOptions;
        }

        public void run() {
            AdColony.m44c();
            C0897z0 b = C0894y.m1151b();
            C0894y.m1147a(b, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, this.f79a.mo9271b());
            new C0645d0("Options.set_options", 1, b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$l */
    class C0569l implements C0849u0.C0851b {

        /* renamed from: a */
        private boolean f80a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitialListener f81b;

        /* renamed from: c */
        final /* synthetic */ String f82c;

        /* renamed from: d */
        final /* synthetic */ C0849u0.C0852c f83d;

        C0569l(AdColonyInterstitialListener adColonyInterstitialListener, String str, C0849u0.C0852c cVar) {
            this.f81b = adColonyInterstitialListener;
            this.f82c = str;
            this.f83d = cVar;
        }

        /* renamed from: a */
        public boolean mo9204a() {
            return this.f80a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            r0 = new com.adcolony.sdk.C0580a0.C0581a().mo9419a("RequestNotFilled called due to a native timeout. ");
            r0 = r0.mo9419a("Timeout set to: " + r6.f83d.mo9911b() + " ms. ");
            r0.mo9419a("Execution took: " + (java.lang.System.currentTimeMillis() - r6.f83d.mo9912c()) + " ms. ").mo9419a("Interstitial request not yet started.").mo9421a(com.adcolony.sdk.C0580a0.f192j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            com.adcolony.sdk.AdColony.m38a(r6.f81b, r6.f82c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            if (r6.f83d.mo9910a() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f80a     // Catch:{ all -> 0x0076 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                return
            L_0x0007:
                r0 = 1
                r6.f80a = r0     // Catch:{ all -> 0x0076 }
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                com.adcolony.sdk.AdColonyInterstitialListener r0 = r6.f81b
                java.lang.String r1 = r6.f82c
                com.adcolony.sdk.AdColony.m38a((com.adcolony.sdk.AdColonyInterstitialListener) r0, (java.lang.String) r1)
                com.adcolony.sdk.u0$c r0 = r6.f83d
                boolean r0 = r0.mo9910a()
                if (r0 == 0) goto L_0x0075
                com.adcolony.sdk.a0$a r0 = new com.adcolony.sdk.a0$a
                r0.<init>()
                java.lang.String r1 = "RequestNotFilled called due to a native timeout. "
                com.adcolony.sdk.a0$a r0 = r0.mo9419a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Timeout set to: "
                r1.append(r2)
                com.adcolony.sdk.u0$c r2 = r6.f83d
                long r2 = r2.mo9911b()
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.a0$a r0 = r0.mo9419a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Execution took: "
                r1.append(r2)
                long r2 = java.lang.System.currentTimeMillis()
                com.adcolony.sdk.u0$c r4 = r6.f83d
                long r4 = r4.mo9912c()
                long r2 = r2 - r4
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.a0$a r0 = r0.mo9419a((java.lang.String) r1)
                java.lang.String r1 = "Interstitial request not yet started."
                com.adcolony.sdk.a0$a r0 = r0.mo9419a((java.lang.String) r1)
                com.adcolony.sdk.a0 r1 = com.adcolony.sdk.C0580a0.f192j
                r0.mo9421a((com.adcolony.sdk.C0580a0) r1)
            L_0x0075:
                return
            L_0x0076:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.AdColony.C0569l.run():void");
        }
    }

    public static boolean addCustomMessageListener(AdColonyCustomMessageListener adColonyCustomMessageListener, String str) {
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.addCustomMessageListener as AdColony ").mo9419a("has not yet been configured.").mo9421a(C0580a0.f189g);
            return false;
        } else if (!C0849u0.m942e(str)) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.addCustomMessageListener.").mo9421a(C0580a0.f189g);
            return false;
        } else {
            C0578a.m143c().mo9610n().put(str, adColonyCustomMessageListener);
            return true;
        }
    }

    /* renamed from: c */
    static boolean m44c() {
        C0849u0.C0852c cVar = new C0849u0.C0852c(MBInterstitialActivity.WEB_LOAD_TIME);
        C0693i c = C0578a.m143c();
        while (!c.mo9579K() && !cVar.mo9910a()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException unused) {
            }
        }
        return c.mo9579K();
    }

    public static boolean clearCustomMessageListeners() {
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.clearCustomMessageListeners as AdColony").mo9419a(" has not yet been configured.").mo9421a(C0580a0.f189g);
            return false;
        }
        C0578a.m143c().mo9610n().clear();
        return true;
    }

    public static void collectSignals(AdColonySignalsListener adColonySignalsListener) {
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").mo9421a(C0580a0.f189g);
            adColonySignalsListener.onFailure();
            return;
        }
        C0693i c = C0578a.m143c();
        if (!m40a((Runnable) new C0561e(c, c.mo9569A(), adColonySignalsListener))) {
            adColonySignalsListener.onFailure();
        }
    }

    public static boolean configure(Activity activity, String str, String... strArr) {
        return m39a(activity, (AdColonyAppOptions) null, str, strArr);
    }

    /* renamed from: d */
    static void m45d() {
        if (f45a.isShutdown()) {
            f45a = Executors.newSingleThreadExecutor();
        }
    }

    public static boolean disable() {
        if (!C0578a.m146f()) {
            return false;
        }
        Context b = C0578a.m141b();
        if (b != null && (b instanceof C0585b)) {
            ((Activity) b).finish();
        }
        C0693i c = C0578a.m143c();
        c.mo9597d().mo9502b();
        c.mo9583T();
        C0849u0.m931b((Runnable) new C0560d(c));
        C0578a.m143c().mo9595b(true);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static C0897z0 m46e() {
        return m41b(-1);
    }

    /* renamed from: f */
    private static boolean m47f() {
        Context b = C0578a.m141b();
        if (b == null) {
            return false;
        }
        return C0849u0.m930b(C0849u0.m904a(b));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m48g() {
        new C0580a0.C0581a().mo9419a("The AdColony API is not available while AdColony is disabled.").mo9421a(C0580a0.f191i);
    }

    public static AdColonyAppOptions getAppOptions() {
        if (!C0578a.m146f()) {
            return null;
        }
        return C0578a.m143c().mo9620x();
    }

    public static AdColonyCustomMessageListener getCustomMessageListener(String str) {
        if (!C0578a.m146f()) {
            return null;
        }
        return C0578a.m143c().mo9610n().get(str);
    }

    public static AdColonyRewardListener getRewardListener() {
        if (!C0578a.m146f()) {
            return null;
        }
        return C0578a.m143c().mo9622z();
    }

    public static String getSDKVersion() {
        if (!C0578a.m146f()) {
            return "";
        }
        return C0578a.m143c().mo9611o().mo9723E();
    }

    public static AdColonyZone getZone(String str) {
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.getZone() as AdColony has not yet been ").mo9419a("configured.").mo9421a(C0580a0.f189g);
            return null;
        }
        HashMap<String, AdColonyZone> F = C0578a.m143c().mo9574F();
        if (F.containsKey(str)) {
            return F.get(str);
        }
        AdColonyZone adColonyZone = new AdColonyZone(str);
        C0578a.m143c().mo9574F().put(str, adColonyZone);
        return adColonyZone;
    }

    /* renamed from: h */
    static void m49h() {
        f45a.shutdown();
    }

    public static boolean notifyIAPComplete(String str, String str2) {
        return notifyIAPComplete(str, str2, (String) null, 0.0d);
    }

    public static boolean removeCustomMessageListener(String str) {
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.removeCustomMessageListener as AdColony").mo9419a(" has not yet been configured.").mo9421a(C0580a0.f189g);
            return false;
        }
        C0578a.m143c().mo9610n().remove(str);
        return true;
    }

    public static boolean removeRewardListener() {
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.removeRewardListener() as AdColony has ").mo9419a("not yet been configured.").mo9421a(C0580a0.f189g);
            return false;
        }
        C0578a.m143c().mo9589a((AdColonyRewardListener) null);
        return true;
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize) {
        return requestAdView(str, adColonyAdViewListener, adColonyAdSize, (AdColonyAdOptions) null);
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener) {
        return requestInterstitial(str, adColonyInterstitialListener, (AdColonyAdOptions) null);
    }

    public static boolean setAppOptions(AdColonyAppOptions adColonyAppOptions) {
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.setAppOptions() as AdColony has not yet").mo9419a(" been configured.").mo9421a(C0580a0.f189g);
            return false;
        }
        C0578a.m143c().mo9594b(adColonyAppOptions);
        Context b = C0578a.m141b();
        if (b != null) {
            adColonyAppOptions.mo9272b(b);
        }
        return m40a((Runnable) new C0568k(adColonyAppOptions));
    }

    public static boolean setRewardListener(AdColonyRewardListener adColonyRewardListener) {
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.setRewardListener() as AdColony has not").mo9419a(" yet been configured.").mo9421a(C0580a0.f189g);
            return false;
        }
        C0578a.m143c().mo9589a(adColonyRewardListener);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m42b(C0693i iVar, C0769o0 o0Var, long j) {
        ArrayList arrayList = new ArrayList(Arrays.asList(new C0897z0[]{C0849u0.m933c(iVar.mo9620x().mo9271b())}));
        if (j > 0) {
            C0752l0 l0Var = new C0752l0();
            l0Var.mo9717a(new C0563f(iVar, j));
            l0Var.mo9717a(new C0564g(iVar, j));
            arrayList.addAll(l0Var.mo9715a());
        } else {
            arrayList.add(C0849u0.m906a(iVar.mo9611o().mo9751p()));
            arrayList.add(m46e());
        }
        arrayList.add(iVar.mo9602f());
        C0897z0 a = C0894y.m1141a((C0897z0[]) arrayList.toArray(new C0897z0[0]));
        o0Var.mo9795c();
        C0894y.m1156b(a, "signals_count", o0Var.mo9793b());
        C0894y.m1158b(a, "device_audio", m47f());
        a.mo10093u("launch_metadata");
        a.mo10074d();
        try {
            return Base64.encodeToString(a.toString().getBytes("UTF-8"), 0);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return m39a(activity, adColonyAppOptions, str, strArr);
    }

    public static boolean notifyIAPComplete(String str, String str2, String str3, double d) {
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to notifyIAPComplete as AdColony has not yet been ").mo9419a("configured.").mo9421a(C0580a0.f189g);
            return false;
        } else if (!C0849u0.m942e(str) || !C0849u0.m942e(str2)) {
            new C0580a0.C0581a().mo9419a("Ignoring call to notifyIAPComplete as one of the passed Strings ").mo9419a("is greater than ").mo9417a(128).mo9419a(" characters.").mo9421a(C0580a0.f189g);
            return false;
        } else {
            if (str3 != null && str3.length() > 3) {
                new C0580a0.C0581a().mo9419a("You are trying to report an IAP event with a currency String ").mo9419a("containing more than 3 characters.").mo9421a(C0580a0.f189g);
            }
            if (m40a((Runnable) new C0565h(d, str3, str, str2))) {
                return true;
            }
            new C0580a0.C0581a().mo9419a("Executing AdColony.notifyIAPComplete failed").mo9421a(C0580a0.f192j);
            return false;
        }
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyAdViewListener == null) {
            new C0580a0.C0581a().mo9419a("AdColonyAdViewListener is set to null. ").mo9419a("It is required to be non null.").mo9421a(C0580a0.f189g);
        }
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to requestAdView as AdColony has not yet been").mo9419a(" configured.").mo9421a(C0580a0.f189g);
            m37a(adColonyAdViewListener, str);
            return false;
        } else if (adColonyAdSize.getHeight() <= 0 || adColonyAdSize.getWidth() <= 0) {
            new C0580a0.C0581a().mo9419a("Ignoring call to requestAdView as you've provided an AdColonyAdSize").mo9419a(" object with an invalid width or height.").mo9421a(C0580a0.f189g);
            m37a(adColonyAdViewListener, str);
            return false;
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("zone_id", str);
            if (C0755m0.m623a(1, bundle)) {
                m37a(adColonyAdViewListener, str);
                return false;
            }
            C0849u0.C0852c cVar = new C0849u0.C0852c(C0578a.m143c().mo9600e());
            C0566i iVar = new C0566i(adColonyAdViewListener, str, cVar);
            C0849u0.m916a((Runnable) iVar, cVar.mo9914e());
            if (m40a((Runnable) new C0567j(iVar, str, adColonyAdViewListener, adColonyAdSize, adColonyAdOptions, cVar))) {
                return true;
            }
            C0849u0.m914a((C0849u0.C0851b) iVar);
            return false;
        }
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyInterstitialListener == null) {
            new C0580a0.C0581a().mo9419a("AdColonyInterstitialListener is set to null. ").mo9419a("It is required to be non null.").mo9421a(C0580a0.f189g);
        }
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.requestInterstitial as AdColony has not").mo9419a(" yet been configured.").mo9421a(C0580a0.f189g);
            m38a(adColonyInterstitialListener, str);
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("zone_id", str);
        if (C0755m0.m623a(1, bundle)) {
            m38a(adColonyInterstitialListener, str);
            return false;
        }
        C0849u0.C0852c cVar = new C0849u0.C0852c(C0578a.m143c().mo9600e());
        C0569l lVar = new C0569l(adColonyInterstitialListener, str, cVar);
        C0849u0.m916a((Runnable) lVar, cVar.mo9914e());
        if (m40a((Runnable) new C0557a(lVar, str, adColonyInterstitialListener, adColonyAdOptions, cVar))) {
            return true;
        }
        C0849u0.m914a((C0849u0.C0851b) lVar);
        return false;
    }

    public static boolean configure(Application application, String str, String... strArr) {
        return configure(application, (AdColonyAppOptions) null, str, strArr);
    }

    /* renamed from: a */
    static boolean m40a(Runnable runnable) {
        return C0849u0.m919a(f45a, runnable);
    }

    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return m39a(application, adColonyAppOptions, str, strArr);
    }

    /* renamed from: a */
    private static String m34a(C0693i iVar, C0769o0 o0Var) {
        return m42b(iVar, o0Var, -1);
    }

    /* renamed from: a */
    private static boolean m39a(Context context, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        if (C0755m0.m623a(0, (Bundle) null)) {
            new C0580a0.C0581a().mo9419a("Cannot configure AdColony; configuration mechanism requires 5 ").mo9419a("seconds between attempts.").mo9421a(C0580a0.f189g);
            return false;
        }
        if (context == null) {
            context = C0578a.m141b();
        }
        if (context == null) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.configure() as the provided Activity or ").mo9419a("Application context is null and we do not currently hold a ").mo9419a("reference to either for our use.").mo9421a(C0580a0.f189g);
            return false;
        }
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        if (C0578a.m145e() && !C0894y.m1155b(C0578a.m143c().mo9620x().mo9271b(), "reconfigurable")) {
            C0693i c = C0578a.m143c();
            if (!c.mo9620x().mo9270a().equals(str)) {
                new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.configure() as the app id does not ").mo9419a("match what was used during the initial configuration.").mo9421a(C0580a0.f189g);
                return false;
            } else if (C0849u0.m920a(strArr, c.mo9620x().mo9273c())) {
                new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.configure() as the same zone ids ").mo9419a("were used during the previous configuration.").mo9421a(C0580a0.f189g);
                return true;
            }
        }
        new SimpleDateFormat("HH:mm:ss:SSS", Locale.US).format(new Date(System.currentTimeMillis()));
        boolean z = true;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && !strArr[i].equals("")) {
                z = false;
            }
        }
        if (str.equals("") || z) {
            new C0580a0.C0581a().mo9419a("AdColony.configure() called with an empty app or zone id String.").mo9421a(C0580a0.f191i);
            return false;
        }
        C0578a.f182c = true;
        adColonyAppOptions.mo9268a(str);
        adColonyAppOptions.mo9269a(strArr);
        if (Build.VERSION.SDK_INT < 19) {
            new C0580a0.C0581a().mo9419a("The minimum API level for the AdColony SDK is 19.").mo9421a(C0580a0.f189g);
            C0578a.m138a(context, adColonyAppOptions, true);
        } else {
            C0578a.m138a(context, adColonyAppOptions, false);
        }
        String str2 = C0578a.m143c().mo9571C().mo9832f() + "/adc3/AppInfo";
        C0897z0 b = C0894y.m1151b();
        if (new File(str2).exists()) {
            b = C0894y.m1161c(str2);
        }
        C0897z0 b2 = C0894y.m1151b();
        if (C0894y.m1169h(b, "appId").equals(str)) {
            C0894y.m1146a(b2, "zoneIds", C0894y.m1135a(C0894y.m1136a(b, "zoneIds"), strArr, true));
            C0894y.m1148a(b2, "appId", str);
        } else {
            C0894y.m1146a(b2, "zoneIds", C0894y.m1138a(strArr));
            C0894y.m1148a(b2, "appId", str);
        }
        C0894y.m1170i(b2, str2);
        return true;
    }

    @Deprecated
    public static String collectSignals() {
        if (!C0578a.m146f()) {
            new C0580a0.C0581a().mo9419a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").mo9421a(C0580a0.f189g);
            return "";
        }
        C0693i c = C0578a.m143c();
        return m34a(c, c.mo9569A());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C0897z0 m41b(long j) {
        C0746l.C0748b bVar;
        C0897z0 b = C0894y.m1151b();
        if (j > 0) {
            bVar = C0735j0.m537d().mo9664a(j);
        } else {
            bVar = C0735j0.m537d().mo9672c();
        }
        if (bVar != null) {
            C0894y.m1147a(b, "odt_payload", bVar.mo9702c());
        }
        return b;
    }

    /* renamed from: a */
    static AdColonyZone m31a(String str) {
        AdColonyZone adColonyZone;
        if (C0578a.m144d()) {
            adColonyZone = C0578a.m143c().mo9574F().get(str);
        } else {
            adColonyZone = C0578a.m145e() ? C0578a.m143c().mo9574F().get(str) : null;
        }
        if (adColonyZone != null) {
            return adColonyZone;
        }
        AdColonyZone adColonyZone2 = new AdColonyZone(str);
        adColonyZone2.mo9404c(6);
        return adColonyZone2;
    }

    /* renamed from: a */
    static void m38a(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
        if (adColonyInterstitialListener != null) {
            C0849u0.m931b((Runnable) new C0558b(adColonyInterstitialListener, str));
        }
    }

    /* renamed from: a */
    static void m37a(AdColonyAdViewListener adColonyAdViewListener, String str) {
        if (adColonyAdViewListener != null) {
            C0849u0.m931b((Runnable) new C0559c(adColonyAdViewListener, str));
        }
    }

    /* renamed from: a */
    static void m36a(Context context, AdColonyAppOptions adColonyAppOptions) {
        C0693i c = C0578a.m143c();
        C0756n o = c.mo9611o();
        if (adColonyAppOptions != null && context != null) {
            String d = C0849u0.m939d(context);
            String c2 = C0849u0.m934c();
            int d2 = C0849u0.m937d();
            String i = o.mo9744i();
            String e = c.mo9618v().mo9567e();
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", "unknown");
            hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, "unknown");
            hashMap.put("countryLocale", Locale.getDefault().getDisplayLanguage() + " (" + Locale.getDefault().getDisplayCountry() + ")");
            hashMap.put("countryLocaleShort", C0578a.m143c().mo9611o().mo9747l());
            hashMap.put("manufacturer", C0578a.m143c().mo9611o().mo9760y());
            hashMap.put(ServerParameters.MODEL, C0578a.m143c().mo9611o().mo9720B());
            hashMap.put("osVersion", C0578a.m143c().mo9611o().mo9722D());
            hashMap.put("carrierName", i);
            hashMap.put("networkType", e);
            hashMap.put("platform", "android");
            hashMap.put("appName", d);
            hashMap.put("appVersion", c2);
            hashMap.put("appBuildNumber", Integer.valueOf(d2));
            hashMap.put("appId", "" + adColonyAppOptions.mo9270a());
            hashMap.put("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("sdkVersion", C0578a.m143c().mo9611o().mo9723E());
            hashMap.put("controllerVersion", "unknown");
            hashMap.put("zoneIds", adColonyAppOptions.mo9274d());
            C0897z0 z0Var = new C0897z0(adColonyAppOptions.getMediationInfo());
            C0897z0 z0Var2 = new C0897z0(adColonyAppOptions.getPluginInfo());
            if (!C0894y.m1169h(z0Var, "mediation_network").equals("")) {
                hashMap.put("mediationNetwork", C0894y.m1169h(z0Var, "mediation_network"));
                hashMap.put("mediationNetworkVersion", C0894y.m1169h(z0Var, "mediation_network_version"));
            }
            if (!C0894y.m1169h(z0Var2, TapjoyConstants.TJC_PLUGIN).equals("")) {
                hashMap.put(TapjoyConstants.TJC_PLUGIN, C0894y.m1169h(z0Var2, TapjoyConstants.TJC_PLUGIN));
                hashMap.put("pluginVersion", C0894y.m1169h(z0Var2, "plugin_version"));
            }
            c.mo9616t().mo9485a((HashMap<String, Object>) hashMap);
        }
    }
}
