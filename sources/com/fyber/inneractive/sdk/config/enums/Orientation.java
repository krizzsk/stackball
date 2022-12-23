package com.fyber.inneractive.sdk.config.enums;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public enum Orientation {
    LANDSCAPE("landscape", false),
    PORTRAIT("portrait", false),
    USER("user", true),
    NONE("none", true);
    
    private static final Map<String, Orientation> CONSTANTS = null;
    public boolean allowOrientationChange;
    private final String value;

    static {
        int i;
        CONSTANTS = new HashMap();
        for (Orientation orientation : values()) {
            CONSTANTS.put(orientation.value, orientation);
        }
    }

    private Orientation(String str, boolean z) {
        this.value = str;
        this.allowOrientationChange = z;
    }

    public final String toString() {
        return this.value;
    }

    public final String value() {
        return this.value;
    }

    public static Orientation fromValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }
}
