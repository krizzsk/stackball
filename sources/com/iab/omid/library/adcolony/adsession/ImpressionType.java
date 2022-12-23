package com.iab.omid.library.adcolony.adsession;

public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");
    

    /* renamed from: a */
    private final String f10249a;

    private ImpressionType(String str) {
        this.f10249a = str;
    }

    public String toString() {
        return this.f10249a;
    }
}
