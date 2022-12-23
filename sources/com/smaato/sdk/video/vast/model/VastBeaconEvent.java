package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.core.util.Objects;

public enum VastBeaconEvent {
    SMAATO_VIDEO_CLICK_TRACKING("smaato_sdk_vastVideoClickTracking"),
    SMAATO_ICON_CLICK_TRACKING("smaato_sdk_vastIconClickTracking"),
    SMAATO_COMPANION_CLICK_TRACKING("smaato_sdk_vastCompanionClickTracking"),
    SMAATO_IMPRESSION("smaato_sdk_vastInlineImpression"),
    SMAATO_VIEWABLE_IMPRESSION("smaato_sdk_vastInlineViewableImpression"),
    SMAATO_ICON_VIEW_TRACKING("smaato_sdk_vastIconViewTracking");
    
    public final String key;
    public final boolean oneTime;

    private VastBeaconEvent(String str) {
        this.key = (String) Objects.requireNonNull(str);
        this.oneTime = true;
    }

    public static VastBeaconEvent parse(String str) {
        for (VastBeaconEvent vastBeaconEvent : values()) {
            if (vastBeaconEvent.key.equalsIgnoreCase(str)) {
                return vastBeaconEvent;
            }
        }
        return null;
    }
}
