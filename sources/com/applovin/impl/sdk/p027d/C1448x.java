package com.applovin.impl.sdk.p027d;

import com.applovin.impl.p008a.C1000a;
import com.applovin.impl.p008a.C1005b;
import com.applovin.impl.p008a.C1006c;
import com.applovin.impl.p008a.C1007d;
import com.applovin.impl.p008a.C1010f;
import com.applovin.impl.p008a.C1011g;
import com.applovin.impl.p008a.C1013i;
import com.applovin.impl.p008a.C1014j;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1560t;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.ViewableImpression;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.d.x */
class C1448x extends C1392a {

    /* renamed from: a */
    private C1006c f3409a;

    /* renamed from: c */
    private final AppLovinAdLoadListener f3410c;

    C1448x(C1006c cVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
        super("TaskRenderVastAd", jVar);
        this.f3410c = appLovinAdLoadListener;
        this.f3409a = cVar;
    }

    public void run() {
        mo12944a("Rendering VAST ad...");
        int size = this.f3409a.mo11702b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        C1010f fVar = null;
        C1014j jVar = null;
        C1005b bVar = null;
        String str2 = str;
        for (C1560t next : this.f3409a.mo11702b()) {
            C1560t c = next.mo13360c(C1013i.m1373a(next) ? "Wrapper" : "InLine");
            if (c != null) {
                C1560t c2 = c.mo13360c("AdSystem");
                if (c2 != null) {
                    fVar = C1010f.m1353a(c2, fVar, this.f3279b);
                }
                str = C1013i.m1364a(c, InLine.AD_TITLE, str);
                str2 = C1013i.m1364a(c, InLine.DESCRIPTION, str2);
                C1013i.m1369a(c.mo13357a("Impression"), (Set<C1011g>) hashSet, this.f3409a, this.f3279b);
                C1560t b = c.mo13358b("ViewableImpression");
                if (b != null) {
                    C1013i.m1369a(b.mo13357a(ViewableImpression.VIEWABLE), (Set<C1011g>) hashSet, this.f3409a, this.f3279b);
                }
                C1013i.m1369a(c.mo13357a("Error"), (Set<C1011g>) hashSet2, this.f3409a, this.f3279b);
                C1560t b2 = c.mo13358b("Creatives");
                if (b2 != null) {
                    for (C1560t next2 : b2.mo13362d()) {
                        C1560t b3 = next2.mo13358b("Linear");
                        if (b3 != null) {
                            jVar = C1014j.m1379a(b3, jVar, this.f3409a, this.f3279b);
                        } else {
                            C1560t c3 = next2.mo13360c("CompanionAds");
                            if (c3 != null) {
                                C1560t c4 = c3.mo13360c("Companion");
                                if (c4 != null) {
                                    bVar = C1005b.m1331a(c4, bVar, this.f3409a, this.f3279b);
                                }
                            } else {
                                mo12949d("Received and will skip rendering for an unidentified creative: " + next2);
                            }
                        }
                    }
                }
            } else {
                mo12949d("Did not find wrapper or inline response for node: " + next);
            }
        }
        C1000a a = C1000a.m1278aV().mo11686a(this.f3279b).mo11689a(this.f3409a.mo11703c()).mo11693b(this.f3409a.mo11704d()).mo11685a(this.f3409a.mo11705e()).mo11681a(this.f3409a.mo11706f()).mo11687a(str).mo11691b(str2).mo11683a(fVar).mo11684a(jVar).mo11682a(bVar).mo11688a((Set<C1011g>) hashSet).mo11692b((Set<C1011g>) hashSet2).mo11690a();
        C1007d a2 = C1013i.m1360a(a);
        if (a2 == null) {
            C1414h hVar = new C1414h(a, this.f3279b, this.f3410c);
            C1435s.C1437a aVar = C1435s.C1437a.CACHING_OTHER;
            if (((Boolean) this.f3279b.mo13088a(C1369c.f2948bl)).booleanValue()) {
                if (a.getType() == AppLovinAdType.REGULAR) {
                    aVar = C1435s.C1437a.CACHING_INTERSTITIAL;
                } else if (a.getType() == AppLovinAdType.INCENTIVIZED) {
                    aVar = C1435s.C1437a.CACHING_INCENTIVIZED;
                }
            }
            this.f3279b.mo13071K().mo13014a((C1392a) hVar, aVar);
            return;
        }
        C1013i.m1367a(this.f3409a, this.f3410c, a2, -6, this.f3279b);
    }
}
