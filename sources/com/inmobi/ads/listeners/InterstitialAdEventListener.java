package com.inmobi.ads.listeners;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.media.C5009be;
import java.util.Map;

public abstract class InterstitialAdEventListener extends C5009be<InMobiInterstitial> {
    public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
    }

    @Deprecated
    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
    }

    public void onAdFetchFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    @Deprecated
    public void onAdReceived(InMobiInterstitial inMobiInterstitial) {
    }

    public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
    }

    public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
    }

    public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
    }

    public /* bridge */ /* synthetic */ void onRequestPayloadCreated(byte[] bArr) {
        super.onRequestPayloadCreated(bArr);
    }

    public /* bridge */ /* synthetic */ void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }
}
