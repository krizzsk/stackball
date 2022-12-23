package com.applovin.impl.adview.p009a.p010a;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C1101l;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1355g;

/* renamed from: com.applovin.impl.adview.a.a.b */
public class C1042b extends C1041a {
    public C1042b(C1355g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, C1469j jVar) {
        super(gVar, appLovinFullscreenActivity, jVar);
    }

    /* renamed from: a */
    public void mo11812a(C1101l lVar, AppLovinAdView appLovinAdView) {
        this.f1829d.addView(appLovinAdView);
        if (lVar != null) {
            mo11811a(this.f1828c.mo12792af(), (this.f1828c.mo12796aj() ? 3 : 5) | 48, lVar);
        }
        this.f1827b.setContentView(this.f1829d);
    }
}
