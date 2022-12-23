package com.mbridge.msdk.reward.p211c;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import com.mbridge.msdk.out.Frame;
import java.util.List;

/* renamed from: com.mbridge.msdk.reward.c.a */
/* compiled from: RewarLoadVideoResponseHandler */
public abstract class C6805a extends C6807c {
    /* renamed from: a */
    public abstract void mo47053a(int i, String str);

    /* renamed from: a */
    public abstract void mo47054a(CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo47066a(List<Frame> list) {
    }

    /* renamed from: a */
    public final void mo47067a(List<C6245b> list, CampaignUnit campaignUnit) {
        mo47054a(campaignUnit);
    }

    /* renamed from: b */
    public final void mo47068b(int i, String str) {
        mo47053a(i, str);
    }
}
