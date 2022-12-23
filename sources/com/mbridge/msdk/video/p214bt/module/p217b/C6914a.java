package com.mbridge.msdk.video.p214bt.module.p217b;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

/* renamed from: com.mbridge.msdk.video.bt.module.b.a */
/* compiled from: DecoratorRewardVideoListener */
public final class C6914a implements InterVideoOutListener {

    /* renamed from: a */
    private C6921g f17051a;

    public final void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }

    public C6914a(C6921g gVar) {
        this.f17051a = gVar;
    }

    public final void onAdShow(MBridgeIds mBridgeIds) {
        C6921g gVar = this.f17051a;
        if (gVar != null) {
            gVar.onAdShow(mBridgeIds);
        }
    }

    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        C6921g gVar = this.f17051a;
        if (gVar != null) {
            gVar.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        C6921g gVar = this.f17051a;
        if (gVar != null) {
            gVar.onShowFail(mBridgeIds, str);
        }
    }

    public final void onVideoAdClicked(boolean z, MBridgeIds mBridgeIds) {
        C6921g gVar = this.f17051a;
        if (gVar != null) {
            gVar.onVideoAdClicked(mBridgeIds);
        }
    }

    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        C6921g gVar = this.f17051a;
        if (gVar != null) {
            gVar.onVideoComplete(mBridgeIds);
        }
    }

    public final void onEndcardShow(MBridgeIds mBridgeIds) {
        C6921g gVar = this.f17051a;
        if (gVar != null) {
            gVar.onEndcardShow(mBridgeIds);
        }
    }

    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        C6921g gVar = this.f17051a;
        if (gVar != null) {
            gVar.onVideoLoadFail(mBridgeIds, str);
        }
    }

    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        C6921g gVar = this.f17051a;
        if (gVar != null) {
            gVar.onVideoLoadSuccess(mBridgeIds);
        }
    }

    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
        C6921g gVar = this.f17051a;
        if (gVar != null) {
            gVar.onLoadSuccess(mBridgeIds);
        }
    }
}
