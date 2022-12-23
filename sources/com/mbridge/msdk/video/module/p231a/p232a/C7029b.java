package com.mbridge.msdk.video.module.p231a.p232a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p231a.C7027a;
import com.mbridge.msdk.videocommon.download.C7180a;
import com.mbridge.msdk.videocommon.p237b.C7170c;

/* renamed from: com.mbridge.msdk.video.module.a.a.b */
/* compiled from: ContainerViewDefaultListener */
public final class C7029b extends C7031d {

    /* renamed from: j */
    private MBridgeVideoView f17500j;

    /* renamed from: k */
    private MBridgeContainerView f17501k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7029b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, C7170c cVar, C7180a aVar, String str, String str2, C7027a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        MBridgeVideoView mBridgeVideoView2 = mBridgeVideoView;
        MBridgeContainerView mBridgeContainerView2 = mBridgeContainerView;
        this.f17500j = mBridgeVideoView2;
        this.f17501k = mBridgeContainerView2;
        if (mBridgeVideoView2 == null || mBridgeContainerView2 == null) {
            this.f17509a = false;
        }
    }

    /* renamed from: a */
    public final void mo48315a(int i, Object obj) {
        if (this.f17509a) {
            if (i == 8) {
                MBridgeContainerView mBridgeContainerView = this.f17501k;
                if (mBridgeContainerView == null) {
                    MBridgeVideoView mBridgeVideoView = this.f17500j;
                    if (mBridgeVideoView != null) {
                        mBridgeVideoView.showAlertView();
                    }
                } else if (!mBridgeContainerView.showAlertWebView()) {
                    MBridgeVideoView mBridgeVideoView2 = this.f17500j;
                    if (mBridgeVideoView2 != null) {
                        mBridgeVideoView2.showAlertView();
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f17500j;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.alertWebViewShowed();
                    }
                }
            } else if (i == 107) {
                this.f17501k.showVideoClickView(-1);
                this.f17500j.setCover(false);
                this.f17500j.setMiniEndCardState(false);
                this.f17500j.videoOperate(1);
            } else if (i == 112) {
                this.f17500j.setCover(true);
                this.f17500j.setMiniEndCardState(true);
                this.f17500j.videoOperate(2);
            } else if (i == 115) {
                this.f17501k.resizeMiniCard(this.f17500j.getBorderViewWidth(), this.f17500j.getBorderViewHeight(), this.f17500j.getBorderViewRadius());
            }
        }
        super.mo48315a(i, obj);
    }
}
