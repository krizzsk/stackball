package com.smaato.sdk.video.vast.tracking;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.VastBeaconEvent;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class VastTrackingBeaconsManager {
    final Set<VastBeaconEvent> trackedBeaconEvents = Collections.synchronizedSet(new HashSet());
    final Map<VastBeaconEvent, Collection<String>> trackingBeaconEvents;

    VastTrackingBeaconsManager(Map<VastBeaconEvent, Collection<String>> map) {
        this.trackingBeaconEvents = new HashMap((Map) Objects.requireNonNull(map));
    }
}
