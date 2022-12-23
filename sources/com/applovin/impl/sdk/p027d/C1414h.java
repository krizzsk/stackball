package com.applovin.impl.sdk.p027d;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.p008a.C1000a;
import com.applovin.impl.p008a.C1005b;
import com.applovin.impl.p008a.C1008e;
import com.applovin.impl.p008a.C1017k;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p026c.C1382d;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.d.h */
class C1414h extends C1405c {

    /* renamed from: c */
    private final C1000a f3313c;

    public C1414h(C1000a aVar, C1469j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, jVar, appLovinAdLoadListener);
        this.f3313c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m2880j() {
        if (this.f3313c.mo11663b()) {
            mo12944a("Begin caching for VAST streaming ad #" + this.f3294a.getAdIdNumber() + "...");
            mo12973c();
            if (this.f3313c.mo11669g()) {
                mo12977i();
            }
            if (this.f3313c.mo11666e() == C1000a.C1003b.COMPANION_AD) {
                m2881k();
                m2883m();
            } else {
                m2882l();
            }
            if (!this.f3313c.mo11669g()) {
                mo12977i();
            }
            if (this.f3313c.mo11666e() == C1000a.C1003b.COMPANION_AD) {
                m2882l();
            } else {
                m2881k();
                m2883m();
            }
        } else {
            mo12944a("Begin caching for VAST ad #" + this.f3294a.getAdIdNumber() + "...");
            mo12973c();
            m2881k();
            m2882l();
            m2883m();
            mo12977i();
        }
        mo12944a("Finished caching VAST ad #" + this.f3313c.getAdIdNumber());
        long currentTimeMillis = System.currentTimeMillis() - this.f3313c.getCreatedAtMillis();
        C1382d.m2721a(this.f3313c, this.f3279b);
        C1382d.m2720a(currentTimeMillis, (AppLovinAdBase) this.f3313c, this.f3279b);
        mo12970a((AppLovinAdBase) this.f3313c);
        mo12969a();
    }

    /* renamed from: k */
    private void m2881k() {
        String str;
        String str2;
        String str3;
        if (!mo12972b()) {
            if (this.f3313c.mo11660aT()) {
                C1005b m = this.f3313c.mo11678m();
                if (m != null) {
                    C1008e b = m.mo11695b();
                    if (b != null) {
                        Uri b2 = b.mo11714b();
                        String uri = b2 != null ? b2.toString() : "";
                        String c = b.mo11715c();
                        if (URLUtil.isValidUrl(uri) || C1553o.m3554b(c)) {
                            if (b.mo11711a() == C1008e.C1009a.STATIC) {
                                mo12944a("Caching static companion ad at " + uri + "...");
                                Uri b3 = mo12971b(uri, Collections.emptyList(), false);
                                if (b3 != null) {
                                    b.mo11712a(b3);
                                } else {
                                    str2 = "Failed to cache static companion ad";
                                }
                            } else if (b.mo11711a() == C1008e.C1009a.HTML) {
                                if (C1553o.m3554b(uri)) {
                                    mo12944a("Begin caching HTML companion ad. Fetching from " + uri + "...");
                                    c = mo12975f(uri);
                                    if (C1553o.m3554b(c)) {
                                        str3 = "HTML fetched. Caching HTML now...";
                                    } else {
                                        str2 = "Unable to load companion ad resources from " + uri;
                                    }
                                } else {
                                    str3 = "Caching provided HTML for companion ad. No fetch required. HTML: " + c;
                                }
                                mo12944a(str3);
                                b.mo11713a(mo12968a(c, (List<String>) Collections.emptyList(), (C1355g) this.f3313c));
                            } else if (b.mo11711a() == C1008e.C1009a.IFRAME) {
                                str = "Skip caching of iFrame resource...";
                            } else {
                                return;
                            }
                            this.f3313c.mo12770a(true);
                            return;
                        }
                        mo12947c("Companion ad does not have any resources attached. Skipping...");
                        return;
                    }
                    str2 = "Failed to retrieve non-video resources from companion ad. Skipping...";
                    mo12949d(str2);
                    return;
                }
                str = "No companion ad provided. Skipping...";
            } else {
                str = "Companion ad caching disabled. Skipping...";
            }
            mo12944a(str);
        }
    }

    /* renamed from: l */
    private void m2882l() {
        C1017k l;
        Uri b;
        if (!mo12972b()) {
            if (!this.f3313c.mo11661aU()) {
                mo12944a("Video caching disabled. Skipping...");
            } else if (this.f3313c.mo11676k() != null && (l = this.f3313c.mo11677l()) != null && (b = l.mo11741b()) != null) {
                Uri a = mo12966a(b.toString(), (List<String>) Collections.emptyList(), false);
                if (a != null) {
                    mo12944a("Video file successfully cached into: " + a);
                    l.mo11740a(a);
                    return;
                }
                mo12949d("Failed to cache video file: " + l);
            }
        }
    }

    /* renamed from: m */
    private void m2883m() {
        String str;
        String str2;
        if (!mo12972b()) {
            if (this.f3313c.mo11659aS() != null) {
                mo12944a("Begin caching HTML template. Fetching from " + this.f3313c.mo11659aS() + "...");
                str = mo12967a(this.f3313c.mo11659aS().toString(), this.f3313c.mo12751K());
            } else {
                str = this.f3313c.mo11658aR();
            }
            if (C1553o.m3554b(str)) {
                C1000a aVar = this.f3313c;
                aVar.mo11656a(mo12968a(str, aVar.mo12751K(), (C1355g) this.f3313c));
                str2 = "Finish caching HTML template " + this.f3313c.mo11658aR() + " for ad #" + this.f3313c.getAdIdNumber();
            } else {
                str2 = "Unable to load HTML template";
            }
            mo12944a(str2);
        }
    }

    public void run() {
        super.run();
        C14151 r0 = new Runnable() {
            public void run() {
                C1414h.this.m2880j();
            }
        };
        if (this.f3294a.mo12754N()) {
            this.f3279b.mo13071K().mo13019c().execute(r0);
        } else {
            r0.run();
        }
    }
}
