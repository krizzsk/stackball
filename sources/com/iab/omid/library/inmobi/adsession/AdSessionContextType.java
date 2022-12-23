package com.iab.omid.library.inmobi.adsession;

import com.tapjoy.TJAdUnitConstants;

public enum AdSessionContextType {
    HTML(TJAdUnitConstants.String.HTML),
    NATIVE("native");
    
    private final String typeString;

    private AdSessionContextType(String str) {
        this.typeString = str;
    }

    public final String toString() {
        return this.typeString;
    }
}
