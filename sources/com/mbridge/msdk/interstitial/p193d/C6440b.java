package com.mbridge.msdk.interstitial.p193d;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import com.mbridge.msdk.out.Frame;
import java.util.List;

/* renamed from: com.mbridge.msdk.interstitial.d.b */
/* compiled from: InterstitialLoadVideoResponseHandler */
public abstract class C6440b extends C6441c {
    /* renamed from: a */
    public abstract void mo44146a(int i, String str);

    /* renamed from: a */
    public abstract void mo44147a(CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo44167a(List<Frame> list) {
    }

    /* renamed from: a */
    public final void mo44168a(List<C6245b> list, CampaignUnit campaignUnit) {
        mo44147a(campaignUnit);
    }

    /* renamed from: b */
    public final void mo44169b(int i, String str) {
        mo44146a(i, str);
    }
}
