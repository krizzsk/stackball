package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.C5009be;

public abstract class NativeAdEventListener extends C5009be<InMobiNative> {
    public void onAdClicked(InMobiNative inMobiNative) {
    }

    public void onAdFullScreenDismissed(InMobiNative inMobiNative) {
    }

    public void onAdFullScreenDisplayed(InMobiNative inMobiNative) {
    }

    public void onAdFullScreenWillDisplay(InMobiNative inMobiNative) {
    }

    public void onAdImpressed(InMobiNative inMobiNative) {
    }

    @Deprecated
    public void onAdReceived(InMobiNative inMobiNative) {
    }

    public void onAdStatusChanged(InMobiNative inMobiNative) {
    }

    public void onUserWillLeaveApplication(InMobiNative inMobiNative) {
    }

    public /* bridge */ /* synthetic */ void onRequestPayloadCreated(byte[] bArr) {
        super.onRequestPayloadCreated(bArr);
    }

    public /* bridge */ /* synthetic */ void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }
}
