package com.mbridge.msdk.video.module.p231a.p232a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.video.signal.C7161i;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.p237b.C7170c;

/* renamed from: com.mbridge.msdk.video.module.a.a.c */
/* compiled from: ContainerViewJSListener */
public final class C7030c extends C7031d {

    /* renamed from: j */
    private IJSFactory f17502j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7030c(IJSFactory iJSFactory, CampaignEx campaignEx, C7170c cVar, C7180a aVar, String str, String str2, C7027a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        IJSFactory iJSFactory2 = iJSFactory;
        this.f17502j = iJSFactory2;
        if (iJSFactory2 == null) {
            this.f17509a = false;
        }
    }

    /* renamed from: a */
    public final void mo48315a(int i, Object obj) {
        if (this.f17509a) {
            if (i != 8) {
                if (i == 105) {
                    this.f17502j.getJSNotifyProxy().mo48831a(3, obj.toString());
                    i = -1;
                } else if (i == 107) {
                    this.f17502j.getJSContainerModule().showVideoClickView(-1);
                    this.f17502j.getJSVideoModule().setCover(false);
                    this.f17502j.getJSVideoModule().setMiniEndCardState(false);
                    this.f17502j.getJSVideoModule().videoOperate(1);
                } else if (i == 112) {
                    this.f17502j.getJSVideoModule().setCover(true);
                    this.f17502j.getJSVideoModule().setMiniEndCardState(true);
                    this.f17502j.getJSVideoModule().videoOperate(2);
                } else if (i == 115) {
                    C7161i jSVideoModule = this.f17502j.getJSVideoModule();
                    this.f17502j.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (!this.f17502j.getJSContainerModule().showAlertWebView()) {
                this.f17502j.getJSVideoModule().showAlertView();
            } else {
                this.f17502j.getJSVideoModule().alertWebViewShowed();
            }
        }
        super.mo48315a(i, obj);
    }
}
