package com.applovin.impl.sdk.p027d;

import android.net.Uri;
import com.applovin.impl.mediation.p020b.C1223a;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1345a;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p026c.C1382d;
import com.applovin.sdk.AppLovinAdLoadListener;

/* renamed from: com.applovin.impl.sdk.d.d */
public class C1409d extends C1405c {

    /* renamed from: c */
    private final C1345a f3305c;

    /* renamed from: d */
    private boolean f3306d;

    /* renamed from: e */
    private boolean f3307e;

    public C1409d(C1345a aVar, C1469j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, jVar, appLovinAdLoadListener);
        this.f3305c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m2859j() {
        boolean d = this.f3305c.mo11665d();
        boolean z = this.f3307e;
        if (d || z) {
            mo12944a("Begin caching for streaming ad #" + this.f3305c.getAdIdNumber() + "...");
            mo12973c();
            if (d) {
                if (this.f3306d) {
                    mo12977i();
                }
                m2860k();
                if (!this.f3306d) {
                    mo12977i();
                }
                m2861l();
            } else {
                mo12977i();
                m2860k();
            }
        } else {
            mo12944a("Begin processing for non-streaming ad #" + this.f3305c.getAdIdNumber() + "...");
            mo12973c();
            m2860k();
            m2861l();
            mo12977i();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3305c.getCreatedAtMillis();
        C1382d.m2721a(this.f3305c, this.f3279b);
        C1382d.m2720a(currentTimeMillis, (AppLovinAdBase) this.f3305c, this.f3279b);
        mo12970a((AppLovinAdBase) this.f3305c);
        mo12969a();
    }

    /* renamed from: k */
    private void m2860k() {
        mo12944a("Caching HTML resources...");
        this.f3305c.mo12697a(mo12968a(this.f3305c.mo11663b(), this.f3305c.mo12751K(), (C1355g) this.f3305c));
        this.f3305c.mo12770a(true);
        mo12944a("Finish caching non-video resources for ad #" + this.f3305c.getAdIdNumber());
        C1505q v = this.f3279b.mo13139v();
        String e = mo12950e();
        v.mo13275a(e, "Ad updated with cachedHTML = " + this.f3305c.mo11663b());
    }

    /* renamed from: l */
    private void m2861l() {
        Uri e;
        if (!mo12972b() && (e = mo12974e(this.f3305c.mo12699g())) != null) {
            this.f3305c.mo12698e();
            this.f3305c.mo12696a(e);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo12497a(C1223a aVar) {
        super.mo12497a(aVar);
    }

    /* renamed from: a */
    public void mo12982a(boolean z) {
        this.f3306d = z;
    }

    /* renamed from: b */
    public void mo12983b(boolean z) {
        this.f3307e = z;
    }

    public void run() {
        super.run();
        C14101 r0 = new Runnable() {
            public void run() {
                C1409d.this.m2859j();
            }
        };
        if (this.f3294a.mo12754N()) {
            this.f3279b.mo13071K().mo13019c().execute(r0);
        } else {
            r0.run();
        }
    }
}
