package com.mbridge.msdk.video.dynview.p219b;

import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.dynview.C6925b;
import com.mbridge.msdk.video.dynview.endcard.moffer.MOfferModel;
import com.mbridge.msdk.video.dynview.p221d.C6933b;
import com.mbridge.msdk.video.dynview.p230i.C6975a;
import com.mbridge.msdk.video.module.p231a.C7027a;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.b.a */
/* compiled from: DataEnergize */
public class C6929a {

    /* renamed from: a */
    private static volatile C6929a f17085a;

    private C6929a() {
    }

    /* renamed from: a */
    public static C6929a m17503a() {
        C6929a aVar;
        if (f17085a != null) {
            return f17085a;
        }
        synchronized (C6929a.class) {
            if (f17085a == null) {
                f17085a = new C6929a();
            }
            aVar = f17085a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo48439a(View view, C6925b bVar, Map map, C6933b bVar2) {
        if (bVar.mo48427h() != 1) {
            bVar2.mo48443a();
        } else {
            new C6975a().mo48500a(bVar, view, map, bVar2);
        }
    }

    /* renamed from: a */
    public final void mo48438a(View view, CampaignEx campaignEx, C7027a aVar) {
        new MOfferModel().bulidMofferAd(view, campaignEx, aVar);
    }
}
