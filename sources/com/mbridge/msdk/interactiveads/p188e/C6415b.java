package com.mbridge.msdk.interactiveads.p188e;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import java.util.List;

/* renamed from: com.mbridge.msdk.interactiveads.e.b */
/* compiled from: InteractiveGetAdsResponseHandler */
public abstract class C6415b extends C6416c {
    /* renamed from: a */
    public abstract void mo44013a(int i, String str);

    /* renamed from: a */
    public abstract void mo44014a(CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo44089a(List<C6245b> list, CampaignUnit campaignUnit) {
        mo44014a(campaignUnit);
    }

    /* renamed from: b */
    public final void mo44090b(int i, String str) {
        mo44013a(i, str);
    }
}
