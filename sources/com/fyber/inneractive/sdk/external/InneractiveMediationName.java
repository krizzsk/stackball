package com.fyber.inneractive.sdk.external;

public enum InneractiveMediationName {
    MOPUB("mopub"),
    ADMOB("admob"),
    DFP(InneractiveMediationNameConsts.DFP),
    FYBER("fyber"),
    OTHER("other");
    

    /* renamed from: a */
    final String f6903a;

    private InneractiveMediationName(String str) {
        this.f6903a = str;
    }

    public final String getKey() {
        return this.f6903a;
    }
}
