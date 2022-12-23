package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C5009be;
import java.util.Map;

public abstract class BannerAdEventListener extends C5009be<InMobiBanner> {
    public void onAdDismissed(InMobiBanner inMobiBanner) {
    }

    public void onAdDisplayed(InMobiBanner inMobiBanner) {
    }

    public void onAdFetchFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onRewardsUnlocked(InMobiBanner inMobiBanner, Map<Object, Object> map) {
    }

    public void onUserLeftApplication(InMobiBanner inMobiBanner) {
    }

    public /* bridge */ /* synthetic */ void onRequestPayloadCreated(byte[] bArr) {
        super.onRequestPayloadCreated(bArr);
    }

    public /* bridge */ /* synthetic */ void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }
}
