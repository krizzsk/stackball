package com.applovin.impl.sdk;

import com.applovin.impl.mediation.p022d.C1255c;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.p */
public class C1502p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1469j f3669a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicBoolean f3670b = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f3671c;

    /* renamed from: d */
    private final Object f3672d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f3673e = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f3674f;

    C1502p(C1469j jVar) {
        this.f3669a = jVar;
    }

    /* renamed from: a */
    public void mo13266a(final Object obj) {
        this.f3669a.mo13109af().mo13156a(obj);
        if (!C1255c.m2222a(obj) && this.f3670b.compareAndSet(false, true)) {
            this.f3671c = System.currentTimeMillis();
            C1505q v = this.f3669a.mo13139v();
            v.mo13277b("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f3671c);
            this.f3669a.mo13108ae().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long longValue = ((Long) this.f3669a.mo13088a(C1369c.f3013cy)).longValue();
            if (longValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        if (C1502p.this.f3670b.get() && System.currentTimeMillis() - C1502p.this.f3671c >= longValue) {
                            C1502p.this.f3669a.mo13139v().mo13277b("FullScreenAdTracker", "Resetting \"display\" state...");
                            C1502p.this.mo13269b(obj);
                        }
                    }
                }, longValue);
            }
        }
    }

    /* renamed from: a */
    public void mo13267a(boolean z) {
        synchronized (this.f3672d) {
            this.f3673e.set(z);
            if (z) {
                this.f3674f = System.currentTimeMillis();
                C1505q v = this.f3669a.mo13139v();
                v.mo13277b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f3674f);
                final long longValue = ((Long) this.f3669a.mo13088a(C1369c.f3012cx)).longValue();
                if (longValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                        public void run() {
                            if (C1502p.this.mo13268a() && System.currentTimeMillis() - C1502p.this.f3674f >= longValue) {
                                C1502p.this.f3669a.mo13139v().mo13277b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                C1502p.this.f3673e.set(false);
                            }
                        }
                    }, longValue);
                }
            } else {
                this.f3674f = 0;
                C1505q v2 = this.f3669a.mo13139v();
                v2.mo13277b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
            }
        }
    }

    /* renamed from: a */
    public boolean mo13268a() {
        return this.f3673e.get();
    }

    /* renamed from: b */
    public void mo13269b(Object obj) {
        this.f3669a.mo13109af().mo13157b(obj);
        if (!C1255c.m2222a(obj) && this.f3670b.compareAndSet(true, false)) {
            C1505q v = this.f3669a.mo13139v();
            v.mo13277b("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            this.f3669a.mo13108ae().sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    /* renamed from: b */
    public boolean mo13270b() {
        return this.f3670b.get();
    }
}
