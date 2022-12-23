package com.fyber.inneractive.sdk.p051j;

/* renamed from: com.fyber.inneractive.sdk.j.a */
public enum C3014a {
    RETURNED_ADTYPE_HTML(4),
    RETURNED_ADTYPE_MRAID(6),
    RETURNED_ADTYPE_VAST(8),
    RETURNED_ADTYPE_HTML5_VIDEO(9),
    RETURNED_ADTYPE_NATIVE(10),
    RETURNED_ADTYPE_PMN(11),
    RETURNED_ADTYPE_MOBILE_ADS(15);
    

    /* renamed from: h */
    private int f7384h;

    private C3014a(int i) {
        this.f7384h = i;
    }

    /* renamed from: a */
    public static C3014a m7016a(int i) {
        for (C3014a aVar : values()) {
            if (aVar.f7384h == i) {
                return aVar;
            }
        }
        return null;
    }
}
