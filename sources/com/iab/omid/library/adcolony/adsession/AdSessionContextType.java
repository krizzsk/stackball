package com.iab.omid.library.adcolony.adsession;

import com.tapjoy.TJAdUnitConstants;

public enum AdSessionContextType {
    HTML(TJAdUnitConstants.String.HTML),
    NATIVE("native"),
    JAVASCRIPT("javascript");
    

    /* renamed from: a */
    private final String f10242a;

    private AdSessionContextType(String str) {
        this.f10242a = str;
    }

    public String toString() {
        return this.f10242a;
    }
}
