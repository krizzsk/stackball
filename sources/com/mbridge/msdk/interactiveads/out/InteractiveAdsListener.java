package com.mbridge.msdk.interactiveads.out;

import com.mbridge.msdk.out.MBridgeIds;

public interface InteractiveAdsListener {
    void onInterActiveMaterialLoadSuccess(MBridgeIds mBridgeIds);

    void onInteractiveAdClick(MBridgeIds mBridgeIds);

    void onInteractiveClosed(MBridgeIds mBridgeIds);

    void onInteractiveLoadFail(MBridgeIds mBridgeIds, String str);

    void onInteractivePlayingComplete(MBridgeIds mBridgeIds, boolean z);

    void onInteractiveShowFail(MBridgeIds mBridgeIds, String str);

    void onInteractiveShowSuccess(MBridgeIds mBridgeIds);

    void onInteractivelLoadSuccess(MBridgeIds mBridgeIds, int i);
}
