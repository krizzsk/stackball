package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1418j;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;

public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a */
    private final C1469j f3595a;

    public PostbackServiceImpl(C1469j jVar) {
        this.f3595a = jVar;
    }

    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(C1499g.m3280b(this.f3595a).mo13200a(str).mo13203a(false).mo13204a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(C1499g gVar, C1435s.C1437a aVar, AppLovinPostbackListener appLovinPostbackListener) {
        this.f3595a.mo13071K().mo13014a((C1392a) new C1418j(gVar, aVar, this.f3595a, appLovinPostbackListener), aVar);
    }

    public void dispatchPostbackRequest(C1499g gVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(gVar, C1435s.C1437a.POSTBACKS, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }
}
