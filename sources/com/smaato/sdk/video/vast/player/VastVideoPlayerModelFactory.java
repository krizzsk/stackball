package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.deeplink.LinkResolver;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.tracking.VastBeaconTrackerCreator;
import com.smaato.sdk.video.vast.tracking.VastEventTrackerCreator;

class VastVideoPlayerModelFactory {
    final boolean isInitiallyMuted = true;
    final LinkResolver linkResolver;
    final VastBeaconTrackerCreator vastBeaconTrackerCreator;
    final VastEventTrackerCreator vastEventTrackerCreator;

    VastVideoPlayerModelFactory(LinkResolver linkResolver2, VastEventTrackerCreator vastEventTrackerCreator2, VastBeaconTrackerCreator vastBeaconTrackerCreator2) {
        this.linkResolver = (LinkResolver) Objects.requireNonNull(linkResolver2);
        this.vastEventTrackerCreator = (VastEventTrackerCreator) Objects.requireNonNull(vastEventTrackerCreator2);
        this.vastBeaconTrackerCreator = (VastBeaconTrackerCreator) Objects.requireNonNull(vastBeaconTrackerCreator2);
    }
}
