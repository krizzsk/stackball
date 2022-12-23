package com.iab.omid.library.adcolony.adsession;

public enum CreativeType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");
    

    /* renamed from: a */
    private final String f10244a;

    private CreativeType(String str) {
        this.f10244a = str;
    }

    public String toString() {
        return this.f10244a;
    }
}
