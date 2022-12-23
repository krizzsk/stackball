package com.ironsource.sdk.p149f;

import com.ironsource.mediationsdk.C5710l;
import com.ironsource.sdk.p150g.C6008d;

/* renamed from: com.ironsource.sdk.f.a */
public class C6001a {

    /* renamed from: a */
    private C5710l f14704a = new C5710l();

    /* renamed from: com.ironsource.sdk.f.a$a */
    public static class C6002a {

        /* renamed from: a */
        public String f14705a;

        /* renamed from: b */
        public String f14706b;

        /* renamed from: c */
        public String f14707c;

        /* renamed from: a */
        public static C6002a m14833a(C6008d.C6013e eVar) {
            String str;
            C6002a aVar = new C6002a();
            if (eVar == C6008d.C6013e.RewardedVideo) {
                aVar.f14705a = "showRewardedVideo";
                aVar.f14706b = "onShowRewardedVideoSuccess";
                str = "onShowRewardedVideoFail";
            } else if (eVar == C6008d.C6013e.Interstitial) {
                aVar.f14705a = "showInterstitial";
                aVar.f14706b = "onShowInterstitialSuccess";
                str = "onShowInterstitialFail";
            } else {
                if (eVar == C6008d.C6013e.OfferWall) {
                    aVar.f14705a = "showOfferWall";
                    aVar.f14706b = "onShowOfferWallSuccess";
                    str = "onInitOfferWallFail";
                }
                return aVar;
            }
            aVar.f14707c = str;
            return aVar;
        }
    }

    /* renamed from: a */
    public void mo42538a(int i) {
        C5710l.m14087a("sdia", (Object) Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo42539b(int i) {
        C5710l.m14087a("sdra", (Object) Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo42540c(int i) {
        C5710l.m14087a("sdba", (Object) Integer.valueOf(i));
    }
}
