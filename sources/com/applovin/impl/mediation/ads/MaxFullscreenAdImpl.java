package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.applovin.impl.mediation.C1221b;
import com.applovin.impl.mediation.C1258e;
import com.applovin.impl.mediation.C1300j;
import com.applovin.impl.mediation.C1308l;
import com.applovin.impl.mediation.p020b.C1225c;
import com.applovin.impl.sdk.C1364b;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxErrorCodes;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class MaxFullscreenAdImpl extends C1220a implements C1364b.C1366a {

    /* renamed from: a */
    private final C1213a f2316a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1364b f2317b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1221b f2318c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f2319d = new Object();

    /* renamed from: e */
    private C1225c f2320e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1225c f2321f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1225c f2322g = null;

    /* renamed from: h */
    private C1219c f2323h = C1219c.IDLE;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicBoolean f2324i = new AtomicBoolean();

    /* renamed from: j */
    private String f2325j = "";
    protected final C1214b listenerWrapper;

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$a */
    public interface C1213a {
        Activity getActivity();
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b */
    private class C1214b implements C1300j.C1305b, MaxAdListener, MaxRewardedAdListener {
        private C1214b() {
        }

        /* renamed from: a */
        public void mo12270a(C1225c cVar) {
            if (cVar.getFormat() == MaxFullscreenAdImpl.this.adFormat) {
                onAdLoaded(cVar);
            }
        }

        public void onAdClicked(MaxAd maxAd) {
            C1522j.m3521d(MaxFullscreenAdImpl.this.adListener, MaxFullscreenAdImpl.this.m2018d());
        }

        public void onAdDisplayFailed(MaxAd maxAd, final int i) {
            MaxFullscreenAdImpl.this.m2006a(C1219c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.f2317b.mo12832a();
                    MaxFullscreenAdImpl.this.m2014b();
                    C1522j.m3501a(MaxFullscreenAdImpl.this.adListener, (MaxAd) MaxFullscreenAdImpl.this.m2018d(), i);
                }
            });
        }

        public void onAdDisplayed(MaxAd maxAd) {
            if (!((C1225c) maxAd).mo12299l()) {
                MaxFullscreenAdImpl.this.f2317b.mo12832a();
            }
            C1522j.m3515b(MaxFullscreenAdImpl.this.adListener, (MaxAd) MaxFullscreenAdImpl.this.m2018d());
        }

        public void onAdHidden(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f2318c.mo12279a(maxAd);
            MaxFullscreenAdImpl.this.m2006a(C1219c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m2014b();
                    C1522j.m3519c(MaxFullscreenAdImpl.this.adListener, MaxFullscreenAdImpl.this.m2018d());
                }
            });
        }

        public void onAdLoadFailed(final String str, final int i) {
            MaxFullscreenAdImpl.this.m2017c();
            if (MaxFullscreenAdImpl.this.f2322g == null) {
                MaxFullscreenAdImpl.this.m2006a(C1219c.IDLE, (Runnable) new Runnable() {
                    public void run() {
                        C1522j.m3503a(MaxFullscreenAdImpl.this.adListener, str, i);
                    }
                });
            }
        }

        public void onAdLoaded(MaxAd maxAd) {
            C1225c cVar = (C1225c) maxAd;
            MaxFullscreenAdImpl.this.m2010a(cVar);
            if (cVar.mo12299l() || !MaxFullscreenAdImpl.this.f2324i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.m2006a(C1219c.READY, (Runnable) new Runnable() {
                    public void run() {
                        C1522j.m3500a(MaxFullscreenAdImpl.this.adListener, (MaxAd) MaxFullscreenAdImpl.this.m2018d());
                    }
                });
            } else {
                MaxFullscreenAdImpl.this.loadRequestBuilder.mo12404a("expired_ad_ad_unit_id");
            }
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            C1522j.m3523f(MaxFullscreenAdImpl.this.adListener, MaxFullscreenAdImpl.this.m2018d());
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            C1522j.m3522e(MaxFullscreenAdImpl.this.adListener, MaxFullscreenAdImpl.this.m2018d());
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C1522j.m3502a(MaxFullscreenAdImpl.this.adListener, (MaxAd) MaxFullscreenAdImpl.this.m2018d(), maxReward);
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c */
    public enum C1219c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, C1213a aVar, String str2, C1469j jVar) {
        super(str, maxAdFormat, str2, jVar);
        this.f2316a = aVar;
        this.listenerWrapper = new C1214b();
        this.f2317b = new C1364b(jVar, this);
        this.f2318c = new C1221b(jVar, this.listenerWrapper);
        C1505q.m3342f(str2, "Created new " + str2 + " (" + this + ")");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C1225c m2004a() {
        C1225c cVar;
        synchronized (this.f2319d) {
            cVar = this.f2321f != null ? this.f2321f : this.f2322g;
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0151  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2006a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c r7, java.lang.Runnable r8) {
        /*
            r6 = this;
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = r6.f2323h
            java.lang.Object r1 = r6.f2319d
            monitor-enter(r1)
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.IDLE     // Catch:{ all -> 0x017c }
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L_0x0039
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.LOADING     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x0011
            goto L_0x0125
        L_0x0011:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.DESTROYED     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x0017
            goto L_0x0125
        L_0x0017:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.SHOWING     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x0020
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.String r2 = "No ad is loading or loaded"
            goto L_0x004b
        L_0x0020:
            com.applovin.impl.sdk.q r0 = r6.logger     // Catch:{ all -> 0x017c }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r3.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x017c }
            r3.append(r7)     // Catch:{ all -> 0x017c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x017c }
        L_0x0035:
            r0.mo13281e(r2, r3)     // Catch:{ all -> 0x017c }
            goto L_0x004e
        L_0x0039:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.LOADING     // Catch:{ all -> 0x017c }
            if (r0 != r2) goto L_0x007c
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.IDLE     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x0043
            goto L_0x0125
        L_0x0043:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.LOADING     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x0051
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.String r2 = "An ad is already loading"
        L_0x004b:
            com.applovin.impl.sdk.C1505q.m3345i(r0, r2)     // Catch:{ all -> 0x017c }
        L_0x004e:
            r3 = 0
            goto L_0x0125
        L_0x0051:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.READY     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x0057
            goto L_0x0125
        L_0x0057:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.SHOWING     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.String r2 = "An ad is not ready to be shown yet"
            goto L_0x004b
        L_0x0060:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.DESTROYED     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x0066
            goto L_0x0125
        L_0x0066:
            com.applovin.impl.sdk.q r0 = r6.logger     // Catch:{ all -> 0x017c }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r3.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x017c }
            r3.append(r7)     // Catch:{ all -> 0x017c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x017c }
            goto L_0x0035
        L_0x007c:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.READY     // Catch:{ all -> 0x017c }
            if (r0 != r2) goto L_0x00bd
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.IDLE     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x0086
            goto L_0x0125
        L_0x0086:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.LOADING     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x008f
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.String r2 = "An ad is already loaded"
            goto L_0x004b
        L_0x008f:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.READY     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x009a
            com.applovin.impl.sdk.q r0 = r6.logger     // Catch:{ all -> 0x017c }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.String r3 = "An ad is already marked as ready"
            goto L_0x0035
        L_0x009a:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.SHOWING     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x00a0
            goto L_0x0125
        L_0x00a0:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.DESTROYED     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x00a6
            goto L_0x0125
        L_0x00a6:
            com.applovin.impl.sdk.q r0 = r6.logger     // Catch:{ all -> 0x017c }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r3.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x017c }
            r3.append(r7)     // Catch:{ all -> 0x017c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x017c }
            goto L_0x0035
        L_0x00bd:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.SHOWING     // Catch:{ all -> 0x017c }
            if (r0 != r2) goto L_0x0102
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.IDLE     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x00c6
            goto L_0x0125
        L_0x00c6:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.LOADING     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x00d0
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.String r2 = "Can not load another ad while the ad is showing"
            goto L_0x004b
        L_0x00d0:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.READY     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x00dc
            com.applovin.impl.sdk.q r0 = r6.logger     // Catch:{ all -> 0x017c }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.String r3 = "An ad is already showing, ignoring"
            goto L_0x0035
        L_0x00dc:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.SHOWING     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x00e6
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.String r2 = "The ad is already showing, not showing another one"
            goto L_0x004b
        L_0x00e6:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.DESTROYED     // Catch:{ all -> 0x017c }
            if (r7 != r0) goto L_0x00eb
            goto L_0x0125
        L_0x00eb:
            com.applovin.impl.sdk.q r0 = r6.logger     // Catch:{ all -> 0x017c }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r3.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x017c }
            r3.append(r7)     // Catch:{ all -> 0x017c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x017c }
            goto L_0x0035
        L_0x0102:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1219c.DESTROYED     // Catch:{ all -> 0x017c }
            if (r0 != r2) goto L_0x010c
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.String r2 = "No operations are allowed on a destroyed instance"
            goto L_0x004b
        L_0x010c:
            com.applovin.impl.sdk.q r0 = r6.logger     // Catch:{ all -> 0x017c }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r3.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r5 = "Unknown state: "
            r3.append(r5)     // Catch:{ all -> 0x017c }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f2323h     // Catch:{ all -> 0x017c }
            r3.append(r5)     // Catch:{ all -> 0x017c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x017c }
            goto L_0x0035
        L_0x0125:
            if (r3 == 0) goto L_0x0151
            com.applovin.impl.sdk.q r0 = r6.logger     // Catch:{ all -> 0x017c }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r4.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r5 = "Transitioning from "
            r4.append(r5)     // Catch:{ all -> 0x017c }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f2323h     // Catch:{ all -> 0x017c }
            r4.append(r5)     // Catch:{ all -> 0x017c }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x017c }
            r4.append(r7)     // Catch:{ all -> 0x017c }
            java.lang.String r5 = "..."
            r4.append(r5)     // Catch:{ all -> 0x017c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x017c }
            r0.mo13277b(r2, r4)     // Catch:{ all -> 0x017c }
            r6.f2323h = r7     // Catch:{ all -> 0x017c }
            goto L_0x0173
        L_0x0151:
            com.applovin.impl.sdk.q r0 = r6.logger     // Catch:{ all -> 0x017c }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r4.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r5 = "Not allowed transition from "
            r4.append(r5)     // Catch:{ all -> 0x017c }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f2323h     // Catch:{ all -> 0x017c }
            r4.append(r5)     // Catch:{ all -> 0x017c }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x017c }
            r4.append(r7)     // Catch:{ all -> 0x017c }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x017c }
            r0.mo13280d(r2, r7)     // Catch:{ all -> 0x017c }
        L_0x0173:
            monitor-exit(r1)     // Catch:{ all -> 0x017c }
            if (r3 == 0) goto L_0x017b
            if (r8 == 0) goto L_0x017b
            r8.run()
        L_0x017b:
            return
        L_0x017c:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x017c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.m2006a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c, java.lang.Runnable):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2010a(C1225c cVar) {
        this.f2325j = cVar.getNetworkName();
        if (cVar.mo12299l()) {
            this.f2322g = cVar;
            C1505q qVar = this.logger;
            String str = this.tag;
            qVar.mo13277b(str, "Handle ad loaded for fallback ad: " + cVar);
            return;
        }
        this.f2321f = cVar;
        C1505q qVar2 = this.logger;
        String str2 = this.tag;
        qVar2.mo13277b(str2, "Handle ad loaded for regular ad: " + cVar);
        m2015b(cVar);
    }

    /* renamed from: a */
    private void m2011a(C1225c cVar, Context context, final Runnable runnable) {
        if (cVar == null || !cVar.mo12314B() || C1520h.m3445a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(cVar.mo12315C()).setMessage(cVar.mo12316D()).setPositiveButton(cVar.mo12317E(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2012a(String str, Activity activity) {
        synchronized (this.f2319d) {
            this.f2320e = m2004a();
            this.sdk.mo13063B().mo12490b((C1300j.C1305b) this.listenerWrapper);
            if (this.f2320e.mo12299l()) {
                if (this.f2320e.mo12296j().get()) {
                    C1505q qVar = this.logger;
                    String str2 = this.tag;
                    qVar.mo13281e(str2, "Failed to display ad: " + this.f2320e + " - displayed already");
                    this.sdk.mo13142y().maybeScheduleAdDisplayErrorPostback(new C1258e(-5201, "Ad displayed already"), this.f2320e);
                    C1522j.m3501a(this.adListener, (MaxAd) m2018d(), -5201);
                    return;
                }
                this.sdk.mo13063B().mo12489a(this.listenerWrapper, this.adFormat);
            }
            this.f2320e.mo12319a(this.adUnitId);
            this.f2318c.mo12280b(this.f2320e);
            C1505q qVar2 = this.logger;
            String str3 = this.tag;
            qVar2.mo13277b(str3, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f2320e + "...");
            this.sdk.mo13142y().showFullscreenAd(this.f2320e, str, activity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2014b() {
        C1225c cVar;
        synchronized (this.f2319d) {
            cVar = this.f2320e;
            this.f2320e = null;
            if (cVar == this.f2322g) {
                this.f2322g = null;
            } else if (cVar == this.f2321f) {
                this.f2321f = null;
            }
        }
        this.sdk.mo13142y().destroyAd(cVar);
    }

    /* renamed from: b */
    private void m2015b(C1225c cVar) {
        long p = cVar.mo12323p();
        if (p >= 0) {
            C1505q qVar = this.logger;
            String str = this.tag;
            qVar.mo13277b(str, "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toMinutes(p) + " minutes from now for " + getAdUnitId() + " ...");
            this.f2317b.mo12833a(p);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m2017c() {
        C1225c cVar;
        this.f2325j = "";
        if (this.f2324i.compareAndSet(true, false)) {
            synchronized (this.f2319d) {
                cVar = this.f2321f;
                this.f2321f = null;
            }
            this.sdk.mo13142y().destroyAd(cVar);
            this.loadRequestBuilder.mo12404a("expired_ad_ad_unit_id");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C1308l m2018d() {
        return new C1308l(this.adUnitId, this.adFormat, this.f2325j);
    }

    public void destroy() {
        m2006a(C1219c.DESTROYED, (Runnable) new Runnable() {
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.f2319d) {
                    if (MaxFullscreenAdImpl.this.f2321f != null) {
                        C1505q qVar = MaxFullscreenAdImpl.this.logger;
                        String str = MaxFullscreenAdImpl.this.tag;
                        qVar.mo13277b(str, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.f2321f + "...");
                        MaxFullscreenAdImpl.this.sdk.mo13142y().destroyAd(MaxFullscreenAdImpl.this.f2321f);
                    }
                }
            }
        });
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.f2319d) {
            z = m2004a() != null && m2004a().mo12284a() && this.f2323h == C1219c.READY;
        }
        return z;
    }

    public void loadAd(final Activity activity) {
        C1505q qVar = this.logger;
        String str = this.tag;
        qVar.mo13277b(str, "Loading ad for '" + this.adUnitId + "'...");
        if (isReady()) {
            C1505q qVar2 = this.logger;
            String str2 = this.tag;
            qVar2.mo13277b(str2, "An ad is already loaded for '" + this.adUnitId + "'");
            C1522j.m3500a(this.adListener, (MaxAd) m2018d());
            return;
        }
        m2006a(C1219c.LOADING, (Runnable) new Runnable() {
            public void run() {
                final C1225c c = MaxFullscreenAdImpl.this.m2004a();
                if (c == null || c.mo12299l()) {
                    MaxFullscreenAdImpl.this.sdk.mo13063B().mo12488a((C1300j.C1305b) MaxFullscreenAdImpl.this.listenerWrapper);
                    Activity activity = activity;
                    if (activity == null) {
                        activity = MaxFullscreenAdImpl.this.sdk.mo13110ag();
                    }
                    MaxFullscreenAdImpl.this.sdk.mo13142y().loadAd(MaxFullscreenAdImpl.this.adUnitId, MaxFullscreenAdImpl.this.adFormat, MaxFullscreenAdImpl.this.loadRequestBuilder.mo12406a(), false, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                    return;
                }
                MaxFullscreenAdImpl.this.m2006a(C1219c.READY, (Runnable) new Runnable() {
                    public void run() {
                        C1522j.m3500a(MaxFullscreenAdImpl.this.adListener, (MaxAd) c);
                    }
                });
            }
        });
    }

    public void onAdExpired() {
        C1505q qVar = this.logger;
        String str = this.tag;
        qVar.mo13277b(str, "Ad expired " + getAdUnitId());
        Activity activity = this.f2316a.getActivity();
        if (activity == null && (activity = this.sdk.mo13086Z().mo12601a()) == null) {
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxErrorCodes.NO_ACTIVITY);
            return;
        }
        this.f2324i.set(true);
        this.loadRequestBuilder.mo12405a("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.mo13142y().loadAd(this.adUnitId, this.adFormat, this.loadRequestBuilder.mo12406a(), false, activity, this.listenerWrapper);
    }

    public void showAd(final String str, Activity activity) {
        final Activity ag = activity != null ? activity : this.sdk.mo13110ag();
        if (ag == null) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        } else if (((Boolean) this.sdk.mo13088a(C1368b.f2808D)).booleanValue() && (this.sdk.mo13085Y().mo13268a() || this.sdk.mo13085Y().mo13270b())) {
            C1505q.m3345i(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
            C1522j.m3501a(this.adListener, (MaxAd) m2004a(), -23);
        } else if (!((Boolean) this.sdk.mo13088a(C1368b.f2809E)).booleanValue() || C1520h.m3445a((Context) ag)) {
            m2011a(m2004a(), (Context) activity, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m2006a(C1219c.SHOWING, (Runnable) new Runnable() {
                        public void run() {
                            MaxFullscreenAdImpl.this.m2012a(str, ag);
                        }
                    });
                }
            });
        } else {
            C1505q.m3345i(this.tag, "Attempting to show ad with no internet connection");
            C1522j.m3501a(this.adListener, (MaxAd) m2018d(), -5201);
        }
    }

    public String toString() {
        return this.tag + "{adUnitId='" + this.adUnitId + '\'' + ", adListener=" + this.adListener + ", isReady=" + isReady() + '}';
    }
}
