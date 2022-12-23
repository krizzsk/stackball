package com.ogury.p245ed;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p245ed.internal.C8068bm;
import com.ogury.p245ed.internal.C8182e;
import com.ogury.p245ed.internal.C8193ej;
import com.ogury.p245ed.internal.C8214f;
import com.ogury.p245ed.internal.C8276gw;
import com.ogury.p245ed.internal.C8280h;
import com.ogury.p245ed.internal.C8381k;
import com.ogury.p245ed.internal.C8467mq;
import com.ogury.p245ed.internal.C8534t;
import p269io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.OguryInterstitialAd */
public final class OguryInterstitialAd {

    /* renamed from: a */
    private final C8068bm f20794a;

    private OguryInterstitialAd(C8068bm bmVar) {
        this.f20794a = bmVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryInterstitialAd(Context context, String str) {
        this(new C8068bm(context, new AdConfig(str), C8193ej.f21218b));
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(str, "adUnitId");
    }

    public final boolean isLoaded() {
        return this.f20794a.mo53220b();
    }

    public final void setListener(OguryInterstitialAdListener oguryInterstitialAdListener) {
        OguryIntegrationLogger.m22104d("[Ads] Interstitial Ad - setListener() called");
        C8068bm bmVar = this.f20794a;
        C8214f.C8215a aVar = C8214f.f21265a;
        bmVar.mo53214a((C8280h) C8214f.C8215a.m22993a(oguryInterstitialAdListener));
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C8068bm bmVar = this.f20794a;
        C8182e.C8183a aVar = C8182e.f21170a;
        bmVar.mo53215a((C8381k) C8182e.C8183a.m22793a(oguryAdImpressionListener));
    }

    private final void setCampaignId(String str) {
        this.f20794a.mo53219b(str);
    }

    public final void setAdMarkup(String str) {
        C8467mq.m23881b(str, "adMarkup");
        this.f20794a.mo53222d(str);
    }

    private final void setCreativeId(String str) {
        this.f20794a.mo53221c(str);
    }

    public final void load() {
        OguryIntegrationLogger.m22104d("[Ads] Interstitial Ad - load() called");
        this.f20794a.mo53213a();
    }

    public final void show() {
        OguryIntegrationLogger.m22104d("[Ads] Interstitial Ad - show() called");
        this.f20794a.mo53217a((C8534t) C8276gw.f21393a);
    }
}
