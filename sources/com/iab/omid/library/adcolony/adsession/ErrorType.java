package com.iab.omid.library.adcolony.adsession;

import com.facebook.share.internal.MessengerShareContentUtility;

public enum ErrorType {
    GENERIC(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE),
    VIDEO("video");
    

    /* renamed from: a */
    private final String f10246a;

    private ErrorType(String str) {
        this.f10246a = str;
    }

    public String toString() {
        return this.f10246a;
    }
}
