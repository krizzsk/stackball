package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1345a;
import com.applovin.impl.sdk.p024ad.C1346b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.v */
class C1446v extends C1392a {

    /* renamed from: a */
    private final JSONObject f3403a;

    /* renamed from: c */
    private final JSONObject f3404c;

    /* renamed from: d */
    private final AppLovinAdLoadListener f3405d;

    /* renamed from: e */
    private final C1346b f3406e;

    C1446v(JSONObject jSONObject, JSONObject jSONObject2, C1346b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
        super("TaskRenderAppLovinAd", jVar);
        this.f3403a = jSONObject;
        this.f3404c = jSONObject2;
        this.f3406e = bVar;
        this.f3405d = appLovinAdLoadListener;
    }

    public void run() {
        mo12944a("Rendering ad...");
        C1345a aVar = new C1345a(this.f3403a, this.f3404c, this.f3406e, this.f3279b);
        boolean booleanValue = C1521i.m3463a(this.f3403a, "gs_load_immediately", (Boolean) false, this.f3279b).booleanValue();
        boolean booleanValue2 = C1521i.m3463a(this.f3403a, "vs_load_immediately", (Boolean) true, this.f3279b).booleanValue();
        C1409d dVar = new C1409d(aVar, this.f3279b, this.f3405d);
        dVar.mo12982a(booleanValue2);
        dVar.mo12983b(booleanValue);
        C1435s.C1437a aVar2 = C1435s.C1437a.CACHING_OTHER;
        if (((Boolean) this.f3279b.mo13088a(C1369c.f2948bl)).booleanValue()) {
            if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.REGULAR) {
                aVar2 = C1435s.C1437a.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar2 = C1435s.C1437a.CACHING_INCENTIVIZED;
            }
        }
        this.f3279b.mo13071K().mo13014a((C1392a) dVar, aVar2);
    }
}
