package com.ogury.p245ed;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p245ed.internal.C8068bm;
import com.ogury.p245ed.internal.C8182e;
import com.ogury.p245ed.internal.C8193ej;
import com.ogury.p245ed.internal.C8214f;
import com.ogury.p245ed.internal.C8276gw;
import com.ogury.p245ed.internal.C8280h;
import com.ogury.p245ed.internal.C8381k;
import com.ogury.p245ed.internal.C8386ke;
import com.ogury.p245ed.internal.C8432lk;
import com.ogury.p245ed.internal.C8467mq;
import com.ogury.p245ed.internal.C8468mr;
import com.ogury.p245ed.internal.C8534t;
import p269io.presage.common.AdConfig;
import p269io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.OguryOptinVideoAd */
public final class OguryOptinVideoAd {

    /* renamed from: a */
    private final C8068bm f20795a;

    private OguryOptinVideoAd(C8068bm bmVar) {
        this.f20795a = bmVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryOptinVideoAd(Context context, String str) {
        this(new C8068bm(context, new AdConfig(str), C8193ej.OPTIN_VIDEO));
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(str, "adUnitId");
    }

    public final boolean isLoaded() {
        return this.f20795a.mo53220b();
    }

    public final void setListener(OguryOptinVideoAdListener oguryOptinVideoAdListener) {
        OguryIntegrationLogger.m22104d("[Ads] Optin Video Ad - setListener() called");
        C8068bm bmVar = this.f20795a;
        C8214f.C8215a aVar = C8214f.f21265a;
        bmVar.mo53214a((C8280h) C8214f.C8215a.m22993a(oguryOptinVideoAdListener));
        this.f20795a.mo53216a((C8432lk<? super RewardItem, C8386ke>) new C8004a(oguryOptinVideoAdListener));
    }

    /* renamed from: com.ogury.ed.OguryOptinVideoAd$a */
    static final class C8004a extends C8468mr implements C8432lk<RewardItem, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ OguryOptinVideoAdListener f20796a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8004a(OguryOptinVideoAdListener oguryOptinVideoAdListener) {
            super(1);
            this.f20796a = oguryOptinVideoAdListener;
        }

        /* renamed from: a */
        private void m22252a(RewardItem rewardItem) {
            C8467mq.m23881b(rewardItem, "rewardItem");
            OguryOptinVideoAdListener oguryOptinVideoAdListener = this.f20796a;
            if (oguryOptinVideoAdListener != null) {
                oguryOptinVideoAdListener.onAdRewarded(new OguryReward(rewardItem.getName(), rewardItem.getValue()));
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22252a((RewardItem) obj);
            return C8386ke.f21633a;
        }
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C8068bm bmVar = this.f20795a;
        C8182e.C8183a aVar = C8182e.f21170a;
        bmVar.mo53215a((C8381k) C8182e.C8183a.m22793a(oguryAdImpressionListener));
    }

    private final void setCampaignId(String str) {
        this.f20795a.mo53219b(str);
    }

    private final void setCreativeId(String str) {
        this.f20795a.mo53221c(str);
    }

    public final void load() {
        OguryIntegrationLogger.m22104d("[Ads] Optin Video Ad - load() called");
        this.f20795a.mo53213a();
    }

    public final void show() {
        OguryIntegrationLogger.m22104d("[Ads] Optin Video Ad - show() called");
        this.f20795a.mo53217a((C8534t) C8276gw.f21393a);
    }

    public final void setUserId(String str) {
        C8467mq.m23881b(str, DataKeys.USER_ID);
        this.f20795a.mo53218a(str);
    }
}
