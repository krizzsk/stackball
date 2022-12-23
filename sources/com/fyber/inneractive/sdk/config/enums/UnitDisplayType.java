package com.fyber.inneractive.sdk.config.enums;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.p243my.target.ads.Reward;
import com.p243my.tracker.ads.AdFormat;
import java.util.HashMap;
import java.util.Map;

public enum UnitDisplayType {
    INTERSTITIAL("interstitial", false),
    LANDSCAPE("landscape", true),
    MRECT("mrect", false),
    BANNER(AdFormat.BANNER, false),
    REWARDED("rewarded", false),
    SQUARE(MessengerShareContentUtility.IMAGE_RATIO_SQUARE, true),
    VERTICAL("vertical", true),
    DEFAULT(Reward.DEFAULT, false);
    
    private static final Map<String, UnitDisplayType> CONSTANTS = null;
    private final boolean deprecated;
    private String stringValue;

    static {
        int i;
        CONSTANTS = new HashMap();
        for (UnitDisplayType unitDisplayType : values()) {
            CONSTANTS.put(unitDisplayType.stringValue, unitDisplayType);
        }
    }

    private UnitDisplayType(String str, boolean z) {
        this.stringValue = str;
        this.deprecated = z;
    }

    public final String value() {
        return this.stringValue;
    }

    public static UnitDisplayType fromValue(String str) {
        UnitDisplayType unitDisplayType = CONSTANTS.get(str);
        if (unitDisplayType != null) {
            return unitDisplayType;
        }
        return DEFAULT;
    }

    public final boolean isFullscreenUnit() {
        return this == INTERSTITIAL || this == REWARDED;
    }

    public final String toString() {
        return this.stringValue;
    }

    public final boolean isDeprecated() {
        return this.deprecated;
    }
}
