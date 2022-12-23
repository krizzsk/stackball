package com.fyber.inneractive.sdk.config.enums;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public enum Vendor {
    MOAT("moat");
    
    private static final Map<String, Vendor> CONSTANTS = null;
    private final String value;

    static {
        int i;
        CONSTANTS = new HashMap();
        for (Vendor vendor : values()) {
            CONSTANTS.put(vendor.value, vendor);
        }
    }

    private Vendor(String str) {
        this.value = str;
    }

    public final String toString() {
        return this.value;
    }

    public final String value() {
        return this.value;
    }

    public static Vendor fromValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }
}
